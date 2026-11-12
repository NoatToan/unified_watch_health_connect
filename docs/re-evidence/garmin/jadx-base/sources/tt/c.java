package tt;

import com.garmin.android.apps.connectmobile.annual_report.data.model.FunFact;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001b\u001a\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, d2 = {"Ltt/c;", "", "", "totalDistance", "Ltt/e;", "maxDistanceActivity", "", "monthlyDistance", "Lcom/garmin/android/apps/connectmobile/annual_report/data/model/FunFact;", "funFact", "", "funFactCount", "<init>", "(Ljava/lang/Double;Ltt/e;Ljava/util/List;Lcom/garmin/android/apps/connectmobile/annual_report/data/model/FunFact;Ljava/lang/Integer;)V", "a", "Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "()Ljava/lang/Double;", "b", "Ltt/e;", "c", "()Ltt/e;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/garmin/android/apps/connectmobile/annual_report/data/model/FunFact;", "()Lcom/garmin/android/apps/connectmobile/annual_report/data/model/FunFact;", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalDistance")
    private final Double totalDistance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxDistanceActivity")
    private final e maxDistanceActivity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("monthlyDistance")
    private final List<Double> monthlyDistance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("funFact")
    private final FunFact funFact;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("funFactCount")
    private final Integer funFactCount;

    public c(Double d14, e eVar, List<Double> list, FunFact funFact, Integer num) {
        this.totalDistance = d14;
        this.maxDistanceActivity = eVar;
        this.monthlyDistance = list;
        this.funFact = funFact;
        this.funFactCount = num;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final FunFact getFunFact() {
        return this.funFact;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getFunFactCount() {
        return this.funFactCount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getMaxDistanceActivity() {
        return this.maxDistanceActivity;
    }

    public final List<Double> d() {
        return this.monthlyDistance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getTotalDistance() {
        return this.totalDistance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.totalDistance, cVar.totalDistance) && s.g(this.maxDistanceActivity, cVar.maxDistanceActivity) && s.g(this.monthlyDistance, cVar.monthlyDistance) && this.funFact == cVar.funFact && s.g(this.funFactCount, cVar.funFactCount);
    }

    public final int hashCode() {
        Double d14 = this.totalDistance;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        e eVar = this.maxDistanceActivity;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List<Double> list = this.monthlyDistance;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        FunFact funFact = this.funFact;
        int iHashCode4 = (iHashCode3 + (funFact == null ? 0 : funFact.hashCode())) * 31;
        Integer num = this.funFactCount;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        Double d14 = this.totalDistance;
        e eVar = this.maxDistanceActivity;
        List<Double> list = this.monthlyDistance;
        FunFact funFact = this.funFact;
        Integer num = this.funFactCount;
        StringBuilder sb3 = new StringBuilder("ActivityDistanceData(totalDistance=");
        sb3.append(d14);
        sb3.append(", maxDistanceActivity=");
        sb3.append(eVar);
        sb3.append(", monthlyDistance=");
        sb3.append(list);
        sb3.append(", funFact=");
        sb3.append(funFact);
        sb3.append(", funFactCount=");
        return f3.i(sb3, num, ")");
    }
}
