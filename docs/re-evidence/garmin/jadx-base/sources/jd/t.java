package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {629}, m = "endTransaction")
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f98304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f98305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f98306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f98307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f98307d = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98306c = obj;
        this.f98308e |= Integer.MIN_VALUE;
        return this.f98307d.f(false, this);
    }
}
