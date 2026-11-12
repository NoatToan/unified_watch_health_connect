package s0;

import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import r0.o;
import u62.z;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f155253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f155254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<d> f155255c;

    public b(o oVar, o oVar2, List<d> list) {
        if (oVar == null) {
            x.l("Null primarySurfaceEdge");
            throw null;
        }
        this.f155253a = oVar;
        if (oVar2 == null) {
            x.l("Null secondarySurfaceEdge");
            throw null;
        }
        this.f155254b = oVar2;
        if (list != null) {
            this.f155255c = list;
        } else {
            x.l("Null outConfigs");
            throw null;
        }
    }

    @Override // s0.f.b
    public final List<d> a() {
        return this.f155255c;
    }

    @Override // s0.f.b
    public final o b() {
        return this.f155253a;
    }

    @Override // s0.f.b
    public final o c() {
        return this.f155254b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f.b)) {
            return false;
        }
        f.b bVar = (f.b) obj;
        return this.f155253a.equals(bVar.b()) && this.f155254b.equals(bVar.c()) && this.f155255c.equals(bVar.a());
    }

    public final int hashCode() {
        return ((((this.f155253a.hashCode() ^ 1000003) * 1000003) ^ this.f155254b.hashCode()) * 1000003) ^ this.f155255c.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{primarySurfaceEdge=");
        sb3.append(this.f155253a);
        sb3.append(", secondarySurfaceEdge=");
        sb3.append(this.f155254b);
        sb3.append(", outConfigs=");
        return z.c(sb3, this.f155255c, StringSubstitutor.DEFAULT_VAR_END);
    }
}
