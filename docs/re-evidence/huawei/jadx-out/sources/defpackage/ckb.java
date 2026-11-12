package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ckb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("encryptData")
    private String f1668a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private int f1669c = 1;

    public String d() {
        return this.f1668a;
    }

    public void e(String str) {
        this.f1668a = str;
    }

    public int e() {
        return this.f1669c;
    }
}
