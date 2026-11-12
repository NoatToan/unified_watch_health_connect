package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {419, 443, 454}, m = "initializeLteTransferState", v = 2)
public final class t1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f104366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f104367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ui1.o0 f104368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f104369d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f104370e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f104371f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(q1 q1Var, t13.d<? super t1> dVar) {
        super(dVar);
        this.f104370e = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104369d = obj;
        this.f104371f |= Integer.MIN_VALUE;
        return this.f104370e.l(0L, null, this);
    }
}
