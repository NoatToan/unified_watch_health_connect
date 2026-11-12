package p80;

import b82.f0;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import e23.l;
import gl1.y;
import h4.r;
import l72.s;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.a8;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    public static final void a(n80.a aVar, l<? super n80.a, Unit> lVar, r rVar, e23.a<Unit> aVar2, m mVar, int i14, int i15) {
        e23.a<Unit> aVar3;
        int i16;
        e23.a<Unit> aVar4;
        String strP;
        aVar.getClass();
        String str = aVar.f124928b;
        lVar.getClass();
        o0 o0VarE = mVar.E(-1532305082);
        int i17 = i14 | ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        int i18 = i15 & 8;
        if (i18 != 0) {
            i16 = i17 | 3072;
            aVar3 = aVar2;
        } else {
            aVar3 = aVar2;
            i16 = i17 | (o0VarE.r(aVar3) ? 2048 : 1024);
        }
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            e23.a<Unit> aVar5 = i18 != 0 ? null : aVar3;
            x1 x1Var = n.f135158a;
            if (str == null || w.J(str)) {
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -1988031723, R.string.lbl_link_your_device_lowercase, o0VarE, false);
            } else {
                o0VarE.C(-1987954905);
                strP = y.P(R.string.lbl_link_your_device_name, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            }
            String str2 = strP;
            s sVar = s.f111232a;
            s.b bVar = s.b.INFO;
            s62.a.f157643a.getClass();
            u4.d dVarA = a8.a(t62.b.f162798a);
            String strP2 = y.P(R.string.msg_link_device_permission, new Object[]{y.Q(o0VarE, R.string.common_garmin_connect)}, o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_link_device);
            boolean z14 = ((i16 & 112) == 32) | ((i16 & 14) == 4 || ((i16 & 8) != 0 && o0VarE.r(aVar)));
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new p40.o0(1, lVar, aVar);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new p40.o0(1, lVar, aVar);
                    o0VarE.K(objQ);
                }
            }
            sVar.d(rVar, bVar, dVarA, str2, strP2, strQ, (e23.a) objQ, aVar5, o0VarE, ((i16 >> 6) & 14) | 48 | ((i16 << 15) & 234881024), 128);
            aVar4 = aVar5;
        } else {
            o0VarE.e();
            aVar4 = aVar3;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(i14, i15, 22, aVar, lVar, rVar, aVar4);
        }
    }
}
