package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class nqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("start_time")
    private long f43483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("end_time")
    private long f43484b;

    @SerializedName("type")
    private int d;

    @SerializedName("device_uniquecode")
    private String e;

    public long b() {
        return this.f43483a;
    }

    public int e() {
        return this.d;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("ChangeInfoBean{type=");
        stringBuffer.append(this.d);
        stringBuffer.append(", startTime = ").append(this.f43483a);
        stringBuffer.append(", endTime = ").append(this.f43484b);
        stringBuffer.append(", deviceId = ").append(this.e);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
