package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.EcgDelegateImpl", f = "EcgDelegateImpl.kt", l = {72}, m = "resetEcgOnboardingItemStatus", v = 2)
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f103967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f103969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(c2 c2Var, t13.d<? super a2> dVar) {
        super(dVar);
        this.f103969c = c2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103968b = obj;
        this.f103970d |= Integer.MIN_VALUE;
        return this.f103969c.k(0L, 0L, this);
    }
}
