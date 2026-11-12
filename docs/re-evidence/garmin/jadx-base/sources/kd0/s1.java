package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceSetupDelegateImpl", f = "DeviceSetupDelegateImpl.kt", l = {561}, m = "checkLteJobStatus", v = 2)
public final class s1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f104357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(q1 q1Var, t13.d<? super s1> dVar) {
        super(dVar);
        this.f104357b = q1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104356a = obj;
        this.f104358c |= Integer.MIN_VALUE;
        return this.f104357b.i(null, this);
    }
}
