package hs1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0010"}, d2 = {"Lhs1/j;", "", "", "goal", "value", "", "distanceInMeters", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goal")
    private final Integer goal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("value")
    private final Integer value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distanceInMeters")
    private final Double distanceInMeters;

    public /* synthetic */ j(Integer num, Integer num2, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : d14);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getDistanceInMeters() {
        return this.distanceInMeters;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.goal, jVar.goal) && s.g(this.value, jVar.value) && s.g(this.distanceInMeters, jVar.distanceInMeters);
    }

    public final int hashCode() {
        Integer num = this.goal;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.value;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.distanceInMeters;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.goal;
        Integer num2 = this.value;
        return b71.i.g(com.airbnb.lottie.animation.keyframe.a.l(num, "MovementValue(goal=", ", value=", ", distanceInMeters=", num2), this.distanceInMeters, ")");
    }

    public j(Integer num, Integer num2, Double d14) {
        this.goal = num;
        this.value = num2;
        this.distanceInMeters = d14;
    }

    public j() {
        this(null, null, null, 7, null);
    }
}
