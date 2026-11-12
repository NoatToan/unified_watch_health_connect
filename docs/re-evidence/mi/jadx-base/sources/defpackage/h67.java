package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public class h67 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e67 f19737b;
    public boolean c;
    public boolean d;
    public int l;
    public int m;
    public boolean[] o;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 0.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public RectF j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Paint f19738k = new Paint();
    public boolean n = false;

    public h67(Context context, e67 e67Var, boolean z) {
        boolean z2 = false;
        this.f19736a = context;
        this.f19737b = e67Var;
        this.d = z;
        if (pwk.a() >= 2 && zvf.f41714a) {
            z2 = true;
        }
        this.c = z2;
        j(z, context.getResources().getDisplayMetrics().density, e67Var);
    }

    public void a(Canvas canvas, float f) {
        if (this.c) {
            return;
        }
        canvas.drawRoundRect(this.j, f, f, this.f19738k);
    }

    public void b(View view, boolean z, int i) {
        if (this.n == z) {
            return;
        }
        this.n = z;
        if (!z) {
            if (this.c) {
                zvf.a(view);
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object parent = view.getParent();
                if (parent == null) {
                    break;
                }
                ((ViewGroup) parent).setClipChildren(this.o[i2]);
                view = (View) parent;
            }
            this.o = null;
            return;
        }
        if (this.c) {
            int i3 = this.l;
            float f = this.e;
            float f2 = this.f;
            float f3 = this.g;
            e67 e67Var = this.f19737b;
            zvf.d(view, i3, f, f2, f3, e67Var.g, e67Var.h);
        }
        this.o = new boolean[i];
        for (int i4 = 0; i4 < i; i4++) {
            Object parent2 = view.getParent();
            if (parent2 == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent2;
            this.o[i4] = viewGroup.getClipChildren();
            viewGroup.setClipChildren(false);
            view = (View) parent2;
        }
    }

    public RectF c() {
        return this.j;
    }

    public boolean d() {
        return this.c;
    }

    public void e(View view, Configuration configuration, boolean z) {
        this.d = z;
        j(z, (configuration.densityDpi * 1.0f) / 160.0f, this.f19737b);
        if (this.c) {
            int i = this.l;
            float f = this.e;
            float f2 = this.f;
            float f3 = this.g;
            e67 e67Var = this.f19737b;
            zvf.d(view, i, f, f2, f3, e67Var.g, e67Var.h);
        }
    }

    public void f(float f, e67 e67Var) {
        this.e = s6g.c(f, e67Var.e);
        this.f = s6g.c(f, e67Var.f);
        this.g = s6g.c(f, e67Var.d);
    }

    public void g(boolean z) {
        this.c = z;
    }

    public void h(View view, e67 e67Var) {
        this.f19737b = e67Var;
        j(this.d, this.f19736a.getResources().getDisplayMetrics().density, e67Var);
        if (!this.c) {
            view.invalidate();
            return;
        }
        int i = this.l;
        float f = this.e;
        float f2 = this.f;
        float f3 = this.g;
        e67 e67Var2 = this.f19737b;
        zvf.d(view, i, f, f2, f3, e67Var2.g, e67Var2.h);
    }

    public void i(int i, int i2, int i3, int i4) {
        this.j.set(0.0f, 0.0f, i3 - i, i4 - i2);
    }

    public void j(boolean z, float f, e67 e67Var) {
        int i = z ? e67Var.f16305a : e67Var.f16306b;
        this.l = i;
        this.m = (i >> 24) & 255;
        this.f19738k.setColor(i);
        if (this.i != f) {
            this.i = f;
        }
        f(f, e67Var);
        this.f19738k.setShadowLayer(this.g, this.e, this.f, this.l);
    }
}
