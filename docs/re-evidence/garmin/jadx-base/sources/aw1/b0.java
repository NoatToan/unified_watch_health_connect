package aw1;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$getMoreAtpPlans$1", f = "FBTPlanWizardViewModel.kt", l = {1966}, m = "invokeSuspend", v = 2)
public final class b0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f13329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public vt1.n f13330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f13332d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(h hVar, t13.d<? super b0> dVar) {
        super(2, dVar);
        this.f13332d = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new b0(this.f13332d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o13.p pVar;
        vt1.n nVarI5;
        int i14;
        Object obj2;
        Object objE;
        vt1.n nVar;
        Object obj3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = this.f13331c;
        h hVar = this.f13332d;
        if (i15 == 0) {
            o13.r.b(obj);
            int i16 = h.S1;
            if (hVar.q6().d() == null) {
                hVar.q6().j(g3.a.c(g3.f35298f));
                jv1.s sVar = (jv1.s) hVar.j6().d();
                if ((sVar != null ? sVar.f101128g : null) instanceof vt1.c) {
                    vt1.c cVar = vt1.c.RUN;
                    pVar = new o13.p(cVar, cVar.f180089b);
                } else {
                    vt1.g gVar = vt1.g.FINISH;
                    pVar = new o13.p(gVar, gVar.f180112b);
                }
                String str = (String) pVar.f128595b;
                jv1.s sVarI6 = hVar.i6();
                jv1.h hVar2 = sVarI6 != null ? sVarI6.f101127f : null;
                if (hVar2 instanceof jv1.g) {
                    nVarI5 = h.i5((jv1.g) hVar2);
                    if (nVarI5 != null) {
                        i14 = nVarI5.f180172b;
                    }
                    if (i14 != -1) {
                        obj2 = pVar.f128594a;
                        this.f13329a = obj2;
                        this.f13330b = nVarI5;
                        this.f13331c = 1;
                        objE = o53.c0.e(new x(hVar, i14, str, null, null), this);
                        if (objE == aVar) {
                            return aVar;
                        }
                        nVar = nVarI5;
                        obj3 = obj2;
                    } else {
                        hVar.q6().j(g3.a.d(new jv1.f(vt1.o.f180175f, null, null, null, false, false, null, 126, null)));
                    }
                } else {
                    nVarI5 = null;
                }
                i14 = -1;
                if (i14 != -1) {
                    obj2 = pVar.f128594a;
                    this.f13329a = obj2;
                    this.f13330b = nVarI5;
                    this.f13331c = 1;
                    objE = o53.c0.e(new x(hVar, i14, str, null, null), this);
                    if (objE == aVar) {
                        return aVar;
                    }
                    nVar = nVarI5;
                    obj3 = obj2;
                } else {
                    hVar.q6().j(g3.a.d(new jv1.f(vt1.o.f180175f, null, null, null, false, false, null, 126, null)));
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        nVar = this.f13330b;
        obj3 = this.f13329a;
        o13.r.b(obj);
        objE = obj;
        v2 v2Var = (v2) objE;
        if (v2Var instanceof v2.b) {
            jv1.f fVar = new jv1.f(vt1.o.f180175f, nVar != null ? new Integer(nVar.f180171a) : null, (List) ((v2.b) v2Var).f47386a, null, false, true, (vt1.f) obj3, 24, null);
            int i17 = h.S1;
            y0<g3<jv1.f>> y0VarQ6 = hVar.q6();
            g3.f35298f.getClass();
            y0VarQ6.j(g3.a.d(fVar));
        } else {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            int i18 = h.S1;
            hVar.q6().j(g3.a.a(g3.f35298f, null, null, null, null, 15));
        }
        return Unit.INSTANCE;
    }
}
