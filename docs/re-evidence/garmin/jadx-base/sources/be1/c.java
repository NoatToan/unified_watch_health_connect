package be1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import c22.t;
import ds.e0;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbe1/c;", "Landroid/os/Parcelable;", "", "timestamp", "", "respirationAverage", "respirationHighAverage", "respirationLowAverage", "<init>", "(JDDD)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f17743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f17744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f17745d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readLong(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(long j8, double d14, double d15, double d16) {
        this.f17742a = j8;
        this.f17743b = d14;
        this.f17744c = d15;
        this.f17745d = d16;
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
        return this.f17742a == cVar.f17742a && Double.compare(this.f17743b, cVar.f17743b) == 0 && Double.compare(this.f17744c, cVar.f17744c) == 0 && Double.compare(this.f17745d, cVar.f17745d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f17745d) + e.b(e.b(Long.hashCode(this.f17742a) * 31, 31, this.f17743b), 31, this.f17744c);
    }

    public final String toString() {
        StringBuilder sbK = e0.k(this.f17742a, "RespirationAverageValue(timestamp=", ", respirationAverage=");
        sbK.append(this.f17743b);
        j.x(sbK, ", respirationHighAverage=", this.f17744c, ", respirationLowAverage=");
        return t.d(this.f17745d, ")", sbK);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f17742a);
        parcel.writeDouble(this.f17743b);
        parcel.writeDouble(this.f17744c);
        parcel.writeDouble(this.f17745d);
    }
}
