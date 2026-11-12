package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", l = {445}, m = "initialize")
public final class p3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o3 f196312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o3<Object, Object> f196314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196315d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(o3<Object, Object> o3Var, t13.d<? super p3> dVar) {
        super(dVar);
        this.f196314c = o3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196313b = obj;
        this.f196315d |= Integer.MIN_VALUE;
        return this.f196314c.d(this);
    }
}
