package defpackage;

import com.google.gson.annotations.SerializedName;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes40.dex */
public class oei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activationCode")
    private String f44235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timestamp")
    private long f44236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("ciphertextSign")
    private String f44237c;

    @SerializedName("carrierType")
    private int d;

    @SerializedName("ciphertext")
    private String e;

    public void b(int i) {
        this.d = i;
    }

    public void b(String str) {
        this.f44235a = str;
    }

    public void b(long j) {
        this.f44236b = j;
    }

    public void c(String str) {
        this.e = str;
    }

    public void e(String str) {
        this.f44237c = str;
    }

    public String toString() {
        return "EncryptESimProfileInfo{carrierType=" + this.d + ", acCode='" + CommonUtil.n(this.f44235a) + "', timestamp=" + this.f44236b + ", ct=" + CommonUtil.n(this.e) + ", cts='" + CommonUtil.n(this.f44237c) + "'}";
    }
}
