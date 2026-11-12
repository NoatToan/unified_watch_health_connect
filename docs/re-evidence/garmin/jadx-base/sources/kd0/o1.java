package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {462}, m = "saveInReachSubscriptionDeviceRemoval", v = 2)
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f104262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f104263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1 f104264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f104265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(l1 l1Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f104264c = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104263b = obj;
        this.f104265d |= Integer.MIN_VALUE;
        return this.f104264c.c(0L, this);
    }
}
