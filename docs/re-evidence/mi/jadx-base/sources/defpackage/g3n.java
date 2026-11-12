package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class g3n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f18555a = 0.8f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18556b = 0.46f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RectF f18557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f18558b;
        public double c;
        public double d;
        public double e;
        public double f;
        public float g;
        public PointF[] h = new PointF[4];
        public PointF[] i = new PointF[4];

        public void a(float f, RectF rectF, float f2, float f3, double d, float f4, int i) {
            this.f18558b = f;
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float f5 = rectF.left;
            float f6 = rectF.top;
            float f7 = rectF.right;
            float f8 = rectF.bottom;
            this.c = g3n.K(fWidth, this.f18558b, d, f4);
            this.d = g3n.J(fHeight, this.f18558b, d, f4);
            this.e = g3n.M(this.c);
            double dL = g3n.L(this.d);
            this.f = dL;
            this.g = (float) g3n.I((1.5707963267948966d - dL) - this.e);
            double d2 = f4;
            double dB = g3n.B(this.c * d2, this.e);
            double D = g3n.D(this.f18558b, this.e);
            double dF = g3n.F(this.f18558b, this.e);
            double dH = g3n.H(this.f18558b, this.e);
            double dO = g3n.O(this.f18558b, this.e);
            double dQ = g3n.Q(dB, dO);
            double dA = g3n.A(this.d * d2, this.f);
            double dC = g3n.C(this.f18558b, this.f);
            double dE = g3n.E(this.f18558b, this.f);
            double dG = g3n.G(this.f18558b, this.f);
            double dN = g3n.N(this.f18558b, this.f);
            double dP = g3n.P(dA, dN);
            if (i == 0) {
                float f9 = f5 + f2;
                float f10 = f6 + f3;
                float f11 = this.f18558b;
                this.f18557a = new RectF(f9, f10, (f11 * 2.0f) + f9, (f11 * 2.0f) + f10);
                double d3 = f9;
                double d4 = f10;
                this.h[0] = new PointF((float) (D + d3), (float) (dF + d4));
                this.h[1] = new PointF((float) (dH + d3), f10);
                double d5 = dH + dO;
                this.h[2] = new PointF((float) (d5 + d3), f10);
                this.h[3] = new PointF((float) (d5 + dQ + d3), f10);
                double d6 = dN + dG;
                this.i[0] = new PointF(f9, (float) (d6 + dP + d4));
                this.i[1] = new PointF(f9, (float) (d6 + d4));
                this.i[2] = new PointF(f9, (float) (dG + d4));
                this.i[3] = new PointF((float) (dC + d3), (float) (dE + d4));
                return;
            }
            if (i == 1) {
                float f12 = f6 + f3;
                float f13 = this.f18558b;
                float f14 = f7 - f2;
                this.f18557a = new RectF((f7 - (f13 * 2.0f)) - f2, f12, f14, (f13 * 2.0f) + f12);
                double d7 = f7;
                double d8 = d7 - dH;
                double d9 = d8 - dO;
                double d10 = f2;
                this.h[0] = new PointF((float) ((d9 - dQ) - d10), f12);
                this.h[1] = new PointF((float) (d9 - d10), f12);
                this.h[2] = new PointF((float) (d8 - d10), f12);
                double d11 = f12;
                this.h[3] = new PointF((float) ((d7 - D) - d10), (float) (dF + d11));
                this.i[0] = new PointF((float) ((d7 - dC) - d10), (float) (dE + d11));
                this.i[1] = new PointF(f14, (float) (dG + d11));
                double d12 = dG + dN;
                this.i[2] = new PointF(f14, (float) (d12 + d11));
                this.i[3] = new PointF(f14, (float) (d12 + dP + d11));
                return;
            }
            if (i == 2) {
                float f15 = this.f18558b;
                float f16 = f7 - f2;
                float f17 = f8 - f3;
                this.f18557a = new RectF((f7 - (f15 * 2.0f)) - f2, (f8 - (f15 * 2.0f)) - f3, f16, f17);
                double d13 = f7;
                double d14 = f2;
                double d15 = f8;
                double d16 = f3;
                this.h[0] = new PointF((float) ((d13 - D) - d14), (float) ((d15 - dF) - d16));
                double d17 = d13 - dH;
                this.h[1] = new PointF((float) (d17 - d14), f17);
                double d18 = d17 - dO;
                this.h[2] = new PointF((float) (d18 - d14), f17);
                this.h[3] = new PointF((float) ((d18 - dQ) - d14), f17);
                double d19 = d15 - dG;
                double d20 = d19 - dN;
                this.i[0] = new PointF(f16, (float) ((d20 - dP) - d16));
                this.i[1] = new PointF(f16, (float) (d20 - d16));
                this.i[2] = new PointF(f16, (float) (d19 - d16));
                this.i[3] = new PointF((float) ((d13 - dC) - d14), (float) ((d15 - dE) - d16));
                return;
            }
            if (i == 3) {
                float f18 = f5 + f2;
                float f19 = this.f18558b;
                float f20 = f8 - f3;
                this.f18557a = new RectF(f18, (f8 - (f19 * 2.0f)) - f3, (f19 * 2.0f) + f18, f20);
                double d21 = dH + dO;
                double d22 = f18;
                this.h[0] = new PointF((float) (d21 + dQ + d22), f20);
                this.h[1] = new PointF((float) (d21 + d22), f20);
                this.h[2] = new PointF((float) (dH + d22), f20);
                float f21 = (float) (D + d22);
                double d23 = f8;
                double d24 = f3;
                this.h[3] = new PointF(f21, (float) ((d23 - dF) - d24));
                this.i[0] = new PointF((float) (dC + d22), (float) ((d23 - dE) - d24));
                double d25 = d23 - dG;
                this.i[1] = new PointF(f18, (float) (d25 - d24));
                double d26 = d25 - dN;
                this.i[2] = new PointF(f18, (float) (d26 - d24));
                this.i[3] = new PointF(f18, (float) ((d26 - dP) - d24));
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f18559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f18560b;
        public double c;
        public float d;
        public a e = null;
        public a f = null;
        public a g = null;
        public a h = null;

        public b(float f, float f2, double d, float f3) {
            this.f18559a = f;
            this.f18560b = f2;
            this.c = d;
            this.d = f3;
        }
    }

    public static double A(double d, double d2) {
        if (d2 == 0.0d) {
            return 0.0d;
        }
        double d3 = d2 / 2.0d;
        return (((((d * 0.46000000834465027d) + Math.tan(d3)) * 2.0d) * (Math.cos(d2) + 1.0d)) / (Math.tan(d3) * 3.0d)) - 1.0d;
    }

    public static double B(double d, double d2) {
        if (d2 == 0.0d) {
            return 0.0d;
        }
        double d3 = d2 / 2.0d;
        return (((((d * 0.46000000834465027d) + Math.tan(d3)) * 2.0d) * (Math.cos(d2) + 1.0d)) / (Math.tan(d3) * 3.0d)) - 1.0d;
    }

    public static double C(float f, double d) {
        return ((double) f) * (1.0d - Math.cos(d));
    }

    public static double D(float f, double d) {
        return ((double) f) * (1.0d - Math.sin(d));
    }

    public static double E(float f, double d) {
        return ((double) f) * (1.0d - Math.sin(d));
    }

    public static double F(float f, double d) {
        return ((double) f) * (1.0d - Math.cos(d));
    }

    public static double G(float f, double d) {
        return ((double) f) * (1.0d - Math.tan(d / 2.0d));
    }

    public static double H(float f, double d) {
        return ((double) f) * (1.0d - Math.tan(d / 2.0d));
    }

    public static double I(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    public static double J(float f, float f2, double d, float f3) {
        return y(f, f2, f2, d, f3) ? Math.max(Math.min(((f / (f2 * 2.0f)) - 1.0f) / f3, 1.0f), 0.0f) : d;
    }

    public static double K(float f, float f2, double d, float f3) {
        return z(f, f2, f2, d, f3) ? Math.max(Math.min(((f / (f2 * 2.0f)) - 1.0f) / f3, 1.0f), 0.0f) : d;
    }

    public static double L(double d) {
        return (d * 3.141592653589793d) / 4.0d;
    }

    public static double M(double d) {
        return (d * 3.141592653589793d) / 4.0d;
    }

    public static double N(float f, double d) {
        return ((((double) f) * 1.5d) * Math.tan(d / 2.0d)) / (Math.cos(d) + 1.0d);
    }

    public static double O(float f, double d) {
        return ((((double) f) * 1.5d) * Math.tan(d / 2.0d)) / (Math.cos(d) + 1.0d);
    }

    public static double P(double d, double d2) {
        return d * d2;
    }

    public static double Q(double d, double d2) {
        return d * d2;
    }

    public static boolean y(float f, float f2, float f3, double d, float f4) {
        return ((double) f) <= ((double) (f2 + f3)) * ((d * ((double) f4)) + 1.0d);
    }

    public static boolean z(float f, float f2, float f3, double d, float f4) {
        return ((double) f) <= ((double) (f2 + f3)) * ((d * ((double) f4)) + 1.0d);
    }

    public b r(RectF rectF, float f, float f2, float f3) {
        return s(rectF, new float[]{f, f, f, f, f, f, f, f}, f2, f3);
    }

    public b s(RectF rectF, float[] fArr, float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (fArr == null) {
            return null;
        }
        float fU = u();
        float fV = v();
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        double d = fV;
        b bVar = new b(fWidth, fHeight, d, fU);
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        for (int i = 0; i < Math.min(8, fArr.length); i++) {
            if (!Float.isNaN(fArr[i])) {
                fArr2[i] = fArr[i];
            }
        }
        float f7 = fArr2[0];
        float f8 = fArr2[1];
        float f9 = fArr2[2];
        float f10 = fArr2[3];
        float f11 = fArr2[4];
        float f12 = fArr2[5];
        float f13 = fArr2[6];
        float f14 = fArr2[7];
        if (f7 + f9 > fWidth) {
            f3 = (fWidth * f9) / (f7 + f9);
            f7 = (fWidth * f7) / (f7 + f9);
        } else {
            f3 = f9;
        }
        if (f10 + f12 > fHeight) {
            float f15 = (fHeight * f10) / (f10 + f12);
            f12 = (fHeight * f12) / (f10 + f12);
            f4 = f15;
        } else {
            f4 = f10;
        }
        if (f11 + f13 > fWidth) {
            float f16 = (fWidth * f11) / (f11 + f13);
            f13 = (fWidth * f13) / (f11 + f13);
            f5 = f16;
        } else {
            f5 = f11;
        }
        if (f14 + f8 > fHeight) {
            float f17 = (fHeight * f14) / (f14 + f8);
            f8 = (fHeight * f8) / (f14 + f8);
            f6 = f17;
        } else {
            f6 = f14;
        }
        t(bVar);
        bVar.e.a(Math.min(f7, f8), rectF, f, f2, d, fU, 0);
        bVar.f.a(Math.min(f3, f4), rectF, f, f2, d, fU, 1);
        bVar.g.a(Math.min(f5, f12), rectF, f, f2, d, fU, 2);
        bVar.h.a(Math.min(f13, f6), rectF, f, f2, d, fU, 3);
        return bVar;
    }

    public final void t(b bVar) {
        if (bVar.e == null) {
            bVar.e = new a();
        }
        if (bVar.f == null) {
            bVar.f = new a();
        }
        if (bVar.g == null) {
            bVar.g = new a();
        }
        if (bVar.h == null) {
            bVar.h = new a();
        }
    }

    public float u() {
        return this.f18556b;
    }

    public float v() {
        return this.f18555a;
    }

    public Path w(Path path, b bVar) {
        Path path2 = path == null ? new Path() : path;
        path2.reset();
        if (bVar == null) {
            return path2;
        }
        if (x(bVar)) {
            path2.addRect(new RectF(0.0f, 0.0f, bVar.f18559a, bVar.f18560b), Path.Direction.CCW);
            return path2;
        }
        a aVar = bVar.e;
        if (aVar.g != 0.0f) {
            path2.arcTo(aVar.f18557a, (float) I(aVar.f + 3.141592653589793d), bVar.e.g);
        } else {
            PointF pointF = aVar.h[0];
            path2.moveTo(pointF.x, pointF.y);
        }
        a aVar2 = bVar.e;
        if (aVar2.c != 0.0d) {
            PointF[] pointFArr = aVar2.h;
            PointF pointF2 = pointFArr[1];
            float f = pointF2.x;
            float f2 = pointF2.y;
            PointF pointF3 = pointFArr[2];
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            PointF pointF4 = pointFArr[3];
            path2.cubicTo(f, f2, f3, f4, pointF4.x, pointF4.y);
        }
        if (!z(bVar.f18559a, bVar.e.f18558b, bVar.f.f18558b, bVar.c, bVar.d)) {
            PointF pointF5 = bVar.f.h[0];
            path2.lineTo(pointF5.x, pointF5.y);
        }
        a aVar3 = bVar.f;
        if (aVar3.c != 0.0d) {
            PointF[] pointFArr2 = aVar3.h;
            PointF pointF6 = pointFArr2[1];
            float f5 = pointF6.x;
            float f6 = pointF6.y;
            PointF pointF7 = pointFArr2[2];
            float f7 = pointF7.x;
            float f8 = pointF7.y;
            PointF pointF8 = pointFArr2[3];
            path2.cubicTo(f5, f6, f7, f8, pointF8.x, pointF8.y);
        }
        a aVar4 = bVar.f;
        if (aVar4.g != 0.0f) {
            path2.arcTo(aVar4.f18557a, (float) I(aVar4.e + 4.71238898038469d), bVar.f.g);
        }
        a aVar5 = bVar.f;
        if (aVar5.d != 0.0d) {
            PointF[] pointFArr3 = aVar5.i;
            PointF pointF9 = pointFArr3[1];
            float f9 = pointF9.x;
            float f10 = pointF9.y;
            PointF pointF10 = pointFArr3[2];
            float f11 = pointF10.x;
            float f12 = pointF10.y;
            PointF pointF11 = pointFArr3[3];
            path2.cubicTo(f9, f10, f11, f12, pointF11.x, pointF11.y);
        }
        if (!y(bVar.f18560b, bVar.f.f18558b, bVar.g.f18558b, bVar.c, bVar.d)) {
            PointF pointF12 = bVar.g.i[0];
            path2.lineTo(pointF12.x, pointF12.y);
        }
        a aVar6 = bVar.g;
        if (aVar6.d != 0.0d) {
            PointF[] pointFArr4 = aVar6.i;
            PointF pointF13 = pointFArr4[1];
            float f13 = pointF13.x;
            float f14 = pointF13.y;
            PointF pointF14 = pointFArr4[2];
            float f15 = pointF14.x;
            float f16 = pointF14.y;
            PointF pointF15 = pointFArr4[3];
            path2.cubicTo(f13, f14, f15, f16, pointF15.x, pointF15.y);
        }
        a aVar7 = bVar.g;
        if (aVar7.g != 0.0f) {
            path2.arcTo(aVar7.f18557a, (float) I(aVar7.f), bVar.g.g);
        }
        a aVar8 = bVar.g;
        if (aVar8.c != 0.0d) {
            PointF[] pointFArr5 = aVar8.h;
            PointF pointF16 = pointFArr5[1];
            float f17 = pointF16.x;
            float f18 = pointF16.y;
            PointF pointF17 = pointFArr5[2];
            float f19 = pointF17.x;
            float f20 = pointF17.y;
            PointF pointF18 = pointFArr5[3];
            path2.cubicTo(f17, f18, f19, f20, pointF18.x, pointF18.y);
        }
        if (!z(bVar.f18559a, bVar.g.f18558b, bVar.h.f18558b, bVar.c, bVar.d)) {
            PointF pointF19 = bVar.h.h[0];
            path2.lineTo(pointF19.x, pointF19.y);
        }
        a aVar9 = bVar.h;
        if (aVar9.c != 0.0d) {
            PointF[] pointFArr6 = aVar9.h;
            PointF pointF20 = pointFArr6[1];
            float f21 = pointF20.x;
            float f22 = pointF20.y;
            PointF pointF21 = pointFArr6[2];
            float f23 = pointF21.x;
            float f24 = pointF21.y;
            PointF pointF22 = pointFArr6[3];
            path2.cubicTo(f21, f22, f23, f24, pointF22.x, pointF22.y);
        }
        a aVar10 = bVar.h;
        if (aVar10.g != 0.0f) {
            path2.arcTo(aVar10.f18557a, (float) I(aVar10.e + 1.5707963267948966d), bVar.h.g);
        }
        a aVar11 = bVar.h;
        if (aVar11.d != 0.0d) {
            PointF[] pointFArr7 = aVar11.i;
            PointF pointF23 = pointFArr7[1];
            float f25 = pointF23.x;
            float f26 = pointF23.y;
            PointF pointF24 = pointFArr7[2];
            float f27 = pointF24.x;
            float f28 = pointF24.y;
            PointF pointF25 = pointFArr7[3];
            path2.cubicTo(f25, f26, f27, f28, pointF25.x, pointF25.y);
        }
        if (!y(bVar.f18560b, bVar.h.f18558b, bVar.e.f18558b, bVar.c, bVar.d)) {
            PointF pointF26 = bVar.e.i[0];
            path2.lineTo(pointF26.x, pointF26.y);
        }
        a aVar12 = bVar.e;
        if (aVar12.d != 0.0d) {
            PointF[] pointFArr8 = aVar12.i;
            PointF pointF27 = pointFArr8[1];
            float f29 = pointF27.x;
            float f30 = pointF27.y;
            PointF pointF28 = pointFArr8[2];
            float f31 = pointF28.x;
            float f32 = pointF28.y;
            PointF pointF29 = pointFArr8[3];
            path2.cubicTo(f29, f30, f31, f32, pointF29.x, pointF29.y);
        }
        path2.close();
        return path2;
    }

    public final boolean x(b bVar) {
        return bVar.e == null || bVar.f == null || bVar.g == null || bVar.h == null;
    }
}
