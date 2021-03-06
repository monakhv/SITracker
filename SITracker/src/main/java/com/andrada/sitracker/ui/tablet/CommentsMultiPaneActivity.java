/*
 * Copyright 2013 Gleb Godonoga.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.andrada.sitracker.ui.tablet;

import android.annotation.SuppressLint;
import android.support.v4.widget.SlidingPaneLayout;

import com.andrada.sitracker.R;
import com.andrada.sitracker.ui.BaseActivity;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@SuppressLint("Registered")
@EActivity(R.layout.activity_comments)
public class CommentsMultiPaneActivity extends BaseActivity {

    @ViewById(R.id.sliding_pane_layout)
    SlidingPaneLayout mSlidingPaneLayout;
}
