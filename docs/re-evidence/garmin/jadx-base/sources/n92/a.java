package n92;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln92/a;", "", "Ln92/o;", "yAxisStartCreator", "yAxisEndCreator", "Ln92/p;", "yAxisRenderer", "Ln92/n;", "xAxisRenderer", "<init>", "(Ln92/o;Ln92/o;Ln92/p;Ln92/n;)V", "lib_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f125056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f125057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f125058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f125059d;

    public /* synthetic */ a(o oVar, o oVar2, p pVar, n nVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : oVar, (i14 & 2) != 0 ? null : oVar2, (i14 & 4) != 0 ? null : pVar, (i14 & 8) != 0 ? null : nVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f125056a, aVar.f125056a) && s.g(this.f125057b, aVar.f125057b) && s.g(this.f125058c, aVar.f125058c) && s.g(this.f125059d, aVar.f125059d);
    }

    public final int hashCode() {
        o oVar = this.f125056a;
        int iHashCode = (oVar == null ? 0 : oVar.hashCode()) * 31;
        o oVar2 = this.f125057b;
        int iHashCode2 = (iHashCode + (oVar2 == null ? 0 : oVar2.hashCode())) * 31;
        p pVar = this.f125058c;
        int iHashCode3 = (iHashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        n nVar = this.f125059d;
        return iHashCode3 + (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "AxisConfig(yAxisStartCreator=" + this.f125056a + ", yAxisEndCreator=" + this.f125057b + ", yAxisRenderer=" + this.f125058c + ", xAxisRenderer=" + this.f125059d + ")";
    }

    public a(o oVar, o oVar2, p pVar, n nVar) {
        this.f125056a = oVar;
        this.f125057b = oVar2;
        this.f125058c = pVar;
        this.f125059d = nVar;
    }

    public a() {
        this(null, null, null, null, 15, null);
    }
}
