package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class snx {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("listPng")
    private String f48444c;

    @SerializedName("detailPng")
    private String d;

    @SerializedName("backPng")
    private String e;

    public String d() {
        return this.d;
    }

    public String a() {
        return this.e;
    }

    public String e() {
        return this.f48444c;
    }

    public String toString() {
        return "PictureDaoBean{detailPng='" + this.d + "', backPng='" + this.e + "', listPng='" + this.f48444c + "'}";
    }
}
