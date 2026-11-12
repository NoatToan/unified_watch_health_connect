package defpackage;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class gdo implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("motionPathStartTime")
    private long f34940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("num")
    private int f34941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("timeZone")
    private String f34942c;

    @SerializedName("huid")
    private String d;

    @SerializedName("minTime")
    private long e;

    public long e() {
        return this.e;
    }

    public int c() {
        return this.f34941b;
    }

    public String a() {
        return this.d;
    }

    public String toString() {
        return "ParticipateUserInfo{timeZone='" + this.f34942c + "', motionPathStartTime=" + this.f34940a + ", minTime=" + this.e + ", num=" + this.f34941b + ", huid=" + this.d + '}';
    }
}
