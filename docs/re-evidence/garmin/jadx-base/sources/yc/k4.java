package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131, 102}, m = "tryEnqueue")
public final class k4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i4.c f196124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.l1 f196125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.a f196126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f196127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f196128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i4.c f196129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f196130g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(i4.c cVar, t13.d<? super k4> dVar) {
        super(dVar);
        this.f196129f = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f196128e = obj;
        this.f196130g |= Integer.MIN_VALUE;
        return this.f196129f.b(0, null, this);
    }
}
