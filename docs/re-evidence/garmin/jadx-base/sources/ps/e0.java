package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR2\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lps/e0;", "Landroid/os/Parcelable;", "", "Lps/d0;", "dataFields", "", "", "strings", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("datafields")
    private final List<d0> dataFields;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("strings")
    private final Map<String, Map<String, String>> strings;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public final e0 createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d0.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            int i15 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i15);
            for (int i16 = 0; i16 != i15; i16++) {
                String string = parcel.readString();
                int i17 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i17);
                for (int i18 = 0; i18 != i17; i18++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap.put(string, linkedHashMap2);
            }
            return new e0(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final e0[] newArray(int i14) {
            return new e0[i14];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e0(List<d0> list, Map<String, ? extends Map<String, String>> map) {
        map.getClass();
        this.dataFields = list;
        this.strings = map;
    }

    public final List<d0> b() {
        return this.dataFields;
    }

    public final Map<String, Map<String, String>> d() {
        return this.strings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.dataFields, e0Var.dataFields) && p005kotlin.jvm.internal.s.g(this.strings, e0Var.strings);
    }

    public final int hashCode() {
        List<d0> list = this.dataFields;
        return this.strings.hashCode() + ((list == null ? 0 : list.hashCode()) * 31);
    }

    public final String toString() {
        return "ConnectIQAppFitContributionsDTO(dataFields=" + this.dataFields + ", strings=" + this.strings + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<d0> list = this.dataFields;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = lc.u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((d0) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Iterator itU = am.j.u(this.strings, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeString((String) entry.getKey());
            Iterator itU2 = am.j.u((Map) entry.getValue(), parcel);
            while (itU2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itU2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
    }

    public /* synthetic */ e0(List list, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : list, map);
    }
}
