package sh0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsh0/e;", "Landroid/os/Parcelable;", "", "Lsh0/f;", "summaries", "<init>", "(Ljava/util/List;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f159295b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<f> f159296a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(f.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new e(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final boolean b() {
        Double d14;
        Double d15;
        List<f> list = this.f159296a;
        if (list == null) {
            return false;
        }
        for (f fVar : list) {
            f.d dVar = fVar.f159298b;
            double dDoubleValue = -1.0d;
            if (((dVar == null || (d15 = dVar.f159302b) == null) ? -1.0d : d15.doubleValue()) >= 0.0d) {
                f.d dVar2 = fVar.f159298b;
                if (dVar2 != null && (d14 = dVar2.f159303c) != null) {
                    dDoubleValue = d14.doubleValue();
                }
                if (dDoubleValue >= 0.0d) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && s.g(this.f159296a, ((e) obj).f159296a);
    }

    public final int hashCode() {
        List<f> list = this.f159296a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("WeeklyFloorsSummary(summaries=", ")", this.f159296a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<f> list = this.f159296a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((f) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public e(List<f> list) {
        this.f159296a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
