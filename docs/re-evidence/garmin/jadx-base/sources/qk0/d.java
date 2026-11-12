package qk0;

import am.x0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lqk0/d;", "Landroid/os/Parcelable;", "", "Lam/x0;", "selectedActivityTypes", "Lqk0/h;", "conflictReplacements", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<x0> f145086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f145087b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iA = 0;
            int iD = 0;
            while (iD != i14) {
                iD = u0.d(d.class, parcel, arrayList, iD, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i15);
            while (iA != i15) {
                iA = kg.f.a(h.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new d(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends x0> list, List<h> list2) {
        list.getClass();
        list2.getClass();
        this.f145086a = list;
        this.f145087b = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f145086a, dVar.f145086a) && p005kotlin.jvm.internal.s.g(this.f145087b, dVar.f145087b);
    }

    public final int hashCode() {
        return this.f145087b.hashCode() + (this.f145086a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("DefaultActivitySelectionResult(selectedActivityTypes=", ", conflictReplacements=", ")", this.f145086a, this.f145087b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itE = kg.f.e(this.f145086a, parcel);
        while (itE.hasNext()) {
            parcel.writeParcelable((Parcelable) itE.next(), i14);
        }
        Iterator itE2 = kg.f.e(this.f145087b, parcel);
        while (itE2.hasNext()) {
            ((h) itE2.next()).writeToParcel(parcel, i14);
        }
    }

    public d(List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, (i14 & 2) != 0 ? j0.f134944a : list2);
    }
}
