package hs1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\n\u0010\u0015¨\u0006\u0017"}, d2 = {"Lhs1/f;", "", "", "goalInMl", "consumedInMl", "", "goalInFractionalMl", "consumedInFractionalMl", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "getGoalInMl", "()Ljava/lang/Integer;", "getGoalInMl$annotations", "()V", "b", "getConsumedInMl", "getConsumedInMl$annotations", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "d", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalInMl")
    private final Integer goalInMl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedInMl")
    private final Integer consumedInMl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goalInFractionalMl")
    private final Double goalInFractionalMl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("consumedInFractionalMl")
    private final Double consumedInFractionalMl;

    public /* synthetic */ f(Integer num, Integer num2, Double d14, Double d15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : d15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getConsumedInFractionalMl() {
        return this.consumedInFractionalMl;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getGoalInFractionalMl() {
        return this.goalInFractionalMl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.goalInMl, fVar.goalInMl) && s.g(this.consumedInMl, fVar.consumedInMl) && s.g(this.goalInFractionalMl, fVar.goalInFractionalMl) && s.g(this.consumedInFractionalMl, fVar.consumedInFractionalMl);
    }

    public final int hashCode() {
        Integer num = this.goalInMl;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.consumedInMl;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.goalInFractionalMl;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.consumedInFractionalMl;
        return iHashCode3 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        return sn.a.f(this.goalInFractionalMl, this.consumedInFractionalMl, ", consumedInFractionalMl=", ")", com.airbnb.lottie.animation.keyframe.a.l(this.goalInMl, "Hydration(goalInMl=", ", consumedInMl=", ", goalInFractionalMl=", this.consumedInMl));
    }

    public f(Integer num, Integer num2, Double d14, Double d15) {
        this.goalInMl = num;
        this.consumedInMl = num2;
        this.goalInFractionalMl = d14;
        this.consumedInFractionalMl = d15;
    }

    public f() {
        this(null, null, null, null, 15, null);
    }
}
