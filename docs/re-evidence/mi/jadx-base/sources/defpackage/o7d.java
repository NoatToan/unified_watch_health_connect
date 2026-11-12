package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import defpackage.fa2;

/* JADX INFO: loaded from: classes5.dex */
public final class o7d<S extends fa2> extends b57 {
    public q57<S> p;
    public n7d<ObjectAnimator> q;

    public o7d(Context context, fa2 fa2Var, q57<S> q57Var, n7d<ObjectAnimator> n7dVar) {
        super(context, fa2Var);
        x(q57Var);
        w(n7dVar);
    }

    public static o7d<CircularProgressIndicatorSpec> s(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new o7d<>(context, circularProgressIndicatorSpec, new sw3(circularProgressIndicatorSpec), new uw3(circularProgressIndicatorSpec));
    }

    public static o7d<LinearProgressIndicatorSpec> t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new o7d<>(context, linearProgressIndicatorSpec, new kge(linearProgressIndicatorSpec), linearProgressIndicatorSpec.g == 0 ? new nge(linearProgressIndicatorSpec) : new oge(context, linearProgressIndicatorSpec));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        this.p.g(canvas, g());
        this.p.c(canvas, this.m);
        int i = 0;
        while (true) {
            n7d<ObjectAnimator> n7dVar = this.q;
            int[] iArr = n7dVar.c;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            q57<S> q57Var = this.p;
            Paint paint = this.m;
            float[] fArr = n7dVar.f27617b;
            int i2 = i * 2;
            q57Var.b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // defpackage.b57, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.p.d();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.p.e();
    }

    @Override // defpackage.b57, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // defpackage.b57, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ void l(cb1 cb1Var) {
        super.l(cb1Var);
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean p(boolean z, boolean z2, boolean z3) {
        return super.p(z, z2, z3);
    }

    @Override // defpackage.b57
    public boolean q(boolean z, boolean z2, boolean z3) {
        boolean zQ = super.q(z, z2, z3);
        if (!isRunning()) {
            this.q.a();
        }
        this.c.a(this.f3810a.getContentResolver());
        if (z && z3) {
            this.q.g();
        }
        return zQ;
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean r(cb1 cb1Var) {
        return super.r(cb1Var);
    }

    @Override // defpackage.b57, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    @Override // defpackage.b57, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // defpackage.b57, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    @Override // defpackage.b57, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // defpackage.b57, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public n7d<ObjectAnimator> u() {
        return this.q;
    }

    public q57<S> v() {
        return this.p;
    }

    public void w(n7d<ObjectAnimator> n7dVar) {
        this.q = n7dVar;
        n7dVar.e(this);
    }

    public void x(q57<S> q57Var) {
        this.p = q57Var;
        q57Var.f(this);
    }
}
