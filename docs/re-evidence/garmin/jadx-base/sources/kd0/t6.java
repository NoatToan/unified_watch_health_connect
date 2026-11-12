package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.UpdateBirthdateDelegateImpl", f = "UpdateBirthdateDelegateImpl.kt", l = {11}, m = "getLoginToken", v = 2)
public final class t6 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f104377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u6 f104378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f104379c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(u6 u6Var, t13.d<? super t6> dVar) {
        super(dVar);
        this.f104378b = u6Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f104377a = obj;
        this.f104379c |= Integer.MIN_VALUE;
        return this.f104378b.a(null, this);
    }
}
