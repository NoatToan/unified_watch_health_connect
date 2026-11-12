package com.huawei.ui.commonui.view;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.button.HealthButton;
import defpackage.qre;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes43.dex */
public class RoundedGradientButton extends HealthButton {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f24002c = {qre.e(R.color.train_weight_plan_button_vip_bg1), qre.e(R.color.train_weight_plan_button_vip_bg2), qre.e(R.color.train_weight_plan_button_vip_bg3), qre.e(R.color.train_weight_plan_button_vip_bg4), qre.e(R.color.train_weight_plan_button_vip_bg5), qre.e(R.color.train_weight_plan_button_vip_bg6)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f24001b = {qre.e(R.color.train_weight_plan_button_vip_color1), qre.e(R.color.train_weight_plan_button_vip_color2), qre.e(R.color.train_weight_plan_button_vip_color3), qre.e(R.color.train_weight_plan_button_vip_color4), qre.e(R.color.train_weight_plan_button_vip_color5), qre.e(R.color.train_weight_plan_button_vip_color6)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float[] f24000a = {0.0f, 0.24f, 0.43f, 0.62f, 0.81f, 1.0f};

    public RoundedGradientButton(Context context) {
        super(context);
        e();
    }

    public RoundedGradientButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    private void e() {
        d();
        c();
    }

    private void d() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(qre.b(R.dimen.health_common_20dp));
        gradientDrawable.setOrientation(LanguageUtil.ba(BaseApplication.b()) ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT);
        gradientDrawable.setColors(f24002c);
        setBackground(gradientDrawable);
    }

    private void c() {
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.ui.commonui.view.RoundedGradientButton.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                RoundedGradientButton.this.getPaint().setShader(new LinearGradient(0.0f, 0.0f, RoundedGradientButton.this.getWidth(), RoundedGradientButton.this.getHeight(), RoundedGradientButton.f24001b, RoundedGradientButton.f24000a, Shader.TileMode.REPEAT));
                RoundedGradientButton.this.invalidate();
                RoundedGradientButton.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }
}
