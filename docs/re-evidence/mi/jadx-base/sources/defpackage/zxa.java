package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.generic.a;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class zxa implements k0m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f41771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f41772b;
    public RoundingParams c;
    public final cxk d;
    public final y79 e;
    public final m1a f;

    public zxa(aya ayaVar) {
        int i = 0;
        ColorDrawable colorDrawable = new ColorDrawable(0);
        this.f41771a = colorDrawable;
        if (epa.d()) {
            epa.a("GenericDraweeHierarchy()");
        }
        this.f41772b = ayaVar.p();
        this.c = ayaVar.s();
        m1a m1aVar = new m1a(colorDrawable);
        this.f = m1aVar;
        int i2 = 1;
        int size = (ayaVar.j() != null ? ayaVar.j().size() : 1) + (ayaVar.m() != null ? 1 : 0);
        Drawable[] drawableArr = new Drawable[size + 6];
        drawableArr[0] = g(ayaVar.e(), null);
        drawableArr[1] = g(ayaVar.k(), ayaVar.l());
        drawableArr[2] = f(m1aVar, ayaVar.d(), ayaVar.c(), ayaVar.b());
        drawableArr[3] = g(ayaVar.n(), ayaVar.o());
        drawableArr[4] = g(ayaVar.q(), ayaVar.r());
        drawableArr[5] = g(ayaVar.h(), ayaVar.i());
        if (size > 0) {
            if (ayaVar.j() != null) {
                Iterator<Drawable> it = ayaVar.j().iterator();
                while (it.hasNext()) {
                    drawableArr[i + 6] = g(it.next(), null);
                    i++;
                }
                i2 = i;
            }
            if (ayaVar.m() != null) {
                drawableArr[i2 + 6] = g(ayaVar.m(), null);
            }
        }
        y79 y79Var = new y79(drawableArr);
        this.e = y79Var;
        y79Var.r(ayaVar.g());
        cxk cxkVar = new cxk(a.e(y79Var, this.c));
        this.d = cxkVar;
        cxkVar.mutate();
        o();
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.k0m
    public void a(Throwable th) {
        this.e.h();
        i();
        if (this.e.b(4) != null) {
            h(4);
        } else {
            h(1);
        }
        this.e.k();
    }

    @Override // defpackage.h57
    public Drawable b() {
        return this.d;
    }

    @Override // defpackage.k0m
    public void c(Drawable drawable) {
        this.d.p(drawable);
    }

    @Override // defpackage.k0m
    public void d(float f, boolean z) {
        if (this.e.b(3) == null) {
            return;
        }
        this.e.h();
        u(f);
        if (z) {
            this.e.o();
        }
        this.e.k();
    }

    @Override // defpackage.k0m
    public void e(Drawable drawable, float f, boolean z) {
        Drawable drawableD = a.d(drawable, this.c, this.f41772b);
        drawableD.mutate();
        this.f.h(drawableD);
        this.e.h();
        i();
        h(2);
        u(f);
        if (z) {
            this.e.o();
        }
        this.e.k();
    }

    public final Drawable f(Drawable drawable, rbl.b bVar, PointF pointF, ColorFilter colorFilter) {
        drawable.setColorFilter(colorFilter);
        return a.g(drawable, bVar, pointF);
    }

    public final Drawable g(Drawable drawable, rbl.b bVar) {
        return a.f(a.d(drawable, this.c, this.f41772b), bVar);
    }

    public final void h(int i) {
        if (i >= 0) {
            this.e.m(i);
        }
    }

    public final void i() {
        j(1);
        j(2);
        j(3);
        j(4);
        j(5);
    }

    public final void j(int i) {
        if (i >= 0) {
            this.e.n(i);
        }
    }

    public final o47 k(int i) {
        o47 o47VarC = this.e.c(i);
        if (o47VarC.getDrawable() instanceof u8f) {
            o47VarC = (u8f) o47VarC.getDrawable();
        }
        return o47VarC.getDrawable() instanceof ibl ? (ibl) o47VarC.getDrawable() : o47VarC;
    }

    public RoundingParams l() {
        return this.c;
    }

    public final ibl m(int i) {
        o47 o47VarK = k(i);
        return o47VarK instanceof ibl ? (ibl) o47VarK : a.k(o47VarK, rbl.b.f32389a);
    }

    public final void n() {
        this.f.h(this.f41771a);
    }

    public final void o() {
        y79 y79Var = this.e;
        if (y79Var != null) {
            y79Var.h();
            this.e.l();
            i();
            h(1);
            this.e.o();
            this.e.k();
        }
    }

    public void p(rbl.b bVar) {
        b6i.g(bVar);
        m(2).t(bVar);
    }

    public void q(Drawable drawable) {
        r(0, drawable);
    }

    public final void r(int i, Drawable drawable) {
        if (drawable == null) {
            this.e.e(i, null);
        } else {
            k(i).h(a.d(drawable, this.c, this.f41772b));
        }
    }

    @Override // defpackage.k0m
    public void reset() {
        n();
        o();
    }

    public void s(int i) {
        this.e.r(i);
    }

    @Override // defpackage.k0m
    public void setFailure(Throwable th) {
        this.e.h();
        i();
        if (this.e.b(5) != null) {
            h(5);
        } else {
            h(1);
        }
        this.e.k();
    }

    public void t(Drawable drawable, rbl.b bVar) {
        r(1, drawable);
        m(1).t(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u(float f) {
        Drawable drawableB = this.e.b(3);
        if (drawableB == 0) {
            return;
        }
        if (f >= 0.999f) {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).stop();
            }
            j(3);
        } else {
            if (drawableB instanceof Animatable) {
                ((Animatable) drawableB).start();
            }
            h(3);
        }
        drawableB.setLevel(Math.round(f * 10000.0f));
    }

    public void v(RoundingParams roundingParams) {
        this.c = roundingParams;
        a.j(this.d, roundingParams);
        for (int i = 0; i < this.e.d(); i++) {
            a.i(k(i), this.c, this.f41772b);
        }
    }
}
