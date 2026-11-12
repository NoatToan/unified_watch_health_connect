package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import j20.x;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lix1/e;", "Landroid/os/Parcelable;", "", "", "Lix1/c;", "_startBenchmarksMap", "_endBenchmarksMap", "", "startRounds", "endRounds", "", "preciseStartRounds", "preciseEndRounds", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "a", "Ljava/util/Map;", "b", "c", "Ljava/lang/Integer;", "getStartRounds", "()Ljava/lang/Integer;", "d", "getEndRounds", JWKParameterNames.RSA_EXPONENT, "Ljava/lang/Double;", "f", "()Ljava/lang/Double;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startBenchmarks")
    private final Map<String, ix1.c> _startBenchmarksMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endBenchmarks")
    private final Map<String, ix1.c> _endBenchmarksMap;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startRounds")
    private final Integer startRounds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endRounds")
    private final Integer endRounds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preciseStartRounds")
    private final Double preciseStartRounds;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("preciseEndRounds")
    private final Double preciseEndRounds;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap3.put(parcel.readString(), ix1.c.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap3;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i16);
                for (int i17 = 0; i17 != i16; i17++) {
                    linkedHashMap4.put(parcel.readString(), ix1.c.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap2 = linkedHashMap4;
            }
            return new e(linkedHashMap, linkedHashMap2, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((ix1.c) t7).getBenchmarkKey(), ((ix1.c) t14).getBenchmarkKey());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((ix1.c) t7).getBenchmarkKey(), ((ix1.c) t14).getBenchmarkKey());
        }
    }

    public e(Map<String, ix1.c> map, Map<String, ix1.c> map2, Integer num, Integer num2, Double d14, Double d15) {
        this._startBenchmarksMap = map;
        this._endBenchmarksMap = map2;
        this.startRounds = num;
        this.endRounds = num2;
        this.preciseStartRounds = d14;
        this.preciseEndRounds = d15;
    }

    public final List<ix1.c> b() {
        Collection<ix1.c> collectionValues;
        List listB1;
        Map<String, ix1.c> map = this._endBenchmarksMap;
        if (map == null || (collectionValues = map.values()) == null || (listB1 = h0.b1(collectionValues)) == null) {
            return null;
        }
        return h0.N0(listB1, new c());
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Double getPreciseEndRounds() {
        return this.preciseEndRounds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this._startBenchmarksMap, eVar._startBenchmarksMap) && s.g(this._endBenchmarksMap, eVar._endBenchmarksMap) && s.g(this.startRounds, eVar.startRounds) && s.g(this.endRounds, eVar.endRounds) && s.g(this.preciseStartRounds, eVar.preciseStartRounds) && s.g(this.preciseEndRounds, eVar.preciseEndRounds);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getPreciseStartRounds() {
        return this.preciseStartRounds;
    }

    public final List<ix1.c> g() {
        Collection<ix1.c> collectionValues;
        List listB1;
        Map<String, ix1.c> map = this._startBenchmarksMap;
        if (map == null || (collectionValues = map.values()) == null || (listB1 = h0.b1(collectionValues)) == null) {
            return null;
        }
        return h0.N0(listB1, new b());
    }

    public final int hashCode() {
        Map<String, ix1.c> map = this._startBenchmarksMap;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map<String, ix1.c> map2 = this._endBenchmarksMap;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.startRounds;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.endRounds;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d14 = this.preciseStartRounds;
        int iHashCode5 = (iHashCode4 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.preciseEndRounds;
        return iHashCode5 + (d15 != null ? d15.hashCode() : 0);
    }

    public final String toString() {
        Map<String, ix1.c> map = this._startBenchmarksMap;
        Map<String, ix1.c> map2 = this._endBenchmarksMap;
        Integer num = this.startRounds;
        Integer num2 = this.endRounds;
        Double d14 = this.preciseStartRounds;
        Double d15 = this.preciseEndRounds;
        StringBuilder sb3 = new StringBuilder("StrengthBenchmarkWrapperDTO(_startBenchmarksMap=");
        sb3.append(map);
        sb3.append(", _endBenchmarksMap=");
        sb3.append(map2);
        sb3.append(", startRounds=");
        x.m(sb3, num, ", endRounds=", num2, ", preciseStartRounds=");
        return sn.a.f(d14, d15, ", preciseEndRounds=", ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Map<String, ix1.c> map = this._startBenchmarksMap;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<String, ix1.c> entry : map.entrySet()) {
                parcel.writeString(entry.getKey());
                entry.getValue().writeToParcel(parcel, i14);
            }
        }
        Map<String, ix1.c> map2 = this._endBenchmarksMap;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map2.size());
            for (Map.Entry<String, ix1.c> entry2 : map2.entrySet()) {
                parcel.writeString(entry2.getKey());
                entry2.getValue().writeToParcel(parcel, i14);
            }
        }
        Integer num = this.startRounds;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.endRounds;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Double d14 = this.preciseStartRounds;
        if (d14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d14);
        }
        Double d15 = this.preciseEndRounds;
        if (d15 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.m(parcel, 1, d15);
        }
    }
}
