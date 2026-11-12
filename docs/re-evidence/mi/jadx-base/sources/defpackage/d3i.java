package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d3i implements slh, o82.b, h0e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15037b;
    public final jte c;
    public final PolystarShape.Type d;
    public final boolean e;
    public final boolean f;
    public final o82<?, Float> g;
    public final o82<?, PointF> h;
    public final o82<?, Float> i;
    public final o82<?, Float> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o82<?, Float> f15038k;
    public final o82<?, Float> l;
    public final o82<?, Float> m;
    public boolean o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f15036a = new Path();
    public final va4 n = new va4();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15039a;

        static {
            int[] iArr = new int[PolystarShape.Type.values().length];
            f15039a = iArr;
            try {
                iArr[PolystarShape.Type.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15039a[PolystarShape.Type.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d3i(jte jteVar, com.airbnb.lottie.model.layer.a aVar, PolystarShape polystarShape) {
        this.c = jteVar;
        this.f15037b = polystarShape.d();
        PolystarShape.Type typeJ = polystarShape.j();
        this.d = typeJ;
        this.e = polystarShape.k();
        this.f = polystarShape.l();
        o82<Float, Float> o82VarA = polystarShape.g().a();
        this.g = o82VarA;
        o82<PointF, PointF> o82VarA2 = polystarShape.h().a();
        this.h = o82VarA2;
        o82<Float, Float> o82VarA3 = polystarShape.i().a();
        this.i = o82VarA3;
        o82<Float, Float> o82VarA4 = polystarShape.e().a();
        this.f15038k = o82VarA4;
        o82<Float, Float> o82VarA5 = polystarShape.f().a();
        this.m = o82VarA5;
        PolystarShape.Type type = PolystarShape.Type.STAR;
        if (typeJ == type) {
            this.j = polystarShape.b().a();
            this.l = polystarShape.c().a();
        } else {
            this.j = null;
            this.l = null;
        }
        aVar.i(o82VarA);
        aVar.i(o82VarA2);
        aVar.i(o82VarA3);
        aVar.i(o82VarA4);
        aVar.i(o82VarA5);
        if (typeJ == type) {
            aVar.i(this.j);
            aVar.i(this.l);
        }
        o82VarA.a(this);
        o82VarA2.a(this);
        o82VarA3.a(this);
        o82VarA4.a(this);
        o82VarA5.a(this);
        if (typeJ == type) {
            this.j.a(this);
            this.l.a(this);
        }
    }

    private void j() {
        this.o = false;
        this.c.invalidateSelf();
    }

    public final void b() {
        int iFloor = (int) Math.floor(this.g.h().floatValue());
        o82<?, Float> o82Var = this.i;
        double radians = Math.toRadians((o82Var == null ? 0.0d : o82Var.h().floatValue()) - 90.0d);
        double d = iFloor;
        float fFloatValue = this.m.h().floatValue() / 100.0f;
        float fFloatValue2 = this.f15038k.h().floatValue();
        double d2 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d2);
        float fSin = (float) (Math.sin(radians) * d2);
        this.f15036a.moveTo(fCos, fSin);
        double d3 = (float) (6.283185307179586d / d);
        double d4 = radians + d3;
        double dCeil = Math.ceil(d);
        int i = 0;
        while (i < dCeil) {
            float fCos2 = (float) (Math.cos(d4) * d2);
            double d5 = dCeil;
            float fSin2 = (float) (d2 * Math.sin(d4));
            if (fFloatValue != 0.0f) {
                double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                float fCos3 = (float) Math.cos(dAtan2);
                float fSin3 = (float) Math.sin(dAtan2);
                double dAtan3 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                float f = fFloatValue2 * fFloatValue * 0.25f;
                this.f15036a.cubicTo(fCos - (fCos3 * f), fSin - (fSin3 * f), fCos2 + (((float) Math.cos(dAtan3)) * f), fSin2 + (f * ((float) Math.sin(dAtan3))), fCos2, fSin2);
            } else {
                this.f15036a.lineTo(fCos2, fSin2);
            }
            d4 += d3;
            i++;
            fSin = fSin2;
            fCos = fCos2;
            dCeil = d5;
            d2 = d2;
            d3 = d3;
        }
        PointF pointFH = this.h.h();
        this.f15036a.offset(pointFH.x, pointFH.y);
        this.f15036a.close();
    }

    @Override // defpackage.g0e
    public void c(f0e f0eVar, int i, List<f0e> list, f0e f0eVar2) {
        d5g.k(f0eVar, i, list, f0eVar2, this);
    }

    @Override // o82.b
    public void e() {
        j();
    }

    @Override // defpackage.hh4
    public void f(List<hh4> list, List<hh4> list2) {
        for (int i = 0; i < list.size(); i++) {
            hh4 hh4Var = list.get(i);
            if (hh4Var instanceof d2q) {
                d2q d2qVar = (d2q) hh4Var;
                if (d2qVar.j() == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.n.a(d2qVar);
                    d2qVar.b(this);
                }
            }
        }
    }

    @Override // defpackage.hh4
    public String getName() {
        return this.f15037b;
    }

    @Override // defpackage.slh
    public Path getPath() {
        if (this.o) {
            return this.f15036a;
        }
        this.f15036a.reset();
        if (this.e) {
            this.o = true;
            return this.f15036a;
        }
        int i = a.f15039a[this.d.ordinal()];
        if (i == 1) {
            i();
        } else if (i == 2) {
            b();
        }
        this.f15036a.close();
        this.n.b(this.f15036a);
        this.o = true;
        return this.f15036a;
    }

    @Override // defpackage.g0e
    public <T> void h(T t, yte<T> yteVar) {
        o82<?, Float> o82Var;
        o82<?, Float> o82Var2;
        if (t == ste.w) {
            this.g.n(yteVar);
            return;
        }
        if (t == ste.x) {
            this.i.n(yteVar);
            return;
        }
        if (t == ste.n) {
            this.h.n(yteVar);
            return;
        }
        if (t == ste.y && (o82Var2 = this.j) != null) {
            o82Var2.n(yteVar);
            return;
        }
        if (t == ste.z) {
            this.f15038k.n(yteVar);
            return;
        }
        if (t == ste.A && (o82Var = this.l) != null) {
            o82Var.n(yteVar);
        } else if (t == ste.B) {
            this.m.n(yteVar);
        }
    }

    public final void i() {
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        float fFloatValue = this.g.h().floatValue();
        o82<?, Float> o82Var = this.i;
        double radians = Math.toRadians((o82Var == null ? 0.0d : o82Var.h().floatValue()) - 90.0d);
        double d2 = fFloatValue;
        float f6 = (float) (6.283185307179586d / d2);
        if (this.f) {
            f6 *= -1.0f;
        }
        float f7 = f6 / 2.0f;
        float f8 = fFloatValue - ((int) fFloatValue);
        if (f8 != 0.0f) {
            radians += (double) ((1.0f - f8) * f7);
        }
        float fFloatValue2 = this.f15038k.h().floatValue();
        float fFloatValue3 = this.j.h().floatValue();
        o82<?, Float> o82Var2 = this.l;
        float fFloatValue4 = o82Var2 != null ? o82Var2.h().floatValue() / 100.0f : 0.0f;
        o82<?, Float> o82Var3 = this.m;
        float fFloatValue5 = o82Var3 != null ? o82Var3.h().floatValue() / 100.0f : 0.0f;
        if (f8 != 0.0f) {
            f3 = ((fFloatValue2 - fFloatValue3) * f8) + fFloatValue3;
            double d3 = f3;
            float fCos = (float) (d3 * Math.cos(radians));
            fSin = (float) (d3 * Math.sin(radians));
            this.f15036a.moveTo(fCos, fSin);
            d = radians + ((double) ((f6 * f8) / 2.0f));
            f = fCos;
            f2 = f7;
        } else {
            double d4 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d4);
            float fSin2 = (float) (d4 * Math.sin(radians));
            this.f15036a.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f7;
            d = radians + ((double) f2);
            fSin = fSin2;
            f3 = 0.0f;
        }
        double dCeil = Math.ceil(d2) * 2.0d;
        int i = 0;
        float f9 = f2;
        float f10 = f;
        boolean z = false;
        while (true) {
            double d5 = i;
            if (d5 >= dCeil) {
                PointF pointFH = this.h.h();
                this.f15036a.offset(pointFH.x, pointFH.y);
                this.f15036a.close();
                return;
            }
            float f11 = z ? fFloatValue2 : fFloatValue3;
            float f12 = (f3 == 0.0f || d5 != dCeil - 2.0d) ? f9 : (f6 * f8) / 2.0f;
            if (f3 == 0.0f || d5 != dCeil - 1.0d) {
                f3 = f11;
            }
            double d6 = f3;
            double d7 = dCeil;
            float fCos3 = (float) (d6 * Math.cos(d));
            float fSin3 = (float) (d6 * Math.sin(d));
            if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                this.f15036a.lineTo(fCos3, fSin3);
                f4 = fFloatValue4;
                f5 = fFloatValue5;
            } else {
                f4 = fFloatValue4;
                double dAtan2 = (float) (Math.atan2(fSin, f10) - 1.5707963267948966d);
                float fCos4 = (float) Math.cos(dAtan2);
                float fSin4 = (float) Math.sin(dAtan2);
                f5 = fFloatValue5;
                double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                float fCos5 = (float) Math.cos(dAtan3);
                float fSin5 = (float) Math.sin(dAtan3);
                float f13 = z ? f4 : f5;
                float f14 = z ? f5 : f4;
                float f15 = (z ? fFloatValue3 : fFloatValue2) * f13 * 0.47829f;
                float f16 = fCos4 * f15;
                float f17 = f15 * fSin4;
                float f18 = (z ? fFloatValue2 : fFloatValue3) * f14 * 0.47829f;
                float f19 = fCos5 * f18;
                float f20 = f18 * fSin5;
                if (f8 != 0.0f) {
                    if (i == 0) {
                        f16 *= f8;
                        f17 *= f8;
                    } else if (d5 == d7 - 1.0d) {
                        f19 *= f8;
                        f20 *= f8;
                    }
                }
                this.f15036a.cubicTo(f10 - f16, fSin - f17, fCos3 + f19, fSin3 + f20, fCos3, fSin3);
            }
            d += (double) f12;
            z = !z;
            i++;
            f10 = fCos3;
            fSin = fSin3;
            fFloatValue5 = f5;
            fFloatValue4 = f4;
            f3 = f3;
            f6 = f6;
            dCeil = d7;
        }
    }
}
