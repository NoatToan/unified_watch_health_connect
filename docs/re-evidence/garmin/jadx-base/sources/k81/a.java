package k81;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import fb1.c;
import j20.x;
import kg.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lk81/a;", "Landroid/os/Parcelable;", "", "userProfilePk", "deviceId", "", "calendarDate", "", "hillStrengthScore", "hillEnduranceScore", "", "vo2MaxScore", "vo2MaxPreciseValue", "hillScore", "hillScoreClassificationId", "hillScoreFeedbackPhraseId", "", "primaryTrainingDevice", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "a", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "b", "d", "c", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", JWKParameterNames.RSA_EXPONENT, "f", "Ljava/lang/Double;", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "()Ljava/lang/Double;", "g", "o", "h", IntegerTokenConverter.CONVERTER_KEY, JWKParameterNames.OCT_KEY_VALUE, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1983a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePK")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceId")
    private final Long deviceId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("calendarDate")
    private final String calendarDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strengthScore")
    private final Integer hillStrengthScore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enduranceScore")
    private final Integer hillEnduranceScore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2Max")
    private final Double vo2MaxScore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("vo2MaxPreciseValue")
    private final Double vo2MaxPreciseValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overallScore")
    private final Integer hillScore;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hillScoreClassificationId")
    private final Integer hillScoreClassificationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hillScoreFeedbackPhraseId")
    private final Integer hillScoreFeedbackPhraseId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryTrainingDevice")
    private final Boolean primaryTrainingDevice;

    /* JADX INFO: renamed from: k81.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1983a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(lValueOf, lValueOf2, string, numValueOf, numValueOf2, dValueOf, dValueOf2, numValueOf3, numValueOf4, numValueOf5, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Long l14, Long l15, String str, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Boolean bool, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15, (i14 & 128) != 0 ? null : num3, (i14 & 256) != 0 ? null : num4, (i14 & 512) != 0 ? null : num5, (i14 & 1024) != 0 ? null : bool);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCalendarDate() {
        return this.calendarDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getDeviceId() {
        return this.deviceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.userProfilePk, aVar.userProfilePk) && s.g(this.deviceId, aVar.deviceId) && s.g(this.calendarDate, aVar.calendarDate) && s.g(this.hillStrengthScore, aVar.hillStrengthScore) && s.g(this.hillEnduranceScore, aVar.hillEnduranceScore) && s.g(this.vo2MaxScore, aVar.vo2MaxScore) && s.g(this.vo2MaxPreciseValue, aVar.vo2MaxPreciseValue) && s.g(this.hillScore, aVar.hillScore) && s.g(this.hillScoreClassificationId, aVar.hillScoreClassificationId) && s.g(this.hillScoreFeedbackPhraseId, aVar.hillScoreFeedbackPhraseId) && s.g(this.primaryTrainingDevice, aVar.primaryTrainingDevice);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getHillEnduranceScore() {
        return this.hillEnduranceScore;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getHillScore() {
        return this.hillScore;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getHillScoreClassificationId() {
        return this.hillScoreClassificationId;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.deviceId;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.calendarDate;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.hillStrengthScore;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hillEnduranceScore;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.vo2MaxScore;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.vo2MaxPreciseValue;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num3 = this.hillScore;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.hillScoreClassificationId;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.hillScoreFeedbackPhraseId;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.primaryTrainingDevice;
        return iHashCode10 + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getHillScoreFeedbackPhraseId() {
        return this.hillScoreFeedbackPhraseId;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getHillStrengthScore() {
        return this.hillStrengthScore;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Boolean getPrimaryTrainingDevice() {
        return this.primaryTrainingDevice;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final Long getUserProfilePk() {
        return this.userProfilePk;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final Double getVo2MaxPreciseValue() {
        return this.vo2MaxPreciseValue;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final Double getVo2MaxScore() {
        return this.vo2MaxScore;
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        Long l15 = this.deviceId;
        String str = this.calendarDate;
        Integer num = this.hillStrengthScore;
        Integer num2 = this.hillEnduranceScore;
        Double d14 = this.vo2MaxScore;
        Double d15 = this.vo2MaxPreciseValue;
        Integer num3 = this.hillScore;
        Integer num4 = this.hillScoreClassificationId;
        Integer num5 = this.hillScoreFeedbackPhraseId;
        Boolean bool = this.primaryTrainingDevice;
        StringBuilder sbJ = f3.j(l14, l15, "HillScoreDTO(userProfilePk=", ", deviceId=", ", calendarDate=");
        c.u(num, str, ", hillStrengthScore=", ", hillEnduranceScore=", sbJ);
        i.v(sbJ, num2, ", vo2MaxScore=", d14, ", vo2MaxPreciseValue=");
        i.t(sbJ, d15, ", hillScore=", num3, ", hillScoreClassificationId=");
        x.m(sbJ, num4, ", hillScoreFeedbackPhraseId=", num5, ", primaryTrainingDevice=");
        return p6.b.f(sbJ, bool, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.userProfilePk;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.deviceId;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.calendarDate);
        Integer num = this.hillStrengthScore;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.hillEnduranceScore;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        Double d14 = this.vo2MaxScore;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.vo2MaxPreciseValue;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num3 = this.hillScore;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num3);
        }
        Integer num4 = this.hillScoreClassificationId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num4);
        }
        Integer num5 = this.hillScoreFeedbackPhraseId;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num5);
        }
        Boolean bool = this.primaryTrainingDevice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
    }

    public a(Long l14, Long l15, String str, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Boolean bool) {
        this.userProfilePk = l14;
        this.deviceId = l15;
        this.calendarDate = str;
        this.hillStrengthScore = num;
        this.hillEnduranceScore = num2;
        this.vo2MaxScore = d14;
        this.vo2MaxPreciseValue = d15;
        this.hillScore = num3;
        this.hillScoreClassificationId = num4;
        this.hillScoreFeedbackPhraseId = num5;
        this.primaryTrainingDevice = bool;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }
}
