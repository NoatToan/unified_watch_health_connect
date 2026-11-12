package aq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.StartupChecksViewModel", f = "StartupChecksViewModel.kt", l = {377, 388}, m = "fetchConnectPrivacyConsent", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.startup.e f12346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.garmin.android.apps.connectmobile.startup.e eVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f12346b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f12345a = obj;
        this.f12347c |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.startup.e.f44827g;
        return this.f12346b.C4(this);
    }
}
