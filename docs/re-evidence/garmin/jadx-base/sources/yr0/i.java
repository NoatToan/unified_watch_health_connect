package yr0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyr0/i;", "Landroid/os/Parcelable;", "", "flightId", "tripId", "", "originLocation", "originTimezone", "Lorg/joda/time/LocalDate;", "originDate", "Lorg/joda/time/LocalTime;", "originTime", "destinationLocation", "destinationTimezone", "destinationDate", "destinationTime", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;)V", "gcm-jet-lag_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f198993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f198994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f198995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f198996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LocalDate f198997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public LocalTime f198998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f198999g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f199000h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LocalDate f199001i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LocalTime f199002j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalTime) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(Long l14, Long l15, String str, String str2, LocalDate localDate, LocalTime localTime, String str3, String str4, LocalDate localDate2, LocalTime localTime2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, (i14 & 2) != 0 ? null : l15, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : str2, (i14 & 16) != 0 ? null : localDate, (i14 & 32) != 0 ? null : localTime, (i14 & 64) != 0 ? null : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : localDate2, (i14 & 512) != 0 ? null : localTime2);
    }

    public final DateTime b() {
        LocalDate localDate = this.f199001i;
        if (localDate != null) {
            return localDate.toDateTime(this.f199002j, DateTimeZone.forID(this.f199000h));
        }
        return null;
    }

    public final DateTime d() {
        LocalDate localDate = this.f198997e;
        if (localDate != null) {
            return localDate.toDateTime(this.f198998f, DateTimeZone.forID(this.f198996d));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f198993a, iVar.f198993a) && p005kotlin.jvm.internal.s.g(this.f198994b, iVar.f198994b) && p005kotlin.jvm.internal.s.g(this.f198995c, iVar.f198995c) && p005kotlin.jvm.internal.s.g(this.f198996d, iVar.f198996d) && p005kotlin.jvm.internal.s.g(this.f198997e, iVar.f198997e) && p005kotlin.jvm.internal.s.g(this.f198998f, iVar.f198998f) && p005kotlin.jvm.internal.s.g(this.f198999g, iVar.f198999g) && p005kotlin.jvm.internal.s.g(this.f199000h, iVar.f199000h) && p005kotlin.jvm.internal.s.g(this.f199001i, iVar.f199001i) && p005kotlin.jvm.internal.s.g(this.f199002j, iVar.f199002j);
    }

    public final int hashCode() {
        Long l14 = this.f198993a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        Long l15 = this.f198994b;
        int iHashCode2 = (iHashCode + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f198995c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198996d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f198997e;
        int iHashCode5 = (iHashCode4 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalTime localTime = this.f198998f;
        int iHashCode6 = (iHashCode5 + (localTime == null ? 0 : localTime.hashCode())) * 31;
        String str3 = this.f198999g;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f199000h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDate localDate2 = this.f199001i;
        int iHashCode9 = (iHashCode8 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalTime localTime2 = this.f199002j;
        return iHashCode9 + (localTime2 != null ? localTime2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f198995c;
        String str2 = this.f198996d;
        LocalDate localDate = this.f198997e;
        LocalTime localTime = this.f198998f;
        String str3 = this.f198999g;
        String str4 = this.f199000h;
        LocalDate localDate2 = this.f199001i;
        LocalTime localTime2 = this.f199002j;
        StringBuilder sbJ = f3.j(this.f198993a, this.f198994b, "JetLagFlight(flightId=", ", tripId=", ", originLocation=");
        sn.a.t(sbJ, str, ", originTimezone=", str2, ", originDate=");
        sbJ.append(localDate);
        sbJ.append(", originTime=");
        sbJ.append(localTime);
        sbJ.append(", destinationLocation=");
        sn.a.t(sbJ, str3, ", destinationTimezone=", str4, ", destinationDate=");
        sbJ.append(localDate2);
        sbJ.append(", destinationTime=");
        sbJ.append(localTime2);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f198993a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        Long l15 = this.f198994b;
        if (l15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l15);
        }
        parcel.writeString(this.f198995c);
        parcel.writeString(this.f198996d);
        parcel.writeSerializable(this.f198997e);
        parcel.writeSerializable(this.f198998f);
        parcel.writeString(this.f198999g);
        parcel.writeString(this.f199000h);
        parcel.writeSerializable(this.f199001i);
        parcel.writeSerializable(this.f199002j);
    }

    public i(Long l14, Long l15, String str, String str2, LocalDate localDate, LocalTime localTime, String str3, String str4, LocalDate localDate2, LocalTime localTime2) {
        this.f198993a = l14;
        this.f198994b = l15;
        this.f198995c = str;
        this.f198996d = str2;
        this.f198997e = localDate;
        this.f198998f = localTime;
        this.f198999g = str3;
        this.f199000h = str4;
        this.f199001i = localDate2;
        this.f199002j = localTime2;
    }

    public i() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }
}
