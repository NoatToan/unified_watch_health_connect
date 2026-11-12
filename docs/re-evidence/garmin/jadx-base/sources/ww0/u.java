package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\bA\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cBë\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*\"\u0004\b+\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b-\u0010)\u001a\u0004\b-\u0010*\"\u0004\b.\u0010,R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R$\u0010\f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00100\u001a\u0004\b9\u00102\"\u0004\b:\u00104R$\u0010\r\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b$\u00100\u001a\u0004\b;\u00102\"\u0004\b<\u00104R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00100\u001a\u0004\b=\u00102\"\u0004\b>\u00104R$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u00100\u001a\u0004\b@\u00102\"\u0004\bA\u00104R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u00100\u001a\u0004\bB\u00102\"\u0004\bC\u00104R$\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u00100\u001a\u0004\bE\u00102\"\u0004\bF\u00104R$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u00100\u001a\u0004\bG\u00102\"\u0004\bH\u00104R$\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u00100\u001a\u0004\bJ\u00102\"\u0004\bK\u00104R$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bM\u00102\"\u0004\bN\u00104R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u00100\u001a\u0004\bP\u00102\"\u0004\bL\u00104R$\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u00100\u001a\u0004\bQ\u00102\"\u0004\bR\u00104R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010S\u001a\u0004\b8\u0010T\"\u0004\bU\u0010VR$\u0010\u0019\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b<\u00100\u001a\u0004\b?\u00102\"\u0004\bW\u00104¨\u0006X"}, d2 = {"Lww0/u;", "Landroid/os/Parcelable;", "Lww0/i;", "contraception", "Lww0/a;", "menstrualCycleType", "", "avgCycleLength", "avgPeriodLength", "", "periodPrediction", "skinTempPrediction", "fertileWindowPrediction", "flowTracking", "dischargeTracking", "moodTracking", "ovulationDateTracking", "sexDriveTracking", "sexualActivityTracking", "physicalSymptomsTracking", "menopauseSymptomsTracking", "babyMovementTracking", "glucoseTracking", "Lorg/joda/time/DateTime;", "inactiveReportTimestamp", "pregnancySetup", "<init>", "(Lww0/i;Lww0/a;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;)V", "a", "Lww0/i;", "getContraception", "()Lww0/i;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "(Lww0/i;)V", "b", "Lww0/a;", "h", "()Lww0/a;", "A", "(Lww0/a;)V", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", JWKParameterNames.OCT_KEY_VALUE, "(Ljava/lang/Integer;)V", "d", "m", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/Boolean;", "F", "(Ljava/lang/Boolean;)V", "f", "getSkinTempPrediction", "Z", "g", "getFertileWindowPrediction", "s", "getFlowTracking", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "getDischargeTracking", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "j", "getMoodTracking", "C", "getOvulationDateTracking", "D", "l", "getSexDriveTracking", "I", "getSexualActivityTracking", "M", JWKParameterNames.RSA_MODULUS, "getPhysicalSymptomsTracking", "G", "o", "getMenopauseSymptomsTracking", "z", "p", "getBabyMovementTracking", "getGlucoseTracking", "u", "Lorg/joda/time/DateTime;", "()Lorg/joda/time/DateTime;", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "(Lorg/joda/time/DateTime;)V", "H", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("contraception")
    private i contraception;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("menstrualCycleType")
    private ww0.a menstrualCycleType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgCycleLength")
    private Integer avgCycleLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("avgPeriodLength")
    private Integer avgPeriodLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodPrediction")
    private Boolean periodPrediction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("skinTempPrediction")
    private Boolean skinTempPrediction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ovulationPrediction")
    private Boolean fertileWindowPrediction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("flowTracking")
    private Boolean flowTracking;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dischargeTracking")
    private Boolean dischargeTracking;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("moodTracking")
    private Boolean moodTracking;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ovulationDateTracking")
    private Boolean ovulationDateTracking;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexDriveTracking")
    private Boolean sexDriveTracking;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sexualActivityTracking")
    private Boolean sexualActivityTracking;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("physicalSymptomsTracking")
    private Boolean physicalSymptomsTracking;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("menopauseSymptomsTracking")
    private Boolean menopauseSymptomsTracking;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("babyMovementTracking")
    private Boolean babyMovementTracking;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("glucoseTracking")
    private Boolean glucoseTracking;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("inactiveReportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime inactiveReportTimestamp;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pregnancySetup")
    private Boolean pregnancySetup;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean boolValueOf10;
            Boolean boolValueOf11;
            Boolean boolValueOf12;
            Boolean boolValueOf13;
            parcel.getClass();
            Boolean boolValueOf14 = null;
            i iVarValueOf = parcel.readInt() == 0 ? null : i.valueOf(parcel.readString());
            ww0.a aVarValueOf = parcel.readInt() == 0 ? null : ww0.a.valueOf(parcel.readString());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf10 = null;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf11 = null;
            } else {
                boolValueOf11 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf12 = null;
            } else {
                boolValueOf12 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf13 = null;
            } else {
                boolValueOf13 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DateTime dateTime = (DateTime) parcel.readSerializable();
            if (parcel.readInt() != 0) {
                boolValueOf14 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new u(iVarValueOf, aVarValueOf, numValueOf, numValueOf2, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, boolValueOf10, boolValueOf11, boolValueOf12, boolValueOf13, dateTime, boolValueOf14);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ u(i iVar, ww0.a aVar, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, DateTime dateTime, Boolean bool14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : iVar, (i14 & 2) != 0 ? null : aVar, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : bool2, (i14 & 64) != 0 ? null : bool3, (i14 & 128) != 0 ? null : bool4, (i14 & 256) != 0 ? null : bool5, (i14 & 512) != 0 ? null : bool6, (i14 & 1024) != 0 ? null : bool7, (i14 & 2048) != 0 ? null : bool8, (i14 & 4096) != 0 ? null : bool9, (i14 & 8192) != 0 ? null : bool10, (i14 & 16384) != 0 ? null : bool11, (i14 & 32768) != 0 ? null : bool12, (i14 & 65536) != 0 ? null : bool13, (i14 & 131072) != 0 ? null : dateTime, (i14 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0 ? null : bool14);
    }

    public final void A(ww0.a aVar) {
        this.menstrualCycleType = aVar;
    }

    public final void C(Boolean bool) {
        this.moodTracking = bool;
    }

    public final void D(Boolean bool) {
        this.ovulationDateTracking = bool;
    }

    public final void F(Boolean bool) {
        this.periodPrediction = bool;
    }

    public final void G(Boolean bool) {
        this.physicalSymptomsTracking = bool;
    }

    public final void H(Boolean bool) {
        this.pregnancySetup = bool;
    }

    public final void I(Boolean bool) {
        this.sexDriveTracking = bool;
    }

    public final void M(Boolean bool) {
        this.sexualActivityTracking = bool;
    }

    public final void Z(Boolean bool) {
        this.skinTempPrediction = bool;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAvgCycleLength() {
        return this.avgCycleLength;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAvgPeriodLength() {
        return this.avgPeriodLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.contraception == uVar.contraception && this.menstrualCycleType == uVar.menstrualCycleType && p005kotlin.jvm.internal.s.g(this.avgCycleLength, uVar.avgCycleLength) && p005kotlin.jvm.internal.s.g(this.avgPeriodLength, uVar.avgPeriodLength) && p005kotlin.jvm.internal.s.g(this.periodPrediction, uVar.periodPrediction) && p005kotlin.jvm.internal.s.g(this.skinTempPrediction, uVar.skinTempPrediction) && p005kotlin.jvm.internal.s.g(this.fertileWindowPrediction, uVar.fertileWindowPrediction) && p005kotlin.jvm.internal.s.g(this.flowTracking, uVar.flowTracking) && p005kotlin.jvm.internal.s.g(this.dischargeTracking, uVar.dischargeTracking) && p005kotlin.jvm.internal.s.g(this.moodTracking, uVar.moodTracking) && p005kotlin.jvm.internal.s.g(this.ovulationDateTracking, uVar.ovulationDateTracking) && p005kotlin.jvm.internal.s.g(this.sexDriveTracking, uVar.sexDriveTracking) && p005kotlin.jvm.internal.s.g(this.sexualActivityTracking, uVar.sexualActivityTracking) && p005kotlin.jvm.internal.s.g(this.physicalSymptomsTracking, uVar.physicalSymptomsTracking) && p005kotlin.jvm.internal.s.g(this.menopauseSymptomsTracking, uVar.menopauseSymptomsTracking) && p005kotlin.jvm.internal.s.g(this.babyMovementTracking, uVar.babyMovementTracking) && p005kotlin.jvm.internal.s.g(this.glucoseTracking, uVar.glucoseTracking) && p005kotlin.jvm.internal.s.g(this.inactiveReportTimestamp, uVar.inactiveReportTimestamp) && p005kotlin.jvm.internal.s.g(this.pregnancySetup, uVar.pregnancySetup);
    }

    public final u f() {
        return new u(this.contraception, this.menstrualCycleType, this.avgCycleLength, this.avgPeriodLength, this.periodPrediction, this.skinTempPrediction, this.fertileWindowPrediction, this.flowTracking, this.dischargeTracking, this.moodTracking, this.ovulationDateTracking, this.sexDriveTracking, this.sexualActivityTracking, this.physicalSymptomsTracking, this.menopauseSymptomsTracking, this.babyMovementTracking, this.glucoseTracking, this.inactiveReportTimestamp, this.pregnancySetup);
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final DateTime getInactiveReportTimestamp() {
        return this.inactiveReportTimestamp;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ww0.a getMenstrualCycleType() {
        return this.menstrualCycleType;
    }

    public final int hashCode() {
        i iVar = this.contraception;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        ww0.a aVar = this.menstrualCycleType;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.avgCycleLength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.avgPeriodLength;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.periodPrediction;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skinTempPrediction;
        int iHashCode6 = (iHashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.fertileWindowPrediction;
        int iHashCode7 = (iHashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.flowTracking;
        int iHashCode8 = (iHashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.dischargeTracking;
        int iHashCode9 = (iHashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.moodTracking;
        int iHashCode10 = (iHashCode9 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.ovulationDateTracking;
        int iHashCode11 = (iHashCode10 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.sexDriveTracking;
        int iHashCode12 = (iHashCode11 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.sexualActivityTracking;
        int iHashCode13 = (iHashCode12 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.physicalSymptomsTracking;
        int iHashCode14 = (iHashCode13 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.menopauseSymptomsTracking;
        int iHashCode15 = (iHashCode14 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.babyMovementTracking;
        int iHashCode16 = (iHashCode15 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.glucoseTracking;
        int iHashCode17 = (iHashCode16 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        DateTime dateTime = this.inactiveReportTimestamp;
        int iHashCode18 = (iHashCode17 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool14 = this.pregnancySetup;
        return iHashCode18 + (bool14 != null ? bool14.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Boolean getPeriodPrediction() {
        return this.periodPrediction;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getPregnancySetup() {
        return this.pregnancySetup;
    }

    public final void k(Integer num) {
        this.avgCycleLength = num;
    }

    public final void m(Integer num) {
        this.avgPeriodLength = num;
    }

    public final void o(Boolean bool) {
        this.babyMovementTracking = bool;
    }

    public final void q(i iVar) {
        this.contraception = iVar;
    }

    public final void r(Boolean bool) {
        this.dischargeTracking = bool;
    }

    public final void s(Boolean bool) {
        this.fertileWindowPrediction = bool;
    }

    public final void t(Boolean bool) {
        this.flowTracking = bool;
    }

    public final String toString() {
        i iVar = this.contraception;
        ww0.a aVar = this.menstrualCycleType;
        Integer num = this.avgCycleLength;
        Integer num2 = this.avgPeriodLength;
        Boolean bool = this.periodPrediction;
        Boolean bool2 = this.skinTempPrediction;
        Boolean bool3 = this.fertileWindowPrediction;
        Boolean bool4 = this.flowTracking;
        Boolean bool5 = this.dischargeTracking;
        Boolean bool6 = this.moodTracking;
        Boolean bool7 = this.ovulationDateTracking;
        Boolean bool8 = this.sexDriveTracking;
        Boolean bool9 = this.sexualActivityTracking;
        Boolean bool10 = this.physicalSymptomsTracking;
        Boolean bool11 = this.menopauseSymptomsTracking;
        Boolean bool12 = this.babyMovementTracking;
        Boolean bool13 = this.glucoseTracking;
        DateTime dateTime = this.inactiveReportTimestamp;
        Boolean bool14 = this.pregnancySetup;
        StringBuilder sb3 = new StringBuilder("UserMenstrualCycleSettingsDTO(contraception=");
        sb3.append(iVar);
        sb3.append(", menstrualCycleType=");
        sb3.append(aVar);
        sb3.append(", avgCycleLength=");
        x.m(sb3, num, ", avgPeriodLength=", num2, ", periodPrediction=");
        b71.i.o(bool, bool2, ", skinTempPrediction=", ", fertileWindowPrediction=", sb3);
        b71.i.o(bool3, bool4, ", flowTracking=", ", dischargeTracking=", sb3);
        b71.i.o(bool5, bool6, ", moodTracking=", ", ovulationDateTracking=", sb3);
        b71.i.o(bool7, bool8, ", sexDriveTracking=", ", sexualActivityTracking=", sb3);
        b71.i.o(bool9, bool10, ", physicalSymptomsTracking=", ", menopauseSymptomsTracking=", sb3);
        b71.i.o(bool11, bool12, ", babyMovementTracking=", ", glucoseTracking=", sb3);
        sb3.append(bool13);
        sb3.append(", inactiveReportTimestamp=");
        sb3.append(dateTime);
        sb3.append(", pregnancySetup=");
        return p6.b.f(sb3, bool14, ")");
    }

    public final void u(Boolean bool) {
        this.glucoseTracking = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        i iVar = this.contraception;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(iVar.name());
        }
        ww0.a aVar = this.menstrualCycleType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        Integer num = this.avgCycleLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.avgPeriodLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Boolean bool = this.periodPrediction;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Boolean bool2 = this.skinTempPrediction;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.fertileWindowPrediction;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Boolean bool4 = this.flowTracking;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool4);
        }
        Boolean bool5 = this.dischargeTracking;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool5);
        }
        Boolean bool6 = this.moodTracking;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool6);
        }
        Boolean bool7 = this.ovulationDateTracking;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool7);
        }
        Boolean bool8 = this.sexDriveTracking;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool8);
        }
        Boolean bool9 = this.sexualActivityTracking;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool9);
        }
        Boolean bool10 = this.physicalSymptomsTracking;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool10);
        }
        Boolean bool11 = this.menopauseSymptomsTracking;
        if (bool11 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool11);
        }
        Boolean bool12 = this.babyMovementTracking;
        if (bool12 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool12);
        }
        Boolean bool13 = this.glucoseTracking;
        if (bool13 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool13);
        }
        parcel.writeSerializable(this.inactiveReportTimestamp);
        Boolean bool14 = this.pregnancySetup;
        if (bool14 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool14);
        }
    }

    public final void y(DateTime dateTime) {
        this.inactiveReportTimestamp = dateTime;
    }

    public final void z(Boolean bool) {
        this.menopauseSymptomsTracking = bool;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lww0/u$a;", "", "<init>", "()V", "", "MENSTRUAL_CYCLE_TYPE_KEY", "Ljava/lang/String;", "AVG_CYCLE_LENGTH_KEY", "AVG_PERIOD_LENGTH_KEY", "CONTRACEPTION_KEY", "gcm-domain-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public u(i iVar, ww0.a aVar, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, DateTime dateTime, Boolean bool14) {
        this.contraception = iVar;
        this.menstrualCycleType = aVar;
        this.avgCycleLength = num;
        this.avgPeriodLength = num2;
        this.periodPrediction = bool;
        this.skinTempPrediction = bool2;
        this.fertileWindowPrediction = bool3;
        this.flowTracking = bool4;
        this.dischargeTracking = bool5;
        this.moodTracking = bool6;
        this.ovulationDateTracking = bool7;
        this.sexDriveTracking = bool8;
        this.sexualActivityTracking = bool9;
        this.physicalSymptomsTracking = bool10;
        this.menopauseSymptomsTracking = bool11;
        this.babyMovementTracking = bool12;
        this.glucoseTracking = bool13;
        this.inactiveReportTimestamp = dateTime;
        this.pregnancySetup = bool14;
    }

    public u() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
    }
}
