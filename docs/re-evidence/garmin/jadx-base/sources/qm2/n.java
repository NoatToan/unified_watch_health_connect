package qm2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lqm2/n;", "Landroid/os/Parcelable;", "", "", "Lqm2/m;", "settings", "<init>", "(Ljava/util/Map;)V", "device-pairing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Integer, m> f145780a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i14 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                linkedHashMap.put(Integer.valueOf(parcel.readInt()), m.CREATOR.createFromParcel(parcel));
            }
            return new n(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public /* synthetic */ n(Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new LinkedHashMap() : map);
    }

    public final n b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, m> entry : this.f145780a.entrySet()) {
            Integer key = entry.getKey();
            m value = entry.getValue();
            linkedHashMap.put(key, new m(value.f145778a, value.f145779b));
        }
        return new n(linkedHashMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && s.g(this.f145780a, ((n) obj).f145780a);
    }

    public final int hashCode() {
        return this.f145780a.hashCode();
    }

    public final String toString() {
        return "HandshakeSettings(settings=" + this.f145780a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Iterator itU = am.j.u(this.f145780a, parcel);
        while (itU.hasNext()) {
            Map.Entry entry = (Map.Entry) itU.next();
            parcel.writeInt(((Number) entry.getKey()).intValue());
            ((m) entry.getValue()).writeToParcel(parcel, i14);
        }
    }

    public n(Map<Integer, m> map) {
        map.getClass();
        this.f145780a = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
