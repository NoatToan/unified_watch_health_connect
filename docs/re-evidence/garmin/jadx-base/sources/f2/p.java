package f2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf2/p;", "Lf2/n;", "Lf2/p0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lf2/l;", "intervalContent", "Lg2/k0;", "keyIndexMap", "<init>", "(Lf2/p0;Lf2/l;Lg2/k0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f68256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f68257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.k0 f68258c;

    public p(p0 p0Var, l lVar, g2.k0 k0Var) {
        this.f68256a = p0Var;
        this.f68257b = lVar;
        this.f68258c = k0Var;
    }

    @Override // g2.i0
    public final int a(Object obj) {
        return this.f68258c.a(obj);
    }

    @Override // f2.n
    public final p1.h0 b() {
        this.f68257b.getClass();
        return p1.m.f134768a;
    }

    @Override // f2.n
    /* JADX INFO: renamed from: c, reason: from getter */
    public final g2.k0 getF68258c() {
        return this.f68258c;
    }

    @Override // g2.i0
    public final void e(int i14, Object obj, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(1493551140);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(obj) ? 32 : 16) | (o0VarE.B(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            g2.p.a(obj, i14, this.f68256a.f68277q, z3.f.c(726189336, new a03.k(this, i14, 19), o0VarE), o0VarE, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, i14, obj, i15, 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f68257b, ((p) obj).f68257b);
    }

    @Override // g2.i0
    public final Object f(int i14) {
        g2.j jVarB = this.f68257b.getF81020c().b(i14);
        return ((g2.u.a) jVarB.f75140c).getType().invoke(Integer.valueOf(i14 - jVarB.f75138a));
    }

    @Override // f2.n
    public final n0 g() {
        return this.f68257b.f68230a;
    }

    @Override // g2.i0
    public final int getItemCount() {
        return this.f68257b.getF81020c().f75198b;
    }

    @Override // g2.i0
    public final Object getKey(int i14) {
        Object key = this.f68258c.getKey(i14);
        return key == null ? this.f68257b.n(i14) : key;
    }

    public final int hashCode() {
        return this.f68257b.hashCode();
    }
}
