package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfu1/w;", "Landroid/os/Parcelable;", "", "completedPlans", "", "lastCompletedPlanId", "Lxw1/d;", "activePlan", "", "Lxw1/p;", "workoutPlanTypes", "<init>", "(IJLxw1/d;Ljava/util/List;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f73564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f73565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xw1.d f73566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<xw1.p> f73567d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<w> {
        @Override // android.os.Parcelable.Creator
        public final w createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            int i14 = parcel.readInt();
            long j8 = parcel.readLong();
            xw1.d dVar = (xw1.d) parcel.readParcelable(w.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                int iD = 0;
                while (iD != i15) {
                    iD = u0.d(w.class, parcel, arrayList2, iD, 1);
                }
                arrayList = arrayList2;
            }
            return new w(i14, j8, dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final w[] newArray(int i14) {
            return new w[i14];
        }
    }

    public /* synthetic */ w(int i14, long j8, xw1.d dVar, List list, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0L : j8, (i15 & 4) != 0 ? null : dVar, (i15 & 8) != 0 ? null : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f73564a == wVar.f73564a && this.f73565b == wVar.f73565b && p005kotlin.jvm.internal.s.g(this.f73566c, wVar.f73566c) && p005kotlin.jvm.internal.s.g(this.f73567d, wVar.f73567d);
    }

    public final int hashCode() {
        int iE = q6.f.e(Integer.hashCode(this.f73564a) * 31, 31, this.f73565b);
        xw1.d dVar = this.f73566c;
        int iHashCode = (iE + (dVar == null ? 0 : dVar.hashCode())) * 31;
        List<xw1.p> list = this.f73567d;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "TrainingPlanStatus(completedPlans=" + this.f73564a + ", lastCompletedPlanId=" + this.f73565b + ", activePlan=" + this.f73566c + ", workoutPlanTypes=" + this.f73567d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f73564a);
        parcel.writeLong(this.f73565b);
        parcel.writeParcelable(this.f73566c, i14);
        List<xw1.p> list = this.f73567d;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeParcelable((Parcelable) itO.next(), i14);
        }
    }

    public w(int i14, long j8, xw1.d dVar, List<xw1.p> list) {
        this.f73564a = i14;
        this.f73565b = j8;
        this.f73566c = dVar;
        this.f73567d = list;
    }

    public w() {
        this(0, 0L, null, null, 15, null);
    }
}
