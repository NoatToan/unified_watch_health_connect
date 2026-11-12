package r82;

import c2.q0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import ds.e0;
import i3.e5;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import o72.h3;
import org.joda.time.DateTimeConstants;
import p005kotlin.Unit;
import p13.h0;
import p13.w;
import p13.y;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    public static final void a(h4.r rVar, List list, Calendar calendar, e23.l lVar, Calendar calendar2, Calendar calendar3, p3.m mVar, int i14) {
        h4.r rVar2;
        i53.c cVar;
        p3.m.a.C2565a c2565a;
        i53.c cVar2;
        o0 o0VarE = mVar.E(261863954);
        int i15 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(calendar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.r(calendar2) ? 16384 : 8192) | (o0VarE.r(calendar3) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (list.size() != 12) {
                vb.h.s("Failed requirement.");
                return;
            }
            if (calendar2.compareTo(calendar3) > 0) {
                vb.h.s("Failed requirement.");
                return;
            }
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                Object objClone = calendar.clone();
                objClone.getClass();
                objQ = (Calendar) objClone;
                lVar.invoke(objQ);
                o0VarE.K(objQ);
            }
            Calendar calendar4 = (Calendar) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a2) {
                objQ2 = p0.n(c(calendar2, calendar3, calendar.get(1)));
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a2) {
                objQ3 = p0.n(b(calendar2, calendar3, calendar.get(1), calendar.get(2)));
                o0VarE.K(objQ3);
            }
            p1 p1Var2 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a2) {
                objQ4 = i53.a.e(new j23.l(calendar2.get(1), calendar3.get(1)));
                o0VarE.K(objQ4);
            }
            i53.c cVar3 = (i53.c) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = e5.o(l(calendar.get(2), (List) p1Var.getF182175a()), o0VarE);
            }
            n1 n1Var = (n1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a2) {
                objQ6 = e5.o(l(calendar.get(5), (List) p1Var2.getF182175a()), o0VarE);
            }
            n1 n1Var2 = (n1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a2) {
                objQ7 = e5.o(l(calendar.get(1), cVar3), o0VarE);
            }
            n1 n1Var3 = (n1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a2) {
                c2565a = c2565a2;
                f fVar = new f(n1Var, cVar3, calendar4, lVar, n1Var3, calendar2, calendar3, p1Var, p1Var2, n1Var2);
                cVar = cVar3;
                o0VarE.K(fVar);
                objQ8 = fVar;
            } else {
                cVar = cVar3;
                c2565a = c2565a2;
            }
            e23.l lVar2 = (e23.l) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                cVar2 = cVar;
                objQ9 = new f(n1Var2, cVar2, calendar4, lVar, n1Var3, calendar2, calendar3, p1Var, n1Var, p1Var2);
                n1Var2 = n1Var2;
                n1Var = n1Var;
                p1Var2 = p1Var2;
                o0VarE.K(objQ9);
            } else {
                cVar2 = cVar;
            }
            e23.l lVar3 = (e23.l) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                n1 n1Var4 = n1Var;
                objQ10 = new f(n1Var3, cVar2, calendar4, lVar, calendar2, calendar3, p1Var, n1Var4, p1Var2, n1Var2);
                n1Var3 = n1Var3;
                n1Var = n1Var4;
                p1Var = p1Var;
                o0VarE.K(objQ10);
            }
            e23.l lVar4 = (e23.l) objQ10;
            List list2 = (List) p1Var.getF182175a();
            ArrayList arrayList = new ArrayList(y.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add((String) list.get(((Number) it.next()).intValue()));
            }
            i53.c cVarE = i53.a.e(arrayList);
            int intValue = n1Var.getIntValue();
            a.f151212a.getClass();
            i53.c cVar4 = cVar2;
            rVar2 = rVar;
            k.c(rVar2, i53.a.a(new p(cVarE, intValue, null, null, a.f151213b, 0.0f, false, false, null, null, lVar2, 1004, null), new p(i53.a.e((List) p1Var2.getF182175a()), n1Var2.getIntValue(), null, null, a.f151214c, 0.0f, false, false, null, null, lVar3, 1004, null), new p(cVar4, n1Var3.getIntValue(), null, null, null, 0.0f, false, false, null, null, lVar4, 1020, null)), o0VarE, 6, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new oy0.b(rVar2, list, calendar, lVar, calendar2, calendar3, i14, 12);
        }
    }

    public static final List<Integer> b(Calendar calendar, Calendar calendar2, int i14, int i15) {
        int actualMaximum;
        int i16 = (i14 == calendar.get(1) && i15 == calendar.get(2)) ? calendar.get(5) : 1;
        if (i14 == calendar2.get(1) && i15 == calendar2.get(2)) {
            actualMaximum = calendar2.get(5);
        } else {
            Calendar calendar3 = Calendar.getInstance();
            calendar3.set(i14, i15, 1);
            actualMaximum = calendar3.getActualMaximum(5);
        }
        return h0.b1(new j23.l(i16, actualMaximum));
    }

    public static final List<Integer> c(Calendar calendar, Calendar calendar2, int i14) {
        return h0.b1(new j23.l(i14 == calendar.get(1) ? calendar.get(2) : 0, i14 == calendar2.get(1) ? calendar2.get(2) : 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(n1 n1Var, i53.c cVar, Calendar calendar, e23.l lVar, Calendar calendar2, Calendar calendar3, p1 p1Var, n1 n1Var2, p1 p1Var2, n1 n1Var3) {
        p1Var.setValue(c(calendar2, calendar3, ((Number) cVar.get(n1Var.getIntValue())).intValue()));
        n1Var2.t(j23.t.e(n1Var2.getIntValue(), 0, ((List) p1Var.getF182175a()).size() - 1));
        p1Var2.setValue(b(calendar2, calendar3, ((Number) cVar.get(n1Var.getIntValue())).intValue(), ((Number) ((List) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue()));
        n1Var3.t(j23.t.e(n1Var3.getIntValue(), 0, ((List) p1Var2.getF182175a()).size() - 1));
        int iIntValue = ((Number) ((List) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue();
        int iIntValue2 = ((Number) ((List) p1Var2.getF182175a()).get(n1Var3.getIntValue())).intValue();
        int iIntValue3 = ((Number) cVar.get(n1Var.getIntValue())).intValue();
        if (iIntValue3 == calendar.get(1) && iIntValue == calendar.get(2) && iIntValue2 == calendar.get(5)) {
            return;
        }
        calendar.set(iIntValue3, iIntValue, iIntValue2);
        lVar.invoke(calendar);
    }

    public static final void e(h4.r rVar, i53.c cVar, i53.c cVar2, int i14, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i15) {
        h4.r rVar2;
        i53.c cVar3;
        e23.l lVar4;
        e23.l lVar5;
        e23.l lVar6;
        cVar2.getClass();
        o0 o0VarE = mVar.E(-1205311508);
        int i16 = i15 | 48 | (o0VarE.B(cVar2) ? 256 : 128) | (o0VarE.k(i14) ? 2048 : 1024) | 1794048;
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            i53.f fVarA = i53.a.a("AM", "PM");
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new qv1.l(28);
                o0VarE.K(objQ);
            }
            e23.l lVar7 = (e23.l) objQ;
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            if (objQ2 == c2565a) {
                objQ2 = new qv1.l(29);
                o0VarE.K(objQ2);
            }
            e23.l lVar8 = (e23.l) objQ2;
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            if (objQ3 == c2565a) {
                objQ3 = new e(0);
                o0VarE.K(objQ3);
            }
            e23.l lVar9 = (e23.l) objQ3;
            x1 x1Var = p3.n.f135158a;
            i53.c cVarH = e0.h(0, 23);
            i53.c cVarH2 = e0.h(0, 59);
            a.f151212a.getClass();
            rVar2 = rVar;
            k.c(rVar2, i53.a.a(new p(cVar2, i14, null, null, a.f151215d, 0.0f, false, false, null, null, lVar7, 1004, null), new p(cVarH, 0, null, null, a.f151216e, 0.0f, false, false, null, null, lVar8, 1006, null), new p(cVarH2, 0, null, null, a.f151217f, 0.0f, false, false, null, null, lVar9, 1006, null), new p(fVarA, 0, null, null, null, 0.0f, false, false, null, null, lVar9, 1022, null)), o0VarE, 6, 0);
            lVar4 = lVar7;
            cVar3 = fVarA;
            lVar6 = lVar9;
            lVar5 = lVar8;
        } else {
            rVar2 = rVar;
            o0VarE.e();
            cVar3 = cVar;
            lVar4 = lVar;
            lVar5 = lVar2;
            lVar6 = lVar3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q32.b(rVar2, cVar3, cVar2, i14, lVar4, lVar5, lVar6, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0192  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ba A[PHI: r16
      0x01ba: PHI (r16v7 p3.p1) = (r16v2 p3.p1), (r16v9 p3.p1) binds: [B:114:0x01b8, B:112:0x01b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:116:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:132:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:135:0x024f  */
    /* JADX WARN: Code duplicated, block: B:136:0x0251  */
    /* JADX WARN: Code duplicated, block: B:139:0x0272  */
    /* JADX WARN: Code duplicated, block: B:140:0x0274  */
    /* JADX WARN: Code duplicated, block: B:143:0x027f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0281  */
    /* JADX WARN: Code duplicated, block: B:149:0x030a  */
    /* JADX WARN: Code duplicated, block: B:150:0x030c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0321  */
    /* JADX WARN: Code duplicated, block: B:154:0x0323  */
    /* JADX WARN: Code duplicated, block: B:157:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:158:0x032d  */
    /* JADX WARN: Code duplicated, block: B:161:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:166:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:169:0x03d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x03d6  */
    public static final void f(h4.r rVar, String str, String str2, String str3, int i14, int i15, int i16, e23.l lVar, p3.m mVar, int i17) {
        int i18;
        h4.r rVar2;
        String str4;
        Object objN;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z14;
        Object objQ;
        n1 n1Var;
        p1 p1Var;
        boolean z15;
        Object objQ2;
        n1 n1Var2;
        boolean z16;
        Object objQ3;
        n1 n1Var3;
        int i29;
        boolean z17;
        int i30;
        int i34;
        boolean z18;
        boolean z19;
        Object objQ4;
        p1 p1Var2;
        p1 p1Var3;
        boolean z24;
        boolean z25;
        boolean z26;
        Object objQ5;
        boolean z27;
        boolean z28;
        boolean z29;
        Object objQ6;
        o0 o0VarE = mVar.E(-514505093);
        if ((i17 & 6) == 0) {
            i18 = (o0VarE.B(rVar) ? 4 : 2) | i17;
        } else {
            i18 = i17;
        }
        if ((i17 & 48) == 0) {
            i18 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i17 & 384) == 0) {
            i18 |= o0VarE.B(str2) ? 256 : 128;
        }
        if ((i17 & 3072) == 0) {
            i18 |= o0VarE.B(str3) ? 2048 : 1024;
        }
        if ((i17 & 24576) == 0) {
            i18 |= o0VarE.k(i14) ? 16384 : 8192;
        }
        if ((196608 & i17) == 0) {
            i18 |= o0VarE.k(i15) ? 131072 : 65536;
        }
        if ((i17 & 1572864) == 0) {
            i18 |= o0VarE.k(i16) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i17) == 0) {
            i18 |= o0VarE.h(true) ? 8388608 : 4194304;
        }
        if ((100663296 & i17) == 0) {
            i18 |= o0VarE.r(lVar) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i18 & 1, (i18 & 38347923) != 38347922)) {
            o0VarE.G0();
            if ((i17 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            if (i14 > i15 || i14 > i16 || i16 > i15) {
                vb.h.s("Failed requirement.");
                return;
            }
            int i35 = i14 / DateTimeConstants.SECONDS_PER_HOUR;
            int i36 = (i14 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            int i37 = i14 % 60;
            int i38 = i15 / DateTimeConstants.SECONDS_PER_HOUR;
            int i39 = (i15 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
            int i44 = i15 % 60;
            Object objQ7 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ7 == c2565a) {
                objQ7 = p0.n(i53.a.e(new j23.l(i35, i38)));
                o0VarE.K(objQ7);
            }
            p1 p1Var4 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(i(i38, i35, i36, i39, i16 / DateTimeConstants.SECONDS_PER_HOUR));
                o0VarE.K(objQ8);
            }
            p1 p1Var5 = (p1) objQ8;
            int i45 = i18;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                i53.c cVarJ = j(i38, i35, i39, i36, i44, i37, i16 / DateTimeConstants.SECONDS_PER_HOUR, (i16 % DateTimeConstants.SECONDS_PER_HOUR) / 60);
                i25 = i38;
                i26 = i35;
                i24 = i44;
                i27 = i37;
                i19 = i39;
                objN = p0.n(cVarJ);
                o0VarE.K(objN);
            } else {
                objN = objQ9;
                i19 = i39;
                i24 = i44;
                i25 = i38;
                i26 = i35;
                i27 = i37;
            }
            p1 p1Var6 = (p1) objN;
            Object[] objArr = new Object[0];
            int i46 = (i45 & 3670016) ^ 1572864;
            if (i46 <= 1048576 || !o0VarE.k(i16)) {
                i28 = i27;
                if ((i45 & 1572864) != 1048576) {
                    z14 = false;
                }
                objQ = o0VarE.q();
                if (z14 || objQ == c2565a) {
                    objQ = new db0.a(i16, p1Var4, 3);
                    o0VarE.K(objQ);
                }
                n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
                Object[] objArr2 = new Object[0];
                if (i46 > 1048576 || !o0VarE.k(i16)) {
                    p1Var = p1Var4;
                    if ((i45 & 1572864) != 1048576) {
                        z15 = false;
                    }
                    objQ2 = o0VarE.q();
                    if (z15 || objQ2 == c2565a) {
                        objQ2 = new db0.a(i16, p1Var5, 4);
                        o0VarE.K(objQ2);
                    }
                    n1Var2 = (n1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
                    Object[] objArr3 = new Object[0];
                    z16 = (i46 <= 1048576 && o0VarE.k(i16)) || (i45 & 1572864) == 1048576;
                    objQ3 = o0VarE.q();
                    if (z16 || objQ3 == c2565a) {
                        objQ3 = new db0.a(i16, p1Var6, 5);
                        o0VarE.K(objQ3);
                    }
                    n1Var3 = (n1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 0);
                    o0VarE.C(-518054068);
                    q13.b bVarB = w.b();
                    i53.c cVar = (i53.c) p1Var.getF182175a();
                    int intValue = n1Var.getIntValue();
                    z3.e eVarC = z3.f.c(-1765623251, new h3(str, 9), o0VarE);
                    boolean zB = o0VarE.B(n1Var) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var2);
                    i29 = i45 & 29360128;
                    if (i29 == 8388608) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean zK = z17 | zB | o0VarE.k(i24);
                    i30 = i28;
                    boolean zK2 = zK | o0VarE.k(i30) | o0VarE.B(n1Var3);
                    i34 = i45 & 234881024;
                    if (i34 == 67108864) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zK2 | z18;
                    objQ4 = o0VarE.q();
                    if (!z19 || objQ4 == c2565a) {
                        p1Var2 = p1Var;
                        p1Var3 = p1Var6;
                        objQ4 = new d(n1Var, lVar, p1Var5, p1Var3, p1Var2, i25, i26, i36, i19, n1Var2, i24, i30, n1Var3);
                        o0VarE.K(objQ4);
                    } else {
                        p1Var3 = p1Var6;
                        p1Var2 = p1Var;
                    }
                    bVarB.add(new p(cVar, intValue, null, null, eVarC, 0.0f, false, false, null, null, (e23.l) objQ4, 1004, null));
                    i53.c cVar2 = (i53.c) p1Var5.getF182175a();
                    int intValue2 = n1Var2.getIntValue();
                    z3.e eVarC2 = z3.f.c(-1608448106, new h3(str2, 10), o0VarE);
                    boolean zB2 = o0VarE.B(n1Var2) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var);
                    if (i29 == 8388608) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    boolean zK3 = zB2 | z24 | o0VarE.k(i24) | o0VarE.k(i30) | o0VarE.B(r29);
                    if (i34 == 67108864) {
                        z25 = true;
                    } else {
                        z25 = false;
                    }
                    z26 = zK3 | z25;
                    objQ5 = o0VarE.q();
                    if (z26 || objQ5 == c2565a) {
                        objQ5 = new d(n1Var2, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, i24, i30, (n1) r29);
                        o0VarE.K(objQ5);
                    }
                    bVarB.add(new p(cVar2, intValue2, null, null, eVarC2, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                    o0VarE.C(84340150);
                    i53.c cVar3 = (i53.c) p1Var3.getF182175a();
                    int intValue3 = r29.getIntValue();
                    str4 = str3;
                    z3.e eVarC3 = z3.f.c(1218300146, new h3(str4, 11), o0VarE);
                    boolean zB3 = o0VarE.B(r29) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var) | o0VarE.B(n1Var2);
                    if (i29 == 8388608) {
                        z27 = true;
                    } else {
                        z27 = false;
                    }
                    boolean zK4 = zB3 | z27 | o0VarE.k(i24) | o0VarE.k(i30);
                    if (i34 == 67108864) {
                        z28 = true;
                    } else {
                        z28 = false;
                    }
                    z29 = zK4 | z28;
                    objQ6 = o0VarE.q();
                    if (z29 || objQ6 == c2565a) {
                        objQ6 = new d(n1Var3, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, n1Var2, i24, i30);
                        o0VarE.K(objQ6);
                    }
                    bVarB.add(new p(cVar3, intValue3, null, null, eVarC3, 0.0f, false, false, null, null, (e23.l) objQ6, 1004, null));
                    o0VarE.g0(false);
                    q13.b bVarA = w.a(bVarB);
                    o0VarE.g0(false);
                    rVar2 = rVar;
                    k.c(rVar2, i53.a.j(bVarA), o0VarE, i45 & 14, 0);
                } else {
                    p1Var = p1Var4;
                }
                z15 = true;
                objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new db0.a(i16, p1Var5, 4);
                    o0VarE.K(objQ2);
                } else {
                    objQ2 = new db0.a(i16, p1Var5, 4);
                    o0VarE.K(objQ2);
                }
                n1Var2 = (n1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
                Object[] objArr4 = new Object[0];
                if (i46 <= 1048576) {
                }
                objQ3 = o0VarE.q();
                if (z16) {
                    objQ3 = new db0.a(i16, p1Var6, 5);
                    o0VarE.K(objQ3);
                } else {
                    objQ3 = new db0.a(i16, p1Var6, 5);
                    o0VarE.K(objQ3);
                }
                n1Var3 = (n1) d4.a.e(objArr4, (e23.a) objQ3, o0VarE, 0);
                o0VarE.C(-518054068);
                q13.b bVarB2 = w.b();
                i53.c cVar4 = (i53.c) p1Var.getF182175a();
                int intValue4 = n1Var.getIntValue();
                z3.e eVarC4 = z3.f.c(-1765623251, new h3(str, 9), o0VarE);
                boolean zB4 = o0VarE.B(n1Var) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var2);
                i29 = i45 & 29360128;
                if (i29 == 8388608) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean zK5 = z17 | zB4 | o0VarE.k(i24);
                i30 = i28;
                boolean zK6 = zK5 | o0VarE.k(i30) | o0VarE.B(n1Var3);
                i34 = i45 & 234881024;
                if (i34 == 67108864) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zK6 | z18;
                objQ4 = o0VarE.q();
                if (z19) {
                    p1Var2 = p1Var;
                    p1Var3 = p1Var6;
                    objQ4 = new d(n1Var, lVar, p1Var5, p1Var3, p1Var2, i25, i26, i36, i19, n1Var2, i24, i30, n1Var3);
                    o0VarE.K(objQ4);
                } else {
                    p1Var2 = p1Var;
                    p1Var3 = p1Var6;
                    objQ4 = new d(n1Var, lVar, p1Var5, p1Var3, p1Var2, i25, i26, i36, i19, n1Var2, i24, i30, n1Var3);
                    o0VarE.K(objQ4);
                }
                bVarB2.add(new p(cVar4, intValue4, null, null, eVarC4, 0.0f, false, false, null, null, (e23.l) objQ4, 1004, null));
                i53.c cVar5 = (i53.c) p1Var5.getF182175a();
                int intValue5 = n1Var2.getIntValue();
                z3.e eVarC5 = z3.f.c(-1608448106, new h3(str2, 10), o0VarE);
                boolean zB5 = o0VarE.B(n1Var2) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var);
                if (i29 == 8388608) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                boolean zK7 = zB5 | z24 | o0VarE.k(i24) | o0VarE.k(i30) | o0VarE.B(r29);
                if (i34 == 67108864) {
                    z25 = true;
                } else {
                    z25 = false;
                }
                z26 = zK7 | z25;
                objQ5 = o0VarE.q();
                if (z26) {
                    objQ5 = new d(n1Var2, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, i24, i30, (n1) r29);
                    o0VarE.K(objQ5);
                } else {
                    objQ5 = new d(n1Var2, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, i24, i30, (n1) r29);
                    o0VarE.K(objQ5);
                }
                bVarB2.add(new p(cVar5, intValue5, null, null, eVarC5, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
                o0VarE.C(84340150);
                i53.c cVar6 = (i53.c) p1Var3.getF182175a();
                int intValue6 = r29.getIntValue();
                str4 = str3;
                z3.e eVarC6 = z3.f.c(1218300146, new h3(str4, 11), o0VarE);
                boolean zB6 = o0VarE.B(r29) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var) | o0VarE.B(n1Var2);
                if (i29 == 8388608) {
                    z27 = true;
                } else {
                    z27 = false;
                }
                boolean zK8 = zB6 | z27 | o0VarE.k(i24) | o0VarE.k(i30);
                if (i34 == 67108864) {
                    z28 = true;
                } else {
                    z28 = false;
                }
                z29 = zK8 | z28;
                objQ6 = o0VarE.q();
                if (z29) {
                    objQ6 = new d(n1Var3, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, n1Var2, i24, i30);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new d(n1Var3, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, n1Var2, i24, i30);
                    o0VarE.K(objQ6);
                }
                bVarB2.add(new p(cVar6, intValue6, null, null, eVarC6, 0.0f, false, false, null, null, (e23.l) objQ6, 1004, null));
                o0VarE.g0(false);
                q13.b bVarA2 = w.a(bVarB2);
                o0VarE.g0(false);
                rVar2 = rVar;
                k.c(rVar2, i53.a.j(bVarA2), o0VarE, i45 & 14, 0);
            } else {
                i28 = i27;
            }
            z14 = true;
            objQ = o0VarE.q();
            if (z14) {
                objQ = new db0.a(i16, p1Var4, 3);
                o0VarE.K(objQ);
            } else {
                objQ = new db0.a(i16, p1Var4, 3);
                o0VarE.K(objQ);
            }
            n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr5 = new Object[0];
            if (i46 > 1048576) {
                p1Var = p1Var4;
                if ((i45 & 1572864) != 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            } else {
                p1Var = p1Var4;
                if ((i45 & 1572864) != 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
            }
            objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new db0.a(i16, p1Var5, 4);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new db0.a(i16, p1Var5, 4);
                o0VarE.K(objQ2);
            }
            n1Var2 = (n1) d4.a.e(objArr5, (e23.a) objQ2, o0VarE, 0);
            Object[] objArr6 = new Object[0];
            if (i46 <= 1048576) {
            }
            objQ3 = o0VarE.q();
            if (z16) {
                objQ3 = new db0.a(i16, p1Var6, 5);
                o0VarE.K(objQ3);
            } else {
                objQ3 = new db0.a(i16, p1Var6, 5);
                o0VarE.K(objQ3);
            }
            n1Var3 = (n1) d4.a.e(objArr6, (e23.a) objQ3, o0VarE, 0);
            o0VarE.C(-518054068);
            q13.b bVarB3 = w.b();
            i53.c cVar7 = (i53.c) p1Var.getF182175a();
            int intValue7 = n1Var.getIntValue();
            z3.e eVarC7 = z3.f.c(-1765623251, new h3(str, 9), o0VarE);
            boolean zB7 = o0VarE.B(n1Var) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var2);
            i29 = i45 & 29360128;
            if (i29 == 8388608) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean zK9 = z17 | zB7 | o0VarE.k(i24);
            i30 = i28;
            boolean zK10 = zK9 | o0VarE.k(i30) | o0VarE.B(n1Var3);
            i34 = i45 & 234881024;
            if (i34 == 67108864) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zK10 | z18;
            objQ4 = o0VarE.q();
            if (z19) {
                p1Var2 = p1Var;
                p1Var3 = p1Var6;
                objQ4 = new d(n1Var, lVar, p1Var5, p1Var3, p1Var2, i25, i26, i36, i19, n1Var2, i24, i30, n1Var3);
                o0VarE.K(objQ4);
            } else {
                p1Var2 = p1Var;
                p1Var3 = p1Var6;
                objQ4 = new d(n1Var, lVar, p1Var5, p1Var3, p1Var2, i25, i26, i36, i19, n1Var2, i24, i30, n1Var3);
                o0VarE.K(objQ4);
            }
            bVarB3.add(new p(cVar7, intValue7, null, null, eVarC7, 0.0f, false, false, null, null, (e23.l) objQ4, 1004, null));
            i53.c cVar8 = (i53.c) p1Var5.getF182175a();
            int intValue8 = n1Var2.getIntValue();
            z3.e eVarC8 = z3.f.c(-1608448106, new h3(str2, 10), o0VarE);
            boolean zB8 = o0VarE.B(n1Var2) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var);
            if (i29 == 8388608) {
                z24 = true;
            } else {
                z24 = false;
            }
            boolean zK11 = zB8 | z24 | o0VarE.k(i24) | o0VarE.k(i30) | o0VarE.B(r29);
            if (i34 == 67108864) {
                z25 = true;
            } else {
                z25 = false;
            }
            z26 = zK11 | z25;
            objQ5 = o0VarE.q();
            if (z26) {
                objQ5 = new d(n1Var2, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, i24, i30, (n1) r29);
                o0VarE.K(objQ5);
            } else {
                objQ5 = new d(n1Var2, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, i24, i30, (n1) r29);
                o0VarE.K(objQ5);
            }
            bVarB3.add(new p(cVar8, intValue8, null, null, eVarC8, 0.0f, false, false, null, null, (e23.l) objQ5, 1004, null));
            o0VarE.C(84340150);
            i53.c cVar9 = (i53.c) p1Var3.getF182175a();
            int intValue9 = r29.getIntValue();
            str4 = str3;
            z3.e eVarC9 = z3.f.c(1218300146, new h3(str4, 11), o0VarE);
            boolean zB9 = o0VarE.B(r29) | o0VarE.k(i25) | o0VarE.k(i26) | o0VarE.k(i36) | o0VarE.k(i19) | o0VarE.B(n1Var) | o0VarE.B(n1Var2);
            if (i29 == 8388608) {
                z27 = true;
            } else {
                z27 = false;
            }
            boolean zK12 = zB9 | z27 | o0VarE.k(i24) | o0VarE.k(i30);
            if (i34 == 67108864) {
                z28 = true;
            } else {
                z28 = false;
            }
            z29 = zK12 | z28;
            objQ6 = o0VarE.q();
            if (z29) {
                objQ6 = new d(n1Var3, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, n1Var2, i24, i30);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new d(n1Var3, lVar, p1Var5, p1Var3, p1Var2, n1Var, i25, i26, i36, i19, n1Var2, i24, i30);
                o0VarE.K(objQ6);
            }
            bVarB3.add(new p(cVar9, intValue9, null, null, eVarC9, 0.0f, false, false, null, null, (e23.l) objQ6, 1004, null));
            o0VarE.g0(false);
            q13.b bVarA3 = w.a(bVarB3);
            o0VarE.g0(false);
            rVar2 = rVar;
            k.c(rVar2, i53.a.j(bVarA3), o0VarE, i45 & 14, 0);
        } else {
            rVar2 = rVar;
            str4 = str3;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(rVar2, str, str2, str4, i14, i15, i16, lVar, i17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0146  */
    /* JADX WARN: Code duplicated, block: B:104:0x0155  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    public static final void g(h4.r rVar, String str, String str2, String str3, int i14, int i15, int i16, e23.l<? super Integer, Unit> lVar, p3.m mVar, int i17, int i18) {
        h4.r rVar2;
        int i19;
        String str4;
        int i24;
        String str5;
        int i25;
        int i26;
        String str6;
        int i27;
        boolean z14;
        o0 o0Var;
        h4.r rVar3;
        String str7;
        String str8;
        String str9;
        p2 p2VarI0;
        h4.r rVar4;
        String str10;
        h4.r rVar5;
        int i28;
        int i29;
        int i30;
        int i34;
        o0 o0VarE = mVar.E(832503639);
        int i35 = i18 & 1;
        if (i35 != 0) {
            i19 = i17 | 6;
            rVar2 = rVar;
        } else if ((i17 & 6) == 0) {
            rVar2 = rVar;
            i19 = (o0VarE.B(rVar2) ? 4 : 2) | i17;
        } else {
            rVar2 = rVar;
            i19 = i17;
        }
        int i36 = i18 & 2;
        if (i36 == 0) {
            if ((i17 & 48) == 0) {
                str4 = str;
                i19 |= o0VarE.B(str4) ? 32 : 16;
            }
            i24 = i18 & 4;
            if (i24 != 0) {
                if ((i17 & 384) == 0) {
                    str5 = str2;
                    if (o0VarE.B(str5)) {
                        i25 = 256;
                    } else {
                        i25 = 128;
                    }
                    i19 |= i25;
                }
                i26 = i18 & 8;
                if (i26 != 0) {
                    if ((i17 & 3072) == 0) {
                        str6 = str3;
                        if (o0VarE.B(str6)) {
                            i27 = 2048;
                        } else {
                            i27 = 1024;
                        }
                        i19 |= i27;
                    }
                    if ((i17 & 24576) == 0) {
                        if (o0VarE.k(i14)) {
                            i34 = 16384;
                        } else {
                            i34 = 8192;
                        }
                        i19 |= i34;
                    }
                    if ((196608 & i17) == 0) {
                        if (o0VarE.k(i15)) {
                            i30 = 131072;
                        } else {
                            i30 = 65536;
                        }
                        i19 |= i30;
                    }
                    if ((1572864 & i17) != 0) {
                        if (o0VarE.k(i16)) {
                            i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                        } else {
                            i29 = 524288;
                        }
                        i19 |= i29;
                    }
                    if ((i17 & 12582912) != 0) {
                        if (o0VarE.r(lVar)) {
                            i28 = 8388608;
                        } else {
                            i28 = 4194304;
                        }
                        i19 |= i28;
                    }
                    if ((i19 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i19 & 1, z14)) {
                        o0VarE.G0();
                        if ((i17 & 1) != 0 || o0VarE.o0()) {
                            if (i35 != 0) {
                                rVar4 = h4.r.S;
                            } else {
                                rVar4 = rVar2;
                            }
                            if (i36 != 0) {
                                str4 = ":";
                            }
                            if (i24 != 0) {
                                str5 = ":";
                            }
                            if (i26 != 0) {
                                str6 = "";
                            }
                            str10 = str6;
                            rVar5 = rVar4;
                        } else {
                            o0VarE.e();
                            str10 = str6;
                            rVar5 = rVar2;
                        }
                        String str11 = str4;
                        String str12 = str5;
                        o0VarE.h0();
                        x1 x1Var = p3.n.f135158a;
                        o0Var = o0VarE;
                        f(rVar5, str11, str12, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                        rVar3 = rVar5;
                        str7 = str11;
                        str8 = str12;
                        str9 = str10;
                    } else {
                        o0Var = o0VarE;
                        o0Var.e();
                        rVar3 = rVar2;
                        str7 = str4;
                        str8 = str5;
                        str9 = str6;
                    }
                    p2VarI0 = o0Var.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
                    }
                }
                i19 |= 3072;
                str6 = str3;
                if ((i17 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i34 = 16384;
                    } else {
                        i34 = 8192;
                    }
                    i19 |= i34;
                }
                if ((196608 & i17) == 0) {
                    if (o0VarE.k(i15)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i19 |= i30;
                }
                if ((1572864 & i17) != 0) {
                    if (o0VarE.k(i16)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i19 |= i29;
                }
                if ((i17 & 12582912) != 0) {
                    if (o0VarE.r(lVar)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i19 |= i28;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i19 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    } else {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    }
                    String str13 = str4;
                    String str14 = str5;
                    o0VarE.h0();
                    x1 x1Var2 = p3.n.f135158a;
                    o0Var = o0VarE;
                    f(rVar5, str13, str14, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                    rVar3 = rVar5;
                    str7 = str13;
                    str8 = str14;
                    str9 = str10;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
                }
            }
            i19 |= 384;
            str5 = str2;
            i26 = i18 & 8;
            if (i26 != 0) {
                if ((i17 & 3072) == 0) {
                    str6 = str3;
                    if (o0VarE.B(str6)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i19 |= i27;
                }
                if ((i17 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i34 = 16384;
                    } else {
                        i34 = 8192;
                    }
                    i19 |= i34;
                }
                if ((196608 & i17) == 0) {
                    if (o0VarE.k(i15)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i19 |= i30;
                }
                if ((1572864 & i17) != 0) {
                    if (o0VarE.k(i16)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i19 |= i29;
                }
                if ((i17 & 12582912) != 0) {
                    if (o0VarE.r(lVar)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i19 |= i28;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i19 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    } else {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    }
                    String str15 = str4;
                    String str16 = str5;
                    o0VarE.h0();
                    x1 x1Var3 = p3.n.f135158a;
                    o0Var = o0VarE;
                    f(rVar5, str15, str16, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                    rVar3 = rVar5;
                    str7 = str15;
                    str8 = str16;
                    str9 = str10;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
                }
            }
            i19 |= 3072;
            str6 = str3;
            if ((i17 & 24576) == 0) {
                if (o0VarE.k(i14)) {
                    i34 = 16384;
                } else {
                    i34 = 8192;
                }
                i19 |= i34;
            }
            if ((196608 & i17) == 0) {
                if (o0VarE.k(i15)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i19 |= i30;
            }
            if ((1572864 & i17) != 0) {
                if (o0VarE.k(i16)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
                i19 |= i29;
            }
            if ((i17 & 12582912) != 0) {
                if (o0VarE.r(lVar)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i19 |= i28;
            }
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                } else {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                }
                String str17 = str4;
                String str18 = str5;
                o0VarE.h0();
                x1 x1Var4 = p3.n.f135158a;
                o0Var = o0VarE;
                f(rVar5, str17, str18, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                rVar3 = rVar5;
                str7 = str17;
                str8 = str18;
                str9 = str10;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                str7 = str4;
                str8 = str5;
                str9 = str6;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
            }
        }
        i19 |= 48;
        str4 = str;
        i24 = i18 & 4;
        if (i24 != 0) {
            if ((i17 & 384) == 0) {
                str5 = str2;
                if (o0VarE.B(str5)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i19 |= i25;
            }
            i26 = i18 & 8;
            if (i26 != 0) {
                if ((i17 & 3072) == 0) {
                    str6 = str3;
                    if (o0VarE.B(str6)) {
                        i27 = 2048;
                    } else {
                        i27 = 1024;
                    }
                    i19 |= i27;
                }
                if ((i17 & 24576) == 0) {
                    if (o0VarE.k(i14)) {
                        i34 = 16384;
                    } else {
                        i34 = 8192;
                    }
                    i19 |= i34;
                }
                if ((196608 & i17) == 0) {
                    if (o0VarE.k(i15)) {
                        i30 = 131072;
                    } else {
                        i30 = 65536;
                    }
                    i19 |= i30;
                }
                if ((1572864 & i17) != 0) {
                    if (o0VarE.k(i16)) {
                        i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i29 = 524288;
                    }
                    i19 |= i29;
                }
                if ((i17 & 12582912) != 0) {
                    if (o0VarE.r(lVar)) {
                        i28 = 8388608;
                    } else {
                        i28 = 4194304;
                    }
                    i19 |= i28;
                }
                if ((i19 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i19 & 1, z14)) {
                    o0VarE.G0();
                    if ((i17 & 1) != 0) {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    } else {
                        if (i35 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i36 != 0) {
                            str4 = ":";
                        }
                        if (i24 != 0) {
                            str5 = ":";
                        }
                        if (i26 != 0) {
                            str6 = "";
                        }
                        str10 = str6;
                        rVar5 = rVar4;
                    }
                    String str19 = str4;
                    String str110 = str5;
                    o0VarE.h0();
                    x1 x1Var5 = p3.n.f135158a;
                    o0Var = o0VarE;
                    f(rVar5, str19, str110, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                    rVar3 = rVar5;
                    str7 = str19;
                    str8 = str110;
                    str9 = str10;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    rVar3 = rVar2;
                    str7 = str4;
                    str8 = str5;
                    str9 = str6;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
                }
            }
            i19 |= 3072;
            str6 = str3;
            if ((i17 & 24576) == 0) {
                if (o0VarE.k(i14)) {
                    i34 = 16384;
                } else {
                    i34 = 8192;
                }
                i19 |= i34;
            }
            if ((196608 & i17) == 0) {
                if (o0VarE.k(i15)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i19 |= i30;
            }
            if ((1572864 & i17) != 0) {
                if (o0VarE.k(i16)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
                i19 |= i29;
            }
            if ((i17 & 12582912) != 0) {
                if (o0VarE.r(lVar)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i19 |= i28;
            }
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                } else {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                }
                String str111 = str4;
                String str112 = str5;
                o0VarE.h0();
                x1 x1Var6 = p3.n.f135158a;
                o0Var = o0VarE;
                f(rVar5, str111, str112, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                rVar3 = rVar5;
                str7 = str111;
                str8 = str112;
                str9 = str10;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                str7 = str4;
                str8 = str5;
                str9 = str6;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
            }
        }
        i19 |= 384;
        str5 = str2;
        i26 = i18 & 8;
        if (i26 != 0) {
            if ((i17 & 3072) == 0) {
                str6 = str3;
                if (o0VarE.B(str6)) {
                    i27 = 2048;
                } else {
                    i27 = 1024;
                }
                i19 |= i27;
            }
            if ((i17 & 24576) == 0) {
                if (o0VarE.k(i14)) {
                    i34 = 16384;
                } else {
                    i34 = 8192;
                }
                i19 |= i34;
            }
            if ((196608 & i17) == 0) {
                if (o0VarE.k(i15)) {
                    i30 = 131072;
                } else {
                    i30 = 65536;
                }
                i19 |= i30;
            }
            if ((1572864 & i17) != 0) {
                if (o0VarE.k(i16)) {
                    i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i29 = 524288;
                }
                i19 |= i29;
            }
            if ((i17 & 12582912) != 0) {
                if (o0VarE.r(lVar)) {
                    i28 = 8388608;
                } else {
                    i28 = 4194304;
                }
                i19 |= i28;
            }
            if ((i19 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i19 & 1, z14)) {
                o0VarE.G0();
                if ((i17 & 1) != 0) {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                } else {
                    if (i35 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i36 != 0) {
                        str4 = ":";
                    }
                    if (i24 != 0) {
                        str5 = ":";
                    }
                    if (i26 != 0) {
                        str6 = "";
                    }
                    str10 = str6;
                    rVar5 = rVar4;
                }
                String str113 = str4;
                String str114 = str5;
                o0VarE.h0();
                x1 x1Var7 = p3.n.f135158a;
                o0Var = o0VarE;
                f(rVar5, str113, str114, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
                rVar3 = rVar5;
                str7 = str113;
                str8 = str114;
                str9 = str10;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                rVar3 = rVar2;
                str7 = str4;
                str8 = str5;
                str9 = str6;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
            }
        }
        i19 |= 3072;
        str6 = str3;
        if ((i17 & 24576) == 0) {
            if (o0VarE.k(i14)) {
                i34 = 16384;
            } else {
                i34 = 8192;
            }
            i19 |= i34;
        }
        if ((196608 & i17) == 0) {
            if (o0VarE.k(i15)) {
                i30 = 131072;
            } else {
                i30 = 65536;
            }
            i19 |= i30;
        }
        if ((1572864 & i17) != 0) {
            if (o0VarE.k(i16)) {
                i29 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i29 = 524288;
            }
            i19 |= i29;
        }
        if ((i17 & 12582912) != 0) {
            if (o0VarE.r(lVar)) {
                i28 = 8388608;
            } else {
                i28 = 4194304;
            }
            i19 |= i28;
        }
        if ((i19 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i19 & 1, z14)) {
            o0VarE.G0();
            if ((i17 & 1) != 0) {
                if (i35 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i36 != 0) {
                    str4 = ":";
                }
                if (i24 != 0) {
                    str5 = ":";
                }
                if (i26 != 0) {
                    str6 = "";
                }
                str10 = str6;
                rVar5 = rVar4;
            } else {
                if (i35 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i36 != 0) {
                    str4 = ":";
                }
                if (i24 != 0) {
                    str5 = ":";
                }
                if (i26 != 0) {
                    str6 = "";
                }
                str10 = str6;
                rVar5 = rVar4;
            }
            String str115 = str4;
            String str116 = str5;
            o0VarE.h0();
            x1 x1Var8 = p3.n.f135158a;
            o0Var = o0VarE;
            f(rVar5, str115, str116, str10, i14, i15, i16, lVar, o0Var, (i19 & 14) | 12582912 | (i19 & 112) | (i19 & 896) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (3670016 & i19) | ((i19 << 3) & 234881024));
            rVar3 = rVar5;
            str7 = str115;
            str8 = str116;
            str9 = str10;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar3 = rVar2;
            str7 = str4;
            str8 = str5;
            str9 = str6;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a51.d(rVar3, str7, str8, str9, i14, i15, i16, lVar, i17, i18);
        }
    }

    public static final void h(h4.r rVar, String str, String str2, String str3, e23.l lVar, e23.l lVar2, e23.l lVar3, p3.m mVar, int i14) {
        String str4;
        String str5;
        String str6;
        o0 o0VarE = mVar.E(12471814);
        int i15 = i14 | 3504;
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarH = e0.h(0, 23);
            i53.c cVarH2 = e0.h(0, 59);
            k.c(rVar, i53.a.a(new p(cVarH, 0, null, null, z3.f.c(1145412944, new r72.g(b14, 9), o0VarE), 0.0f, false, false, null, null, lVar, 1006, null), new p(cVarH2, 0, null, null, z3.f.c(-1658985647, new r72.g(b14, 10), o0VarE), 0.0f, false, false, null, null, lVar2, 1006, null), new p(cVarH2, 0, null, null, z3.f.c(-168416942, new r72.g(b14, 11), o0VarE), 0.0f, false, false, null, null, lVar3, 1006, null)), o0VarE, 6, 0);
            str4 = ":";
            str5 = ":";
            str6 = "";
        } else {
            o0VarE.e();
            str4 = str;
            str5 = str2;
            str6 = str3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p40.t(rVar, str4, str5, str6, lVar, lVar2, lVar3, i14, 1);
        }
    }

    public static final i53.c<Integer> i(int i14, int i15, int i16, int i17, int i18) {
        if (i14 == i15) {
            return e0.h(i16, i17);
        }
        if (i18 == i14) {
            return e0.h(0, i17);
        }
        return i18 == i15 ? e0.h(i16, 59) : e0.h(0, 59);
    }

    public static final i53.c j(int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
        if (i14 == i15 && i16 == i17) {
            return e0.h(i18, i18);
        }
        if (i24 == i14 && i25 == i16) {
            return e0.h(0, i18);
        }
        return (i24 == i15 && i25 == i17) ? e0.h(i19, 59) : e0.h(0, 59);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(n1 n1Var, e23.l lVar, p1 p1Var, p1 p1Var2, p1 p1Var3, int i14, int i15, int i16, int i17, n1 n1Var2, int i18, int i19, n1 n1Var3) {
        i53.c cVar = (i53.c) p1Var.getF182175a();
        i53.c cVar2 = (i53.c) p1Var2.getF182175a();
        p1Var.setValue(i(i14, i15, i16, i17, ((Number) ((i53.c) p1Var3.getF182175a()).get(n1Var.getIntValue())).intValue()));
        n1Var2.t(l(((Number) cVar.get(n1Var2.getIntValue())).intValue(), (i53.c) p1Var.getF182175a()));
        p1Var2.setValue(j(i14, i15, i17, i16, i18, i19, ((Number) ((i53.c) p1Var3.getF182175a()).get(n1Var.getIntValue())).intValue(), ((Number) ((i53.c) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue()));
        n1Var3.t(l(((Number) cVar2.get(n1Var3.getIntValue())).intValue(), (i53.c) p1Var2.getF182175a()));
        lVar.invoke(Integer.valueOf(((Number) ((i53.c) p1Var2.getF182175a()).get(n1Var3.getIntValue())).intValue() + (((Number) ((i53.c) p1Var.getF182175a()).get(n1Var2.getIntValue())).intValue() * 60) + (((Number) ((i53.c) p1Var3.getF182175a()).get(n1Var.getIntValue())).intValue() * DateTimeConstants.SECONDS_PER_HOUR)));
    }

    public static final int l(int i14, List list) {
        return j23.t.e(list.indexOf(Integer.valueOf(i14)), 0, list.size() - 1);
    }
}
