package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class PPSSplashTwistClickView extends m {
    private LinearLayout g;

    @Override // com.huawei.openalliance.ad.views.m
    protected String getViewTag() {
        return "PPSSplashTwistClickView";
    }

    public LinearLayout getClickAreaView() {
        return this.g;
    }

    private void a(Context context) {
        String str;
        hw.b("PPSSplashTwistClickView", "init");
        try {
            this.f21274a = inflate(context, R.layout.hiad_layout_splash_twist_click, this);
            this.f = (ImageView) this.f21274a.findViewById(R.id.hiad_click_phone_jpg);
            this.g = (LinearLayout) this.f21274a.findViewById(R.id.twist_click_area);
            this.f21275b = (TextView) this.f21274a.findViewById(R.id.hiad_click_twist_string);
            this.f21276c = (TextView) this.f21274a.findViewById(R.id.hiad_click_twist_desc);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSSplashTwistClickView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSSplashTwistClickView", str);
        }
    }

    public PPSSplashTwistClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSSplashTwistClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PPSSplashTwistClickView(Context context) {
        super(context);
        a(context);
    }
}
