package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lps/p1;", "Landroid/os/Parcelable;", "", "activityId", "", "Lps/o1;", "splitSummaryDTOs", "<init>", "(JLjava/util/List;)V", "a", "J", "getActivityId", "()J", "b", "Ljava/util/List;", "()Ljava/util/List;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p1 implements Parcelable {
    public static final Parcelable.Creator<p1> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("activityId")
    private final long activityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("splitSummaries")
    private final List<o1> splitSummaryDTOs;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p1> {
        @Override // android.os.Parcelable.Creator
        public final p1 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            long j8 = parcel.readLong();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(o1.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new p1(j8, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final p1[] newArray(int i14) {
            return new p1[i14];
        }
    }

    public /* synthetic */ p1(long j8, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 0L : j8, (i14 & 2) != 0 ? null : list);
    }

    public final List<o1> b() {
        return this.splitSummaryDTOs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.activityId == p1Var.activityId && p005kotlin.jvm.internal.s.g(this.splitSummaryDTOs, p1Var.splitSummaryDTOs);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.activityId) * 31;
        List<o1> list = this.splitSummaryDTOs;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "SplitSummaryWrapperDTO(activityId=" + this.activityId + ", splitSummaryDTOs=" + this.splitSummaryDTOs + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.activityId);
        List<o1> list = this.splitSummaryDTOs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itO = lc.u0.o(parcel, list, 1);
        while (itO.hasNext()) {
            ((o1) itO.next()).writeToParcel(parcel, i14);
        }
    }

    public p1(long j8, List<o1> list) {
        this.activityId = j8;
        this.splitSummaryDTOs = list;
    }

    public p1() {
        this(0L, null, 3, null);
    }
}
