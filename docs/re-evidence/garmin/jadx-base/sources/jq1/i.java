package jq1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ljq1/i;", "Landroid/os/Parcelable;", "", "Ljq1/j;", "summaries", "<init>", "(Ljava/util/List;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100018d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j> f100019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f100020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f100021c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(j.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new i(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    public i(List<j> list) {
        int iIntValue;
        Double d14;
        Integer num;
        this.f100019a = list;
        int i14 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iIntValue = 0;
            while (it.hasNext()) {
                j.d dVar = ((j) it.next()).f100023b;
                iIntValue += (dVar == null || (num = dVar.f100026b) == null) ? 0 : num.intValue();
            }
        } else {
            iIntValue = 0;
        }
        this.f100020b = iIntValue;
        List<j> list2 = this.f100019a;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<T> it3 = list2.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                j.d dVar2 = ((j) it3.next()).f100023b;
                if ((((dVar2 == null || (d14 = dVar2.f100025a) == null) ? -1 : (int) d14.doubleValue()) > 0) && (i15 = i15 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
            i14 = i15;
        }
        this.f100021c = i14;
    }

    public final Integer b() {
        List<j> list = this.f100019a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                j.d dVar = ((j) it.next()).f100023b;
                Double d14 = dVar != null ? dVar.f100025a : null;
                if (d14 != null) {
                    arrayList.add(d14);
                }
            }
            Iterator it3 = arrayList.iterator();
            int iDoubleValue = 0;
            while (it3.hasNext()) {
                iDoubleValue += (int) ((Number) it3.next()).doubleValue();
            }
            Integer numValueOf = Integer.valueOf(iDoubleValue);
            if (numValueOf.intValue() > 0) {
                return numValueOf;
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && s.g(this.f100019a, ((i) obj).f100019a);
    }

    public final int hashCode() {
        List<j> list = this.f100019a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("StepsSummary(summaries=", ")", this.f100019a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<j> list = this.f100019a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((j) itO.next()).writeToParcel(parcel, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ i(List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }
}
