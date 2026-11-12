package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import androidx.annotation.RequiresApi;
import defpackage.nqo;
import defpackage.we3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class SessionConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DeferrableSurface> f1716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<CameraDevice.StateCallback> f1717b;
    public final List<CameraCaptureSession.StateCallback> c;
    public final List<we3> d;
    public final List<c> e;
    public final androidx.camera.core.impl.e f;
    public InputConfiguration g;

    public enum SessionError {
        SESSION_ERROR_SURFACE_NEEDS_RESET,
        SESSION_ERROR_UNKNOWN
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<DeferrableSurface> f1718a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.camera.core.impl.e.a f1719b = new androidx.camera.core.impl.e.a();
        public final List<CameraDevice.StateCallback> c = new ArrayList();
        public final List<CameraCaptureSession.StateCallback> d = new ArrayList();
        public final List<c> e = new ArrayList();
        public final List<we3> f = new ArrayList();
        public InputConfiguration g;
    }

    public static class b extends a {
        public static b o(r<?> rVar) {
            d dVarI = rVar.I(null);
            if (dVarI != null) {
                b bVar = new b();
                dVarI.a(rVar, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + rVar.r(rVar.toString()));
        }

        public void a(Collection<CameraDevice.StateCallback> collection) {
            Iterator<CameraDevice.StateCallback> it = collection.iterator();
            while (it.hasNext()) {
                e(it.next());
            }
        }

        public void b(Collection<we3> collection) {
            this.f1719b.a(collection);
        }

        public void c(List<CameraCaptureSession.StateCallback> list) {
            Iterator<CameraCaptureSession.StateCallback> it = list.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
        }

        public void d(we3 we3Var) {
            this.f1719b.c(we3Var);
            if (this.f.contains(we3Var)) {
                return;
            }
            this.f.add(we3Var);
        }

        public void e(CameraDevice.StateCallback stateCallback) {
            if (this.c.contains(stateCallback)) {
                return;
            }
            this.c.add(stateCallback);
        }

        public void f(c cVar) {
            this.e.add(cVar);
        }

        public void g(Config config) {
            this.f1719b.e(config);
        }

        public void h(DeferrableSurface deferrableSurface) {
            this.f1718a.add(deferrableSurface);
        }

        public void i(we3 we3Var) {
            this.f1719b.c(we3Var);
        }

        public void j(CameraCaptureSession.StateCallback stateCallback) {
            if (this.d.contains(stateCallback)) {
                return;
            }
            this.d.add(stateCallback);
        }

        public void k(DeferrableSurface deferrableSurface) {
            this.f1718a.add(deferrableSurface);
            this.f1719b.f(deferrableSurface);
        }

        public void l(String str, Object obj) {
            this.f1719b.g(str, obj);
        }

        public SessionConfig m() {
            return new SessionConfig(new ArrayList(this.f1718a), this.c, this.d, this.f, this.e, this.f1719b.h(), this.g);
        }

        public void n() {
            this.f1718a.clear();
            this.f1719b.i();
        }

        public List<we3> p() {
            return Collections.unmodifiableList(this.f);
        }

        public void q(Config config) {
            this.f1719b.o(config);
        }

        public void r(InputConfiguration inputConfiguration) {
            this.g = inputConfiguration;
        }

        public void s(int i) {
            this.f1719b.p(i);
        }
    }

    public interface c {
        void a(SessionConfig sessionConfig, SessionError sessionError);
    }

    public interface d {
        void a(r<?> rVar, b bVar);
    }

    public static final class e extends a {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final List<Integer> f1720k = Arrays.asList(1, 3);
        public final nqo h = new nqo();
        public boolean i = true;
        public boolean j = false;

        public void a(SessionConfig sessionConfig) {
            androidx.camera.core.impl.e eVarG = sessionConfig.g();
            if (eVarG.g() != -1) {
                this.j = true;
                this.f1719b.p(e(eVarG.g(), this.f1719b.m()));
            }
            this.f1719b.b(sessionConfig.g().f());
            this.c.addAll(sessionConfig.b());
            this.d.addAll(sessionConfig.h());
            this.f1719b.a(sessionConfig.f());
            this.f.addAll(sessionConfig.i());
            this.e.addAll(sessionConfig.c());
            if (sessionConfig.e() != null) {
                this.g = sessionConfig.e();
            }
            this.f1718a.addAll(sessionConfig.j());
            this.f1719b.l().addAll(eVarG.e());
            if (!this.f1718a.containsAll(this.f1719b.l())) {
                zpe.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.i = false;
            }
            this.f1719b.e(eVarG.d());
        }

        public SessionConfig b() {
            if (!this.i) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f1718a);
            this.h.d(arrayList);
            return new SessionConfig(arrayList, this.c, this.d, this.f, this.e, this.f1719b.h(), this.g);
        }

        public void c() {
            this.f1718a.clear();
            this.f1719b.i();
        }

        public boolean d() {
            return this.j && this.i;
        }

        public final int e(int i, int i2) {
            List<Integer> list = f1720k;
            return list.indexOf(Integer.valueOf(i)) >= list.indexOf(Integer.valueOf(i2)) ? i : i2;
        }
    }

    public SessionConfig(List<DeferrableSurface> list, List<CameraDevice.StateCallback> list2, List<CameraCaptureSession.StateCallback> list3, List<we3> list4, List<c> list5, androidx.camera.core.impl.e eVar, InputConfiguration inputConfiguration) {
        this.f1716a = list;
        this.f1717b = Collections.unmodifiableList(list2);
        this.c = Collections.unmodifiableList(list3);
        this.d = Collections.unmodifiableList(list4);
        this.e = Collections.unmodifiableList(list5);
        this.f = eVar;
        this.g = inputConfiguration;
    }

    public static SessionConfig a() {
        return new SessionConfig(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new ArrayList(0), new androidx.camera.core.impl.e.a().h(), null);
    }

    public List<CameraDevice.StateCallback> b() {
        return this.f1717b;
    }

    public List<c> c() {
        return this.e;
    }

    public Config d() {
        return this.f.d();
    }

    public InputConfiguration e() {
        return this.g;
    }

    public List<we3> f() {
        return this.f.b();
    }

    public androidx.camera.core.impl.e g() {
        return this.f;
    }

    public List<CameraCaptureSession.StateCallback> h() {
        return this.c;
    }

    public List<we3> i() {
        return this.d;
    }

    public List<DeferrableSurface> j() {
        return Collections.unmodifiableList(this.f1716a);
    }

    public int k() {
        return this.f.g();
    }
}
