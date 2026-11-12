package wq0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import com.garmin.android.apps.connectmobile.R;
import java.util.List;
import l72.c1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.jvm.internal.s0;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(l lVar, e23.l lVar2, e23.a aVar, p3.m mVar, int i14) {
        l lVar3;
        l lVar4;
        int i15;
        p1 p1Var;
        l lVar5;
        List<a0> list;
        o0 o0VarP = androidx.room.a0.p(lVar2, aVar, mVar, -770967153);
        int i16 = i14 | 2 | (o0VarP.r(lVar2) ? 32 : 16) | (o0VarP.r(aVar) ? 256 : 128);
        if (o0VarP.n(i16 & 1, (i16 & 147) != 146)) {
            o0VarP.G0();
            if ((i14 & 1) == 0 || o0VarP.o0()) {
                o0VarP.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarP);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(l.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarP, 0), null);
                o0VarP.g0(false);
                lVar4 = (l) u1VarResolveViewModel;
                i15 = i16 & (-15);
            } else {
                o0VarP.e();
                i15 = i16 & (-15);
                lVar4 = lVar;
            }
            o0VarP.h0();
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.TRUE);
                o0VarP.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarP.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarP.K(objQ2);
            }
            p1 p1Var3 = (p1) objQ2;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            p1 p1VarC = s9.c.c(lVar4.f186611e, o0VarP);
            List<a0> listB = ((z) p1VarC.getF182175a()).b();
            Boolean boolValueOf = Boolean.valueOf(((z) p1VarC.getF182175a()).f186619d);
            Boolean boolValueOf2 = Boolean.valueOf(((z) p1VarC.getF182175a()).f186621f);
            int i17 = i15 & 896;
            boolean zB = (i17 == 256) | o0VarP.B(p1VarC) | o0VarP.r(lVar4) | ((i15 & 112) == 32) | o0VarP.r(context);
            Object objQ3 = o0VarP.q();
            if (zB || objQ3 == c2565a) {
                p1Var = p1VarC;
                d dVar = new d(lVar4, lVar2, aVar, context, p1Var, null);
                o0VarP.K(dVar);
                objQ3 = dVar;
            } else {
                p1Var = p1VarC;
            }
            l0.f(boolValueOf, boolValueOf2, (e23.p) objQ3, o0VarP);
            Boolean bool = (Boolean) p1Var3.getF182175a();
            bool.booleanValue();
            boolean zR = o0VarP.r(lVar4) | (i17 == 256);
            Object objQ4 = o0VarP.q();
            if (zR || objQ4 == c2565a) {
                objQ4 = new e(lVar4, aVar, p1Var3, null);
                o0VarP.K(objQ4);
            }
            l0.e((e23.p) objQ4, bool, o0VarP);
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            boolean zR2 = o0VarP.r(lVar4);
            Object objQ5 = o0VarP.q();
            if (zR2 || objQ5 == c2565a) {
                objQ5 = new ug2.b0(lVar4, 22, p1Var2, p1Var3);
                o0VarP.K(objQ5);
            }
            c.w.a(0, 0, (e23.a) objQ5, o0VarP, zBooleanValue);
            if (((z) p1Var.getF182175a()).f186620e) {
                o0VarP.C(1604500298);
                c1 c1Var = c1.f110940a;
                String strQ = gl1.y.Q(o0VarP, R.string.msg_no_activity_selected);
                String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_ok);
                boolean zR3 = o0VarP.r(lVar4);
                Object objQ6 = o0VarP.q();
                if (zR3 || objQ6 == c2565a) {
                    objQ6 = new wd.c(lVar4, 11);
                    o0VarP.K(objQ6);
                }
                lVar5 = lVar4;
                list = listB;
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, (e23.a) objQ6, null, null, o0VarP, 6, 0, 1754);
                o0VarP.g0(false);
            } else {
                lVar5 = lVar4;
                list = listB;
                o0VarP.C(1604816467);
                o0VarP.g0(false);
            }
            l lVar6 = lVar5;
            z02.d.a(false, z3.f.c(1107766378, new sk0.c(p1Var3, 13), o0VarP), null, null, null, z3.f.c(-139675674, new wb1.i(10, lVar6, list), o0VarP), o0VarP, 196656, 29);
            lVar3 = lVar6;
        } else {
            o0VarP.e();
            lVar3 = lVar;
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(lVar3, lVar2, aVar, i14, 17);
        }
    }
}
