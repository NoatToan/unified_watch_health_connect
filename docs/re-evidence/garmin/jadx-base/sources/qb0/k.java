package qb0;

import a3.a1;
import c.w;
import ca0.u1;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p40.k0;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
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
    public static final void a(int i14, u1 u1Var, e23.a aVar, e23.l lVar, e23.l lVar2, p3.m mVar, b bVar) {
        p1 p1Var;
        bVar.getClass();
        lVar.getClass();
        aVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1539341301);
        int i15 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(u1Var) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(lVar2) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            boolean zB = o0VarE.B(bVar);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = bVar.f143958a.f143495c;
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = bVar.f143958a.f143495c;
                    o0VarE.K(objQ);
                }
            }
            l90.b bVar2 = (l90.b) objQ;
            boolean zB2 = o0VarE.B(bVar2);
            Object objQ2 = o0VarE.q();
            if (zB2) {
                objQ2 = bVar2.f111531p.f58441g;
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = bVar2.f111531p.f58441g;
                    o0VarE.K(objQ2);
                }
            }
            d90.f fVar = (d90.f) objQ2;
            Object objQ3 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            p1 p1VarC = s9.c.c(bVar.f143967j, o0VarE);
            z90.b bVar3 = ((sb0.b) p1VarC.getF182175a()).f158393d;
            Boolean boolValueOf = Boolean.valueOf(((sb0.b) p1VarC.getF182175a()).f158392c);
            boolean zB3 = ((i15 & 896) == 256) | o0VarE.B(p1VarC) | o0VarE.r(fVar) | ((i15 & 7168) == 2048);
            Object objQ4 = o0VarE.q();
            if (zB3 || objQ4 == c2565a) {
                p1Var = p1VarC;
                j jVar = new j(fVar, aVar, p1Var, lVar, null);
                o0VarE.K(jVar);
                objQ4 = jVar;
            } else {
                p1Var = p1VarC;
            }
            l0.f(bVar3, boolValueOf, (e23.p) objQ4, o0VarE);
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = new k0(p1Var2, 25);
                o0VarE.K(objQ5);
            }
            w.a(48, 1, (e23.a) objQ5, o0VarE, false);
            String str = bVar2.f111521f;
            o90.a aVar3 = bVar2.f111526k;
            float f14 = ((sb0.b) p1Var.getF182175a()).f158391b;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new k0(p1Var2, 26);
                o0VarE.K(objQ6);
            }
            b(str, aVar3, f14, (e23.a) objQ6, lVar2, o0VarE, (i15 & 57344) | 3072);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0VarE.C(-1149443149);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(o0VarE, R.string.skip_sync_alert_msg);
                String strQ2 = y.Q(o0VarE, R.string.lbl_ok);
                boolean z14 = (i15 & 112) == 32;
                Object objQ7 = o0VarE.q();
                if (z14 || objQ7 == c2565a) {
                    objQ7 = new f(u1Var, p1Var2, 1);
                    o0VarE.K(objQ7);
                }
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, (e23.a) objQ7, null, null, o0VarE, 0, 0, 1755);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1149162537);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(bVar, u1Var, lVar, aVar, lVar2, i14);
        }
    }

    public static final void b(String str, o90.a aVar, float f14, e23.a<Unit> aVar2, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(413905245);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.i(f14) ? 256 : 128) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = i15 << 3;
            o0Var = o0VarE;
            da0.p.c("sync_progress_screen", str, aVar, y.Q(o0VarE, R.string.lbl_syncing_device), false, null, null, null, null, null, false, y.Q(o0VarE, R.string.lbl_skip_sync_button), aVar2, false, null, null, false, false, null, lVar, null, null, z3.f.c(1789774302, new a1(f14, 5), o0VarE), o0Var, (i16 & 112) | 6 | (i16 & 896), 384 | ((i15 << 15) & 1879048192), 3072, 7858160);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i(str, aVar, f14, aVar2, lVar, i14, 0);
        }
    }
}
