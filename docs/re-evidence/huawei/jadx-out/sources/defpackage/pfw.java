package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes42.dex */
public class pfw extends pft {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("enabled")
    private String f45300a;

    @SerializedName("requestFlag")
    private String d;

    @SerializedName("operator")
    private String e;

    public void g(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.f45300a = str;
    }

    public void i(String str) {
        this.d = str;
    }
}
