package v;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.w2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class y1 implements d1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ArrayList f174117m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f174118n = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.camera.core.impl.n2 f174119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f174120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f174121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c1 f174122d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.l2 f174124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l0 f174125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.camera.core.impl.l2 f174126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f174127i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List<DeferrableSurface> f174123e = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile List<androidx.camera.core.impl.v0> f174128j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a0.i f174129k = new a0.i.a().a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a0.i f174130l = new a0.i.a().a();

    public enum b {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    public static class c {
    }

    public y1(androidx.camera.core.impl.n2 n2Var, w wVar, w.d dVar, Executor executor, ScheduledExecutorService scheduledExecutorService, a0.f fVar) {
        this.f174122d = new c1(dVar, x.c.f188202a.b(CaptureSessionShouldUseMrirQuirk.class) != null, fVar);
        this.f174119a = n2Var;
        this.f174120b = executor;
        this.f174121c = scheduledExecutorService;
        this.f174127i = b.UNINITIALIZED;
        new c();
        f174118n++;
    }

    public static void i(List<androidx.camera.core.impl.v0> list) {
        for (androidx.camera.core.impl.v0 v0Var : list) {
            Iterator<androidx.camera.core.impl.s> it = v0Var.f5817e.iterator();
            while (it.hasNext()) {
                it.next().a(v0Var.b());
            }
        }
    }

    @Override // v.d1
    public final void a(HashMap map) {
    }

    @Override // v.d1
    public final void b(List<androidx.camera.core.impl.v0> list) {
        if (list.isEmpty()) {
            return;
        }
        Objects.toString(this.f174127i);
        int iOrdinal = this.f174127i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f174128j != null) {
                i(list);
                return;
            } else {
                this.f174128j = list;
                return;
            }
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3 || iOrdinal == 4) {
                Objects.toString(this.f174127i);
                i(list);
                return;
            }
            return;
        }
        for (androidx.camera.core.impl.v0 v0Var : list) {
            int i14 = v0Var.f5815c;
            x1 x1Var = null;
            if (i14 != 2 && i14 != 4) {
                Iterator<androidx.camera.core.impl.x0.a<?>> it = a0.i.a.c(v0Var.f5814b).a().d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i(Arrays.asList(v0Var));
                        break;
                    }
                    CaptureRequest.Key key = (CaptureRequest.Key) it.next().c();
                    if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                        androidx.camera.core.impl.n2 n2Var = this.f174119a;
                        new a(v0Var.b(), v0Var.f5817e, x1Var);
                        n2Var.getClass();
                        break;
                    }
                }
            } else {
                a0.i.a aVarC = a0.i.a.c(v0Var.f5814b);
                androidx.camera.core.impl.x0 x0Var = v0Var.f5814b;
                androidx.camera.core.impl.h hVar = androidx.camera.core.impl.v0.f5810i;
                if (x0Var.b(hVar)) {
                    CaptureRequest.Key key2 = CaptureRequest.JPEG_ORIENTATION;
                    Integer num = (Integer) x0Var.e(hVar);
                    aVarC.f36a.X(u.a.T(key2), num);
                }
                androidx.camera.core.impl.h hVar2 = androidx.camera.core.impl.v0.f5811j;
                if (x0Var.b(hVar2)) {
                    CaptureRequest.Key key3 = CaptureRequest.JPEG_QUALITY;
                    Byte bValueOf = Byte.valueOf(((Integer) x0Var.e(hVar2)).byteValue());
                    aVarC.f36a.X(u.a.T(key3), bValueOf);
                }
                a0.i iVarA = aVarC.a();
                this.f174130l = iVarA;
                a0.i iVar = this.f174129k;
                u.a.C3144a c3144a = new u.a.C3144a();
                androidx.camera.core.impl.w1 w1Var = c3144a.f167307a;
                androidx.camera.core.impl.x0.b bVar = androidx.camera.core.impl.x0.b.OPTIONAL;
                for (androidx.camera.core.impl.x0.a<?> aVar : iVar.d()) {
                    w1Var.W(aVar, bVar, iVar.e(aVar));
                }
                androidx.camera.core.impl.x0.b bVar2 = androidx.camera.core.impl.x0.b.OPTIONAL;
                for (androidx.camera.core.impl.x0.a<?> aVar2 : iVarA.d()) {
                    w1Var.W(aVar2, bVar2, iVarA.e(aVar2));
                }
                androidx.camera.core.impl.n2 n2Var2 = this.f174119a;
                c3144a.a();
                n2Var2.g();
                androidx.camera.core.impl.n2 n2Var3 = this.f174119a;
                new a(v0Var.b(), v0Var.f5817e, x1Var);
                n2Var3.e();
            }
        }
    }

    @Override // v.d1
    public final boolean c() {
        return this.f174122d.c();
    }

    @Override // v.d1
    public final void close() {
        Objects.toString(this.f174127i);
        if (this.f174127i == b.ON_CAPTURE_SESSION_STARTED) {
            this.f174119a.b();
            l0 l0Var = this.f174125g;
            if (l0Var != null) {
                synchronized (l0Var.f173908a) {
                }
            }
            this.f174127i = b.ON_CAPTURE_SESSION_ENDED;
        }
        this.f174122d.close();
    }

    @Override // v.d1
    public final ListenableFuture d(androidx.camera.core.impl.l2 l2Var, CameraDevice cameraDevice, g2 g2Var) {
        k7.h.b(this.f174127i == b.UNINITIALIZED, "Invalid state state:" + this.f174127i);
        k7.h.b(l2Var.b().isEmpty() ^ true, "SessionConfig contains no surfaces");
        List<DeferrableSurface> listB = l2Var.b();
        this.f174123e = listB;
        ScheduledExecutorService scheduledExecutorService = this.f174121c;
        Executor executor = this.f174120b;
        return l0.j.j(l0.j.j(l0.d.a(androidx.camera.core.impl.c1.c(listB, executor, scheduledExecutorService)), new bm.h0(this, l2Var, cameraDevice, g2Var, 4), executor), new l0.i(new tr2.b(this, 17)), executor);
    }

    @Override // v.d1
    public final androidx.camera.core.impl.l2 e() {
        return this.f174124f;
    }

    @Override // v.d1
    public final void f(androidx.camera.core.impl.l2 l2Var) {
        this.f174124f = l2Var;
        if (l2Var == null) {
            return;
        }
        l0 l0Var = this.f174125g;
        if (l0Var != null) {
            synchronized (l0Var.f173908a) {
            }
        }
        if (this.f174127i == b.ON_CAPTURE_SESSION_STARTED) {
            a0.i.a aVarC = a0.i.a.c(l2Var.f5608g.f5814b);
            Integer numE = g0.e(l2Var.f5608g);
            if (numE != null) {
                aVarC.f36a.X(u.a.T(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE), numE);
            }
            a0.i iVarA = aVarC.a();
            this.f174129k = iVarA;
            a0.i iVar = this.f174130l;
            u.a.C3144a c3144a = new u.a.C3144a();
            androidx.camera.core.impl.w1 w1Var = c3144a.f167307a;
            androidx.camera.core.impl.x0.b bVar = androidx.camera.core.impl.x0.b.OPTIONAL;
            for (androidx.camera.core.impl.x0.a<?> aVar : iVarA.d()) {
                w1Var.W(aVar, bVar, iVarA.e(aVar));
            }
            androidx.camera.core.impl.x0.b bVar2 = androidx.camera.core.impl.x0.b.OPTIONAL;
            for (androidx.camera.core.impl.x0.a<?> aVar2 : iVar.d()) {
                w1Var.W(aVar2, bVar2, iVar.e(aVar2));
            }
            androidx.camera.core.impl.n2 n2Var = this.f174119a;
            c3144a.a();
            n2Var.g();
            for (DeferrableSurface deferrableSurface : Collections.unmodifiableList(l2Var.f5608g.f5813a)) {
                if (Objects.equals(deferrableSurface.f5476j, b0.w0.class) || Objects.equals(deferrableSurface.f5476j, v0.d.class)) {
                    androidx.camera.core.impl.n2 n2Var2 = this.f174119a;
                    w2 w2Var = l2Var.f5608g.f5819g;
                    n2Var2.h();
                    return;
                }
            }
            this.f174119a.a();
        }
    }

    @Override // v.d1
    public final void g() {
        if (this.f174128j != null) {
            for (androidx.camera.core.impl.v0 v0Var : this.f174128j) {
                Iterator<androidx.camera.core.impl.s> it = v0Var.f5817e.iterator();
                while (it.hasNext()) {
                    it.next().a(v0Var.b());
                }
            }
            this.f174128j = null;
        }
    }

    @Override // v.d1
    public final List<androidx.camera.core.impl.v0> h() {
        return this.f174128j != null ? this.f174128j : Collections.EMPTY_LIST;
    }

    @Override // v.d1
    public final ListenableFuture release() {
        Objects.toString(this.f174127i);
        ListenableFuture listenableFutureRelease = this.f174122d.release();
        int iOrdinal = this.f174127i.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            listenableFutureRelease.addListener(new b0(this, 4), k0.b.a());
        }
        this.f174127i = b.DE_INITIALIZED;
        return listenableFutureRelease;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<androidx.camera.core.impl.s> f174131a;

        private a(int i14, List<androidx.camera.core.impl.s> list) {
            this.f174131a = list;
        }

        public /* synthetic */ a(int i14, List list, x1 x1Var) {
            this(i14, list);
        }
    }
}
