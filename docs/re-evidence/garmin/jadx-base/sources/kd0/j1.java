package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.DeviceDelegateImpl", f = "DeviceDelegateImpl.kt", l = {549, 559}, m = "getLoginToken", v = 2)
public final class j1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f104139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f104140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f104141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1 f104142d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f104143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(l1 l1Var, t13.d<? super j1> dVar) {
        super(dVar);
        this.f104142d = l1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104141c = obj;
        this.f104143e |= Integer.MIN_VALUE;
        return this.f104142d.R(this);
    }
}
