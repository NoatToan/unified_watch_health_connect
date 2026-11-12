package i22;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.proto.generated.GDICore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014Ba\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001e\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b%\u0010\u0017\"\u0004\b&\u0010\u0019R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010)\u001a\u0004\b\u001f\u0010*\"\u0004\b+\u0010,R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017\"\u0004\b.\u0010\u0019R\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0015\u001a\u0004\b-\u0010\u0017\"\u0004\b/\u0010\u0019¨\u00060"}, d2 = {"Li22/d;", "", "", "latitude", "longitude", "altitude", "", "timestamp", "horizAccuracy", "vertAccuracy", "Lcom/garmin/proto/generated/GDICore$LocationData$DataType;", "dataType", "course", "speed", "<init>", "(FFFJFFLcom/garmin/proto/generated/GDICore$LocationData$DataType;FF)V", "Landroid/location/Location;", FirebaseAnalytics.Param.LOCATION, "locationDataType", "(Landroid/location/Location;Lcom/garmin/proto/generated/GDICore$LocationData$DataType;)V", "a", "F", "f", "()F", "setLatitude", "(F)V", "b", "g", "setLongitude", "c", "setAltitude", "d", "J", IntegerTokenConverter.CONVERTER_KEY, "()J", "setTimestamp", "(J)V", JWKParameterNames.RSA_EXPONENT, "setHorizAccuracy", "j", "setVertAccuracy", "Lcom/garmin/proto/generated/GDICore$LocationData$DataType;", "()Lcom/garmin/proto/generated/GDICore$LocationData$DataType;", "setDataType", "(Lcom/garmin/proto/generated/GDICore$LocationData$DataType;)V", "h", "setCourse", "setSpeed", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latitude")
    private float latitude;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longitude")
    private float longitude;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitude")
    private float altitude;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("timestamp")
    private long timestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("horizAccuracy")
    private float horizAccuracy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vertAccuracy")
    private float vertAccuracy;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dataType")
    private GDICore.LocationData.DataType dataType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("course")
    private float course;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private float speed;

    static {
        new a(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Location location, GDICore.LocationData.DataType dataType) {
        this(0.0f, 0.0f, 0.0f, 0L, 0.0f, 0.0f, null, 0.0f, 0.0f, 511, null);
        location.getClass();
        dataType.getClass();
        this.latitude = (float) location.getLatitude();
        this.longitude = (float) location.getLongitude();
        this.altitude = (float) location.getAltitude();
        this.timestamp = location.getTime();
        this.horizAccuracy = location.getAccuracy();
        this.vertAccuracy = location.getVerticalAccuracyMeters();
        this.dataType = dataType;
        this.course = location.hasBearing() ? location.getBearing() : -1.0f;
        this.speed = location.getSpeed();
    }

    public final float a(d dVar) {
        double d14 = ((double) this.latitude) * 0.017453292519943295d;
        double d15 = ((double) dVar.latitude) * 0.017453292519943295d;
        double d16 = (((double) dVar.longitude) * 0.017453292519943295d) - (((double) this.longitude) * 0.017453292519943295d);
        double dAtan = Math.atan(Math.tan(d14) * 0.996647189328169d);
        double dAtan2 = Math.atan(Math.tan(d15) * 0.996647189328169d);
        double dCos = Math.cos(dAtan);
        double dCos2 = Math.cos(dAtan2);
        double dSin = Math.sin(dAtan);
        double dSin2 = Math.sin(dAtan2);
        double d17 = dCos * dCos2;
        double d18 = dSin * dSin2;
        int i14 = 0;
        double d19 = d16;
        double d24 = 0.0d;
        double d25 = 0.0d;
        double d26 = 0.0d;
        while (i14 < 20) {
            double dCos3 = Math.cos(d19);
            double dSin3 = Math.sin(d19);
            double d27 = dCos2 * dSin3;
            double d28 = (dCos * dSin2) - ((dSin * dCos2) * dCos3);
            double d29 = dSin;
            double dSqrt = Math.sqrt((d28 * d28) + (d27 * d27));
            double d34 = dSin2;
            double d35 = (dCos3 * d17) + d18;
            double dAtan3 = Math.atan2(dSqrt, d35);
            double d36 = dSqrt == 0.0d ? 0.0d : (dSin3 * d17) / dSqrt;
            double d37 = 1.0d - (d36 * d36);
            double d38 = d37 == 0.0d ? 0.0d : d35 - ((d18 * 2.0d) / d37);
            double d39 = 0.006739496756586903d * d37;
            double d44 = ((((((320.0d - (175.0d * d39)) * d39) + ((double) (-768))) * d39) + 4096.0d) * (d39 / 16384.0d)) + ((double) 1);
            double d45 = (((((74.0d - (47.0d * d39)) * d39) - 128.0d) * d39) + 256.0d) * (d39 / 1024.0d);
            double d46 = (((4.0d - (d37 * 3.0d)) * 0.0033528106718309896d) + 4.0d) * 2.0955066698943685E-4d * d37;
            double d47 = d38 * d38;
            double d48 = ((((((d47 * 2.0d) - 1.0d) * d35) - (((d47 * 4.0d) - 3.0d) * ((((dSqrt * 4.0d) * dSqrt) - 3.0d) * ((d45 / 6.0d) * d38)))) * (d45 / 4.0d)) + d38) * d45 * dSqrt;
            double d49 = ((((((((2.0d * d38) * d38) - 1.0d) * d46 * d35) + d38) * d46 * dSqrt) + dAtan3) * (1.0d - d46) * 0.0033528106718309896d * d36) + d16;
            if (Math.abs((d49 - d19) / d49) < 1.0E-12d) {
                d25 = dAtan3;
                d26 = d48;
                d24 = d44;
                break;
            }
            i14++;
            d25 = dAtan3;
            dSin2 = d34;
            d19 = d49;
            d26 = d48;
            d24 = d44;
            dSin = d29;
        }
        return (float) (6356752.3142d * d24 * (d25 - d26));
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAltitude() {
        return this.altitude;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getCourse() {
        return this.course;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final GDICore.LocationData.DataType getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getHorizAccuracy() {
        return this.horizAccuracy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.latitude, dVar.latitude) == 0 && Float.compare(this.longitude, dVar.longitude) == 0 && Float.compare(this.altitude, dVar.altitude) == 0 && this.timestamp == dVar.timestamp && Float.compare(this.horizAccuracy, dVar.horizAccuracy) == 0 && Float.compare(this.vertAccuracy, dVar.vertAccuracy) == 0 && this.dataType == dVar.dataType && Float.compare(this.course, dVar.course) == 0 && Float.compare(this.speed, dVar.speed) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSpeed() {
        return this.speed;
    }

    public final int hashCode() {
        return Float.hashCode(this.speed) + q6.f.d(this.course, (this.dataType.hashCode() + q6.f.d(this.vertAccuracy, q6.f.d(this.horizAccuracy, q6.f.e(q6.f.d(this.altitude, q6.f.d(this.longitude, Float.hashCode(this.latitude) * 31, 31), 31), 31, this.timestamp), 31), 31)) * 31, 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getVertAccuracy() {
        return this.vertAccuracy;
    }

    public final boolean k() {
        return Math.abs(this.latitude) <= Float.MAX_VALUE && Math.abs(this.longitude) <= Float.MAX_VALUE && Math.abs(this.altitude) <= Float.MAX_VALUE && Math.abs(this.horizAccuracy) <= Float.MAX_VALUE && Math.abs(this.vertAccuracy) <= Float.MAX_VALUE && Math.abs(this.course) <= Float.MAX_VALUE && Math.abs(this.speed) <= Float.MAX_VALUE;
    }

    public final String toString() {
        float f14 = this.latitude;
        float f15 = this.longitude;
        float f16 = this.altitude;
        long j8 = this.timestamp;
        float f17 = this.horizAccuracy;
        float f18 = this.vertAccuracy;
        GDICore.LocationData.DataType dataType = this.dataType;
        float f19 = this.course;
        float f22 = this.speed;
        StringBuilder sbI = e0.i("LocationPayload(latitude=", f14, ", longitude=", f15, ", altitude=");
        sbI.append(f16);
        sbI.append(", timestamp=");
        sbI.append(j8);
        sbI.append(", horizAccuracy=");
        sbI.append(f17);
        sbI.append(", vertAccuracy=");
        sbI.append(f18);
        sbI.append(", dataType=");
        sbI.append(dataType);
        sbI.append(", course=");
        sbI.append(f19);
        sbI.append(", speed=");
        sbI.append(f22);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li22/d$a;", "", "<init>", "()V", "", "NO_COURSE_DATA", "F", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Location location) {
        this(location, null, 2, 0 == true ? 1 : 0);
        location.getClass();
    }

    public d(float f14, float f15, float f16, long j8, float f17, float f18, GDICore.LocationData.DataType dataType, float f19, float f22) {
        dataType.getClass();
        this.latitude = f14;
        this.longitude = f15;
        this.altitude = f16;
        this.timestamp = j8;
        this.horizAccuracy = f17;
        this.vertAccuracy = f18;
        this.dataType = dataType;
        this.course = f19;
        this.speed = f22;
    }

    public /* synthetic */ d(float f14, float f15, float f16, long j8, float f17, float f18, GDICore.LocationData.DataType dataType, float f19, float f22, int i14, j jVar) {
        this((i14 & 1) != 0 ? 0.0f : f14, (i14 & 2) != 0 ? 0.0f : f15, (i14 & 4) != 0 ? 0.0f : f16, (i14 & 8) != 0 ? 0L : j8, (i14 & 16) != 0 ? 0.0f : f17, (i14 & 32) != 0 ? 0.0f : f18, (i14 & 64) != 0 ? GDICore.LocationData.DataType.SIGNIFICANT_LOCATION : dataType, (i14 & 128) != 0 ? -1.0f : f19, (i14 & 256) != 0 ? 0.0f : f22);
    }

    public /* synthetic */ d(Location location, GDICore.LocationData.DataType dataType, int i14, j jVar) {
        this(location, (i14 & 2) != 0 ? GDICore.LocationData.DataType.SIGNIFICANT_LOCATION : dataType);
    }

    public d() {
        this(0.0f, 0.0f, 0.0f, 0L, 0.0f, 0.0f, null, 0.0f, 0.0f, 511, null);
    }
}
