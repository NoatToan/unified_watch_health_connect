package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lps/c1;", "Landroid/os/Parcelable;", "", "", "latitudes", "longitudes", "Lps/t1;", "trackLogs", "timestamps", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c1 implements Parcelable {
    public static final Parcelable.Creator<c1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Double> f139764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Double> f139765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<t1> f139766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Double> f139767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1 f139768e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c1> {
        @Override // android.os.Parcelable.Creator
        public final c1 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(Double.valueOf(parcel.readDouble()));
            }
            int i16 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                arrayList2.add(Double.valueOf(parcel.readDouble()));
            }
            int i18 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i18);
            int iD = 0;
            while (iD != i18) {
                iD = lc.u0.d(c1.class, parcel, arrayList3, iD, 1);
            }
            int i19 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i19);
            for (int i24 = 0; i24 != i19; i24++) {
                arrayList4.add(Double.valueOf(parcel.readDouble()));
            }
            return new c1(arrayList, arrayList2, arrayList3, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final c1[] newArray(int i14) {
            return new c1[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c1(List<Double> list, List<Double> list2, List<? extends t1> list3, List<Double> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.f139764a = list;
        this.f139765b = list2;
        this.f139766c = list3;
        this.f139767d = list4;
        this.f139768e = !list3.isEmpty() ? (t1) p13.h0.b0(list3) : null;
    }

    public final t1 b() {
        t1 t1Var = this.f139768e;
        if (t1Var != null) {
            return t1Var;
        }
        List<t1> list = this.f139766c;
        if (list.isEmpty()) {
            return null;
        }
        return (t1) p13.h0.b0(list);
    }

    public final boolean d() {
        List<Double> list = this.f139764a;
        if (list.isEmpty()) {
            return false;
        }
        List<Double> list2 = this.f139765b;
        if (list2.isEmpty() || list.size() != list2.size()) {
            return false;
        }
        Iterator<t1> it = this.f139766c.iterator();
        while (it.hasNext()) {
            if (it.next().f140223b.size() == list.size()) {
                return true;
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
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return p005kotlin.jvm.internal.s.g(this.f139764a, c1Var.f139764a) && p005kotlin.jvm.internal.s.g(this.f139765b, c1Var.f139765b) && p005kotlin.jvm.internal.s.g(this.f139766c, c1Var.f139766c) && p005kotlin.jvm.internal.s.g(this.f139767d, c1Var.f139767d) && p005kotlin.jvm.internal.s.g(this.f139768e, c1Var.f139768e);
    }

    public final int hashCode() {
        int iB = lc.u0.b(lc.u0.b(lc.u0.b(this.f139764a.hashCode() * 31, 31, this.f139765b), 31, this.f139766c), 31, this.f139767d);
        t1 t1Var = this.f139768e;
        return iB + (t1Var != null ? t1Var.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.j(f3.k("MetricTrackLogs(latitudes=", ", longitudes=", ", trackLogs=", this.f139764a, this.f139765b), this.f139766c, ", timestamps=", this.f139767d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f139764a, parcel);
        while (itE.hasNext()) {
            parcel.writeDouble(((Number) itE.next()).doubleValue());
        }
        Iterator itE2 = kg.f.e(this.f139765b, parcel);
        while (itE2.hasNext()) {
            parcel.writeDouble(((Number) itE2.next()).doubleValue());
        }
        Iterator itE3 = kg.f.e(this.f139766c, parcel);
        while (itE3.hasNext()) {
            parcel.writeParcelable((Parcelable) itE3.next(), i14);
        }
        Iterator itE4 = kg.f.e(this.f139767d, parcel);
        while (itE4.hasNext()) {
            parcel.writeDouble(((Number) itE4.next()).doubleValue());
        }
    }

    public /* synthetic */ c1(List list, List list2, List list3, List list4, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, list2, list3, (i14 & 8) != 0 ? new ArrayList() : list4);
    }
}
