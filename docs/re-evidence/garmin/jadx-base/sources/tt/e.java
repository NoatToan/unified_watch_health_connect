package tt;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.activities.newmodel.y;
import com.garmin.android.apps.connectmobile.util.adapters.YearMonthDaySepHrMinSecMsDateTimeJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.List;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b \u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b$\u0010#R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b&\u0010'R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b\u0015\u0010'R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\u0019\u0010+¨\u0006,"}, d2 = {"Ltt/e;", "", "", "name", "Lorg/joda/time/DateTime;", "startTimeLocal", "Lto/o;", "activityType", "", "duration", "distance", "elevationGain", "", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/y;", "metricDescriptors", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/b;", "activityDetailMetrics", "Lps/n;", "activityPolylineDto", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lto/o;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lps/n;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", "Lorg/joda/time/DateTime;", "g", "()Lorg/joda/time/DateTime;", "c", "Lto/o;", "()Lto/o;", "d", "Ljava/lang/Double;", "getDuration", "()Ljava/lang/Double;", JWKParameterNames.RSA_EXPONENT, "Ljava/util/List;", "getMetricDescriptors", "()Ljava/util/List;", "h", IntegerTokenConverter.CONVERTER_KEY, "Lps/n;", "()Lps/n;", "gcm-annual-report_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startTimeLocal")
    @JsonAdapter(YearMonthDaySepHrMinSecMsDateTimeJsonAdapter.class)
    private final DateTime startTimeLocal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityType")
    private final to.o activityType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("duration")
    private final Double duration;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final Double distance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationGain")
    private final Double elevationGain;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricDescriptors")
    private final List<y> metricDescriptors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityDetailMetrics")
    private final List<com.garmin.android.apps.connectmobile.activities.newmodel.b> activityDetailMetrics;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityPolylineDto")
    private final ps.n activityPolylineDto;

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, DateTime dateTime, to.o oVar, Double d14, Double d15, Double d16, List<? extends y> list, List<? extends com.garmin.android.apps.connectmobile.activities.newmodel.b> list2, ps.n nVar) {
        this.name = str;
        this.startTimeLocal = dateTime;
        this.activityType = oVar;
        this.duration = d14;
        this.distance = d15;
        this.elevationGain = d16;
        this.metricDescriptors = list;
        this.activityDetailMetrics = list2;
        this.activityPolylineDto = nVar;
    }

    public final List<com.garmin.android.apps.connectmobile.activities.newmodel.b> a() {
        return this.activityDetailMetrics;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ps.n getActivityPolylineDto() {
        return this.activityPolylineDto;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final to.o getActivityType() {
        return this.activityType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getDistance() {
        return this.distance;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getElevationGain() {
        return this.elevationGain;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.name, eVar.name) && s.g(this.startTimeLocal, eVar.startTimeLocal) && s.g(this.activityType, eVar.activityType) && s.g(this.duration, eVar.duration) && s.g(this.distance, eVar.distance) && s.g(this.elevationGain, eVar.elevationGain) && s.g(this.metricDescriptors, eVar.metricDescriptors) && s.g(this.activityDetailMetrics, eVar.activityDetailMetrics) && s.g(this.activityPolylineDto, eVar.activityPolylineDto);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getStartTimeLocal() {
        return this.startTimeLocal;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DateTime dateTime = this.startTimeLocal;
        int iHashCode2 = (iHashCode + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        to.o oVar = this.activityType;
        int iHashCode3 = (iHashCode2 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        Double d14 = this.duration;
        int iHashCode4 = (iHashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.distance;
        int iHashCode5 = (iHashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.elevationGain;
        int iHashCode6 = (iHashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        List<y> list = this.metricDescriptors;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list2 = this.activityDetailMetrics;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ps.n nVar = this.activityPolylineDto;
        return iHashCode8 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.name;
        DateTime dateTime = this.startTimeLocal;
        to.o oVar = this.activityType;
        Double d14 = this.duration;
        Double d15 = this.distance;
        Double d16 = this.elevationGain;
        List<y> list = this.metricDescriptors;
        List<com.garmin.android.apps.connectmobile.activities.newmodel.b> list2 = this.activityDetailMetrics;
        ps.n nVar = this.activityPolylineDto;
        StringBuilder sb3 = new StringBuilder("ActivityStat(name=");
        sb3.append(str);
        sb3.append(", startTimeLocal=");
        sb3.append(dateTime);
        sb3.append(", activityType=");
        sb3.append(oVar);
        sb3.append(", duration=");
        sb3.append(d14);
        sb3.append(", distance=");
        b71.i.p(d15, d16, ", elevationGain=", ", metricDescriptors=", sb3);
        n23.j.z(sb3, list, ", activityDetailMetrics=", list2, ", activityPolylineDto=");
        sb3.append(nVar);
        sb3.append(")");
        return sb3.toString();
    }
}
