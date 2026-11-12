package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.HealthStatusDelegateImpl", f = "HealthStatusDelegateImpl.kt", l = {67}, m = "isHealthStatusSecondaryStatVisibleOnDashboard", v = 2)
public final class i3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j3 f104118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104119c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j3 j3Var, t13.d<? super i3> dVar) {
        super(dVar);
        this.f104118b = j3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104117a = obj;
        this.f104119c |= Integer.MIN_VALUE;
        return this.f104118b.c(this);
    }
}
