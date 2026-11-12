package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class soc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultCode")
    private String f48452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("totalCount")
    private int f48453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("duration")
    private long f48454c;

    @SerializedName("resultDesc")
    private String e;

    public String c() {
        return this.f48452a;
    }

    public String d() {
        return this.e;
    }

    public long e() {
        return this.f48454c;
    }

    public int b() {
        return this.f48453b;
    }

    public String toString() {
        return "UserAccumulatedPlayDurationRsp{resultCode='" + this.f48452a + "', resultDesc='" + this.e + "', duration='" + this.f48454c + "', totalCount='" + this.f48453b + "'}";
    }
}
