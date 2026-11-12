package at;

import a51.l;
import ak0.z;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import e23.p;
import g02.k0;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class g {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(String str, ct.b bVar, ct.a aVar, e23.a aVar2, m mVar, int i14) {
        ct.b bVar2;
        ct.a aVar3;
        ct.a aVar4;
        int i15;
        e23.a aVar5;
        bVar.getClass();
        o0 o0VarE = mVar.E(830612067);
        int i16 = i14 | (o0VarE.B(str) ? 4 : 2) | 128 | (o0VarE.r(aVar2) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                aVar4 = new ct.a(new l22.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)), str);
                i15 = i16 & (-897);
            } else {
                o0VarE.e();
                i15 = i16 & (-897);
                aVar4 = aVar;
            }
            o0VarE.h0();
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(bVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                bVar2 = bVar;
                objQ2 = p0.n(aVar4.a(bVar2));
                o0VarE.K(objQ2);
            } else {
                bVar2 = bVar;
            }
            p1 p1Var2 = (p1) objQ2;
            ct.b bVar3 = (ct.b) p1Var.getF182175a();
            boolean zR = o0VarE.r(aVar4);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new f(aVar4, p1Var, p1Var2, null);
                o0VarE.K(objQ3);
            }
            l0.e((p) objQ3, bVar3, o0VarE);
            if (((ct.b) p1Var.getF182175a()) == ct.b.SAVING_ACTIVITY_DIALOG) {
                o0VarE.C(1458174829);
                Object objQ4 = o0VarE.q();
                if (objQ4 == c2565a) {
                    objQ4 = new z(p1Var, 5);
                    o0VarE.K(objQ4);
                }
                aVar5 = (e23.a) objQ4;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1458260823);
                boolean z14 = (i15 & 7168) == 2048;
                Object objQ5 = o0VarE.q();
                if (z14 || objQ5 == c2565a) {
                    objQ5 = new as.n(aVar2, 6);
                    o0VarE.K(objQ5);
                }
                aVar5 = (e23.a) objQ5;
                o0VarE.g0(false);
            }
            String str2 = ((ct.c) p1Var2.getF182175a()).f55473a;
            String str3 = ((ct.c) p1Var2.getF182175a()).f55474b;
            g02.l0 aVar6 = ((ct.b) p1Var.getF182175a()) == ct.b.ACTIVITY_SAVED_DIALOG ? new g02.l0.a(0, 1, null) : new g02.l0.b(0, 1, null);
            boolean zB = o0VarE.B(aVar5);
            Object objQ6 = o0VarE.q();
            if (zB || objQ6 == c2565a) {
                objQ6 = new as.n(aVar5, 7);
                o0VarE.K(objQ6);
            }
            k0.c(str2, str3, aVar6, (e23.a) objQ6, o0VarE, 0);
            aVar3 = aVar4;
        } else {
            bVar2 = bVar;
            o0VarE.e();
            aVar3 = aVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(str, bVar2, aVar3, aVar2, i14, 7);
        }
    }
}
