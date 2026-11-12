package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes12.dex */
public class PPSSplashSwipeClickView extends l {
    private LinearLayout h;

    @Override // com.huawei.openalliance.ad.views.l
    protected String getViewTag() {
        return "PPSSplashSwipeClickView";
    }

    public LinearLayout getClickAreaView() {
        return this.h;
    }

    private void a(Context context) {
        String str;
        hw.b("PPSSplashSwipeClickView", "init");
        try {
            this.f21274a = inflate(context, R.layout.hiad_layout_splash_swipe_click, this);
            this.h = (LinearLayout) this.f21274a.findViewById(R.id.swipe_click_area);
            this.f = (ImageView) this.f21274a.findViewById(R.id.hiad_click_arrow);
            this.f21275b = (TextView) this.f21274a.findViewById(R.id.hiad_click_swipe_string);
            this.f21276c = (TextView) this.f21274a.findViewById(R.id.hiad_click_swipe_desc);
            this.g = (ScanningView) this.f21274a.findViewById(R.id.hiad_scanning_view);
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("PPSSplashSwipeClickView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("PPSSplashSwipeClickView", str);
        }
    }

    public PPSSplashSwipeClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public PPSSplashSwipeClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PPSSplashSwipeClickView(Context context) {
        super(context);
        a(context);
    }
}
