package com.shine.humanbody;

import android.content.Intent;
import android.view.View;

import com.shine.humanbody.base.BaseActivity;
import com.shine.humanbody.head.HeadActivity;
import com.shine.humanbody.lower.LowerLimbActivity;
import com.shine.humanbody.trunk.TrunkActivity;
import com.shine.humanbody.upper.UpperLimbActivity;

public class HumanActivity extends BaseActivity {

    @Override
    protected int getLayoutResId() {
        return R.layout.activity_human;
    }

    public void onHeadClick(View view) {
        startActivity(new Intent(this, HeadActivity.class));
    }

    public void onTrunkClick(View view) {
        startActivity(new Intent(this, TrunkActivity.class));
    }

    public void onUpperLimbClick(View view) {
        startActivity(new Intent(this, UpperLimbActivity.class));
    }

    public void onLowerLimbClick(View view) {
        startActivity(new Intent(this, LowerLimbActivity.class));
    }
}