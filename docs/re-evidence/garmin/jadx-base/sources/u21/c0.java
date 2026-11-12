package u21;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lu21/c0;", "Landroidx/lifecycle/u1;", "Ls21/o;", "initialMicronutrientsSettings", "Lv01/r0;", "getMicronutrientsGuidanceUseCase", "<init>", "(Ls21/o;Lv01/r0;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v01.r0 f167913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<s21.n> f167914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s21.o f167915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f167916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b2 f167917e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lu21/a0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.MicronutrientsViewModel$uiState$1", f = "MicronutrientsViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<r53.j<? super a0>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f167918a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c0.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super a0> jVar, t13.d<? super Unit> dVar) {
            return ((a) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f167918a;
            if (i14 == 0) {
                o13.r.b(obj);
                c0 c0Var = c0.this;
                if (c0Var.f167914b.isEmpty()) {
                    this.f167918a = 1;
                    if (c0.x4(c0Var, this) == aVar) {
                        return aVar;
                    }
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

    public c0(s21.o oVar, v01.r0 r0Var) {
        oVar.getClass();
        r0Var.getClass();
        this.f167913a = r0Var;
        this.f167914b = p13.j0.f134944a;
        this.f167915c = o72.t.c0(oVar);
        p2 p2VarA = q2.a(new a0(false, oVar, false, 5, null));
        this.f167916d = p2VarA;
        this.f167917e = r53.s.K(new r53.v(new a(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), new a0(false, oVar, false, 5, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(c0 c0Var, v13.c cVar) {
        b0 b0Var;
        Object value;
        Object value2;
        Object value3;
        Object next;
        Double d14;
        p2 p2Var = c0Var.f167916d;
        if (cVar instanceof b0) {
            b0Var = (b0) cVar;
            int i14 = b0Var.f167903c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b0Var.f167903c = i14 - Integer.MIN_VALUE;
            } else {
                b0Var = new b0(c0Var, cVar);
            }
        } else {
            b0Var = new b0(c0Var, cVar);
        }
        Object objA = b0Var.f167901a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b0Var.f167903c;
        if (i15 == 0) {
            o13.r.b(objA);
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, a0.a((a0) value, true, null, false, 6)));
            v01.r0 r0Var = c0Var.f167913a;
            b0Var.f167903c = 1;
            objA = r0Var.a(b0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        v2 v2Var = (v2) objA;
        if (v2Var instanceof v2.b) {
            c0Var.f167914b = ((s21.o) ((v2.b) v2Var).f47386a).f156160b;
            s21.o oVar = ((a0) p2Var.getValue()).f167892b;
            List<s21.n> list = c0Var.f167914b;
            List<s21.n> list2 = oVar.f156160b;
            ArrayList arrayList = new ArrayList(p13.y.r(list2, 10));
            for (s21.n nVarB : list2) {
                if (!nVarB.f156151a) {
                    Iterator<T> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!p005kotlin.jvm.internal.s.g(((s21.n) next).f156152b, nVarB.f156152b));
                    s21.n nVar = (s21.n) next;
                    nVarB = s21.n.b(nVarB, false, Double.valueOf((nVar == null || (d14 = nVar.f156154d) == null) ? 0.0d : d14.doubleValue()), 0, 55);
                }
                arrayList.add(nVarB);
            }
            s21.o oVarB = s21.o.b(oVar, arrayList);
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, a0.a((a0) value3, false, oVarB, false, 4)));
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, a0.a((a0) value2, false, null, false, 6)));
        }
        return Unit.INSTANCE;
    }

    public final void y4(ArrayList arrayList, boolean z14) {
        p2 p2Var;
        Object value;
        a0 a0Var;
        s21.o oVarB;
        do {
            p2Var = this.f167916d;
            value = p2Var.getValue();
            a0Var = (a0) value;
            oVarB = s21.o.b(a0Var.f167892b, arrayList);
            if (z14) {
                this.f167915c = oVarB;
            }
        } while (!p2Var.b(value, a0.a(a0Var, false, oVarB, false, 5)));
    }
}
