package mp;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fB5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R&\u0010\t\u001a\u0014\u0012\b\u0012\u00060\u0002j\u0002`\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmp/n;", "Landroid/os/Parcelable;", "", "date", "", "activityCount", "", "Lcom/garmin/android/apps/connectmobile/activities/reports/model/ActivityTypeKey;", "Lmp/q;", "stats", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getActivityCount", "()Ljava/lang/Integer;", "c", "Ljava/util/Map;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("date")
    private final String date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("countOfActivities")
    private final Integer activityCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("stats")
    private final Map<String, q> stats;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinkedHashMap f120045d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            LinkedHashMap linkedHashMap = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                for (int i15 = 0; i15 != i14; i15++) {
                    linkedHashMap2.put(parcel.readString(), q.CREATOR.createFromParcel(parcel));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new n(string, numValueOf, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/reports/model/SportsAggregationDTOKt$convert$1", "Lcom/google/gson/reflect/TypeToken;", "mp/p", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends TypeToken<Map<String, mp.e>> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/reports/model/SportsAggregationDTOKt$convert$1", "Lcom/google/gson/reflect/TypeToken;", "mp/p", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d extends TypeToken<HashMap<String, mp.e>> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/reports/model/SportsAggregationDTOKt$convert$1", "Lcom/google/gson/reflect/TypeToken;", "mp/p", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends TypeToken<HashMap<String, mp.e>> {
    }

    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/activities/reports/model/SportsAggregationDTOKt$convert$1", "Lcom/google/gson/reflect/TypeToken;", "mp/p", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f extends TypeToken<HashMap<String, Double>> {
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public n(String str, Integer num, Map<String, q> map) {
        this.date = str;
        this.activityCount = num;
        this.stats = map;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final void d() {
        m packWeight;
        HashMap map;
        m roundActive;
        HashMap map2;
        Map<String, q> map3 = this.stats;
        LinkedHashMap linkedHashMap = null;
        q qVar = map3 != null ? map3.get(TtmlNode.COMBINE_ALL) : null;
        if (qVar != null) {
            String strA = GsonUtil.a(qVar);
            Type type = new c().getType();
            Gson gson = GsonUtil.f47253b;
            Map map4 = (Map) gson.fromJson(strA, type);
            if (map4 != null) {
                String str = i.SPLIT_SUMMARIES.f119999a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                mp.e eVar = (mp.e) map4.get(str);
                map4.remove(str);
                if (eVar != null && (roundActive = eVar.getRoundActive()) != null && (map2 = (HashMap) gson.fromJson(GsonUtil.a(roundActive), new d().getType())) != null) {
                    map4.putAll(map2);
                }
                if (eVar != null && (packWeight = eVar.getPackWeight()) != null && (map = (HashMap) gson.fromJson(GsonUtil.a(packWeight), new e().getType())) != null) {
                    map4.putAll(map);
                }
                for (Map.Entry entry : map4.entrySet()) {
                    HashMap map5 = (HashMap) GsonUtil.f47253b.fromJson(GsonUtil.a(entry.getValue()), new f().getType());
                    if (map5 != null) {
                        linkedHashMap2.put(entry.getKey(), map5);
                    }
                }
                linkedHashMap = linkedHashMap2;
            }
        }
        this.f120045d = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return s.g(this.date, nVar.date) && s.g(this.activityCount, nVar.activityCount) && s.g(this.stats, nVar.stats);
    }

    public final int hashCode() {
        String str = this.date;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.activityCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, q> map = this.stats;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        String str = this.date;
        Integer num = this.activityCount;
        return am.j.s(u0.n("SportsAggregationDTO(date=", num, str, ", activityCount=", ", stats="), this.stats, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.date);
        Integer num = this.activityCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Map<String, q> map = this.stats;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, q> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            entry.getValue().writeToParcel(parcel, i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lmp/n$a;", "", "<init>", "()V", "", "ALL_STATS_KEY", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
