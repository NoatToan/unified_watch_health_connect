package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "usePrepared")
public final class v<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f98316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f f98317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f98318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f98319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f98320f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(r rVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f98319e = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98318d = obj;
        this.f98320f |= Integer.MIN_VALUE;
        return this.f98319e.c(null, null, this);
    }
}
