package ak0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeViewModel", f = "GCPlusHomeViewModel.kt", l = {573}, m = "getManageSubscriptionsUri", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f3586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.gcplus.presentation.home.e f3587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3588c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f3587b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f3586a = obj;
        this.f3588c |= Integer.MIN_VALUE;
        return this.f3587b.B4(this);
    }
}
