package tt;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltt/b;", "", "", "totalCalories", "", "cakeCount", "", "monthlyCalories", "<init>", "(Ljava/lang/Double;Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/util/List;", "()Ljava/util/List;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalCalories")
    private final Double totalCalories;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cakeCount")
    private final Integer cakeCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyCalories")
    private final List<Double> monthlyCalories;

    public b(Double d14, Integer num, List<Double> list) {
        this.totalCalories = d14;
        this.cakeCount = num;
        this.monthlyCalories = list;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCakeCount() {
        return this.cakeCount;
    }

    public final List<Double> b() {
        return this.monthlyCalories;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getTotalCalories() {
        return this.totalCalories;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.totalCalories, bVar.totalCalories) && s.g(this.cakeCount, bVar.cakeCount) && s.g(this.monthlyCalories, bVar.monthlyCalories);
    }

    public final int hashCode() {
        Double d14 = this.totalCalories;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Integer num = this.cakeCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List<Double> list = this.monthlyCalories;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.totalCalories;
        Integer num = this.cakeCount;
        List<Double> list = this.monthlyCalories;
        StringBuilder sb3 = new StringBuilder("ActivityCaloriesData(totalCalories=");
        sb3.append(d14);
        sb3.append(", cakeCount=");
        sb3.append(num);
        sb3.append(", monthlyCalories=");
        return z.c(sb3, list, ")");
    }
}
