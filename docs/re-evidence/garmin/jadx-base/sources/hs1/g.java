package hs1;

import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\t\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lhs1/g;", "", "", "goal", "moderate", "vigorous", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "c", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("goal")
    private final Integer goal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moderate")
    private final Integer moderate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vigorous")
    private final Integer vigorous;

    public /* synthetic */ g(Integer num, Integer num2, Integer num3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getModerate() {
        return this.moderate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Integer getVigorous() {
        return this.vigorous;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.goal, gVar.goal) && s.g(this.moderate, gVar.moderate) && s.g(this.vigorous, gVar.vigorous);
    }

    public final int hashCode() {
        Integer num = this.goal;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.moderate;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.vigorous;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.goal;
        Integer num2 = this.moderate;
        return f3.i(com.airbnb.lottie.animation.keyframe.a.l(num, "IntensityMinutes(goal=", ", moderate=", ", vigorous=", num2), this.vigorous, ")");
    }

    public g(Integer num, Integer num2, Integer num3) {
        this.goal = num;
        this.moderate = num2;
        this.vigorous = num3;
    }

    public g() {
        this(null, null, null, 7, null);
    }
}
