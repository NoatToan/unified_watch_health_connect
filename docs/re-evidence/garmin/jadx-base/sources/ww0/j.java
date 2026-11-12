package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.DateTimeAdapter;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b&\u0010'R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b)\u0010'R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b \u0010.¨\u0006/"}, d2 = {"Lww0/j;", "Landroid/os/Parcelable;", "", "userProfilePk", "Lorg/joda/time/LocalDate;", "periodStartDate", "", "periodLength", "cycleLength", "", "predictedCycle", "Lorg/joda/time/DateTime;", "reportTimestamp", "hasSpecifiedCycleLength", "hasSpecifiedPeriodLength", "educationContentMod", "Lww0/a;", "cycleType", "<init>", "(Ljava/lang/Long;Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lww0/a;)V", "a", "Ljava/lang/Long;", "getUserProfilePk", "()Ljava/lang/Long;", "b", "Lorg/joda/time/LocalDate;", "g", "()Lorg/joda/time/LocalDate;", "c", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "d", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Boolean;", "Lorg/joda/time/DateTime;", "getReportTimestamp", "()Lorg/joda/time/DateTime;", "getHasSpecifiedCycleLength", "()Ljava/lang/Boolean;", "h", "getHasSpecifiedPeriodLength", IntegerTokenConverter.CONVERTER_KEY, "getEducationContentMod", "j", "Lww0/a;", "()Lww0/a;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userProfilePk")
    private final Long userProfilePk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodStartDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate periodStartDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodLength")
    private final Integer periodLength;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleLength")
    private final Integer cycleLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("predictedCycle")
    private final Boolean predictedCycle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("reportTimestamp")
    @JsonAdapter(DateTimeAdapter.class)
    private final DateTime reportTimestamp;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasSpecifiedCycleLength")
    private final Boolean hasSpecifiedCycleLength;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("hasSpecifiedPeriodLength")
    private final Boolean hasSpecifiedPeriodLength;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("educationContentMod")
    private final Integer educationContentMod;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleType")
    private final ww0.a cycleType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            parcel.getClass();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DateTime dateTime = (DateTime) parcel.readSerializable();
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
            return new j(lValueOf, localDate, numValueOf, numValueOf2, boolValueOf, dateTime, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? ww0.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ j(Long l14, LocalDate localDate, Integer num, Integer num2, Boolean bool, DateTime dateTime, Boolean bool2, Boolean bool3, Integer num3, ww0.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : localDate, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : num2, (i14 & 16) != 0 ? null : bool, (i14 & 32) != 0 ? null : dateTime, (i14 & 64) != 0 ? null : bool2, (i14 & 128) != 0 ? null : bool3, (i14 & 256) != 0 ? null : num3, (i14 & 512) != 0 ? null : aVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCycleLength() {
        return this.cycleLength;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ww0.a getCycleType() {
        return this.cycleType;
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
        return p005kotlin.jvm.internal.s.g(this.userProfilePk, jVar.userProfilePk) && p005kotlin.jvm.internal.s.g(this.periodStartDate, jVar.periodStartDate) && p005kotlin.jvm.internal.s.g(this.periodLength, jVar.periodLength) && p005kotlin.jvm.internal.s.g(this.cycleLength, jVar.cycleLength) && p005kotlin.jvm.internal.s.g(this.predictedCycle, jVar.predictedCycle) && p005kotlin.jvm.internal.s.g(this.reportTimestamp, jVar.reportTimestamp) && p005kotlin.jvm.internal.s.g(this.hasSpecifiedCycleLength, jVar.hasSpecifiedCycleLength) && p005kotlin.jvm.internal.s.g(this.hasSpecifiedPeriodLength, jVar.hasSpecifiedPeriodLength) && p005kotlin.jvm.internal.s.g(this.educationContentMod, jVar.educationContentMod) && this.cycleType == jVar.cycleType;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getPeriodStartDate() {
        return this.periodStartDate;
    }

    public final int hashCode() {
        Long l14 = this.userProfilePk;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        LocalDate localDate = this.periodStartDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.periodLength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.cycleLength;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.predictedCycle;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        DateTime dateTime = this.reportTimestamp;
        int iHashCode6 = (iHashCode5 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool2 = this.hasSpecifiedCycleLength;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasSpecifiedPeriodLength;
        int iHashCode8 = (iHashCode7 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num3 = this.educationContentMod;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        ww0.a aVar = this.cycleType;
        return iHashCode9 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        Long l14 = this.userProfilePk;
        LocalDate localDate = this.periodStartDate;
        Integer num = this.periodLength;
        Integer num2 = this.cycleLength;
        Boolean bool = this.predictedCycle;
        DateTime dateTime = this.reportTimestamp;
        Boolean bool2 = this.hasSpecifiedCycleLength;
        Boolean bool3 = this.hasSpecifiedPeriodLength;
        Integer num3 = this.educationContentMod;
        ww0.a aVar = this.cycleType;
        StringBuilder sb3 = new StringBuilder("MenstrualCycleDTO(userProfilePk=");
        sb3.append(l14);
        sb3.append(", periodStartDate=");
        sb3.append(localDate);
        sb3.append(", periodLength=");
        x.m(sb3, num, ", cycleLength=", num2, ", predictedCycle=");
        sb3.append(bool);
        sb3.append(", reportTimestamp=");
        sb3.append(dateTime);
        sb3.append(", hasSpecifiedCycleLength=");
        b71.i.o(bool2, bool3, ", hasSpecifiedPeriodLength=", ", educationContentMod=", sb3);
        sb3.append(num3);
        sb3.append(", cycleType=");
        sb3.append(aVar);
        sb3.append(")");
        return sb3.toString();
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
        parcel.writeSerializable(this.periodStartDate);
        Integer num = this.periodLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.cycleLength;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Boolean bool = this.predictedCycle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeSerializable(this.reportTimestamp);
        Boolean bool2 = this.hasSpecifiedCycleLength;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.hasSpecifiedPeriodLength;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool3);
        }
        Integer num3 = this.educationContentMod;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        ww0.a aVar = this.cycleType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lww0/j$a;", "", "<init>", "()V", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public j(Long l14, LocalDate localDate, Integer num, Integer num2, Boolean bool, DateTime dateTime, Boolean bool2, Boolean bool3, Integer num3, ww0.a aVar) {
        this.userProfilePk = l14;
        this.periodStartDate = localDate;
        this.periodLength = num;
        this.cycleLength = num2;
        this.predictedCycle = bool;
        this.reportTimestamp = dateTime;
        this.hasSpecifiedCycleLength = bool2;
        this.hasSpecifiedPeriodLength = bool3;
        this.educationContentMod = num3;
        this.cycleType = aVar;
    }

    public j() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
