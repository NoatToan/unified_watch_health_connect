package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
public final class f2<T> extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e2 f150608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f150609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h2 f150610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o53.l1 f150611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f150612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e2<T> f150613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f150614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(e2<T> e2Var, t13.d<? super f2> dVar) {
        super(dVar);
        this.f150613f = e2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150612e = obj;
        this.f150614g |= Integer.MIN_VALUE;
        return e2.m(this.f150613f, null, this);
    }
}
