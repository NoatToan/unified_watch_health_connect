package je2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lje2/a;", "Landroid/os/Parcelable;", "Lcom/google/android/gms/maps/model/LatLng;", ModelSourceWrapper.POSITION, "", "zoom", "bearing", "pitch", "<init>", "(Lcom/google/android/gms/maps/model/LatLng;FFF)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1891a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LatLng f98593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f98594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f98595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f98596d;

    /* JADX INFO: renamed from: je2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C1891a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a((LatLng) parcel.readParcelable(a.class.getClassLoader()), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(LatLng latLng, float f14, float f15, float f16, int i14, j jVar) {
        this((i14 & 1) != 0 ? new LatLng(0.0d, 0.0d) : latLng, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? 0.0f : f16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f98593a, aVar.f98593a) && Float.compare(this.f98594b, aVar.f98594b) == 0 && Float.compare(this.f98595c, aVar.f98595c) == 0 && Float.compare(this.f98596d, aVar.f98596d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f98596d) + f.d(this.f98595c, f.d(this.f98594b, this.f98593a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "MapCameraPositionSettings(position=" + this.f98593a + ", zoom=" + this.f98594b + ", bearing=" + this.f98595c + ", pitch=" + this.f98596d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f98593a, i14);
        parcel.writeFloat(this.f98594b);
        parcel.writeFloat(this.f98595c);
        parcel.writeFloat(this.f98596d);
    }

    public a(LatLng latLng, float f14, float f15, float f16) {
        latLng.getClass();
        this.f98593a = latLng;
        this.f98594b = f14;
        this.f98595c = f15;
        this.f98596d = f16;
    }

    public a() {
        this(null, 0.0f, 0.0f, 0.0f, 15, null);
    }
}
