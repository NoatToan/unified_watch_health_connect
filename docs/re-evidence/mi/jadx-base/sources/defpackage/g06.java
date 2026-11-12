package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import defpackage.fa2;

/* JADX INFO: loaded from: classes5.dex */
public final class g06<S extends fa2> extends b57 {
    public static final dy9<g06> u = new a("indicatorLevel");
    public q57<S> p;
    public final u7o q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r7o f18412r;
    public float s;
    public boolean t;

    public class a extends dy9<g06> {
        public a(String str) {
            super(str);
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(g06 g06Var) {
            return g06Var.x() * 10000.0f;
        }

        @Override // defpackage.dy9
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(g06 g06Var, float f) {
            g06Var.z(f / 10000.0f);
        }
    }

    public g06(Context context, fa2 fa2Var, q57<S> q57Var) {
        super(context, fa2Var);
        this.t = false;
        y(q57Var);
        u7o u7oVar = new u7o();
        this.q = u7oVar;
        u7oVar.d(1.0f);
        u7oVar.f(50.0f);
        r7o r7oVar = new r7o(this, u);
        this.f18412r = r7oVar;
        r7oVar.q(u7oVar);
        m(1.0f);
    }

    public static g06<CircularProgressIndicatorSpec> u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new g06<>(context, circularProgressIndicatorSpec, new sw3(circularProgressIndicatorSpec));
    }

    public static g06<LinearProgressIndicatorSpec> v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new g06<>(context, linearProgressIndicatorSpec, new kge(linearProgressIndicatorSpec));
    }

    public void A(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public void addSpringAnimationEndListener(z67.p pVar) {
        this.f18412r.a(pVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.p.g(canvas, g());
            this.p.c(canvas, this.m);
            this.p.b(canvas, this.m, 0.0f, x(), i8f.a(this.f3811b.c[0], getAlpha()));
            canvas.restore();
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

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f18412r.r();
        z(getLevel() / 10000.0f);
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ void l(cb1 cb1Var) {
        super.l(cb1Var);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        if (this.t) {
            this.f18412r.r();
            z(i / 10000.0f);
            return true;
        }
        this.f18412r.i(x() * 10000.0f);
        this.f18412r.m(i);
        return true;
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean p(boolean z, boolean z2, boolean z3) {
        return super.p(z, z2, z3);
    }

    @Override // defpackage.b57
    public boolean q(boolean z, boolean z2, boolean z3) {
        boolean zQ = super.q(z, z2, z3);
        float fA = this.c.a(this.f3810a.getContentResolver());
        if (fA == 0.0f) {
            this.t = true;
        } else {
            this.t = false;
            this.q.f(50.0f / fA);
        }
        return zQ;
    }

    @Override // defpackage.b57
    public /* bridge */ /* synthetic */ boolean r(cb1 cb1Var) {
        return super.r(cb1Var);
    }

    public void removeSpringAnimationEndListener(z67.p pVar) {
        this.f18412r.removeEndListener(pVar);
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

    public q57<S> w() {
        return this.p;
    }

    public final float x() {
        return this.s;
    }

    public void y(q57<S> q57Var) {
        this.p = q57Var;
        q57Var.f(this);
    }

    public final void z(float f) {
        this.s = f;
        invalidateSelf();
    }
}
