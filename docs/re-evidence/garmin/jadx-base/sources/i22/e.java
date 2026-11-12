package i22;

import android.location.Location;
import e23.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li22/e;", "Lqw0/b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements qw0.b.InterfaceC2796b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q<d, d, Long, Unit> f87399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f87400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f87401c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(q<? super d, ? super d, ? super Long, Unit> qVar, d dVar, long j8) {
        this.f87399a = qVar;
        this.f87400b = dVar;
        this.f87401c = j8;
    }

    @Override // qw0.b.InterfaceC2796b
    public final void onLocationChanged(Location location) {
        if (location != null) {
            this.f87399a.invoke(this.f87400b, new d(location, null, 2, null), Long.valueOf(this.f87401c));
        }
    }
}
