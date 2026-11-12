package ae2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.library.livetrack.data.typeadapters.GcsDateTimeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.TrackPointDataTypeAdapter;
import com.garmin.android.library.livetrack.data.typeadapters.TrackPointFixTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.interactions.standard.generated.StandardPoi;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b-\b\u0080\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0018\u0010(R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\u001c\u0010+\"\u0004\b \u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010\u001bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0019\u001a\u0004\b<\u0010\u001bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u001d\u001a\u0004\b>\u0010\u001f¨\u0006?"}, d2 = {"Lae2/g;", "", "", "accuracy", "", "altitude", "batteryLevel", "Lae2/o0;", "dataType", "Lorg/joda/time/DateTime;", "dateTime", "Lae2/f;", "fitnessPointData", "Lae2/p0;", "fixType", "heading", "", StandardPoi.FEATURESET_ID, "Lae2/z;", ModelSourceWrapper.POSITION, "satelliteCount", "speed", "<init>", "(Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Integer;Lae2/o0;Lorg/joda/time/DateTime;Lae2/f;Lae2/p0;Ljava/lang/Integer;Ljava/lang/String;Lae2/z;Ljava/lang/Integer;Ljava/lang/Float;)V", "a", "Ljava/lang/Integer;", "getAccuracy", "()Ljava/lang/Integer;", "b", "Ljava/lang/Float;", "getAltitude", "()Ljava/lang/Float;", "c", "getBatteryLevel", "d", "Lae2/o0;", "getDataType", "()Lae2/o0;", JWKParameterNames.RSA_EXPONENT, "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", "f", "Lae2/f;", "()Lae2/f;", "(Lae2/f;)V", "g", "Lae2/p0;", "getFixType", "()Lae2/p0;", "h", "getHeading", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getPoi", "()Ljava/lang/String;", "j", "Lae2/z;", "getPosition", "()Lae2/z;", JWKParameterNames.OCT_KEY_VALUE, "getSatelliteCount", "l", "getSpeed", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("accuracy")
    private final Integer accuracy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitude")
    private final Float altitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("batteryLevel")
    private final Integer batteryLevel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dataType")
    @JsonAdapter(TrackPointDataTypeAdapter.class)
    private final o0 dataType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dateTime")
    @JsonAdapter(GcsDateTimeAdapter.class)
    private final DateTime dateTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fitnessPointData")
    private f fitnessPointData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fixType")
    @JsonAdapter(TrackPointFixTypeAdapter.class)
    private final p0 fixType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heading")
    private final Integer heading;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName(StandardPoi.FEATURESET_ID)
    private final String poi;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName(ModelSourceWrapper.POSITION)
    private final z position;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("satelliteCount")
    private final Integer satelliteCount;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private final Float speed;

    public /* synthetic */ g(Integer num, Float f14, Integer num2, o0 o0Var, DateTime dateTime, f fVar, p0 p0Var, Integer num3, String str, z zVar, Integer num4, Float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : f14, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : o0Var, (i14 & 16) != 0 ? null : dateTime, (i14 & 32) != 0 ? null : fVar, (i14 & 64) != 0 ? null : p0Var, (i14 & 128) != 0 ? null : num3, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : zVar, (i14 & 1024) != 0 ? null : num4, (i14 & 2048) != 0 ? null : f15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final DateTime getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final f getFitnessPointData() {
        return this.fitnessPointData;
    }

    public final void c(f fVar) {
        this.fitnessPointData = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.accuracy, gVar.accuracy) && p005kotlin.jvm.internal.s.g(this.altitude, gVar.altitude) && p005kotlin.jvm.internal.s.g(this.batteryLevel, gVar.batteryLevel) && p005kotlin.jvm.internal.s.g(this.dataType, gVar.dataType) && p005kotlin.jvm.internal.s.g(this.dateTime, gVar.dateTime) && p005kotlin.jvm.internal.s.g(this.fitnessPointData, gVar.fitnessPointData) && p005kotlin.jvm.internal.s.g(this.fixType, gVar.fixType) && p005kotlin.jvm.internal.s.g(this.heading, gVar.heading) && p005kotlin.jvm.internal.s.g(this.poi, gVar.poi) && p005kotlin.jvm.internal.s.g(this.position, gVar.position) && p005kotlin.jvm.internal.s.g(this.satelliteCount, gVar.satelliteCount) && p005kotlin.jvm.internal.s.g(this.speed, gVar.speed);
    }

    public final int hashCode() {
        Integer num = this.accuracy;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f14 = this.altitude;
        int iHashCode2 = (iHashCode + (f14 == null ? 0 : f14.hashCode())) * 31;
        Integer num2 = this.batteryLevel;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        o0 o0Var = this.dataType;
        int iHashCode4 = (iHashCode3 + (o0Var == null ? 0 : o0Var.hashCode())) * 31;
        DateTime dateTime = this.dateTime;
        int iHashCode5 = (iHashCode4 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        f fVar = this.fitnessPointData;
        int iHashCode6 = (iHashCode5 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        p0 p0Var = this.fixType;
        int iHashCode7 = (iHashCode6 + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        Integer num3 = this.heading;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.poi;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        z zVar = this.position;
        int iHashCode10 = (iHashCode9 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        Integer num4 = this.satelliteCount;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f15 = this.speed;
        return iHashCode11 + (f15 != null ? f15.hashCode() : 0);
    }

    public final String toString() {
        return "FitnessTrackPoint(accuracy=" + this.accuracy + ", altitude=" + this.altitude + ", batteryLevel=" + this.batteryLevel + ", dataType=" + this.dataType + ", dateTime=" + this.dateTime + ", fitnessPointData=" + this.fitnessPointData + ", fixType=" + this.fixType + ", heading=" + this.heading + ", poi=" + this.poi + ", position=" + this.position + ", satelliteCount=" + this.satelliteCount + ", speed=" + this.speed + ")";
    }

    public g(Integer num, Float f14, Integer num2, o0 o0Var, DateTime dateTime, f fVar, p0 p0Var, Integer num3, String str, z zVar, Integer num4, Float f15) {
        this.accuracy = num;
        this.altitude = f14;
        this.batteryLevel = num2;
        this.dataType = o0Var;
        this.dateTime = dateTime;
        this.fitnessPointData = fVar;
        this.fixType = p0Var;
        this.heading = num3;
        this.poi = str;
        this.position = zVar;
        this.satelliteCount = num4;
        this.speed = f15;
    }

    public g() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
