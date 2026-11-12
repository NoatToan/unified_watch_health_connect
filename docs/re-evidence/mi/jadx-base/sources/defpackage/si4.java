package defpackage;

import android.os.IBinder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import miuix.appcompat.internal.view.menu.d;
import miuix.appcompat.internal.view.menu.h;

/* JADX INFO: loaded from: classes3.dex */
public class si4 implements PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f33660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h.a f33661b;
    public ri4 c;
    public View d;
    public ViewGroup e;
    public float[] f = new float[2];

    public si4(d dVar) {
        this.f33660a = dVar;
    }

    public void a() {
        ri4 ri4Var = this.c;
        if (ri4Var != null) {
            ri4Var.dismiss();
            this.c = null;
        }
    }

    public ti4 b() {
        ri4 ri4Var = this.c;
        if (ri4Var instanceof ti4) {
            return (ti4) ri4Var;
        }
        return null;
    }

    public void c() {
        ri4 ri4Var = this.c;
        if (ri4Var != null) {
            View view = this.d;
            ViewGroup viewGroup = this.e;
            float[] fArr = this.f;
            ri4Var.a(view, viewGroup, fArr[0], fArr[1]);
        }
    }

    public void d(h.a aVar) {
        this.f33661b = aVar;
    }

    public void e(IBinder iBinder, View view, float f, float f2) {
        f(iBinder, view, f, f2, view.getRootView());
    }

    public void f(IBinder iBinder, View view, float f, float f2, View view2) {
        this.c = new ti4(this.f33660a.s(), this.f33660a, this, view2);
        this.d = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.e = viewGroup;
        float[] fArr = this.f;
        fArr[0] = f;
        fArr[1] = f2;
        this.c.b(this.d, viewGroup, f, f2);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        h.a aVar = this.f33661b;
        if (aVar != null) {
            aVar.b(this.f33660a, true);
        }
        this.f33660a.d();
    }
}
