package jv1;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001a¨\u0006\u001b"}, d2 = {"Ljv1/y;", "", "", "recentWeeklyAvgValue", "", "recentWeeklyAvgType", "avgSpeed", "Ljv1/b0;", "swimAbility", "", "hasMinimumHistory", "<init>", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljv1/b0;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "b", "Ljava/lang/String;", "getRecentWeeklyAvgType", "()Ljava/lang/String;", "d", "Ljv1/b0;", "()Ljv1/b0;", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recentWeeklyAvgValue")
    private final Double recentWeeklyAvgValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recentWeeklyAvgType")
    private final String recentWeeklyAvgType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgSpeed")
    private final Double avgSpeed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("swimAbility")
    private final b0 swimAbility;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasMinimumHistory")
    private final Boolean hasMinimumHistory;

    public y(Double d14, String str, Double d15, b0 b0Var, Boolean bool) {
        this.recentWeeklyAvgValue = d14;
        this.recentWeeklyAvgType = str;
        this.avgSpeed = d15;
        this.swimAbility = b0Var;
        this.hasMinimumHistory = bool;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getAvgSpeed() {
        return this.avgSpeed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getHasMinimumHistory() {
        return this.hasMinimumHistory;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getRecentWeeklyAvgValue() {
        return this.recentWeeklyAvgValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getSwimAbility() {
        return this.swimAbility;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return p005kotlin.jvm.internal.s.g(this.recentWeeklyAvgValue, yVar.recentWeeklyAvgValue) && p005kotlin.jvm.internal.s.g(this.recentWeeklyAvgType, yVar.recentWeeklyAvgType) && p005kotlin.jvm.internal.s.g(this.avgSpeed, yVar.avgSpeed) && this.swimAbility == yVar.swimAbility && p005kotlin.jvm.internal.s.g(this.hasMinimumHistory, yVar.hasMinimumHistory);
    }

    public final int hashCode() {
        Double d14 = this.recentWeeklyAvgValue;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        String str = this.recentWeeklyAvgType;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d15 = this.avgSpeed;
        int iHashCode3 = (iHashCode2 + (d15 == null ? 0 : d15.hashCode())) * 31;
        b0 b0Var = this.swimAbility;
        int iHashCode4 = (iHashCode3 + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
        Boolean bool = this.hasMinimumHistory;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.recentWeeklyAvgValue;
        String str = this.recentWeeklyAvgType;
        Double d15 = this.avgSpeed;
        b0 b0Var = this.swimAbility;
        Boolean bool = this.hasMinimumHistory;
        StringBuilder sb3 = new StringBuilder("RecentTrainingStatsDTO(recentWeeklyAvgValue=");
        sb3.append(d14);
        sb3.append(", recentWeeklyAvgType=");
        sb3.append(str);
        sb3.append(", avgSpeed=");
        sb3.append(d15);
        sb3.append(", swimAbility=");
        sb3.append(b0Var);
        sb3.append(", hasMinimumHistory=");
        return p6.b.f(sb3, bool, ")");
    }
}
