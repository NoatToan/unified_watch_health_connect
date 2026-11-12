package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;

/* JADX INFO: loaded from: classes15.dex */
public class pqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(RemoteMessageConst.Notification.TAG)
    private String f45824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("min")
    private double f45825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("name")
    private String f45826c;

    @SerializedName("max")
    private double e;

    public double b() {
        return this.f45825b;
    }

    public double a() {
        return this.e;
    }

    public String e() {
        return this.f45826c;
    }

    public String c() {
        return this.f45824a;
    }

    public String toString() {
        return "PwrLevelConfig{mMin=" + this.f45825b + ", mMax=" + this.e + ", mName='" + this.f45826c + "', mTag='" + this.f45824a + "'}";
    }
}
