package defpackage;

import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;

/* JADX INFO: loaded from: classes3.dex */
public class ij5 extends be {
    public static final byte[] d = {-87, -42, -21, 69, -15, 60, 112, -126, -128, -60, -106, 123, HMProSyncDataBaseProfile.DATA_TYPE_FIRSTBEAT_DETAIL, 31, 94, -83, -10, 88, -21, -92, -64, HMProSyncDataBaseProfile.DATA_TYPE_BLOOD_PRESSURE_MEASURE_RESULT, HMProSyncDataBaseProfile.DATA_STAND_HOUR, HMProSyncDataBaseProfile.DATA_TYPE_HEIGHT_LOW_HR, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -39, 107, -16, HMProSyncDataBaseProfile.DATA_SPO2_POINT, -54, 78, 23, -8, -23, 114, HMProSyncDataBaseProfile.DATA_TYPE_PAI, -58, 21, -76, HMProSyncDataBaseProfile.DATA_TYPE_RESTING_HEART_RATE, HMProSyncDataBaseProfile.DATA_SPO2_ODI, -105, 95, 11, -63, -34, -93, 100, HMProSyncDataBaseProfile.DATA_TYPE_SLEEP_BREATH_RATE_DATA, -75, 100, -22, HMProSyncDataBaseProfile.DATA_STATISTIC_V2, 23, -97, -48, HMProSyncDataBaseProfile.DATA_TYPE_PRESSURE_SINGLE, HMProSyncDataBaseProfile.DATA_TYPE_SLEEPING_BLOOD_PRESSURE_RESULT, 109, -72, -6, -59, 121, 4};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fe f21194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ej5 f21195b;
    public byte[] c = d;

    public ij5(fe feVar) {
        this.f21194a = feVar;
    }

    public static byte[] h() {
        return d;
    }

    public static ij5 j(Object obj) {
        if (obj instanceof ij5) {
            return (ij5) obj;
        }
        if (obj == null) {
            throw new IllegalArgumentException("object parse error");
        }
        se seVarQ = se.q(obj);
        ij5 ij5Var = seVarQ.t(0) instanceof fe ? new ij5(fe.w(seVarQ.t(0))) : new ij5(ej5.k(seVarQ.t(0)));
        if (seVarQ.size() == 2) {
            byte[] bArrR = ge.q(seVarQ.t(1)).r();
            ij5Var.c = bArrR;
            if (bArrR.length != d.length) {
                throw new IllegalArgumentException("object parse error");
            }
        }
        return ij5Var;
    }

    public byte[] g() {
        return this.c;
    }

    public ej5 i() {
        return this.f21195b;
    }

    public fe k() {
        return this.f21194a;
    }

    public boolean l() {
        return this.f21194a != null;
    }

    @Override // defpackage.be, defpackage.gd
    public pe toASN1Primitive() {
        id idVar = new id();
        fe feVar = this.f21194a;
        if (feVar != null) {
            idVar.a(feVar);
        } else {
            idVar.a(this.f21195b);
        }
        if (!wj1.a(this.c, d)) {
            idVar.a(new pg5(this.c));
        }
        return new xg5(idVar);
    }

    public ij5(ej5 ej5Var) {
        this.f21195b = ej5Var;
    }
}
