package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class jbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("imageUrl")
    private String f38350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("imageBigUrl")
    private String f38351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("startTime")
    private long f38352c;

    @SerializedName("endTime")
    private long d;

    @SerializedName("backgroundImageUrl")
    private String e;

    public void a(long j) {
        this.f38352c = j;
    }

    public void b(long j) {
        this.d = j;
    }

    public String e() {
        return this.f38350a;
    }

    public void c(String str) {
        this.f38350a = str;
    }

    public String a() {
        return this.f38351b;
    }

    public void a(String str) {
        this.f38351b = str;
    }

    public String b() {
        return this.e;
    }

    public void b(String str) {
        this.e = str;
    }

    public boolean d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f38352c;
        if (j != 0) {
            long j2 = this.d;
            if (j2 != 0) {
                return jCurrentTimeMillis >= j && jCurrentTimeMillis <= j2;
            }
        }
        if (j != 0 && this.d == 0) {
            return jCurrentTimeMillis >= j;
        }
        if (j == 0) {
            long j3 = this.d;
            if (j3 != 0 && jCurrentTimeMillis <= j3) {
                return true;
            }
        }
        return false;
    }
}
