package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class gnd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("category")
    private int f35790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("weekStartTime")
    private long f35791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("planId")
    private String f35792c;

    @SerializedName("language")
    private String d;

    @SerializedName("subCategory")
    private int e;

    public String c() {
        return this.f35792c;
    }

    public int a() {
        return this.f35790a;
    }

    public int b() {
        return this.e;
    }

    public String toString() {
        return "PlanStopInfo{planId='" + this.f35792c + "', category=" + this.f35790a + ", subCategory=" + this.e + ", language='" + this.d + "', weekStartTime=" + this.f35791b + '}';
    }
}
