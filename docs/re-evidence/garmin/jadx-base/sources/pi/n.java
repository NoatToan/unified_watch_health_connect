package pi;

import o53.b0;
import o53.l1;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.network.ws.WebSocketNetworkTransport$supervise$4", f = "WebSocketNetworkTransport.kt", l = {244}, m = "invokeSuspend")
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f137813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<p> f137814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<l1> f137815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<l1> f137816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, r0<p> r0Var, r0<l1> r0Var2, r0<l1> r0Var3, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f137813b = kVar;
        this.f137814c = r0Var;
        this.f137815d = r0Var2;
        this.f137816e = r0Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f137813b, this.f137814c, this.f137815d, this.f137816e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137812a;
        if (i14 == 0) {
            o13.r.b(obj);
            long j8 = this.f137813b.f137750d;
            this.f137812a = 1;
            if (m0.b(j8, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        k.c(this.f137814c, this.f137815d, this.f137816e);
        return Unit.INSTANCE;
    }
}
