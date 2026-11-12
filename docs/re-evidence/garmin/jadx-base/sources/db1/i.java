package db1;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldb1/i;", "Landroid/os/Parcelable;", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "selectedDate", "<init>", "(Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;)V", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f59020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LocalDate f59021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LocalDate f59022c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new i((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public /* synthetic */ i(LocalDate localDate, LocalDate localDate2, LocalDate localDate3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : localDate, (i14 & 2) != 0 ? null : localDate2, (i14 & 4) != 0 ? null : localDate3);
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
        return p005kotlin.jvm.internal.s.g(this.f59020a, iVar.f59020a) && p005kotlin.jvm.internal.s.g(this.f59021b, iVar.f59021b) && p005kotlin.jvm.internal.s.g(this.f59022c, iVar.f59022c);
    }

    public final int hashCode() {
        LocalDate localDate = this.f59020a;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        LocalDate localDate2 = this.f59021b;
        int iHashCode2 = (iHashCode + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f59022c;
        return iHashCode2 + (localDate3 != null ? localDate3.hashCode() : 0);
    }

    public final String toString() {
        return "PregnancyDateRange(startDate=" + this.f59020a + ", endDate=" + this.f59021b + ", selectedDate=" + this.f59022c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.f59020a);
        parcel.writeSerializable(this.f59021b);
        parcel.writeSerializable(this.f59022c);
    }

    public i(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        this.f59020a = localDate;
        this.f59021b = localDate2;
        this.f59022c = localDate3;
    }

    public i() {
        this(null, null, null, 7, null);
    }
}
