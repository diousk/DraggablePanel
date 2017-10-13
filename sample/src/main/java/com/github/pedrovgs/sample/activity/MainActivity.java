/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.pedrovgs.sample.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.github.pedrovgs.sample.R;

/**
 * @author Pedro Vicente Gómez Sánchez.
 */
public class MainActivity extends AppCompatActivity {

  @BindView(R.id.iv_places)
  ImageView placesImageView;

  @BindView(R.id.iv_tv_shows)
  ImageView tvShowImageView;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(MainActivity.this);
  }

  @Override
  protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);

    placesImageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Log.d("MainActivity", "iv_places.onClick");
        Intent intent = new Intent(MainActivity.this, PlacesSampleActivity.class);
        startActivity(intent);
      }
    });

    tvShowImageView.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, TvShowsActivity.class);
        startActivity(intent);
      }
    });
  }

  @OnClick(R.id.iv_youtube) void openYoutubeSampleActivity() {
    Intent intent = new Intent(this, YoutubeSampleActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.iv_video) void openVideoSampleActivity() {
    Intent intent = new Intent(this, VideoSampleActivity.class);
    startActivity(intent);
  }
}
