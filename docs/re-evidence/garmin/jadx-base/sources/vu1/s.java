package vu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel", f = "FBTDashBoardViewModel.kt", l = {166, 170, 178}, m = "deleteOrUnsubscribeEventApiCall", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f180372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f180373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f180374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o oVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f180373b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180372a = obj;
        this.f180374c |= Integer.MIN_VALUE;
        return o.e5(this.f180373b, false, false, null, this);
    }
}
