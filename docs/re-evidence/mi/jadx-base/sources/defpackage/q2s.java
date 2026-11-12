package defpackage;

import android.view.View;
import android.widget.RelativeLayout;
import com.amap.api.maps.offlinemap.OfflineMapActivity;

/* JADX INFO: loaded from: classes4.dex */
public abstract class q2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OfflineMapActivity f31030a = null;

    public final int a(float f) {
        OfflineMapActivity offlineMapActivity = this.f31030a;
        return offlineMapActivity != null ? (int) ((f * (offlineMapActivity.getResources().getDisplayMetrics().densityDpi / 160.0f)) + 0.5f) : (int) f;
    }

    public final void b() {
        this.f31030a.showScr();
    }

    public abstract void c(View view);

    public final void d(OfflineMapActivity offlineMapActivity) {
        this.f31030a = offlineMapActivity;
    }

    public abstract void e();

    public boolean f() {
        return true;
    }

    public abstract RelativeLayout g();

    public abstract void h();
}
