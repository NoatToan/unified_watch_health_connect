package co0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.h0;
import tn.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lco0/c;", "Landroid/os/Parcelable;", "", "Lco0/d;", "summaries", "<init>", "(Ljava/util/List;)V", "gcm-heart-rate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<d> f28124a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iD = 0;
                while (iD != i14) {
                    iD = u0.d(c.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list);
    }

    public final int b() {
        List<d> list = this.f28124a;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d.b values = ((d) it.next()).getValues();
            Integer maxHeartRate = values != null ? values.getMaxHeartRate() : null;
            if (maxHeartRate != null) {
                arrayList.add(maxHeartRate);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        double dP = h0.P(arrayList2);
        Double dValueOf = Double.isNaN(dP) ? null : Double.valueOf(dP);
        if (dValueOf != null) {
            return MathKt.b(dValueOf.doubleValue());
        }
        return 0;
    }

    public final int d() {
        List<d> list = this.f28124a;
        if (list == null) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            d.b values = ((d) it.next()).getValues();
            Integer restingHeartRate = values != null ? values.getRestingHeartRate() : null;
            if (restingHeartRate != null) {
                arrayList.add(restingHeartRate);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).intValue() > 0) {
                arrayList2.add(obj);
            }
        }
        double dP = h0.P(arrayList2);
        Double dValueOf = Double.isNaN(dP) ? null : Double.valueOf(dP);
        if (dValueOf != null) {
            return MathKt.b(dValueOf.doubleValue());
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && s.g(this.f28124a, ((c) obj).f28124a);
    }

    public final int hashCode() {
        List<d> list = this.f28124a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return k.h("HeartRateSummary(summaries=", ")", this.f28124a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<d> list = this.f28124a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    public c(List<d> list) {
        this.f28124a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
