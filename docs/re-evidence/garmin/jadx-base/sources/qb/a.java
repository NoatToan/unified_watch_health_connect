package qb;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.w;
import com.google.common.primitives.Longs;

/* JADX INFO: loaded from: classes.dex */
public final class a implements w.b {
    public static final Parcelable.Creator<a> CREATOR = new C2715a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f143943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f143944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f143945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f143946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f143947e;

    /* JADX INFO: renamed from: qb.a$a, reason: collision with other inner class name */
    public class C2715a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    private a(Parcel parcel) {
        this.f143943a = parcel.readLong();
        this.f143944b = parcel.readLong();
        this.f143945c = parcel.readLong();
        this.f143946d = parcel.readLong();
        this.f143947e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f143943a == aVar.f143943a && this.f143944b == aVar.f143944b && this.f143945c == aVar.f143945c && this.f143946d == aVar.f143946d && this.f143947e == aVar.f143947e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Longs.hashCode(this.f143947e) + ((Longs.hashCode(this.f143946d) + ((Longs.hashCode(this.f143945c) + ((Longs.hashCode(this.f143944b) + ((Longs.hashCode(this.f143943a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f143943a + ", photoSize=" + this.f143944b + ", photoPresentationTimestampUs=" + this.f143945c + ", videoStartPosition=" + this.f143946d + ", videoSize=" + this.f143947e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f143943a);
        parcel.writeLong(this.f143944b);
        parcel.writeLong(this.f143945c);
        parcel.writeLong(this.f143946d);
        parcel.writeLong(this.f143947e);
    }

    public a(long j8, long j14, long j15, long j16, long j17) {
        this.f143943a = j8;
        this.f143944b = j14;
        this.f143945c = j15;
        this.f143946d = j16;
        this.f143947e = j17;
    }

    public /* synthetic */ a(Parcel parcel, C2715a c2715a) {
        this(parcel);
    }
}
