package ix1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R,\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lix1/k;", "Landroid/os/Parcelable;", "", "", "intensities", "", "Lix1/l;", "types", "Lix1/a;", "defaultAccessories", "suggestedAccessories", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "a", "Ljava/util/List;", "getIntensities", "()Ljava/util/List;", "b", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "c", "d", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("intensities")
    private final List<String> intensities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("types")
    private final Map<String, l> types;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("defaultAccessories")
    private final Map<String, List<ix1.a>> defaultAccessories;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("suggestedAccessories")
    private final Map<String, List<ix1.a>> suggestedAccessories;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(parcel.readString(), l.CREATOR.createFromParcel(parcel));
            }
            int i16 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i16);
            for (int i17 = 0; i17 != i16; i17++) {
                String string = parcel.readString();
                int i18 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i18);
                int iA = 0;
                while (iA != i18) {
                    iA = kg.f.a(ix1.a.CREATOR, parcel, arrayList, iA, 1);
                }
                linkedHashMap2.put(string, arrayList);
            }
            int i19 = parcel.readInt();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(i19);
            for (int i24 = 0; i24 != i19; i24++) {
                String string2 = parcel.readString();
                int i25 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i25);
                int iA2 = 0;
                while (iA2 != i25) {
                    iA2 = kg.f.a(ix1.a.CREATOR, parcel, arrayList2, iA2, 1);
                }
                linkedHashMap3.put(string2, arrayList2);
            }
            return new k(arrayListCreateStringArrayList, linkedHashMap, linkedHashMap2, linkedHashMap3);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(List<String> list, Map<String, l> map, Map<String, ? extends List<ix1.a>> map2, Map<String, ? extends List<ix1.a>> map3) {
        list.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.intensities = list;
        this.types = map;
        this.defaultAccessories = map2;
        this.suggestedAccessories = map3;
    }

    public final Map<String, List<ix1.a>> b() {
        return this.defaultAccessories;
    }

    public final Map<String, List<ix1.a>> d() {
        return this.suggestedAccessories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.intensities, kVar.intensities) && s.g(this.types, kVar.types) && s.g(this.defaultAccessories, kVar.defaultAccessories) && s.g(this.suggestedAccessories, kVar.suggestedAccessories);
    }

    public final Map<String, l> f() {
        return this.types;
    }

    public final int hashCode() {
        return this.suggestedAccessories.hashCode() + am.j.b(this.defaultAccessories, am.j.b(this.types, this.intensities.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "StrengthTrainingPlanStructureDTO(intensities=" + this.intensities + ", types=" + this.types + ", defaultAccessories=" + this.defaultAccessories + ", suggestedAccessories=" + this.suggestedAccessories + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeStringList(this.intensities);
        Iterator itU = am.j.u(this.types, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            ((l) entry.getValue()).writeToParcel(parcel, i14);
        }
        Iterator itU2 = am.j.u(this.defaultAccessories, parcel);
        while (itU2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) itU2.next();
            parcel.writeString((String) entry2.getKey());
            Iterator itE = kg.f.e((List) entry2.getValue(), parcel);
            while (itE.hasNext()) {
                ((ix1.a) itE.next()).writeToParcel(parcel, i14);
            }
        }
        Iterator itU3 = am.j.u(this.suggestedAccessories, parcel);
        while (itU3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) itU3.next();
            parcel.writeString((String) entry3.getKey());
            Iterator itE2 = kg.f.e((List) entry3.getValue(), parcel);
            while (itE2.hasNext()) {
                ((ix1.a) itE2.next()).writeToParcel(parcel, i14);
            }
        }
    }
}
