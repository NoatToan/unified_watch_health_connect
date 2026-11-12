package p006l2;

import f5.c0;
import g6.f;
import kn1.m;
import kotlin.m3;
import o4.d0;
import o4.h;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.o2;
import s5.c;
import s5.w0;
import x5.l;
import x5.l0;
import x5.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ll2/b2;", "", "Ll2/n2;", "textDelegate", "Lp3/o2;", "recomposeScope", "Li5/m3;", "keyboardController", "<init>", "(Ll2/n2;Lp3/o2;Li5/m3;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b2 {
    public final c2 A;
    public final c2 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n2 f108391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o2 f108392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m3 f108393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f108394d = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p0 f108395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c2 f108396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f108397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c0 f108398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c2 f108399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c f108400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c2 f108401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f108402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f108403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f108404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f108405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f108406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c2 f108407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x1 f108408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f108409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c2 f108410t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public e23.l<? super l0, Unit> f108411u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x0 f108412v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final x0 f108413w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final x0 f108414x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final h f108415y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f108416z;

    public b2(n2 n2Var, o2 o2Var, m3 m3Var) {
        this.f108391a = n2Var;
        this.f108392b = o2Var;
        this.f108393c = m3Var;
        Boolean bool = Boolean.FALSE;
        this.f108396f = p3.p0.n(bool);
        this.f108397g = p3.p0.n(f.a(0));
        this.f108399i = p3.p0.n(null);
        this.f108401k = p3.p0.n(m1.None);
        this.f108402l = p3.p0.n(bool);
        this.f108403m = p3.p0.n(bool);
        this.f108404n = p3.p0.n(bool);
        this.f108405o = p3.p0.n(bool);
        this.f108406p = true;
        this.f108407q = p3.p0.n(Boolean.TRUE);
        this.f108408r = new x1(m3Var);
        this.f108409s = p3.p0.n(bool);
        this.f108410t = p3.p0.n(bool);
        this.f108411u = new m(25);
        this.f108412v = new x0(this, 2);
        this.f108413w = new x0(this, 3);
        this.f108414x = new x0(this, 4);
        this.f108415y = new h();
        d0.f128823b.getClass();
        this.f108416z = d0.f128832k;
        w0.f157315b.getClass();
        long j8 = w0.f157316c;
        this.A = p3.p0.n(w0.a(j8));
        this.B = p3.p0.n(w0.a(j8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m1 a() {
        return (m1) this.f108401k.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f108396f.getF182175a()).booleanValue();
    }

    public final c0 c() {
        c0 c0Var = this.f108398h;
        if (c0Var == null || !c0Var.isAttached()) {
            return null;
        }
        return c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i3 d() {
        return (i3) this.f108399i.getF182175a();
    }
}
