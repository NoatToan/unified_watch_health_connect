package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GCPlusDelegateImpl", f = "GCPlusDelegateImpl.kt", l = {72}, m = "hasSetupNutrition", v = 2)
public final class q2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f104314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p2 p2Var, t13.d<? super q2> dVar) {
        super(dVar);
        this.f104314b = p2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104313a = obj;
        this.f104315c |= Integer.MIN_VALUE;
        return this.f104314b.g(this);
    }
}
