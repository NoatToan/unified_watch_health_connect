package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public class m5g implements b43 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f25771b;
    public final boolean c;
    public final a d;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public boolean i = false;
    public int[] j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f25772k = null;
    public int l = 0;
    public boolean m = true;
    public int n;

    public interface a {
        void a(m5g m5gVar);

        void b(boolean z);

        void c(boolean z);
    }

    public m5g(Context context, View view, boolean z, a aVar) {
        this.f25770a = context;
        this.f25771b = view;
        this.c = z;
        this.d = aVar;
        if (z) {
            this.n = 2;
        } else {
            this.n = 1;
        }
    }

    public static int[] c(Context context, int i, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        if (i == 0) {
            Drawable drawableH = hm1.h(context, R.attr.windowBackground);
            if (drawableH instanceof ColorDrawable) {
                i = ((ColorDrawable) drawableH).getColor();
            }
        }
        if (i != 0) {
            iArr2[1] = (16777215 & i) | ((-16777216) & iArr[1]);
        }
        return iArr2;
    }

    public static int[] d(Context context, Drawable drawable, int[] iArr) {
        return c(context, (drawable == null || !(drawable instanceof ColorDrawable)) ? 0 : ((ColorDrawable) drawable).getColor(), iArr);
    }

    public final void a(boolean z) {
        float f;
        if (!this.e || !this.g || this.i == z) {
            return;
        }
        this.i = z;
        int i = 0;
        if (!z) {
            n5g.c(this.f25771b);
            n5g.b(this.f25771b);
            this.d.c(false);
            return;
        }
        if (this.j == null) {
            this.d.a(this);
        }
        this.d.c(true);
        try {
            f = this.f25771b.getContext().getResources().getDisplayMetrics().density;
            while (true) {
                int[] iArr = this.j;
                if (i >= iArr.length) {
                    return;
                }
                n5g.a(this.f25771b, iArr[i], this.f25772k[i]);
                i++;
            }
        } catch (Exception unused) {
            f = 2.75f;
        }
        if (this.m) {
            n5g.g(this.f25771b, (int) ((this.l * f) + 0.5f), this.n);
        } else {
            n5g.j(this.f25771b, this.n);
        }
    }

    public void b(boolean z) {
        this.m = z;
        k();
    }

    @Override // defpackage.b43
    public void e(boolean z) {
        this.h = z;
        a(z);
    }

    public boolean f() {
        return this.h;
    }

    public boolean g() {
        return this.f;
    }

    public boolean h() {
        return this.e;
    }

    public void i() {
        k();
        if (!n5g.e(this.f25770a)) {
            n(false);
        } else if (n5g.f() && n5g.e(this.f25770a) && g()) {
            n(true);
        }
    }

    public void j() {
        float f;
        if (!this.i) {
            return;
        }
        int i = 0;
        if (this.j == null) {
            if (this.m) {
                n5g.c(this.f25771b);
            } else {
                n5g.j(this.f25771b, 0);
            }
            n5g.b(this.f25771b);
            this.d.a(this);
        }
        try {
            f = this.f25771b.getContext().getResources().getDisplayMetrics().density;
            while (true) {
                int[] iArr = this.j;
                if (i >= iArr.length) {
                    return;
                }
                n5g.a(this.f25771b, iArr[i], this.f25772k[i]);
                i++;
            }
        } catch (Exception unused) {
            f = 2.75f;
        }
        this.d.c(true);
        if (this.m) {
            n5g.h(this.f25771b, (int) ((this.l * f) + 0.5f), this.c);
        } else {
            n5g.j(this.f25771b, this.n);
        }
    }

    public void k() {
        this.j = null;
        this.f25772k = null;
        this.l = 0;
    }

    public void l(int[] iArr, int[] iArr2, int i) {
        this.j = iArr;
        this.f25772k = iArr2;
        this.l = i;
    }

    public void m(boolean z) {
        if (this.e) {
            this.f = z;
            if (n5g.e(this.f25770a)) {
                n(this.f);
            }
        }
    }

    public final void n(boolean z) {
        if (this.g != z) {
            if (!z) {
                this.h = f();
                a(false);
            }
            this.g = z;
            this.d.b(z);
            if (z && this.h) {
                a(true);
            }
        }
    }

    public void o(boolean z) {
        this.e = z;
    }
}
