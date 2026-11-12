package e2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le2/p;", "Le2/o;", "Le2/i0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Le2/m;", "intervalContent", "Le2/e;", "itemScope", "Lg2/k0;", "keyIndexMap", "<init>", "(Le2/i0;Le2/m;Le2/e;Lg2/k0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f62492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f62493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f62494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g2.k0 f62495d;

    public p(i0 i0Var, m mVar, e eVar, g2.k0 k0Var) {
        this.f62492a = i0Var;
        this.f62493b = mVar;
        this.f62494c = eVar;
        this.f62495d = k0Var;
    }

    @Override // g2.i0
    public final int a(Object obj) {
        return this.f62495d.a(obj);
    }

    @Override // e2.o
    public final p1.h0 b() {
        p1.h0 h0Var = this.f62493b.f62488b;
        return h0Var != null ? h0Var : p1.m.f134768a;
    }

    @Override // e2.o
    /* JADX INFO: renamed from: c, reason: from getter */
    public final g2.k0 getF62495d() {
        return this.f62495d;
    }

    @Override // e2.o
    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getF62494c() {
        return this.f62494c;
    }

    @Override // g2.i0
    public final void e(int i14, Object obj, p3.m mVar, int i15) {
        o0 o0VarE = mVar.E(-462424778);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(obj) ? 32 : 16) | (o0VarE.B(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            g2.p.a(obj, i14, this.f62492a.f62451r, z3.f.c(-824725566, new a03.k(this, i14, 18), o0VarE), o0VarE, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(this, i14, obj, i15, 26);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f62493b, ((p) obj).f62493b);
    }

    @Override // g2.i0
    public final Object f(int i14) {
        g2.j jVarB = this.f62493b.getF81020c().b(i14);
        return ((g2.u.a) jVarB.f75140c).getType().invoke(Integer.valueOf(i14 - jVarB.f75138a));
    }

    @Override // g2.i0
    public final int getItemCount() {
        return this.f62493b.getF81020c().f75198b;
    }

    @Override // g2.i0
    public final Object getKey(int i14) {
        Object key = this.f62495d.getKey(i14);
        return key == null ? this.f62493b.n(i14) : key;
    }

    public final int hashCode() {
        return this.f62493b.hashCode();
    }
}
