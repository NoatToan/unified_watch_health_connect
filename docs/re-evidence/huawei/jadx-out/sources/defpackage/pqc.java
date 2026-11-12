package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class pqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("isAutoDetect")
    private int f45817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("genTime")
    private long f45818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("source")
    private int f45819c;

    @SerializedName("ftp")
    private int d;

    public int b() {
        return this.d;
    }

    public void c(int i) {
        this.d = i;
    }

    public int e() {
        return this.f45817a;
    }

    public void e(int i) {
        this.f45817a = i;
    }

    public void d(int i) {
        this.f45819c = i;
    }

    public long d() {
        return this.f45818b;
    }

    public void e(long j) {
        this.f45818b = j;
    }

    public String toString() {
        return "CycleFtpConfig{mFtp=" + this.d + ", mIsAutoDetect=" + this.f45817a + ", mSource=" + this.f45819c + ", mGenTime=" + this.f45818b + '}';
    }
}
