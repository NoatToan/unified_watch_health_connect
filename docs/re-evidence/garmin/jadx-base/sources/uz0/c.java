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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, d2 = {"Luz0/c;", "Landroid/os/Parcelable;", "", "requestCount", "", "Luz0/d;", "requests", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "profileInfoMap", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;)V", "a", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "f", "()Ljava/util/List;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "gcm-notifications_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requestCount")
    private final Integer requestCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("requests")
    private final List<d> requests;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileInfos")
    @JsonAdapter(ProfileInfoJsonAdapter.class)
    private final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> profileInfoMap;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LinkedHashMap linkedHashMap = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
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
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap2.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(c.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new c(numValueOf, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(Integer num, List<d> list, Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map) {
        this.requestCount = num;
        this.requests = list;
        this.profileInfoMap = map;
    }

    public final Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> b() {
        return this.profileInfoMap;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getRequestCount() {
        return this.requestCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.requestCount, cVar.requestCount) && s.g(this.requests, cVar.requests) && s.g(this.profileInfoMap, cVar.profileInfoMap);
    }

    public final List<d> f() {
        return this.requests;
    }

    public final int hashCode() {
        Integer num = this.requestCount;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<d> list = this.requests;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.profileInfoMap;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.requestCount;
        List<d> list = this.requests;
        Map<Integer, com.garmin.android.apps.connectmobile.userprofile.model.l> map = this.profileInfoMap;
        StringBuilder sb3 = new StringBuilder("InboxRequestCountDTO(requestCount=");
        sb3.append(num);
        sb3.append(", requests=");
        sb3.append(list);
        sb3.append(", profileInfoMap=");
        return am.j.s(sb3, map, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.requestCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
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

    public /* synthetic */ c(Integer num, List list, Map map, int i14, p005kotlin.jvm.internal.j jVar) {
        this(num, list, (i14 & 4) != 0 ? null : map);
    }
}
