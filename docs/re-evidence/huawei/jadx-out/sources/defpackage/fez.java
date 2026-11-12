package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class fez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("appName")
    private String f33973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("configData")
    private String f33974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("configName")
    private String f33975c;

    @SerializedName("appType")
    private String d;

    @SerializedName("configDescription")
    private String e;

    @SerializedName("type")
    private String h;

    @SerializedName("version")
    private long i;

    @SerializedName("id")
    private String j;

    public String b() {
        return this.f33974b;
    }

    public String toString() {
        return "GetUserSampleConfig{mType=" + this.h + ", mId=" + this.j + ", mConfigData=" + this.f33974b + ", mConfigName=" + this.f33975c + ", mConfigDescription=" + this.e + ", mVersion=" + this.i + ", mAppName=" + this.f33973a + ", mAppType=" + this.d + "}";
    }
}
