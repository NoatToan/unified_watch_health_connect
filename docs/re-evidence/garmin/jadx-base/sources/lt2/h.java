package lt2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Llt2/h;", "", "Lmt2/f;", "measurementSystem", "", "isWheelchairModeOn", "Llt2/d;", "powerZones", "", "Llt2/c;", "powerCurves", "<init>", "(Lmt2/f;ZLlt2/d;Ljava/util/List;)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt2.f f114898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f114899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f114900c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<c> f114901d;

    public h(mt2.f fVar, boolean z14, d dVar, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? mt2.f.STATUTE_US : fVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? null : dVar, (i14 & 8) != 0 ? j0.f134944a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f114898a == hVar.f114898a && this.f114899b == hVar.f114899b && s.g(this.f114900c, hVar.f114900c) && s.g(this.f114901d, hVar.f114901d);
    }

    public final int hashCode() {
        int iG = q6.f.g(this.f114898a.hashCode() * 31, 31, this.f114899b);
        d dVar = this.f114900c;
        return this.f114901d.hashCode() + ((iG + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    public final String toString() {
        return "UserSettings(measurementSystem=" + this.f114898a + ", isWheelchairModeOn=" + this.f114899b + ", powerZones=" + this.f114900c + ", powerCurves=" + this.f114901d + ")";
    }

    public h(mt2.f fVar, boolean z14, d dVar, List<c> list) {
        fVar.getClass();
        list.getClass();
        this.f114898a = fVar;
        this.f114899b = z14;
        this.f114900c = dVar;
        this.f114901d = list;
    }

    public h() {
        this(null, false, null, null, 15, null);
    }
}
