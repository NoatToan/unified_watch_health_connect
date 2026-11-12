package jv1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ljv1/g;", "Ljv1/h;", "Lvt1/n;", "distance", "Lgg0/i;", "distanceUnit", "", "distanceValue", "<init>", "(Lvt1/n;Lgg0/i;Ljava/lang/Double;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt1.n f101054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg0.i f101055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f101056e;

    public /* synthetic */ g(vt1.n nVar, gg0.i iVar, Double d14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : nVar, (i14 & 2) != 0 ? null : iVar, (i14 & 4) != 0 ? null : d14);
    }

    public final double a() {
        og0.a aVar = og0.a.f131967a;
        Double d14 = this.f101057a;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        gg0.i iVar = this.f101058b;
        if (iVar == null) {
            iVar = gg0.i.METER;
        }
        aVar.getClass();
        return og0.a.g(dDoubleValue, iVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f101054c == gVar.f101054c && this.f101055d == gVar.f101055d && p005kotlin.jvm.internal.s.g(this.f101056e, gVar.f101056e);
    }

    public final int hashCode() {
        vt1.n nVar = this.f101054c;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        gg0.i iVar = this.f101055d;
        int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
        Double d14 = this.f101056e;
        return iHashCode2 + (d14 != null ? d14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FBTADistance(distance=");
        sb3.append(this.f101054c);
        sb3.append(", distanceUnit=");
        sb3.append(this.f101055d);
        sb3.append(", distanceValue=");
        return b71.i.g(sb3, this.f101056e, ")");
    }

    public g(vt1.n nVar, gg0.i iVar, Double d14) {
        super(d14, iVar, null);
        this.f101054c = nVar;
        this.f101055d = iVar;
        this.f101056e = d14;
    }

    public g() {
        this(null, null, null, 7, null);
    }
}
