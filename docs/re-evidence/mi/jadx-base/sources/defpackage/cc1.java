package defpackage;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi"})
public class cc1 extends gc1 {
    public static e4h<cc1> m;

    static {
        e4h<cc1> e4hVarA = e4h.a(4, new cc1(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L));
        m = e4hVarA;
        e4hVarA.g(0.5f);
    }

    public cc1(hwq hwqVar, float f, float f2, ryp rypVar, View view, float f3, float f4, long j) {
        super(hwqVar, f, f2, rypVar, view, f3, f4, j);
    }

    public static cc1 d(hwq hwqVar, float f, float f2, ryp rypVar, View view, float f3, float f4, long j) {
        cc1 cc1Var = (cc1) m.b();
        cc1Var.d = hwqVar;
        cc1Var.e = f;
        cc1Var.f = f2;
        cc1Var.g = rypVar;
        cc1Var.h = view;
        cc1Var.f18820k = f3;
        cc1Var.l = f4;
        cc1Var.i.setDuration(j);
        return cc1Var;
    }

    public static void e(cc1 cc1Var) {
        m.c(cc1Var);
    }

    @Override // e4h.a
    public e4h.a a() {
        return new cc1(null, 0.0f, 0.0f, null, null, 0.0f, 0.0f, 0L);
    }

    @Override // defpackage.gc1
    public void b() {
        e(this);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = this.c;
        float f = this.f18820k;
        float f2 = this.e - f;
        float f3 = this.j;
        fArr[0] = f + (f2 * f3);
        float f4 = this.l;
        fArr[1] = f4 + ((this.f - f4) * f3);
        this.g.k(fArr);
        this.d.e(this.c, this.h);
    }
}
