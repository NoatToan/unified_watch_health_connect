package k30;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.courses.model.ClimbDTO;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk30/g;", "Landroid/os/Parcelable;", "", "Lcom/garmin/android/apps/connectmobile/courses/model/ClimbDTO;", "primaryClimbs", "", "countOfClimbsAtStart", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryClimbs")
    private final List<ClimbDTO> primaryClimbs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countOfClimbsAtStart")
    private final Integer countOfClimbsAtStart;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(ClimbDTO.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new g(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public g(List<ClimbDTO> list, Integer num) {
        this.primaryClimbs = list;
        this.countOfClimbsAtStart = num;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getCountOfClimbsAtStart() {
        return this.countOfClimbsAtStart;
    }

    public final List<ClimbDTO> d() {
        return this.primaryClimbs;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return p005kotlin.jvm.internal.s.g(this.primaryClimbs, gVar.primaryClimbs) && p005kotlin.jvm.internal.s.g(this.countOfClimbsAtStart, gVar.countOfClimbsAtStart);
    }

    public final int hashCode() {
        List<ClimbDTO> list = this.primaryClimbs;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.countOfClimbsAtStart;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ClimbStartDTO(primaryClimbs=" + this.primaryClimbs + ", countOfClimbsAtStart=" + this.countOfClimbsAtStart + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<ClimbDTO> list = this.primaryClimbs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((ClimbDTO) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.countOfClimbsAtStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }
}
