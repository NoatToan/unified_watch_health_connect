package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646}, m = "currentPagingState")
public final class x1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1 f196607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2.a f196608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f196609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f196610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f196611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f196612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(s1<Object, Object> s1Var, t13.d<? super x1> dVar) {
        super(dVar);
        this.f196611e = s1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196610d = obj;
        this.f196612f |= Integer.MIN_VALUE;
        return this.f196611e.e(this);
    }
}
