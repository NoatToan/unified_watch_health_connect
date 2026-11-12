package ga;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f76511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f76512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f76513c;

    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    private d(Parcel parcel) {
        this.f76511a = parcel.readLong();
        this.f76512b = parcel.readLong();
        this.f76513c = parcel.readLong();
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
        return this.f76511a == dVar.f76511a && this.f76512b == dVar.f76512b && this.f76513c == dVar.f76513c;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f76513c) + ((Longs.hashCode(this.f76512b) + ((Longs.hashCode(this.f76511a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.f76511a + ", modification time=" + this.f76512b + ", timescale=" + this.f76513c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f76511a);
        parcel.writeLong(this.f76512b);
        parcel.writeLong(this.f76513c);
    }

    public d(long j8, long j14) {
        this.f76511a = j8;
        this.f76512b = j14;
        this.f76513c = -1L;
    }

    public d(long j8, long j14, long j15) {
        this.f76511a = j8;
        this.f76512b = j14;
        this.f76513c = j15;
    }

    public /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }
}
