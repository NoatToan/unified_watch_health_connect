package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lps/y0;", "Landroid/os/Parcelable;", "", "activityId", "", "Lps/o0;", "eventDTOs", "Lps/x0;", "lapDTOs", "<init>", "(JLjava/util/List;Ljava/util/List;)V", "a", "J", "b", "()J", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "f", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventDTOs")
    private final List<o0> eventDTOs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lapDTOs")
    private final List<x0> lapDTOs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<y0> {
        @Override // android.os.Parcelable.Creator
        public final y0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            int iA = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = kg.f.a(o0.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                arrayList2 = new ArrayList(i15);
                while (iA != i15) {
                    iA = kg.f.a(x0.CREATOR, parcel, arrayList2, iA, 1);
                }
            }
            return new y0(j8, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final y0[] newArray(int i14) {
            return new y0[i14];
        }
    }

    public /* synthetic */ y0(long j8, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : list2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getActivityId() {
        return this.activityId;
    }

    public final List<o0> d() {
        return this.eventDTOs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.activityId == y0Var.activityId && p005kotlin.jvm.internal.s.g(this.eventDTOs, y0Var.eventDTOs) && p005kotlin.jvm.internal.s.g(this.lapDTOs, y0Var.lapDTOs);
    }

    public final List<x0> f() {
        return this.lapDTOs;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        List<o0> list = this.eventDTOs;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<x0> list2 = this.lapDTOs;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return "LapsWrapperDTO(activityId=" + this.activityId + ", eventDTOs=" + this.eventDTOs + ", lapDTOs=" + this.lapDTOs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        List<o0> list = this.eventDTOs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((o0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        List<x0> list2 = this.lapDTOs;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO2 = lc.u0.o(parcel, list2, 1);
        while (itO2.hasNext()) {
            ((x0) itO2.next()).writeToParcel(parcel, i14);
        }
    }

    public y0(long j8, List<o0> list, List<x0> list2) {
        this.activityId = j8;
        this.eventDTOs = list;
        this.lapDTOs = list2;
    }

    public y0() {
        this(0L, null, null, 7, null);
    }
}
