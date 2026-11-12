package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes8.dex */
public class gng {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("totalExerciseDuration")
    private double f35804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("totalRunningDistance")
    private double f35805b;

    @SerializedName("completedCourseNum")
    private int d;

    @SerializedName("totalCourseNum")
    private int e;

    public int d() {
        return this.d;
    }

    public int a() {
        return this.e;
    }

    public double b() {
        return this.f35805b;
    }

    public double c() {
        return this.f35804a;
    }

    public String toString() {
        return "PlanProgressInfo{mCompletedCourseNum=" + this.d + ", mTotalCourseNum=" + this.e + ", mTotalRunningDistance=" + this.f35805b + ", mTotalExerciseDuration=" + this.f35804a + '}';
    }
}
