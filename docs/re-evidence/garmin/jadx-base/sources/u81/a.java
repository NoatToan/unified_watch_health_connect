package u81;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import com.garmin.android.apps.connectmobile.f3;
import j20.x;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lu81/a;", "Landroid/os/Parcelable;", "", "userProfilePk", "deviceId", "Lorg/joda/time/LocalDate;", "calendarDate", "", "hillStrengthScore", "hillEnduranceScore", "", "vo2MaxScore", "vo2MaxPreciseValue", "hillScore", "hillScoreClassificationId", "hillScoreFeedbackPhraseId", "", "primaryTrainingDevice", "", "primaryTrainingDeviceName", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lorg/joda/time/LocalDate;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3171a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f169459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f169460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f169461c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f169462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f169463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Double f169464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f169465g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f169466h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f169467i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f169468j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f169469k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f169470l;

    /* JADX INFO: renamed from: u81.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3171a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
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
            return new a(lValueOf, lValueOf2, localDate, numValueOf, numValueOf2, dValueOf, dValueOf2, numValueOf3, numValueOf4, numValueOf5, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(Long l14, Long l15, LocalDate localDate, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Boolean bool, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : localDate, (i14 & 8) != 0 ? null : num, (i14 & 16) != 0 ? null : num2, (i14 & 32) != 0 ? null : d14, (i14 & 64) != 0 ? null : d15, (i14 & 128) != 0 ? null : num3, (i14 & 256) != 0 ? null : num4, (i14 & 512) != 0 ? null : num5, (i14 & 1024) != 0 ? null : bool, (i14 & 2048) != 0 ? null : str);
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
        return s.g(this.f169459a, aVar.f169459a) && s.g(this.f169460b, aVar.f169460b) && s.g(this.f169461c, aVar.f169461c) && s.g(this.f169462d, aVar.f169462d) && s.g(this.f169463e, aVar.f169463e) && s.g(this.f169464f, aVar.f169464f) && s.g(this.f169465g, aVar.f169465g) && s.g(this.f169466h, aVar.f169466h) && s.g(this.f169467i, aVar.f169467i) && s.g(this.f169468j, aVar.f169468j) && s.g(this.f169469k, aVar.f169469k) && s.g(this.f169470l, aVar.f169470l);
    }

    public final int hashCode() {
        Long l14 = this.f169459a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f169460b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        LocalDate localDate = this.f169461c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        Integer num = this.f169462d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f169463e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.f169464f;
        int iHashCode6 = (iHashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f169465g;
        int iHashCode7 = (iHashCode6 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Integer num3 = this.f169466h;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f169467i;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f169468j;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Boolean bool = this.f169469k;
        int iHashCode11 = (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f169470l;
        return iHashCode11 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbJ = f3.j(this.f169459a, this.f169460b, "HillScoreDMO(userProfilePk=", ", deviceId=", ", calendarDate=");
        sbJ.append(this.f169461c);
        sbJ.append(", hillStrengthScore=");
        sbJ.append(this.f169462d);
        sbJ.append(", hillEnduranceScore=");
        i.v(sbJ, this.f169463e, ", vo2MaxScore=", this.f169464f, ", vo2MaxPreciseValue=");
        i.t(sbJ, this.f169465g, ", hillScore=", this.f169466h, ", hillScoreClassificationId=");
        x.m(sbJ, this.f169467i, ", hillScoreFeedbackPhraseId=", this.f169468j, ", primaryTrainingDevice=");
        sbJ.append(this.f169469k);
        sbJ.append(", primaryTrainingDeviceName=");
        sbJ.append(this.f169470l);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f169459a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f169460b;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeSerializable(this.f169461c);
        Integer num = this.f169462d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        Integer num2 = this.f169463e;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num2);
        }
        Double d14 = this.f169464f;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f169465g;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        Integer num3 = this.f169466h;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num3);
        }
        Integer num4 = this.f169467i;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num4);
        }
        Integer num5 = this.f169468j;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num5);
        }
        Boolean bool = this.f169469k;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            k.m(parcel, 1, bool);
        }
        parcel.writeString(this.f169470l);
    }

    public a(Long l14, Long l15, LocalDate localDate, Integer num, Integer num2, Double d14, Double d15, Integer num3, Integer num4, Integer num5, Boolean bool, String str) {
        this.f169459a = l14;
        this.f169460b = l15;
        this.f169461c = localDate;
        this.f169462d = num;
        this.f169463e = num2;
        this.f169464f = d14;
        this.f169465g = d15;
        this.f169466h = num3;
        this.f169467i = num4;
        this.f169468j = num5;
        this.f169469k = bool;
        this.f169470l = str;
    }

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }
}
