package in1;

import c2.x2;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ec  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(km1.c cVar, DateTime dateTime, sm1.s sVar, boolean z14, p3.m mVar, int i14) {
        int i15;
        sVar.getClass();
        o0 o0VarE = mVar.E(-664671798);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(dateTime) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        boolean z15 = true;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(sVar.f160188h, o0VarE);
            if ((i15 & 14) != 4 && ((i15 & 8) == 0 || !o0VarE.B(cVar))) {
                z15 = false;
            }
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = hb.a.n(z14, o0VarE);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = hb.a.n(z14, o0VarE);
                }
            }
            boolean zBooleanValue = ((Boolean) ((p1) objQ).getF182175a()).booleanValue();
            LocalDate localDate = dateTime.toLocalDate();
            localDate.getClass();
            tf0.i iVar = sVar.f160186f;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarH = x2.h(x2.f(h4.r.S, 1.0f), 350);
            boolean zR = o0VarE.r(sVar) | o0VarE.r(dateTime);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new i91.c(11, sVar, dateTime);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i91.c(11, sVar, dateTime);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar3 = (e23.a) objQ2;
            boolean zR2 = o0VarE.r(sVar);
            Object objQ3 = o0VarE.q();
            if (zR2) {
                objQ3 = new c(sVar, 0);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new c(sVar, 0);
                    o0VarE.K(objQ3);
                }
            }
            tf0.r.a(zBooleanValue, localDate, iVar, rVarH, aVar3, (e23.l) objQ3, z3.f.c(-178231373, new gw1.c(cVar, 20, sVar, p1VarC), o0VarE), o0VarE, (tf0.i.f164439d << 6) | 1575936);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq0.i(cVar, dateTime, sVar, z14, i14, 5);
        }
    }
}
