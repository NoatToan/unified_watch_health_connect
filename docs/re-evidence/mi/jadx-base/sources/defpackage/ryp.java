package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.github.mikephil.charting.data.CandleEntry;

/* JADX INFO: loaded from: classes4.dex */
public class ryp {
    public hwq c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Matrix f33073a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f33074b = new Matrix();
    public float[] d = new float[1];
    public float[] e = new float[1];
    public float[] f = new float[1];
    public float[] g = new float[1];
    public Matrix h = new Matrix();
    public float[] i = new float[2];
    public Matrix j = new Matrix();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Matrix f33075k = new Matrix();

    public ryp(hwq hwqVar) {
        this.c = hwqVar;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    public float[] a(npc npcVar, float f, int i, int i2) {
        int i3 = ((i2 - i) + 1) * 2;
        if (this.e.length != i3) {
            this.e = new float[i3];
        }
        float[] fArr = this.e;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? I = npcVar.i((i4 / 2) + i);
            if (I != 0) {
                fArr[i4] = I.getX();
                fArr[i4 + 1] = I.getY() * f;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        f().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float[] b(vpc vpcVar, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.g.length != i3) {
            this.g = new float[i3];
        }
        float[] fArr = this.g;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            CandleEntry candleEntry = (CandleEntry) vpcVar.i((i4 / 2) + i);
            if (candleEntry != null) {
                fArr[i4] = candleEntry.getX();
                fArr[i4 + 1] = candleEntry.d() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        f().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    public float[] c(ktc ktcVar, float f, float f2, int i, int i2) {
        int i3 = (((int) ((i2 - i) * f)) + 1) * 2;
        if (this.f.length != i3) {
            this.f = new float[i3];
        }
        float[] fArr = this.f;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? I = ktcVar.i((i4 / 2) + i);
            if (I != 0) {
                fArr[i4] = I.getX();
                fArr[i4 + 1] = I.getY() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        f().mapPoints(fArr);
        return fArr;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.github.mikephil.charting.data.Entry, j72] */
    public float[] d(wxc wxcVar, float f, float f2, int i, int i2) {
        int i3 = ((int) (((i2 - i) * f) + 1.0f)) * 2;
        if (this.d.length != i3) {
            this.d = new float[i3];
        }
        float[] fArr = this.d;
        for (int i4 = 0; i4 < i3; i4 += 2) {
            ?? I = wxcVar.i((i4 / 2) + i);
            if (I != 0) {
                fArr[i4] = I.getX();
                fArr[i4 + 1] = I.getY() * f2;
            } else {
                fArr[i4] = 0.0f;
                fArr[i4 + 1] = 0.0f;
            }
        }
        f().mapPoints(fArr);
        return fArr;
    }

    public vye e(float f, float f2) {
        float[] fArr = this.i;
        fArr[0] = f;
        fArr[1] = f2;
        k(fArr);
        float[] fArr2 = this.i;
        return vye.b(fArr2[0], fArr2[1]);
    }

    public Matrix f() {
        this.j.set(this.f33073a);
        this.j.postConcat(this.c.f20550a);
        this.j.postConcat(this.f33074b);
        return this.j;
    }

    public vye g(float f, float f2) {
        vye vyeVarB = vye.b(0.0d, 0.0d);
        h(f, f2, vyeVarB);
        return vyeVarB;
    }

    public void h(float f, float f2, vye vyeVar) {
        float[] fArr = this.i;
        fArr[0] = f;
        fArr[1] = f2;
        j(fArr);
        float[] fArr2 = this.i;
        vyeVar.c = fArr2[0];
        vyeVar.d = fArr2[1];
    }

    public void i(Path path) {
        path.transform(this.f33073a);
        path.transform(this.c.q());
        path.transform(this.f33074b);
    }

    public void j(float[] fArr) {
        Matrix matrix = this.h;
        matrix.reset();
        this.f33074b.invert(matrix);
        matrix.mapPoints(fArr);
        this.c.q().invert(matrix);
        matrix.mapPoints(fArr);
        this.f33073a.invert(matrix);
        matrix.mapPoints(fArr);
    }

    public void k(float[] fArr) {
        this.f33073a.mapPoints(fArr);
        this.c.q().mapPoints(fArr);
        this.f33074b.mapPoints(fArr);
    }

    public void l(boolean z) {
        this.f33074b.reset();
        if (!z) {
            this.f33074b.postTranslate(this.c.I(), this.c.m() - this.c.H());
        } else {
            this.f33074b.setTranslate(this.c.I(), -this.c.K());
            this.f33074b.postScale(1.0f, -1.0f);
        }
    }

    public void m(float f, float f2, float f3, float f4) {
        float fK = this.c.k() / f2;
        float fG = this.c.g() / f3;
        if (Float.isInfinite(fK)) {
            fK = 0.0f;
        }
        if (Float.isInfinite(fG)) {
            fG = 0.0f;
        }
        this.f33073a.reset();
        this.f33073a.postTranslate(-f, -f4);
        this.f33073a.postScale(fK, -fG);
    }

    public void n(RectF rectF, float f) {
        rectF.top *= f;
        rectF.bottom *= f;
        this.f33073a.mapRect(rectF);
        this.c.q().mapRect(rectF);
        this.f33074b.mapRect(rectF);
    }

    public void o(RectF rectF, float f) {
        rectF.left *= f;
        rectF.right *= f;
        this.f33073a.mapRect(rectF);
        this.c.q().mapRect(rectF);
        this.f33074b.mapRect(rectF);
    }

    public void p(RectF rectF) {
        this.f33073a.mapRect(rectF);
        this.c.q().mapRect(rectF);
        this.f33074b.mapRect(rectF);
    }
}
