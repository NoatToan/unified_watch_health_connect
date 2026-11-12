package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {336}, m = "isInInitialSetupOrReset", v = 2)
public final class u1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f104382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(q1 q1Var, t13.d<? super u1> dVar) {
        super(dVar);
        this.f104382b = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104381a = obj;
        this.f104383c |= Integer.MIN_VALUE;
        return this.f104382b.k(0L, this);
    }
}
