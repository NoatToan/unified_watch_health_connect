package z42;

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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz42/i;", "Landroid/os/Parcelable;", "", "Lz42/j;", "summaries", "<init>", "(Ljava/util/List;)V", "gcm-wheelchair_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<j> f202404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f202405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f202406c;

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
        Integer totalPushes;
        Integer dataDaysCount;
        this.f202404a = list;
        int i14 = 0;
        if (list != null) {
            Iterator<T> it = list.iterator();
            iIntValue = 0;
            while (it.hasNext()) {
                l values = ((j) it.next()).getValues();
                iIntValue += (values == null || (dataDaysCount = values.getDataDaysCount()) == null) ? 0 : dataDaysCount.intValue();
            }
        } else {
            iIntValue = 0;
        }
        this.f202405b = iIntValue;
        List<j> list2 = this.f202404a;
        if (list2 != null && !list2.isEmpty()) {
            Iterator<T> it3 = list2.iterator();
            int i15 = 0;
            while (it3.hasNext()) {
                l values2 = ((j) it3.next()).getValues();
                if ((((values2 == null || (totalPushes = values2.getTotalPushes()) == null) ? -1 : totalPushes.intValue()) > 0) && (i15 = i15 + 1) < 0) {
                    x.p();
                    throw null;
                }
            }
            i14 = i15;
        }
        this.f202406c = i14;
    }

    public final Integer b() {
        Integer totalDistance;
        List<j> list = this.f202404a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                l values = ((j) obj).getValues();
                if ((values != null ? values.getTotalDistance() : null) != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            l values2 = ((j) it.next()).getValues();
            iIntValue += (values2 == null || (totalDistance = values2.getTotalDistance()) == null) ? 0 : totalDistance.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public final Integer d() {
        Integer totalPushes;
        List<j> list = this.f202404a;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                l values = ((j) obj).getValues();
                if ((values != null ? values.getTotalPushes() : null) != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            l values2 = ((j) it.next()).getValues();
            iIntValue += (values2 == null || (totalPushes = values2.getTotalPushes()) == null) ? 0 : totalPushes.intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && s.g(this.f202404a, ((i) obj).f202404a);
    }

    public final int hashCode() {
        List<j> list = this.f202404a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return tn.k.h("PushesSummary(summaries=", ")", this.f202404a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<j> list = this.f202404a;
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
