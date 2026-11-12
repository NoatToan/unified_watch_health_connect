package vs0;

import android.os.Parcel;
import android.os.Parcelable;
import b71.i;
import org.apache.commons.lang3.e;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lvs0/a;", "Landroid/os/Parcelable;", "Lxs0/a;", "lactateThresholdSportType", "", "bpm", "speed", "power", "powerToWeight", "Lorg/joda/time/LocalDate;", "lastUpdatedDate", "<init>", "(Lxs0/a;DDLjava/lang/Double;Ljava/lang/Double;Lorg/joda/time/LocalDate;)V", "gcm-lactate-threshold_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3356a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xs0.a f179716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f179717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f179718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Double f179719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f179720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LocalDate f179721f;

    /* JADX INFO: renamed from: vs0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3356a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(xs0.a.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(xs0.a aVar, double d14, double d15, Double d16, Double d17, LocalDate localDate, int i14, j jVar) {
        this(aVar, d14, d15, (i14 & 8) != 0 ? null : d16, (i14 & 16) != 0 ? null : d17, (i14 & 32) != 0 ? null : localDate);
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
        return this.f179716a == aVar.f179716a && Double.compare(this.f179717b, aVar.f179717b) == 0 && Double.compare(this.f179718c, aVar.f179718c) == 0 && s.g(this.f179719d, aVar.f179719d) && s.g(this.f179720e, aVar.f179720e) && s.g(this.f179721f, aVar.f179721f);
    }

    public final int hashCode() {
        int iB = e.b(e.b(this.f179716a.hashCode() * 31, 31, this.f179717b), 31, this.f179718c);
        Double d14 = this.f179719d;
        int iHashCode = (iB + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.f179720e;
        int iHashCode2 = (iHashCode + (d15 == null ? 0 : d15.hashCode())) * 31;
        LocalDate localDate = this.f179721f;
        return iHashCode2 + (localDate != null ? localDate.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LactateThresholdCurrentData(lactateThresholdSportType=");
        sb3.append(this.f179716a);
        sb3.append(", bpm=");
        sb3.append(this.f179717b);
        am.j.x(sb3, ", speed=", this.f179718c, ", power=");
        i.p(this.f179719d, this.f179720e, ", powerToWeight=", ", lastUpdatedDate=", sb3);
        sb3.append(this.f179721f);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f179716a.writeToParcel(parcel, i14);
        parcel.writeDouble(this.f179717b);
        parcel.writeDouble(this.f179718c);
        Double d14 = this.f179719d;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.f179720e;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
        parcel.writeSerializable(this.f179721f);
    }

    public a(xs0.a aVar, double d14, double d15, Double d16, Double d17, LocalDate localDate) {
        aVar.getClass();
        this.f179716a = aVar;
        this.f179717b = d14;
        this.f179718c = d15;
        this.f179719d = d16;
        this.f179720e = d17;
        this.f179721f = localDate;
    }
}
