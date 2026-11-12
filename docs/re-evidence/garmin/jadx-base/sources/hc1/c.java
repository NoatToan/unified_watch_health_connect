package hc1;

import android.os.Parcel;
import android.os.Parcelable;
import ds.e0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lhc1/c;", "Landroid/os/Parcelable;", "", "timestamp", "", "spo2Reading", "", "singleReadingPlottable", "<init>", "(JDZ)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f83277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f83278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83279c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readLong(), parcel.readDouble(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(long j8, double d14, boolean z14, int i14, j jVar) {
        this(j8, d14, (i14 & 4) != 0 ? false : z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f83277a == cVar.f83277a && Double.compare(this.f83278b, cVar.f83278b) == 0 && this.f83279c == cVar.f83279c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f83279c) + e.b(Long.hashCode(this.f83277a) * 31, 31, this.f83278b);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f83277a, "SpO2SingleValueDTO(timestamp=", ", spo2Reading=");
        sbK.append(this.f83278b);
        sbK.append(", singleReadingPlottable=");
        sbK.append(this.f83279c);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f83277a);
        parcel.writeDouble(this.f83278b);
        parcel.writeInt(this.f83279c ? 1 : 0);
    }

    public c(long j8, double d14, boolean z14) {
        this.f83277a = j8;
        this.f83278b = d14;
        this.f83279c = z14;
    }
}
