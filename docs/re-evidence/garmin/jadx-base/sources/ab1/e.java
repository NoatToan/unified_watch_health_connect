package ab1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b%\u0010!R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b)\u0010!R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010!R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010!R\u001a\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010!R\u001a\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010!R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010!R\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010!R\u001a\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b\u001c\u0010,R\u001a\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010\u001f\u001a\u0004\b;\u0010!¨\u0006<"}, d2 = {"Lab1/e;", "Landroid/os/Parcelable;", "", "powerGuidanceSplitPk", "powerGuidancePk", "", "distance", "cumulativeDistance", "meanGrade", "maxGrade", "elevationChange", "", "powerTarget", "estimatedDuration", "startLongitude", "startLatitude", "startElevation", "endLongitude", "endLatitude", "endElevation", "coursePointIndex", "heading", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;DDDLjava/lang/Double;DIDDDDDDDID)V", "a", "Ljava/lang/Long;", "getPowerGuidanceSplitPk", "()Ljava/lang/Long;", "b", "getPowerGuidancePk", "c", "D", "d", "()D", "getCumulativeDistance", JWKParameterNames.RSA_EXPONENT, "h", "f", "Ljava/lang/Double;", "getMaxGrade", "()Ljava/lang/Double;", "g", "I", IntegerTokenConverter.CONVERTER_KEY, "()I", "j", "getStartLongitude", JWKParameterNames.OCT_KEY_VALUE, "getStartLatitude", "l", "getStartElevation", "m", "getEndLongitude", JWKParameterNames.RSA_MODULUS, "getEndLatitude", "o", "getEndElevation", "p", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "getHeading", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidanceSplitPk")
    private final Long powerGuidanceSplitPk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerGuidancePk")
    private final Long powerGuidancePk;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("distance")
    private final double distance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cumulativeDistance")
    private final double cumulativeDistance;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("meanGrade")
    private final double meanGrade;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxGrade")
    private final Double maxGrade;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("elevationChange")
    private final double elevationChange;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("powerTarget")
    private final int powerTarget;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("estimatedDuration")
    private final double estimatedDuration;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLongitude")
    private final double startLongitude;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLatitude")
    private final double startLatitude;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startElevation")
    private final double startElevation;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLongitude")
    private final double endLongitude;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLatitude")
    private final double endLatitude;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endElevation")
    private final double endElevation;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("coursePointIndex")
    private final int coursePointIndex;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heading")
    private final double heading;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            double d14 = parcel.readDouble();
            Long l14 = lValueOf2;
            double d15 = parcel.readDouble();
            Double dValueOf = null;
            double d16 = parcel.readDouble();
            if (parcel.readInt() != 0) {
                dValueOf = Double.valueOf(parcel.readDouble());
            }
            return new e(lValueOf, l14, d14, d15, d16, dValueOf, parcel.readDouble(), parcel.readInt(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(Long l14, Long l15, double d14, double d15, double d16, Double d17, double d18, int i14, double d19, double d24, double d25, double d26, double d27, double d28, double d29, int i15, double d34, int i16, p005kotlin.jvm.internal.j jVar) {
        this((i16 & 1) != 0 ? null : l14, (i16 & 2) != 0 ? null : l15, d14, d15, d16, d17, d18, i14, d19, d24, d25, d26, d27, d28, d29, i15, d34);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCoursePointIndex() {
        return this.coursePointIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final double getDistance() {
        return this.distance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.powerGuidanceSplitPk, eVar.powerGuidanceSplitPk) && s.g(this.powerGuidancePk, eVar.powerGuidancePk) && Double.compare(this.distance, eVar.distance) == 0 && Double.compare(this.cumulativeDistance, eVar.cumulativeDistance) == 0 && Double.compare(this.meanGrade, eVar.meanGrade) == 0 && s.g(this.maxGrade, eVar.maxGrade) && Double.compare(this.elevationChange, eVar.elevationChange) == 0 && this.powerTarget == eVar.powerTarget && Double.compare(this.estimatedDuration, eVar.estimatedDuration) == 0 && Double.compare(this.startLongitude, eVar.startLongitude) == 0 && Double.compare(this.startLatitude, eVar.startLatitude) == 0 && Double.compare(this.startElevation, eVar.startElevation) == 0 && Double.compare(this.endLongitude, eVar.endLongitude) == 0 && Double.compare(this.endLatitude, eVar.endLatitude) == 0 && Double.compare(this.endElevation, eVar.endElevation) == 0 && this.coursePointIndex == eVar.coursePointIndex && Double.compare(this.heading, eVar.heading) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final double getElevationChange() {
        return this.elevationChange;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final double getEstimatedDuration() {
        return this.estimatedDuration;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final double getMeanGrade() {
        return this.meanGrade;
    }

    public final int hashCode() {
        Long l14 = this.powerGuidanceSplitPk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.powerGuidancePk;
        int iB = org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b((iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31, 31, this.distance), 31, this.cumulativeDistance), 31, this.meanGrade);
        Double d14 = this.maxGrade;
        return Double.hashCode(this.heading) + q2.d(this.coursePointIndex, org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(org.apache.commons.lang3.e.b(q2.d(this.powerTarget, org.apache.commons.lang3.e.b((iB + (d14 != null ? d14.hashCode() : 0)) * 31, 31, this.elevationChange), 31), 31, this.estimatedDuration), 31, this.startLongitude), 31, this.startLatitude), 31, this.startElevation), 31, this.endLongitude), 31, this.endLatitude), 31, this.endElevation), 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPowerTarget() {
        return this.powerTarget;
    }

    public final String toString() {
        Long l14 = this.powerGuidanceSplitPk;
        Long l15 = this.powerGuidancePk;
        double d14 = this.distance;
        double d15 = this.cumulativeDistance;
        double d16 = this.meanGrade;
        Double d17 = this.maxGrade;
        double d18 = this.elevationChange;
        int i14 = this.powerTarget;
        double d19 = this.estimatedDuration;
        double d24 = this.startLongitude;
        double d25 = this.startLatitude;
        double d26 = this.startElevation;
        double d27 = this.endLongitude;
        double d28 = this.endLatitude;
        double d29 = this.endElevation;
        int i15 = this.coursePointIndex;
        double d34 = this.heading;
        StringBuilder sbJ = f3.j(l14, l15, "PowerGuideSplitDTO(powerGuidanceSplitPk=", ", powerGuidancePk=", ", distance=");
        sbJ.append(d14);
        am.j.x(sbJ, ", cumulativeDistance=", d15, ", meanGrade=");
        sbJ.append(d16);
        sbJ.append(", maxGrade=");
        sbJ.append(d17);
        am.j.x(sbJ, ", elevationChange=", d18, ", powerTarget=");
        sbJ.append(i14);
        sbJ.append(", estimatedDuration=");
        sbJ.append(d19);
        am.j.x(sbJ, ", startLongitude=", d24, ", startLatitude=");
        sbJ.append(d25);
        am.j.x(sbJ, ", startElevation=", d26, ", endLongitude=");
        sbJ.append(d27);
        am.j.x(sbJ, ", endLatitude=", d28, ", endElevation=");
        sbJ.append(d29);
        sbJ.append(", coursePointIndex=");
        sbJ.append(i15);
        return am.j.r(sbJ, ", heading=", d34, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.powerGuidanceSplitPk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.powerGuidancePk;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeDouble(this.distance);
        parcel.writeDouble(this.cumulativeDistance);
        parcel.writeDouble(this.meanGrade);
        Double d14 = this.maxGrade;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        parcel.writeDouble(this.elevationChange);
        parcel.writeInt(this.powerTarget);
        parcel.writeDouble(this.estimatedDuration);
        parcel.writeDouble(this.startLongitude);
        parcel.writeDouble(this.startLatitude);
        parcel.writeDouble(this.startElevation);
        parcel.writeDouble(this.endLongitude);
        parcel.writeDouble(this.endLatitude);
        parcel.writeDouble(this.endElevation);
        parcel.writeInt(this.coursePointIndex);
        parcel.writeDouble(this.heading);
    }

    public e(Long l14, Long l15, double d14, double d15, double d16, Double d17, double d18, int i14, double d19, double d24, double d25, double d26, double d27, double d28, double d29, int i15, double d34) {
        this.powerGuidanceSplitPk = l14;
        this.powerGuidancePk = l15;
        this.distance = d14;
        this.cumulativeDistance = d15;
        this.meanGrade = d16;
        this.maxGrade = d17;
        this.elevationChange = d18;
        this.powerTarget = i14;
        this.estimatedDuration = d19;
        this.startLongitude = d24;
        this.startLatitude = d25;
        this.startElevation = d26;
        this.endLongitude = d27;
        this.endLatitude = d28;
        this.endElevation = d29;
        this.coursePointIndex = i15;
        this.heading = d34;
    }
}
