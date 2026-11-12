package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.HealthStatusDelegateImpl", f = "HealthStatusDelegateImpl.kt", l = {24}, m = "getDeviceSettings-gIAlu-s", v = 2)
public final class h3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f104100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(j3 j3Var, t13.d<? super h3> dVar) {
        super(dVar);
        this.f104100b = j3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104099a = obj;
        this.f104101c |= Integer.MIN_VALUE;
        Object objA = this.f104100b.a(0L, this);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : o13.q.a(objA);
    }
}
