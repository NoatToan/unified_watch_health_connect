package q01;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq01/g;", "", "Lqd1/b;", "dailyReminders", "", "", "Lq01/j;", "nameMap", "<init>", "(Lqd1/b;Ljava/util/Map;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd1.b f142020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, j> f142021b;

    public g(qd1.b bVar, Map<String, j> map) {
        map.getClass();
        this.f142020a = bVar;
        this.f142021b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.f142020a, gVar.f142020a) && this.f142021b.equals(gVar.f142021b);
    }

    public final int hashCode() {
        qd1.b bVar = this.f142020a;
        return this.f142021b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    public final String toString() {
        return "NutritionRemindersResult(dailyReminders=" + this.f142020a + ", nameMap=" + this.f142021b + ")";
    }
}
