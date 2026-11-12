package com.huawei.ui.commonui.radiogroup;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;

/* JADX INFO: loaded from: classes43.dex */
public class TrackTargetRadioGroup extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f23811b;

    public TrackTargetRadioGroup(Context context) {
        super(context);
        this.f23811b = 1;
        b();
    }

    public TrackTargetRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23811b = 1;
        b();
    }

    public TrackTargetRadioGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23811b = 1;
        b();
    }

    private void b() {
        LogUtil.d("CommonUI_TrackTargetRadioGroup", "init: ", getParent());
        setOrientation(1);
    }

    private void c(int i) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (i == i2) {
                c(getChildAt(i2), 1);
            } else {
                c(getChildAt(i2), 0);
            }
        }
    }

    private void c(View view, int i) {
        if (!(view instanceof RelativeLayout)) {
            LogUtil.j("CommonUI_TrackTargetRadioGroup", "changeItemView failed, view is not instanceof RelativeLayout");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        if (!(relativeLayout.getChildAt(0) instanceof HealthTextView)) {
            LogUtil.j("CommonUI_TrackTargetRadioGroup", "changeItemView failed, relativeLayout.getChildAt(0) is not instanceof HealthTextView");
            return;
        }
        HealthTextView healthTextView = (HealthTextView) relativeLayout.getChildAt(0);
        if (!(relativeLayout.getChildAt(1) instanceof ImageView)) {
            LogUtil.j("CommonUI_TrackTargetRadioGroup", "changeItemView failed, relativeLayout.getChildAt(1) is not instanceof ImageView");
            return;
        }
        ImageView imageView = (ImageView) relativeLayout.getChildAt(1);
        if (i == 0) {
            healthTextView.setTypeface(Typeface.create("regular", 0));
            healthTextView.setTextColor(getResources().getColor(R.color.home_track_show_text_black_color));
            imageView.setImageResource(R.drawable.btn_health_list_radio_nor);
        } else {
            if (i != 1) {
                return;
            }
            healthTextView.setTypeface(Typeface.create(Constants.FONT, 0));
            healthTextView.setTextColor(getResources().getColor(R.color.home_track_starget_value_color_whole_alpha));
            imageView.setImageResource(R.drawable.btn_health_list_radio_sel);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == null) {
            LogUtil.j("CommonUI_TrackTargetRadioGroup", "view is null");
            return;
        }
        int iIntValue = ((Integer) view.getTag()).intValue();
        this.f23811b = iIntValue;
        c(iIntValue);
    }
}
