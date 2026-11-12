package jo1;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.userprofile.model.ProfileInfoJsonAdapter;
import com.garmin.android.apps.connectmobile.userprofile.model.l;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ljo1/c;", "Landroid/os/Parcelable;", "", "Ljo1/a;", "groupFeed", "", "nextCursor", "", "daysLimit", "", "Lcom/garmin/android/apps/connectmobile/userprofile/model/l;", "profileInfoMap", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "a", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Ljava/util/Map;", "g", "()Ljava/util/Map;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("groupFeed")
    private final List<jo1.a> groupFeed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("nextCursor")
    private final String nextCursor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("daysLimit")
    private final Integer daysLimit;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("profileInfos")
    @JsonAdapter(ProfileInfoJsonAdapter.class)
    private final Map<Integer, l> profileInfoMap;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LinkedHashMap linkedHashMap = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(jo1.a.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashMap2.put(Integer.valueOf(parcel.readInt()), parcel.readParcelable(c.class.getClassLoader()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new c(arrayList, string, numValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(List list, String str, Integer num, Map map, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? 90 : num, (i14 & 8) != 0 ? null : map);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getDaysLimit() {
        return this.daysLimit;
    }

    public final List<jo1.a> d() {
        return this.groupFeed;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final Map<Integer, l> g() {
        return this.profileInfoMap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<jo1.a> list = this.groupFeed;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((jo1.a) itO.next()).writeToParcel(parcel, i14);
            }
        }
        parcel.writeString(this.nextCursor);
        Integer num = this.daysLimit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Map<Integer, l> map = this.profileInfoMap;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<Integer, l> entry : map.entrySet()) {
            parcel.writeInt(entry.getKey().intValue());
            parcel.writeParcelable(entry.getValue(), i14);
        }
    }

    public c(List<jo1.a> list, String str, Integer num, Map<Integer, l> map) {
        this.groupFeed = list;
        this.nextCursor = str;
        this.daysLimit = num;
        this.profileInfoMap = map;
    }

    public c() {
        this(null, null, null, null, 15, null);
    }
}
