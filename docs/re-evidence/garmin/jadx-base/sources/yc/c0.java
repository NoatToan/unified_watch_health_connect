package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {287}, m = "record")
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f195787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p13.m0 f195788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f195789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f195790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d0<Object> f195791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f195792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0<Object> d0Var, t13.d<? super c0> dVar) {
        super(dVar);
        this.f195791e = d0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195790d = obj;
        this.f195792f |= Integer.MIN_VALUE;
        return this.f195791e.b(null, this);
    }
}
