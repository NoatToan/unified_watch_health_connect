package zk0;

import c22.t;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u000f"}, d2 = {"Lzk0/g;", "", "", "Lzk0/e;", "userGoals", "Lzk0/f;", "userGoalRanges", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setUserGoals", "(Ljava/util/List;)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoals")
    private List<e> userGoals;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userGoalRanges")
    private final List<f> userGoalRanges;

    public g(List<e> list, List<f> list2) {
        list.getClass();
        list2.getClass();
        this.userGoals = list;
        this.userGoalRanges = list2;
    }

    public final List<f> a() {
        return this.userGoalRanges;
    }

    public final List<e> b() {
        return this.userGoals;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.userGoals, gVar.userGoals) && s.g(this.userGoalRanges, gVar.userGoalRanges);
    }

    public final int hashCode() {
        return this.userGoalRanges.hashCode() + (this.userGoals.hashCode() * 31);
    }

    public final String toString() {
        return t.f("UserGoalsRangeDTO(userGoals=", ", userGoalRanges=", ")", this.userGoals, this.userGoalRanges);
    }
}
