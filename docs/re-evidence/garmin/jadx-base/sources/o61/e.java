package o61;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.k0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo61/e;", "", "", "", "Lx61/i;", "metricsTrainingLoadBalanceDTOMap", "", "recordedDevices", "", "userId", "<init>", "(Ljava/util/Map;Ljava/util/List;I)V", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "b", "Ljava/util/List;", "getRecordedDevices", "()Ljava/util/List;", "c", "I", "getUserId", "()I", "gcm-domain-fitness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metricsTrainingLoadBalanceDTOMap")
    private final Map<String, x61.i> metricsTrainingLoadBalanceDTOMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recordedDevices")
    private final List<Object> recordedDevices;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final int userId;

    /* JADX WARN: Illegal instructions before constructor call */
    public e(Map map, List list, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        if ((i15 & 1) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(map, (i15 & 2) != 0 ? j0.f134944a : list, (i15 & 4) != 0 ? 0 : i14);
    }

    public final Map<String, x61.i> a() {
        return this.metricsTrainingLoadBalanceDTOMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.metricsTrainingLoadBalanceDTOMap, eVar.metricsTrainingLoadBalanceDTOMap) && s.g(this.recordedDevices, eVar.recordedDevices) && this.userId == eVar.userId;
    }

    public final int hashCode() {
        Map<String, x61.i> map = this.metricsTrainingLoadBalanceDTOMap;
        return Integer.hashCode(this.userId) + u0.b((map == null ? 0 : map.hashCode()) * 31, 31, this.recordedDevices);
    }

    public final String toString() {
        Map<String, x61.i> map = this.metricsTrainingLoadBalanceDTOMap;
        List<Object> list = this.recordedDevices;
        int i14 = this.userId;
        StringBuilder sb3 = new StringBuilder("MostRecentTrainingLoadBalanceDTO(metricsTrainingLoadBalanceDTOMap=");
        sb3.append(map);
        sb3.append(", recordedDevices=");
        sb3.append(list);
        sb3.append(", userId=");
        return am.j.q(sb3, i14, ")");
    }

    public e(Map<String, x61.i> map, List<Object> list, int i14) {
        list.getClass();
        this.metricsTrainingLoadBalanceDTOMap = map;
        this.recordedDevices = list;
        this.userId = i14;
    }

    public e() {
        this(null, null, 0, 7, null);
    }
}
