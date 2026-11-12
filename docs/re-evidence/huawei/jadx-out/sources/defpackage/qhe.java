package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qhe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("achieveDays")
    private int f46229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("encourageDate")
    private int f46230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("encourageType")
    private int f46231c;

    @SerializedName("currentDayAchievable")
    private int d;

    @SerializedName("needAchieveDays")
    private int e;

    public int e() {
        return this.f46229a;
    }

    public int b() {
        return this.e;
    }

    public int a() {
        return this.f46231c;
    }

    public boolean d() {
        return this.d == 1;
    }
}
