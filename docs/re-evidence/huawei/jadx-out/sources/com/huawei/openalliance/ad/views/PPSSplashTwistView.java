package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class PPSSplashTwistView extends m {
    @Override // com.huawei.openalliance.ad.views.m
    protected String getViewTag() {
        return "PPSSplashTwistView";
    }

    private void a(Context context) {
        String str;
        hw.b("PPSSplashTwistView", "init");
        try {
            this.f21274a = inflate(context, R.layout.hiad_layout_splash_twist, this);
            this.f = (ImageView) this.f21274a.findViewById(R.id.hiad_phone_jpg);
            this.f21275b = (TextView) this.f21274a.findViewById(R.id.hiad_twist_interact_string);
            this.f21276c = (TextView) this.f21274a.findViewById(R.id.hiad_twist_desc);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSSplashTwistView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSSplashTwistView", str);
        }
    }

    public PPSSplashTwistView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSSplashTwistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PPSSplashTwistView(Context context) {
        super(context);
        a(context);
    }
}
