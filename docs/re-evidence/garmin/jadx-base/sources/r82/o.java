package r82;

import ch.qos.logback.core.net.SyslogConstants;
import ds.e0;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:? A[RETURN, SYNTHETIC] */
    public static final void a(h4.r rVar, i53.c<Integer> cVar, i53.c<Integer> cVar2, boolean z14, e23.l<? super Integer, Unit> lVar, e23.l<? super Integer, Unit> lVar2, e23.l<? super Integer, Unit> lVar3, p3.m mVar, int i14, int i15) {
        boolean z15;
        int i16;
        boolean z16;
        i53.c<Integer> cVar3;
        e23.l<? super Integer, Unit> lVar4;
        e23.l<? super Integer, Unit> lVar5;
        e23.l<? super Integer, Unit> lVar6;
        boolean z17;
        i53.c<Integer> cVar4;
        p2 p2VarI0;
        i53.c<Integer> cVarH;
        Object objQ;
        p3.m.a.C2565a c2565a;
        Object objQ2;
        e23.l<? super Integer, Unit> lVar7;
        Object objQ3;
        e23.l<? super Integer, Unit> lVar8;
        i53.c<Integer> cVar5;
        e23.l<? super Integer, Unit> lVar9;
        ArrayList arrayList;
        o0 o0VarE = mVar.E(846901633);
        int i17 = i14 | SyslogConstants.LOG_LOCAL2;
        int i18 = i15 & 8;
        if (i18 == 0) {
            if ((i14 & 3072) == 0) {
                z15 = z14;
                i17 |= o0VarE.h(z15) ? 2048 : 1024;
            }
            i16 = i17 | 1794048;
            if ((599187 & i16) != 599186) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    i53.c<Integer> cVarH2 = e0.h(0, 23);
                    cVarH = e0.h(0, 59);
                    if (i18 != 0) {
                        z15 = false;
                    }
                    objQ = o0VarE.q();
                    p3.m.a aVar = p3.m.f135153a;
                    aVar.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new e(2);
                        o0VarE.K(objQ);
                    }
                    e23.l<? super Integer, Unit> lVar10 = (e23.l) objQ;
                    objQ2 = o0VarE.q();
                    aVar.getClass();
                    if (objQ2 == c2565a) {
                        objQ2 = new e(3);
                        o0VarE.K(objQ2);
                    }
                    lVar7 = (e23.l) objQ2;
                    objQ3 = o0VarE.q();
                    aVar.getClass();
                    if (objQ3 == c2565a) {
                        objQ3 = new e(4);
                        o0VarE.K(objQ3);
                    }
                    lVar8 = (e23.l) objQ3;
                    cVar5 = cVarH2;
                    lVar9 = lVar10;
                } else {
                    o0VarE.e();
                    cVar5 = cVar;
                    cVarH = cVar2;
                    lVar9 = lVar;
                    lVar7 = lVar2;
                    lVar8 = lVar3;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                arrayList = new ArrayList();
                if (z15) {
                    b.f151218a.getClass();
                    arrayList.add(new p(cVar5, 0, null, null, b.f151219b, 0.0f, false, false, null, null, lVar9, 1006, null));
                }
                b.f151218a.getClass();
                i53.c<Integer> cVar6 = cVarH;
                arrayList.add(new p(cVar6, 0, null, null, b.f151220c, 0.0f, false, false, null, null, lVar7, 1006, null));
                e23.l<? super Integer, Unit> lVar11 = lVar8;
                arrayList.add(new p(cVar6, 0, null, null, null, 0.0f, false, false, null, null, lVar11, 1022, null));
                k.c(rVar, i53.a.e(arrayList), o0VarE, 6, 0);
                lVar4 = lVar9;
                z17 = z15;
                lVar5 = lVar7;
                cVar3 = cVar5;
                cVar4 = cVar6;
                lVar6 = lVar11;
            } else {
                o0VarE.e();
                cVar3 = cVar;
                lVar4 = lVar;
                lVar5 = lVar2;
                lVar6 = lVar3;
                z17 = z15;
                cVar4 = cVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(rVar, cVar3, cVar4, z17, lVar4, lVar5, lVar6, i14, i15);
            }
        }
        i17 = i14 | 3216;
        z15 = z14;
        i16 = i17 | 1794048;
        if ((599187 & i16) != 599186) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                i53.c<Integer> cVarH3 = e0.h(0, 23);
                cVarH = e0.h(0, 59);
                if (i18 != 0) {
                    z15 = false;
                }
                objQ = o0VarE.q();
                p3.m.a aVar2 = p3.m.f135153a;
                aVar2.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new e(2);
                    o0VarE.K(objQ);
                }
                e23.l<? super Integer, Unit> lVar12 = (e23.l) objQ;
                objQ2 = o0VarE.q();
                aVar2.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new e(3);
                    o0VarE.K(objQ2);
                }
                lVar7 = (e23.l) objQ2;
                objQ3 = o0VarE.q();
                aVar2.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new e(4);
                    o0VarE.K(objQ3);
                }
                lVar8 = (e23.l) objQ3;
                cVar5 = cVarH3;
                lVar9 = lVar12;
            } else {
                i53.c<Integer> cVarH4 = e0.h(0, 23);
                cVarH = e0.h(0, 59);
                if (i18 != 0) {
                    z15 = false;
                }
                objQ = o0VarE.q();
                p3.m.a aVar3 = p3.m.f135153a;
                aVar3.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new e(2);
                    o0VarE.K(objQ);
                }
                e23.l<? super Integer, Unit> lVar13 = (e23.l) objQ;
                objQ2 = o0VarE.q();
                aVar3.getClass();
                if (objQ2 == c2565a) {
                    objQ2 = new e(3);
                    o0VarE.K(objQ2);
                }
                lVar7 = (e23.l) objQ2;
                objQ3 = o0VarE.q();
                aVar3.getClass();
                if (objQ3 == c2565a) {
                    objQ3 = new e(4);
                    o0VarE.K(objQ3);
                }
                lVar8 = (e23.l) objQ3;
                cVar5 = cVarH4;
                lVar9 = lVar13;
            }
            o0VarE.h0();
            x1 x1Var2 = p3.n.f135158a;
            arrayList = new ArrayList();
            if (z15) {
                b.f151218a.getClass();
                arrayList.add(new p(cVar5, 0, null, null, b.f151219b, 0.0f, false, false, null, null, lVar9, 1006, null));
            }
            b.f151218a.getClass();
            i53.c<Integer> cVar7 = cVarH;
            arrayList.add(new p(cVar7, 0, null, null, b.f151220c, 0.0f, false, false, null, null, lVar7, 1006, null));
            e23.l<? super Integer, Unit> lVar14 = lVar8;
            arrayList.add(new p(cVar7, 0, null, null, null, 0.0f, false, false, null, null, lVar14, 1022, null));
            k.c(rVar, i53.a.e(arrayList), o0VarE, 6, 0);
            lVar4 = lVar9;
            z17 = z15;
            lVar5 = lVar7;
            cVar3 = cVar5;
            cVar4 = cVar7;
            lVar6 = lVar14;
        } else {
            o0VarE.e();
            cVar3 = cVar;
            lVar4 = lVar;
            lVar5 = lVar2;
            lVar6 = lVar3;
            z17 = z15;
            cVar4 = cVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(rVar, cVar3, cVar4, z17, lVar4, lVar5, lVar6, i14, i15);
        }
    }
}
