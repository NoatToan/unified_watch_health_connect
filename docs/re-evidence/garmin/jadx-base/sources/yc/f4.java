package yc;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@v13.e(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {101}, m = "awaitClose")
public final class f4 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r1.b.c f195958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.l1 f195959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f195960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h4<Object> f195961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f195962e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(h4<Object> h4Var, t13.d<? super f4> dVar) {
        super(dVar);
        this.f195961d = h4Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f195960c = obj;
        this.f195962e |= Integer.MIN_VALUE;
        return this.f195961d.b9(null, this);
    }
}
