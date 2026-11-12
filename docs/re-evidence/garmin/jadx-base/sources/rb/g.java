package rb;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import fa.r;
import fa.w;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f151534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f151535b;

    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    private g(long j8, long j14) {
        this.f151534a = j8;
        this.f151535b = j14;
    }

    public static g b(r rVar, long j8, w wVar) {
        long jD = d(j8, rVar);
        return new g(jD, wVar.b(jD));
    }

    public static long d(long j8, r rVar) {
        long jU = rVar.u();
        return (128 & jU) != 0 ? 8589934591L & ((((jU & 1) << 32) | rVar.w()) + j8) : C.TIME_UNSET;
    }

    @Override // rb.b
    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb3.append(this.f151534a);
        sb3.append(", playbackPositionUs= ");
        return j.i(this.f151535b, " }", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.writeLong(this.f151534a);
        parcel.writeLong(this.f151535b);
    }

    public /* synthetic */ g(long j8, long j14, a aVar) {
        this(j8, j14);
    }
}
