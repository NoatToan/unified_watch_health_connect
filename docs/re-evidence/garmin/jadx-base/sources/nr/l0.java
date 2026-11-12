package nr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/l0;", "", "Lr22/p;", "data", "Lkotlin/Function0;", "", "onClick", "<init>", "(Lr22/p;Le23/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r22.p f127250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f127251b;

    public l0(r22.p pVar, e23.a<Unit> aVar) {
        pVar.getClass();
        this.f127250a = pVar;
        this.f127251b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return p005kotlin.jvm.internal.s.g(this.f127250a, l0Var.f127250a) && p005kotlin.jvm.internal.s.g(this.f127251b, l0Var.f127251b);
    }

    public final int hashCode() {
        int iHashCode = this.f127250a.hashCode() * 31;
        e23.a<Unit> aVar = this.f127251b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "OverviewStat(data=" + this.f127250a + ", onClick=" + this.f127251b + ")";
    }

    public /* synthetic */ l0(r22.p pVar, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(pVar, (i14 & 2) != 0 ? null : aVar);
    }
}
