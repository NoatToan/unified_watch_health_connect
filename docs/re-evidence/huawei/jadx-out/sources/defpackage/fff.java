package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes28.dex */
public class fff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("userTimes")
    private int f33987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("rank")
    private int f33988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("people")
    private int f33989c;

    @SerializedName("id")
    private int d;

    @SerializedName("userWeekTimes")
    private int e;

    @SerializedName("weekRank")
    private int f;

    @SerializedName("weekNo")
    private int i;

    public int e() {
        return this.d;
    }

    public int b() {
        return this.f33988b;
    }

    public int d() {
        return this.f33989c;
    }

    public int a() {
        return this.i;
    }

    public int c() {
        return this.f;
    }

    public String toString() {
        return "Stats{mId=" + this.d + ", mRank=" + this.f33988b + ", mPeople=" + this.f33989c + ", mWeekNo=" + this.i + ", mWeekRank=" + this.f + ", mUserTimes=" + this.f33987a + ", mUserWeekTimes=" + this.e + "}";
    }
}
