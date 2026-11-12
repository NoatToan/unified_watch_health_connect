package pw1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardViewModel", f = "ITPDashboardViewModel.kt", l = {209, 213, 221}, m = "deleteOrUnsubscribeEventApiCall", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f141725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f141726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f141727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f141726b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f141725a = obj;
        this.f141727c |= Integer.MIN_VALUE;
        return d.X4(this.f141726b, false, false, null, this);
    }
}
