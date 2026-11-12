package db1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Ldb1/p;", "", "", "updateWeightGoalResponseCode", "updateHydrationGoalResponseCode", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UPDATE_WEIGHT_GOAL")
    private final Integer updateWeightGoalResponseCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UPDATE_HYDRATION_GOAL")
    private final Integer updateHydrationGoalResponseCode;

    public /* synthetic */ p(Integer num, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getUpdateHydrationGoalResponseCode() {
        return this.updateHydrationGoalResponseCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getUpdateWeightGoalResponseCode() {
        return this.updateWeightGoalResponseCode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.updateWeightGoalResponseCode, pVar.updateWeightGoalResponseCode) && p005kotlin.jvm.internal.s.g(this.updateHydrationGoalResponseCode, pVar.updateHydrationGoalResponseCode);
    }

    public final int hashCode() {
        Integer num = this.updateWeightGoalResponseCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.updateHydrationGoalResponseCode;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SetupStepErrorResponseMap(updateWeightGoalResponseCode=" + this.updateWeightGoalResponseCode + ", updateHydrationGoalResponseCode=" + this.updateHydrationGoalResponseCode + ")";
    }

    public p(Integer num, Integer num2) {
        this.updateWeightGoalResponseCode = num;
        this.updateHydrationGoalResponseCode = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
