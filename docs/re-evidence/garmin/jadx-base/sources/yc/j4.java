package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131}, m = "onFinish")
public final class j4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i4.c f196095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.l1 f196096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f196097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f196098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i4.c f196099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f196100f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(i4.c cVar, t13.d<? super j4> dVar) {
        super(dVar);
        this.f196099e = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196098d = obj;
        this.f196100f |= Integer.MIN_VALUE;
        return this.f196099e.a(null, this);
    }
}
