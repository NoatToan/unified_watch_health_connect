package defpackage;

import com.google.gson.annotations.SerializedName;
import health.compact.a.HiDateUtil;
import java.io.Serializable;

/* JADX INFO: loaded from: classes33.dex */
public class iup implements Serializable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    private String f38043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("preStartTime")
    private long f38044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("plan")
    private String f38045c;

    @SerializedName("endTime")
    private long d;

    @SerializedName("startTime")
    private long e;

    @SerializedName("type")
    private int j;

    public int c() {
        return this.j;
    }

    public long a() {
        return this.d;
    }

    public String toString() {
        return "FastingLiteViewBean{mType=" + this.j + ", mTitle='" + this.f38043a + "', mPlan='" + this.f38045c + "', mPreStartTime=" + HiDateUtil.e(this.f38044b, "yyyy-MM-dd HH:mm:ss:SSS") + ", mStartTime=" + HiDateUtil.e(this.e, "yyyy-MM-dd HH:mm:ss:SSS") + ", mEndTime=" + HiDateUtil.e(this.d, "yyyy-MM-dd HH:mm:ss:SSS") + '}';
    }
}
