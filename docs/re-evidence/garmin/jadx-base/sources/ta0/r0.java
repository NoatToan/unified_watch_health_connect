package ta0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f163429a;

        static {
            int[] iArr = new int[l90.f.values().length];
            try {
                iArr[l90.f.PERMISSION_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l90.f.NO_INTERNET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l90.f.NO_BLUETOOTH_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l90.f.NO_BLE_SUPPORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l90.f.TRU_SWING_ALREADY_PAIRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f163429a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    public static final void a(l90.f fVar, e23.l<? super yl2.b, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        fVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1988243595);
        int i15 = i14 | (o0VarE.k(fVar.ordinal()) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = a.f163429a[fVar.ordinal()];
            if (i16 == 1) {
                o0VarE.C(129292864);
                p0.a(false, null, aVar, aVar, o0VarE, (i15 & 896) | 6 | ((i15 << 3) & 7168));
                o0VarE.g0(false);
            } else if (i16 == 2) {
                o0VarE.C(129551528);
                l72.c1.f110940a.a(false, null, gl1.y.Q(o0VarE, R.string.pairing_internet_required_message), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar, o0VarE, (i15 << 18) & 234881024, (i15 >> 6) & 14, 731);
                o0VarE.g0(false);
            } else if (i16 == 3) {
                o0VarE.C(129907160);
                l72.c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.phone_no_bluetooth_title), gl1.y.P(R.string.phone_no_bluetooth_message_a, new Object[]{gl1.y.Q(o0VarE, R.string.os_name_android)}, o0VarE), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar, o0VarE, (i15 << 18) & 234881024, (i15 >> 6) & 14, 729);
                o0VarE.g0(false);
            } else if (i16 == 4) {
                o0VarE.C(130364100);
                l72.c1.f110940a.a(false, gl1.y.Q(o0VarE, R.string.phone_no_ble_title), gl1.y.P(R.string.phone_no_ble_message_a, new Object[]{gl1.y.Q(o0VarE, R.string.os_name_android)}, o0VarE), null, null, gl1.y.Q(o0VarE, R.string.lbl_ok), false, false, aVar, null, aVar, o0VarE, (i15 << 18) & 234881024, (i15 >> 6) & 14, 729);
                o0VarE.g0(false);
            } else {
                if (i16 != 5) {
                    throw kg.f.h(o0VarE, 558359577, false);
                }
                o0VarE.C(130822807);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.golf_swing_sensor_another_already_paired);
                String strQ2 = gl1.y.Q(o0VarE, R.string.golf_swing_sensor_use_existing);
                String strQ3 = gl1.y.Q(o0VarE, R.string.golf_swing_sensor_pair_new);
                boolean z14 = (i15 & 112) == 32;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new sq1.e(lVar, 22);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sq1.e(lVar, 22);
                        o0VarE.K(objQ);
                    }
                }
                c1Var.a(false, null, strQ, null, null, strQ2, false, false, aVar, strQ3, (e23.a) objQ, o0VarE, (i15 << 18) & 234881024, 0, 219);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rx1.u((Object) fVar, (e23.l) lVar, (o13.h) aVar, i14, 29);
        }
    }
}
