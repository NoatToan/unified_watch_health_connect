package defpackage;

import com.huawei.hihealth.HiHealthData;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes19.dex */
public class uww implements Serializable {
    private static final long serialVersionUID = 7048918815967562789L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f50678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f50679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f50680c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private double j;
    private double k;
    private long l;
    private double m;

    public uww(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            LogUtil.c("AiBodyShapeBean", "hiHealthData is null, return");
            return;
        }
        this.e = hiHealthData.getDouble("bustGirth");
        this.k = hiHealthData.getDouble("waistGirth");
        this.f = hiHealthData.getDouble("hipline");
        this.h = hiHealthData.getDouble("thighGirth");
        this.f50678a = hiHealthData.getDouble("calves");
        this.f50679b = hiHealthData.getDouble("armCircumference");
        this.j = hiHealthData.getDouble("headCircumference");
        this.g = hiHealthData.getDouble("legLength");
        this.f50680c = hiHealthData.getDouble("armLength");
        this.i = hiHealthData.getDouble("shoulderWidth");
        this.m = hiHealthData.getDouble("waistHipRatio");
        this.d = hiHealthData.getDouble("bodyForm");
        this.l = hiHealthData.getStartTime();
    }

    public double c() {
        return this.d;
    }

    public double f() {
        return this.m;
    }

    public double b() {
        return this.f50679b;
    }

    public double e() {
        return this.f50678a;
    }

    public double j() {
        return this.h;
    }

    public double d() {
        return this.f;
    }

    public double g() {
        return this.k;
    }

    public double a() {
        return this.e;
    }

    public long h() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        uww uwwVar = (uww) obj;
        return this.l == uwwVar.l && Double.compare(uwwVar.e, this.e) == 0 && Double.compare(uwwVar.k, this.k) == 0 && Double.compare(uwwVar.f, this.f) == 0 && Double.compare(uwwVar.h, this.h) == 0 && Double.compare(uwwVar.f50678a, this.f50678a) == 0 && Double.compare(uwwVar.f50679b, this.f50679b) == 0 && Double.compare(uwwVar.j, this.j) == 0 && Double.compare(uwwVar.g, this.g) == 0 && Double.compare(uwwVar.f50680c, this.f50680c) == 0 && Double.compare(uwwVar.i, this.i) == 0 && Double.compare(uwwVar.m, this.m) == 0 && Double.compare(uwwVar.d, this.d) == 0;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.l), Double.valueOf(this.e), Double.valueOf(this.k), Double.valueOf(this.f), Double.valueOf(this.h), Double.valueOf(this.f50678a), Double.valueOf(this.f50679b), Double.valueOf(this.j), Double.valueOf(this.g), Double.valueOf(this.f50680c), Double.valueOf(this.i), Double.valueOf(this.m), Double.valueOf(this.d));
    }

    public String toString() {
        return "AiBodyShapeBean{mTime=" + this.l + ", mBustGirth=" + this.e + ", mWaistGirth=" + this.k + ", mHipLine=" + this.f + ", mThighGirth=" + this.h + ", mCalves=" + this.f50678a + ", mArmCircumference=" + this.f50679b + ", mHeadCircumference=" + this.j + ", mLegLength=" + this.g + ", mArmLength=" + this.f50680c + ", mShoulderWidth=" + this.i + ", mWaistHipRatio=" + this.m + ", mBodyForm=" + this.d + '}';
    }
}
