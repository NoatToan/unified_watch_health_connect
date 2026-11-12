package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel", f = "StartupChecksViewModel.kt", l = {415}, m = "fetchSocialProfile", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.e f12353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12354c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.startup.e eVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f12353b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12352a = obj;
        this.f12354c |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.startup.e.f44827g;
        return this.f12353b.D4(this);
    }
}
