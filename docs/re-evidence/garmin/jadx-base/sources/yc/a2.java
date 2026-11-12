package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4$1", f = "PageFetcherSnapshot.kt", l = {646, 658, 125, 669, 128, 680, 692, 125, 703, 128, 714, 726, 125, 737, 128, 748}, m = "emit")
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f195725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f195726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f195727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f195728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f195729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f195730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f195731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s1 f195732h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f195733i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s1.c.C3673c.a<Object> f195734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f195735k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(s1.c.C3673c.a<Object> aVar, t13.d<? super a2> dVar) {
        super(dVar);
        this.f195734j = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195733i = obj;
        this.f195735k |= Integer.MIN_VALUE;
        return this.f195734j.a(this);
    }
}
