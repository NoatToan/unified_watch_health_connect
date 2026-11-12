package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class cvo extends wuo.a implements wuo, ivo.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pk3 f14779b;
    public final Handler c;
    public final Executor d;
    public final ScheduledExecutorService e;
    public wuo.a f;
    public bf3 g;

    @GuardedBy("mLock")
    public lhe<Void> h;

    @GuardedBy("mLock")
    public cb3.a<Void> i;

    @GuardedBy("mLock")
    public lhe<List<Surface>> j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14778a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public List<DeferrableSurface> f14780k = null;

    @GuardedBy("mLock")
    public boolean l = false;

    @GuardedBy("mLock")
    public boolean m = false;

    @GuardedBy("mLock")
    public boolean n = false;

    public class a implements jua<Void> {
        public a() {
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            cvo.this.i();
            cvo cvoVar = cvo.this;
            cvoVar.f14779b.j(cvoVar);
        }
    }

    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            cvo.this.z(cameraCaptureSession);
            cvo cvoVar = cvo.this;
            cvoVar.m(cvoVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 26)
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            cvo.this.z(cameraCaptureSession);
            cvo cvoVar = cvo.this;
            cvoVar.n(cvoVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            cvo.this.z(cameraCaptureSession);
            cvo cvoVar = cvo.this;
            cvoVar.o(cvoVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            cb3.a<Void> aVar;
            try {
                cvo.this.z(cameraCaptureSession);
                cvo cvoVar = cvo.this;
                cvoVar.p(cvoVar);
                synchronized (cvo.this.f14778a) {
                    g6i.h(cvo.this.i, "OpenCaptureSession completer should not null");
                    cvo cvoVar2 = cvo.this;
                    aVar = cvoVar2.i;
                    cvoVar2.i = null;
                }
            } finally {
                synchronized (cvo.this.f14778a) {
                    g6i.h(cvo.this.i, "OpenCaptureSession completer should not null");
                    cvo cvoVar3 = cvo.this;
                    aVar = cvoVar3.i;
                    cvoVar3.i = null;
                    aVar.f(new IllegalStateException("onConfigureFailed"));
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            cb3.a<Void> aVar;
            try {
                cvo.this.z(cameraCaptureSession);
                cvo cvoVar = cvo.this;
                cvoVar.q(cvoVar);
                synchronized (cvo.this.f14778a) {
                    g6i.h(cvo.this.i, "OpenCaptureSession completer should not null");
                    cvo cvoVar2 = cvo.this;
                    aVar = cvoVar2.i;
                    cvoVar2.i = null;
                }
            } finally {
                synchronized (cvo.this.f14778a) {
                    g6i.h(cvo.this.i, "OpenCaptureSession completer should not null");
                    cvo cvoVar3 = cvo.this;
                    aVar = cvoVar3.i;
                    cvoVar3.i = null;
                    aVar.c(null);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            cvo.this.z(cameraCaptureSession);
            cvo cvoVar = cvo.this;
            cvoVar.r(cvoVar);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        @RequiresApi(api = 23)
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            cvo.this.z(cameraCaptureSession);
            cvo cvoVar = cvo.this;
            cvoVar.t(cvoVar, surface);
        }
    }

    public cvo(pk3 pk3Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f14779b = pk3Var;
        this.c = handler;
        this.d = executor;
        this.e = scheduledExecutorService;
    }

    public void A(List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        synchronized (this.f14778a) {
            H();
            g.f(list);
            this.f14780k = list;
        }
    }

    public boolean B() {
        boolean z;
        synchronized (this.f14778a) {
            z = this.h != null;
        }
        return z;
    }

    public final /* synthetic */ void C() {
        s(this);
    }

    public final /* synthetic */ void D(wuo wuoVar) {
        this.f14779b.h(this);
        s(wuoVar);
        this.f.o(wuoVar);
    }

    public final /* synthetic */ void E(wuo wuoVar) {
        this.f.s(wuoVar);
    }

    public final /* synthetic */ Object F(List list, lg3 lg3Var, pyl pylVar, cb3.a aVar) throws Exception {
        String str;
        synchronized (this.f14778a) {
            A(list);
            g6i.j(this.i == null, "The openCaptureSessionCompleter can only set once!");
            this.i = aVar;
            lg3Var.a(pylVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public final /* synthetic */ lhe G(List list, List list2) throws Exception {
        zpe.a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        if (list2.contains(null)) {
            return oua.f(new DeferrableSurface.SurfaceClosedException("Surface closed", (DeferrableSurface) list.get(list2.indexOf(null))));
        }
        return list2.isEmpty() ? oua.f(new IllegalArgumentException("Unable to open capture session without surfaces")) : oua.h(list2);
    }

    public void H() {
        synchronized (this.f14778a) {
            try {
                List<DeferrableSurface> list = this.f14780k;
                if (list != null) {
                    g.e(list);
                    this.f14780k = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ivo.b
    public pyl a(int i, List<jeh> list, wuo.a aVar) {
        this.f = aVar;
        return new pyl(i, list, c(), new b());
    }

    @Override // defpackage.wuo
    public wuo.a b() {
        return this;
    }

    @Override // ivo.b
    public Executor c() {
        return this.d;
    }

    @Override // defpackage.wuo
    public void close() {
        g6i.h(this.g, "Need to call openCaptureSession before using this API.");
        this.f14779b.i(this);
        this.g.c().close();
        c().execute(new Runnable() { // from class: xuo
            @Override // java.lang.Runnable
            public final void run() {
                this.f39490a.C();
            }
        });
    }

    @Override // defpackage.wuo
    public void d() throws CameraAccessException {
        g6i.h(this.g, "Need to call openCaptureSession before using this API.");
        this.g.c().abortCaptures();
    }

    @Override // defpackage.wuo
    public int e(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        g6i.h(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.a(list, c(), captureCallback);
    }

    @Override // defpackage.wuo
    public bf3 f() {
        g6i.g(this.g);
        return this.g;
    }

    @Override // defpackage.wuo
    public void g() throws CameraAccessException {
        g6i.h(this.g, "Need to call openCaptureSession before using this API.");
        this.g.c().stopRepeating();
    }

    @Override // defpackage.wuo
    public CameraDevice getDevice() {
        g6i.g(this.g);
        return this.g.c().getDevice();
    }

    @Override // defpackage.wuo
    public lhe<Void> h() {
        return oua.h(null);
    }

    @Override // defpackage.wuo
    public void i() {
        H();
    }

    @Override // defpackage.wuo
    public int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) throws CameraAccessException {
        g6i.h(this.g, "Need to call openCaptureSession before using this API.");
        return this.g.b(captureRequest, c(), captureCallback);
    }

    @Override // ivo.b
    public lhe<List<Surface>> k(final List<DeferrableSurface> list, long j) {
        synchronized (this.f14778a) {
            try {
                if (this.m) {
                    return oua.f(new CancellationException("Opener is disabled"));
                }
                kua kuaVarE = kua.a(g.k(list, false, j, c(), this.e)).e(new fl1() { // from class: avo
                    @Override // defpackage.fl1
                    public final lhe apply(Object obj) {
                        return this.f3496a.G(list, (List) obj);
                    }
                }, c());
                this.j = kuaVarE;
                return oua.j(kuaVarE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ivo.b
    public lhe<Void> l(CameraDevice cameraDevice, final pyl pylVar, final List<DeferrableSurface> list) {
        synchronized (this.f14778a) {
            try {
                if (this.m) {
                    return oua.f(new CancellationException("Opener is disabled"));
                }
                this.f14779b.l(this);
                final lg3 lg3VarB = lg3.b(cameraDevice, this.c);
                lhe<Void> lheVarA = cb3.a(new cb3.c() { // from class: zuo
                    @Override // cb3.c
                    public final Object a(cb3.a aVar) {
                        return this.f41700a.F(list, lg3VarB, pylVar, aVar);
                    }
                });
                this.h = lheVarA;
                oua.b(lheVarA, new a(), li3.a());
                return oua.j(this.h);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // wuo.a
    public void m(wuo wuoVar) {
        this.f.m(wuoVar);
    }

    @Override // wuo.a
    @RequiresApi(api = 26)
    public void n(wuo wuoVar) {
        this.f.n(wuoVar);
    }

    @Override // wuo.a
    public void o(final wuo wuoVar) {
        lhe<Void> lheVar;
        synchronized (this.f14778a) {
            try {
                if (this.l) {
                    lheVar = null;
                } else {
                    this.l = true;
                    g6i.h(this.h, "Need to call openCaptureSession before using this API.");
                    lheVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        if (lheVar != null) {
            lheVar.addListener(new Runnable() { // from class: yuo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40594a.D(wuoVar);
                }
            }, li3.a());
        }
    }

    @Override // wuo.a
    public void p(wuo wuoVar) {
        i();
        this.f14779b.j(this);
        this.f.p(wuoVar);
    }

    @Override // wuo.a
    public void q(wuo wuoVar) {
        this.f14779b.k(this);
        this.f.q(wuoVar);
    }

    @Override // wuo.a
    public void r(wuo wuoVar) {
        this.f.r(wuoVar);
    }

    @Override // wuo.a
    public void s(final wuo wuoVar) {
        lhe<Void> lheVar;
        synchronized (this.f14778a) {
            try {
                if (this.n) {
                    lheVar = null;
                } else {
                    this.n = true;
                    g6i.h(this.h, "Need to call openCaptureSession before using this API.");
                    lheVar = this.h;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (lheVar != null) {
            lheVar.addListener(new Runnable() { // from class: bvo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4650a.E(wuoVar);
                }
            }, li3.a());
        }
    }

    @Override // ivo.b
    public boolean stop() {
        boolean z;
        lhe<List<Surface>> lheVar = null;
        try {
            synchronized (this.f14778a) {
                try {
                    if (!this.m) {
                        lhe<List<Surface>> lheVar2 = this.j;
                        lheVar = lheVar2 != null ? lheVar2 : null;
                        this.m = true;
                    }
                    z = !B();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (lheVar != null) {
                lheVar.cancel(true);
            }
            return z;
        } catch (Throwable th2) {
            if (lheVar != null) {
                lheVar.cancel(true);
            }
            throw th2;
        }
    }

    @Override // wuo.a
    @RequiresApi(api = 23)
    public void t(wuo wuoVar, Surface surface) {
        this.f.t(wuoVar, surface);
    }

    public void z(CameraCaptureSession cameraCaptureSession) {
        if (this.g == null) {
            this.g = bf3.d(cameraCaptureSession, this.c);
        }
    }
}
