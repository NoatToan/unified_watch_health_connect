package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lhx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("dataSource")
    private String f40176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("metadata")
    private String f40177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private long f40178c;

    @SerializedName("serviceData")
    private String d;

    @SerializedName("endTime")
    private long e;

    @SerializedName("version")
    private long g;

    @SerializedName("timeZone")
    private String h;

    @SerializedName("type")
    private int i;

    public long b() {
        return this.f40178c;
    }

    public void b(long j) {
        this.f40178c = j;
    }

    public long e() {
        return this.e;
    }

    public void c(long j) {
        this.e = j;
    }

    public int h() {
        return this.i;
    }

    public void e(int i) {
        this.i = i;
    }

    public String a() {
        return this.f40176a;
    }

    public void b(String str) {
        this.f40176a = str;
    }

    public String c() {
        return this.d;
    }

    public void e(String str) {
        this.d = str;
    }

    public String d() {
        return this.h;
    }

    public void d(String str) {
        this.h = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("st=" + this.f40178c);
        sb.append(",et=" + this.e);
        sb.append(",type=" + this.i);
        sb.append(",ds=" + this.f40176a);
        sb.append(",sd=" + this.d);
        sb.append(",tz=" + this.h);
        sb.append(",ver=" + this.g);
        sb.append(",metadata=" + this.f40177b);
        return sb.toString();
    }
}
