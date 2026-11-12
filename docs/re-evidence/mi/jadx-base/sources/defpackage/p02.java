package defpackage;

import com.github.mikephil.charting.data.BarEntry;

/* JADX INFO: loaded from: classes4.dex */
public class p02 extends e00<gpc> {
    public int g;
    public int h;
    public boolean i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f29862k;

    public p02(int i, int i2, boolean z) {
        super(i);
        this.g = 0;
        this.j = false;
        this.f29862k = 1.0f;
        this.h = i2;
        this.i = z;
    }

    public void d(float f, float f2, float f3, float f4) {
        float[] fArr = this.f16108b;
        int i = this.f16107a;
        fArr[i] = f;
        fArr[i + 1] = f2;
        fArr[i + 2] = f3;
        this.f16107a = i + 4;
        fArr[i + 3] = f4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void e(gpc gpcVar) {
        float f;
        float fAbs;
        float fAbs2;
        float f2;
        float fO0 = gpcVar.O0() * this.c;
        float f3 = this.f29862k / 2.0f;
        for (int i = 0; i < fO0; i++) {
            BarEntry barEntry = (BarEntry) gpcVar.i(i);
            if (barEntry != null) {
                float x = barEntry.getX();
                float y = barEntry.getY();
                float[] yVals = barEntry.getYVals();
                if (!this.i || yVals == null) {
                    float f4 = x - f3;
                    float f5 = x + f3;
                    if (this.j) {
                        f = y >= 0.0f ? y : 0.0f;
                        if (y > 0.0f) {
                            y = 0.0f;
                        }
                    } else {
                        float f6 = y >= 0.0f ? y : 0.0f;
                        if (y > 0.0f) {
                            y = 0.0f;
                        }
                        float f7 = y;
                        y = f6;
                        f = f7;
                    }
                    if (y > 0.0f) {
                        y *= this.d;
                    } else {
                        f *= this.d;
                    }
                    d(f4, y, f5, f);
                } else {
                    float f8 = -barEntry.getNegativeSum();
                    float f9 = 0.0f;
                    int i2 = 0;
                    while (i2 < yVals.length) {
                        float f10 = yVals[i2];
                        if (f10 == 0.0f && (f9 == 0.0f || f8 == 0.0f)) {
                            fAbs = f10;
                            fAbs2 = f8;
                            f8 = fAbs;
                        } else if (f10 >= 0.0f) {
                            fAbs = f10 + f9;
                            fAbs2 = f8;
                            f8 = f9;
                            f9 = fAbs;
                        } else {
                            fAbs = Math.abs(f10) + f8;
                            fAbs2 = Math.abs(f10) + f8;
                        }
                        float f11 = x - f3;
                        float f12 = x + f3;
                        if (this.j) {
                            f2 = f8 >= fAbs ? f8 : fAbs;
                            if (f8 > fAbs) {
                                f8 = fAbs;
                            }
                        } else {
                            float f13 = f8 >= fAbs ? f8 : fAbs;
                            if (f8 > fAbs) {
                                f8 = fAbs;
                            }
                            float f14 = f8;
                            f8 = f13;
                            f2 = f14;
                        }
                        float f15 = this.d;
                        d(f11, f8 * f15, f12, f2 * f15);
                        i2++;
                        f8 = fAbs2;
                    }
                }
            }
        }
        a();
    }

    public void f(float f) {
        this.f29862k = f;
    }

    public void g(int i) {
        this.g = i;
    }

    public void h(boolean z) {
        this.j = z;
    }
}
