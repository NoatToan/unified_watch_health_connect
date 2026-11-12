package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class hc1 extends gc1 implements Animator.AnimatorListener {
    public static e4h<hc1> t = e4h.a(8, new hc1(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0));
    public float m;
    public float n;
    public float o;
    public float p;
    public YAxis q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f19922r;
    public Matrix s;

    @SuppressLint({"NewApi"})
    public hc1(hwq hwqVar, View view, ryp rypVar, YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        super(hwqVar, f2, f3, rypVar, view, f4, f5, j);
        this.s = new Matrix();
        this.o = f6;
        this.p = f7;
        this.m = f8;
        this.n = f9;
        this.i.addListener(this);
        this.q = yAxis;
        this.f19922r = f;
    }

    public static hc1 d(hwq hwqVar, View view, ryp rypVar, YAxis yAxis, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long j) {
        hc1 hc1Var = (hc1) t.b();
        hc1Var.d = hwqVar;
        hc1Var.e = f2;
        hc1Var.f = f3;
        hc1Var.g = rypVar;
        hc1Var.h = view;
        hc1Var.f18820k = f4;
        hc1Var.l = f5;
        hc1Var.q = yAxis;
        hc1Var.f19922r = f;
        hc1Var.c();
        hc1Var.i.setDuration(j);
        return hc1Var;
    }

    @Override // e4h.a
    public e4h.a a() {
        return new hc1(null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    @Override // defpackage.gc1
    public void b() {
    }

    @Override // defpackage.gc1, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
    }

    @Override // defpackage.gc1, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        ((BarLineChartBase) this.h).calculateOffsets();
        this.h.postInvalidate();
    }

    @Override // defpackage.gc1, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // defpackage.gc1, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f = this.f18820k;
        float f2 = this.e - f;
        float f3 = this.j;
        float f4 = f + (f2 * f3);
        float f5 = this.l;
        float f6 = f5 + ((this.f - f5) * f3);
        Matrix matrix = this.s;
        this.d.X(f4, f6, matrix);
        this.d.L(matrix, this.h, false);
        float fS = this.q.mAxisRange / this.d.s();
        float fR = this.f19922r / this.d.r();
        float[] fArr = this.c;
        float f7 = this.m;
        float f8 = (this.o - (fR / 2.0f)) - f7;
        float f9 = this.j;
        fArr[0] = f7 + (f8 * f9);
        float f10 = this.n;
        fArr[1] = f10 + (((this.p + (fS / 2.0f)) - f10) * f9);
        this.g.k(fArr);
        this.d.Y(this.c, matrix);
        this.d.L(matrix, this.h, true);
    }
}
