package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfo2/v;", "Landroid/os/Parcelable;", "", "Lfo2/s;", "devices", "Lfo2/t;", "hostDevices", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<s> f73122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t> f73123b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i14) {
                iA2 = kg.f.a(s.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA != i15) {
                iA = kg.f.a(t.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new v(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public v(List<s> list, List<t> list2) {
        list.getClass();
        list2.getClass();
        this.f73122a = list;
        this.f73123b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.f73122a, vVar.f73122a) && p005kotlin.jvm.internal.s.g(this.f73123b, vVar.f73123b);
    }

    public final int hashCode() {
        return this.f73123b.hashCode() + (this.f73122a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("NewFitpayDeviceCollection(devices=", ", hostDevices=", ")", this.f73122a, this.f73123b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f73122a, parcel);
        while (itE.hasNext()) {
            ((s) itE.next()).writeToParcel(parcel, i14);
        }
        Iterator itE2 = kg.f.e(this.f73123b, parcel);
        while (itE2.hasNext()) {
            ((t) itE2.next()).writeToParcel(parcel, i14);
        }
    }

    public /* synthetic */ v(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? new ArrayList() : list2);
    }
}
