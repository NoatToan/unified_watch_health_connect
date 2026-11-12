package kd0;

import android.location.Location;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkd0/d1;", "Lqw0/b$b;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 implements qw0.b.InterfaceC2796b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o53.j<wd2.c> f104028a;

    /* JADX WARN: Multi-variable type inference failed */
    public d1(o53.j<? super wd2.c> jVar) {
        this.f104028a = jVar;
    }

    @Override // qw0.b.InterfaceC2796b
    public final void onLocationChanged(Location location) {
        wd2.c cVar = location != null ? new wd2.c((int) (location.getLatitude() * 1.1930464711111112E7d), (int) (location.getLongitude() * 1.1930464711111112E7d)) : null;
        int i14 = o13.q.f128596b;
        this.f104028a.resumeWith(cVar);
    }
}
