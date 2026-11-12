package com.huawei.health.suggestion.ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqz;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes9.dex */
public class BrightnessOrVolumeProgressPlus extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f10182a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BrightnessOrVolumeProgress f10183c;
    private HealthTextView e;

    public BrightnessOrVolumeProgressPlus(Context context) {
        super(context);
    }

    public BrightnessOrVolumeProgressPlus(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BrightnessOrVolumeProgressPlus(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        setGravity(17);
        layoutInflaterFrom.inflate(R.layout.sug_coach_brightorvolumeplus, this);
        this.f10183c = (BrightnessOrVolumeProgress) findViewById(R.id.sug_round_tp);
        this.f10182a = (ImageView) findViewById(R.id.iv_center);
        this.e = (HealthTextView) findViewById(R.id.tv_setting);
    }

    public void setProgressMax(float f) {
        this.f10183c.setMax(f);
    }

    public void setProgress(float f) {
        this.f10183c.setProgress(f);
    }

    public void c(int i) {
        if (LanguageUtil.ba(getContext())) {
            this.f10182a.setImageDrawable(qqz.e(getContext(), i));
        } else {
            this.f10182a.setImageResource(i);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.setText(str);
    }
}
