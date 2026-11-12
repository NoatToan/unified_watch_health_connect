package ou0;

import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import u62.z;
import wd2.d2;
import wd2.f2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lou0/e;", "", "", "sessionName", "Lou0/f;", "sharingOptions", "", "Lwd2/f2;", "", "Lwd2/d2;", "sharingErrors", "Lpu0/b;", "recipientsList", "Lpu0/a;", "groupTrackConnections", "<init>", "(Ljava/lang/String;Lou0/f;Ljava/util/Map;Ljava/util/List;Ljava/util/List;)V", "gcm-livetrack-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f133978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f133979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<f2, List<d2>> f133980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<pu0.b> f133981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<pu0.a> f133982e;

    public /* synthetic */ e(String str, f fVar, Map map, List list, List list2, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : fVar, (i14 & 4) != 0 ? null : map, (i14 & 8) != 0 ? null : list, (i14 & 16) != 0 ? null : list2);
    }

    public static e a(e eVar, String str, f fVar, List list, List list2, int i14) {
        if ((i14 & 1) != 0) {
            str = eVar.f133978a;
        }
        String str2 = str;
        if ((i14 & 2) != 0) {
            fVar = eVar.f133979b;
        }
        f fVar2 = fVar;
        Map<f2, List<d2>> map = eVar.f133980c;
        if ((i14 & 8) != 0) {
            list = eVar.f133981d;
        }
        List list3 = list;
        if ((i14 & 16) != 0) {
            list2 = eVar.f133982e;
        }
        eVar.getClass();
        return new e(str2, fVar2, map, list3, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return s.g(this.f133978a, eVar.f133978a) && s.g(this.f133979b, eVar.f133979b) && s.g(this.f133980c, eVar.f133980c) && s.g(this.f133981d, eVar.f133981d) && s.g(this.f133982e, eVar.f133982e);
    }

    public final int hashCode() {
        String str = this.f133978a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        f fVar = this.f133979b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        Map<f2, List<d2>> map = this.f133980c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        List<pu0.b> list = this.f133981d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<pu0.a> list2 = this.f133982e;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("LiveTrackSessionDetails(sessionName=");
        sb3.append(this.f133978a);
        sb3.append(", sharingOptions=");
        sb3.append(this.f133979b);
        sb3.append(", sharingErrors=");
        sb3.append(this.f133980c);
        sb3.append(", recipientsList=");
        sb3.append(this.f133981d);
        sb3.append(", groupTrackConnections=");
        return z.c(sb3, this.f133982e, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(String str, f fVar, Map<f2, ? extends List<d2>> map, List<pu0.b> list, List<pu0.a> list2) {
        this.f133978a = str;
        this.f133979b = fVar;
        this.f133980c = map;
        this.f133981d = list;
        this.f133982e = list2;
    }

    public e() {
        this(null, null, null, null, null, 31, null);
    }
}
