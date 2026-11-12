package lt2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llt2/d;", "", "", "functionalThresholdPower", "", "powerZoneFloors", "<init>", "(ILjava/util/List;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Integer> f114881b;

    public d(int i14, List list, int i15, j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f114880a == dVar.f114880a && s.g(this.f114881b, dVar.f114881b);
    }

    public final int hashCode() {
        return this.f114881b.hashCode() + (Integer.hashCode(this.f114880a) * 31);
    }

    public final String toString() {
        return "CommonPowerZones(functionalThresholdPower=" + this.f114880a + ", powerZoneFloors=" + this.f114881b + ")";
    }

    public d(int i14, List<Integer> list) {
        list.getClass();
        this.f114880a = i14;
        this.f114881b = list;
    }

    public d() {
        this(0, null, 3, null);
    }
}
