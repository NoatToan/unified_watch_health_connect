package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lps/v;", "Landroid/os/Parcelable;", "", "longestDistanceTraveled", "", "", "Lps/g1;", "summaryMap", "<init>", "(Ljava/lang/Double;Ljava/util/Map;)V", "a", "Ljava/lang/Double;", "d", "()Ljava/lang/Double;", "b", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("longestDistanceTravelled")
    private final Double longestDistanceTraveled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("poolApneaSummaryMap")
    private final Map<String, g1> summaryMap;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<v> {
        @Override // android.os.Parcelable.Creator
        public final v createFromParcel(Parcel parcel) {
            parcel.getClass();
            LinkedHashMap linkedHashMap = null;
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap2.put(parcel.readString(), g1.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new v(dValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final v[] newArray(int i14) {
            return new v[i14];
        }
    }

    public /* synthetic */ v(Double d14, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : d14, (i14 & 2) != 0 ? null : map);
    }

    public final Double b() {
        String str;
        Map<String, g1> map = this.summaryMap;
        if (map == null) {
            return null;
        }
        h1 h1Var = h1.DYN;
        h1Var.getClass();
        int i14 = h1.b.f139844a[h1Var.ordinal()];
        if (i14 == 1) {
            str = "DYN";
        } else if (i14 == 2) {
            str = "STA";
        } else {
            if (i14 != 3) {
                lc.u0.r();
                return null;
            }
            str = "REST";
        }
        g1 g1Var = map.get(str);
        if (g1Var != null) {
            return g1Var.getAvgVelocity();
        }
        return null;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getLongestDistanceTraveled() {
        return this.longestDistanceTraveled;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return p005kotlin.jvm.internal.s.g(this.longestDistanceTraveled, vVar.longestDistanceTraveled) && p005kotlin.jvm.internal.s.g(this.summaryMap, vVar.summaryMap);
    }

    public final Map<String, g1> f() {
        return this.summaryMap;
    }

    public final int hashCode() {
        Double d14 = this.longestDistanceTraveled;
        int iHashCode = (d14 == null ? 0 : d14.hashCode()) * 31;
        Map<String, g1> map = this.summaryMap;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "ApneaSummaryDTO(longestDistanceTraveled=" + this.longestDistanceTraveled + ", summaryMap=" + this.summaryMap + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Double d14 = this.longestDistanceTraveled;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Map<String, g1> map = this.summaryMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, g1> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i14);
        }
    }

    public v(Double d14, Map<String, g1> map) {
        this.longestDistanceTraveled = d14;
        this.summaryMap = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public v() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
