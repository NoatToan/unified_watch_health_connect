package ya0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;
import r53.o2;

/* JADX INFO: loaded from: classes8.dex */
public final class d0 {
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    public static final void a(c cVar, l90.b bVar, e23.a<Unit> aVar, e23.l<? super Float, Unit> lVar, p3.m mVar, int i14) {
        bVar.getClass();
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1777733140);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(bVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            q90.a aVar2 = (q90.a) s9.c.c((o2) cVar.f195407d.getValue(), o0VarE).getF182175a();
            if (aVar2 instanceof q90.a.f) {
                o0VarE.C(794075049);
                String str = bVar.f111521f;
                o90.a aVar3 = bVar.f111526k;
                boolean zB = o0VarE.B(aVar2) | ((i15 & 896) == 256);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new x9.b((q90.a.f) aVar2, aVar, 19);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new x9.b((q90.a.f) aVar2, aVar, 19);
                        o0VarE.K(objQ);
                    }
                }
                b(str, aVar3, (e23.l) objQ, lVar, o0VarE, i15 & 7168);
                o0VarE.g0(false);
            } else {
                o0VarE.C(794444724);
                o0VarE.g0(false);
                aVar.invoke();
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xr.n(cVar, bVar, aVar, lVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3  */
    public static final void b(String str, o90.a aVar, e23.l<? super Boolean, Unit> lVar, e23.l<? super Float, Unit> lVar2, p3.m mVar, int i14) {
        String str2;
        int i15;
        e23.l<? super Float, Unit> lVar3;
        o0 o0Var;
        o0 o0VarE = mVar.E(-2051520695);
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i15 = i14;
        }
        int i16 = i15 | (o0VarE.B(aVar) ? 32 : 16);
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            lVar3 = lVar2;
            i16 |= o0VarE.r(lVar3) ? 2048 : 1024;
        } else {
            lVar3 = lVar2;
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.device_already_linked);
            String strQ2 = gl1.y.Q(o0VarE, R.string.reset_this_device_label);
            int i17 = i16 & 896;
            boolean z14 = i17 == 256;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new ub0.h(lVar, 27);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ub0.h(lVar, 27);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_cancel);
            boolean z15 = i17 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new ub0.h(lVar, 28);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ub0.h(lVar, 28);
                    o0VarE.K(objQ2);
                }
            }
            e23.a aVar4 = (e23.a) objQ2;
            i.f195444a.getClass();
            int i18 = i16 << 3;
            o0Var = o0VarE;
            da0.p.c("device_pairing_ble_reset_screen", str2, aVar, strQ, false, null, null, null, strQ2, aVar3, false, strQ3, aVar4, false, null, null, false, false, null, lVar3, null, null, i.f195445b, o0Var, (i18 & 112) | 6 | (i18 & 896), (i16 << 18) & 1879048192, 3072, 7857392);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) str, (Object) aVar, (Object) lVar, (Object) lVar2, i14, 27);
        }
    }
}
