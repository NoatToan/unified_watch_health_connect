package ke2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.library.mapsdkadapter.i;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lke2/b;", "Landroid/os/Parcelable;", "", "lat", "lon", "Lcom/garmin/android/library/mapsdkadapter/i$b;", "geodeticSystem", "<init>", "(DDLcom/garmin/android/library/mapsdkadapter/i$b;)V", "map-sdk-adapter-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104550d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f104551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f104552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i.b f104553c;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readDouble(), parcel.readDouble(), i.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(double d14, double d15, i.b bVar, int i14, j jVar) {
        this(d14, d15, (i14 & 4) != 0 ? i.b.WGS84 : bVar);
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
        return Double.compare(this.f104551a, bVar.f104551a) == 0 && Double.compare(this.f104552b, bVar.f104552b) == 0 && this.f104553c == bVar.f104553c;
    }

    public final int hashCode() {
        return this.f104553c.hashCode() + e.b(Double.hashCode(this.f104551a) * 31, 31, this.f104552b);
    }

    public final String toString() {
        StringBuilder sbA = com.airbnb.lottie.parser.moshi.a.a("ImmutableLatLng(lat=", this.f104551a, ", lon=");
        sbA.append(this.f104552b);
        sbA.append(", geodeticSystem=");
        sbA.append(this.f104553c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeDouble(this.f104551a);
        parcel.writeDouble(this.f104552b);
        parcel.writeString(this.f104553c.name());
    }

    public b(double d14, double d15, i.b bVar) {
        bVar.getClass();
        this.f104551a = d14;
        this.f104552b = d15;
        this.f104553c = bVar;
    }
}
