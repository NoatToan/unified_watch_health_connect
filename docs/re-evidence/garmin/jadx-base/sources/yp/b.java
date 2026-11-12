package yp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mp.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyp/b;", "Landroid/os/Parcelable;", "Li53/d;", "Lmp/k;", "", "Lyp/c;", "chartPoints", "<init>", "(Li53/d;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.d<k, List<c>> f198605a;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                k kVarValueOf = k.valueOf(parcel.readString());
                int i16 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i16);
                int iA = 0;
                while (iA != i16) {
                    iA = kg.f.a(c.CREATOR, parcel, arrayList, iA, 1);
                }
                linkedHashMap.put(kVarValueOf, arrayList);
            }
            return new b(i53.a.k(linkedHashMap));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(i53.d<k, ? extends List<c>> dVar) {
        dVar.getClass();
        this.f198605a = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f198605a.equals(((b) obj).f198605a);
    }

    public final int hashCode() {
        return this.f198605a.hashCode();
    }

    public final String toString() {
        return "ReportsChartInfo(chartPoints=" + this.f198605a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        i53.d<k, List<c>> dVar = this.f198605a;
        parcel.writeInt(dVar.size());
        for (Map.Entry entry : (i53.e) dVar.entrySet()) {
            parcel.writeString(((k) entry.getKey()).name());
            Iterator itE = kg.f.e((List) entry.getValue(), parcel);
            while (itE.hasNext()) {
                ((c) itE.next()).writeToParcel(parcel, i14);
            }
        }
    }
}
