package x61;

import android.os.Parcel;
import android.os.Parcelable;
import c22.j0;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.w;
import i3.e5;
import j20.x;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010&R\u001c\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010%\u001a\u0004\b'\u0010&R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010&R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010&R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0017\u001a\u0004\b3\u0010\u0019R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0017\u001a\u0004\b+\u0010\u0019¨\u00065"}, d2 = {"Lx61/e;", "Landroid/os/Parcelable;", "", "calendarDate", "altitudeAcclimationDate", "previousAltitudeAcclimationDate", "altitudeAcclimationLocalTimestamp", "heatAcclimationDate", "previousHeatAcclimationDate", "", "altitudeAcclimationMeters", "previousAltitudeAcclimationMeters", "currentAltitude", "previousAltitude", "altitudeAcclimationPercentage", "previousAltitudeAcclimationPercentage", "heatAcclimationPercentage", "previousHeatAcclimationPercentage", "heatTrendKey", "altitudeTrendKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/String;", "b", "getAltitudeAcclimationDate", "c", "getPreviousAltitudeAcclimationDate", "d", "getAltitudeAcclimationLocalTimestamp", JWKParameterNames.RSA_EXPONENT, "getHeatAcclimationDate", "f", "getPreviousHeatAcclimationDate", "g", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "h", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, IntegerTokenConverter.CONVERTER_KEY, "o", "j", "getPreviousAltitude", "l", "getPreviousAltitudeAcclimationPercentage", "m", "s", JWKParameterNames.RSA_MODULUS, "z", "u", "p", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f189206q = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitudeAcclimationDate")
    private final String altitudeAcclimationDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousAltitudeAcclimationDate")
    private final String previousAltitudeAcclimationDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitudeAcclimationLocalTimestamp")
    private final String altitudeAcclimationLocalTimestamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heatAcclimationDate")
    private final String heatAcclimationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousHeatAcclimationDate")
    private final String previousHeatAcclimationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitudeAcclimation")
    private final Integer altitudeAcclimationMeters;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousAltitudeAcclimation")
    private final Integer previousAltitudeAcclimationMeters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentAltitude")
    private final Integer currentAltitude;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousAltitude")
    private final Integer previousAltitude;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("acclimationPercentage")
    private final Integer altitudeAcclimationPercentage;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousAcclimationPercentage")
    private final Integer previousAltitudeAcclimationPercentage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heatAcclimationPercentage")
    private final Integer heatAcclimationPercentage;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("previousHeatAcclimationPercentage")
    private final Integer previousHeatAcclimationPercentage;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("heatTrend")
    private final String heatTrendKey;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("altitudeTrend")
    private final String altitudeTrendKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? null : num2, (i14 & 256) != 0 ? null : num3, (i14 & 512) != 0 ? null : num4, (i14 & 1024) != 0 ? null : num5, (i14 & 2048) != 0 ? null : num6, (i14 & 4096) != 0 ? null : num7, (i14 & 8192) != 0 ? null : num8, (i14 & 16384) != 0 ? null : str7, (i14 & 32768) != 0 ? null : str8);
    }

    public final DateTime b() {
        String str = this.altitudeAcclimationDate;
        if (str == null || !(!w.J(str))) {
            return null;
        }
        return j0.K(this.altitudeAcclimationDate, "yyyy-MM-dd");
    }

    public final LocalDate d() {
        return g22.k.w(this.altitudeAcclimationDate, "yyyy-MM-dd");
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
        return p005kotlin.jvm.internal.s.g(this.calendarDate, eVar.calendarDate) && p005kotlin.jvm.internal.s.g(this.altitudeAcclimationDate, eVar.altitudeAcclimationDate) && p005kotlin.jvm.internal.s.g(this.previousAltitudeAcclimationDate, eVar.previousAltitudeAcclimationDate) && p005kotlin.jvm.internal.s.g(this.altitudeAcclimationLocalTimestamp, eVar.altitudeAcclimationLocalTimestamp) && p005kotlin.jvm.internal.s.g(this.heatAcclimationDate, eVar.heatAcclimationDate) && p005kotlin.jvm.internal.s.g(this.previousHeatAcclimationDate, eVar.previousHeatAcclimationDate) && p005kotlin.jvm.internal.s.g(this.altitudeAcclimationMeters, eVar.altitudeAcclimationMeters) && p005kotlin.jvm.internal.s.g(this.previousAltitudeAcclimationMeters, eVar.previousAltitudeAcclimationMeters) && p005kotlin.jvm.internal.s.g(this.currentAltitude, eVar.currentAltitude) && p005kotlin.jvm.internal.s.g(this.previousAltitude, eVar.previousAltitude) && p005kotlin.jvm.internal.s.g(this.altitudeAcclimationPercentage, eVar.altitudeAcclimationPercentage) && p005kotlin.jvm.internal.s.g(this.previousAltitudeAcclimationPercentage, eVar.previousAltitudeAcclimationPercentage) && p005kotlin.jvm.internal.s.g(this.heatAcclimationPercentage, eVar.heatAcclimationPercentage) && p005kotlin.jvm.internal.s.g(this.previousHeatAcclimationPercentage, eVar.previousHeatAcclimationPercentage) && p005kotlin.jvm.internal.s.g(this.heatTrendKey, eVar.heatTrendKey) && p005kotlin.jvm.internal.s.g(this.altitudeTrendKey, eVar.altitudeTrendKey);
    }

    public final DateTime f() {
        if (g22.n.d(this.altitudeAcclimationLocalTimestamp)) {
            return j0.K(this.altitudeAcclimationLocalTimestamp, "yyyy-MM-dd'T'HH:mm:ss.S");
        }
        return null;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getAltitudeAcclimationMeters() {
        return this.altitudeAcclimationMeters;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getAltitudeAcclimationPercentage() {
        return this.altitudeAcclimationPercentage;
    }

    public final int hashCode() {
        String str = this.calendarDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.altitudeAcclimationDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.previousAltitudeAcclimationDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.altitudeAcclimationLocalTimestamp;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.heatAcclimationDate;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.previousHeatAcclimationDate;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.altitudeAcclimationMeters;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.previousAltitudeAcclimationMeters;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentAltitude;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.previousAltitude;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.altitudeAcclimationPercentage;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.previousAltitudeAcclimationPercentage;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.heatAcclimationPercentage;
        int iHashCode13 = (iHashCode12 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.previousHeatAcclimationPercentage;
        int iHashCode14 = (iHashCode13 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str7 = this.heatTrendKey;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.altitudeTrendKey;
        return iHashCode15 + (str8 != null ? str8.hashCode() : 0);
    }

    public final x61.a i() {
        x61.a.c cVar = x61.a.f189174j;
        String str = this.altitudeTrendKey;
        cVar.getClass();
        return x61.a.c.a(str);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getAltitudeTrendKey() {
        return this.altitudeTrendKey;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    public final LocalDate m() {
        return g22.k.w(this.calendarDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Integer getCurrentAltitude() {
        return this.currentAltitude;
    }

    public final DateTime q() {
        String str = this.heatAcclimationDate;
        if (str == null || !(!w.J(str))) {
            return null;
        }
        return j0.K(this.heatAcclimationDate, "yyyy-MM-dd");
    }

    public final LocalDate r() {
        return g22.k.w(this.heatAcclimationDate, "yyyy-MM-dd");
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final Integer getHeatAcclimationPercentage() {
        return this.heatAcclimationPercentage;
    }

    public final x61.a t() {
        x61.a.c cVar = x61.a.f189174j;
        String str = this.heatTrendKey;
        cVar.getClass();
        return x61.a.c.a(str);
    }

    public final String toString() {
        String str = this.calendarDate;
        String str2 = this.altitudeAcclimationDate;
        String str3 = this.previousAltitudeAcclimationDate;
        String str4 = this.altitudeAcclimationLocalTimestamp;
        String str5 = this.heatAcclimationDate;
        String str6 = this.previousHeatAcclimationDate;
        Integer num = this.altitudeAcclimationMeters;
        Integer num2 = this.previousAltitudeAcclimationMeters;
        Integer num3 = this.currentAltitude;
        Integer num4 = this.previousAltitude;
        Integer num5 = this.altitudeAcclimationPercentage;
        Integer num6 = this.previousAltitudeAcclimationPercentage;
        Integer num7 = this.heatAcclimationPercentage;
        Integer num8 = this.previousHeatAcclimationPercentage;
        String str7 = this.heatTrendKey;
        String str8 = this.altitudeTrendKey;
        StringBuilder sbI = p6.b.i("HeatAltitudeAcclimationDto(calendarDate=", str, ", altitudeAcclimationDate=", str2, ", previousAltitudeAcclimationDate=");
        sn.a.t(sbI, str3, ", altitudeAcclimationLocalTimestamp=", str4, ", heatAcclimationDate=");
        sn.a.t(sbI, str5, ", previousHeatAcclimationDate=", str6, ", altitudeAcclimationMeters=");
        x.m(sbI, num, ", previousAltitudeAcclimationMeters=", num2, ", currentAltitude=");
        x.m(sbI, num3, ", previousAltitude=", num4, ", altitudeAcclimationPercentage=");
        x.m(sbI, num5, ", previousAltitudeAcclimationPercentage=", num6, ", heatAcclimationPercentage=");
        x.m(sbI, num7, ", previousHeatAcclimationPercentage=", num8, ", heatTrendKey=");
        return e5.h(sbI, str7, ", altitudeTrendKey=", str8, ")");
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final String getHeatTrendKey() {
        return this.heatTrendKey;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.calendarDate);
        parcel.writeString(this.altitudeAcclimationDate);
        parcel.writeString(this.previousAltitudeAcclimationDate);
        parcel.writeString(this.altitudeAcclimationLocalTimestamp);
        parcel.writeString(this.heatAcclimationDate);
        parcel.writeString(this.previousHeatAcclimationDate);
        Integer num = this.altitudeAcclimationMeters;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.previousAltitudeAcclimationMeters;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.currentAltitude;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.previousAltitude;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.altitudeAcclimationPercentage;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.previousAltitudeAcclimationPercentage;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Integer num7 = this.heatAcclimationPercentage;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        Integer num8 = this.previousHeatAcclimationPercentage;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        parcel.writeString(this.heatTrendKey);
        parcel.writeString(this.altitudeTrendKey);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final Integer getPreviousAltitudeAcclimationMeters() {
        return this.previousAltitudeAcclimationMeters;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Integer getPreviousHeatAcclimationPercentage() {
        return this.previousHeatAcclimationPercentage;
    }

    public e(String str, String str2, String str3, String str4, String str5, String str6, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str7, String str8) {
        this.calendarDate = str;
        this.altitudeAcclimationDate = str2;
        this.previousAltitudeAcclimationDate = str3;
        this.altitudeAcclimationLocalTimestamp = str4;
        this.heatAcclimationDate = str5;
        this.previousHeatAcclimationDate = str6;
        this.altitudeAcclimationMeters = num;
        this.previousAltitudeAcclimationMeters = num2;
        this.currentAltitude = num3;
        this.previousAltitude = num4;
        this.altitudeAcclimationPercentage = num5;
        this.previousAltitudeAcclimationPercentage = num6;
        this.heatAcclimationPercentage = num7;
        this.previousHeatAcclimationPercentage = num8;
        this.heatTrendKey = str7;
        this.altitudeTrendKey = str8;
    }

    public e() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
