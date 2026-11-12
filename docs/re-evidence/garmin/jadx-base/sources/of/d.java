package of;

import e23.p;
import nf.o;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import wf.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lof/a$b;", "<anonymous>", "(Lo53/b0;)Lof/a$b;"}, k = 3, mv = {2, 2, 0})
@v13.e(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
public final class d extends v13.i implements p<b0, t13.d<? super a.b>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f131615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r0<nf.i> f131616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r0<hf.c> f131617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf.f f131618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f131619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r0<m> f131620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hf.e f131621h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, r0<nf.i> r0Var, r0<hf.c> r0Var2, wf.f fVar, Object obj, r0<m> r0Var3, hf.e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f131615b = aVar;
        this.f131616c = r0Var;
        this.f131617d = r0Var2;
        this.f131618e = fVar;
        this.f131619f = obj;
        this.f131620g = r0Var3;
        this.f131621h = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f131615b, this.f131616c, this.f131617d, this.f131618e, this.f131619f, this.f131620g, this.f131621h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super a.b> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131614a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        o oVar = (o) this.f131616c.f105810a;
        hf.c cVar = this.f131617d.f105810a;
        m mVar = this.f131620g.f105810a;
        this.f131614a = 1;
        Object objB = a.b(this.f131615b, oVar, cVar, this.f131618e, this.f131619f, mVar, this.f131621h, this);
        return objB == aVar ? aVar : objB;
    }
}
