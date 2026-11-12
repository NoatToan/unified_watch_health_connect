package defpackage;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.arch.core.util.Function;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.g;
import androidx.camera.core.j;
import androidx.camera.core.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {dj8.class})
@RequiresApi(21)
public final class qai implements mk3 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static List<DeferrableSurface> f31276r = new ArrayList();
    public static int s = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final syl f31277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud3 f31278b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public SessionConfig g;
    public re3 h;
    public SessionConfig i;
    public final e n;
    public int q;
    public List<DeferrableSurface> f = new ArrayList();
    public boolean j = false;
    public volatile androidx.camera.core.impl.e l = null;
    public volatile boolean m = false;
    public hk3 o = new hk3.a().d();
    public hk3 p = new hk3.a().d();
    public final lk3 e = new lk3();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f31279k = d.UNINITIALIZED;

    public class a implements jua<Void> {
        public a() {
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            zpe.d("ProcessingCaptureSession", "open session failed ", th);
            qai.this.close();
        }
    }

    public class b implements syl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.camera.core.impl.e f31281a;

        public b(androidx.camera.core.impl.e eVar) {
            this.f31281a = eVar;
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31283a;

        static {
            int[] iArr = new int[d.values().length];
            f31283a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31283a[d.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31283a[d.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31283a[d.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31283a[d.CLOSED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum d {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        CLOSED
    }

    public static class e implements syl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<we3> f31286a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f31287b;

        public e(Executor executor) {
            this.f31287b = executor;
        }
    }

    public qai(syl sylVar, ud3 ud3Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.q = 0;
        this.f31277a = sylVar;
        this.f31278b = ud3Var;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.n = new e(executor);
        int i = s;
        s = i + 1;
        this.q = i;
        zpe.a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.q + ")");
    }

    public static void l(List<androidx.camera.core.impl.e> list) {
        Iterator<androidx.camera.core.impl.e> it = list.iterator();
        while (it.hasNext()) {
            Iterator<we3> it2 = it.next().b().iterator();
            while (it2.hasNext()) {
                it2.next().a();
            }
        }
    }

    public static List<tyl> m(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            g6i.b(deferrableSurface instanceof tyl, "Surface must be SessionProcessorSurface");
            arrayList.add((tyl) deferrableSurface);
        }
        return arrayList;
    }

    public static /* synthetic */ void p(DeferrableSurface deferrableSurface) {
        f31276r.remove(deferrableSurface);
    }

    @Override // defpackage.mk3
    public lhe<Void> a(final SessionConfig sessionConfig, final CameraDevice cameraDevice, final ivo ivoVar) {
        g6i.b(this.f31279k == d.UNINITIALIZED, "Invalid state state:" + this.f31279k);
        g6i.b(sessionConfig.j().isEmpty() ^ true, "SessionConfig contains no surfaces");
        zpe.a("ProcessingCaptureSession", "open (id=" + this.q + ")");
        List<DeferrableSurface> listJ = sessionConfig.j();
        this.f = listJ;
        return kua.a(g.k(listJ, false, 5000L, this.c, this.d)).e(new fl1() { // from class: mai
            @Override // defpackage.fl1
            public final lhe apply(Object obj) {
                return this.f25946a.q(sessionConfig, cameraDevice, ivoVar, (List) obj);
            }
        }, this.c).d(new Function() { // from class: nai
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return this.f27710a.r((Void) obj);
            }
        }, this.c);
    }

    @Override // defpackage.mk3
    public lhe<Void> b(boolean z) {
        g6i.j(this.f31279k == d.CLOSED, "release() can only be called in CLOSED state");
        zpe.a("ProcessingCaptureSession", "release (id=" + this.q + ")");
        return this.e.b(z);
    }

    @Override // defpackage.mk3
    public SessionConfig c() {
        return this.g;
    }

    @Override // defpackage.mk3
    public void close() {
        zpe.a("ProcessingCaptureSession", "close (id=" + this.q + ") state=" + this.f31279k);
        int i = c.f31283a[this.f31279k.ordinal()];
        if (i == 2) {
            this.f31277a.d();
        } else {
            if (i == 3) {
                this.f31277a.c();
                re3 re3Var = this.h;
                if (re3Var != null) {
                    re3Var.a();
                }
                this.f31279k = d.ON_CAPTURE_SESSION_ENDED;
            } else if (i != 4) {
                if (i == 5) {
                    return;
                }
            }
            this.f31277a.d();
        }
        this.f31279k = d.CLOSED;
        this.e.close();
    }

    @Override // defpackage.mk3
    public void d(SessionConfig sessionConfig) {
        zpe.a("ProcessingCaptureSession", "setSessionConfig (id=" + this.q + ")");
        this.g = sessionConfig;
        if (sessionConfig == null) {
            return;
        }
        re3 re3Var = this.h;
        if (re3Var != null) {
            re3Var.b(sessionConfig);
        }
        if (this.f31279k == d.ON_CAPTURE_SESSION_STARTED) {
            hk3 hk3VarD = hk3.a.e(sessionConfig.d()).d();
            this.o = hk3VarD;
            t(hk3VarD, this.p);
            if (this.j) {
                return;
            }
            this.f31277a.a(this.n);
            this.j = true;
        }
    }

    @Override // defpackage.mk3
    public void e(List<androidx.camera.core.impl.e> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1 || !n(list)) {
            l(list);
            return;
        }
        if (this.l != null || this.m) {
            l(list);
            return;
        }
        androidx.camera.core.impl.e eVar = list.get(0);
        zpe.a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.q + ") + state =" + this.f31279k);
        int i = c.f31283a[this.f31279k.ordinal()];
        if (i == 1 || i == 2) {
            this.l = eVar;
            return;
        }
        if (i != 3) {
            if (i == 4 || i == 5) {
                zpe.a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f31279k);
                l(list);
                return;
            }
            return;
        }
        this.m = true;
        hk3.a aVarE = hk3.a.e(eVar.d());
        Config configD = eVar.d();
        Config.a<Integer> aVar = androidx.camera.core.impl.e.h;
        if (configD.f(aVar)) {
            aVarE.g(CaptureRequest.JPEG_ORIENTATION, (Integer) eVar.d().a(aVar));
        }
        Config configD2 = eVar.d();
        Config.a<Integer> aVar2 = androidx.camera.core.impl.e.i;
        if (configD2.f(aVar2)) {
            aVarE.g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) eVar.d().a(aVar2)).byteValue()));
        }
        hk3 hk3VarD = aVarE.d();
        this.p = hk3VarD;
        t(this.o, hk3VarD);
        this.f31277a.f(new b(eVar));
    }

    @Override // defpackage.mk3
    public void f() {
        zpe.a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.q + ")");
        if (this.l != null) {
            Iterator<we3> it = this.l.b().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.l = null;
        }
    }

    @Override // defpackage.mk3
    public List<androidx.camera.core.impl.e> g() {
        return this.l != null ? Arrays.asList(this.l) : Collections.emptyList();
    }

    public final boolean n(List<androidx.camera.core.impl.e> list) {
        if (list.isEmpty()) {
            return false;
        }
        Iterator<androidx.camera.core.impl.e> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().g() != 2) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ void o() {
        g.e(this.f);
    }

    public final /* synthetic */ lhe q(SessionConfig sessionConfig, CameraDevice cameraDevice, ivo ivoVar, List list) throws Exception {
        zpe.a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.q + ")");
        if (this.f31279k == d.CLOSED) {
            return oua.f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        oeh oehVarA = null;
        if (list.contains(null)) {
            return oua.f(new DeferrableSurface.SurfaceClosedException("Surface closed", sessionConfig.j().get(list.indexOf(null))));
        }
        try {
            g.f(this.f);
            oeh oehVarA2 = null;
            oeh oehVarA3 = null;
            for (int i = 0; i < sessionConfig.j().size(); i++) {
                DeferrableSurface deferrableSurface = sessionConfig.j().get(i);
                if (Objects.equals(deferrableSurface.e(), o.class)) {
                    oehVarA = oeh.a(deferrableSurface.h().get(), new Size(deferrableSurface.f().getWidth(), deferrableSurface.f().getHeight()), deferrableSurface.g());
                } else if (Objects.equals(deferrableSurface.e(), j.class)) {
                    oehVarA2 = oeh.a(deferrableSurface.h().get(), new Size(deferrableSurface.f().getWidth(), deferrableSurface.f().getHeight()), deferrableSurface.g());
                } else if (Objects.equals(deferrableSurface.e(), androidx.camera.core.g.class)) {
                    oehVarA3 = oeh.a(deferrableSurface.h().get(), new Size(deferrableSurface.f().getWidth(), deferrableSurface.f().getHeight()), deferrableSurface.g());
                }
            }
            this.f31279k = d.SESSION_INITIALIZED;
            zpe.k("ProcessingCaptureSession", "== initSession (id=" + this.q + ")");
            SessionConfig sessionConfigG = this.f31277a.g(this.f31278b, oehVarA, oehVarA2, oehVarA3);
            this.i = sessionConfigG;
            sessionConfigG.j().get(0).i().addListener(new Runnable() { // from class: oai
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28930a.o();
                }
            }, li3.a());
            for (final DeferrableSurface deferrableSurface2 : this.i.j()) {
                f31276r.add(deferrableSurface2);
                deferrableSurface2.i().addListener(new Runnable() { // from class: pai
                    @Override // java.lang.Runnable
                    public final void run() {
                        qai.p(deferrableSurface2);
                    }
                }, this.c);
            }
            SessionConfig.e eVar = new SessionConfig.e();
            eVar.a(sessionConfig);
            eVar.c();
            eVar.a(this.i);
            g6i.b(eVar.d(), "Cannot transform the SessionConfig");
            lhe<Void> lheVarA = this.e.a(eVar.b(), (CameraDevice) g6i.g(cameraDevice), ivoVar);
            oua.b(lheVarA, new a(), this.c);
            return lheVarA;
        } catch (DeferrableSurface.SurfaceClosedException e2) {
            return oua.f(e2);
        }
    }

    public final /* synthetic */ Void r(Void r1) {
        s(this.e);
        return null;
    }

    public void s(lk3 lk3Var) {
        g6i.b(this.f31279k == d.SESSION_INITIALIZED, "Invalid state state:" + this.f31279k);
        re3 re3Var = new re3(lk3Var, m(this.i.j()));
        this.h = re3Var;
        this.f31277a.b(re3Var);
        this.f31279k = d.ON_CAPTURE_SESSION_STARTED;
        SessionConfig sessionConfig = this.g;
        if (sessionConfig != null) {
            d(sessionConfig);
        }
        if (this.l != null) {
            List<androidx.camera.core.impl.e> listAsList = Arrays.asList(this.l);
            this.l = null;
            e(listAsList);
        }
    }

    public final void t(hk3 hk3Var, hk3 hk3Var2) {
        pe3.a aVar = new pe3.a();
        aVar.d(hk3Var);
        aVar.d(hk3Var2);
        this.f31277a.e(aVar.c());
    }
}
