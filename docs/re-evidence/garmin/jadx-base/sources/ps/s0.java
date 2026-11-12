package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lps/s0;", "Landroid/os/Parcelable;", "", "activityId", "", "Lps/r0;", "exerciseSets", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "a", "Ljava/lang/Long;", "getActivityId", "()Ljava/lang/Long;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s0 implements Parcelable {
    public static final Parcelable.Creator<s0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final Long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("exerciseSets")
    private final List<r0> exerciseSets;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<s0> {
        @Override // android.os.Parcelable.Creator
        public final s0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList arrayList = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(r0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new s0(lValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final s0[] newArray(int i14) {
            return new s0[i14];
        }
    }

    public /* synthetic */ s0(Long l14, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? -1L : l14, (i14 & 2) != 0 ? null : list);
    }

    public static s0 b(s0 s0Var, ArrayList arrayList) {
        Long l14 = s0Var.activityId;
        s0Var.getClass();
        return new s0(l14, arrayList);
    }

    public final List<r0> d() {
        return this.exerciseSets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return p005kotlin.jvm.internal.s.g(this.activityId, s0Var.activityId) && p005kotlin.jvm.internal.s.g(this.exerciseSets, s0Var.exerciseSets);
    }

    public final int hashCode() {
        Long l14 = this.activityId;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        List<r0> list = this.exerciseSets;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ExerciseSetsDTO(activityId=" + this.activityId + ", exerciseSets=" + this.exerciseSets + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.activityId;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        List<r0> list = this.exerciseSets;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = lc.u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((r0) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public s0(Long l14, List<r0> list) {
        this.activityId = l14;
        this.exerciseSets = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
