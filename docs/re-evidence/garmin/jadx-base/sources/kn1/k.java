package kn1;

import am.l1;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import g02.q0;
import gl1.y;
import h4.r;
import h5.e0;
import java.util.Locale;
import kb0.p;
import kd0.h6;
import km1.v;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import r1.c0;
import r1.u0;
import w2.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f105676a;

        static {
            int[] iArr = new int[mn1.b.values().length];
            try {
                iArr[mn1.b.f119758b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mn1.b.f119759c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[mn1.b.f119760d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[mn1.b.f119761e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[mn1.b.f119762f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[mn1.b.f119763g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[mn1.b.f119764h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[mn1.b.f119765i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f105676a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public static final void a(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(546112401);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            String strC = new oi0.h((Context) o0VarE.A(y3Var)).c(k(cVar.h0()), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strC);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119763g.f119768a);
            String strA = cVar2.a(k(cVar.h0()));
            String strC2 = dVar.c(cVar.G());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 23);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 23);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, strA, strC2, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    public static final void b(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(598605357);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            int iH0 = (int) (((double) cVar.h0()) * 60.0d);
            Context context = (Context) o0VarE.A(y3Var);
            Integer restlessMomentsCount = cVar.getRestlessMomentsCount();
            context.getClass();
            Object[] objArr = {new oi0.h(context).c(iH0, true), cVar2.b(restlessMomentsCount)};
            l22.b bVar = cVar2.f119769a;
            String strA = bVar.a(R.string.string_space_bullet_string_pattern, objArr);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strA);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119765i.f119768a);
            String strA2 = bVar.a(R.string.string_space_bullet_string_pattern, cVar2.a(iH0), cVar2.b(cVar.getRestlessMomentsCount()));
            String strC = dVar.c(cVar.c0());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 22);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 22);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, strA2, strC, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public static final void c(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1762197598);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            String strC = new oi0.h((Context) o0VarE.A(y3Var)).c(k(cVar.i0()), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strC);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119760d.f119768a);
            String strA = cVar2.a(k(cVar.i0()));
            String strC2 = dVar.c(cVar.H());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 17);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 17);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, strA, strC2, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    public static final void d(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1693557254);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            String strC = new oi0.h((Context) o0VarE.A(y3Var)).c(k(cVar.n0()), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strC);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119758b.f119768a);
            v dailySleep = cVar.getDailySleep();
            String strD = dVar.d(dailySleep != null ? Integer.valueOf(dailySleep.getSleepTimeSeconds()) : null);
            String strC2 = dVar.c(cVar.I());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 20);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 20);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, strD, strC2, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public static final void e(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        o0 o0VarE = mVar.E(148359712);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            String strC = new oi0.h((Context) o0VarE.A(y3Var)).c(k(cVar.j0()), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strC);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119761e.f119768a);
            String strA = cVar2.a(k(cVar.j0()));
            String strC2 = dVar.c(cVar.M());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 18);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 18);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i17 = b92.a.f16960b;
            i16 = 2;
            l72.l.e(strQ, strA, strC2, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            i16 = 2;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:95:0x0186  */
    public static final void f(mn1.b bVar, km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        boolean z14;
        o0 o0VarE = mVar.E(-650038660);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(bVar.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = a.f105676a[bVar.ordinal()];
            p3.m.a aVar2 = p3.m.f135153a;
            switch (i16) {
                case 1:
                    o0VarE.C(-1916889075);
                    z14 = (i15 & 896) == 256;
                    Object objQ = o0VarE.q();
                    if (z14) {
                        objQ = new p(aVar, 25);
                        o0VarE.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new p(aVar, 25);
                            o0VarE.K(objQ);
                        }
                    }
                    d(cVar, (e23.a) objQ, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 2:
                    o0VarE.C(-1916886229);
                    z14 = (i15 & 896) == 256;
                    Object objQ2 = o0VarE.q();
                    if (z14) {
                        objQ2 = new p(aVar, 26);
                        o0VarE.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new p(aVar, 26);
                            o0VarE.K(objQ2);
                        }
                    }
                    i(cVar, (e23.a) objQ2, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 3:
                    o0VarE.C(-1916883511);
                    z14 = (i15 & 896) == 256;
                    Object objQ3 = o0VarE.q();
                    if (z14) {
                        objQ3 = new p(aVar, 27);
                        o0VarE.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new p(aVar, 27);
                            o0VarE.K(objQ3);
                        }
                    }
                    c(cVar, (e23.a) objQ3, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 4:
                    o0VarE.C(-1916880822);
                    z14 = (i15 & 896) == 256;
                    Object objQ4 = o0VarE.q();
                    if (z14) {
                        objQ4 = new p(aVar, 28);
                        o0VarE.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new p(aVar, 28);
                            o0VarE.K(objQ4);
                        }
                    }
                    e(cVar, (e23.a) objQ4, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 5:
                    o0VarE.C(-1916878168);
                    z14 = (i15 & 896) == 256;
                    Object objQ5 = o0VarE.q();
                    if (z14) {
                        objQ5 = new p(aVar, 29);
                        o0VarE.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new p(aVar, 29);
                            o0VarE.K(objQ5);
                        }
                    }
                    g(cVar, (e23.a) objQ5, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 6:
                    o0VarE.C(-1916875510);
                    z14 = (i15 & 896) == 256;
                    Object objQ6 = o0VarE.q();
                    if (z14) {
                        objQ6 = new p(aVar, 14);
                        o0VarE.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new p(aVar, 14);
                            o0VarE.K(objQ6);
                        }
                    }
                    a(cVar, (e23.a) objQ6, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 7:
                    o0VarE.C(-1916872559);
                    z14 = (i15 & 896) == 256;
                    Object objQ7 = o0VarE.q();
                    if (z14) {
                        objQ7 = new p(aVar, 15);
                        o0VarE.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new p(aVar, 15);
                            o0VarE.K(objQ7);
                        }
                    }
                    h(cVar, (e23.a) objQ7, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                case 8:
                    o0VarE.C(-1916869194);
                    z14 = (i15 & 896) == 256;
                    Object objQ8 = o0VarE.q();
                    if (z14) {
                        objQ8 = new p(aVar, 16);
                        o0VarE.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new p(aVar, 16);
                            o0VarE.K(objQ8);
                        }
                    }
                    b(cVar, (e23.a) objQ8, o0VarE, ((i15 >> 3) & 14) | km1.c.B);
                    o0VarE.g0(false);
                    break;
                default:
                    throw kg.f.h(o0VarE, -1916890330, false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h6(bVar, cVar, aVar, i14, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
    public static final void g(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(890423324);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
            b10.d dVar = new b10.d((Context) o0VarE.A(y3Var));
            String strC = new oi0.h((Context) o0VarE.A(y3Var)).c(k(cVar.k0()), false);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strC);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119762f.f119768a);
            String strA = cVar2.a(k(cVar.k0()));
            String strC2 = dVar.c(cVar.a0());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 24);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 24);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, strA, strC2, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    public static final void h(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-188285878);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            b10.d dVar = new b10.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            String strQ = y.Q(o0VarE, mn1.b.f119764h.f119768a);
            String strB = cVar2.b(cVar.getRestlessMomentsCount());
            String strC = dVar.c(cVar.c0());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 19);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 19);
                    o0VarE.K(objQ);
                }
            }
            l72.l.e(strQ, strB, strC, null, null, null, rVarC, null, false, (e23.a) objQ, o0VarE, 1572864, 440);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x011f  */
    public static final void i(km1.c cVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        String string;
        o0 o0VarE = mVar.E(-2125762342);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            mn1.c cVar2 = new mn1.c(a0.s(o0VarE));
            b10.d dVar = new b10.d((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            v dailySleep = cVar.getDailySleep();
            Double avgSleepStress = dailySleep != null ? dailySleep.getAvgSleepStress() : null;
            l22.b bVar = cVar2.f119769a;
            String strA = (avgSleepStress == null || avgSleepStress.doubleValue() <= 0.0d) ? bVar.a(R.string.lbl_average_value, bVar.getString(R.string.txt_empty_page_no_data)) : bVar.a(R.string.lbl_average_value, String.valueOf((int) avgSleepStress.doubleValue()));
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("label_secondary", strA);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarE, mn1.b.f119759c.f119768a);
            if (avgSleepStress == null || avgSleepStress.doubleValue() <= 0) {
                string = bVar.getString(R.string.no_value_card);
            } else {
                string = bVar.a(R.string.lbl_value_avg, String.valueOf((int) avgSleepStress.doubleValue())).toLowerCase(Locale.ROOT);
                string.getClass();
            }
            String strC = dVar.c(cVar.e0());
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarC = c2.l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13);
            boolean z14 = (i15 & 112) == 32;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p(aVar, 21);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p(aVar, 21);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            int i16 = b92.a.f16960b;
            l72.l.e(strQ, string, strC, null, null, null, rVarC, aVarB, false, aVar3, o0VarE, 1572864, 312);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fn1.d(cVar, aVar, i14, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(r rVar, km1.c cVar, c cVar2, e23.p pVar, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        rVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(239338867);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(pVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            l72.p2 p2Var = l72.p2.f111205a;
            String strQ = y.Q(o0VarE, R.string.lbl_sleep_score_factors);
            z3.e eVarC = z3.f.c(1048029300, new l1(p1Var, 21, (byte) 0), o0VarE);
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new k11.h(13, cVar2, p1Var);
                o0VarE.K(objQ2);
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ2, o0VarE, 24576, 238);
            c0.c(b0Var, ((Boolean) p1Var.getF182175a()).booleanValue(), null, u0.d(null, 3).b(u0.c(null, null, 15)), u0.j(null, null, 15).b(u0.e(null, 3)), null, z3.f.c(851076033, new hv0.d(16, cVar, pVar), o0VarE), o0VarE, 1600518, 18);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(rVar, cVar, cVar2, pVar, i14, 17);
        }
    }

    public static final int k(int i14) {
        return (int) Math.floor(((double) i14) * 60.0d);
    }
}
