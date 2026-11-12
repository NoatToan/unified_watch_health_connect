package s52;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ls52/n;", "Landroid/os/Parcelable;", "Lcom/garmin/android/apps/connectmobile/repcounting/model/c;", "exerciseList", "", "Ls52/o;", "linkedExercises", "<init>", "(Lcom/garmin/android/apps/connectmobile/repcounting/model/c;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.repcounting.model.c f157457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<o> f157458b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            com.garmin.android.apps.connectmobile.repcounting.model.c cVar = (com.garmin.android.apps.connectmobile.repcounting.model.c) parcel.readParcelable(n.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(o.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new n(cVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(com.garmin.android.apps.connectmobile.repcounting.model.c cVar, List<o> list) {
        this.f157457a = cVar;
        this.f157458b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.f157457a, nVar.f157457a) && s.g(this.f157458b, nVar.f157458b);
    }

    public final int hashCode() {
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = this.f157457a;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        List<o> list = this.f157458b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExercisesSelectionData(exerciseList=" + this.f157457a + ", linkedExercises=" + this.f157458b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f157457a, i14);
        List<o> list = this.f157458b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((o) itO.next()).writeToParcel(parcel, i14);
        }
    }
}
