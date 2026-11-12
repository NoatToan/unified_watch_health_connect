package defpackage;

import com.google.gson.annotations.SerializedName;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;

/* JADX INFO: loaded from: classes23.dex */
public class cjr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("uid")
    private String f1643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("status")
    private String f1644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(SdkCfgSha256Record.PKGNAME)
    private String f1645c;

    @SerializedName("appLogo")
    private String d;

    @SerializedName("appName")
    private String e;

    public String b() {
        return this.f1643a;
    }

    public void c(String str) {
        this.f1643a = str;
    }

    public String e() {
        return this.f1645c;
    }

    public void e(String str) {
        this.f1645c = str;
    }

    public void a(String str) {
        this.e = str;
    }

    public void b(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.f1644b = str;
    }
}
