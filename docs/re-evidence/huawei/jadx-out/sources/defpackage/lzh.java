package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lzh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("modifyClient")
    private String f41194a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("switchStatus")
    private String[] f41195c;

    @SerializedName("modifiedTime")
    private String d;

    public void d(String str) {
        this.f41194a = str;
    }

    public String d() {
        return this.d;
    }

    public void b(String str) {
        this.d = str;
    }

    public String[] b() {
        return this.f41195c;
    }

    public void b(String[] strArr) {
        this.f41195c = strArr;
    }
}
