package sy0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsy0/l;", "Landroid/os/Parcelable;", "Li53/c;", "Lcy0/f;", "activities", "Lcy0/g;", "points", "<init>", "(Li53/c;Li53/c;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<cy0.f> f161249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.c<cy0.g> f161250b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            i53.f fVarJ;
            parcel.getClass();
            int iA = 0;
            i53.f fVarJ2 = null;
            if (parcel.readInt() == 0) {
                fVarJ = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(cy0.f.CREATOR, parcel, arrayList, iA2, 1);
                }
                fVarJ = i53.a.j(arrayList);
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(cy0.g.CREATOR, parcel, arrayList2, iA, 1);
                }
                fVarJ2 = i53.a.j(arrayList2);
            }
            return new l(fVarJ, fVarJ2);
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(i53.c<cy0.f> cVar, i53.c<cy0.g> cVar2) {
        this.f161249a = cVar;
        this.f161250b = cVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.f161249a, lVar.f161249a) && p005kotlin.jvm.internal.s.g(this.f161250b, lVar.f161250b);
    }

    public final int hashCode() {
        i53.c<cy0.f> cVar = this.f161249a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        i53.c<cy0.g> cVar2 = this.f161250b;
        return iHashCode + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        return "MultiDayActivityElevationUiState(activities=" + this.f161249a + ", points=" + this.f161250b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        i53.c<cy0.f> cVar = this.f161249a;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(cVar.size());
            Iterator<cy0.f> it = cVar.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i14);
            }
        }
        i53.c<cy0.g> cVar2 = this.f161250b;
        if (cVar2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(cVar2.size());
        Iterator<cy0.g> it3 = cVar2.iterator();
        while (it3.hasNext()) {
            it3.next().writeToParcel(parcel, i14);
        }
    }
}
