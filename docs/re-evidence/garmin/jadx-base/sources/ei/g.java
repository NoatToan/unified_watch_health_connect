package ei;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.l0;
import vh.d0;
import vh.g0;
import vh.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvh/n0$a;", "D", "Lvh/f;", "it", "", "<anonymous>", "(Lvh/f;)V"}, k = 3, mv = {1, 5, 1})
@v13.e(c = "com.apollographql.apollo3.cache.normalized.internal.ApolloCacheInterceptor$readFromNetwork$2", f = "ApolloCacheInterceptor.kt", l = {260}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<vh.f<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f64109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f64111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh.e<Object> f64112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f64113e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, vh.e<Object> eVar, z zVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f64111c = aVar;
        this.f64112d = eVar;
        this.f64113e = zVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        g gVar = new g(this.f64111c, this.f64112d, this.f64113e, dVar);
        gVar.f64110b = obj;
        return gVar;
    }

    @Override // e23.p
    public final Object invoke(vh.f<Object> fVar, t13.d<? super Unit> dVar) {
        return ((g) create(fVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0076  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x009c  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        d dVar;
        bi.q qVar;
        Object objInvoke;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f64109a;
        boolean z14 = true;
        if (i14 == 0) {
            o13.r.b(obj);
            vh.f fVar = (vh.f) this.f64110b;
            this.f64109a = 1;
            a.C1358a c1358a = a.f64079b;
            l0 l0Var = l0.f134950a;
            a aVar2 = this.f64111c;
            aVar2.getClass();
            vh.e<Object> eVar = this.f64112d;
            eVar.getClass();
            g0 g0Var = eVar.f178290c;
            bi.d dVar2 = (bi.d) g0Var.b(bi.d.f17937c);
            if (dVar2 != null ? dVar2.f17938b : false) {
                objInvoke = Unit.INSTANCE;
            } else {
                List<d0> list = fVar.f178310d;
                if (list != null && !list.isEmpty()) {
                    z14 = false;
                }
                if (z14) {
                    dVar = new d(fVar, eVar, aVar2, this.f64113e, l0Var, null);
                    qVar = (bi.q) g0Var.b(bi.q.f18009c);
                    if (qVar != null ? qVar.f18010b : false) {
                        g0.b bVarB = g0Var.b(uh.c.f171122d);
                        bVarB.getClass();
                        ge1.b.T(((uh.c) bVarB).f171124c, null, null, new c(dVar, null), 3);
                        objInvoke = Unit.INSTANCE;
                    } else {
                        objInvoke = dVar.invoke(this);
                        if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                            objInvoke = Unit.INSTANCE;
                        }
                    }
                    if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                        objInvoke = Unit.INSTANCE;
                    }
                } else {
                    bi.n nVar = (bi.n) g0Var.b(bi.n.f18002c);
                    if (nVar != null ? nVar.f18003b : false) {
                        dVar = new d(fVar, eVar, aVar2, this.f64113e, l0Var, null);
                        qVar = (bi.q) g0Var.b(bi.q.f18009c);
                        if (qVar != null ? qVar.f18010b : false) {
                            g0.b bVarB2 = g0Var.b(uh.c.f171122d);
                            bVarB2.getClass();
                            ge1.b.T(((uh.c) bVarB2).f171124c, null, null, new c(dVar, null), 3);
                            objInvoke = Unit.INSTANCE;
                        } else {
                            objInvoke = dVar.invoke(this);
                            if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                                objInvoke = Unit.INSTANCE;
                            }
                        }
                        if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                            objInvoke = Unit.INSTANCE;
                        }
                    } else {
                        objInvoke = Unit.INSTANCE;
                    }
                }
            }
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
