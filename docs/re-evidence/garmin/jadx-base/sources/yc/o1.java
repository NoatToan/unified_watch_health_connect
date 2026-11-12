package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PageFetcher", f = "PageFetcher.kt", l = {210}, m = "generateNewPagingSource")
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f196282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h3 f196283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f196284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n1<Object, Object> f196285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f196286e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(n1<Object, Object> n1Var, t13.d<? super o1> dVar) {
        super(dVar);
        this.f196285d = n1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196284c = obj;
        this.f196286e |= Integer.MIN_VALUE;
        return n1.a(this.f196285d, null, this);
    }
}
