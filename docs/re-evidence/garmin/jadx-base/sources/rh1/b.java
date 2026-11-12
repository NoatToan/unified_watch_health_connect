package rh1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.menstrualcycle.data.adapters.LocalDateAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import g22.k;
import kg.f;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lrh1/b;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "measurementDate", "", "bodyFatPercent", "", "muscleMass", "", "lastUpdatedTimestamp", "<init>", "(Lorg/joda/time/LocalDate;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Lorg/joda/time/LocalDate;", "g", "()Lorg/joda/time/LocalDate;", "b", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "c", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getLastUpdatedTimestamp", "()Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("measurementDate")
    @JsonAdapter(LocalDateAdapter.class)
    private final LocalDate measurementDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyFatPercent")
    private final Double bodyFatPercent;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("muscleMass")
    private final Integer muscleMass;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastUpdatedTimestamp")
    private final String lastUpdatedTimestamp;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b((LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(LocalDate localDate, Double d14, Integer num, String str, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : d14, (i14 & 4) != 0 ? null : num, (i14 & 8) != 0 ? null : str);
    }

    public static b b(b bVar, LocalDate localDate, Double d14, Integer num, int i14) {
        if ((i14 & 1) != 0) {
            localDate = bVar.measurementDate;
        }
        if ((i14 & 2) != 0) {
            d14 = bVar.bodyFatPercent;
        }
        if ((i14 & 4) != 0) {
            num = bVar.muscleMass;
        }
        String str = (i14 & 8) != 0 ? bVar.lastUpdatedTimestamp : null;
        bVar.getClass();
        return new b(localDate, d14, num, str);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getBodyFatPercent() {
        return this.bodyFatPercent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.measurementDate, bVar.measurementDate) && s.g(this.bodyFatPercent, bVar.bodyFatPercent) && s.g(this.muscleMass, bVar.muscleMass) && s.g(this.lastUpdatedTimestamp, bVar.lastUpdatedTimestamp);
    }

    public final LocalDate f() {
        return k.w(this.lastUpdatedTimestamp, "yyyy-MM-dd'T'HH:mm:ss.SSS");
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final LocalDate getMeasurementDate() {
        return this.measurementDate;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Integer getMuscleMass() {
        return this.muscleMass;
    }

    public final int hashCode() {
        LocalDate localDate = this.measurementDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        Double d14 = this.bodyFatPercent;
        int iHashCode2 = (iHashCode + (d14 == null ? 0 : d14.hashCode())) * 31;
        Integer num = this.muscleMass;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.lastUpdatedTimestamp;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "BodyComposition(measurementDate=" + this.measurementDate + ", bodyFatPercent=" + this.bodyFatPercent + ", muscleMass=" + this.muscleMass + ", lastUpdatedTimestamp=" + this.lastUpdatedTimestamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.measurementDate);
        Double d14 = this.bodyFatPercent;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Integer num = this.muscleMass;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            f.k(parcel, 1, num);
        }
        parcel.writeString(this.lastUpdatedTimestamp);
    }

    public b(LocalDate localDate, Double d14, Integer num, String str) {
        this.measurementDate = localDate;
        this.bodyFatPercent = d14;
        this.muscleMass = num;
        this.lastUpdatedTimestamp = str;
    }

    public b() {
        this(null, null, null, null, 15, null);
    }
}
