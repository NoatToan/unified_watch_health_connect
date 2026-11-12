package com.amap.api.offlineservice;

import android.view.View;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapActivity;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected OfflineMapActivity f3487a = null;

    public abstract void a(View view);

    public abstract void b();

    public boolean c() {
        return true;
    }

    public abstract RelativeLayout d();

    public abstract void e();

    public final void a(OfflineMapActivity offlineMapActivity) {
        this.f3487a = offlineMapActivity;
    }

    public final void a() {
        this.f3487a.showScr();
    }

    public final int a(float f) {
        OfflineMapActivity offlineMapActivity = this.f3487a;
        return offlineMapActivity != null ? (int) ((f * (offlineMapActivity.getResources().getDisplayMetrics().densityDpi / 160.0f)) + 0.5f) : (int) f;
    }
}
