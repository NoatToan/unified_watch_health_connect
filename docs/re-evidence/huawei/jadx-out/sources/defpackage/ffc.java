package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ffc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("commentStatus")
    private int f33980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("challengeId")
    private String f33981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("commentInfo")
    private fep f33982c;

    @SerializedName("customTaskListDetails")
    private List<feu> d;

    @SerializedName("dimensionListDetails")
    private List<fet> e;

    @SerializedName("mainTargetDetails")
    private List<ffg> g;

    @SerializedName("version")
    private String h;

    @SerializedName("interventionPlan")
    private fey j;

    public String c() {
        return this.f33981b;
    }

    public fep b() {
        return this.f33982c;
    }

    public int a() {
        return this.f33980a;
    }

    public String toString() {
        return "HealthWeekReport{mVersion=" + this.h + ", mChallengeId=" + this.f33981b + ", mInterventionPlan=" + this.j + ", mCommentInfo=" + this.f33982c + ", mCommentStatus=" + this.f33980a + ", mMainTargetSubDataDetailList=" + this.g + ", mDimensionDetailList=" + this.e + ", mCustomTaskDetailList=" + this.d + "}";
    }
}
