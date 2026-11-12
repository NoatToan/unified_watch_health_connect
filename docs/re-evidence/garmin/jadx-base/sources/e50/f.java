package e50;

import k30.q;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Le50/f;", "", "Lk30/q;", "chartData", "Li53/f;", "Lr30/b;", "availableChips", "Lr30/a;", "selOverlayType", "<init>", "(Lk30/q;Li53/f;Lr30/a;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f63003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i53.f<r30.b> f63004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r30.a f63005c;

    public f(q qVar, i53.f<r30.b> fVar, r30.a aVar) {
        fVar.getClass();
        this.f63003a = qVar;
        this.f63004b = fVar;
        this.f63005c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f63003a, fVar.f63003a) && s.g(this.f63004b, fVar.f63004b) && this.f63005c == fVar.f63005c;
    }

    public final int hashCode() {
        q qVar = this.f63003a;
        int iHashCode = (this.f63004b.hashCode() + ((qVar == null ? 0 : qVar.hashCode()) * 31)) * 31;
        r30.a aVar = this.f63005c;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CourseElevationUIState(chartData=" + this.f63003a + ", availableChips=" + this.f63004b + ", selOverlayType=" + this.f63005c + ")";
    }

    public /* synthetic */ f(q qVar, i53.f fVar, r30.a aVar, int i14, j jVar) {
        this(qVar, fVar, (i14 & 4) != 0 ? null : aVar);
    }
}
