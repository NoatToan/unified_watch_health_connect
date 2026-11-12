package b21;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.fe;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class u9 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15288a;

        static {
            int[] iArr = new int[s21.s.values().length];
            try {
                iArr[s21.s.NO_GOAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15288a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
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
    public static final void a(lc.v vVar, lc.m0 m0Var, boolean z14, e23.a aVar, e23.l lVar, e23.a aVar2, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        ?? r14;
        u21.u0 u0Var;
        Object obj;
        p3.p1 p1Var;
        androidx.lifecycle.u1 u1Var;
        p3.p1 p1Var2;
        p3.o0 o0Var2;
        p3.p1 p1Var3;
        p3.o0 o0VarE = mVar.E(2122805824);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(vVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(m0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            Object obj2 = p3.m.a.f135155b;
            if (objQ == obj2) {
                objQ = com.nimbusds.jose.shaded.gson.internal.a.f(o0VarE);
            }
            fe feVar = (fe) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.generic_error_message);
            Object objQ2 = o0VarE.q();
            if (objQ2 == obj2) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p3.p1 p1Var4 = (p3.p1) objQ2;
            boolean zB = o0VarE.B(vVar);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == obj2) {
                objQ3 = m0Var.c(p005kotlin.jvm.internal.s0.f105811a.b(fb.e.class));
                o0VarE.K(objQ3);
            }
            lc.v vVar2 = (lc.v) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == obj2) {
                objQ4 = new ak0.z(p1Var4, 16);
                o0VarE.K(objQ4);
            }
            Object obj3 = (e23.a) objQ4;
            boolean z15 = (i15 & 896) == 256;
            Object objQ5 = o0VarE.q();
            if (z15 || objQ5 == obj2) {
                r14 = 0;
                objQ5 = new m9(z14, 0);
                o0VarE.K(objQ5);
            } else {
                r14 = 0;
            }
            o0VarE.L(-1614864554);
            androidx.lifecycle.u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(p005kotlin.jvm.internal.s0.f105811a.b(u21.u0.class), vVar2.getF189591b(), null, CreationExtrasExtKt.defaultExtras(vVar2), null, KoinApplicationKt.currentKoinScope(o0VarE, r14), (e23.a) objQ5);
            o0VarE.g0(r14);
            u21.u0 u0Var2 = (u21.u0) u1VarResolveViewModel;
            p3.p1 p1VarC = s9.c.c(u0Var2.f168165p, o0VarE);
            boolean zR = ((i15 & 7168) == 2048) | o0VarE.r(u0Var2) | o0VarE.r(m0Var);
            Object objQ6 = o0VarE.q();
            if (zR || objQ6 == obj2) {
                objQ6 = new a4.a(u0Var2, 17, m0Var, aVar);
                o0VarE.K(objQ6);
            }
            e23.l lVar2 = (e23.l) objQ6;
            Boolean boolValueOf = Boolean.valueOf(((s21.a0) p1VarC.getF182175a()).B);
            boolean zB2 = o0VarE.B(p1VarC) | o0VarE.r(u0Var2) | o0VarE.r(m0Var) | o0VarE.B(lVar2);
            Object objQ7 = o0VarE.q();
            if (zB2 || objQ7 == obj2) {
                Object q9Var = new q9(u0Var2, m0Var, lVar2, p1VarC, null);
                u0Var = u0Var2;
                obj = m0Var;
                p1Var = p1VarC;
                o0VarE.K(q9Var);
                objQ7 = q9Var;
            } else {
                p1Var = p1VarC;
                u0Var = u0Var2;
                obj = m0Var;
            }
            p3.l0.e((e23.p) objQ7, boolValueOf, o0VarE);
            Boolean boolValueOf2 = Boolean.valueOf(((s21.a0) p1Var.getF182175a()).C);
            boolean zB3 = o0VarE.B(p1Var) | o0VarE.r(u0Var) | o0VarE.B(lVar2);
            Object objQ8 = o0VarE.q();
            if (zB3 || objQ8 == obj2) {
                objQ8 = new r9(u0Var, lVar2, p1Var, null);
                o0VarE.K(objQ8);
            }
            p3.l0.e((e23.p) objQ8, boolValueOf2, o0VarE);
            o13.p<Boolean, l01.k> pVar = ((s21.a0) p1Var.getF182175a()).D;
            boolean zB4 = o0VarE.B(p1Var) | o0VarE.r(u0Var) | ((i15 & 57344) == 16384);
            Object objQ9 = o0VarE.q();
            if (zB4 || objQ9 == obj2) {
                objQ9 = new s9(u0Var, lVar, p1Var, null);
                o0VarE.K(objQ9);
            }
            p3.l0.e((e23.p) objQ9, pVar, o0VarE);
            Boolean boolValueOf3 = Boolean.valueOf(((s21.a0) p1Var.getF182175a()).f156061z);
            boolean zB5 = o0VarE.B(p1Var) | o0VarE.B(strQ) | o0VarE.r(u0Var);
            Object objQ10 = o0VarE.q();
            if (zB5 || objQ10 == obj2) {
                p3.p1 p1Var5 = p1Var;
                u21.u0 u0Var3 = u0Var;
                objQ10 = new t9(feVar, strQ, u0Var3, p1Var5, null);
                u1Var = u0Var3;
                p1Var2 = p1Var5;
                o0VarE.K(objQ10);
            } else {
                u1Var = u0Var;
                p1Var2 = p1Var;
            }
            p3.l0.e((e23.p) objQ10, boolValueOf3, o0VarE);
            boolean z16 = false;
            eVar.m(u1Var, (s21.a0) p1Var2.getF182175a(), lVar2, obj3, feVar, o0VarE, Integer.valueOf(((i15 >> 3) & 458752) | 27648));
            p3.o0 o0Var3 = o0VarE;
            if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                o0Var3.C(1412804670);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ2 = gl1.y.Q(o0Var3, R.string.title_exit_without_saving);
                String strQ3 = gl1.y.Q(o0Var3, R.string.common_save_error_msg);
                String strQ4 = gl1.y.Q(o0Var3, R.string.lbl_common_continue);
                String strQ5 = gl1.y.Q(o0Var3, R.string.lbl_cancel);
                boolean zB6 = ((i15 & 458752) == 131072) | o0Var3.B(p1Var2) | o0Var3.r(obj);
                Object objQ11 = o0Var3.q();
                if (zB6 || objQ11 == obj2) {
                    p1Var3 = p1Var4;
                    Object eVar2 = new af0.e(obj, (Object) aVar2, (Object) p1Var3, (Object) p1Var2, 8);
                    o0Var3.K(eVar2);
                    objQ11 = eVar2;
                } else {
                    p1Var3 = p1Var4;
                }
                e23.a<Unit> aVar3 = (e23.a) objQ11;
                Object objQ12 = o0Var3.q();
                if (objQ12 == obj2) {
                    objQ12 = new ak0.z(p1Var3, 17);
                    o0Var3.K(objQ12);
                }
                c1Var.a(false, strQ2, strQ3, null, null, strQ4, false, false, aVar3, strQ5, (e23.a) objQ12, o0Var3, 0, 6, 217);
                p3.o0 o0Var4 = o0Var3;
                o0Var4.g0(z16);
                o0Var2 = o0Var4;
            } else {
                z16 = false;
                o0Var3.C(1413521762);
                o0Var3.g0(false);
                o0Var2 = o0Var3;
            }
            if (((s21.a0) p1Var2.getF182175a()).A != null) {
                o0Var2.C(1413592442);
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_error_occurred);
                String strQ7 = gl1.y.Q(o0Var2, R.string.technical_challenge_message);
                String strQ8 = gl1.y.Q(o0Var2, R.string.lbl_cancel);
                String strQ9 = gl1.y.Q(o0Var2, R.string.lbl_try_again);
                boolean zR2 = o0Var2.r(u1Var) | o0Var2.B(p1Var2);
                Object objQ13 = o0Var2.q();
                if (zR2 || objQ13 == obj2) {
                    objQ13 = new ao1.i(24, u1Var, p1Var2);
                    o0Var2.K(objQ13);
                }
                e23.a<Unit> aVar4 = (e23.a) objQ13;
                boolean zR3 = o0Var2.r(u1Var);
                Object objQ14 = o0Var2.q();
                if (zR3 || objQ14 == obj2) {
                    objQ14 = new u8(u1Var, 1);
                    o0Var2.K(objQ14);
                }
                p3.o0 o0Var5 = o0Var2;
                c1Var2.a(false, strQ6, strQ7, null, null, strQ9, false, false, aVar4, strQ8, (e23.a) objQ14, o0Var5, 0, 0, 217);
                p3.o0 o0Var6 = o0Var5;
                o0Var6.g0(z16);
                o0Var = o0Var6;
            } else {
                o0Var2.C(1414128866);
                o0Var2.g0(z16);
                o0Var = o0Var2;
            }
        } else {
            o0VarE.e();
            o0Var = o0VarE;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(vVar, m0Var, z14, aVar, lVar, aVar2, eVar, i14);
        }
    }
}
