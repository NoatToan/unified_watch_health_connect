package ps;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\"\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b'\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b(\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b-\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b)\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b+\u0010&R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lps/m;", "Landroid/os/Parcelable;", "", "activityId", "", "numberOfPoints", "", "encodedSamples", "encodedLevels", "", "maxLat", "maxLon", "minLat", "minLon", "startLat", "startLon", "endLat", "endLon", "Lps/v1;", "trackLog", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lps/v1;)V", "a", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "b", "Ljava/lang/Integer;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Integer;", "c", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "j", "()Ljava/lang/Double;", JWKParameterNames.OCT_KEY_VALUE, "m", "h", "o", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "s", "l", "Lps/v1;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "()Lps/v1;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f139904n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfPoints")
    private final Integer numberOfPoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encodedSamples")
    private final String encodedSamples;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("encodedLevels")
    private final String encodedLevels;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLat")
    private final Double maxLat;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("maxLon")
    private final Double maxLon;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minLat")
    private final Double minLat;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("minLon")
    private final Double minLon;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLat")
    private final Double startLat;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startLon")
    private final Double startLon;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLat")
    private final Double endLat;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endLon")
    private final Double endLon;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trackLog")
    private final v1 trackLog;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            v1 v1VarCreateFromParcel = null;
            Integer num = numValueOf;
            String string2 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf3 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf4 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf5 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf6 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf7 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf8 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                v1VarCreateFromParcel = v1.CREATOR.createFromParcel(parcel);
            }
            return new m(lValueOf, num, string, string2, dValueOf, dValueOf2, dValueOf3, dValueOf4, dValueOf5, dValueOf6, dValueOf7, dValueOf8, v1VarCreateFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(Long l14, Integer num, String str, String str2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, v1 v1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : d14, (i14 & 32) != 0 ? null : d15, (i14 & 64) != 0 ? null : d16, (i14 & 128) != 0 ? null : d17, (i14 & 256) != 0 ? null : d18, (i14 & 512) != 0 ? null : d19, (i14 & 1024) != 0 ? null : d24, (i14 & 2048) != 0 ? null : d25, (i14 & 4096) != 0 ? null : v1Var);
    }

    public static m b(m mVar, v1 v1Var) {
        Long l14 = mVar.activityId;
        Integer num = mVar.numberOfPoints;
        String str = mVar.encodedSamples;
        String str2 = mVar.encodedLevels;
        Double d14 = mVar.maxLat;
        Double d15 = mVar.maxLon;
        Double d16 = mVar.minLat;
        Double d17 = mVar.minLon;
        Double d18 = mVar.startLat;
        Double d19 = mVar.startLon;
        Double d24 = mVar.endLat;
        Double d25 = mVar.endLon;
        mVar.getClass();
        return new m(l14, num, str, str2, d14, d15, d16, d17, d18, d19, d24, d25, v1Var);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getActivityId() {
        return this.activityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, mVar.activityId) && p005kotlin.jvm.internal.s.g(this.numberOfPoints, mVar.numberOfPoints) && p005kotlin.jvm.internal.s.g(this.encodedSamples, mVar.encodedSamples) && p005kotlin.jvm.internal.s.g(this.encodedLevels, mVar.encodedLevels) && p005kotlin.jvm.internal.s.g(this.maxLat, mVar.maxLat) && p005kotlin.jvm.internal.s.g(this.maxLon, mVar.maxLon) && p005kotlin.jvm.internal.s.g(this.minLat, mVar.minLat) && p005kotlin.jvm.internal.s.g(this.minLon, mVar.minLon) && p005kotlin.jvm.internal.s.g(this.startLat, mVar.startLat) && p005kotlin.jvm.internal.s.g(this.startLon, mVar.startLon) && p005kotlin.jvm.internal.s.g(this.endLat, mVar.endLat) && p005kotlin.jvm.internal.s.g(this.endLon, mVar.endLon) && p005kotlin.jvm.internal.s.g(this.trackLog, mVar.trackLog);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEncodedLevels() {
        return this.encodedLevels;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getEncodedSamples() {
        return this.encodedSamples;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Double getEndLat() {
        return this.endLat;
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Integer num = this.numberOfPoints;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.encodedSamples;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.encodedLevels;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d14 = this.maxLat;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.maxLon;
        int iHashCode6 = (iHashCode5 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.minLat;
        int iHashCode7 = (iHashCode6 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Double d17 = this.minLon;
        int iHashCode8 = (iHashCode7 + (d17 == null ? 0 : d17.hashCode())) * 31;
        Double d18 = this.startLat;
        int iHashCode9 = (iHashCode8 + (d18 == null ? 0 : d18.hashCode())) * 31;
        Double d19 = this.startLon;
        int iHashCode10 = (iHashCode9 + (d19 == null ? 0 : d19.hashCode())) * 31;
        Double d24 = this.endLat;
        int iHashCode11 = (iHashCode10 + (d24 == null ? 0 : d24.hashCode())) * 31;
        Double d25 = this.endLon;
        int iHashCode12 = (iHashCode11 + (d25 == null ? 0 : d25.hashCode())) * 31;
        v1 v1Var = this.trackLog;
        return iHashCode12 + (v1Var != null ? v1Var.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Double getEndLon() {
        return this.endLon;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Double getMaxLat() {
        return this.maxLat;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Double getMaxLon() {
        return this.maxLon;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Double getMinLat() {
        return this.minLat;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getMinLon() {
        return this.minLon;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Integer getNumberOfPoints() {
        return this.numberOfPoints;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Double getStartLat() {
        return this.startLat;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Double getStartLon() {
        return this.startLon;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final v1 getTrackLog() {
        return this.trackLog;
    }

    public final String toString() {
        Long l14 = this.activityId;
        Integer num = this.numberOfPoints;
        String str = this.encodedSamples;
        String str2 = this.encodedLevels;
        Double d14 = this.maxLat;
        Double d15 = this.maxLon;
        Double d16 = this.minLat;
        Double d17 = this.minLon;
        Double d18 = this.startLat;
        Double d19 = this.startLon;
        Double d24 = this.endLat;
        Double d25 = this.endLon;
        v1 v1Var = this.trackLog;
        StringBuilder sb3 = new StringBuilder("ActivityPolylineDMO(activityId=");
        sb3.append(l14);
        sb3.append(", numberOfPoints=");
        sb3.append(num);
        sb3.append(", encodedSamples=");
        sn.a.t(sb3, str, ", encodedLevels=", str2, ", maxLat=");
        b71.i.p(d14, d15, ", maxLon=", ", minLat=", sb3);
        b71.i.p(d16, d17, ", minLon=", ", startLat=", sb3);
        b71.i.p(d18, d19, ", startLon=", ", endLat=", sb3);
        b71.i.p(d24, d25, ", endLon=", ", trackLog=", sb3);
        sb3.append(v1Var);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Integer num = this.numberOfPoints;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.encodedSamples);
        parcel.writeString(this.encodedLevels);
        Double d14 = this.maxLat;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.maxLon;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Double d16 = this.minLat;
        if (d16 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d16);
        }
        Double d17 = this.minLon;
        if (d17 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d17);
        }
        Double d18 = this.startLat;
        if (d18 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d18);
        }
        Double d19 = this.startLon;
        if (d19 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d19);
        }
        Double d24 = this.endLat;
        if (d24 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d24);
        }
        Double d25 = this.endLon;
        if (d25 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d25);
        }
        v1 v1Var = this.trackLog;
        if (v1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            v1Var.writeToParcel(parcel, i14);
        }
    }

    public m(Long l14, Integer num, String str, String str2, Double d14, Double d15, Double d16, Double d17, Double d18, Double d19, Double d24, Double d25, v1 v1Var) {
        this.activityId = l14;
        this.numberOfPoints = num;
        this.encodedSamples = str;
        this.encodedLevels = str2;
        this.maxLat = d14;
        this.maxLon = d15;
        this.minLat = d16;
        this.minLon = d17;
        this.startLat = d18;
        this.startLon = d19;
        this.endLat = d24;
        this.endLon = d25;
        this.trackLog = v1Var;
    }

    public m() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }
}
