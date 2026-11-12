package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.SmartScaleDelegateImpl", f = "SmartScaleDelegateImpl.kt", l = {30}, m = "getUserManagedChildAccounts", v = 2)
public final class s5 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t5 f104360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(t5 t5Var, t13.d<? super s5> dVar) {
        super(dVar);
        this.f104360b = t5Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104359a = obj;
        this.f104361c |= Integer.MIN_VALUE;
        return this.f104360b.d(this);
    }
}
