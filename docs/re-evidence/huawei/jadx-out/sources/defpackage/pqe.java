package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class pqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ftpValue")
    private double f45821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("pwrLevelTag")
    private String f45822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("pwrLevelDesc")
    private String f45823c;

    @SerializedName("recordTime")
    private int d;

    @SerializedName("pwr")
    private double e;

    public double d() {
        return this.f45821a;
    }

    public int b() {
        return this.d;
    }

    public double c() {
        return this.e;
    }

    public String a() {
        return this.f45823c;
    }

    public String e() {
        return this.f45822b;
    }

    public String toString() {
        return "FtpRecord{mFtpValue=" + this.f45821a + ", mRecordTime=" + this.d + ", mPwr=" + this.e + ", mPwrLevelDesc='" + this.f45823c + "', mPwrLevelTag='" + this.f45822b + "'}";
    }
}
