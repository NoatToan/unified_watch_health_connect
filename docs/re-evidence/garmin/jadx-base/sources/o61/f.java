package o61;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d53.t;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import r1.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lo61/f;", "", "", "lastPrimarySyncDate", "", "", "Lo61/n;", "latestTrainingStatusData", "", "recordedDevices", "", "userId", "", "showSelector", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;IZ)V", "a", "Ljava/lang/String;", "getLastPrimarySyncDate", "()Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "Ljava/util/List;", "getRecordedDevices", "()Ljava/util/List;", "d", "I", "getUserId", "()I", JWKParameterNames.RSA_EXPONENT, "Z", "getShowSelector", "()Z", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("lastPrimarySyncDate")
    private final String lastPrimarySyncDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("latestTrainingStatusData")
    private final Map<Long, n> latestTrainingStatusData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recordedDevices")
    private final List<Object> recordedDevices;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final int userId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("showSelector")
    private final boolean showSelector;

    public f(String str, Map map, List list, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : map, (i15 & 4) != 0 ? j0.f134944a : list, (i15 & 8) != 0 ? 0 : i14, z14);
    }

    public final n a() {
        Collection<n> collectionValues;
        Collection<n> collectionValues2;
        boolean z14 = this.showSelector;
        Map<Long, n> map = this.latestTrainingStatusData;
        Object obj = null;
        if (!z14) {
            if (map == null || (collectionValues2 = map.values()) == null) {
                return null;
            }
            return (n) h0.c0(collectionValues2);
        }
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        for (Object obj2 : collectionValues) {
            if (((n) obj2).getPrimaryTrainingDevice()) {
                obj = obj2;
                break;
            }
        }
        return (n) obj;
    }

    public final n b(String str) {
        Collection<n> collectionValues;
        str.getClass();
        boolean z14 = this.showSelector;
        Map<Long, n> map = this.latestTrainingStatusData;
        if (z14) {
            if (map != null) {
                return map.get(t.j(str));
            }
            return null;
        }
        if (map == null || (collectionValues = map.values()) == null) {
            return null;
        }
        return (n) h0.c0(collectionValues);
    }

    public final Map<Long, n> c() {
        return this.latestTrainingStatusData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.lastPrimarySyncDate, fVar.lastPrimarySyncDate) && s.g(this.latestTrainingStatusData, fVar.latestTrainingStatusData) && s.g(this.recordedDevices, fVar.recordedDevices) && this.userId == fVar.userId && this.showSelector == fVar.showSelector;
    }

    public final int hashCode() {
        String str = this.lastPrimarySyncDate;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<Long, n> map = this.latestTrainingStatusData;
        return Boolean.hashCode(this.showSelector) + q2.d(this.userId, u0.b((iHashCode + (map != null ? map.hashCode() : 0)) * 31, 31, this.recordedDevices), 31);
    }

    public final String toString() {
        String str = this.lastPrimarySyncDate;
        Map<Long, n> map = this.latestTrainingStatusData;
        List<Object> list = this.recordedDevices;
        int i14 = this.userId;
        boolean z14 = this.showSelector;
        StringBuilder sb3 = new StringBuilder("MostRecentTrainingStatusDTO(lastPrimarySyncDate=");
        sb3.append(str);
        sb3.append(", latestTrainingStatusData=");
        sb3.append(map);
        sb3.append(", recordedDevices=");
        sb3.append(list);
        sb3.append(", userId=");
        sb3.append(i14);
        sb3.append(", showSelector=");
        return hb.a.k(sb3, z14, ")");
    }

    public f(String str, Map<Long, n> map, List<Object> list, int i14, boolean z14) {
        list.getClass();
        this.lastPrimarySyncDate = str;
        this.latestTrainingStatusData = map;
        this.recordedDevices = list;
        this.userId = i14;
        this.showSelector = z14;
    }
}
