package vu1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.dashboard.FBTDashBoardViewModel", f = "FBTDashBoardViewModel.kt", l = {159}, m = "hasGCPlusSubscription", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f180380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f180381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f180382c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(o oVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f180381b = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f180380a = obj;
        this.f180382c |= Integer.MIN_VALUE;
        return this.f180381b.h5(this);
    }
}
