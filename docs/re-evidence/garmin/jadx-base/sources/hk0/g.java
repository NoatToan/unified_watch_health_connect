package hk0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lhk0/g;", "Lha2/a$a;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements ha2.a.InterfaceC1635a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f84070a;

    public g(f fVar) {
        this.f84070a = fVar;
    }

    @Override // ha2.a.InterfaceC1635a
    public final void a(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_NEW");
    }

    @Override // ha2.a.InterfaceC1635a
    public final void b(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_GOOD");
    }

    @Override // ha2.a.InterfaceC1635a
    public final void c(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_OK");
    }

    @Override // ha2.a.InterfaceC1635a
    public final void d(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_CRITICAL");
    }

    @Override // ha2.a.InterfaceC1635a
    public final void e(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_INVALID");
    }

    @Override // ha2.a.InterfaceC1635a
    public final void f(rs2.c cVar) {
        f.l(this.f84070a, cVar, "com.garmin.android.gdi.ACTION_ON_REMOTE_DEVICE_BATTERY_LOW");
    }
}
