package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes15.dex */
public class qdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("meanDia")
    private int f46029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("goalMetCount")
    private int f46030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("mean")
    private String f46031c;

    @SerializedName("abnormalDays")
    private int d;

    @SerializedName("currentValue")
    private int e;

    @SerializedName("textID")
    private int f;

    @SerializedName("meanSys")
    private int g;

    public int i() {
        return this.f;
    }

    public int c() {
        return this.f46030b;
    }

    public String b() {
        return this.f46031c;
    }

    public int g() {
        return this.g;
    }

    public int a() {
        return this.f46029a;
    }

    public int e() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public String toString() {
        return "Data{mTextId=" + this.f + ", mGoalMetCount=" + this.f46030b + ", mMean=" + this.f46031c + ", mAbnormalDays=" + this.d + ", mCurrentValue=" + this.e + '}';
    }
}
