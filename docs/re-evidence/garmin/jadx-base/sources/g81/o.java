package g81;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg81/o;", "Landroid/os/Parcelable;", "", "stackValue", "", "Lg81/g;", "contributors", "<init>", "(FLjava/util/List;)V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f76381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f76382b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public final o createFromParcel(Parcel parcel) {
            parcel.getClass();
            float f14 = parcel.readFloat();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(g.CREATOR, parcel, arrayList, iA, 1);
            }
            return new o(f14, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final o[] newArray(int i14) {
            return new o[i14];
        }
    }

    public o(float f14, List<g> list) {
        list.getClass();
        this.f76381a = f14;
        this.f76382b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Float.compare(this.f76381a, oVar.f76381a) == 0 && this.f76382b.equals(oVar.f76382b);
    }

    public final int hashCode() {
        return this.f76382b.hashCode() + (Float.hashCode(this.f76381a) * 31);
    }

    public final String toString() {
        return "EnduranceScoreContributorsStack(stackValue=" + this.f76381a + ", contributors=" + this.f76382b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeFloat(this.f76381a);
        Iterator itE = kg.f.e(this.f76382b, parcel);
        while (itE.hasNext()) {
            ((g) itE.next()).writeToParcel(parcel, i14);
        }
    }
}
