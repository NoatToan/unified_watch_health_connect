package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes17.dex */
public class snt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f48438b;

    @SerializedName("resultCode")
    private String e;

    public String b() {
        return this.e;
    }

    public String toString() {
        return "SetWorkoutRsp{resultCode='" + this.e + "', resultDesc='" + this.f48438b + "'}";
    }
}
