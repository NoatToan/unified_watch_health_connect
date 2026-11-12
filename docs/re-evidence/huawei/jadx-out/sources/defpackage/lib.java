package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lib {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("datasource")
    private String f40187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("extensions")
    private String f40188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private long f40189c;

    @SerializedName("relatedDatas")
    private List<lhz> d;

    @SerializedName("orderId")
    private String e;

    @SerializedName("interpretTime")
    private long i;

    @SerializedName("status")
    private int j;

    public List<lhz> d() {
        return this.d;
    }

    public void d(List<lhz> list) {
        this.d = list;
    }

    public int c() {
        return this.j;
    }

    public void b(int i) {
        this.j = i;
    }

    public void a(long j) {
        this.i = j;
    }

    public void d(String str) {
        this.f40188b = str;
    }

    public String a() {
        return this.f40188b;
    }

    public void e(String str) {
        this.f40187a = str;
    }

    public void c(long j) {
        this.f40189c = j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(16);
        sb.append("ts=" + this.i);
        sb.append(",rds=");
        sb.append(this.d);
        sb.append(",status=" + this.j);
        sb.append(",es=" + this.f40188b);
        sb.append(",orderId" + this.e);
        sb.append(",startTime" + this.f40189c);
        return sb.toString();
    }
}
