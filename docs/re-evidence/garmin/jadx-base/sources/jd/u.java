package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {464, 468, 482, 482, 482}, m = "transaction")
public final class u<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f98309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f98310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f98311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f98312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f98313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f98313e = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98312d = obj;
        this.f98314f |= Integer.MIN_VALUE;
        return this.f98313e.g(null, null, this);
    }
}
