package o4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Region;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo4/c;", "Lo4/y;", "<init>", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f128816a = d.f128822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Rect f128817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f128818c;

    @Override // o4.y
    public final void a(float f14, float f15, float f16, float f17, int i14) {
        Canvas canvas = this.f128816a;
        c0.f128819b.getClass();
        canvas.clipRect(f14, f15, f16, f17, i14 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // o4.y
    public final void b(float f14, long j8, d1 d1Var) {
        this.f128816a.drawCircle(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), f14, i.a(d1Var));
    }

    @Override // o4.y
    public final void c(n4.d dVar, d1 d1Var) {
        this.f128816a.saveLayer(dVar.f123547a, dVar.f123548b, dVar.f123549c, dVar.f123550d, i.a(d1Var), 31);
    }

    @Override // o4.y
    public final void d(v0 v0Var, long j8, d1 d1Var) {
        this.f128816a.drawBitmap(g.a(v0Var), Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), i.a(d1Var));
    }

    @Override // o4.y
    public final void e() {
        a0 a0Var = a0.f128803a;
        Canvas canvas = this.f128816a;
        a0Var.getClass();
        a0.a(canvas, false);
    }

    @Override // o4.y
    public final void g(float f14, float f15) {
        this.f128816a.scale(f14, f15);
    }

    @Override // o4.y
    public final void i() {
        this.f128816a.restore();
    }

    @Override // o4.y
    public final void k(float f14, float f15, float f16, float f17, d1 d1Var) {
        this.f128816a.drawRect(f14, f15, f16, f17, i.a(d1Var));
    }

    @Override // o4.y
    public final void l() {
        this.f128816a.save();
    }

    @Override // o4.y
    public final void m(float f14, float f15, float f16, float f17, float f18, float f19, d1 d1Var) {
        this.f128816a.drawArc(f14, f15, f16, f17, f18, f19, false, i.a(d1Var));
    }

    @Override // o4.y
    public final void n(float[] fArr) {
        if (l1.c(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        l1.e(fArr, matrix);
        this.f128816a.concat(matrix);
    }

    @Override // o4.y
    public final void o(float f14, float f15, float f16, float f17, float f18, float f19, d1 d1Var) {
        this.f128816a.drawRoundRect(f14, f15, f16, f17, f18, f19, i.a(d1Var));
    }

    @Override // o4.y
    public final void p(v0 v0Var, long j8, long j14, long j15, long j16, d1 d1Var) {
        if (this.f128817b == null) {
            this.f128817b = new Rect();
            this.f128818c = new Rect();
        }
        Canvas canvas = this.f128816a;
        Bitmap bitmapA = g.a(v0Var);
        Rect rect = this.f128817b;
        rect.getClass();
        g6.k.a aVar = g6.k.f76003b;
        int i14 = (int) (j8 >> 32);
        rect.left = i14;
        int i15 = (int) (j8 & 4294967295L);
        rect.top = i15;
        rect.right = i14 + ((int) (j14 >> 32));
        rect.bottom = i15 + ((int) (j14 & 4294967295L));
        Unit unit = Unit.INSTANCE;
        Rect rect2 = this.f128818c;
        rect2.getClass();
        int i16 = (int) (j15 >> 32);
        rect2.left = i16;
        int i17 = (int) (j15 & 4294967295L);
        rect2.top = i17;
        rect2.right = i16 + ((int) (j16 >> 32));
        rect2.bottom = i17 + ((int) (j16 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, i.a(d1Var));
    }

    @Override // o4.y
    public final void q(float f14, float f15) {
        this.f128816a.translate(f14, f15);
    }

    @Override // o4.y
    public final void r(f1 f1Var, d1 d1Var) {
        Canvas canvas = this.f128816a;
        if (f1Var instanceof j) {
            canvas.drawPath(((j) f1Var).f128869b, i.a(d1Var));
        } else {
            org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
        }
    }

    @Override // o4.y
    public final void s(f1 f1Var, int i14) {
        Canvas canvas = this.f128816a;
        if (!(f1Var instanceof j)) {
            org.apache.commons.lang3.e.w("Unable to obtain android.graphics.Path");
            return;
        }
        Path path = ((j) f1Var).f128869b;
        c0.f128819b.getClass();
        canvas.clipPath(path, i14 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // o4.y
    public final void t() {
        a0 a0Var = a0.f128803a;
        Canvas canvas = this.f128816a;
        a0Var.getClass();
        a0.a(canvas, true);
    }

    @Override // o4.y
    public final void u(float f14) {
        this.f128816a.rotate(f14);
    }

    @Override // o4.y
    public final void v(long j8, long j14, d1 d1Var) {
        this.f128816a.drawLine(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)), i.a(d1Var));
    }
}
