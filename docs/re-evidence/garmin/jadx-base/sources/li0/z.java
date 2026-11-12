package li0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import i3.e9;
import i3.mc;
import i3.ua;
import java.util.List;
import l72.b1;
import l72.n2;
import l72.o2;
import o4.u1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.y0;
import v62.z2;

/* JADX INFO: loaded from: classes8.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.j0 f112889a = p3.v.c(new o2(22));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-88986665);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_accept);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(1396682144, new w(p1Var, i16), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 12);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 3);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.e(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, 3);
        }
    }

    public static final void b(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1794828845);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-486948355, new j30.d(z14, 7, b14), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_blocked);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b1(28);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            b14 = (i15 & 112) == 32 ? (byte) 1 : (byte) 0;
            Object objQ2 = o0VarE.q();
            if (b14 != 0 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 24);
                o0VarE.K(objQ2);
            }
            g(eVarC, null, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 4, (byte) 0);
        }
    }

    public static final void c(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1309105567);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-1096272203, new j30.d(z14, 10, b14), o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = z2.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_favorite);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new x(1);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            boolean z16 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 27);
                o0VarE.K(objQ2);
            }
            g(eVarC, dVarA, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 7, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void d(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(-985508857);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_follow_back);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(876071248, new w(p1Var, i16), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 11);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 2);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.e(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void e(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(-662316160);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        int i17 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_follow);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(823352649, new w(p1Var, i17), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            i16 = 1;
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 10);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 1);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.e(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6);
        } else {
            i16 = 1;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020e  */
    /* JADX WARN: Code duplicated, block: B:101:0x021b  */
    /* JADX WARN: Code duplicated, block: B:102:0x022c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x022e  */
    /* JADX WARN: Code duplicated, block: B:104:0x023b  */
    /* JADX WARN: Code duplicated, block: B:105:0x024c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0250  */
    /* JADX WARN: Code duplicated, block: B:108:0x0260  */
    /* JADX WARN: Code duplicated, block: B:110:0x026c  */
    /* JADX WARN: Code duplicated, block: B:112:0x027e  */
    /* JADX WARN: Code duplicated, block: B:115:0x029f  */
    /* JADX WARN: Code duplicated, block: B:117:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:124:0x031b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0362  */
    /* JADX WARN: Code duplicated, block: B:129:0x037b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0381  */
    /* JADX WARN: Code duplicated, block: B:134:0x038c  */
    /* JADX WARN: Code duplicated, block: B:135:0x039e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0079  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:50:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:79:0x0173  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x01bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:91:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:92:0x01da  */
    /* JADX WARN: Code duplicated, block: B:94:0x01de  */
    /* JADX WARN: Code duplicated, block: B:95:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c A[DONT_INVERT] */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(final d0 d0Var, final f fVar, final boolean z14, @SuppressLint({"ModifierParameter"}) h4.r rVar, p3.m mVar, final int i14, final int i15) {
        int i16;
        final f fVar2;
        h4.r rVar2;
        boolean z15;
        p3.o0 o0Var;
        final h4.r rVar3;
        p2 p2VarI0;
        e23.p<? super p3.m, ? super Integer, Unit> pVar;
        final h4.r rVarE;
        h4.r rVar4;
        Context context;
        Object objQ;
        p3.m.a.C2565a c2565a;
        p1 p1Var;
        boolean zB;
        Object objQ2;
        e23.a<Unit> aVar;
        boolean zB2;
        Object objQ3;
        e23.a aVar2;
        mc mcVarF;
        Object objQ4;
        p1 p1Var2;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar3;
        h5.g.a.b bVar;
        b0 b0Var;
        List listK;
        List list;
        boolean z16;
        h4.r rVar5;
        boolean zB3;
        Object objQ5;
        boolean z17;
        p3.o0 o0Var2;
        boolean z18;
        boolean zB4;
        Object objQ6;
        int i17;
        n0 n0Var;
        boolean zG;
        d0Var.getClass();
        fVar.getClass();
        p3.o0 o0VarE = mVar.E(1828884976);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            fVar2 = fVar;
            i16 |= o0VarE.r(fVar2) ? 32 : 16;
        } else {
            fVar2 = fVar;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 2048 : 1024;
            }
            if ((i16 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                if (i18 != 0) {
                    rVarE = c2.l.E(h4.r.S, q1.Max);
                } else {
                    rVarE = rVar2;
                }
                x1 x1Var = p3.n.f135158a;
                if (d0Var.f112652e) {
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        return;
                    }
                    final int i19 = 0;
                    pVar = new e23.p() { // from class: li0.v
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i19) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    z.f(d0Var, fVar2, z14, rVarE, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    z.f(d0Var, fVar2, z14, rVarE, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                } else {
                    rVar4 = rVarE;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object[] objArr = new Object[0];
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new o2(23);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
                    zB = o0VarE.B(p1Var);
                    objQ2 = o0VarE.q();
                    if (zB || objQ2 == c2565a) {
                        objQ2 = new l51.c(p1Var, 16);
                        o0VarE.K(objQ2);
                    }
                    aVar = (e23.a) objQ2;
                    zB2 = o0VarE.B(p1Var);
                    objQ3 = o0VarE.q();
                    if (zB2 || objQ3 == c2565a) {
                        objQ3 = new l51.c(p1Var, 17);
                        o0VarE.K(objQ3);
                    }
                    aVar2 = (e23.a) objQ3;
                    mcVarF = e9.f(false, null, o0VarE, 0, 3);
                    objQ4 = o0VarE.q();
                    if (objQ4 == c2565a) {
                        objQ4 = p3.p0.n(Boolean.FALSE);
                        o0VarE.K(objQ4);
                    }
                    p1Var2 = (p1) objQ4;
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar3 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    ((s) o0VarE.A(f112889a)).a(d0Var, ((Boolean) p1Var2.getF182175a()).booleanValue(), aVar, z14, fVar, o0VarE, (i16 & 14) | ((i16 << 3) & 7168) | ((i16 << 9) & 57344));
                    b0Var = d0Var.f112649b;
                    if (b0Var != null) {
                        i17 = b0.a.f112639a[b0Var.ordinal()];
                        if (i17 != 1) {
                            if (i17 != 2) {
                                if (i17 != 3) {
                                    n0Var = d0Var.f112656i;
                                    if (n0Var != null) {
                                        zG = p005kotlin.jvm.internal.s.g(n0Var.f112819d, Boolean.TRUE);
                                    } else {
                                        zG = false;
                                    }
                                    if (zG) {
                                        listK = p13.x.k(a0.f112605e, a0.f112607g, a0.f112608h, a0.f112610j);
                                    } else {
                                        listK = p13.x.k(a0.f112604d, a0.f112607g, a0.f112608h, a0.f112610j);
                                    }
                                } else if (i17 != 4) {
                                    listK = p13.w.c(a0.f112611k);
                                } else if (i17 != 5) {
                                    listK = p13.j0.f134944a;
                                } else {
                                    listK = p13.w.c(a0.f112609i);
                                }
                            } else if (z14) {
                                listK = p13.x.k(a0.f112605e, a0.f112610j);
                            } else {
                                listK = p13.x.k(a0.f112605e, a0.f112606f, a0.f112608h, a0.f112610j);
                            }
                        } else if (z14) {
                            listK = p13.x.k(a0.f112604d, a0.f112610j);
                        } else {
                            listK = p13.x.k(a0.f112604d, a0.f112606f, a0.f112608h, a0.f112610j);
                        }
                    } else {
                        listK = null;
                    }
                    if (listK == null) {
                        o0VarE.C(-1173305039);
                        o0VarE.g0(false);
                        o0Var = o0VarE;
                        rVar5 = rVar4;
                        z17 = true;
                    } else {
                        o0VarE.C(-1173305038);
                        if (listK.size() == 1) {
                            o0VarE.C(-2014223436);
                            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                o0VarE.C(1983603107);
                                a0 a0Var = (a0) p13.h0.b0(listK);
                                l72.w wVar = l72.w.f111301a;
                                a.f112602a.getClass();
                                z3.e eVar = a.f112603b;
                                zB4 = o0VarE.B(p1Var);
                                objQ6 = o0VarE.q();
                                if (zB4 || objQ6 == c2565a) {
                                    objQ6 = new l51.c(p1Var, 18);
                                    o0VarE.K(objQ6);
                                }
                                z3.e eVarC = z3.f.c(222805287, new ak0.h((Object) a0Var, (Object) aVar2, (Object) fVar, context, (Object) d0Var, (Object) p1Var2, 15), o0VarE);
                                o0Var2 = o0VarE;
                                wVar.e(eVar, null, (e23.a) objQ6, mcVarF, false, null, eVarC, o0Var2, 12582918, 114);
                                z18 = false;
                                o0Var2.g0(false);
                            } else {
                                o0Var2 = o0VarE;
                                z18 = false;
                                o0Var2.C(1984335389);
                                o0Var2.g0(false);
                            }
                            o0Var2.g0(z18);
                            z16 = z18;
                            o0Var = o0Var2;
                            rVar5 = rVar4;
                        } else {
                            list = listK;
                            if (list.size() > 1) {
                                o0VarE.C(1984422809);
                                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                                zB3 = o0VarE.B(p1Var);
                                objQ5 = o0VarE.q();
                                if (zB3 || objQ5 == c2565a) {
                                    objQ5 = new l51.c(p1Var, 19);
                                    o0VarE.K(objQ5);
                                }
                                long jA = am.j.A(d92.b.f58623a, o0VarE);
                                z3.e eVarC2 = z3.f.c(-1867848641, new ak0.h((Object) list, (Object) aVar2, (Object) fVar, context, (Object) d0Var, (Object) p1Var2, 16), o0VarE);
                                rVar5 = rVar4;
                                z16 = false;
                                i3.u.a(zBooleanValue, (e23.a) objQ5, null, 0L, null, null, null, jA, 0.0f, 0.0f, eVarC2, o0VarE, 0, 48, 1916);
                                o0Var = o0VarE;
                                o0Var.g0(false);
                            } else {
                                z16 = false;
                                o0Var = o0VarE;
                                rVar5 = rVar4;
                                o0Var.C(1985978141);
                                o0Var.g0(false);
                            }
                        }
                        Unit unit = Unit.INSTANCE;
                        o0Var.g0(z16);
                        z17 = true;
                    }
                    o0Var.g0(z17);
                    rVar3 = rVar5;
                }
                p2VarI0.f135219d = pVar;
            }
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                final int i24 = 1;
                pVar = new e23.p() { // from class: li0.v
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i24) {
                            case 0:
                                ((Integer) obj2).getClass();
                                z.f(d0Var, fVar, z14, rVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                z.f(d0Var, fVar, z14, rVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                p2VarI0.f135219d = pVar;
            }
        }
        i16 |= 3072;
        rVar2 = rVar;
        if ((i16 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            if (i18 != 0) {
                rVarE = c2.l.E(h4.r.S, q1.Max);
            } else {
                rVarE = rVar2;
            }
            x1 x1Var2 = p3.n.f135158a;
            if (d0Var.f112652e) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    return;
                }
                final int i110 = 0;
                pVar = new e23.p() { // from class: li0.v
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (i110) {
                            case 0:
                                ((Integer) obj2).getClass();
                                z.f(d0Var, fVar2, z14, rVarE, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                z.f(d0Var, fVar2, z14, rVarE, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                rVar4 = rVarE;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                Object[] objArr2 = new Object[0];
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new o2(23);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) d4.a.e(objArr2, (e23.a) objQ, o0VarE, 48);
                zB = o0VarE.B(p1Var);
                objQ2 = o0VarE.q();
                if (zB) {
                    objQ2 = new l51.c(p1Var, 16);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new l51.c(p1Var, 16);
                    o0VarE.K(objQ2);
                }
                aVar = (e23.a) objQ2;
                zB2 = o0VarE.B(p1Var);
                objQ3 = o0VarE.q();
                if (zB2) {
                    objQ3 = new l51.c(p1Var, 17);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new l51.c(p1Var, 17);
                    o0VarE.K(objQ3);
                }
                aVar2 = (e23.a) objQ3;
                mcVarF = e9.f(false, null, o0VarE, 0, 3);
                objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = p3.p0.n(Boolean.FALSE);
                    o0VarE.K(objQ4);
                }
                p1Var2 = (p1) objQ4;
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar3 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                ((s) o0VarE.A(f112889a)).a(d0Var, ((Boolean) p1Var2.getF182175a()).booleanValue(), aVar, z14, fVar, o0VarE, (i16 & 14) | ((i16 << 3) & 7168) | ((i16 << 9) & 57344));
                b0Var = d0Var.f112649b;
                if (b0Var != null) {
                    i17 = b0.a.f112639a[b0Var.ordinal()];
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                n0Var = d0Var.f112656i;
                                if (n0Var != null) {
                                    zG = p005kotlin.jvm.internal.s.g(n0Var.f112819d, Boolean.TRUE);
                                } else {
                                    zG = false;
                                }
                                if (zG) {
                                    listK = p13.x.k(a0.f112605e, a0.f112607g, a0.f112608h, a0.f112610j);
                                } else {
                                    listK = p13.x.k(a0.f112604d, a0.f112607g, a0.f112608h, a0.f112610j);
                                }
                            } else if (i17 != 4) {
                                listK = p13.w.c(a0.f112611k);
                            } else if (i17 != 5) {
                                listK = p13.j0.f134944a;
                            } else {
                                listK = p13.w.c(a0.f112609i);
                            }
                        } else if (z14) {
                            listK = p13.x.k(a0.f112605e, a0.f112610j);
                        } else {
                            listK = p13.x.k(a0.f112605e, a0.f112606f, a0.f112608h, a0.f112610j);
                        }
                    } else if (z14) {
                        listK = p13.x.k(a0.f112604d, a0.f112610j);
                    } else {
                        listK = p13.x.k(a0.f112604d, a0.f112606f, a0.f112608h, a0.f112610j);
                    }
                } else {
                    listK = null;
                }
                if (listK == null) {
                    o0VarE.C(-1173305039);
                    o0VarE.g0(false);
                    o0Var = o0VarE;
                    rVar5 = rVar4;
                    z17 = true;
                } else {
                    o0VarE.C(-1173305038);
                    if (listK.size() == 1) {
                        o0VarE.C(-2014223436);
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            o0VarE.C(1983603107);
                            a0 a0Var2 = (a0) p13.h0.b0(listK);
                            l72.w wVar2 = l72.w.f111301a;
                            a.f112602a.getClass();
                            z3.e eVar2 = a.f112603b;
                            zB4 = o0VarE.B(p1Var);
                            objQ6 = o0VarE.q();
                            if (zB4) {
                                objQ6 = new l51.c(p1Var, 18);
                                o0VarE.K(objQ6);
                            } else {
                                objQ6 = new l51.c(p1Var, 18);
                                o0VarE.K(objQ6);
                            }
                            z3.e eVarC3 = z3.f.c(222805287, new ak0.h((Object) a0Var2, (Object) aVar2, (Object) fVar, context, (Object) d0Var, (Object) p1Var2, 15), o0VarE);
                            o0Var2 = o0VarE;
                            wVar2.e(eVar2, null, (e23.a) objQ6, mcVarF, false, null, eVarC3, o0Var2, 12582918, 114);
                            z18 = false;
                            o0Var2.g0(false);
                        } else {
                            o0Var2 = o0VarE;
                            z18 = false;
                            o0Var2.C(1984335389);
                            o0Var2.g0(false);
                        }
                        o0Var2.g0(z18);
                        z16 = z18;
                        o0Var = o0Var2;
                        rVar5 = rVar4;
                    } else {
                        list = listK;
                        if (list.size() > 1) {
                            o0VarE.C(1984422809);
                            boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                            zB3 = o0VarE.B(p1Var);
                            objQ5 = o0VarE.q();
                            if (zB3) {
                                objQ5 = new l51.c(p1Var, 19);
                                o0VarE.K(objQ5);
                            } else {
                                objQ5 = new l51.c(p1Var, 19);
                                o0VarE.K(objQ5);
                            }
                            long jA2 = am.j.A(d92.b.f58623a, o0VarE);
                            z3.e eVarC4 = z3.f.c(-1867848641, new ak0.h((Object) list, (Object) aVar2, (Object) fVar, context, (Object) d0Var, (Object) p1Var2, 16), o0VarE);
                            rVar5 = rVar4;
                            z16 = false;
                            i3.u.a(zBooleanValue2, (e23.a) objQ5, null, 0L, null, null, null, jA2, 0.0f, 0.0f, eVarC4, o0VarE, 0, 48, 1916);
                            o0Var = o0VarE;
                            o0Var.g0(false);
                        } else {
                            z16 = false;
                            o0Var = o0VarE;
                            rVar5 = rVar4;
                            o0Var.C(1985978141);
                            o0Var.g0(false);
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    o0Var.g0(z16);
                    z17 = true;
                }
                o0Var.g0(z17);
                rVar3 = rVar5;
            }
            p2VarI0.f135219d = pVar;
        }
        o0Var = o0VarE;
        o0Var.e();
        rVar3 = rVar2;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i25 = 1;
            pVar = new e23.p() { // from class: li0.v
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i25) {
                        case 0:
                            ((Integer) obj2).getClass();
                            z.f(d0Var, fVar, z14, rVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            z.f(d0Var, fVar, z14, rVar3, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar;
        }
    }

    public static final void g(e23.p<? super p3.m, ? super Integer, Unit> pVar, u4.d dVar, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        boolean z15;
        int i18;
        p3.o0 o0Var;
        boolean z16;
        p3.o0 o0VarL = vb.h.l(1388943361, aVar, str, mVar);
        if ((i14 & 48) == 0) {
            i16 = i14 | (o0VarL.B(dVar) ? 32 : 16);
        } else {
            i16 = i14;
        }
        int i19 = i16 | (o0VarL.B(str) ? 256 : 128);
        int i24 = i15 & 8;
        if (i24 != 0) {
            i17 = i19 | 3072;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i17 = i19 | (o0VarL.B(rVar2) ? 2048 : 1024);
        }
        int i25 = i15 & 16;
        if (i25 != 0) {
            i18 = i17 | 24576;
            z15 = z14;
        } else {
            z15 = z14;
            i18 = i17 | (o0VarL.h(z15) ? 16384 : 8192);
        }
        if ((i14 & 196608) == 0) {
            i18 |= o0VarL.r(aVar) ? 131072 : 65536;
        }
        int i26 = i18;
        if (o0VarL.n(i26 & 1, (74899 & i26) != 74898)) {
            h4.r rVar3 = i24 != 0 ? h4.r.S : rVar2;
            boolean z17 = i25 != 0 ? true : z15;
            x1 x1Var = p3.n.f135158a;
            int i27 = i26 >> 6;
            o0Var = o0VarL;
            h4.r rVar4 = rVar3;
            boolean z18 = z17;
            l72.f0.a.f111000a.g((i27 & 7168) | (i27 & 112) | 6 | (i27 & 896), 0, aVar, z3.f.c(555603338, new y(pVar, str, dVar, z17, 0), o0VarL), rVar4, o0Var, z18);
            z16 = z18;
            rVar2 = rVar4;
        } else {
            o0Var = o0VarL;
            o0Var.e();
            z16 = z15;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o((Object) pVar, dVar, str, rVar2, z16, (e23.a) aVar, i14, i15, 15);
        }
    }

    public static final void h(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1057659976);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1685040482, new j30.d(z14, 9, b14), o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = z2.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_following);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new x(0);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            boolean z16 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 26);
                o0VarE.K(objQ2);
            }
            g(eVarC, dVarA, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 6, (byte) 0);
        }
    }

    public static final void i(u4.d dVar, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1278689680);
        int i15 = (o0VarE.B(dVar) ? 4 : 2) | i14 | (o0VarE.h(z14) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            float f14 = j92.b.f97901d.f97903b;
            long j8 = d92.b.a(o0VarE).k().f63527d;
            if (z14) {
                o0VarE.C(-1379139115);
                j(o0VarE, 0);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1379096893);
                h4.r.a aVar = h4.r.S;
                bVar.getClass();
                y0.b(dVar, null, x2.q(c2.l.C(aVar, 0.0f, 0.0f, j92.b.f97899b.f97918c, 0.0f, 11), f14), o4.e0.a.a(o4.e0.f128843b, j8), o0VarE, (i15 & 14) | 48, 56);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l72.z(dVar, z14, i14);
        }
    }

    public static final void j(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(87870328);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 0.0f, eVar.f97918c, 0.0f, 11);
            bVar.getClass();
            h4.r rVarQ = x2.q(rVarC, j92.b.f97901d.f97903b);
            long jC = o4.d0.c(0.5f, d92.b.a(o0VarE).f().b(), 14);
            o4.d0.f128823b.getClass();
            long j8 = o4.d0.f128831j;
            bVar.getClass();
            float f14 = eVar.f97916a;
            u1.f129010b.getClass();
            ua.a(f14, 0.0f, u1.f129012d, 3072, 32, jC, j8, rVarQ, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l71.i(i14, 22);
        }
    }

    public static final void k(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1716943634);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1190930876, new j30.d(z14, 12, b14), o0VarE);
            s62.a.f157643a.getClass();
            u4.d dVarA = z2.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_muted);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new x(3);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            boolean z16 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 29);
                o0VarE.K(objQ2);
            }
            g(eVarC, dVarA, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 9, (byte) 0);
        }
    }

    public static final void l(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-1687742482);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.f0.a aVar2 = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(-861202441, new j30.d(z14, 8, b14), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.connection_request_sent);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new b1(29);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            boolean z16 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 25);
                o0VarE.K(objQ2);
            }
            aVar2.i(eVarC, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 5, (byte) 0);
        }
    }

    public static final void m(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1391729683);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(-690118377, new j30.d(z14, 11, b14), o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.connection_request_sent);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new x(2);
                o0VarE.K(objQ);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            b14 = (i15 & 112) == 32 ? (byte) 1 : (byte) 0;
            Object objQ2 = o0VarE.q();
            if (b14 != 0 || objQ2 == c2565a) {
                objQ2 = new l72.t(aVar, 28);
                o0VarE.K(objQ2);
            }
            g(eVarC, null, strQ, rVarC, z15, (e23.a) objQ2, o0VarE, 54, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new dv0.t(z14, aVar, i14, 8, (byte) 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void n(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1207632327);
        int i16 = 4;
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_unblock);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(-263632240, new w(p1Var, i16), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 14);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 5);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.i(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void o(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(1755569971);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.common_undo);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(-1446350070, new w(p1Var, 3), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 13);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 4);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.i(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void p(d0 d0Var, f fVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-108196607);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(d0Var) : o0VarE.r(d0Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(fVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_unmute);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            l72.f0.a aVar = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(-1956772072, new w(p1Var, 5), o0VarE);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new n2(strQ, 15);
                o0VarE.K(objQ2);
            }
            h4.r rVarC = p5.v.c((e23.l) objQ2, rVarF, false);
            boolean z14 = !((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zR = o0VarE.r(fVar) | o0VarE.r(context) | ((i15 & 14) == 4 || ((i15 & 8) != 0 && o0VarE.r(d0Var)));
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                ao1.c cVar = new ao1.c(fVar, context, d0Var, p1Var, 6);
                o0VarE.K(cVar);
                objQ3 = cVar;
            }
            aVar.i(eVarC, strQ, rVarC, z14, (e23.a) objQ3, o0VarE, 6, 0);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ao1.d(d0Var, fVar, i14, 6);
        }
    }

    public static final void q(u4.d dVar, long j8, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(219255785);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            long jC = z14 ? j8 : o4.d0.c(0.5f, j8, 14);
            g6.f.a aVar = g6.f.f75994b;
            y0.b(dVar, "", x2.q(c2.l.C(h4.r.S, 8, 0.0f, 0.0f, 0.0f, 14), 16), o4.e0.a.a(o4.e0.f128843b, jC), o0VarE, (i15 & 14) | 432, 56);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l72.d0(dVar, j8, z14, i14, 2);
        }
    }
}
