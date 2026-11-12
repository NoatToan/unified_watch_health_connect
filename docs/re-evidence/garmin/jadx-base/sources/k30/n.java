package k30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk30/n;", "Landroid/os/Parcelable;", "Lk30/m;", "sortCriteria", "Li53/c;", "Lk30/o;", "courseTypeFilters", "", "minDistance", "maxDistance", "<init>", "(Lk30/m;Li53/c;DD)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f102575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<o> f102576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f102577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f102578d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            m mVarValueOf = m.valueOf(parcel.readString());
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            while (iA != i14) {
                iA = kg.f.a(o.CREATOR, parcel, arrayList, iA, 1);
            }
            return new n(mVarValueOf, i53.a.j(arrayList), parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(m mVar, i53.c<o> cVar, double d14, double d15) {
        mVar.getClass();
        cVar.getClass();
        this.f102575a = mVar;
        this.f102576b = cVar;
        this.f102577c = d14;
        this.f102578d = d15;
    }

    public static n b(n nVar, m mVar, i53.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            mVar = nVar.f102575a;
        }
        m mVar2 = mVar;
        if ((i14 & 2) != 0) {
            cVar = nVar.f102576b;
        }
        i53.c cVar2 = cVar;
        double d14 = nVar.f102577c;
        double d15 = nVar.f102578d;
        nVar.getClass();
        mVar2.getClass();
        cVar2.getClass();
        return new n(mVar2, cVar2, d14, d15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f102575a == nVar.f102575a && this.f102576b.equals(nVar.f102576b) && Double.compare(this.f102577c, nVar.f102577c) == 0 && Double.compare(this.f102578d, nVar.f102578d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f102578d) + org.apache.commons.lang3.e.b(l2.a(this.f102576b, this.f102575a.hashCode() * 31, 31), 31, this.f102577c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CourseSortFilter(sortCriteria=");
        sb3.append(this.f102575a);
        sb3.append(", courseTypeFilters=");
        sb3.append(this.f102576b);
        sb3.append(", minDistance=");
        sb3.append(this.f102577c);
        return am.j.r(sb3, ", maxDistance=", this.f102578d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f102575a.name());
        Iterator itG = j20.x.g(this.f102576b, parcel);
        while (itG.hasNext()) {
            ((o) itG.next()).writeToParcel(parcel, i14);
        }
        parcel.writeDouble(this.f102577c);
        parcel.writeDouble(this.f102578d);
    }
}
