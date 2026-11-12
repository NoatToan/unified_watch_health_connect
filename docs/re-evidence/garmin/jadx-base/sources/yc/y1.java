package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {646, 284, 290, 667, 688, 326, 709, 730, 354}, m = "doInitialLoad")
public final class y1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f196632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f196633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f196634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z53.b f196635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f196636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1<Object, Object> f196637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(s1<Object, Object> s1Var, t13.d<? super y1> dVar) {
        super(dVar);
        this.f196637f = s1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196636e = obj;
        this.f196638g |= Integer.MIN_VALUE;
        return this.f196637f.f(this);
    }
}
