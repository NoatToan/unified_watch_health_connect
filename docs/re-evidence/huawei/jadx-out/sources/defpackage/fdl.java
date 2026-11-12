package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes7.dex */
public class fdl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("ohMinVersion")
    protected String f33897a;

    @SerializedName("iosMinVersion")
    protected String d;

    @SerializedName("androidMinVersion")
    protected String e;

    public String a() {
        return this.e;
    }

    public String toString() {
        return "{androidMinVersion: " + this.e + ", iosMinVersion: " + this.d + ", ohMinVersion: " + this.f33897a + "}";
    }
}
