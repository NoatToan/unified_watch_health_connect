package of;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@v13.e(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed")
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f131654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f131655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f131656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f131657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f131656c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f131655b = obj;
        this.f131657d |= Integer.MIN_VALUE;
        return this.f131656c.a(this);
    }
}
