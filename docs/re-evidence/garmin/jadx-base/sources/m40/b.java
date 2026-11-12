package m40;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm40/b;", "Landroid/os/Parcelable;", "", "isPopularityHeatmapChecked", "showHighTrafficRoadsSetting", "isHighTrafficRoadsChecked", "showUnpavedRoadsSetting", "isUnpavedRoadsChecked", "<init>", "(ZZZZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f116575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f116576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f116578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f116579e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
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
            return new b(z16, z14, z15, z14, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(boolean z14, boolean z15, boolean z16, boolean z17, boolean z18) {
        this.f116575a = z14;
        this.f116576b = z15;
        this.f116577c = z16;
        this.f116578d = z17;
        this.f116579e = z18;
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
        return this.f116575a == bVar.f116575a && this.f116576b == bVar.f116576b && this.f116577c == bVar.f116577c && this.f116578d == bVar.f116578d && this.f116579e == bVar.f116579e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116579e) + q6.f.g(q6.f.g(q6.f.g(Boolean.hashCode(this.f116575a) * 31, 31, this.f116576b), 31, this.f116577c), 31, this.f116578d);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("CourseLineSettings(isPopularityHeatmapChecked=", ", showHighTrafficRoadsSetting=", ", isHighTrafficRoadsChecked=", this.f116575a, this.f116576b);
        kg.f.q(", showUnpavedRoadsSetting=", ", isUnpavedRoadsChecked=", sbM, this.f116577c, this.f116578d);
        return hb.a.k(sbM, this.f116579e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f116575a ? 1 : 0);
        parcel.writeInt(this.f116576b ? 1 : 0);
        parcel.writeInt(this.f116577c ? 1 : 0);
        parcel.writeInt(this.f116578d ? 1 : 0);
        parcel.writeInt(this.f116579e ? 1 : 0);
    }
}
