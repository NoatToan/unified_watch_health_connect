package r0;

import j20.x;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import u62.z;

/* JADX INFO: loaded from: classes.dex */
public final class c extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f148700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<t0.f> f148701b;

    public c(o oVar, List<t0.f> list) {
        if (oVar == null) {
            x.l("Null surfaceEdge");
            throw null;
        }
        this.f148700a = oVar;
        if (list != null) {
            this.f148701b = list;
        } else {
            x.l("Null outConfigs");
            throw null;
        }
    }

    @Override // r0.r.b
    public final List<t0.f> a() {
        return this.f148701b;
    }

    @Override // r0.r.b
    public final o b() {
        return this.f148700a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r.b)) {
            return false;
        }
        r.b bVar = (r.b) obj;
        return this.f148700a.equals(bVar.b()) && this.f148701b.equals(bVar.a());
    }

    public final int hashCode() {
        return ((this.f148700a.hashCode() ^ 1000003) * 1000003) ^ this.f148701b.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("In{surfaceEdge=");
        sb3.append(this.f148700a);
        sb3.append(", outConfigs=");
        return z.c(sb3, this.f148701b, StringSubstitutor.DEFAULT_VAR_END);
    }
}
