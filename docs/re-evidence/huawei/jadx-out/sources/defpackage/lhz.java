package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lhz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("relatedDataDeviceUuid")
    private String f40179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("relatedPackageName")
    private String f40180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("relatedDataType")
    private int f40181c;

    @SerializedName("relatedDataEndTime")
    private long d;

    @SerializedName("relatedDataStartTime")
    private long e;

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("st=");
        sb.append(this.e);
        sb.append(", et=");
        sb.append(this.d);
        sb.append(",type=");
        sb.append(this.f40181c);
        sb.append(", duc=");
        sb.append(this.f40179a);
        sb.append(", pn=");
        sb.append(this.f40180b);
        return sb.toString();
    }

    public long c() {
        return this.e;
    }

    public void e(long j) {
        this.e = j;
    }

    public long e() {
        return this.d;
    }

    public void b(long j) {
        this.d = j;
    }

    public int a() {
        return this.f40181c;
    }

    public void c(int i) {
        this.f40181c = i;
    }

    public String b() {
        return this.f40179a;
    }

    public void b(String str) {
        this.f40179a = str;
    }

    public String d() {
        return this.f40180b;
    }

    public void e(String str) {
        this.f40180b = str;
    }
}
