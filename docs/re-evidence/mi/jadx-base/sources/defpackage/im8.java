package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import miuix.miuixbasewidget.widget.a;

/* JADX INFO: loaded from: classes3.dex */
public class im8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f21289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f21290b;
    public boolean c;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21291k;
    public int l;
    public boolean[] n;
    public float d = 0.0f;
    public float e = 0.0f;
    public float f = 0.0f;
    public float g = 1.0f;
    public float h = 0.0f;
    public RectF i = new RectF();
    public Paint j = new Paint();
    public boolean m = false;

    public im8(Context context, a aVar, boolean z) {
        boolean z2 = false;
        this.f21289a = context;
        this.f21290b = aVar;
        if (pwk.a() >= 2 && zvf.f41714a) {
            z2 = true;
        }
        this.c = z2;
        h(z, context.getResources().getDisplayMetrics().density, aVar);
    }

    public void a(Canvas canvas, float f) {
        if (this.c) {
            return;
        }
        canvas.drawRoundRect(this.i, f, f, this.j);
    }

    public void b(View view, boolean z, int i) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        if (!z) {
            if (this.c) {
                zvf.a(view);
            }
            for (int i2 = 0; i2 < i; i2++) {
                Object parent = view.getParent();
                if (parent == null) {
                    break;
                }
                ((ViewGroup) parent).setClipChildren(this.n[i2]);
                view = (View) parent;
            }
            this.n = null;
            return;
        }
        if (this.c) {
            zvf.b(view, this.f21291k, this.d, this.e, this.f);
        }
        this.n = new boolean[i];
        for (int i3 = 0; i3 < i; i3++) {
            Object parent2 = view.getParent();
            if (parent2 == null) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) parent2;
            this.n[i3] = viewGroup.getClipChildren();
            viewGroup.setClipChildren(false);
            view = (View) parent2;
        }
    }

    public void c(View view, float f) {
        f(f);
        if (this.c) {
            zvf.b(view, this.f21291k, this.d, this.e, this.f);
        }
    }

    public void d(View view, Configuration configuration, boolean z) {
        h(z, (configuration.densityDpi * 1.0f) / 160.0f, this.f21290b);
        if (this.c) {
            zvf.b(view, this.f21291k, this.d, this.e, this.f);
        }
    }

    public void e(float f, a aVar) {
        this.d = s6g.c(f, aVar.e);
        this.e = s6g.c(f, aVar.f);
        this.f = s6g.c(f, aVar.d);
    }

    public void f(float f) {
        if (this.g != f) {
            this.g = f;
            int i = (((int) (this.l * f)) << 24) | (16777215 & this.f21291k);
            this.f21291k = i;
            this.j.setColor(i);
            this.j.setShadowLayer(this.f, this.d, this.e, this.f21291k);
        }
    }

    public void g(int i, int i2, int i3, int i4) {
        this.i.set(0.0f, 0.0f, i3 - i, i4 - i2);
    }

    public void h(boolean z, float f, a aVar) {
        int i = z ? aVar.f26678a : aVar.f26679b;
        this.f21291k = i;
        this.l = (i >> 24) & 255;
        this.j.setColor(i);
        if (this.h != f) {
            this.h = f;
            e(f, aVar);
        }
        this.j.setShadowLayer(this.f, this.d, this.e, this.f21291k);
    }
}
