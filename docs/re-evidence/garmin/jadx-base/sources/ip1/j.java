package ip1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b#\u0010 R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b$\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b%\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b\u0017\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b)\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001e\u001a\u0004\b\u001d\u0010 ¨\u0006+"}, d2 = {"Lip1/j;", "Landroid/os/Parcelable;", "Lorg/joda/time/DateTime;", "readingTimestampLocal", "readingTimestampGmt", "", "solarUtilization", "", "notChargingTooHot", "notChargingTooCold", "notChargingBatteryFull", "notChargingExternalPower", "notChargingUserDisabled", "", "activityTimeGainMs", "notChargingOther", "charging", "<init>", "(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "a", "Lorg/joda/time/DateTime;", IntegerTokenConverter.CONVERTER_KEY, "()Lorg/joda/time/DateTime;", "b", "getReadingTimestampGmt", "c", "Ljava/lang/Double;", "getSolarUtilization", "()Ljava/lang/Double;", "d", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_EXPONENT, "g", "f", "getNotChargingExternalPower", "getNotChargingUserDisabled", "Ljava/lang/Long;", "()Ljava/lang/Long;", "j", "getNotChargingOther", JWKParameterNames.OCT_KEY_VALUE, "gcm-solar-charge_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimestampLocal")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime readingTimestampLocal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("readingTimestampGmt")
    @JsonAdapter(GsonUtil.IsoDateTimeTypeAdapter.class)
    private final DateTime readingTimestampGmt;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("solarUtilization")
    private final Double solarUtilization;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingTooHot")
    private final Boolean notChargingTooHot;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingTooCold")
    private final Boolean notChargingTooCold;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingBatteryFull")
    private final Boolean notChargingBatteryFull;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingExternalPower")
    private final Boolean notChargingExternalPower;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingUserDisabled")
    private final Boolean notChargingUserDisabled;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityTimeGainMs")
    private final Long activityTimeGainMs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notChargingOther")
    private final Boolean notChargingOther;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("charging")
    private final Boolean charging;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            parcel.getClass();
            DateTime dateTime = (DateTime) parcel.readSerializable();
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            Boolean boolValueOf7 = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new j(dateTime, dateTime2, dValueOf, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, lValueOf, boolValueOf6, boolValueOf7);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public /* synthetic */ j(DateTime dateTime, DateTime dateTime2, Double d14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l14, Boolean bool6, Boolean bool7, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : dateTime, (i14 & 2) != 0 ? null : dateTime2, (i14 & 4) != 0 ? null : d14, (i14 & 8) != 0 ? null : bool, (i14 & 16) != 0 ? null : bool2, (i14 & 32) != 0 ? null : bool3, (i14 & 64) != 0 ? null : bool4, (i14 & 128) != 0 ? null : bool5, (i14 & 256) != 0 ? null : l14, (i14 & 512) != 0 ? null : bool6, (i14 & 1024) != 0 ? null : bool7);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getActivityTimeGainMs() {
        return this.activityTimeGainMs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Boolean getCharging() {
        return this.charging;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return s.g(this.readingTimestampLocal, jVar.readingTimestampLocal) && s.g(this.readingTimestampGmt, jVar.readingTimestampGmt) && s.g(this.solarUtilization, jVar.solarUtilization) && s.g(this.notChargingTooHot, jVar.notChargingTooHot) && s.g(this.notChargingTooCold, jVar.notChargingTooCold) && s.g(this.notChargingBatteryFull, jVar.notChargingBatteryFull) && s.g(this.notChargingExternalPower, jVar.notChargingExternalPower) && s.g(this.notChargingUserDisabled, jVar.notChargingUserDisabled) && s.g(this.activityTimeGainMs, jVar.activityTimeGainMs) && s.g(this.notChargingOther, jVar.notChargingOther) && s.g(this.charging, jVar.charging);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Boolean getNotChargingBatteryFull() {
        return this.notChargingBatteryFull;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Boolean getNotChargingTooCold() {
        return this.notChargingTooCold;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getNotChargingTooHot() {
        return this.notChargingTooHot;
    }

    public final int hashCode() {
        DateTime dateTime = this.readingTimestampLocal;
        int iHashCode = (dateTime == null ? 0 : dateTime.hashCode()) * 31;
        DateTime dateTime2 = this.readingTimestampGmt;
        int iHashCode2 = (iHashCode + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        Double d14 = this.solarUtilization;
        int iHashCode3 = (iHashCode2 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.notChargingTooHot;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.notChargingTooCold;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.notChargingBatteryFull;
        int iHashCode6 = (iHashCode5 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.notChargingExternalPower;
        int iHashCode7 = (iHashCode6 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.notChargingUserDisabled;
        int iHashCode8 = (iHashCode7 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Long l14 = this.activityTimeGainMs;
        int iHashCode9 = (iHashCode8 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool6 = this.notChargingOther;
        int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.charging;
        return iHashCode10 + (bool7 != null ? bool7.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final DateTime getReadingTimestampLocal() {
        return this.readingTimestampLocal;
    }

    public final String toString() {
        DateTime dateTime = this.readingTimestampLocal;
        DateTime dateTime2 = this.readingTimestampGmt;
        Double d14 = this.solarUtilization;
        Boolean bool = this.notChargingTooHot;
        Boolean bool2 = this.notChargingTooCold;
        Boolean bool3 = this.notChargingBatteryFull;
        Boolean bool4 = this.notChargingExternalPower;
        Boolean bool5 = this.notChargingUserDisabled;
        Long l14 = this.activityTimeGainMs;
        Boolean bool6 = this.notChargingOther;
        Boolean bool7 = this.charging;
        StringBuilder sb3 = new StringBuilder("SolarInputReadingDTO(readingTimestampLocal=");
        sb3.append(dateTime);
        sb3.append(", readingTimestampGmt=");
        sb3.append(dateTime2);
        sb3.append(", solarUtilization=");
        sb3.append(d14);
        sb3.append(", notChargingTooHot=");
        sb3.append(bool);
        sb3.append(", notChargingTooCold=");
        b71.i.o(bool2, bool3, ", notChargingBatteryFull=", ", notChargingExternalPower=", sb3);
        b71.i.o(bool4, bool5, ", notChargingUserDisabled=", ", activityTimeGainMs=", sb3);
        sb3.append(l14);
        sb3.append(", notChargingOther=");
        sb3.append(bool6);
        sb3.append(", charging=");
        return p6.b.f(sb3, bool7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.readingTimestampLocal);
        parcel.writeSerializable(this.readingTimestampGmt);
        Double d14 = this.solarUtilization;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Boolean bool = this.notChargingTooHot;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.notChargingTooCold;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.notChargingBatteryFull;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.notChargingExternalPower;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.notChargingUserDisabled;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Long l14 = this.activityTimeGainMs;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Boolean bool6 = this.notChargingOther;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.charging;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
    }

    public j(DateTime dateTime, DateTime dateTime2, Double d14, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Long l14, Boolean bool6, Boolean bool7) {
        this.readingTimestampLocal = dateTime;
        this.readingTimestampGmt = dateTime2;
        this.solarUtilization = d14;
        this.notChargingTooHot = bool;
        this.notChargingTooCold = bool2;
        this.notChargingBatteryFull = bool3;
        this.notChargingExternalPower = bool4;
        this.notChargingUserDisabled = bool5;
        this.activityTimeGainMs = l14;
        this.notChargingOther = bool6;
        this.charging = bool7;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
