package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class ffb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("id")
    private String f33979a;

    @SerializedName("type")
    private String e;

    public ffb(String str, String str2) {
        this.e = str;
        this.f33979a = str2;
    }

    public String toString() {
        return "GetUserSampleConfig{mType=" + this.e + ", mId=" + this.f33979a + "}";
    }
}
