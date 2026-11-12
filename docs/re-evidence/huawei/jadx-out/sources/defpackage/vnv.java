package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vnv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("devType")
    private String f51383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("udid")
    private String f51384b;

    @SerializedName("deviceName")
    private String d;

    @SerializedName("sn")
    private String e;

    public String c() {
        return this.f51383a;
    }

    public String e() {
        return this.f51384b;
    }

    public String toString() {
        return "DevInfo{devType=" + this.f51383a + ", deviceName=" + this.d + ", udid=" + this.f51384b + ", sn=" + this.e + '}';
    }
}
