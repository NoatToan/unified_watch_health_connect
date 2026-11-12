package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes11.dex */
public class nqp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("startTime")
    private long f43465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("startLocalDate")
    private String f43466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dataSourceOptions")
    private nqv f43467c;

    @SerializedName("endLocalDate")
    private String d;

    @SerializedName("endTime")
    private long e;

    @SerializedName("subUserOption")
    private d g;

    @SerializedName("timeZone")
    private String j;

    public String i() {
        return this.j;
    }

    public String b() {
        return this.f43466b;
    }

    public String a() {
        return this.d;
    }

    public long c() {
        return this.f43465a;
    }

    public void a(long j) {
        this.f43465a = j;
    }

    public long e() {
        return this.e;
    }

    public void b(long j) {
        this.e = j;
    }

    public nqv d() {
        return this.f43467c;
    }

    public String j() {
        d dVar = this.g;
        if (dVar == null) {
            return "";
        }
        return dVar.a();
    }

    public String toString() {
        return "DataRequest{startLocalDate='" + this.f43466b + "', endLocalDate='" + this.d + "', startTime=" + this.f43465a + ", endTime=" + this.e + ", dataSourceOptions=" + this.f43467c + ", subUserOption=" + this.g + '}';
    }

    class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("subUserOnly")
        private boolean f43468b;

        @SerializedName("subUser")
        private String d;

        public String a() {
            return this.d;
        }

        public String toString() {
            return "SubUserOption{subUser='" + this.d + "', subUserOnly=" + this.f43468b + '}';
        }
    }
}
