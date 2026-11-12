package m40;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.library.mapsdkadapter.i;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lm40/h;", "Landroid/os/Parcelable;", "", "mapType", "Lcom/garmin/android/library/mapsdkadapter/i$d;", "mapProvider", "", "hasGCMaps3DSubscription", "is3dEnabled", "<init>", "(ILcom/garmin/android/library/mapsdkadapter/i$d;ZZ)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.d f116595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f116596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f116597d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readInt(), i.d.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public h(int i14, i.d dVar, boolean z14, boolean z15) {
        dVar.getClass();
        this.f116594a = i14;
        this.f116595b = dVar;
        this.f116596c = z14;
        this.f116597d = z15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f116594a == hVar.f116594a && this.f116595b == hVar.f116595b && this.f116596c == hVar.f116596c && this.f116597d == hVar.f116597d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f116597d) + q6.f.g((this.f116595b.hashCode() + (Integer.hashCode(this.f116594a) * 31)) * 31, 31, this.f116596c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapSettings(mapType=");
        sb3.append(this.f116594a);
        sb3.append(", mapProvider=");
        sb3.append(this.f116595b);
        sb3.append(", hasGCMaps3DSubscription=");
        return com.airbnb.lottie.animation.keyframe.a.f(", is3dEnabled=", ")", sb3, this.f116596c, this.f116597d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f116594a);
        parcel.writeString(this.f116595b.name());
        parcel.writeInt(this.f116596c ? 1 : 0);
        parcel.writeInt(this.f116597d ? 1 : 0);
    }
}
