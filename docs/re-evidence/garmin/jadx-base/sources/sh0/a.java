package sh0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsh0/a;", "Landroid/os/Parcelable;", "", "Lsh0/b;", "summaries", "<init>", "(Ljava/util/List;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3013a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f159271b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f159272a;

    /* JADX INFO: renamed from: sh0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3013a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new a(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public /* synthetic */ a(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final Integer b() {
        b bVarPrevious;
        b.d dVar;
        b.d dVar2;
        List<b> list = this.f159272a;
        if (list == null) {
            return null;
        }
        ListIterator<b> listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                bVarPrevious = null;
                break;
            }
            bVarPrevious = listIterator.previous();
            dVar2 = bVarPrevious.f159274b;
        } while ((dVar2 != null ? dVar2.f159277a : null) == null);
        b bVar = bVarPrevious;
        if (bVar == null || (dVar = bVar.f159274b) == null) {
            return null;
        }
        return dVar.f159277a;
    }

    public final boolean d() {
        Integer num;
        Integer num2;
        List<b> list = this.f159272a;
        if (list == null) {
            return false;
        }
        for (b bVar : list) {
            b.d dVar = bVar.f159274b;
            int iIntValue = -1;
            if (((dVar == null || (num2 = dVar.f159278b) == null) ? -1 : num2.intValue()) >= 0) {
                b.d dVar2 = bVar.f159274b;
                if (dVar2 != null && (num = dVar2.f159279c) != null) {
                    iIntValue = num.intValue();
                }
                if (iIntValue >= 0) {
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
        return (obj instanceof a) && s.g(this.f159272a, ((a) obj).f159272a);
    }

    public final int hashCode() {
        List<b> list = this.f159272a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("DailyFloorsSummary(summaries=", ")", this.f159272a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<b> list = this.f159272a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((b) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public a(List<b> list) {
        this.f159272a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
