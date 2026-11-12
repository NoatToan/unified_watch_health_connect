package d62;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld62/i;", "Landroid/os/Parcelable;", "Ld62/j;", "parentProfile", "", "childProfiles", "<init>", "(Ld62/j;Ljava/util/List;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f58016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<j> f58017b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public final i createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            j jVarValueOf = j.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(j.valueOf(parcel.readString()));
                }
                arrayList = arrayList2;
            }
            return new i(jVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final i[] newArray(int i14) {
            return new i[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(j jVar, List<? extends j> list) {
        jVar.getClass();
        this.f58016a = jVar;
        this.f58017b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f58016a == iVar.f58016a && p005kotlin.jvm.internal.s.g(this.f58017b, iVar.f58017b);
    }

    public final int hashCode() {
        int iHashCode = this.f58016a.hashCode() * 31;
        List<j> list = this.f58017b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "WorkoutActivityParentProfile(parentProfile=" + this.f58016a + ", childProfiles=" + this.f58017b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f58016a.name());
        List<j> list = this.f58017b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            parcel.writeString(((j) itO.next()).name());
        }
    }

    public /* synthetic */ i(j jVar, List list, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(jVar, (i14 & 2) != 0 ? null : list);
    }
}
