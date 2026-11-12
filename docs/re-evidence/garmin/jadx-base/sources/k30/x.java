package k30;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lk30/x;", "Landroid/os/Parcelable;", "", "Lk30/w;", "unpavedCourseSections", "", "unpavedPercentage", "", "totalUnpavedDistance", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "c", "Ljava/lang/Double;", "()Ljava/lang/Double;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unpavedCourseSections")
    private final List<w> unpavedCourseSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("unpavedPercentage")
    private final Integer unpavedPercentage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("totalUnpavedDistance")
    private final Double totalUnpavedDistance;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<x> {
        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(w.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new x(arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }
    }

    public x(List<w> list, Integer num, Double d14) {
        this.unpavedCourseSections = list;
        this.unpavedPercentage = num;
        this.totalUnpavedDistance = d14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getTotalUnpavedDistance() {
        return this.totalUnpavedDistance;
    }

    public final List<w> d() {
        return this.unpavedCourseSections;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.unpavedCourseSections, xVar.unpavedCourseSections) && p005kotlin.jvm.internal.s.g(this.unpavedPercentage, xVar.unpavedPercentage) && p005kotlin.jvm.internal.s.g(this.totalUnpavedDistance, xVar.totalUnpavedDistance);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getUnpavedPercentage() {
        return this.unpavedPercentage;
    }

    public final int hashCode() {
        List<w> list = this.unpavedCourseSections;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.unpavedPercentage;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d14 = this.totalUnpavedDistance;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        List<w> list = this.unpavedCourseSections;
        Integer num = this.unpavedPercentage;
        Double d14 = this.totalUnpavedDistance;
        StringBuilder sb3 = new StringBuilder("UnpavedCourseSectionsDTO(unpavedCourseSections=");
        sb3.append(list);
        sb3.append(", unpavedPercentage=");
        sb3.append(num);
        sb3.append(", totalUnpavedDistance=");
        return b71.i.g(sb3, d14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<w> list = this.unpavedCourseSections;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((w) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.unpavedPercentage;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Double d14 = this.totalUnpavedDistance;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
    }
}
