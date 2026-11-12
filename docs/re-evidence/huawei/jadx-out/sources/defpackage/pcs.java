package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes14.dex */
public class pcs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("mTitle")
    private String f45180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mContent")
    private String f45181b;

    public pcs(String str, String str2) {
        this.f45180a = str;
        this.f45181b = str2;
    }

    public String d() {
        return this.f45180a;
    }

    public String e() {
        return this.f45181b;
    }
}
