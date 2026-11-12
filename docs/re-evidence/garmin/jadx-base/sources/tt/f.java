package tt;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010¨\u0006\u0011"}, d2 = {"Ltt/f;", "", "", "activityCount", "", "Ltt/h;", "topActivityTypes", "monthlyActivityCount", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityCount")
    private final Integer activityCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("topActivityTypes")
    private final List<h> topActivityTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyActivityCount")
    private final List<Integer> monthlyActivityCount;

    public f(Integer num, List<h> list, List<Integer> list2) {
        this.activityCount = num;
        this.topActivityTypes = list;
        this.monthlyActivityCount = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getActivityCount() {
        return this.activityCount;
    }

    public final List<Integer> b() {
        return this.monthlyActivityCount;
    }

    public final List<h> c() {
        return this.topActivityTypes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.activityCount, fVar.activityCount) && s.g(this.topActivityTypes, fVar.topActivityTypes) && s.g(this.monthlyActivityCount, fVar.monthlyActivityCount);
    }

    public final int hashCode() {
        Integer num = this.activityCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<h> list = this.topActivityTypes;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<Integer> list2 = this.monthlyActivityCount;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.activityCount;
        List<h> list = this.topActivityTypes;
        List<Integer> list2 = this.monthlyActivityCount;
        StringBuilder sb3 = new StringBuilder("ActivitySummaryData(activityCount=");
        sb3.append(num);
        sb3.append(", topActivityTypes=");
        sb3.append(list);
        sb3.append(", monthlyActivityCount=");
        return z.c(sb3, list2, ")");
    }
}
