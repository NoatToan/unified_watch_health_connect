package db1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010\u001eR$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b%\u0010\u001c\"\u0004\b,\u0010\u001eR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b2\u0010\u001c\"\u0004\b>\u0010\u001eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u00103\u001a\u0004\b?\u00105\"\u0004\b@\u00107R$\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u00109\u001a\u0004\bA\u0010;\"\u0004\bB\u0010=R$\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010&\u001a\u0004\b8\u0010(\"\u0004\bD\u0010*R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010&\u001a\u0004\bK\u0010(\"\u0004\bL\u0010*R$\u0010\u0016\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u00109\u001a\u0004\bM\u0010;\"\u0004\bN\u0010=¨\u0006O"}, d2 = {"Ldb1/m;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "originalDueDate", "dueDate", "pregnancyCycleStart", "", "title", "deliveryDate", "Ldb1/b;", "numOfBabies", "", "experiencedLoss", "Lorg/joda/time/DateTime;", "lossReportTimestamp", "endDate", "stopTracking", "stopTrackingTimestamp", "notes", "Ldb1/u;", "weightGoalUserInputs", "source", "reportTimestamp", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/String;Lorg/joda/time/LocalDate;Ldb1/b;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Lorg/joda/time/LocalDate;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/String;Ldb1/u;Ljava/lang/String;Lorg/joda/time/DateTime;)V", "a", "Lorg/joda/time/LocalDate;", "j", "()Lorg/joda/time/LocalDate;", "setOriginalDueDate", "(Lorg/joda/time/LocalDate;)V", "b", "f", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "c", JWKParameterNames.OCT_KEY_VALUE, "setPregnancyCycleStart", "d", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "F", "(Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "Ldb1/b;", IntegerTokenConverter.CONVERTER_KEY, "()Ldb1/b;", "z", "(Ldb1/b;)V", "g", "Ljava/lang/Boolean;", "getExperiencedLoss", "()Ljava/lang/Boolean;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Ljava/lang/Boolean;)V", "h", "Lorg/joda/time/DateTime;", "getLossReportTimestamp", "()Lorg/joda/time/DateTime;", "u", "(Lorg/joda/time/DateTime;)V", "s", "getStopTracking", "C", "getStopTrackingTimestamp", "D", "l", JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE, "Ldb1/u;", "o", "()Ldb1/u;", "setWeightGoalUserInputs", "(Ldb1/u;)V", JWKParameterNames.RSA_MODULUS, "getSource", "setSource", "getReportTimestamp", "A", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("originalDueDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate originalDueDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dueDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate dueDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pregnancyCycleStart")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate pregnancyCycleStart;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("title")
    private String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deliveryDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate deliveryDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numOfBabies")
    private b numOfBabies;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("experiencedLoss")
    private Boolean experiencedLoss;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lossReportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime lossReportTimestamp;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate endDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stopTracking")
    private Boolean stopTracking;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stopTrackingTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime stopTrackingTimestamp;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("notes")
    private String notes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("weightGoalUserInputs")
    private u weightGoalUserInputs;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("source")
    private String source;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(GsonUtil.UtcDateTimeTypeAdapter.class)
    private DateTime reportTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            String string = parcel.readString();
            LocalDate localDate4 = (LocalDate) parcel.readSerializable();
            b bVarValueOf = parcel.readInt() == 0 ? null : b.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DateTime dateTime = (DateTime) parcel.readSerializable();
            LocalDate localDate5 = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            DateTime dateTime2 = (DateTime) parcel.readSerializable();
            u uVarCreateFromParcel = null;
            Boolean bool = boolValueOf;
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                uVarCreateFromParcel = u.CREATOR.createFromParcel(parcel);
            }
            return new m(localDate, localDate2, localDate3, string, localDate4, bVarValueOf, bool, dateTime, localDate5, boolValueOf2, dateTime2, string2, uVarCreateFromParcel, parcel.readString(), (DateTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public /* synthetic */ m(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str, LocalDate localDate4, b bVar, Boolean bool, DateTime dateTime, LocalDate localDate5, Boolean bool2, DateTime dateTime2, String str2, u uVar, String str3, DateTime dateTime3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : localDate2, (i14 & 4) != 0 ? null : localDate3, (i14 & 8) != 0 ? null : str, (i14 & 16) != 0 ? null : localDate4, (i14 & 32) != 0 ? null : bVar, (i14 & 64) != 0 ? null : bool, (i14 & 128) != 0 ? null : dateTime, (i14 & 256) != 0 ? null : localDate5, (i14 & 512) != 0 ? null : bool2, (i14 & 1024) != 0 ? null : dateTime2, (i14 & 2048) != 0 ? null : str2, (i14 & 4096) != 0 ? null : uVar, (i14 & 8192) != 0 ? null : str3, (i14 & 16384) != 0 ? null : dateTime3);
    }

    public static m b(m mVar, u uVar) {
        LocalDate localDate = mVar.originalDueDate;
        LocalDate localDate2 = mVar.dueDate;
        LocalDate localDate3 = mVar.pregnancyCycleStart;
        String str = mVar.title;
        LocalDate localDate4 = mVar.deliveryDate;
        b bVar = mVar.numOfBabies;
        Boolean bool = mVar.experiencedLoss;
        DateTime dateTime = mVar.lossReportTimestamp;
        LocalDate localDate5 = mVar.endDate;
        Boolean bool2 = mVar.stopTracking;
        DateTime dateTime2 = mVar.stopTrackingTimestamp;
        String str2 = mVar.notes;
        String str3 = mVar.source;
        DateTime dateTime3 = mVar.reportTimestamp;
        mVar.getClass();
        return new m(localDate, localDate2, localDate3, str, localDate4, bVar, bool, dateTime, localDate5, bool2, dateTime2, str2, uVar, str3, dateTime3);
    }

    public final void A(DateTime dateTime) {
        this.reportTimestamp = dateTime;
    }

    public final void C(Boolean bool) {
        this.stopTracking = bool;
    }

    public final void D(DateTime dateTime) {
        this.stopTrackingTimestamp = dateTime;
    }

    public final void F(String str) {
        this.title = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getDeliveryDate() {
        return this.deliveryDate;
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
        return p005kotlin.jvm.internal.s.g(this.originalDueDate, mVar.originalDueDate) && p005kotlin.jvm.internal.s.g(this.dueDate, mVar.dueDate) && p005kotlin.jvm.internal.s.g(this.pregnancyCycleStart, mVar.pregnancyCycleStart) && p005kotlin.jvm.internal.s.g(this.title, mVar.title) && p005kotlin.jvm.internal.s.g(this.deliveryDate, mVar.deliveryDate) && this.numOfBabies == mVar.numOfBabies && p005kotlin.jvm.internal.s.g(this.experiencedLoss, mVar.experiencedLoss) && p005kotlin.jvm.internal.s.g(this.lossReportTimestamp, mVar.lossReportTimestamp) && p005kotlin.jvm.internal.s.g(this.endDate, mVar.endDate) && p005kotlin.jvm.internal.s.g(this.stopTracking, mVar.stopTracking) && p005kotlin.jvm.internal.s.g(this.stopTrackingTimestamp, mVar.stopTrackingTimestamp) && p005kotlin.jvm.internal.s.g(this.notes, mVar.notes) && p005kotlin.jvm.internal.s.g(this.weightGoalUserInputs, mVar.weightGoalUserInputs) && p005kotlin.jvm.internal.s.g(this.source, mVar.source) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, mVar.reportTimestamp);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final LocalDate getDueDate() {
        return this.dueDate;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final int hashCode() {
        LocalDate localDate = this.originalDueDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.dueDate;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.pregnancyCycleStart;
        int iHashCode3 = (iHashCode2 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        String str = this.title;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate4 = this.deliveryDate;
        int iHashCode5 = (iHashCode4 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31;
        b bVar = this.numOfBabies;
        int iHashCode6 = (iHashCode5 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Boolean bool = this.experiencedLoss;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.lossReportTimestamp;
        int iHashCode8 = (iHashCode7 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        LocalDate localDate5 = this.endDate;
        int iHashCode9 = (iHashCode8 + (localDate5 == null ? 0 : localDate5.hashCode())) * 31;
        Boolean bool2 = this.stopTracking;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        DateTime dateTime2 = this.stopTrackingTimestamp;
        int iHashCode11 = (iHashCode10 + (dateTime2 == null ? 0 : dateTime2.hashCode())) * 31;
        String str2 = this.notes;
        int iHashCode12 = (iHashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        u uVar = this.weightGoalUserInputs;
        int iHashCode13 = (iHashCode12 + (uVar == null ? 0 : uVar.hashCode())) * 31;
        String str3 = this.source;
        int iHashCode14 = (iHashCode13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DateTime dateTime3 = this.reportTimestamp;
        return iHashCode14 + (dateTime3 != null ? dateTime3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final b getNumOfBabies() {
        return this.numOfBabies;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LocalDate getOriginalDueDate() {
        return this.originalDueDate;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final LocalDate getPregnancyCycleStart() {
        return this.pregnancyCycleStart;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final u getWeightGoalUserInputs() {
        return this.weightGoalUserInputs;
    }

    public final void q(LocalDate localDate) {
        this.deliveryDate = localDate;
    }

    public final void r(LocalDate localDate) {
        this.dueDate = localDate;
    }

    public final void s(LocalDate localDate) {
        this.endDate = localDate;
    }

    public final void t(Boolean bool) {
        this.experiencedLoss = bool;
    }

    public final String toString() {
        return "PregnancySnapshotDTO(originalDueDate=" + this.originalDueDate + ", dueDate=" + this.dueDate + ", pregnancyCycleStart=" + this.pregnancyCycleStart + ", title=" + this.title + ", deliveryDate=" + this.deliveryDate + ", numOfBabies=" + this.numOfBabies + ", experiencedLoss=" + this.experiencedLoss + ", lossReportTimestamp=" + this.lossReportTimestamp + ", endDate=" + this.endDate + ", stopTracking=" + this.stopTracking + ", stopTrackingTimestamp=" + this.stopTrackingTimestamp + ", notes=" + this.notes + ", weightGoalUserInputs=" + this.weightGoalUserInputs + ", source=" + this.source + ", reportTimestamp=" + this.reportTimestamp + ")";
    }

    public final void u(DateTime dateTime) {
        this.lossReportTimestamp = dateTime;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.originalDueDate);
        parcel.writeSerializable(this.dueDate);
        parcel.writeSerializable(this.pregnancyCycleStart);
        parcel.writeString(this.title);
        parcel.writeSerializable(this.deliveryDate);
        b bVar = this.numOfBabies;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(bVar.name());
        }
        Boolean bool = this.experiencedLoss;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeSerializable(this.lossReportTimestamp);
        parcel.writeSerializable(this.endDate);
        Boolean bool2 = this.stopTracking;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        parcel.writeSerializable(this.stopTrackingTimestamp);
        parcel.writeString(this.notes);
        u uVar = this.weightGoalUserInputs;
        if (uVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.source);
        parcel.writeSerializable(this.reportTimestamp);
    }

    public final void y(String str) {
        this.notes = str;
    }

    public final void z(b bVar) {
        this.numOfBabies = bVar;
    }

    public m(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str, LocalDate localDate4, b bVar, Boolean bool, DateTime dateTime, LocalDate localDate5, Boolean bool2, DateTime dateTime2, String str2, u uVar, String str3, DateTime dateTime3) {
        this.originalDueDate = localDate;
        this.dueDate = localDate2;
        this.pregnancyCycleStart = localDate3;
        this.title = str;
        this.deliveryDate = localDate4;
        this.numOfBabies = bVar;
        this.experiencedLoss = bool;
        this.lossReportTimestamp = dateTime;
        this.endDate = localDate5;
        this.stopTracking = bool2;
        this.stopTrackingTimestamp = dateTime2;
        this.notes = str2;
        this.weightGoalUserInputs = uVar;
        this.source = str3;
        this.reportTimestamp = dateTime3;
    }

    public m() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
