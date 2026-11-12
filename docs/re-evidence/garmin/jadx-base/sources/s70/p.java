package s70;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;

/* JADX INFO: loaded from: classes8.dex */
public final class p {
    public static final void a(h4.r rVar, String str, boolean z14, boolean z15, e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        String strA;
        String strP;
        p3.o0 o0VarE = mVar.E(-1592491824);
        int i15 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.h(z15) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (z14) {
                o0VarE.C(285037044);
                strA = g22.n.a(gl1.y.Q(o0VarE, R.string.pn_device_very_low_battery));
                o0VarE.g0(false);
            } else {
                o0VarE.C(285136089);
                strA = g22.n.a(gl1.y.Q(o0VarE, R.string.pn_low_device_battery));
                o0VarE.g0(false);
            }
            String str2 = strA;
            if (z15) {
                o0VarE.C(285277325);
                strP = gl1.y.P(R.string.msg_device_low_battery_for_pulse_ox, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else if (z14) {
                o0VarE.C(285512181);
                strP = gl1.y.P(R.string.msg_device_very_low_battery, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(285406874);
                strP = gl1.y.P(R.string.msg_device_low_battery, new Object[]{str}, o0VarE);
                o0VarE.g0(false);
            }
            String str3 = strP;
            l72.s sVar = l72.s.f111232a;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            float f15 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarC = c2.l.C(rVar, f14, eVar.f97920e, f15, 0.0f, 8);
            l72.s.b bVar2 = l72.s.b.INFO;
            s62.a.f157643a.getClass();
            sVar.d(rVarC, bVar2, v62.a.a(t62.b.f162798a), str2, str3, gl1.y.Q(o0VarE, R.string.lbl_turn_on_battery_saver), aVar2, aVar, o0VarE, ((i15 << 12) & 234881024) | ((i15 << 3) & 3670016) | 48, 128);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ak0.n(rVar, str, z14, z15, aVar, aVar2, i14);
        }
    }
}
