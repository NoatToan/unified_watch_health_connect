package w5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw5/s;", "Lw5/q$b;", "Lw5/l0;", "platformFontLoader", "Lw5/m0;", "platformResolveInterceptor", "Lw5/v0;", "typefaceRequestCache", "Lw5/x;", "fontListFontFamilyTypefaceAdapter", "Lw5/k0;", "platformFamilyTypefaceAdapter", "<init>", "(Lw5/l0;Lw5/m0;Lw5/v0;Lw5/x;Lw5/k0;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements q.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f182155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f182156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f182157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f182158d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f182159e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vu1.b f182160f;

    /* JADX WARN: Illegal instructions before constructor call */
    public s(l0 l0Var, m0 m0Var, v0 v0Var, x xVar, k0 k0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 2) != 0) {
            m0.f182140a.getClass();
            m0Var = m0.a.f182142b;
        }
        this(l0Var, m0Var, (i14 & 4) != 0 ? t.f182163a : v0Var, (i14 & 8) != 0 ? new x(t.f182164b, null, 2, null) : xVar, (i14 & 16) != 0 ? new k0() : k0Var);
    }

    @Override // w5.q.b
    public final w0 a(q qVar, f0 f0Var, int i14, int i15) {
        m0 m0Var = this.f182156b;
        m0Var.getClass();
        m0.a aVar = m0.f182140a;
        return b(new u0(qVar, m0Var.a(f0Var), i14, i15, this.f182155a.getF182139b(), null));
    }

    public final w0 b(u0 u0Var) {
        v0 v0Var = this.f182157c;
        w02.b bVar = new w02.b(9, this, u0Var);
        synchronized (v0Var.f182171a) {
            w0 w0Var = v0Var.f182172b.get(u0Var);
            if (w0Var != null) {
                if (w0Var.getF182176b()) {
                    return w0Var;
                }
                v0Var.f182172b.remove(u0Var);
            }
            try {
                w0 w0Var2 = (w0) bVar.invoke(new w02.b(10, v0Var, u0Var));
                synchronized (v0Var.f182171a) {
                    try {
                        if (v0Var.f182172b.get(u0Var) == null && w0Var2.getF182176b()) {
                            v0Var.f182172b.put(u0Var, w0Var2);
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return w0Var2;
            } catch (Exception e4) {
                com.airbnb.lottie.animation.keyframe.a.x("Could not load font", e4);
                return null;
            }
        }
    }

    public s(l0 l0Var, m0 m0Var, v0 v0Var, x xVar, k0 k0Var) {
        this.f182155a = l0Var;
        this.f182156b = m0Var;
        this.f182157c = v0Var;
        this.f182158d = xVar;
        this.f182159e = k0Var;
        this.f182160f = new vu1.b(this, 9);
    }
}
