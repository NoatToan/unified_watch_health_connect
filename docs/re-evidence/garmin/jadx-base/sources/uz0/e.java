package uz0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Luz0/e;", "Landroid/os/Parcelable;", "", "nextCursor", "", "Luz0/d;", "requests", "", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "profileInfoMap", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextCursor")
    private final String nextCursor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requests")
    private final List<d> requests;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileInfos")
    @JsonAdapter(ProfileInfoJsonAdapter.class)
    private final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> profileInfoMap;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(d.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(e.class.getClassLoader()));
                }
            }
            return new e(string, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(String str, List list, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list, (i14 & 4) != 0 ? null : map);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> d() {
        return this.profileInfoMap;
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
        return s.g(this.nextCursor, eVar.nextCursor) && s.g(this.requests, eVar.requests) && s.g(this.profileInfoMap, eVar.profileInfoMap);
    }

    public final List<d> f() {
        return this.requests;
    }

    public final int hashCode() {
        String str = this.nextCursor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<d> list = this.requests;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.profileInfoMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.nextCursor;
        List<d> list = this.requests;
        return am.j.s(l2.g("InboxRequestNotificationListDTO(nextCursor=", str, ", requests=", list, ", profileInfoMap="), this.profileInfoMap, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.nextCursor);
        List<d> list = this.requests;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((d) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.profileInfoMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> entry : map.entrySet()) {
            parcel.writeInt(entry.getKey().intValue());
            parcel.writeParcelable(entry.getValue(), i14);
        }
    }

    public e(String str, List<d> list, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map) {
        this.nextCursor = str;
        this.requests = list;
        this.profileInfoMap = map;
    }

    public e() {
        this(null, null, null, 7, null);
    }
}
