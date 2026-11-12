package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes19.dex */
public class ttm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("resultDesc")
    private String f49644a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("resultCode")
    private int f49645c;

    public int a() {
        return this.f49645c;
    }

    public String c() {
        return this.f49644a;
    }

    public String toString() {
        return "ThreeCircleTaskBaseResponse{resultCode=" + this.f49645c + ", resultDesc=" + this.f49644a + '}';
    }
}
