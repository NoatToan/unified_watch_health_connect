package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class fes {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("timestamp")
    private String f33962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("msgContent")
    private String f33963c;

    @SerializedName("msgType")
    private String d;

    public String a() {
        return this.f33962b;
    }

    public String c() {
        return this.d;
    }

    public String b() {
        return this.f33963c;
    }

    public String toString() {
        return "DoctorImInfoMap{mTimestamp=" + this.f33962b + ", mMessageType=" + this.d + ", mMessageContent=" + this.f33963c + "}";
    }
}
