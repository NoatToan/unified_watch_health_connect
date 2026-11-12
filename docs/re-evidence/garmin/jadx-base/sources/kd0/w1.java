package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {529, 534}, m = "validateThenTransfer", v = 2)
public final class w1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ui1.g0 f104406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ui1.o0 f104407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q1 f104409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(q1 q1Var, t13.d<? super w1> dVar) {
        super(dVar);
        this.f104409d = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104408c = obj;
        this.f104410e |= Integer.MIN_VALUE;
        int i14 = q1.f104302c;
        return this.f104409d.v(null, null, this);
    }
}
