package vc2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.android.lib.networking.connectivity.ServerAvailabilityMonitor", f = "ServerAvailabilityMonitor.kt", l = {125, 126}, m = "getServerStatusResponse")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f177120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f177121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f177122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f177123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f177122c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f177121b = obj;
        this.f177123d |= Integer.MIN_VALUE;
        int i14 = i.f177111f;
        return this.f177122c.a(0, this);
    }
}
