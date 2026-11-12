package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a3;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.w2;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class l implements CameraControlInternal {
    public static final /* synthetic */ int C = 0;
    public long A;
    public final a B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f173878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f173879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f173880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.h f173881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CameraControlInternal.b f173882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.l2.b f173883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o1 f173884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o2 f173885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k2 f173886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v1 f173887k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i1 f173888l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s2 f173889m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0.d f173890n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f173891o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m2 f173892p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f173893q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public b0.l0.j f173894r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f173895s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f173896t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile int f173897u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y.a f173898v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f173899w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicLong f173900x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile ListenableFuture<Void> f173901y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f173902z;

    public static final class a extends androidx.camera.core.impl.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f173903a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayMap f173904b = new ArrayMap();

        @Override // androidx.camera.core.impl.s
        public final void a(int i14) {
            for (androidx.camera.core.impl.s sVar : this.f173903a) {
                try {
                    ((Executor) this.f173904b.get(sVar)).execute(new androidx.media3.exoplayer.d(sVar, i14, 13));
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void b(int i14, androidx.camera.core.impl.c0 c0Var) {
            for (androidx.camera.core.impl.s sVar : this.f173903a) {
                try {
                    ((Executor) this.f173904b.get(sVar)).execute(new androidx.camera.camera2.internal.compat.j(sVar, i14, c0Var, 13));
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        @Override // androidx.camera.core.impl.s
        public final void c(int i14, androidx.camera.core.impl.u uVar) {
            for (androidx.camera.core.impl.s sVar : this.f173903a) {
                try {
                    ((Executor) this.f173904b.get(sVar)).execute(new androidx.camera.camera2.internal.compat.j(sVar, i14, uVar, 12));
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f173905c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashSet f173906a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f173907b;

        public b(Executor executor) {
            this.f173907b = executor;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f173907b.execute(new r0.h(18, this, totalCaptureResult));
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public l(androidx.camera.camera2.internal.compat.h hVar, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.b bVar, androidx.camera.core.impl.i2 i2Var) {
        this.f173880d = new Object();
        androidx.camera.core.impl.l2.b bVar2 = new androidx.camera.core.impl.l2.b();
        this.f173883g = bVar2;
        this.f173893q = 0;
        this.f173895s = 0;
        this.f173897u = 2;
        this.f173899w = true;
        this.f173900x = new AtomicLong(0L);
        l0.j.a aVar = l0.j.f107810a;
        this.f173901y = l0.m.c.f107817b;
        this.f173902z = 1;
        this.A = 0L;
        a aVar2 = new a();
        this.B = aVar2;
        this.f173881e = hVar;
        this.f173882f = bVar;
        this.f173879c = executor;
        this.f173892p = new m2(executor);
        b bVar3 = new b(executor);
        this.f173878b = bVar3;
        bVar2.f5612b.f5823c = this.f173902z;
        bVar2.f5612b.b(x0.e(bVar3));
        bVar2.f5612b.b(aVar2);
        this.f173888l = new i1(this, hVar, executor);
        this.f173884h = new o1(this, scheduledExecutorService, executor, i2Var);
        this.f173885i = new o2(this, hVar, executor);
        this.f173886j = new k2(this, hVar, executor);
        this.f173896t = hVar.b();
        this.f173887k = new v1(this, hVar, executor);
        this.f173889m = new s2(hVar, executor);
        this.f173898v = new y.a(i2Var);
        this.f173890n = new a0.d(this, executor);
        this.f173891o = new a0(this, hVar, i2Var, executor, scheduledExecutorService);
    }

    public static int t(androidx.camera.camera2.internal.compat.h hVar, int i14) {
        int[] iArr = (int[]) hVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i14, iArr)) {
            return i14;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i14, int[] iArr) {
        for (int i15 : iArr) {
            if (i14 == i15) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(TotalCaptureResult totalCaptureResult, long j8) {
        Long l14;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof w2) && (l14 = (Long) ((w2) tag).f5841a.get("CameraControlSessionUpdateId")) != null && l14.longValue() >= j8;
    }

    public final void A(List<androidx.camera.core.impl.v0> list) {
        int iD;
        int iC;
        androidx.camera.core.impl.c0 c0Var;
        s sVar = s.this;
        list.getClass();
        sVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.v0 v0Var : list) {
            androidx.camera.core.impl.v0.a aVarF = androidx.camera.core.impl.v0.a.f(v0Var);
            HashSet hashSet = aVarF.f5821a;
            if (v0Var.f5815c == 5 && (c0Var = v0Var.f5820h) != null) {
                aVarF.f5828h = c0Var;
            }
            if (Collections.unmodifiableList(v0Var.f5813a).isEmpty() && v0Var.f5818f) {
                if (hashSet.isEmpty()) {
                    a3 a3Var = sVar.f174006a;
                    a3Var.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : a3Var.f5492a.entrySet()) {
                        a3.a aVar = (a3.a) entry.getValue();
                        if (aVar.f5498f && aVar.f5497e) {
                            arrayList2.add(((a3.a) entry.getValue()).f5493a);
                        }
                    }
                    Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                    while (it.hasNext()) {
                        androidx.camera.core.impl.v0 v0Var2 = ((androidx.camera.core.impl.l2) it.next()).f5608g;
                        List listUnmodifiableList = Collections.unmodifiableList(v0Var2.f5813a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (v0Var2.c() != 0 && (iC = v0Var2.c()) != 0) {
                                aVarF.f5822b.X(b3.F, Integer.valueOf(iC));
                            }
                            if (v0Var2.d() != 0 && (iD = v0Var2.d()) != 0) {
                                aVarF.f5822b.X(b3.G, Integer.valueOf(iD));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                aVarF.d((DeferrableSurface) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                    }
                }
            }
            arrayList.add(aVarF.e());
        }
        sVar.toString();
        sVar.f174019m.b(arrayList);
    }

    public final long B() {
        this.A = this.f173900x.getAndIncrement();
        s.this.J();
        return this.A;
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture<Void> a(float f14) {
        ListenableFuture aVar;
        m0.a aVarE;
        if (!v()) {
            CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
            l0.j.a aVar2 = l0.j.f107810a;
            return new l0.m.a(operationCanceledException);
        }
        o2 o2Var = this.f173885i;
        synchronized (o2Var.f173972c) {
            try {
                o2Var.f173972c.e(f14);
                aVarE = m0.e.e(o2Var.f173972c);
            } catch (IllegalArgumentException e4) {
                l0.j.a aVar3 = l0.j.f107810a;
                aVar = new l0.m.a(e4);
            }
        }
        o2Var.c(aVarE);
        androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar4);
        aVar4.f6080b = dVar;
        aVar4.f6079a = h.class;
        try {
            o2Var.f173971b.execute(new n2(o2Var, aVar4, aVarE, 1));
            aVar4.f6079a = "setLinearZoom";
            aVar = dVar;
        } catch (Exception e14) {
            dVar.a(e14);
            aVar = dVar;
        }
        return l0.j.f(aVar);
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture<Void> b(float f14) {
        ListenableFuture aVar;
        m0.a aVarE;
        if (!v()) {
            CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
            l0.j.a aVar2 = l0.j.f107810a;
            return new l0.m.a(operationCanceledException);
        }
        o2 o2Var = this.f173885i;
        synchronized (o2Var.f173972c) {
            try {
                o2Var.f173972c.f(f14);
                aVarE = m0.e.e(o2Var.f173972c);
            } catch (IllegalArgumentException e4) {
                l0.j.a aVar3 = l0.j.f107810a;
                aVar = new l0.m.a(e4);
            }
        }
        o2Var.c(aVarE);
        androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar4);
        aVar4.f6080b = dVar;
        aVar4.f6079a = h.class;
        try {
            o2Var.f173971b.execute(new n2(o2Var, aVar4, aVarE, 0));
            aVar4.f6079a = "setZoomRatio";
            aVar = dVar;
        } catch (Exception e14) {
            dVar.a(e14);
            aVar = dVar;
        }
        return l0.j.f(aVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void c() throws Exception {
        this.f173889m.a();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final androidx.camera.core.impl.x0 d() {
        u.a aVarA;
        a0.d dVar = this.f173890n;
        synchronized (dVar.f26e) {
            aVarA = dVar.f27f.a();
        }
        return aVarA;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void e() {
        a0.d dVar = this.f173890n;
        synchronized (dVar.f26e) {
            dVar.f27f = new u.a.C3144a();
        }
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar2;
        aVar.f6079a = h.class;
        try {
            dVar.f25d.execute(new a0.b(dVar, aVar, 0));
            aVar.f6079a = "clearCaptureRequestOptions";
        } catch (Exception e4) {
            dVar2.a(e4);
        }
        l0.j.f(dVar2).addListener(new ab2.a(8), k0.b.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void f() {
        m2 m2Var = this.f173892p;
        m2Var.f173933a.execute(new l2(m2Var, 0));
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture<Void> g(boolean z14) {
        ListenableFuture aVar;
        if (!v()) {
            CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
            l0.j.a aVar2 = l0.j.f107810a;
            return new l0.m.a(operationCanceledException);
        }
        k2 k2Var = this.f173886j;
        if (k2Var.f173872d) {
            k2Var.b(z14 ? 1 : 0);
            androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar3);
            aVar3.f6080b = dVar;
            aVar3.f6079a = h.class;
            try {
                k2Var.f173873e.execute(new androidx.camera.camera2.internal.compat.j(k2Var, aVar3, z14 ? 1 : 0, 14));
                aVar3.f6079a = "enableTorch: " + z14;
            } catch (Exception e4) {
                dVar.a(e4);
            }
            aVar = dVar;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("No flash unit");
            l0.j.a aVar4 = l0.j.f107810a;
            aVar = new l0.m.a(illegalStateException);
        }
        return l0.j.f(aVar);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void h() {
        m2 m2Var = this.f173892p;
        m2Var.f173933a.execute(new l2(m2Var, 1));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void i(androidx.camera.core.impl.x0 x0Var) {
        a0.d dVar = this.f173890n;
        a0.i iVarA = a0.i.a.c(x0Var).a();
        synchronized (dVar.f26e) {
            u.a.C3144a c3144a = dVar.f27f;
            c3144a.getClass();
            androidx.camera.core.impl.x0.b bVar = androidx.camera.core.impl.x0.b.OPTIONAL;
            for (androidx.camera.core.impl.x0.a<?> aVar : iVarA.d()) {
                c3144a.f167307a.W(aVar, bVar, iVarA.e(aVar));
            }
        }
        androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar2;
        aVar2.f6079a = h.class;
        try {
            dVar.f25d.execute(new a0.b(dVar, aVar2, 1));
            aVar2.f6079a = "addCaptureRequestOptions";
        } catch (Exception e4) {
            dVar2.a(e4);
        }
        l0.j.f(dVar2).addListener(new ab2.a(8), k0.b.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture j(final int i14, final int i15, final List list) {
        if (v()) {
            final int i16 = this.f173897u;
            return l0.j.j(l0.d.a(l0.j.f(this.f173901y)), new l0.a() { // from class: v.k
                @Override // l0.a
                public final ListenableFuture apply(Object obj) {
                    a0 a0Var = this.f173856a.f173891o;
                    int i17 = i14;
                    int i18 = i16;
                    a0.d dVarA = a0Var.a(i17, i18, i15);
                    l0.d dVarA2 = l0.d.a(dVarA.a(i18));
                    androidx.media3.exoplayer.u uVar = new androidx.media3.exoplayer.u(dVarA, list, i18, 10);
                    Executor executor = dVarA.f173644b;
                    l0.b bVarJ = l0.j.j(dVarA2, uVar, executor);
                    bVarJ.addListener(new b0(dVarA, 0), executor);
                    return l0.j.f(bVarJ);
                }
            }, this.f173879c);
        }
        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
        l0.j.a aVar = l0.j.f107810a;
        return new l0.m.a(operationCanceledException);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void k(b0.l0.j jVar) {
        this.f173894r = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture<b0.e0> l(b0.d0 d0Var) {
        if (!v()) {
            CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
            l0.j.a aVar = l0.j.f107810a;
            return new l0.m.a(operationCanceledException);
        }
        try {
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar;
            aVar2.f6079a = h.class;
            try {
                try {
                    this.f173879c.execute(new i(this, aVar2, 1));
                } catch (RejectedExecutionException unused) {
                    aVar2.d(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
                }
                aVar2.f6079a = "isRepeatingRequestAvailable";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            if (!((Boolean) dVar.f6084b.get()).booleanValue()) {
                CameraControl.OperationCanceledException operationCanceledException2 = new CameraControl.OperationCanceledException("Repeating request is not available possibly because it's disable for the ImageCapture.");
                l0.j.a aVar3 = l0.j.f107810a;
                return new l0.m.a(operationCanceledException2);
            }
            o1 o1Var = this.f173884h;
            o1Var.getClass();
            androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar4);
            aVar4.f6080b = dVar2;
            aVar4.f6079a = h.class;
            try {
                o1Var.f173949b.execute(new uj2.b(o1Var, 4, aVar4, d0Var));
                aVar4.f6079a = "startFocusAndMetering";
            } catch (Exception e14) {
                dVar2.a(e14);
            }
            return l0.j.f(dVar2);
        } catch (InterruptedException | ExecutionException e15) {
            r1.q2.v("Unable to check if repeating request is available.", e15);
            return null;
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void m(int i14) {
        if (v()) {
            this.f173897u = i14;
            s2 s2Var = this.f173889m;
            boolean z14 = true;
            if (this.f173897u != 1 && this.f173897u != 0) {
                z14 = false;
            }
            s2Var.f174073e = z14;
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = h.class;
            try {
                this.f173879c.execute(new i(this, aVar, 0));
                aVar.f6079a = "updateSessionConfigAsync";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            this.f173901y = l0.j.f(dVar);
        }
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void n(androidx.camera.core.impl.l2.b bVar) throws Exception {
        StreamConfigurationMap streamConfigurationMap;
        int i14;
        HashMap map;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        androidx.camera.core.impl.v0.a aVar = bVar.f5612b;
        s2 s2Var = this.f173889m;
        Executor executor = s2Var.f174070b;
        androidx.camera.camera2.internal.compat.h hVar = s2Var.f174069a;
        s2Var.a();
        if (s2Var.f174072d) {
            aVar.f5823c = 1;
            return;
        }
        if (s2Var.f174075g) {
            aVar.f5823c = 1;
            return;
        }
        try {
            streamConfigurationMap = (StreamConfigurationMap) hVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e4) {
            e4.getMessage();
            streamConfigurationMap = null;
        }
        if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
            i14 = 0;
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i15 : streamConfigurationMap.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap.getInputSizes(i15);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new j0.e(true));
                    map.put(Integer.valueOf(i15), inputSizes[0]);
                }
            }
            i14 = 0;
        }
        if (s2Var.f174074f && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) hVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
            int length = validOutputFormatsForInput.length;
            for (int i16 = i14; i16 < length; i16++) {
                if (validOutputFormatsForInput[i16] == 256) {
                    Size size = (Size) map.get(34);
                    androidx.camera.core.f fVar = new androidx.camera.core.f(size.getWidth(), size.getHeight(), 34, 9);
                    androidx.camera.core.g gVar = new androidx.camera.core.g(fVar);
                    Surface surface = gVar.getSurface();
                    Objects.requireNonNull(surface);
                    androidx.camera.core.impl.p1 p1Var = new androidx.camera.core.impl.p1(surface, new Size(gVar.getWidth(), gVar.getHeight()), 34);
                    s2.a aVar2 = new s2.a(executor);
                    s2Var.f174076h = gVar;
                    s2Var.f174077i = p1Var;
                    s2Var.f174078j = aVar2;
                    gVar.d(new tr2.b(s2Var, 18), k0.b.c());
                    l0.j.f(p1Var.f5471e).addListener(new r0.h(26, gVar, aVar2), executor);
                    bVar.b(p1Var, b0.b0.f13854d, -1);
                    androidx.camera.core.f.a aVar3 = fVar.f5442b;
                    aVar.b(aVar3);
                    ArrayList arrayList = bVar.f5615e;
                    if (!arrayList.contains(aVar3)) {
                        arrayList.add(aVar3);
                    }
                    q2 q2Var = new q2(s2Var, aVar2);
                    ArrayList arrayList2 = bVar.f5614d;
                    if (!arrayList2.contains(q2Var)) {
                        arrayList2.add(q2Var);
                    }
                    bVar.f5617g = new InputConfiguration(gVar.getWidth(), gVar.getHeight(), gVar.f());
                    return;
                }
            }
        }
        aVar.f5823c = 1;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture o(int i14) {
        if (v()) {
            return l0.j.j(l0.d.a(l0.j.f(this.f173901y)), new com.google.android.exoplayer2.analytics.m(this, i14, this.f173897u, 4), this.f173879c);
        }
        CameraControl.OperationCanceledException operationCanceledException = new CameraControl.OperationCanceledException("Camera is not active.");
        l0.j.a aVar = l0.j.f107810a;
        return new l0.m.a(operationCanceledException);
    }

    public final void p(c cVar) {
        this.f173878b.f173906a.add(cVar);
    }

    public final void q() {
        synchronized (this.f173880d) {
            try {
                int i14 = this.f173893q;
                if (i14 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f173893q = i14 - 1;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r(int i14) {
        this.f173895s = i14;
        if (i14 == 0) {
            androidx.camera.core.impl.v0.a aVar = new androidx.camera.core.impl.v0.a();
            aVar.f5823c = this.f173902z;
            aVar.f5826f = true;
            u.a.C3144a c3144a = new u.a.C3144a();
            c3144a.c(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(t(this.f173881e, 1)));
            c3144a.c(CaptureRequest.FLASH_MODE, 0);
            aVar.c(c3144a.a());
            A(Collections.singletonList(aVar.e()));
        }
        B();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d A[Catch: all -> 0x0157, LOOP:0: B:59:0x0117->B:61:0x011d, LOOP_END, TryCatch #0 {, blocks: (B:58:0x0109, B:59:0x0117, B:61:0x011d, B:62:0x012d), top: B:71:0x0109 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final androidx.camera.core.impl.l2 s() {
        int[] iArr;
        j1 j1Var;
        a0.d dVar;
        androidx.camera.core.impl.w1 w1Var;
        androidx.camera.core.impl.x0.b bVar;
        androidx.camera.core.impl.l2.b bVar2 = this.f173883g;
        bVar2.f5612b.f5823c = this.f173902z;
        u.a.C3144a c3144a = new u.a.C3144a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        int i14 = 1;
        androidx.camera.core.impl.x0.b bVar3 = androidx.camera.core.impl.x0.b.REQUIRED;
        c3144a.e(key, 1, bVar3);
        o1 o1Var = this.f173884h;
        int i15 = 3;
        c3144a.e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(o1Var.f173948a.u(o1Var.f173954g ? 1 : o1Var.f173961n != 3 ? 4 : 3)), bVar3);
        MeteringRectangle[] meteringRectangleArr = o1Var.f173963p;
        if (meteringRectangleArr.length != 0) {
            c3144a.e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, bVar3);
        }
        MeteringRectangle[] meteringRectangleArr2 = o1Var.f173964q;
        if (meteringRectangleArr2.length != 0) {
            c3144a.e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, bVar3);
        }
        MeteringRectangle[] meteringRectangleArr3 = o1Var.f173965r;
        if (meteringRectangleArr3.length != 0) {
            c3144a.e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, bVar3);
        }
        this.f173885i.f173974e.g(c3144a);
        int i16 = this.f173884h.f173967t ? 5 : 1;
        if (this.f173895s == 0) {
            int i17 = this.f173897u;
            if (i17 == 0) {
                y.a aVar = this.f173898v;
                if (aVar.f192938a || aVar.f192939b) {
                    i15 = 1;
                } else {
                    i15 = 2;
                }
            } else if (i17 != 1) {
                if (i17 == 2) {
                    i15 = 1;
                }
            }
            c3144a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(t(this.f173881e, i15)), bVar3);
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
            iArr = (int[]) this.f173881e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
            if (iArr != null || (!w(1, iArr) && !w(1, iArr))) {
                i14 = 0;
            }
            c3144a.e(key2, Integer.valueOf(i14), bVar3);
            i1 i1Var = this.f173888l;
            i1Var.getClass();
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
            j1Var = i1Var.f173844a;
            synchronized (j1Var.f173853a) {
                int i18 = j1Var.f173854b;
            }
            c3144a.e(key3, Integer.valueOf(i18), bVar3);
            dVar = this.f173890n;
            synchronized (dVar.f26e) {
                w1Var = dVar.f27f.f167307a;
                bVar = androidx.camera.core.impl.x0.b.ALWAYS_OVERRIDE;
                for (androidx.camera.core.impl.x0.a<?> aVar2 : w1Var.d()) {
                    c3144a.f167307a.W(aVar2, bVar, w1Var.e(aVar2));
                }
            }
            u.a aVarA = c3144a.a();
            androidx.camera.core.impl.v0.a aVar3 = bVar2.f5612b;
            aVar3.getClass();
            aVar3.f5822b = androidx.camera.core.impl.w1.V(aVarA);
            this.f173883g.f5612b.f5827g.f5841a.put("CameraControlSessionUpdateId", Long.valueOf(this.A));
            return this.f173883g.c();
        }
        c3144a.e(CaptureRequest.FLASH_MODE, 2, bVar3);
        if (Build.VERSION.SDK_INT >= 35) {
            if (this.f173895s == 1) {
                c3144a.e(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f173896t), bVar3);
            } else if (this.f173895s == 2) {
                c3144a.e(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f173881e.b()), bVar3);
            }
        }
        i15 = i16;
        c3144a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(t(this.f173881e, i15)), bVar3);
        CaptureRequest.Key key4 = CaptureRequest.CONTROL_AWB_MODE;
        iArr = (int[]) this.f173881e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr != null) {
            i14 = 0;
        } else {
            i14 = 0;
        }
        c3144a.e(key4, Integer.valueOf(i14), bVar3);
        i1 i1Var2 = this.f173888l;
        i1Var2.getClass();
        CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION;
        j1Var = i1Var2.f173844a;
        synchronized (j1Var.f173853a) {
            int i19 = j1Var.f173854b;
            c3144a.e(key5, Integer.valueOf(i19), bVar3);
            dVar = this.f173890n;
            synchronized (dVar.f26e) {
                w1Var = dVar.f27f.f167307a;
                bVar = androidx.camera.core.impl.x0.b.ALWAYS_OVERRIDE;
                while (r5.hasNext()) {
                    c3144a.f167307a.W(aVar2, bVar, w1Var.e(aVar2));
                }
                u.a aVarA2 = c3144a.a();
                androidx.camera.core.impl.v0.a aVar4 = bVar2.f5612b;
                aVar4.getClass();
                aVar4.f5822b = androidx.camera.core.impl.w1.V(aVarA2);
                this.f173883g.f5612b.f5827g.f5841a.put("CameraControlSessionUpdateId", Long.valueOf(this.A));
                return this.f173883g.c();
            }
        }
    }

    public final int u(int i14) {
        int[] iArr = (int[]) this.f173881e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i14, iArr)) {
            return i14;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i14;
        synchronized (this.f173880d) {
            i14 = this.f173893q;
        }
        return i14 > 0;
    }

    public final void y(boolean z14) {
        m0.a aVarE;
        o1 o1Var = this.f173884h;
        if (z14 != o1Var.f173951d) {
            o1Var.f173951d = z14;
            if (!o1Var.f173951d) {
                o1Var.b();
            }
        }
        o2 o2Var = this.f173885i;
        if (o2Var.f173975f != z14) {
            o2Var.f173975f = z14;
            if (!z14) {
                synchronized (o2Var.f173972c) {
                    o2Var.f173972c.f(1.0f);
                    aVarE = m0.e.e(o2Var.f173972c);
                }
                o2Var.c(aVarE);
                o2Var.f173974e.e();
                o2Var.f173970a.B();
            }
        }
        v1 v1Var = this.f173887k;
        if (v1Var.f174093c != z14) {
            v1Var.f174093c = z14;
        }
        k2 k2Var = this.f173886j;
        int i14 = k2Var.f173875g;
        if (k2Var.f173874f != z14) {
            k2Var.f173874f = z14;
            if (!z14) {
                if (k2Var.f173877i) {
                    k2Var.f173877i = false;
                    k2Var.f173869a.r(0);
                    k2Var.b(0);
                    androidx.lifecycle.y0<Integer> y0Var = k2Var.f173871c;
                    Integer numValueOf = Integer.valueOf(i14);
                    if (j0.u.b()) {
                        y0Var.m(numValueOf);
                    } else {
                        y0Var.j(numValueOf);
                    }
                }
                androidx.concurrent.futures.b.a<Void> aVar = k2Var.f173876h;
                if (aVar != null) {
                    aVar.d(new CameraControl.OperationCanceledException("Camera is not active."));
                    k2Var.f173876h = null;
                }
            }
        }
        i1 i1Var = this.f173888l;
        if (z14 != i1Var.f173846c) {
            i1Var.f173846c = z14;
            if (!z14) {
                j1 j1Var = i1Var.f173844a;
                synchronized (j1Var.f173853a) {
                    j1Var.f173854b = 0;
                }
            }
        }
        a0.d dVar = this.f173890n;
        dVar.f25d.execute(new a0.a(dVar, z14, 0));
        if (z14) {
            return;
        }
        this.f173894r = null;
        this.f173892p.f173934b.set(0);
    }

    public final void z(boolean z14) {
        synchronized (this.f173887k.f174091a) {
            try {
                if (z14) {
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public l(androidx.camera.camera2.internal.compat.h hVar, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.b bVar) {
        this(hVar, scheduledExecutorService, executor, bVar, new androidx.camera.core.impl.i2(new ArrayList()));
    }
}
