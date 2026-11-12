package h2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lh2/x;", "Lg2/i0;", "Lh2/j0;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lg2/u;", "Lh2/p;", "intervalContent", "Lg2/k0;", "keyIndexMap", "<init>", "(Lh2/j0;Lg2/u;Lg2/k0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x implements g2.i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f81021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g2.u<p> f81022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g2.k0 f81023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d0 f81024d = d0.f80893a;

    public x(j0 j0Var, g2.u<p> uVar, g2.k0 k0Var) {
        this.f81021a = j0Var;
        this.f81022b = uVar;
        this.f81023c = k0Var;
    }

    @Override // g2.i0
    public final int a(Object obj) {
        return this.f81023c.a(obj);
    }

    @Override // g2.i0
    public final void e(int i14, Object obj, p3.m mVar, int i15) {
        p3.o0 o0VarE = mVar.E(-1201380429);
        int i16 = (o0VarE.k(i14) ? 4 : 2) | i15 | (o0VarE.r(obj) ? 32 : 16) | (o0VarE.B(this) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            g2.p.a(obj, i14, this.f81021a.E, z3.f.c(1142237095, new a03.k(this, i14, 27), o0VarE), o0VarE, ((i16 >> 3) & 14) | 3072 | ((i16 << 3) & 112));
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f2.o(this, i14, obj, i15, 14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        return p005kotlin.jvm.internal.s.g(this.f81022b, ((x) obj).f81022b);
    }

    @Override // g2.i0
    public final int getItemCount() {
        return this.f81022b.getF81020c().f75198b;
    }

    @Override // g2.i0
    public final Object getKey(int i14) {
        Object key = this.f81023c.getKey(i14);
        return key == null ? this.f81022b.n(i14) : key;
    }

    public final int hashCode() {
        return this.f81022b.hashCode();
    }
}
