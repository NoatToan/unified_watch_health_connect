package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg81/z;", "Landroid/os/Parcelable;", "", "axisMinimum", "axisMaximum", "Li53/c;", "Lt71/a;", "points", "<init>", "(FFLi53/c;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f76426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<t71.a> f76427c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<z> {
        @Override // android.os.Parcelable.Creator
        public final z createFromParcel(Parcel parcel) {
            parcel.getClass();
            float f14 = parcel.readFloat();
            float f15 = parcel.readFloat();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(t71.a.CREATOR, parcel, arrayList, iA, 1);
            }
            return new z(f14, f15, i53.a.j(arrayList));
        }

        @Override // android.os.Parcelable.Creator
        public final z[] newArray(int i14) {
            return new z[i14];
        }
    }

    public z(float f14, float f15, i53.c<t71.a> cVar) {
        cVar.getClass();
        this.f76425a = f14;
        this.f76426b = f15;
        this.f76427c = cVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(this.f76425a, zVar.f76425a) == 0 && Float.compare(this.f76426b, zVar.f76426b) == 0 && this.f76427c.equals(zVar.f76427c);
    }

    public final int hashCode() {
        return this.f76427c.hashCode() + q6.f.d(this.f76426b, Float.hashCode(this.f76425a) * 31, 31);
    }

    public final String toString() {
        return l2.e(v.e0.i("EnduranceScoreTrendChartState(axisMinimum=", this.f76425a, ", axisMaximum=", this.f76426b, ", points="), this.f76427c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76425a);
        parcel.writeFloat(this.f76426b);
        Iterator itG = j20.x.g(this.f76427c, parcel);
        while (itG.hasNext()) {
            ((t71.a) itG.next()).writeToParcel(parcel, i14);
        }
    }
}
