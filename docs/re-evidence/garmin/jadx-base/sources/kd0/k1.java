package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {529}, m = "getSubscriptionLoginUri", v = 2)
public final class k1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f104164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104165c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l1 l1Var, t13.d<? super k1> dVar) {
        super(dVar);
        this.f104164b = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104163a = obj;
        this.f104165c |= Integer.MIN_VALUE;
        return this.f104164b.J(this);
    }
}
