package mc1;

import android.os.Parcelable;
import c2.x2;
import e23.l;
import h4.r;
import o53.f0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:55:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x010d  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(dc1.a aVar, DateTime dateTime, tf0.i iVar, l<? super Boolean, Unit> lVar, l<? super DateTime, Unit> lVar2, m mVar, int i14) {
        int i15;
        boolean z14;
        Double averageSpO2;
        double dDoubleValue;
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        o0 o0VarE = mVar.E(-1879686778);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= (i14 & 512) == 0 ? o0VarE.B(iVar) : o0VarE.r(iVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(lVar2) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            boolean zB = o0VarE.B(aVar);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                if (aVar == null) {
                    z14 = false;
                } else {
                    averageSpO2 = aVar.getAverageSpO2();
                    if (averageSpO2 != null) {
                        dDoubleValue = averageSpO2.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    if (dDoubleValue <= 0.0d) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                }
                objQ = hb.a.n(z14, o0VarE);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    if (aVar == null) {
                        z14 = false;
                    } else {
                        averageSpO2 = aVar.getAverageSpO2();
                        if (averageSpO2 != null) {
                            dDoubleValue = averageSpO2.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        if (dDoubleValue <= 0.0d && f0.v(aVar).isEmpty() && f0.z(aVar).isEmpty()) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    }
                    objQ = hb.a.n(z14, o0VarE);
                }
            }
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarH = x2.h(x2.f(r.S, 1.0f), 290);
            boolean zBooleanValue = ((Boolean) ((p1) objQ).getF182175a()).booleanValue();
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            boolean zR = o0VarE.r(dateTime) | ((57344 & i15) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new ci0.e(lVar2, dateTime, 5);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new ci0.e(lVar2, dateTime, 5);
                    o0VarE.K(objQ2);
                }
            }
            tf0.r.a(zBooleanValue, localDate, iVar, rVarH, (e23.a) objQ2, lVar, z3.f.c(-714723971, new c(aVar), o0VarE), o0VarE, (tf0.i.f164439d << 6) | 1575936 | (i15 & 896) | ((i15 << 6) & 458752));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e((Parcelable) aVar, (Object) dateTime, (Object) iVar, (l) lVar, (l) lVar2, i14, 4);
        }
    }
}
