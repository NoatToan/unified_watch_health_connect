package id0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.FamilyAccountsDelegateImpl", f = "FamilyAccountsDelegateDI.kt", l = {167}, m = "showChildPrivacyPolicyConsent", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public aq1.a f92978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f92979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v0 f92980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92981d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(v0 v0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f92980c = v0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f92979b = obj;
        this.f92981d |= Integer.MIN_VALUE;
        return this.f92980c.m(0L, null, this);
    }
}
