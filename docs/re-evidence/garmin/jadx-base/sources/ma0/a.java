package ma0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDISimpleSetup;
import da0.p;
import e23.l;
import gl1.y;
import gt1.k;
import java.util.List;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import v62.x7;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:32:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    public static final void a(List<? extends GDISimpleSetup.SensorType> list, l<? super GDISimpleSetup.SensorType, Unit> lVar, l<? super la0.b, Unit> lVar2, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        list.getClass();
        lVar.getClass();
        lVar2.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-2061292863);
        int i15 = i14 | (o0VarE.r(list) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = y.Q(o0VarE, R.string.bic_popular_profiles_sensor_selection_title);
            s62.a.f157643a.getClass();
            u4.d dVarA = x7.a(t62.b.f162798a);
            String strQ2 = y.Q(o0VarE, R.string.lbl_next);
            int i16 = i15 & 896;
            boolean z14 = i16 == 256;
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (z14) {
                objQ = new k(lVar2, 26);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new k(lVar2, 26);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            String strQ3 = y.Q(o0VarE, R.string.lbl_skip_button);
            boolean z15 = i16 == 256;
            Object objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new k(lVar2, 27);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new k(lVar2, 27);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            p.b("choose_sensors_screen", strQ, dVarA, null, null, strQ2, aVar3, false, strQ3, (e23.a) objQ2, false, null, null, false, false, aVar, null, null, null, null, null, z3.f.c(-808327743, new c82.e(list, lVar, 3), o0VarE), o0Var, 6, (i15 << 6) & 458752, 384, 4160664);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new lm0.f(list, lVar, lVar2, aVar, i14, 1);
        }
    }
}
