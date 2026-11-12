package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.oqf;
import defpackage.p3b;
import defpackage.smi;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f1513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f1514b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public i.a i;
    public oqf j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f1515k;
    public final PopupWindow.OnDismissListener l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    @RequiresApi(17)
    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public h(Context context, e eVar, View view, boolean z, int i) {
        this(context, eVar, view, z, i, 0);
    }

    public final oqf a() {
        Display defaultDisplay = ((WindowManager) this.f1513a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        oqf bVar = Math.min(point.x, point.y) >= this.f1513a.getResources().getDimensionPixelSize(smi.c) ? new androidx.appcompat.view.menu.b(this.f1513a, this.f, this.d, this.e, this.c) : new j(this.f1513a, this.f1514b, this.f, this.d, this.e, this.c);
        bVar.h(this.f1514b);
        bVar.setOnDismissListener(this.l);
        bVar.l(this.f);
        bVar.f(this.i);
        bVar.o(this.h);
        bVar.p(this.g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public oqf c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        oqf oqfVar = this.j;
        return oqfVar != null && oqfVar.isShowing();
    }

    public void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f1515k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f = view;
    }

    public void g(boolean z) {
        this.h = z;
        oqf oqfVar = this.j;
        if (oqfVar != null) {
            oqfVar.o(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(i.a aVar) {
        this.i = aVar;
        oqf oqfVar = this.j;
        if (oqfVar != null) {
            oqfVar.f(aVar);
        }
    }

    public void j() {
        if (!l()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void k(int i, int i2, boolean z, boolean z2) {
        oqf oqfVarC = c();
        oqfVarC.r(z2);
        if (z) {
            if ((p3b.b(this.g, androidx.core.view.c.A(this.f)) & 7) == 5) {
                i -= this.f.getWidth();
            }
            oqfVarC.q(i);
            oqfVarC.s(i2);
            int i3 = (int) ((this.f1513a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            oqfVarC.n(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        oqfVarC.a();
    }

    public boolean l() {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        k(0, 0, false, false);
        return true;
    }

    public boolean m(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f == null) {
            return false;
        }
        k(i, i2, true, true);
        return true;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1515k = onDismissListener;
    }

    public h(Context context, e eVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.f1513a = context;
        this.f1514b = eVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }
}
