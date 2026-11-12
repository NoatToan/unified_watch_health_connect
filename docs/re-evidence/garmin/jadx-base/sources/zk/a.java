package zk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB3\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0010B\u0019\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzk/a;", "", "", "name", "", "Lzk/e;", "parameters", "", "uploadImmediately", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/util/List;ZJ)V", "eventType", "", "attributes", "(Ljava/lang/String;Ljava/util/Map;J)V", "event", "(Lzk/a;Z)V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<e> f205030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f205031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f205032d;

    public a(String str, Map<String, ? extends Object> map, long j8) {
        List arrayList;
        str.getClass();
        if (map != null) {
            arrayList = new ArrayList(map.size());
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                arrayList.add(new e(entry.getKey(), entry.getValue()));
            }
        } else {
            arrayList = j0.f134944a;
        }
        this(str, arrayList, false, j8, 4, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f205029a, aVar.f205029a) && s.g(this.f205030b, aVar.f205030b) && this.f205031c == aVar.f205031c && this.f205032d == aVar.f205032d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iB = u0.b(this.f205029a.hashCode() * 31, 31, this.f205030b);
        boolean z14 = this.f205031c;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        return Long.hashCode(this.f205032d) + ((iB + r14) * 31);
    }

    public final String toString() {
        boolean z14 = this.f205031c;
        StringBuilder sbG = l2.g("AnalyticEvent(name=", this.f205029a, ", parameters=", this.f205030b, ", uploadImmediately=");
        sbG.append(z14);
        sbG.append(", timestamp=");
        sbG.append(this.f205032d);
        sbG.append(")");
        return sbG.toString();
    }

    public /* synthetic */ a(String str, List list, boolean z14, long j8, int i14, j jVar) {
        this(str, list, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? System.currentTimeMillis() : j8);
    }

    public /* synthetic */ a(String str, Map map, long j8, int i14, j jVar) {
        this(str, (i14 & 2) != 0 ? null : map, (i14 & 4) != 0 ? System.currentTimeMillis() : j8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @o13.e
    public a(a aVar, boolean z14) {
        this(aVar.f205029a, aVar.f205030b, z14, aVar.f205032d);
        aVar.getClass();
    }

    public a(String str, List<e> list, boolean z14, long j8) {
        str.getClass();
        list.getClass();
        this.f205029a = str;
        this.f205030b = list;
        this.f205031c = z14;
        this.f205032d = j8;
    }
}
