package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public class gza extends ViewGroup implements dza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewGroup f19491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f19492b;
    public final View c;
    public int d;
    public Matrix e;
    public final ViewTreeObserver.OnPreDrawListener f;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            c.h0(gza.this);
            gza gzaVar = gza.this;
            ViewGroup viewGroup = gzaVar.f19491a;
            if (viewGroup == null || (view = gzaVar.f19492b) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            c.h0(gza.this.f19491a);
            gza gzaVar2 = gza.this;
            gzaVar2.f19491a = null;
            gzaVar2.f19492b = null;
            return true;
        }
    }

    public gza(View view) {
        super(view.getContext());
        this.f = new a();
        this.c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    public static gza b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        eza ezaVar;
        if (!(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
        }
        eza ezaVarB = eza.b(viewGroup);
        gza gzaVarE = e(view);
        if (gzaVarE == null || (ezaVar = (eza) gzaVarE.getParent()) == ezaVarB) {
            i = 0;
        } else {
            i = gzaVarE.d;
            ezaVar.removeView(gzaVarE);
            gzaVarE = null;
        }
        if (gzaVarE == null) {
            if (matrix == null) {
                matrix = new Matrix();
                c(view, viewGroup, matrix);
            }
            gzaVarE = new gza(view);
            gzaVarE.h(matrix);
            if (ezaVarB == null) {
                ezaVarB = new eza(viewGroup);
            } else {
                ezaVarB.g();
            }
            d(viewGroup, ezaVarB);
            d(viewGroup, gzaVarE);
            ezaVarB.a(gzaVarE);
            gzaVarE.d = i;
        } else if (matrix != null) {
            gzaVarE.h(matrix);
        }
        gzaVarE.d++;
        return gzaVarE;
    }

    public static void c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        byq.j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        byq.k(viewGroup, matrix);
    }

    public static void d(View view, View view2) {
        byq.g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    public static gza e(View view) {
        return (gza) view.getTag(ypi.f40402a);
    }

    public static void f(View view) {
        gza gzaVarE = e(view);
        if (gzaVarE != null) {
            int i = gzaVarE.d - 1;
            gzaVarE.d = i;
            if (i <= 0) {
                ((eza) gzaVarE.getParent()).removeView(gzaVarE);
            }
        }
    }

    public static void g(View view, gza gzaVar) {
        view.setTag(ypi.f40402a, gzaVar);
    }

    @Override // defpackage.dza
    public void a(ViewGroup viewGroup, View view) {
        this.f19491a = viewGroup;
        this.f19492b = view;
    }

    public void h(Matrix matrix) {
        this.e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        g(this.c, this);
        this.c.getViewTreeObserver().addOnPreDrawListener(this.f);
        byq.i(this.c, 4);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.c.getViewTreeObserver().removeOnPreDrawListener(this.f);
        byq.i(this.c, 0);
        g(this.c, null);
        if (this.c.getParent() != null) {
            ((View) this.c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        cj3.a(canvas, true);
        canvas.setMatrix(this.e);
        byq.i(this.c, 0);
        this.c.invalidate();
        byq.i(this.c, 4);
        drawChild(canvas, this.c, getDrawingTime());
        cj3.a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, defpackage.dza
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (e(this.c) == this) {
            byq.i(this.c, i == 0 ? 4 : 0);
        }
    }
}
