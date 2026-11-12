package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public class bwm extends bwi {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("healthLifeChallengeBeans")
    private List<ffd> f1252c;

    public List<ffd> c() {
        return this.f1252c;
    }

    @Override // defpackage.bwi
    public String toString() {
        return "HealthModelChallengesResponse{mHealthLifeChallengeBeans=" + this.f1252c + "}";
    }
}
