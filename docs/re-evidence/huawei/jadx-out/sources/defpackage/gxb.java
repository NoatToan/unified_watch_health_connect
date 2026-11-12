package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class gxb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("questionnaire")
    private List<String> f36177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("monthly_level")
    private int f36178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("monthly_rhythm")
    private int f36179c;

    @SerializedName("monthly_problem")
    private int d;

    @SerializedName("monthly_problem_val")
    private int e;

    @SerializedName("result_code")
    private int h;

    public int c() {
        return this.h;
    }

    public List<String> e() {
        return this.f36177a;
    }

    public String toString() {
        return "QuestionnaireResultBean{resultCode=" + this.h + ", questionnaire=" + this.f36177a + ", monthlyRhythm='" + this.f36179c + "', monthlyProblem='" + this.d + "', monthlyLevel='" + this.f36178b + "', monthlyProblemVal='" + this.e + "'}";
    }
}
