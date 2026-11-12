package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.FloatRange;
import com.airbnb.lottie.model.content.Mask;
import defpackage.b3m;
import defpackage.emq;
import defpackage.eyp;
import defpackage.f0e;
import defpackage.f67;
import defpackage.g0e;
import defpackage.g8p;
import defpackage.hh4;
import defpackage.jte;
import defpackage.k4n;
import defpackage.lse;
import defpackage.o82;
import defpackage.ox9;
import defpackage.p57;
import defpackage.p5f;
import defpackage.rpe;
import defpackage.s4d;
import defpackage.u2m;
import defpackage.v33;
import defpackage.w1e;
import defpackage.x1e;
import defpackage.x1h;
import defpackage.yte;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements p57, o82.b, g0e {
    public Paint A;
    public float B;
    public BlurMaskFilter C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f5696a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f5697b = new Matrix();
    public final Matrix c = new Matrix();
    public final Paint d = new x1e(1);
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final RectF i;
    public final RectF j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final RectF f5698k;
    public final RectF l;
    public final RectF m;
    public final String n;
    public final Matrix o;
    public final jte p;
    public final Layer q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p5f f5699r;
    public ox9 s;
    public a t;
    public a u;
    public List<a> v;
    public final List<o82<?, ?>> w;
    public final eyp x;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: com.airbnb.lottie.model.layer.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0114a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5701b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f5701b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5701b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5701b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5701b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f5700a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5700a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5700a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5700a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5700a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5700a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5700a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(jte jteVar, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new x1e(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new x1e(1, mode2);
        x1e x1eVar = new x1e(1);
        this.g = x1eVar;
        this.h = new x1e(PorterDuff.Mode.CLEAR);
        this.i = new RectF();
        this.j = new RectF();
        this.f5698k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.o = new Matrix();
        this.w = new ArrayList();
        this.y = true;
        this.B = 0.0f;
        this.p = jteVar;
        this.q = layer;
        this.n = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            x1eVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            x1eVar.setXfermode(new PorterDuffXfermode(mode));
        }
        eyp eypVarB = layer.w().b();
        this.x = eypVarB;
        eypVarB.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            p5f p5fVar = new p5f(layer.g());
            this.f5699r = p5fVar;
            Iterator<o82<u2m, Path>> it = p5fVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (o82<Integer, Integer> o82Var : this.f5699r.c()) {
                i(o82Var);
                o82Var.a(this);
            }
        }
        N();
    }

    public static a u(b bVar, Layer layer, jte jteVar, lse lseVar) {
        switch (C0114a.f5700a[layer.f().ordinal()]) {
            case 1:
                return new b3m(jteVar, layer, bVar, lseVar);
            case 2:
                return new b(jteVar, layer, lseVar.o(layer.m()), lseVar);
            case 3:
                return new k4n(jteVar, layer);
            case 4:
                return new s4d(jteVar, layer);
            case 5:
                return new x1h(jteVar, layer);
            case 6:
                return new g8p(jteVar, layer);
            default:
                rpe.c("Unknown layer type " + layer.f());
                return null;
        }
    }

    public boolean A() {
        return this.t != null;
    }

    public final void B(RectF rectF, Matrix matrix) {
        this.f5698k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f5699r.b().size();
            for (int i = 0; i < size; i++) {
                Mask mask = this.f5699r.b().get(i);
                Path pathH = this.f5699r.a().get(i).h();
                if (pathH != null) {
                    this.f5696a.set(pathH);
                    this.f5696a.transform(matrix);
                    int i2 = C0114a.f5701b[mask.a().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && mask.d()) {
                        return;
                    }
                    this.f5696a.computeBounds(this.m, false);
                    if (i == 0) {
                        this.f5698k.set(this.m);
                    } else {
                        RectF rectF2 = this.f5698k;
                        rectF2.set(Math.min(rectF2.left, this.m.left), Math.min(this.f5698k.top, this.m.top), Math.max(this.f5698k.right, this.m.right), Math.max(this.f5698k.bottom, this.m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f5698k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void C(RectF rectF, Matrix matrix) {
        if (A() && this.q.h() != Layer.MatteType.INVERT) {
            this.l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.t.a(this.l, matrix, true);
            if (rectF.intersect(this.l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void D() {
        this.p.invalidateSelf();
    }

    public final /* synthetic */ void E() {
        M(this.s.p() == 1.0f);
    }

    public final void F(float f) {
        this.p.G().n().a(this.q.i(), f);
    }

    public void G(o82<?, ?> o82Var) {
        this.w.remove(o82Var);
    }

    public void H(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
    }

    public void I(a aVar) {
        this.t = aVar;
    }

    public void J(boolean z) {
        if (z && this.A == null) {
            this.A = new x1e();
        }
        this.z = z;
    }

    public void K(a aVar) {
        this.u = aVar;
    }

    public void L(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.x.j(f);
        if (this.f5699r != null) {
            for (int i = 0; i < this.f5699r.a().size(); i++) {
                this.f5699r.a().get(i).m(f);
            }
        }
        ox9 ox9Var = this.s;
        if (ox9Var != null) {
            ox9Var.m(f);
        }
        a aVar = this.t;
        if (aVar != null) {
            aVar.L(f);
        }
        for (int i2 = 0; i2 < this.w.size(); i2++) {
            this.w.get(i2).m(f);
        }
    }

    public final void M(boolean z) {
        if (z != this.y) {
            this.y = z;
            D();
        }
    }

    public final void N() {
        if (this.q.e().isEmpty()) {
            M(true);
            return;
        }
        ox9 ox9Var = new ox9(this.q.e());
        this.s = ox9Var;
        ox9Var.l();
        this.s.a(new o82.b() { // from class: p82
            @Override // o82.b
            public final void e() {
                this.f30108a.E();
            }
        });
        M(this.s.h().floatValue() == 1.0f);
        i(this.s);
    }

    @Override // defpackage.p57
    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.o.set(matrix);
        if (z) {
            List<a> list = this.v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.o.preConcat(this.v.get(size).x.f());
                }
            } else {
                a aVar = this.u;
                if (aVar != null) {
                    this.o.preConcat(aVar.x.f());
                }
            }
        }
        this.o.preConcat(this.x.f());
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        a aVar = this.t;
        if (aVar != null) {
            f0e f0eVarA = f0eVar2.a(aVar.getName());
            if (f0eVar.c(this.t.getName(), i)) {
                list.add(f0eVarA.i(this.t));
            }
            if (f0eVar.h(getName(), i)) {
                this.t.H(f0eVar, f0eVar.e(this.t.getName(), i) + i, list, f0eVarA);
            }
        }
        if (f0eVar.g(getName(), i)) {
            if (!"__container".equals(getName())) {
                f0eVar2 = f0eVar2.a(getName());
                if (f0eVar.c(getName(), i)) {
                    list.add(f0eVar2.i(this));
                }
            }
            if (f0eVar.h(getName(), i)) {
                H(f0eVar, i + f0eVar.e(getName(), i), list, f0eVar2);
            }
        }
    }

    @Override // defpackage.p57
    public void d(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer numH;
        w1e.a(this.n);
        if (!this.y || this.q.x()) {
            w1e.b(this.n);
            return;
        }
        r();
        w1e.a("Layer#parentMatrix");
        this.f5697b.reset();
        this.f5697b.set(matrix);
        for (int size = this.v.size() - 1; size >= 0; size--) {
            this.f5697b.preConcat(this.v.get(size).x.f());
        }
        w1e.b("Layer#parentMatrix");
        o82<?, Integer> o82VarH = this.x.h();
        int iIntValue = (int) ((((i / 255.0f) * ((o82VarH == null || (numH = o82VarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!A() && !z()) {
            this.f5697b.preConcat(this.x.f());
            w1e.a("Layer#drawLayer");
            t(canvas, this.f5697b, iIntValue);
            w1e.b("Layer#drawLayer");
            F(w1e.b(this.n));
            return;
        }
        w1e.a("Layer#computeBounds");
        a(this.i, this.f5697b, false);
        C(this.i, matrix);
        this.f5697b.preConcat(this.x.f());
        B(this.i, this.f5697b);
        this.j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.c);
        if (!this.c.isIdentity()) {
            Matrix matrix2 = this.c;
            matrix2.invert(matrix2);
            this.c.mapRect(this.j);
        }
        if (!this.i.intersect(this.j)) {
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        w1e.b("Layer#computeBounds");
        if (this.i.width() >= 1.0f && this.i.height() >= 1.0f) {
            w1e.a("Layer#saveLayer");
            this.d.setAlpha(255);
            emq.m(canvas, this.i, this.d);
            w1e.b("Layer#saveLayer");
            s(canvas);
            w1e.a("Layer#drawLayer");
            t(canvas, this.f5697b, iIntValue);
            w1e.b("Layer#drawLayer");
            if (z()) {
                o(canvas, this.f5697b);
            }
            if (A()) {
                w1e.a("Layer#drawMatte");
                w1e.a("Layer#saveLayer");
                emq.n(canvas, this.i, this.g, 19);
                w1e.b("Layer#saveLayer");
                s(canvas);
                this.t.d(canvas, matrix, iIntValue);
                w1e.a("Layer#restoreLayer");
                canvas.restore();
                w1e.b("Layer#restoreLayer");
                w1e.b("Layer#drawMatte");
            }
            w1e.a("Layer#restoreLayer");
            canvas.restore();
            w1e.b("Layer#restoreLayer");
        }
        if (this.z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.i, this.A);
        }
        F(w1e.b(this.n));
    }

    @Override // o82.b
    public void e() {
        D();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.q.i();
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        this.x.c(t, yteVar);
    }

    public void i(o82<?, ?> o82Var) {
        if (o82Var == null) {
            return;
        }
        this.w.add(o82Var);
    }

    public final void j(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var, o82<Integer, Integer> o82Var2) {
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        this.d.setAlpha((int) (o82Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.f5696a, this.d);
    }

    public final void k(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var, o82<Integer, Integer> o82Var2) {
        emq.m(canvas, this.i, this.e);
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        this.d.setAlpha((int) (o82Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.f5696a, this.d);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var, o82<Integer, Integer> o82Var2) {
        emq.m(canvas, this.i, this.d);
        canvas.drawRect(this.i, this.d);
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        this.d.setAlpha((int) (o82Var2.h().intValue() * 2.55f));
        canvas.drawPath(this.f5696a, this.f);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var, o82<Integer, Integer> o82Var2) {
        emq.m(canvas, this.i, this.e);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (o82Var2.h().intValue() * 2.55f));
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        canvas.drawPath(this.f5696a, this.f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var, o82<Integer, Integer> o82Var2) {
        emq.m(canvas, this.i, this.f);
        canvas.drawRect(this.i, this.d);
        this.f.setAlpha((int) (o82Var2.h().intValue() * 2.55f));
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        canvas.drawPath(this.f5696a, this.f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix) {
        w1e.a("Layer#saveLayer");
        emq.n(canvas, this.i, this.e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        w1e.b("Layer#saveLayer");
        for (int i = 0; i < this.f5699r.b().size(); i++) {
            Mask mask = this.f5699r.b().get(i);
            o82<u2m, Path> o82Var = this.f5699r.a().get(i);
            o82<Integer, Integer> o82Var2 = this.f5699r.c().get(i);
            int i2 = C0114a.f5701b[mask.a().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.d.setColor(-16777216);
                        this.d.setAlpha(255);
                        canvas.drawRect(this.i, this.d);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, o82Var, o82Var2);
                    } else {
                        p(canvas, matrix, o82Var);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, o82Var, o82Var2);
                        } else {
                            j(canvas, matrix, o82Var, o82Var2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, o82Var, o82Var2);
                } else {
                    k(canvas, matrix, o82Var, o82Var2);
                }
            } else if (q()) {
                this.d.setAlpha(255);
                canvas.drawRect(this.i, this.d);
            }
        }
        w1e.a("Layer#restoreLayer");
        canvas.restore();
        w1e.b("Layer#restoreLayer");
    }

    public final void p(Canvas canvas, Matrix matrix, o82<u2m, Path> o82Var) {
        this.f5696a.set(o82Var.h());
        this.f5696a.transform(matrix);
        canvas.drawPath(this.f5696a, this.f);
    }

    public final boolean q() {
        if (this.f5699r.a().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f5699r.b().size(); i++) {
            if (this.f5699r.b().get(i).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void r() {
        if (this.v != null) {
            return;
        }
        if (this.u == null) {
            this.v = Collections.emptyList();
            return;
        }
        this.v = new ArrayList();
        for (a aVar = this.u; aVar != null; aVar = aVar.u) {
            this.v.add(aVar);
        }
    }

    public final void s(Canvas canvas) {
        w1e.a("Layer#clearLayer");
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
        w1e.b("Layer#clearLayer");
    }

    public abstract void t(Canvas canvas, Matrix matrix, int i);

    public v33 v() {
        return this.q.a();
    }

    public BlurMaskFilter w(float f) {
        if (this.B == f) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f;
        return blurMaskFilter;
    }

    public f67 x() {
        return this.q.c();
    }

    public Layer y() {
        return this.q;
    }

    public boolean z() {
        p5f p5fVar = this.f5699r;
        return (p5fVar == null || p5fVar.a().isEmpty()) ? false : true;
    }
}
