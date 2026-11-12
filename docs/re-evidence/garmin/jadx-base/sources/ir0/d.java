package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lir0/d;", "Landroid/os/Parcelable;", "", "moderateIntensityMinutes", "vigorousIntensityMinutes", "totalIntensityMinutes", "<init>", "(III)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f94788d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f94789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f94790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f94791c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ d(int i14, int i15, int i16, int i17, j jVar) {
        i14 = (i17 & 1) != 0 ? 0 : i14;
        i15 = (i17 & 2) != 0 ? 0 : i15;
        this(i14, i15, (i17 & 4) != 0 ? oe2.f.y(Integer.valueOf(i14), Integer.valueOf(i15)) : i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f94789a == dVar.f94789a && this.f94790b == dVar.f94790b && this.f94791c == dVar.f94791c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f94791c) + q2.d(this.f94790b, Integer.hashCode(this.f94789a) * 31, 31);
    }

    public final String toString() {
        return am.j.q(e5.j(this.f94789a, this.f94790b, "IntensityMinutesInfo(moderateIntensityMinutes=", ", vigorousIntensityMinutes=", ", totalIntensityMinutes="), this.f94791c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f94789a);
        parcel.writeInt(this.f94790b);
        parcel.writeInt(this.f94791c);
    }

    public d(int i14, int i15, int i16) {
        this.f94789a = i14;
        this.f94790b = i15;
        this.f94791c = i16;
    }

    public d() {
        this(0, 0, 0, 7, null);
    }
}
