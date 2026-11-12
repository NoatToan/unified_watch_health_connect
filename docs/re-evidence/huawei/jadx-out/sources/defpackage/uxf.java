package defpackage;

import com.google.gson.annotations.SerializedName;
import health.compact.a.HiDateUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class uxf implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("preStartTime")
    private long f50700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startTime")
    private long f50701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("endTime")
    private long f50702c;

    @SerializedName("title")
    private String d;

    @SerializedName("plan")
    private String e;

    @SerializedName("type")
    private int i;

    public int d() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public void c(String str) {
        this.d = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public long b() {
        return this.f50700a;
    }

    public void e(long j) {
        this.f50700a = j;
    }

    public long e() {
        return this.f50701b;
    }

    public void c(long j) {
        this.f50701b = j;
    }

    public long a() {
        return this.f50702c;
    }

    public void a(long j) {
        this.f50702c = j;
    }

    public String toString() {
        return "FastingLiteViewBean{mType=" + this.i + ", mTitle='" + this.d + "', mPlan='" + this.e + "', mPreStartTime=" + HiDateUtil.e(this.f50700a, "yyyy-MM-dd HH:mm:ss:SSS") + ", mStartTime=" + HiDateUtil.e(this.f50701b, "yyyy-MM-dd HH:mm:ss:SSS") + ", mEndTime=" + HiDateUtil.e(this.f50702c, "yyyy-MM-dd HH:mm:ss:SSS") + '}';
    }
}
