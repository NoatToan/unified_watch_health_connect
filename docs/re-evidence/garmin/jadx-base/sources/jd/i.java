package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {127}, m = "transaction")
public final class i<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f98240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f98241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f98242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f98243d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, t13.d<? super i> dVar) {
        super(dVar);
        this.f98242c = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98241b = obj;
        this.f98243d |= Integer.MIN_VALUE;
        return this.f98242c.e(null, null, this);
    }
}
