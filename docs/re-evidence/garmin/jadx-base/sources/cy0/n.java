package cy0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u001d\u001a\u0004\b-\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b \u00102R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u00102¨\u00065"}, d2 = {"Lcy0/n;", "Landroid/os/Parcelable;", "", "activityId", "", "activityTypeKey", "", "mapMarkerLat", "mapMarkerLon", "boundingBoxNorth", "boundingBoxSouth", "boundingBoxWest", "boundingBoxEast", "maxElevation", "minElevation", "avgElevation", "", "hasPositionDetails", "hasElevationDetails", "<init>", "(JLjava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZZ)V", "a", "J", "b", "()J", "Ljava/lang/String;", "U", "()Ljava/lang/String;", "c", "Ljava/lang/Double;", "getMapMarkerLat", "()Ljava/lang/Double;", "d", "getMapMarkerLon", JWKParameterNames.RSA_EXPONENT, "getBoundingBoxNorth", "f", "getBoundingBoxSouth", "g", "getBoundingBoxWest", "h", "getBoundingBoxEast", IntegerTokenConverter.CONVERTER_KEY, "getMaxElevation", "j", "getMinElevation", JWKParameterNames.OCT_KEY_VALUE, "getAvgElevation", "l", "Z", "()Z", "m", "getHasElevationDetails", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTypeKey")
    private final String activityTypeKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapMarkerLat")
    private final Double mapMarkerLat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("mapMarkerLon")
    private final Double mapMarkerLon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boundingBoxNorth")
    private final Double boundingBoxNorth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boundingBoxSouth")
    private final Double boundingBoxSouth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boundingBoxWest")
    private final Double boundingBoxWest;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("boundingBoxEast")
    private final Double boundingBoxEast;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxElevation")
    private final Double maxElevation;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minElevation")
    private final Double minElevation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgElevation")
    private final Double avgElevation;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasPositionDetails")
    private final boolean hasPositionDetails;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasElevationDetails")
    private final boolean hasElevationDetails;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            Double d14;
            parcel.getClass();
            long j8 = parcel.readLong();
            String string = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf9 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            boolean z14 = false;
            boolean z15 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                d14 = dValueOf8;
                z14 = true;
            } else {
                d14 = dValueOf8;
            }
            return new n(j8, string, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, d14, dValueOf9, z15, z14);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(long j8, String str, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, Double d26, boolean z14, boolean z15) {
        this.activityId = j8;
        this.activityTypeKey = str;
        this.mapMarkerLat = d14;
        this.mapMarkerLon = d15;
        this.boundingBoxNorth = d16;
        this.boundingBoxSouth = d17;
        this.boundingBoxWest = d18;
        this.boundingBoxEast = d19;
        this.maxElevation = d24;
        this.minElevation = d25;
        this.avgElevation = d26;
        this.hasPositionDetails = z14;
        this.hasElevationDetails = z15;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final String getActivityTypeKey() {
        return this.activityTypeKey;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHasPositionDetails() {
        return this.hasPositionDetails;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.activityId == nVar.activityId && p005kotlin.jvm.internal.s.g(this.activityTypeKey, nVar.activityTypeKey) && p005kotlin.jvm.internal.s.g(this.mapMarkerLat, nVar.mapMarkerLat) && p005kotlin.jvm.internal.s.g(this.mapMarkerLon, nVar.mapMarkerLon) && p005kotlin.jvm.internal.s.g(this.boundingBoxNorth, nVar.boundingBoxNorth) && p005kotlin.jvm.internal.s.g(this.boundingBoxSouth, nVar.boundingBoxSouth) && p005kotlin.jvm.internal.s.g(this.boundingBoxWest, nVar.boundingBoxWest) && p005kotlin.jvm.internal.s.g(this.boundingBoxEast, nVar.boundingBoxEast) && p005kotlin.jvm.internal.s.g(this.maxElevation, nVar.maxElevation) && p005kotlin.jvm.internal.s.g(this.minElevation, nVar.minElevation) && p005kotlin.jvm.internal.s.g(this.avgElevation, nVar.avgElevation) && this.hasPositionDetails == nVar.hasPositionDetails && this.hasElevationDetails == nVar.hasElevationDetails;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        String str = this.activityTypeKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Double d14 = this.mapMarkerLat;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.mapMarkerLon;
        int iHashCode4 = (iHashCode3 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.boundingBoxNorth;
        int iHashCode5 = (iHashCode4 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.boundingBoxSouth;
        int iHashCode6 = (iHashCode5 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.boundingBoxWest;
        int iHashCode7 = (iHashCode6 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.boundingBoxEast;
        int iHashCode8 = (iHashCode7 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.maxElevation;
        int iHashCode9 = (iHashCode8 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.minElevation;
        int iHashCode10 = (iHashCode9 + (d25 == null ? 0 : d25.hashCode())) * 31;
        Double d26 = this.avgElevation;
        return Boolean.hashCode(this.hasElevationDetails) + q6.f.g((iHashCode10 + (d26 != null ? d26.hashCode() : 0)) * 31, 31, this.hasPositionDetails);
    }

    public final String toString() {
        long j8 = this.activityId;
        String str = this.activityTypeKey;
        Double d14 = this.mapMarkerLat;
        Double d15 = this.mapMarkerLon;
        Double d16 = this.boundingBoxNorth;
        Double d17 = this.boundingBoxSouth;
        Double d18 = this.boundingBoxWest;
        Double d19 = this.boundingBoxEast;
        Double d24 = this.maxElevation;
        Double d25 = this.minElevation;
        Double d26 = this.avgElevation;
        boolean z14 = this.hasPositionDetails;
        boolean z15 = this.hasElevationDetails;
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(j8, "MultiDayActivityEntrySummaryDTO(activityId=", ", activityTypeKey=", str);
        sn.a.p(d14, d15, ", mapMarkerLat=", ", mapMarkerLon=", sbK);
        sn.a.p(d16, d17, ", boundingBoxNorth=", ", boundingBoxSouth=", sbK);
        sn.a.p(d18, d19, ", boundingBoxWest=", ", boundingBoxEast=", sbK);
        sn.a.p(d24, d25, ", maxElevation=", ", minElevation=", sbK);
        sbK.append(", avgElevation=");
        sbK.append(d26);
        sbK.append(", hasPositionDetails=");
        sbK.append(z14);
        return com.airbnb.lottie.animation.keyframe.a.i(sbK, ", hasElevationDetails=", z15, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        parcel.writeString(this.activityTypeKey);
        Double d14 = this.mapMarkerLat;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.mapMarkerLon;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.boundingBoxNorth;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.boundingBoxSouth;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.boundingBoxWest;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.boundingBoxEast;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.maxElevation;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.minElevation;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        Double d26 = this.avgElevation;
        if (d26 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d26);
        }
        parcel.writeInt(this.hasPositionDetails ? 1 : 0);
        parcel.writeInt(this.hasElevationDetails ? 1 : 0);
    }
}
