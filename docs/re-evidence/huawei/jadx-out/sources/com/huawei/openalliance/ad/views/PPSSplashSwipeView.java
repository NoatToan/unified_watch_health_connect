package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class PPSSplashSwipeView extends l {
    @Override // com.huawei.openalliance.ad.views.l
    protected String getViewTag() {
        return "PPSSplashSwipeView";
    }

    private void a(Context context) {
        String str;
        hw.b("PPSSplashSwipeView", "init");
        try {
            this.f21274a = inflate(context, R.layout.hiad_layout_splash_swipe, this);
            this.f21275b = (TextView) this.f21274a.findViewById(R.id.hiad_swipe_interact_string);
            this.f21276c = (TextView) this.f21274a.findViewById(R.id.hiad_swipe_desc);
            this.f = (ImageView) this.f21274a.findViewById(R.id.hiad_arrow);
            this.g = (ScanningView) this.f21274a.findViewById(R.id.scanning_view);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSSplashSwipeView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSSplashSwipeView", str);
        }
    }

    public PPSSplashSwipeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSSplashSwipeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PPSSplashSwipeView(Context context) {
        super(context);
        a(context);
    }
}
