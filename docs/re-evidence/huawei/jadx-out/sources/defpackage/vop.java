package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class vop {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("memberHuid")
    private String f51421c;

    @SerializedName("messageType")
    private String d;

    public String a() {
        return this.f51421c;
    }

    public String b() {
        return this.d;
    }

    public String toString() {
        return "PendingMessageInfo{memberHuid='" + this.f51421c + "', messageType='" + this.d + "'}";
    }
}
