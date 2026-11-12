package cd0;

import android.app.Activity;

/* JADX INFO: loaded from: classes8.dex */
public class s0 implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f26849a;

    public s0(t0 t0Var) {
        this.f26849a = t0Var;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        if (com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS == cVar) {
            t0 t0Var = this.f26849a;
            t0Var.f26817e.g();
            t0Var.G(t0Var.f26817e.z((Activity) t0Var.f26813a, t0Var.f26814b.getDeviceUnitId()));
            bd0.h0 h0Var = t0Var.f26816d;
            if (h0Var != null) {
                h0Var.f();
            }
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
    }
}
