package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes10.dex */
public class lpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("appAuditInfo")
    private lpm f40606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("mcp")
    private String f40607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("appName")
    private String f40608c;

    @SerializedName("appId")
    private int d;

    @SerializedName("packageName")
    private String e;

    @SerializedName("prodType")
    private int g;

    public String a() {
        return this.f40607b;
    }

    public String toString() {
        return "AppInfo{appId=" + this.d + ", prodType=" + this.g + ", appName='" + this.f40608c + "', packageName='" + this.e + "', mcp='" + this.f40607b + "', appAuditInfo=" + this.f40606a + '}';
    }
}
