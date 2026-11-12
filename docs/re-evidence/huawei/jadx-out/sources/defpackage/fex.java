package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fex {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("version")
    private String f33971c;

    @SerializedName("mainTarget")
    private List<fev> e;

    public String toString() {
        return "HealthInterventionTarget{mVersion=" + this.f33971c + ", mDataRuleList=" + this.e + "}";
    }
}
