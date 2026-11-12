package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class gwv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("monthly_problem_val")
    private int f36158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("monthly_level")
    private int f36159b;

    @SerializedName("monthly_rhythm")
    private int d;

    @SerializedName("monthly_problem")
    private int e;

    public int a() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public int e() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int b() {
        return this.f36159b;
    }

    public void c(int i) {
        this.f36159b = i;
    }

    public int d() {
        return this.f36158a;
    }

    public void b(int i) {
        this.f36158a = i;
    }

    public String toString() {
        return "QuestionnaireMonthlyResult{monthlyRhythm='" + this.d + "', monthlyProblem='" + this.e + "', monthlyLevel='" + this.f36159b + "', monthlyProblemVal='" + this.f36158a + "'}";
    }
}
