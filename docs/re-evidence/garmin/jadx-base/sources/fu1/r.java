package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lfu1/r;", "Landroid/os/Parcelable;", "", "", "availableTimes", "suggestedIndex", "<init>", "(Ljava/util/List;I)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setAvailableTimes", "(Ljava/util/List;)V", "I", "d", "()I", "setSuggestedIndex", "(I)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("availableTimes")
    private List<Integer> availableTimes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedIndex")
    private int suggestedIndex;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new r(arrayList, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public /* synthetic */ r(List list, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : list, (i15 & 2) != 0 ? 0 : i14);
    }

    public final List<Integer> b() {
        return this.availableTimes;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSuggestedIndex() {
        return this.suggestedIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.availableTimes, rVar.availableTimes) && this.suggestedIndex == rVar.suggestedIndex;
    }

    public final int hashCode() {
        List<Integer> list = this.availableTimes;
        return Integer.hashCode(this.suggestedIndex) + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "PaceTimesDTO(availableTimes=" + this.availableTimes + ", suggestedIndex=" + this.suggestedIndex + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<Integer> list = this.availableTimes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                parcel.writeInt(((Number) itO.next()).intValue());
            }
        }
        parcel.writeInt(this.suggestedIndex);
    }

    public r(List<Integer> list, int i14) {
        this.availableTimes = list;
        this.suggestedIndex = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }
}
