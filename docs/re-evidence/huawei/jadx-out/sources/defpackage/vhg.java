package defpackage;

import com.google.gson.annotations.SerializedName;
import health.compact.a.HiDateUtil;

/* JADX INFO: loaded from: classes43.dex */
public class vhg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("endTime")
    private long f51096a;

    @SerializedName("startTime")
    private long d;

    @SerializedName("type")
    private int e;

    public void d(int i) {
        this.e = i;
    }

    public void d(long j) {
        this.d = j;
    }

    public void e(long j) {
        this.f51096a = j;
    }

    public String toString() {
        return "FastingLiteFaData{mType=" + this.e + ", mStartTime=" + HiDateUtil.e(this.d, "yyyy-MM-dd HH:mm:ss:SSS") + ", mEndTime=" + HiDateUtil.e(this.f51096a, "yyyy-MM-dd HH:mm:ss:SSS") + '}';
    }
}
