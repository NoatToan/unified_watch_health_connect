package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.EnvInfoDelegate", f = "LivetrackGcmDelegateImpl.kt", l = {287}, m = "getGcsAuthData", v = 2)
public final class f2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f104062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(e2 e2Var, t13.d<? super f2> dVar) {
        super(dVar);
        this.f104062b = e2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104061a = obj;
        this.f104063c |= Integer.MIN_VALUE;
        return this.f104062b.b(this);
    }
}
