/*
 * Copyright 2015 "Henry Tao <hi@henrytao.me>"
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.henrytao.mddemo.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;

import butterknife.ButterKnife;
import me.henrytao.mddemo.R;

public class ListActivity extends BaseNavigationDrawerActivity {

  public static Intent newIntent(Context context) {
    return new Intent(context, ListActivity.class);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    vSmoothCollapsingToolbarLayout.setCollapsedOffsetX(getResources().getDimensionPixelOffset(R.dimen.mdListItemPaddingLeft_lg));
    LayoutInflater.from(this).inflate(R.layout.fragment_list, vContainer, true);
    ButterKnife.bind(this);
  }
}
