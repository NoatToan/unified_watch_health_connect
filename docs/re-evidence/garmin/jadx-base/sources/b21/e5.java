package b21;

import i3.fe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;

/* JADX INFO: loaded from: classes9.dex */
public final class e5 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14640a;

        static {
            int[] iArr = new int[o4.values().length];
            try {
                iArr[o4.LOG_FOOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o4.CREATE_MEAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o4.CREATE_RECIPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14640a = iArr;
        }
    }

    public static final void a(lc.v vVar, lc.m0 m0Var, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        e23.u uVar;
        p3.o0 o0VarE = mVar.E(1454264871);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            uVar = eVar;
            i15 |= o0VarE.r(uVar) ? 256 : 128;
        } else {
            uVar = eVar;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            boolean zB = o0VarE.B(vVar);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(fb.b.class));
                o0VarE.K(objQ2);
            }
            lc.v vVar2 = (lc.v) objQ2;
            o0VarE.L(-1614864554);
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(m21.v.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
            o0VarE.g0(false);
            m21.v vVar3 = (m21.v) u1VarResolveViewModel;
            uVar.m(vVar3, (i53.c) s9.c.c(vVar3.f116179d, o0VarE).getF182175a(), (i53.c) s9.c.c(vVar3.f116180e, o0VarE).getF182175a(), (i53.c) s9.c.c(vVar3.f116181f, o0VarE).getF182175a(), feVar, o0VarE, Integer.valueOf(((i15 << 9) & 458752) | 24576));
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new x0(vVar, m0Var, eVar, i14, 1);
        }
    }

    public static final void b(lc.m0 m0Var, List<? extends b11.a> list) {
        Collection collection;
        androidx.lifecycle.j1 j1VarA;
        androidx.lifecycle.j1 j1VarA2;
        lc.v vVarF = m0Var.f();
        if (vVarF == null || (j1VarA2 = vVarF.a()) == null || (collection = (List) j1VarA2.a("addedFoodResult")) == null) {
            collection = p13.j0.f134944a;
        }
        ArrayList arrayListC0 = p13.h0.C0(collection, list);
        lc.v vVarF2 = m0Var.f();
        if (vVarF2 == null || (j1VarA = vVarF2.a()) == null) {
            return;
        }
        j1VarA.f(arrayListC0, "addedFoodResult");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:20:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static final f11.m c(lc.v vVar, lc.m0 m0Var, p3.m mVar) {
        Object bVar;
        mVar.C(1843365558);
        p3.x1 x1Var = p3.n.f135158a;
        boolean zB = mVar.B(vVar);
        Object objQ = mVar.q();
        if (zB) {
            int i14 = o13.q.f128596b;
            bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.f.class));
            if (bVar instanceof o13.q.b) {
                bVar = null;
            }
            objQ = (lc.v) bVar;
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                try {
                    int i15 = o13.q.f128596b;
                    bVar = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(l4.f.class));
                } catch (Throwable th3) {
                    int i16 = o13.q.f128596b;
                    bVar = new o13.q.b(th3);
                }
                if (bVar instanceof o13.q.b) {
                    bVar = null;
                }
                objQ = (lc.v) bVar;
                mVar.K(objQ);
            }
        }
        lc.v vVar2 = (lc.v) objQ;
        if (vVar2 == null) {
            p3.x1 x1Var2 = p3.n.f135158a;
            mVar.f();
            return null;
        }
        mVar.L(-1614864554);
        androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(f11.m.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(mVar, 0), null);
        mVar.R();
        f11.m mVar2 = (f11.m) u1VarResolveViewModel;
        p3.x1 x1Var3 = p3.n.f135158a;
        mVar.f();
        return mVar2;
    }
}
