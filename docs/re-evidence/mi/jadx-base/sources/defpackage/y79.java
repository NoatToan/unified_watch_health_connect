package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public class y79 extends jj1 {
    public final Drawable[] i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f39886k;
    public int l;
    public int m;
    public long n;
    public int[] o;
    public int[] p;
    public int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean[] f39887r;
    public int s;

    public y79(Drawable[] drawableArr) {
        this(drawableArr, false);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0054 A[LOOP:0: B:25:0x004f->B:27:0x0054, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065 A[EDGE_INSN: B:31:0x0065->B:28:0x0065 BREAK  A[LOOP:0: B:25:0x004f->B:27:0x0054], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jj1, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean zS;
        Drawable[] drawableArr;
        int i = this.l;
        int i2 = 0;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                b6i.i(this.m > 0);
                zS = s((p() - this.n) / this.m);
                this.l = zS ? 2 : 1;
            }
            while (true) {
                drawableArr = this.i;
                if (i2 < drawableArr.length) {
                    break;
                }
                j(canvas, drawableArr[i2], (this.p[i2] * this.q) / 255);
                i2++;
            }
            if (z) {
            }
            invalidateSelf();
        }
        System.arraycopy(this.p, 0, this.o, 0, this.i.length);
        this.n = p();
        zS = s(this.m == 0 ? 1.0f : 0.0f);
        this.l = zS ? 2 : 1;
        z = zS;
        while (true) {
            drawableArr = this.i;
            if (i2 < drawableArr.length) {
                break;
                break;
            } else {
                j(canvas, drawableArr[i2], (this.p[i2] * this.q) / 255);
                i2++;
            }
        }
        if (z) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q;
    }

    public void h() {
        this.s++;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.s == 0) {
            super.invalidateSelf();
        }
    }

    public final void j(Canvas canvas, Drawable drawable, int i) {
        if (drawable == null || i <= 0) {
            return;
        }
        this.s++;
        drawable.mutate().setAlpha(i);
        this.s--;
        drawable.draw(canvas);
    }

    public void k() {
        this.s--;
        invalidateSelf();
    }

    public void l() {
        this.l = 0;
        Arrays.fill(this.f39887r, true);
        invalidateSelf();
    }

    public void m(int i) {
        this.l = 0;
        this.f39887r[i] = true;
        invalidateSelf();
    }

    public void n(int i) {
        this.l = 0;
        this.f39887r[i] = false;
        invalidateSelf();
    }

    public void o() {
        this.l = 2;
        for (int i = 0; i < this.i.length; i++) {
            this.p[i] = this.f39887r[i] ? 255 : 0;
        }
        invalidateSelf();
    }

    public long p() {
        return SystemClock.uptimeMillis();
    }

    public final void q() {
        this.l = 2;
        Arrays.fill(this.o, this.f39886k);
        this.o[0] = 255;
        Arrays.fill(this.p, this.f39886k);
        this.p[0] = 255;
        Arrays.fill(this.f39887r, this.j);
        this.f39887r[0] = true;
    }

    public void r(int i) {
        this.m = i;
        if (this.l == 1) {
            this.l = 0;
        }
    }

    public final boolean s(float f) {
        boolean z = true;
        for (int i = 0; i < this.i.length; i++) {
            boolean z2 = this.f39887r[i];
            int i2 = z2 ? 1 : -1;
            int[] iArr = this.p;
            int i3 = (int) (this.o[i] + (i2 * 255 * f));
            iArr[i] = i3;
            if (i3 < 0) {
                iArr[i] = 0;
            }
            if (iArr[i] > 255) {
                iArr[i] = 255;
            }
            if (z2 && iArr[i] < 255) {
                z = false;
            }
            if (!z2 && iArr[i] > 0) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.jj1, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.q != i) {
            this.q = i;
            invalidateSelf();
        }
    }

    public y79(Drawable[] drawableArr, boolean z) {
        super(drawableArr);
        b6i.j(drawableArr.length >= 1, "At least one layer required!");
        this.i = drawableArr;
        this.o = new int[drawableArr.length];
        this.p = new int[drawableArr.length];
        this.q = 255;
        this.f39887r = new boolean[drawableArr.length];
        this.s = 0;
        this.j = z;
        this.f39886k = z ? 255 : 0;
        q();
    }
}
