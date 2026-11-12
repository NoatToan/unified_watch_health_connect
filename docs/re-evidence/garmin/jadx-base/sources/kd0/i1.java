package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {504}, m = "getDeviceUnitIdsWithInReachSubscriptionOrNull", v = 2)
public final class i1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f104115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l1 l1Var, t13.d<? super i1> dVar) {
        super(dVar);
        this.f104115b = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104114a = obj;
        this.f104116c |= Integer.MIN_VALUE;
        return this.f104115b.s(false, this);
    }
}
