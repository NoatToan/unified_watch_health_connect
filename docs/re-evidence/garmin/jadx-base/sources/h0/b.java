package h0;

import android.util.Size;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class b extends s.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f80449f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f80450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<Integer> f80451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f80452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0.p0 f80453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e0 f80454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0.f<j0> f80455l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r0.f<p0.a> f80456m;

    public b(Size size, int i14, List<Integer> list, boolean z14, b0.p0 p0Var, e0 e0Var, r0.f<j0> fVar, r0.f<p0.a> fVar2) {
        if (size == null) {
            j20.x.l("Null size");
            throw null;
        }
        this.f80449f = size;
        this.f80450g = i14;
        if (list == null) {
            j20.x.l("Null outputFormats");
            throw null;
        }
        this.f80451h = list;
        this.f80452i = z14;
        this.f80453j = p0Var;
        this.f80454k = e0Var;
        if (fVar == null) {
            j20.x.l("Null requestEdge");
            throw null;
        }
        this.f80455l = fVar;
        if (fVar2 != null) {
            this.f80456m = fVar2;
        } else {
            j20.x.l("Null errorEdge");
            throw null;
        }
    }

    @Override // h0.s.b
    public final r0.f<p0.a> a() {
        return this.f80456m;
    }

    @Override // h0.s.b
    public final b0.p0 b() {
        return this.f80453j;
    }

    @Override // h0.s.b
    public final int c() {
        return this.f80450g;
    }

    @Override // h0.s.b
    public final List<Integer> d() {
        return this.f80451h;
    }

    @Override // h0.s.b
    public final e0 e() {
        return this.f80454k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s.b)) {
            return false;
        }
        s.b bVar = (s.b) obj;
        if (!this.f80449f.equals(bVar.g()) || this.f80450g != bVar.c() || !this.f80451h.equals(bVar.d()) || this.f80452i != bVar.h()) {
            return false;
        }
        b0.p0 p0Var = this.f80453j;
        if (p0Var == null) {
            if (bVar.b() != null) {
                return false;
            }
        } else if (!p0Var.equals(bVar.b())) {
            return false;
        }
        e0 e0Var = this.f80454k;
        if (e0Var == null) {
            if (bVar.e() != null) {
                return false;
            }
        } else if (!e0Var.equals(bVar.e())) {
            return false;
        }
        return this.f80455l.equals(bVar.f()) && this.f80456m.equals(bVar.a());
    }

    @Override // h0.s.b
    public final r0.f<j0> f() {
        return this.f80455l;
    }

    @Override // h0.s.b
    public final Size g() {
        return this.f80449f;
    }

    @Override // h0.s.b
    public final boolean h() {
        return this.f80452i;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f80449f.hashCode() ^ 1000003) * 1000003) ^ this.f80450g) * 1000003) ^ this.f80451h.hashCode()) * 1000003) ^ (this.f80452i ? 1231 : 1237)) * 1000003;
        b0.p0 p0Var = this.f80453j;
        int iHashCode2 = (iHashCode ^ (p0Var == null ? 0 : p0Var.hashCode())) * 1000003;
        e0 e0Var = this.f80454k;
        return ((((iHashCode2 ^ (e0Var != null ? e0Var.hashCode() : 0)) * 1000003) ^ this.f80455l.hashCode()) * 1000003) ^ this.f80456m.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f80449f + ", inputFormat=" + this.f80450g + ", outputFormats=" + this.f80451h + ", virtualCamera=" + this.f80452i + ", imageReaderProxyProvider=" + this.f80453j + ", postviewSettings=" + this.f80454k + ", requestEdge=" + this.f80455l + ", errorEdge=" + this.f80456m + StringSubstitutor.DEFAULT_VAR_END;
    }
}
