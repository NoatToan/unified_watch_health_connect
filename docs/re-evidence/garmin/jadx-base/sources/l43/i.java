package l43;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u33.d f110023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s33.c f110024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u33.a f110025c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t23.y0 f110026d;

    public i(u33.d dVar, s33.c cVar, u33.a aVar, t23.y0 y0Var) {
        dVar.getClass();
        cVar.getClass();
        aVar.getClass();
        y0Var.getClass();
        this.f110023a = dVar;
        this.f110024b = cVar;
        this.f110025c = aVar;
        this.f110026d = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f110023a.equals(iVar.f110023a) && this.f110024b.equals(iVar.f110024b) && this.f110025c.equals(iVar.f110025c) && this.f110026d.equals(iVar.f110026d);
    }

    public final int hashCode() {
        return this.f110026d.hashCode() + ((this.f110025c.hashCode() + ((this.f110024b.hashCode() + (this.f110023a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f110023a + ", classProto=" + this.f110024b + ", metadataVersion=" + this.f110025c + ", sourceElement=" + this.f110026d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
