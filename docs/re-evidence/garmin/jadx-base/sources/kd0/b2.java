package kd0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.EcgDelegateImpl", f = "EcgDelegateImpl.kt", l = {81}, m = "setEcgOnboardingItemStatusCompleted", v = 2)
public final class b2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f103993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f103994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f103995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(c2 c2Var, t13.d<? super b2> dVar) {
        super(dVar);
        this.f103994b = c2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103993a = obj;
        this.f103995c |= Integer.MIN_VALUE;
        return this.f103994b.h(0L, 0L, this);
    }
}
