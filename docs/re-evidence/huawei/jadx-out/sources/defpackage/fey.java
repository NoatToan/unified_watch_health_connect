package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("symptom")
    private String f33972a;

    @SerializedName("interventionTarget")
    private fex d;

    @SerializedName("interventionDimensions")
    private List<ffa> e;

    public String toString() {
        return "HealthInterventionPlan{mSymptom=" + this.f33972a + ", mHealthInterventionTarget=" + this.d + ", mHealthInterventionDimensionList=" + this.e + "}";
    }
}
