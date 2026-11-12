package v2;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p006l2.s2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/b;", "Lv2/b1;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b extends b1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o53.l1 f174884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e1 f174885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r53.e2 f174886d;

    @Override // x5.g0
    public final void a(n4.d dVar) {
        Rect rect;
        e1 e1Var = this.f174885c;
        if (e1Var != null) {
            e1Var.f174971l = new Rect(MathKt.c(dVar.f123547a), MathKt.c(dVar.f123548b), MathKt.c(dVar.f123549c), MathKt.c(dVar.f123550d));
            if (!e1Var.f174969j.isEmpty() || (rect = e1Var.f174971l) == null) {
                return;
            }
            e1Var.f174960a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // x5.g0
    public final void b() {
        o53.l1 l1Var = this.f174884b;
        if (l1Var != null) {
            l1Var.c(null);
        }
        this.f174884b = null;
        r53.y1<Unit> y1VarK = k();
        if (y1VarK != null) {
            ((r53.e2) y1VarK).c();
        }
    }

    @Override // x5.g0
    public final void c(x5.l0 l0Var, x5.l0 l0Var2) {
        e1 e1Var = this.f174885c;
        if (e1Var != null) {
            boolean z14 = (s5.w0.d(e1Var.f174967h.f188879b, l0Var2.f188879b) && p005kotlin.jvm.internal.s.g(e1Var.f174967h.f188880c, l0Var2.f188880c)) ? false : true;
            e1Var.f174967h = l0Var2;
            int size = e1Var.f174969j.size();
            for (int i14 = 0; i14 < size; i14++) {
                i1 i1Var = (i1) ((WeakReference) e1Var.f174969j.get(i14)).get();
                if (i1Var != null) {
                    i1Var.f175053g = l0Var2;
                }
            }
            a1 a1Var = e1Var.f174972m;
            synchronized (a1Var.f174861c) {
                a1Var.f174868j = null;
                a1Var.f174870l = null;
                a1Var.f174869k = null;
                a1Var.f174871m = null;
                a1Var.f174872n = null;
                Unit unit = Unit.INSTANCE;
            }
            if (p005kotlin.jvm.internal.s.g(l0Var, l0Var2)) {
                if (z14) {
                    u0 u0Var = e1Var.f174961b;
                    int iH = s5.w0.h(l0Var2.f188879b);
                    int iG = s5.w0.g(l0Var2.f188879b);
                    s5.w0 w0Var = e1Var.f174967h.f188880c;
                    int iH2 = w0Var != null ? s5.w0.h(w0Var.f157317a) : -1;
                    s5.w0 w0Var2 = e1Var.f174967h.f188880c;
                    u0Var.a(iH, iG, iH2, w0Var2 != null ? s5.w0.g(w0Var2.f157317a) : -1);
                    return;
                }
                return;
            }
            if (l0Var != null && (!p005kotlin.jvm.internal.s.g(l0Var.f188878a.f157138b, l0Var2.f188878a.f157138b) || (s5.w0.d(l0Var.f188879b, l0Var2.f188879b) && !p005kotlin.jvm.internal.s.g(l0Var.f188880c, l0Var2.f188880c)))) {
                e1Var.f174961b.b();
                return;
            }
            int size2 = e1Var.f174969j.size();
            for (int i15 = 0; i15 < size2; i15++) {
                i1 i1Var2 = (i1) ((WeakReference) e1Var.f174969j.get(i15)).get();
                if (i1Var2 != null) {
                    x5.l0 l0Var3 = e1Var.f174967h;
                    u0 u0Var2 = e1Var.f174961b;
                    if (i1Var2.f175057k) {
                        i1Var2.f175053g = l0Var3;
                        if (i1Var2.f175055i) {
                            u0Var2.updateExtractedText(i1Var2.f175054h, i.b(l0Var3));
                        }
                        s5.w0 w0Var3 = l0Var3.f188880c;
                        long j8 = l0Var3.f188879b;
                        int iH3 = w0Var3 != null ? s5.w0.h(w0Var3.f157317a) : -1;
                        s5.w0 w0Var4 = l0Var3.f188880c;
                        u0Var2.a(s5.w0.h(j8), s5.w0.g(j8), iH3, w0Var4 != null ? s5.w0.g(w0Var4.f157317a) : -1);
                    }
                }
            }
        }
    }

    @Override // x5.g0
    public final void d(x5.l0 l0Var, x5.c0 c0Var, s5.q0 q0Var, s2 s2Var, n4.d dVar, n4.d dVar2) {
        e1 e1Var = this.f174885c;
        if (e1Var != null) {
            a1 a1Var = e1Var.f174972m;
            synchronized (a1Var.f174861c) {
                try {
                    a1Var.f174868j = l0Var;
                    a1Var.f174870l = c0Var;
                    a1Var.f174869k = q0Var;
                    a1Var.f174871m = dVar;
                    a1Var.f174872n = dVar2;
                    if (a1Var.f174863e || a1Var.f174862d) {
                        a1Var.a();
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // x5.g0
    public final void e() {
        b1.a aVar = this.f174890a;
        if (aVar == null) {
            return;
        }
        this.f174884b = aVar.B1(new a(null, this, aVar, null));
    }

    @Override // x5.g0
    public final void g(x5.l0 l0Var, x5.q qVar, k62.k kVar, e23.l lVar) {
        ug2.q qVar2 = new ug2.q(l0Var, this, qVar, kVar, lVar, 3);
        b1.a aVar = this.f174890a;
        if (aVar == null) {
            return;
        }
        this.f174884b = aVar.B1(new a(qVar2, this, aVar, null));
    }

    @Override // v2.b1
    public final void i() {
        r53.y1<Unit> y1VarK = k();
        if (y1VarK != null) {
            ((r53.e2) y1VarK).d(Unit.INSTANCE);
        }
    }

    public final r53.y1<Unit> k() {
        r53.e2 e2Var = this.f174886d;
        if (e2Var != null) {
            return e2Var;
        }
        if (!t2.d.f161762a) {
            return null;
        }
        r53.e2 e2VarB = r53.g2.b(1, 0, q53.a.DROP_LATEST, 2);
        this.f174886d = e2VarB;
        return e2VarB;
    }
}
