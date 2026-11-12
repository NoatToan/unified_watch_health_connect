package ti1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import q6.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lti1/b;", "Landroid/os/Parcelable;", "", "unitId", "", "isLoading", "isMessengerAppInstalled", "isFromUACFlow", "isFromLiveTrackFlow", "isUserEligibleForFreeTrial", "<init>", "(JZZZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f164583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f164586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f164587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f164588f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            long j8 = parcel.readLong();
            boolean z14 = false;
            boolean z15 = true;
            boolean z16 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            if (parcel.readInt() == 0) {
                z15 = z14;
            }
            if (parcel.readInt() != 0) {
                z14 = true;
            }
            return new b(j8, z16, z14, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(long j8, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i14, j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? false : z16, (i14 & 16) != 0 ? false : z17, (i14 & 32) != 0 ? false : z18);
    }

    public static b b(b bVar, boolean z14, int i14) {
        long j8 = bVar.f164583a;
        boolean z15 = (i14 & 2) != 0 ? bVar.f164584b : true;
        if ((i14 & 4) != 0) {
            z14 = bVar.f164585c;
        }
        boolean z16 = bVar.f164586d;
        boolean z17 = bVar.f164587e;
        boolean z18 = bVar.f164588f;
        bVar.getClass();
        return new b(j8, z15, z14, z16, z17, z18);
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
        return this.f164583a == bVar.f164583a && this.f164584b == bVar.f164584b && this.f164585c == bVar.f164585c && this.f164586d == bVar.f164586d && this.f164587e == bVar.f164587e && this.f164588f == bVar.f164588f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164588f) + f.g(f.g(f.g(f.g(Long.hashCode(this.f164583a) * 31, 31, this.f164584b), 31, this.f164585c), 31, this.f164586d), 31, this.f164587e);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("InReachSetupEndScreenState(unitId=");
        sb3.append(this.f164583a);
        sb3.append(", isLoading=");
        sb3.append(this.f164584b);
        com.airbnb.lottie.animation.keyframe.a.v(", isMessengerAppInstalled=", ", isFromUACFlow=", sb3, this.f164585c, this.f164586d);
        com.airbnb.lottie.animation.keyframe.a.v(", isFromLiveTrackFlow=", ", isUserEligibleForFreeTrial=", sb3, this.f164587e, this.f164588f);
        sb3.append(")");
        return sb3.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f164583a);
        parcel.writeInt(this.f164584b ? 1 : 0);
        parcel.writeInt(this.f164585c ? 1 : 0);
        parcel.writeInt(this.f164586d ? 1 : 0);
        parcel.writeInt(this.f164587e ? 1 : 0);
        parcel.writeInt(this.f164588f ? 1 : 0);
    }

    public b(long j8, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f164583a = j8;
        this.f164584b = z14;
        this.f164585c = z15;
        this.f164586d = z16;
        this.f164587e = z17;
        this.f164588f = z18;
    }

    public b() {
        this(0L, false, false, false, false, false, 63, null);
    }
}
