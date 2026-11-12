package defpackage;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes31.dex */
public class gxe extends gxa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("monthly_rhythm")
    private int f36184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("monthly_level")
    private int f36185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("monthly_problem")
    private int f36186c;

    @SerializedName("monthly_problem_val")
    private int d;

    public void a(int i) {
        this.f36184a = i;
    }

    public void c(int i) {
        this.f36186c = i;
    }

    public void e(int i) {
        this.f36185b = i;
    }

    public void d(int i) {
        this.d = i;
    }

    public String toString() {
        return "QuestionnaireMonthlyResult{monthlyRhythm='" + this.f36184a + "', monthlyProblem='" + this.f36186c + "', monthlyLevel='" + this.f36185b + "', monthlyProblemVal='" + this.d + "'}" + super.toString();
    }
}
