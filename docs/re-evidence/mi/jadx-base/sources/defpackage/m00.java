package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.drawee.components.DraweeEventTracker;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class m00<T, INFO> implements g57, jy5.b, nya.a {
    public static final Class<?> u = m00.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jy5 f25599b;
    public final Executor c;
    public itk d;
    public nya e;
    public uj4<INFO> f;
    public k0m g;
    public Drawable h;
    public String i;
    public Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f25600k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public cp5<T> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public T f25601r;
    public Drawable s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DraweeEventTracker f25598a = DraweeEventTracker.a();
    public boolean t = true;

    public class a extends n62<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f25602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f25603b;

        public a(String str, boolean z) {
            this.f25602a = str;
            this.f25603b = z;
        }

        @Override // defpackage.n62
        public void onFailureImpl(cp5<T> cp5Var) {
            m00.this.z(this.f25602a, cp5Var, cp5Var.b(), true);
        }

        @Override // defpackage.n62
        public void onNewResultImpl(cp5<T> cp5Var) {
            boolean zA = cp5Var.a();
            boolean zD = cp5Var.d();
            float progress = cp5Var.getProgress();
            T result = cp5Var.getResult();
            if (result != null) {
                m00.this.B(this.f25602a, cp5Var, result, progress, zA, this.f25603b, zD);
            } else if (zA) {
                m00.this.z(this.f25602a, cp5Var, new NullPointerException(), true);
            }
        }

        @Override // defpackage.n62, defpackage.mp5
        public void onProgressUpdate(cp5<T> cp5Var) {
            boolean zA = cp5Var.a();
            m00.this.C(this.f25602a, cp5Var, cp5Var.getProgress(), zA);
        }
    }

    public static class b<INFO> extends k1a<INFO> {
        public static <INFO> b<INFO> k(uj4<? super INFO> uj4Var, uj4<? super INFO> uj4Var2) {
            if (epa.d()) {
                epa.a("AbstractDraweeController#createInternal");
            }
            b<INFO> bVar = new b<>();
            bVar.g(uj4Var);
            bVar.g(uj4Var2);
            if (epa.d()) {
                epa.b();
            }
            return bVar;
        }
    }

    public m00(jy5 jy5Var, Executor executor, String str, Object obj) {
        this.f25599b = jy5Var;
        this.c = executor;
        u(str, obj);
    }

    public void A(String str, T t) {
    }

    public final void B(String str, cp5<T> cp5Var, T t, float f, boolean z, boolean z2, boolean z3) {
        try {
            if (epa.d()) {
                epa.a("AbstractDraweeController#onNewResultInternal");
            }
            if (!w(str, cp5Var)) {
                y("ignore_old_datasource @ onNewResult", t);
                F(t);
                cp5Var.close();
                if (epa.d()) {
                    epa.b();
                    return;
                }
                return;
            }
            this.f25598a.b(z ? DraweeEventTracker.Event.ON_DATASOURCE_RESULT : DraweeEventTracker.Event.ON_DATASOURCE_RESULT_INT);
            try {
                Drawable drawableI = i(t);
                T t2 = this.f25601r;
                Drawable drawable = this.s;
                this.f25601r = t;
                this.s = drawableI;
                try {
                    if (z) {
                        y("set_final_result @ onNewResult", t);
                        this.q = null;
                        this.g.e(drawableI, 1.0f, z2);
                        l().e(str, s(t), j());
                    } else if (z3) {
                        y("set_temporary_result @ onNewResult", t);
                        this.g.e(drawableI, 1.0f, z2);
                        l().e(str, s(t), j());
                    } else {
                        y("set_intermediate_result @ onNewResult", t);
                        this.g.e(drawableI, f, z2);
                        l().c(str, s(t));
                    }
                    if (drawable != null && drawable != drawableI) {
                        D(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        y("release_previous_result @ onNewResult", t2);
                        F(t2);
                    }
                    if (epa.d()) {
                        epa.b();
                    }
                } catch (Throwable th) {
                    if (drawable != null && drawable != drawableI) {
                        D(drawable);
                    }
                    if (t2 != null && t2 != t) {
                        y("release_previous_result @ onNewResult", t2);
                        F(t2);
                    }
                    throw th;
                }
            } catch (Exception e) {
                y("drawable_failed @ onNewResult", t);
                F(t);
                z(str, cp5Var, e, z);
                if (epa.d()) {
                    epa.b();
                }
            }
        } catch (Throwable th2) {
            if (epa.d()) {
                epa.b();
            }
            throw th2;
        }
    }

    public final void C(String str, cp5<T> cp5Var, float f, boolean z) {
        if (!w(str, cp5Var)) {
            x("ignore_old_datasource @ onProgress", null);
            cp5Var.close();
        } else {
            if (z) {
                return;
            }
            this.g.d(f, false);
        }
    }

    public abstract void D(Drawable drawable);

    public final void E() {
        boolean z = this.l;
        this.l = false;
        this.n = false;
        cp5<T> cp5Var = this.q;
        if (cp5Var != null) {
            cp5Var.close();
            this.q = null;
        }
        Drawable drawable = this.s;
        if (drawable != null) {
            D(drawable);
        }
        if (this.p != null) {
            this.p = null;
        }
        this.s = null;
        T t = this.f25601r;
        if (t != null) {
            y("release", t);
            F(this.f25601r);
            this.f25601r = null;
        }
        if (z) {
            l().a(this.i);
        }
    }

    public abstract void F(T t);

    public void G(uj4<? super INFO> uj4Var) {
        b6i.g(uj4Var);
        uj4<INFO> uj4Var2 = this.f;
        if (uj4Var2 instanceof b) {
            ((b) uj4Var2).j(uj4Var);
        } else if (uj4Var2 == uj4Var) {
            this.f = null;
        }
    }

    public void H(String str) {
        this.p = str;
    }

    public void I(Drawable drawable) {
        this.h = drawable;
        k0m k0mVar = this.g;
        if (k0mVar != null) {
            k0mVar.c(drawable);
        }
    }

    public void J(wj4 wj4Var) {
    }

    public void K(nya nyaVar) {
        this.e = nyaVar;
        if (nyaVar != null) {
            nyaVar.f(this);
        }
    }

    public void L(boolean z) {
        this.o = z;
    }

    public boolean M() {
        return N();
    }

    public final boolean N() {
        itk itkVar;
        return this.n && (itkVar = this.d) != null && itkVar.e();
    }

    public void O() {
        if (epa.d()) {
            epa.a("AbstractDraweeController#submitRequest");
        }
        T tK = k();
        if (tK == null) {
            this.f25598a.b(DraweeEventTracker.Event.ON_DATASOURCE_SUBMIT);
            l().b(this.i, this.j);
            this.g.d(0.0f, true);
            this.l = true;
            this.n = false;
            this.q = n();
            if (cm8.o(2)) {
                cm8.t(u, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.i, Integer.valueOf(System.identityHashCode(this.q)));
            }
            this.q.c(new a(this.i, this.q.hasResult()), this.c);
            if (epa.d()) {
                epa.b();
                return;
            }
            return;
        }
        if (epa.d()) {
            epa.a("AbstractDraweeController#submitRequest->cache");
        }
        this.q = null;
        this.l = true;
        this.n = false;
        this.f25598a.b(DraweeEventTracker.Event.ON_SUBMIT_CACHE_HIT);
        l().b(this.i, this.j);
        A(this.i, tK);
        B(this.i, this.q, tK, 1.0f, true, true, true);
        if (epa.d()) {
            epa.b();
        }
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // nya.a
    public boolean a() {
        if (cm8.o(2)) {
            cm8.s(u, "controller %x %s: onClick", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        if (!N()) {
            return false;
        }
        this.d.b();
        this.g.reset();
        O();
        return true;
    }

    @Override // defpackage.g57
    public void b() {
        if (epa.d()) {
            epa.a("AbstractDraweeController#onAttach");
        }
        if (cm8.o(2)) {
            cm8.t(u, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(this)), this.i, this.l ? "request already submitted" : "request needs submit");
        }
        this.f25598a.b(DraweeEventTracker.Event.ON_ATTACH_CONTROLLER);
        b6i.g(this.g);
        this.f25599b.c(this);
        this.f25600k = true;
        if (!this.l) {
            O();
        }
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.g57
    public void c(h57 h57Var) {
        if (cm8.o(2)) {
            cm8.t(u, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.i, h57Var);
        }
        this.f25598a.b(h57Var != null ? DraweeEventTracker.Event.ON_SET_HIERARCHY : DraweeEventTracker.Event.ON_CLEAR_HIERARCHY);
        if (this.l) {
            this.f25599b.c(this);
            release();
        }
        k0m k0mVar = this.g;
        if (k0mVar != null) {
            k0mVar.c(null);
            this.g = null;
        }
        if (h57Var != null) {
            b6i.b(h57Var instanceof k0m);
            k0m k0mVar2 = (k0m) h57Var;
            this.g = k0mVar2;
            k0mVar2.c(this.h);
        }
    }

    @Override // defpackage.g57
    public h57 d() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void h(uj4<? super INFO> uj4Var) {
        b6i.g(uj4Var);
        uj4<INFO> uj4Var2 = this.f;
        if (uj4Var2 instanceof b) {
            ((b) uj4Var2).g(uj4Var);
        } else if (uj4Var2 != null) {
            this.f = b.k(uj4Var2, uj4Var);
        } else {
            this.f = uj4Var;
        }
    }

    public abstract Drawable i(T t);

    public Animatable j() {
        Object obj = this.s;
        if (obj instanceof Animatable) {
            return (Animatable) obj;
        }
        return null;
    }

    public T k() {
        return null;
    }

    public uj4<INFO> l() {
        uj4<INFO> uj4Var = this.f;
        return uj4Var == null ? f52.g() : uj4Var;
    }

    public Drawable m() {
        return this.h;
    }

    public abstract cp5<T> n();

    public nya o() {
        return this.e;
    }

    @Override // defpackage.g57
    public void onDetach() {
        if (epa.d()) {
            epa.a("AbstractDraweeController#onDetach");
        }
        if (cm8.o(2)) {
            cm8.s(u, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(this)), this.i);
        }
        this.f25598a.b(DraweeEventTracker.Event.ON_DETACH_CONTROLLER);
        this.f25600k = false;
        this.f25599b.f(this);
        if (epa.d()) {
            epa.b();
        }
    }

    @Override // defpackage.g57
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (cm8.o(2)) {
            cm8.t(u, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.i, motionEvent);
        }
        nya nyaVar = this.e;
        if (nyaVar == null) {
            return false;
        }
        if (!nyaVar.b() && !M()) {
            return false;
        }
        this.e.d(motionEvent);
        return true;
    }

    public String p() {
        return this.i;
    }

    public String q(T t) {
        return t != null ? t.getClass().getSimpleName() : "<null>";
    }

    public int r(T t) {
        return System.identityHashCode(t);
    }

    @Override // jy5.b
    public void release() {
        this.f25598a.b(DraweeEventTracker.Event.ON_RELEASE_CONTROLLER);
        itk itkVar = this.d;
        if (itkVar != null) {
            itkVar.c();
        }
        nya nyaVar = this.e;
        if (nyaVar != null) {
            nyaVar.e();
        }
        k0m k0mVar = this.g;
        if (k0mVar != null) {
            k0mVar.reset();
        }
        E();
    }

    public abstract INFO s(T t);

    public itk t() {
        if (this.d == null) {
            this.d = new itk();
        }
        return this.d;
    }

    public String toString() {
        return i4h.d(this).c("isAttached", this.f25600k).c("isRequestSubmitted", this.l).c("hasFetchFailed", this.n).a("fetchedImage", r(this.f25601r)).b("events", this.f25598a.toString()).toString();
    }

    public final synchronized void u(String str, Object obj) {
        jy5 jy5Var;
        try {
            if (epa.d()) {
                epa.a("AbstractDraweeController#init");
            }
            this.f25598a.b(DraweeEventTracker.Event.ON_INIT_CONTROLLER);
            if (!this.t && (jy5Var = this.f25599b) != null) {
                jy5Var.c(this);
            }
            this.f25600k = false;
            this.m = false;
            E();
            this.o = false;
            itk itkVar = this.d;
            if (itkVar != null) {
                itkVar.a();
            }
            nya nyaVar = this.e;
            if (nyaVar != null) {
                nyaVar.a();
                this.e.f(this);
            }
            uj4<INFO> uj4Var = this.f;
            if (uj4Var instanceof b) {
                ((b) uj4Var).h();
            } else {
                this.f = null;
            }
            k0m k0mVar = this.g;
            if (k0mVar != null) {
                k0mVar.reset();
                this.g.c(null);
                this.g = null;
            }
            this.h = null;
            if (cm8.o(2)) {
                cm8.t(u, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.i, str);
            }
            this.i = str;
            this.j = obj;
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void v(String str, Object obj) {
        u(str, obj);
        this.t = false;
    }

    public final boolean w(String str, cp5<T> cp5Var) {
        if (cp5Var == null && this.q == null) {
            return true;
        }
        return str.equals(this.i) && cp5Var == this.q && this.l;
    }

    public final void x(String str, Throwable th) {
        if (cm8.o(2)) {
            cm8.u(u, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.i, str, th);
        }
    }

    public final void y(String str, T t) {
        if (cm8.o(2)) {
            cm8.v(u, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.i, str, q(t), Integer.valueOf(r(t)));
        }
    }

    public final void z(String str, cp5<T> cp5Var, Throwable th, boolean z) {
        Drawable drawable;
        if (epa.d()) {
            epa.a("AbstractDraweeController#onFailureInternal");
        }
        if (!w(str, cp5Var)) {
            x("ignore_old_datasource @ onFailure", th);
            cp5Var.close();
            if (epa.d()) {
                epa.b();
                return;
            }
            return;
        }
        this.f25598a.b(z ? DraweeEventTracker.Event.ON_DATASOURCE_FAILURE : DraweeEventTracker.Event.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            x("final_failed @ onFailure", th);
            this.q = null;
            this.n = true;
            if (this.o && (drawable = this.s) != null) {
                this.g.e(drawable, 1.0f, true);
            } else if (N()) {
                this.g.a(th);
            } else {
                this.g.setFailure(th);
            }
            l().d(this.i, th);
        } else {
            x("intermediate_failed @ onFailure", th);
            l().f(this.i, th);
        }
        if (epa.d()) {
            epa.b();
        }
    }
}
