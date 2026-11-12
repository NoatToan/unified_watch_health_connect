package pa0;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import da0.p;
import gl1.y;
import java.util.List;
import p005kotlin.Unit;
import p13.h0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import v62.b5;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final void a(List<j90.g> list, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1077465584);
        int i15 = 2;
        int i16 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                j90.g gVar = (j90.g) h0.d0(list);
                objQ = p0.n(gVar != null ? Long.valueOf(gVar.f97815a) : null);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            String strQ = y.Q(o0VarE, R.string.lte_transfer_bic_device_selector_title);
            s62.a.f157643a.getClass();
            u4.d dVarA = b5.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lte_transfer_subscription);
            boolean z14 = ((i16 & 112) == 32) | ((i16 & 896) == 256);
            Object objQ2 = o0VarE.q();
            if (z14 || objQ2 == c2565a) {
                objQ2 = new cv0.a(aVar, p1Var, lVar, 5);
                o0VarE.K(objQ2);
            }
            o0Var = o0VarE;
            p.b("lte_subscription_device_selector_screen", strQ, dVarA, null, null, strQ2, (e23.a) objQ2, false, null, null, false, y.Q(o0VarE, R.string.lte_setuplater_devicesettings), aVar2, false, false, aVar3, null, null, null, null, null, z3.f.c(1584576240, new bb0.a(list, p1Var, i15), o0VarE), o0Var, 6, ((i16 >> 3) & 896) | ((i16 << 3) & 458752), 384, 4155288);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(list, lVar, aVar, aVar2, aVar3, i14, 0);
        }
    }

    public static final void b(List<j90.g> list, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, e23.a<Unit> aVar2, e23.a<Unit> aVar3, p3.m mVar, int i14) {
        list.getClass();
        lVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        o0 o0VarE = mVar.E(-1255658017);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128) | (o0VarE.r(aVar2) ? 2048 : 1024) | (o0VarE.r(aVar3) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = n.f135158a;
            a(list, lVar, aVar, aVar2, aVar3, o0VarE, i15 & WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(list, lVar, aVar, aVar2, aVar3, i14, 1);
        }
    }
}
