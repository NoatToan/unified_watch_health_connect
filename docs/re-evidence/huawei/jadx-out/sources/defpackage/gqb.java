package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class gqb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("devId")
    private String f35879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("commonUse")
    private String f35880b = "FAMILY_SPACE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("operation")
    private String f35881c;

    @SerializedName("pushUdid")
    private String e;

    public gqb() {
    }

    public gqb(String str, String str2, String str3) {
        this.f35879a = str;
        this.f35881c = str2;
        this.e = str3;
    }

    public String toString() {
        return "{devId=" + this.f35879a + ", commonUse=" + this.f35880b + ", operation=" + this.f35881c + ", pushUdid=" + this.e + '}';
    }
}
