package miuix.appcompat.internal.view;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.e67;
import defpackage.h67;
import defpackage.hm1;
import defpackage.j67;
import defpackage.zhi;

/* JADX INFO: loaded from: classes3.dex */
public class OutDropShadowView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h67 f26491b;
    public Path c;
    public float d;

    public OutDropShadowView(Context context) {
        super(context);
        this.f26490a = 0;
        this.c = new Path();
        a();
    }

    public final void a() {
        this.d = getContext().getResources().getDisplayMetrics().densityDpi;
        j67 j67Var = new j67(getContext(), new e67.a(50.0f).e(6).a(), hm1.d(getContext(), zhi.F, true));
        this.f26491b = j67Var;
        j67Var.g(false);
        this.f26491b.i(0, 0, getMeasuredWidth(), getMeasuredHeight());
        setBackgroundColor(0);
        setImportantForAccessibility(4);
    }

    public void b() {
        this.f26491b.b(this, false, 2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        if (this.f26491b != null) {
            canvas.clipOutPath(this.c);
            this.f26491b.a(canvas, this.f26490a);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26491b.b(this, true, 2);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        h67 h67Var;
        if (configuration.densityDpi == this.d || (h67Var = this.f26491b) == null) {
            return;
        }
        h67Var.e(this, configuration, hm1.d(getContext(), zhi.F, true));
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        h67 h67Var = this.f26491b;
        if (h67Var != null) {
            h67Var.i(i, i2, i3, i4);
            this.c.reset();
            Path path = this.c;
            RectF rectFC = this.f26491b.c();
            int i5 = this.f26490a;
            path.addRoundRect(rectFC, i5, i5, Path.Direction.CW);
        }
    }

    public void setShadowHostViewRadius(int i) {
        this.f26490a = i;
        this.c.reset();
        Path path = this.c;
        RectF rectFC = this.f26491b.c();
        int i2 = this.f26490a;
        path.addRoundRect(rectFC, i2, i2, Path.Direction.CW);
    }

    public OutDropShadowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26490a = 0;
        this.c = new Path();
        a();
    }

    public OutDropShadowView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26490a = 0;
        this.c = new Path();
        a();
    }
}
