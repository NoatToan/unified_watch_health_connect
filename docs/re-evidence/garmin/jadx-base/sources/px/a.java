package px;

import aa2.p;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b50.o;
import c2.x2;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import d92.b;
import g6.f;
import h4.r;
import ix.j;
import ix.l;
import java.util.List;
import jx.c;
import kx.d;
import kx.e;
import org.joda.time.Interval;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;
import wz1.i;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:102:0x0202  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x0100  */
    /* JADX WARN: Code duplicated, block: B:80:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x0178  */
    /* JADX WARN: Code duplicated, block: B:84:0x0192 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0194  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:92:0x01be  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01f5  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(r rVar, jx.a aVar, gt.a aVar2, j jVar, boolean z14, Interval interval, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        boolean z15;
        int i17;
        Interval interval2;
        int i18;
        boolean z16;
        boolean z17;
        o0 o0Var;
        r rVar3;
        boolean z18;
        Interval interval3;
        p2 p2VarI0;
        r rVar4;
        Context context;
        p1 p1VarC;
        List<c> list;
        Object objQ;
        m.a.C2565a c2565a;
        CustomCombinedChart customCombinedChart;
        Object objQ2;
        sz.a aVar3;
        boolean zR;
        Object objQ3;
        boolean zR2;
        Object objQ4;
        boolean zR3;
        Object objQ5;
        jVar.getClass();
        o0 o0VarE = mVar.E(-177551030);
        int i19 = i15 & 1;
        if (i19 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = (o0VarE.B(rVar2) ? 4 : 2) | i14;
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(aVar2) : o0VarE.r(aVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.r(jVar) ? 2048 : 1024;
        }
        int i24 = i15 & 16;
        if (i24 == 0) {
            if ((i14 & 24576) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 16384 : 8192;
            }
            i17 = i15 & 32;
            if (i17 != 0) {
                if ((196608 & i14) == 0) {
                    interval2 = interval;
                    if (o0VarE.r(interval2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                z16 = false;
                if ((74899 & i16) != 74898) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (o0VarE.n(i16 & 1, z17)) {
                    if (i19 != 0) {
                        rVar4 = r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i24 != 0) {
                        z15 = true;
                    }
                    if (i17 != 0) {
                        interval2 = null;
                    }
                    x1 x1Var = n.f135158a;
                    context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                    p1VarC = s9.c.c(jVar.f95628h, o0VarE);
                    list = ((l) p1VarC.getF182175a()).f95669i;
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new CustomCombinedChart(context);
                        o0VarE.K(objQ);
                    }
                    customCombinedChart = (CustomCombinedChart) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new sz.a(customCombinedChart, new kx.a(context), new e(customCombinedChart, z15), new kx.c(customCombinedChart, new o(z15, jVar, 10)), new d(customCombinedChart, ((l) p1VarC.getF182175a()).f95667g), null, 32, null);
                        o0VarE.K(objQ2);
                    }
                    aVar3 = (sz.a) objQ2;
                    r rVarF = x2.f(rVar4, 1.0f);
                    b.f58623a.getClass();
                    b.f58625c.getClass();
                    boolean z19 = z15;
                    f.a aVar4 = f.f75994b;
                    r rVarH = x2.h(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2), 330);
                    zR = o0VarE.r(jVar) | o0VarE.r(customCombinedChart);
                    objQ3 = o0VarE.q();
                    if (zR || objQ3 == c2565a) {
                        objQ3 = new p40.o0(15, jVar, customCombinedChart);
                        o0VarE.K(objQ3);
                    }
                    r rVarB = i.b(rVarH, (e23.a) objQ3, o0VarE);
                    zR2 = o0VarE.r(customCombinedChart);
                    objQ4 = o0VarE.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new hn1.j(customCombinedChart, 5);
                        o0VarE.K(objQ4);
                    }
                    e23.l lVar = (e23.l) objQ4;
                    boolean zR4 = o0VarE.r(aVar3) | o0VarE.r(list) | o0VarE.r(aVar);
                    if ((i16 & 896) != 256 || ((i16 & 512) != 0 && o0VarE.r(aVar2))) {
                        z16 = true;
                    }
                    zR3 = zR4 | z16 | o0VarE.r(interval2) | o0VarE.r(context);
                    objQ5 = o0VarE.q();
                    if (zR3 || objQ5 == c2565a) {
                        p pVar = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                        o0VarE.K(pVar);
                        objQ5 = pVar;
                    }
                    p002j6.c.b(lVar, rVarB, (e23.l) objQ5, o0VarE, 0, 0);
                    o0Var = o0VarE;
                    rVar3 = rVar4;
                    z18 = z19;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    z18 = z15;
                }
                interval3 = interval2;
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new d62.o(rVar3, aVar, aVar2, jVar, z18, interval3, i14, i15, 18);
                }
            }
            i16 |= 196608;
            interval2 = interval;
            z16 = false;
            if ((74899 & i16) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                if (i19 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                if (i17 != 0) {
                    interval2 = null;
                }
                x1 x1Var2 = n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                p1VarC = s9.c.c(jVar.f95628h, o0VarE);
                list = ((l) p1VarC.getF182175a()).f95669i;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomCombinedChart(context);
                    o0VarE.K(objQ);
                }
                customCombinedChart = (CustomCombinedChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new sz.a(customCombinedChart, new kx.a(context), new e(customCombinedChart, z15), new kx.c(customCombinedChart, new o(z15, jVar, 10)), new d(customCombinedChart, ((l) p1VarC.getF182175a()).f95667g), null, 32, null);
                    o0VarE.K(objQ2);
                }
                aVar3 = (sz.a) objQ2;
                r rVarF2 = x2.f(rVar4, 1.0f);
                b.f58623a.getClass();
                b.f58625c.getClass();
                boolean z110 = z15;
                f.a aVar5 = f.f75994b;
                r rVarH2 = x2.h(c2.l.A(rVarF2, j92.b.f97899b.f97920e, 0.0f, 2), 330);
                zR = o0VarE.r(jVar) | o0VarE.r(customCombinedChart);
                objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new p40.o0(15, jVar, customCombinedChart);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new p40.o0(15, jVar, customCombinedChart);
                    o0VarE.K(objQ3);
                }
                r rVarB2 = i.b(rVarH2, (e23.a) objQ3, o0VarE);
                zR2 = o0VarE.r(customCombinedChart);
                objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new hn1.j(customCombinedChart, 5);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new hn1.j(customCombinedChart, 5);
                    o0VarE.K(objQ4);
                }
                e23.l lVar2 = (e23.l) objQ4;
                boolean zR5 = o0VarE.r(aVar3) | o0VarE.r(list) | o0VarE.r(aVar);
                if ((i16 & 896) != 256) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                zR3 = zR5 | z16 | o0VarE.r(interval2) | o0VarE.r(context);
                objQ5 = o0VarE.q();
                if (zR3) {
                    p pVar2 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                    o0VarE.K(pVar2);
                    objQ5 = pVar2;
                } else {
                    p pVar3 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                    o0VarE.K(pVar3);
                    objQ5 = pVar3;
                }
                p002j6.c.b(lVar2, rVarB2, (e23.l) objQ5, o0VarE, 0, 0);
                o0Var = o0VarE;
                rVar3 = rVar4;
                z18 = z110;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                z18 = z15;
            }
            interval3 = interval2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(rVar3, aVar, aVar2, jVar, z18, interval3, i14, i15, 18);
            }
        }
        i16 |= 24576;
        z15 = z14;
        i17 = i15 & 32;
        if (i17 != 0) {
            if ((196608 & i14) == 0) {
                interval2 = interval;
                if (o0VarE.r(interval2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            z16 = false;
            if ((74899 & i16) != 74898) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i16 & 1, z17)) {
                if (i19 != 0) {
                    rVar4 = r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i24 != 0) {
                    z15 = true;
                }
                if (i17 != 0) {
                    interval2 = null;
                }
                x1 x1Var3 = n.f135158a;
                context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                p1VarC = s9.c.c(jVar.f95628h, o0VarE);
                list = ((l) p1VarC.getF182175a()).f95669i;
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new CustomCombinedChart(context);
                    o0VarE.K(objQ);
                }
                customCombinedChart = (CustomCombinedChart) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = new sz.a(customCombinedChart, new kx.a(context), new e(customCombinedChart, z15), new kx.c(customCombinedChart, new o(z15, jVar, 10)), new d(customCombinedChart, ((l) p1VarC.getF182175a()).f95667g), null, 32, null);
                    o0VarE.K(objQ2);
                }
                aVar3 = (sz.a) objQ2;
                r rVarF3 = x2.f(rVar4, 1.0f);
                b.f58623a.getClass();
                b.f58625c.getClass();
                boolean z111 = z15;
                f.a aVar6 = f.f75994b;
                r rVarH3 = x2.h(c2.l.A(rVarF3, j92.b.f97899b.f97920e, 0.0f, 2), 330);
                zR = o0VarE.r(jVar) | o0VarE.r(customCombinedChart);
                objQ3 = o0VarE.q();
                if (zR) {
                    objQ3 = new p40.o0(15, jVar, customCombinedChart);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new p40.o0(15, jVar, customCombinedChart);
                    o0VarE.K(objQ3);
                }
                r rVarB3 = i.b(rVarH3, (e23.a) objQ3, o0VarE);
                zR2 = o0VarE.r(customCombinedChart);
                objQ4 = o0VarE.q();
                if (zR2) {
                    objQ4 = new hn1.j(customCombinedChart, 5);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new hn1.j(customCombinedChart, 5);
                    o0VarE.K(objQ4);
                }
                e23.l lVar3 = (e23.l) objQ4;
                boolean zR6 = o0VarE.r(aVar3) | o0VarE.r(list) | o0VarE.r(aVar);
                if ((i16 & 896) != 256) {
                    z16 = true;
                } else {
                    z16 = true;
                }
                zR3 = zR6 | z16 | o0VarE.r(interval2) | o0VarE.r(context);
                objQ5 = o0VarE.q();
                if (zR3) {
                    p pVar4 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                    o0VarE.K(pVar4);
                    objQ5 = pVar4;
                } else {
                    p pVar5 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                    o0VarE.K(pVar5);
                    objQ5 = pVar5;
                }
                p002j6.c.b(lVar3, rVarB3, (e23.l) objQ5, o0VarE, 0, 0);
                o0Var = o0VarE;
                rVar3 = rVar4;
                z18 = z111;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                z18 = z15;
            }
            interval3 = interval2;
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new d62.o(rVar3, aVar, aVar2, jVar, z18, interval3, i14, i15, 18);
            }
        }
        i16 |= 196608;
        interval2 = interval;
        z16 = false;
        if ((74899 & i16) != 74898) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i16 & 1, z17)) {
            if (i19 != 0) {
                rVar4 = r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i24 != 0) {
                z15 = true;
            }
            if (i17 != 0) {
                interval2 = null;
            }
            x1 x1Var4 = n.f135158a;
            context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            p1VarC = s9.c.c(jVar.f95628h, o0VarE);
            list = ((l) p1VarC.getF182175a()).f95669i;
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new CustomCombinedChart(context);
                o0VarE.K(objQ);
            }
            customCombinedChart = (CustomCombinedChart) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new sz.a(customCombinedChart, new kx.a(context), new e(customCombinedChart, z15), new kx.c(customCombinedChart, new o(z15, jVar, 10)), new d(customCombinedChart, ((l) p1VarC.getF182175a()).f95667g), null, 32, null);
                o0VarE.K(objQ2);
            }
            aVar3 = (sz.a) objQ2;
            r rVarF4 = x2.f(rVar4, 1.0f);
            b.f58623a.getClass();
            b.f58625c.getClass();
            boolean z112 = z15;
            f.a aVar7 = f.f75994b;
            r rVarH4 = x2.h(c2.l.A(rVarF4, j92.b.f97899b.f97920e, 0.0f, 2), 330);
            zR = o0VarE.r(jVar) | o0VarE.r(customCombinedChart);
            objQ3 = o0VarE.q();
            if (zR) {
                objQ3 = new p40.o0(15, jVar, customCombinedChart);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new p40.o0(15, jVar, customCombinedChart);
                o0VarE.K(objQ3);
            }
            r rVarB4 = i.b(rVarH4, (e23.a) objQ3, o0VarE);
            zR2 = o0VarE.r(customCombinedChart);
            objQ4 = o0VarE.q();
            if (zR2) {
                objQ4 = new hn1.j(customCombinedChart, 5);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new hn1.j(customCombinedChart, 5);
                o0VarE.K(objQ4);
            }
            e23.l lVar4 = (e23.l) objQ4;
            boolean zR7 = o0VarE.r(aVar3) | o0VarE.r(list) | o0VarE.r(aVar);
            if ((i16 & 896) != 256) {
                z16 = true;
            } else {
                z16 = true;
            }
            zR3 = zR7 | z16 | o0VarE.r(interval2) | o0VarE.r(context);
            objQ5 = o0VarE.q();
            if (zR3) {
                p pVar6 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                o0VarE.K(pVar6);
                objQ5 = pVar6;
            } else {
                p pVar7 = new p(aVar3, list, aVar, aVar2, interval2, context, 22);
                o0VarE.K(pVar7);
                objQ5 = pVar7;
            }
            p002j6.c.b(lVar4, rVarB4, (e23.l) objQ5, o0VarE, 0, 0);
            o0Var = o0VarE;
            rVar3 = rVar4;
            z18 = z112;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            z18 = z15;
        }
        interval3 = interval2;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d62.o(rVar3, aVar, aVar2, jVar, z18, interval3, i14, i15, 18);
        }
    }
}
