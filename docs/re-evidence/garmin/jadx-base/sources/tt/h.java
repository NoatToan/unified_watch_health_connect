package tt;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltt/h;", "", "Lto/o;", "activityType", "", "count", "", "totalDuration", "<init>", "(Lto/o;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Lto/o;", "()Lto/o;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Ljava/lang/Double;", "getTotalDuration", "()Ljava/lang/Double;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final to.o activityType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("count")
    private final Integer count;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDuration")
    private final Double totalDuration;

    static {
        Parcelable.Creator<to.o> creator = to.o.CREATOR;
    }

    public h(to.o oVar, Integer num, Double d14) {
        this.activityType = oVar;
        this.count = num;
        this.totalDuration = d14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final to.o getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCount() {
        return this.count;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.activityType, hVar.activityType) && s.g(this.count, hVar.count) && s.g(this.totalDuration, hVar.totalDuration);
    }

    public final int hashCode() {
        to.o oVar = this.activityType;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        Integer num = this.count;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.totalDuration;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        to.o oVar = this.activityType;
        Integer num = this.count;
        Double d14 = this.totalDuration;
        StringBuilder sb3 = new StringBuilder("ActivityTypeStat(activityType=");
        sb3.append(oVar);
        sb3.append(", count=");
        sb3.append(num);
        sb3.append(", totalDuration=");
        return b71.i.g(sb3, d14, ")");
    }
}
