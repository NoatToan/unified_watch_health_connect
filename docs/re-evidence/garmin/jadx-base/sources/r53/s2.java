package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
public final class s2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t2 f150859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s53.x f150860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f150861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2<Object> f150862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f150863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(t2<Object> t2Var, t13.d<? super s2> dVar) {
        super(dVar);
        this.f150862d = t2Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f150861c = obj;
        this.f150863e |= Integer.MIN_VALUE;
        return this.f150862d.a(this);
    }
}
