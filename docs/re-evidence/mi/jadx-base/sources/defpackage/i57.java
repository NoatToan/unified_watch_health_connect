package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import defpackage.h57;

/* JADX INFO: loaded from: classes4.dex */
public class i57<DH extends h57> implements t0r {
    public DH d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20796a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20797b = false;
    public boolean c = true;
    public g57 e = null;
    public final DraweeEventTracker f = DraweeEventTracker.a();

    public i57(DH dh) {
        if (dh != null) {
            o(dh);
        }
    }

    public static <DH extends h57> i57<DH> d(DH dh, Context context) {
        i57<DH> i57Var = new i57<>(dh);
        i57Var.m(context);
        return i57Var;
    }

    @Override // defpackage.t0r
    public void a(boolean z) {
        if (this.c == z) {
            return;
        }
        this.f.b(z ? DraweeEventTracker.Event.ON_DRAWABLE_SHOW : DraweeEventTracker.Event.ON_DRAWABLE_HIDE);
        this.c = z;
        c();
    }

    public final void b() {
        if (this.f20796a) {
            return;
        }
        this.f.b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        this.f20796a = true;
        g57 g57Var = this.e;
        if (g57Var == null || g57Var.d() == null) {
            return;
        }
        this.e.b();
    }

    public final void c() {
        if (this.f20797b && this.c) {
            b();
        } else {
            e();
        }
    }

    public final void e() {
        if (this.f20796a) {
            this.f.b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
            this.f20796a = false;
            if (i()) {
                this.e.onDetach();
            }
        }
    }

    public g57 f() {
        return this.e;
    }

    public DH g() {
        return (DH) b6i.g(this.d);
    }

    public Drawable h() {
        DH dh = this.d;
        if (dh == null) {
            return null;
        }
        return dh.b();
    }

    public boolean i() {
        g57 g57Var = this.e;
        return g57Var != null && g57Var.d() == this.d;
    }

    public void j() {
        this.f.b(DraweeEventTracker.Event.ON_HOLDER_ATTACH);
        this.f20797b = true;
        c();
    }

    public void k() {
        this.f.b(DraweeEventTracker.Event.ON_HOLDER_DETACH);
        this.f20797b = false;
        c();
    }

    public boolean l(MotionEvent motionEvent) {
        if (i()) {
            return this.e.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void m(Context context) {
    }

    public void n(g57 g57Var) {
        boolean z = this.f20796a;
        if (z) {
            e();
        }
        if (i()) {
            this.f.b(DraweeEventTracker.Event.ON_CLEAR_OLD_CONTROLLER);
            this.e.c(null);
        }
        this.e = g57Var;
        if (g57Var != null) {
            this.f.b(DraweeEventTracker.Event.ON_SET_CONTROLLER);
            this.e.c(this.d);
        } else {
            this.f.b(DraweeEventTracker.Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            b();
        }
    }

    public void o(DH dh) {
        this.f.b(DraweeEventTracker.Event.ON_SET_HIERARCHY);
        boolean zI = i();
        p(null);
        DH dh2 = (DH) b6i.g(dh);
        this.d = dh2;
        Drawable drawableB = dh2.b();
        a(drawableB == null || drawableB.isVisible());
        p(this);
        if (zI) {
            this.e.c(dh);
        }
    }

    @Override // defpackage.t0r
    public void onDraw() {
        if (this.f20796a) {
            return;
        }
        cm8.A(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.e)), toString());
        this.f20797b = true;
        this.c = true;
        c();
    }

    public final void p(t0r t0rVar) {
        Object objH = h();
        if (objH instanceof s0r) {
            ((s0r) objH).k(t0rVar);
        }
    }

    public String toString() {
        return i4h.d(this).c("controllerAttached", this.f20796a).c("holderAttached", this.f20797b).c("drawableVisible", this.c).b("events", this.f.toString()).toString();
    }
}
