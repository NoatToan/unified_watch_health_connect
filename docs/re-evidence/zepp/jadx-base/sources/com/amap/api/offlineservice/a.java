package com.amap.api.offlineservice;

import android.view.View;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapActivity;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public OfflineMapActivity a = null;

    public abstract void a(View view);

    public final void a(OfflineMapActivity offlineMapActivity) {
        this.a = offlineMapActivity;
    }

    public abstract void b();

    public boolean c() {
        return true;
    }

    public abstract RelativeLayout d();

    public abstract void e();

    public final void a() {
        this.a.showScr();
    }

    public final int a(float f) {
        OfflineMapActivity offlineMapActivity = this.a;
        return offlineMapActivity != null ? (int) ((f * (offlineMapActivity.getResources().getDisplayMetrics().densityDpi / 160.0f)) + 0.5f) : (int) f;
    }
}
