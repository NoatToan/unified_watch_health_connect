package jd;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "androidx.room.coroutines.PassthroughConnection", f = "PassthroughConnectionPool.kt", l = {89, 91}, m = "usePrepared")
public final class j<R> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f98244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f98245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f98246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f98247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f98248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(h hVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f98247d = hVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f98246c = obj;
        this.f98248e |= Integer.MIN_VALUE;
        return this.f98247d.c(null, null, this);
    }
}
