package defpackage;

import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.UnitUtil;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class gzv implements Serializable, Cloneable {
    private static final long serialVersionUID = -1353400425254333543L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f36304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f36305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedHashMap<String, String> f36306c;
    private int d;
    private float e;
    private int f;
    private int g;
    private int h;
    private float i;
    private int j;
    private long k;
    private float l;
    private int m;
    private int n;
    private int o;
    private int p;
    private float q;
    private float s;

    public gzv() {
        this.h = -1;
        this.j = -1;
        this.o = -1;
        this.f36305b = -101;
        this.f36304a = -1;
        this.p = -1;
        this.g = -1;
        this.f = -1;
        this.m = -1;
        this.d = -1;
        this.e = -1.0f;
        this.l = -1.0f;
        this.q = -1.0f;
        this.i = -1.0f;
        this.s = -1.0f;
        this.n = -1;
        this.f36306c = new LinkedHashMap<>();
    }

    public gzv(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.h = -1;
        this.j = -1;
        this.o = -1;
        this.f36305b = -101;
        this.f36304a = -1;
        this.p = -1;
        this.g = -1;
        this.f = -1;
        this.m = -1;
        this.d = -1;
        this.e = -1.0f;
        this.l = -1.0f;
        this.q = -1.0f;
        this.i = -1.0f;
        this.s = -1.0f;
        this.n = -1;
        this.f36306c = new LinkedHashMap<>();
        this.k = j;
        this.h = i;
        this.j = i2;
        this.o = i3;
        this.f36305b = i4;
        this.f36304a = i5;
        this.p = i6;
        this.g = i7;
    }

    public long h() {
        return this.k;
    }

    public void a(long j) {
        this.k = j;
    }

    public int a() {
        return this.h;
    }

    public void d(int i) {
        this.h = i;
    }

    public int d() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public int j() {
        return this.o;
    }

    public void g(int i) {
        this.o = i;
    }

    public int b() {
        return this.f36305b;
    }

    public void c(int i) {
        this.f36305b = i;
    }

    public int e() {
        return this.f36304a;
    }

    public void e(int i) {
        this.f36304a = i;
    }

    public int i() {
        return this.p;
    }

    public void j(int i) {
        this.p = i;
    }

    public int c() {
        return this.g;
    }

    public void a(int i) {
        this.g = i;
    }

    public int l() {
        return this.f;
    }

    public void i(int i) {
        this.f = i;
    }

    public int k() {
        return this.m;
    }

    public void h(int i) {
        this.m = i;
    }

    public float f() {
        return this.e;
    }

    public void d(float f) {
        this.e = f;
    }

    public float o() {
        return this.l;
    }

    public void c(float f) {
        this.l = f;
    }

    public float t() {
        return this.q;
    }

    public void a(float f) {
        this.q = f;
    }

    public float n() {
        return this.i;
    }

    public void b(float f) {
        this.i = f;
    }

    public float q() {
        return this.s;
    }

    public void e(float f) {
        this.s = f;
    }

    public void f(int i) {
        this.n = i;
    }

    public int m() {
        return this.n;
    }

    public LinkedHashMap<String, String> g() {
        return this.f36306c;
    }

    public void a(LinkedHashMap<String, String> linkedHashMap) {
        this.f36306c = linkedHashMap;
    }

    public String toString() {
        return "RunningPosture { mTime = " + this.k + ", mGroundContactTime = " + this.h + ", mGroundImpactAcceleration = " + this.j + ", mSwingAngle = " + this.o + ", mEversionExcursion = " + this.f36305b + ", mForeFootStrikePattern = " + this.f36304a + ", mWholeFootStrikePattern = " + this.p + ", mHindFootStrikePattern = " + this.g + ", mHangTime = " + this.f + ", mImpactHangRate = " + this.m + ", mCircleCadence = " + this.d + ", mStepLength = " + this.n + ", mAverageVerticalImpactRate = " + this.e + ", mImpactPeak = " + this.l + " mVerticalOscillation = " + this.q + ", mGcTimeBalance = " + this.i + ", mVerticalRatio = " + this.s + ", mExtraDataMap = " + this.f36306c + "}";
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean r() {
        return ((float) this.h) <= -1.0f && ((float) this.j) <= -1.0f && ((float) this.o) <= -1.0f && this.f36305b <= -101 && ((float) this.f36304a) <= -1.0f && ((float) this.p) <= -1.0f && ((float) this.g) <= -1.0f && ((float) this.f) <= -1.0f && ((float) this.m) <= -1.0f && Float.compare(this.e, -1.0f) <= 0 && Float.compare(this.l, -1.0f) <= 0 && Float.compare(this.q, -1.0f) <= 0 && Float.compare(this.i, -1.0f) <= 0 && Float.compare(this.s, -1.0f) <= 0 && ((float) this.n) <= -1.0f;
    }

    public static boolean a(MotionPathSimplify motionPathSimplify) {
        if (motionPathSimplify == null) {
            return true;
        }
        int iRequestAvgGroundContactTime = motionPathSimplify.requestAvgGroundContactTime();
        int iRequestAverageHangTime = motionPathSimplify.requestAverageHangTime();
        float fRequestGroundHangTimeRate = motionPathSimplify.requestGroundHangTimeRate();
        int iRequestAvgGroundImpactAcceleration = motionPathSimplify.requestAvgGroundImpactAcceleration();
        int iRequestAvgEversionExcursion = motionPathSimplify.requestAvgEversionExcursion();
        int iRequestAvgSwingAngle = motionPathSimplify.requestAvgSwingAngle();
        float fD = (float) UnitUtil.d(motionPathSimplify.getExtendDataFloat("avg_gc_tb"), 1);
        float extendDataFloat = motionPathSimplify.getExtendDataFloat("avg_v_osc");
        float extendDataFloat2 = motionPathSimplify.getExtendDataFloat("avg_v_s_r");
        int extendDataInt = motionPathSimplify.getExtendDataInt("avg_i_p");
        float extendDataFloat3 = motionPathSimplify.getExtendDataFloat("avg_v_i_r");
        LogUtil.a("Track_RunningPosture", "isAllDataZero contactTime = ", Integer.valueOf(iRequestAvgGroundContactTime), " impactAcceleration = ", Integer.valueOf(iRequestAvgGroundImpactAcceleration), " avgEversionExcursion = ", Integer.valueOf(iRequestAvgEversionExcursion), " avgSwingAngle = ", Integer.valueOf(iRequestAvgSwingAngle), " hangTime = ", Integer.valueOf(iRequestAverageHangTime), " groundHangTimeRate = ", Float.valueOf(fRequestGroundHangTimeRate), " avgTimeBalance = ", Float.valueOf(fD), " avgVerticalOscillation = ", Float.valueOf(extendDataFloat), " avgVerticalStrideRatio = ", Float.valueOf(extendDataFloat2), " avgImpactPeak = ", Integer.valueOf(extendDataInt), " averageVerticalImpactRate = ", Float.valueOf(extendDataFloat3));
        return iRequestAvgGroundContactTime <= 0 && iRequestAvgGroundImpactAcceleration <= 0 && iRequestAvgEversionExcursion <= 0 && iRequestAvgSwingAngle <= 0 && iRequestAverageHangTime <= 0 && Float.compare(fRequestGroundHangTimeRate, 0.0f) <= 0 && Float.compare(fD, 0.0f) <= 0 && Float.compare(extendDataFloat, 0.0f) <= 0 && Float.compare(extendDataFloat2, 0.0f) <= 0 && extendDataInt <= 0 && Float.compare(extendDataFloat3, 0.0f) <= 0;
    }

    public void e(int i, double d) {
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GROUND_CONTACT_TIME.value()) {
            d((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_SWING_ANGLE.value()) {
            g((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_EVERSION.value()) {
            c((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FORE_STEPS.value()) {
            e((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_WHOLE_STEPS.value()) {
            j((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HIND_STEPS.value()) {
            a((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_HANG_TIME.value()) {
            i((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_GROUND_IMPACT_ACCELERATION.value()) {
            b((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_FLIGHT_RATIO.value()) {
            h((int) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_LOADING_RATE.value()) {
            d((float) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_ACTIVE_PEAK.value()) {
            c((float) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_VERTICAL_RATIO.value()) {
            e((float) d);
            return;
        }
        if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_STRIDE.value()) {
            f((int) d);
        } else if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_VERTICAL_OSCILLATION.value()) {
            a((float) d);
        } else if (i == DicDataTypeUtil.DataType.REALTIME_SPORT_DATA_GC_TIME_BALANCE.value()) {
            b((float) d);
        }
    }
}
