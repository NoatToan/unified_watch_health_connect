package a6;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import lc.u0;
import o4.d0;
import o4.d1;
import o4.e1;
import o4.f0;
import o4.p1;
import o4.q1;
import o4.t1;
import o4.w;
import p005kotlin.Metadata;
import p3.p0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"La6/h;", "Landroid/text/TextPaint;", "", "flags", "", "density", "<init>", "(IF)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends TextPaint {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f1500j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o4.h f1501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d6.i f1502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public q1 f1504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f1505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f1506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p3.d0 f1507g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n4.g f1508h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q4.g f1509i;

    public h(int i14, float f14) {
        super(i14);
        ((TextPaint) this).density = f14;
        d6.i.f57760b.getClass();
        this.f1502b = d6.i.f57761c;
        q4.f.f142555o0.getClass();
        this.f1503c = q4.f.a.f142557b;
        q1.f128956d.getClass();
        this.f1504d = q1.f128957e;
    }

    public final d1 a() {
        o4.h hVar = this.f1501a;
        if (hVar != null) {
            return hVar;
        }
        o4.h hVar2 = new o4.h(this);
        this.f1501a = hVar2;
        return hVar2;
    }

    public final void b(int i14) {
        int i15 = this.f1503c;
        o4.q.a aVar = o4.q.f128930b;
        if (i14 == i15) {
            return;
        }
        ((o4.h) a()).k(i14);
        this.f1503c = i14;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    public final void c(w wVar, long j8, float f14) {
        if (wVar == null) {
            this.f1507g = null;
            this.f1506f = null;
            this.f1508h = null;
            setShader(null);
            return;
        }
        if (wVar instanceof t1) {
            d(d6.k.a(f14, ((t1) wVar).f129007b));
            return;
        }
        if (!(wVar instanceof p1)) {
            u0.r();
            return;
        }
        if (p005kotlin.jvm.internal.s.g(this.f1506f, wVar)) {
            n4.g gVar = this.f1508h;
            if (!(gVar == null ? false : n4.g.c(gVar.f123561a, j8))) {
                if (j8 != 9205357640488583168L) {
                    this.f1506f = wVar;
                    this.f1508h = n4.g.a(j8);
                    this.f1507g = p0.f(new g(wVar, j8, 0));
                }
            }
        } else {
            if (j8 != 9205357640488583168L) {
                this.f1506f = wVar;
                this.f1508h = n4.g.a(j8);
                this.f1507g = p0.f(new g(wVar, j8, 0));
            }
        }
        d1 d1VarA = a();
        p3.d0 d0Var = this.f1507g;
        ((o4.h) d1VarA).g(d0Var != null ? (Shader) d0Var.getF182175a() : null);
        this.f1505e = null;
        lg.d.G(this, f14);
    }

    public final void d(long j8) {
        d0 d0Var = this.f1505e;
        if (d0Var == null ? false : d0.d(d0Var.f128833a, j8)) {
            return;
        }
        if (j8 != 16) {
            this.f1505e = d0.a(j8);
            setColor(f0.j(j8));
            this.f1507g = null;
            this.f1506f = null;
            this.f1508h = null;
            setShader(null);
        }
    }

    public final void e(q4.g gVar) {
        if (gVar == null || p005kotlin.jvm.internal.s.g(this.f1509i, gVar)) {
            return;
        }
        this.f1509i = gVar;
        if (gVar.equals(q4.j.f142560a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(gVar instanceof q4.k)) {
            u0.r();
            return;
        }
        d1 d1VarA = a();
        e1.f128845b.getClass();
        ((o4.h) d1VarA).r(e1.f128846c);
        q4.k kVar = (q4.k) gVar;
        ((o4.h) a()).q(kVar.f142562a);
        ((o4.h) a()).p(kVar.f142563b);
        ((o4.h) a()).o(kVar.f142565d);
        ((o4.h) a()).n(kVar.f142564c);
        ((o4.h) a()).m(kVar.f142566e);
    }

    public final void f(q1 q1Var) {
        if (q1Var == null || p005kotlin.jvm.internal.s.g(this.f1504d, q1Var)) {
            return;
        }
        this.f1504d = q1Var;
        q1.f128956d.getClass();
        if (q1Var.equals(q1.f128957e)) {
            clearShadowLayer();
            return;
        }
        q1 q1Var2 = this.f1504d;
        float f14 = q1Var2.f128960c;
        if (f14 == 0.0f) {
            f14 = Float.MIN_VALUE;
        }
        setShadowLayer(f14, Float.intBitsToFloat((int) (q1Var2.f128959b >> 32)), Float.intBitsToFloat((int) (this.f1504d.f128959b & 4294967295L)), f0.j(this.f1504d.f128958a));
    }

    public final void g(d6.i iVar) {
        if (iVar == null || p005kotlin.jvm.internal.s.g(this.f1502b, iVar)) {
            return;
        }
        this.f1502b = iVar;
        d6.i.a aVar = d6.i.f57760b;
        aVar.getClass();
        setUnderlineText(iVar.a(d6.i.f57762d));
        d6.i iVar2 = this.f1502b;
        aVar.getClass();
        setStrikeThruText(iVar2.a(d6.i.f57763e));
    }
}
