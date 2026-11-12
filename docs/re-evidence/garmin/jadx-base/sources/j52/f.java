package j52;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.womenshealth.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b0\u0010)R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b3\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010'\u001a\u0004\b5\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010'\u001a\u0004\b7\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010'\u001a\u0004\b.\u0010)R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010'\u001a\u0004\b@\u0010)R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010!\"\u0004\bC\u0010#R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010\u001f\u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\bH\u0010#R,\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010<¨\u0006U"}, d2 = {"Lj52/f;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "dataDate", "startDate", "", "cycleDay", "periodLength", "currentPhase", "currentPhaseLength", "daysUntilNextPhase", "fertileWindowStartDay", "fertileWindowLength", "predictedCycleLength", "educationContentMod", "lutealPhaseStart", "", "pregnancyCycle", "numberOfWeek", "dueDate", "deliveryDate", "endDate", "", "Lj52/i;", "overlapCycleList", "Lww0/a;", "cycleType", "predictedCycle", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Integer;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Ljava/util/List;Lww0/a;Ljava/lang/Boolean;)V", "a", "Lorg/joda/time/LocalDate;", "getDataDate", "()Lorg/joda/time/LocalDate;", "setDataDate", "(Lorg/joda/time/LocalDate;)V", "b", "getStartDate", "c", "Ljava/lang/Integer;", "getCycleDay", "()Ljava/lang/Integer;", "d", "g", JWKParameterNames.RSA_EXPONENT, "getCurrentPhase", "f", "getCurrentPhaseLength", "getDaysUntilNextPhase", "h", IntegerTokenConverter.CONVERTER_KEY, "getFertileWindowLength", "j", "getPredictedCycleLength", JWKParameterNames.OCT_KEY_VALUE, "getEducationContentMod", "l", "m", "Ljava/lang/Boolean;", "getPregnancyCycle", "()Ljava/lang/Boolean;", "setPregnancyCycle", "(Ljava/lang/Boolean;)V", JWKParameterNames.RSA_MODULUS, "getNumberOfWeek", "o", "getDueDate", "setDueDate", "p", "getDeliveryDate", "setDeliveryDate", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "setEndDate", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "Ljava/util/List;", "getOverlapCycleList", "()Ljava/util/List;", "setOverlapCycleList", "(Ljava/util/List;)V", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "Lww0/a;", "getCycleType", "()Lww0/a;", "v", "getPredictedCycle", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dataDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate dataDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dayInCycle")
    private final Integer cycleDay;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodLength")
    private final Integer periodLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentPhase")
    private final Integer currentPhase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lengthOfCurrentPhase")
    private final Integer currentPhaseLength;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daysUntilNextPhase")
    private final Integer daysUntilNextPhase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fertileWindowStart")
    private final Integer fertileWindowStartDay;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lengthOfFertileWindow")
    private final Integer fertileWindowLength;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedCycleLength")
    private final Integer predictedCycleLength;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @SerializedName("educationContentMod")
    private final Integer educationContentMod;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lutealPhaseStart")
    private final Integer lutealPhaseStart;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pregnancyCycle")
    private Boolean pregnancyCycle;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @SerializedName("numberOfWeek")
    private final Integer numberOfWeek;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @SerializedName("dueDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate dueDate;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deliveryDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate deliveryDate;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    @JsonAdapter(LocalDateAdapter.class)
    private LocalDate endDate;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @SerializedName("overlapCycleList")
    private List<i> overlapCycleList;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleType")
    private final ww0.a cycleType;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedCycle")
    private final Boolean predictedCycle;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            Boolean boolValueOf2;
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf8 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf9 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf10 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf11 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            LocalDate localDate4 = (LocalDate) parcel.readSerializable();
            LocalDate localDate5 = (LocalDate) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int i15 = 0;
                while (i15 != i14) {
                    arrayList.add(parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel));
                    i15++;
                    boolValueOf = boolValueOf;
                    i14 = i14;
                }
            }
            Boolean bool = boolValueOf;
            ww0.a aVarValueOf = parcel.readInt() == 0 ? null : ww0.a.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new f(localDate, localDate2, numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, numValueOf9, numValueOf10, bool, numValueOf11, localDate3, localDate4, localDate5, arrayList, aVarValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(LocalDate localDate, LocalDate localDate2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool, Integer num11, LocalDate localDate3, LocalDate localDate4, LocalDate localDate5, List list, ww0.a aVar, Boolean bool2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, localDate2, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : num3, (i14 & 32) != 0 ? null : num4, (i14 & 64) != 0 ? null : num5, (i14 & 128) != 0 ? null : num6, (i14 & 256) != 0 ? null : num7, (i14 & 512) != 0 ? null : num8, (i14 & 1024) != 0 ? null : num9, (i14 & 2048) != 0 ? null : num10, (i14 & 4096) != 0 ? null : bool, (i14 & 8192) != 0 ? null : num11, (i14 & 16384) != 0 ? null : localDate3, (32768 & i14) != 0 ? null : localDate4, (65536 & i14) != 0 ? null : localDate5, (131072 & i14) != 0 ? new ArrayList() : list, (262144 & i14) != 0 ? null : aVar, (i14 & 524288) != 0 ? null : bool2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getFertileWindowStartDay() {
        return this.fertileWindowStartDay;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.dataDate, fVar.dataDate) && s.g(this.startDate, fVar.startDate) && s.g(this.cycleDay, fVar.cycleDay) && s.g(this.periodLength, fVar.periodLength) && s.g(this.currentPhase, fVar.currentPhase) && s.g(this.currentPhaseLength, fVar.currentPhaseLength) && s.g(this.daysUntilNextPhase, fVar.daysUntilNextPhase) && s.g(this.fertileWindowStartDay, fVar.fertileWindowStartDay) && s.g(this.fertileWindowLength, fVar.fertileWindowLength) && s.g(this.predictedCycleLength, fVar.predictedCycleLength) && s.g(this.educationContentMod, fVar.educationContentMod) && s.g(this.lutealPhaseStart, fVar.lutealPhaseStart) && s.g(this.pregnancyCycle, fVar.pregnancyCycle) && s.g(this.numberOfWeek, fVar.numberOfWeek) && s.g(this.dueDate, fVar.dueDate) && s.g(this.deliveryDate, fVar.deliveryDate) && s.g(this.endDate, fVar.endDate) && s.g(this.overlapCycleList, fVar.overlapCycleList) && this.cycleType == fVar.cycleType && s.g(this.predictedCycle, fVar.predictedCycle);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getLutealPhaseStart() {
        return this.lutealPhaseStart;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    public final boolean h() {
        return (this.cycleDay == null || this.currentPhase == null) ? false : true;
    }

    public final int hashCode() {
        LocalDate localDate = this.dataDate;
        int iHashCode = (this.startDate.hashCode() + ((localDate == null ? 0 : localDate.hashCode()) * 31)) * 31;
        Integer num = this.cycleDay;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.periodLength;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.currentPhase;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.currentPhaseLength;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.daysUntilNextPhase;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.fertileWindowStartDay;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.fertileWindowLength;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.predictedCycleLength;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.educationContentMod;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.lutealPhaseStart;
        int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Boolean bool = this.pregnancyCycle;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num11 = this.numberOfWeek;
        int iHashCode13 = (iHashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        LocalDate localDate2 = this.dueDate;
        int iHashCode14 = (iHashCode13 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.deliveryDate;
        int iHashCode15 = (iHashCode14 + (localDate3 == null ? 0 : localDate3.hashCode())) * 31;
        LocalDate localDate4 = this.endDate;
        int iHashCode16 = (iHashCode15 + (localDate4 == null ? 0 : localDate4.hashCode())) * 31;
        List<i> list = this.overlapCycleList;
        int iHashCode17 = (iHashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        ww0.a aVar = this.cycleType;
        int iHashCode18 = (iHashCode17 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Boolean bool2 = this.predictedCycle;
        return iHashCode18 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        LocalDate localDate = this.dataDate;
        LocalDate localDate2 = this.startDate;
        Integer num = this.cycleDay;
        Integer num2 = this.periodLength;
        Integer num3 = this.currentPhase;
        Integer num4 = this.currentPhaseLength;
        Integer num5 = this.daysUntilNextPhase;
        Integer num6 = this.fertileWindowStartDay;
        Integer num7 = this.fertileWindowLength;
        Integer num8 = this.predictedCycleLength;
        Integer num9 = this.educationContentMod;
        Integer num10 = this.lutealPhaseStart;
        Boolean bool = this.pregnancyCycle;
        Integer num11 = this.numberOfWeek;
        LocalDate localDate3 = this.dueDate;
        LocalDate localDate4 = this.deliveryDate;
        LocalDate localDate5 = this.endDate;
        List<i> list = this.overlapCycleList;
        ww0.a aVar = this.cycleType;
        Boolean bool2 = this.predictedCycle;
        StringBuilder sb3 = new StringBuilder("MenstrualCycleSummaryDTO(dataDate=");
        sb3.append(localDate);
        sb3.append(", startDate=");
        sb3.append(localDate2);
        sb3.append(", cycleDay=");
        x.m(sb3, num, ", periodLength=", num2, ", currentPhase=");
        x.m(sb3, num3, ", currentPhaseLength=", num4, ", daysUntilNextPhase=");
        x.m(sb3, num5, ", fertileWindowStartDay=", num6, ", fertileWindowLength=");
        x.m(sb3, num7, ", predictedCycleLength=", num8, ", educationContentMod=");
        x.m(sb3, num9, ", lutealPhaseStart=", num10, ", pregnancyCycle=");
        sb3.append(bool);
        sb3.append(", numberOfWeek=");
        sb3.append(num11);
        sb3.append(", dueDate=");
        sb3.append(localDate3);
        sb3.append(", deliveryDate=");
        sb3.append(localDate4);
        sb3.append(", endDate=");
        sb3.append(localDate5);
        sb3.append(", overlapCycleList=");
        sb3.append(list);
        sb3.append(", cycleType=");
        sb3.append(aVar);
        sb3.append(", predictedCycle=");
        sb3.append(bool2);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.dataDate);
        parcel.writeSerializable(this.startDate);
        Integer num = this.cycleDay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.periodLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.currentPhase;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.currentPhaseLength;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        Integer num5 = this.daysUntilNextPhase;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num5);
        }
        Integer num6 = this.fertileWindowStartDay;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num6);
        }
        Integer num7 = this.fertileWindowLength;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num7);
        }
        Integer num8 = this.predictedCycleLength;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num8);
        }
        Integer num9 = this.educationContentMod;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num9);
        }
        Integer num10 = this.lutealPhaseStart;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num10);
        }
        Boolean bool = this.pregnancyCycle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        Integer num11 = this.numberOfWeek;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num11);
        }
        parcel.writeSerializable(this.dueDate);
        parcel.writeSerializable(this.deliveryDate);
        parcel.writeSerializable(this.endDate);
        List<i> list = this.overlapCycleList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                i iVar = (i) itO.next();
                if (iVar == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    iVar.writeToParcel(parcel, i14);
                }
            }
        }
        ww0.a aVar = this.cycleType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        Boolean bool2 = this.predictedCycle;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
    }

    public f(LocalDate localDate, LocalDate localDate2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Boolean bool, Integer num11, LocalDate localDate3, LocalDate localDate4, LocalDate localDate5, List<i> list, ww0.a aVar, Boolean bool2) {
        localDate2.getClass();
        this.dataDate = localDate;
        this.startDate = localDate2;
        this.cycleDay = num;
        this.periodLength = num2;
        this.currentPhase = num3;
        this.currentPhaseLength = num4;
        this.daysUntilNextPhase = num5;
        this.fertileWindowStartDay = num6;
        this.fertileWindowLength = num7;
        this.predictedCycleLength = num8;
        this.educationContentMod = num9;
        this.lutealPhaseStart = num10;
        this.pregnancyCycle = bool;
        this.numberOfWeek = num11;
        this.dueDate = localDate3;
        this.deliveryDate = localDate4;
        this.endDate = localDate5;
        this.overlapCycleList = list;
        this.cycleType = aVar;
        this.predictedCycle = bool2;
    }
}
