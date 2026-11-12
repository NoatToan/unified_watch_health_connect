package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes3.dex */
public class jj5 extends de {
    public static final byte[] d = {-87, -42, -21, 69, -15, 60, 112, -126, -128, -60, -106, 123, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, 31, 94, -83, -10, 88, -21, -92, -64, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -39, 107, -16, HMProSyncDataBaseProfile.DATA_SPO2_POINT, -54, 78, 23, -8, -23, 114, HMProSyncDataBaseProfile.DATA_TYPE_PAI, -58, 21, -76, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, HMProSyncDataBaseProfile.DATA_SPO2_ODI, -105, 95, 11, -63, -34, -93, 100, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -75, 100, -22, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 23, -97, -48, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ee f22854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public fj5 f22855b;
    public byte[] c = d;

    public jj5(ee eeVar) {
        this.f22854a = eeVar;
    }

    public static byte[] h() {
        return d;
    }

    public static jj5 j(Object obj) {
        if (obj instanceof jj5) {
            return (jj5) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        te teVarQ = te.q(obj);
        jj5 jj5Var = teVarQ.t(0) instanceof ee ? new jj5(ee.w(teVarQ.t(0))) : new jj5(fj5.k(teVarQ.t(0)));
        if (teVarQ.size() == 2) {
            byte[] bArrR = he.q(teVarQ.t(1)).r();
            jj5Var.c = bArrR;
            if (bArrR.length != d.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return jj5Var;
    }

    public byte[] g() {
        return this.c;
    }

    public fj5 i() {
        return this.f22855b;
    }

    public ee k() {
        return this.f22854a;
    }

    public boolean l() {
        return this.f22854a != null;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        jd jdVar = new jd();
        hd hdVar = this.f22854a;
        if (hdVar == null) {
            hdVar = this.f22855b;
        }
        jdVar.a(hdVar);
        if (!vj1.a(this.c, d)) {
            jdVar.a(new qg5(this.c));
        }
        return new yg5(jdVar);
    }

    public jj5(fj5 fj5Var) {
        this.f22855b = fj5Var;
    }
}
