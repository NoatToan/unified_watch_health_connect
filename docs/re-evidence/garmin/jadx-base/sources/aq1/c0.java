package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel", f = "StartupChecksViewModel.kt", l = {338, 347}, m = "fetchUserLocation", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.e f12358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12359c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.garmin.android.apps.connectmobile.startup.e eVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f12358b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12357a = obj;
        this.f12359c |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.startup.e.f44827g;
        return this.f12358b.E4(this);
    }
}
