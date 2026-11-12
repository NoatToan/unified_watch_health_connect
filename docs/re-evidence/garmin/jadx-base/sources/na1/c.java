package na1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lna1/c;", "", "Lna1/b;", "dailyPowerCurveSummary", "", "Lna1/a;", "historicalPowerCurve", "<init>", "(Lna1/b;Ljava/util/List;)V", "gcm-power-curve_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f125205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<a> f125206b;

    public /* synthetic */ c(b bVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : bVar, (i14 & 2) != 0 ? null : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f125205a, cVar.f125205a) && s.g(this.f125206b, cVar.f125206b);
    }

    public final int hashCode() {
        b bVar = this.f125205a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        List<a> list = this.f125206b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "PowerCurveSummary(dailyPowerCurveSummary=" + this.f125205a + ", historicalPowerCurve=" + this.f125206b + ")";
    }

    public c(b bVar, List<a> list) {
        this.f125205a = bVar;
        this.f125206b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
