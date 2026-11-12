package i3;

import ch.qos.logback.core.net.SyslogConstants;

/* JADX INFO: loaded from: classes.dex */
public final class u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.y3 f89886a;

    static {
        new p3.y3(new i01.j(19));
        f89886a = new p3.y3(new i01.j(20));
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    public static final void a(j2 j2Var, j9 j9Var, ec ecVar, rj rjVar, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(904511636);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(j2Var) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(j9Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(ecVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(rjVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(pVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            gb gbVarA = fb.a(0.0f, 7, 0L, false);
            long j8 = j2Var.f88471a;
            boolean zL = o0VarE.l(j8);
            Object objQ = o0VarE.q();
            if (zL) {
                z2.t2 t2Var = new z2.t2(j8, o4.d0.c(0.4f, j8, 14), null);
                o0VarE.K(t2Var);
                objQ = t2Var;
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    z2.t2 t2Var2 = new z2.t2(j8, o4.d0.c(0.4f, j8, 14), null);
                    o0VarE.K(t2Var2);
                    objQ = t2Var2;
                }
            }
            p3.v.b(new p3.n2[]{k2.f88658a.c(j2Var), f89886a.c(j9Var), u1.b1.f167410a.c(gbVarA), fc.f88102a.c(ecVar), z2.u2.f201804a.c((z2.t2) objQ), sj.f89711a.c(rjVar)}, z3.f.c(-1750539308, new t7(rjVar, pVar), o0VarE), o0VarE, 56);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(j2Var, j9Var, ecVar, rjVar, pVar, i14, 26);
        }
    }

    public static final void b(j2 j2Var, ec ecVar, rj rjVar, e23.p pVar, p3.m mVar, int i14) {
        ec ecVar2;
        rj rjVar2;
        int i15;
        rj rjVarC;
        ec ecVar3;
        p3.o0 o0VarE = mVar.E(-449719819);
        int i16 = i14 | (o0VarE.B(j2Var) ? 4 : 2) | SyslogConstants.LOG_LOCAL2 | (o0VarE.r(pVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                s7 s7Var = s7.f89624a;
                s7Var.getClass();
                ec ecVarB = s7.b(o0VarE);
                s7Var.getClass();
                i15 = i16 & (-1009);
                rjVarC = s7.c(o0VarE);
                ecVar3 = ecVarB;
            } else {
                o0VarE.e();
                i15 = i16 & (-1009);
                ecVar3 = ecVar;
                rjVarC = rjVar;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            s7.f89624a.getClass();
            a(j2Var, (j9) o0VarE.A(f89886a), ecVar3, rjVarC, pVar, o0VarE, (i15 & 14) | ((i15 << 3) & 57344));
            ecVar2 = ecVar3;
            rjVar2 = rjVarC;
        } else {
            o0VarE.e();
            ecVar2 = ecVar;
            rjVar2 = rjVar;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g52.d(j2Var, ecVar2, rjVar2, pVar, i14, 21);
        }
    }
}
