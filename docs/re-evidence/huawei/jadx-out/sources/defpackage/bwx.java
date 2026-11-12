package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes23.dex */
public class bwx extends bwi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("challengeStatus")
    private int f1265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("joinTime")
    private int f1266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("joinStatus")
    private int f1267c;

    @SerializedName("cfgVersion")
    private int d;

    @SerializedName("cfgUpgradeTime")
    private int e;

    @SerializedName("kakaMakeup")
    private int h;

    public void b(int i) {
        this.e = i;
    }

    public void e(int i) {
        this.f1265a = i;
    }

    public void d(int i) {
        this.f1267c = i;
    }

    public void c(int i) {
        this.f1266b = i;
    }

    public int c() {
        return this.e;
    }

    public int e() {
        return this.f1265a;
    }

    public int d() {
        return this.f1266b;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelSyncResponse{cfgUpgradeTime=" + this.e + ", cfgVersion=" + this.d + ", challengeStatus=" + this.f1265a + ", joinStatus=" + this.f1267c + ", joinTime=" + this.f1266b + ", kakaMakeup=" + this.h + "}";
    }
}
