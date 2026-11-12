package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {499}, m = "getDeviceUnitIdsWithInReachSubscription", v = 2)
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f104097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l1 l1Var, t13.d<? super h1> dVar) {
        super(dVar);
        this.f104097b = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104096a = obj;
        this.f104098c |= Integer.MIN_VALUE;
        return this.f104097b.v(false, this);
    }
}
