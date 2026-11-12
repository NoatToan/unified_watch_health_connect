package ww0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.h0;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import o53.f0;
import org.joda.time.LocalDate;
import org.joda.time.ReadablePartial;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lww0/n;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "startDate", "", "periodLength", "fertileWindowStartDay", "fertileWindowLength", "cycleLength", "Lww0/a;", "cycleType", "", "gapCycle", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lww0/a;Ljava/lang/Boolean;)V", "a", "Lorg/joda/time/LocalDate;", "o", "()Lorg/joda/time/LocalDate;", "b", "Ljava/lang/Integer;", JWKParameterNames.OCT_KEY_VALUE, "()Ljava/lang/Integer;", "c", "getFertileWindowStartDay", "d", "getFertileWindowLength", JWKParameterNames.RSA_EXPONENT, "f", "Lww0/a;", "h", "()Lww0/a;", "g", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "gcm-domain-womens-health_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f187619h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate startDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("periodLength")
    private final Integer periodLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("fertileWindowStart")
    private final Integer fertileWindowStartDay;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lengthOfFertileWindow")
    private final Integer fertileWindowLength;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleLength")
    private final Integer cycleLength;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cycleType")
    private final ww0.a cycleType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gapCycle")
    private final Boolean gapCycle;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ww0.a aVarValueOf = parcel.readInt() == 0 ? null : ww0.a.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new n(localDate, numValueOf, numValueOf2, numValueOf3, numValueOf4, aVarValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(LocalDate localDate, Integer num, Integer num2, Integer num3, Integer num4, ww0.a aVar, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? null : num3, (i14 & 16) != 0 ? null : num4, (i14 & 32) != 0 ? null : aVar, (i14 & 64) != 0 ? null : bool);
    }

    public final LocalDate b() {
        LocalDate localDate;
        Integer num = this.cycleLength;
        if (num == null || (localDate = this.startDate) == null) {
            return null;
        }
        return localDate.plusDays(num.intValue() - 1);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getCycleLength() {
        return this.cycleLength;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int f() {
        Integer num = this.cycleLength;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final h0 g() {
        LocalDate localDateB = b();
        if (localDateB == null) {
            return null;
        }
        LocalDate localDate = this.startDate;
        localDate.getClass();
        return f0.I(localDate, localDateB);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ww0.a getCycleType() {
        return this.cycleType;
    }

    public final h0 i() {
        LocalDate localDate;
        h0 h0VarM = m();
        Integer num = this.fertileWindowStartDay;
        if (num == null || this.fertileWindowLength == null || (localDate = this.startDate) == null || h0VarM == null) {
            return null;
        }
        LocalDate localDate2 = h0VarM.f23062b;
        LocalDate localDatePlusDays = localDate.plusDays(num.intValue() - 1);
        LocalDate localDatePlusDays2 = localDatePlusDays.plusDays(this.fertileWindowLength.intValue() - 1);
        LocalDate localDateB = b();
        if (localDatePlusDays2.compareTo((ReadablePartial) localDate2) <= 0) {
            return null;
        }
        if (localDatePlusDays.compareTo((ReadablePartial) localDate2) <= 0) {
            return f0.I(jg.b.G(localDate2), localDatePlusDays2);
        }
        return (localDateB == null || localDateB.compareTo((ReadablePartial) localDatePlusDays2) >= 0) ? f0.I(localDatePlusDays, localDatePlusDays2) : f0.I(localDatePlusDays, localDateB);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Boolean getGapCycle() {
        return this.gapCycle;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getPeriodLength() {
        return this.periodLength;
    }

    public final h0 m() {
        LocalDate localDate;
        Integer num = this.periodLength;
        if (num == null || (localDate = this.startDate) == null) {
            return null;
        }
        LocalDate localDatePlusDays = localDate.plusDays(num.intValue() - 1);
        localDatePlusDays.getClass();
        return f0.I(localDate, localDatePlusDays);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final LocalDate getStartDate() {
        return this.startDate;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.startDate);
        Integer num = this.periodLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.fertileWindowStartDay;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.fertileWindowLength;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        Integer num4 = this.cycleLength;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num4);
        }
        ww0.a aVar = this.cycleType;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        Boolean bool = this.gapCycle;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
    }

    public n(LocalDate localDate, Integer num, Integer num2, Integer num3, Integer num4, ww0.a aVar, Boolean bool) {
        this.startDate = localDate;
        this.periodLength = num;
        this.fertileWindowStartDay = num2;
        this.fertileWindowLength = num3;
        this.cycleLength = num4;
        this.cycleType = aVar;
        this.gapCycle = bool;
    }

    public n() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
