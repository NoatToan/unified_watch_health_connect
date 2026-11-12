package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.google.android.exoplayer2.C;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f173626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.x f173627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f173628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.i2 f173629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f173630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f173631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f173632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f173633h = 1;

    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f173634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y.m f173635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f173636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f173637d = false;

        public a(l lVar, int i14, y.m mVar) {
            this.f173634a = lVar;
            this.f173636c = i14;
            this.f173635b = mVar;
        }

        @Override // v.a0.e
        public final ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult) {
            l lVar = this.f173634a;
            lVar.getClass();
            if (!a0.c(this.f173636c, totalCaptureResult)) {
                return l0.j.e(Boolean.FALSE);
            }
            this.f173637d = true;
            androidx.concurrent.futures.b.a<Void> aVar = new androidx.concurrent.futures.b.a<>();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                lVar.f173884h.e(aVar);
                this.f173635b.f192952b = true;
                aVar.f6079a = "AePreCapture";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            l0.d dVarA = l0.d.a(dVar);
            u62.z zVar = new u62.z(26);
            k0.c cVarA = k0.b.a();
            l0.j.a aVar2 = l0.j.f107810a;
            return l0.j.j(dVarA, new l0.i(zVar), cVarA);
        }

        @Override // v.a0.e
        public final boolean b() {
            return this.f173636c == 0;
        }

        @Override // v.a0.e
        public final void c() {
            if (this.f173637d) {
                this.f173634a.f173884h.a(false, true);
                this.f173635b.f192952b = false;
            }
        }
    }

    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f173638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f173639b = false;

        public b(l lVar) {
            this.f173638a = lVar;
        }

        @Override // v.a0.e
        public final ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            Integer num2;
            l0.m.c cVarE = l0.j.e(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && (((iIntValue = num.intValue()) == 1 || iIntValue == 2) && (num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE)) != null && num2.intValue() == 0)) {
                this.f173639b = true;
                this.f173638a.f173884h.f(false);
            }
            return cVarE;
        }

        @Override // v.a0.e
        public final boolean b() {
            return true;
        }

        @Override // v.a0.e
        public final void c() {
            if (this.f173639b) {
                this.f173638a.f173884h.a(true, false);
            }
        }
    }

    public static class c implements h0.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f173640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f173641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f173642c;

        public c(d dVar, Executor executor, int i14) {
            this.f173641b = dVar;
            this.f173640a = executor;
            this.f173642c = i14;
        }

        @Override // h0.m
        public final ListenableFuture<Void> a() {
            l0.d dVarA = l0.d.a(this.f173641b.a(this.f173642c));
            u62.z zVar = new u62.z(27);
            l0.j.a aVar = l0.j.f107810a;
            return l0.j.j(dVarA, new l0.i(zVar), this.f173640a);
        }

        @Override // h0.m
        public final ListenableFuture<Void> b() {
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                this.f173641b.f173651i.c();
                aVar.b(null);
                aVar.f6079a = "invokePostCaptureFuture";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            return dVar;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f173643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f173644b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f173645c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l f173646d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final y.m f173647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f173648f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f173649g = C.NANOS_PER_SECOND;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ArrayList f173650h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final a f173651i = new a();

        public class a implements e {
            public a() {
            }

            @Override // v.a0.e
            public final ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f173650h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                l0.n nVarB = l0.j.b(arrayList);
                u62.z zVar = new u62.z(29);
                return l0.j.j(nVarB, new l0.i(zVar), k0.b.a());
            }

            @Override // v.a0.e
            public final boolean b() {
                Iterator it = d.this.f173650h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // v.a0.e
            public final void c() {
                Iterator it = d.this.f173650h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        public d(int i14, Executor executor, ScheduledExecutorService scheduledExecutorService, l lVar, boolean z14, y.m mVar) {
            this.f173643a = i14;
            this.f173644b = executor;
            this.f173645c = scheduledExecutorService;
            this.f173646d = lVar;
            this.f173648f = z14;
            this.f173647e = mVar;
        }

        public final ListenableFuture<TotalCaptureResult> a(int i14) {
            l0.j.a aVar = l0.j.f107810a;
            ListenableFuture listenableFuture = l0.m.c.f107817b;
            if (this.f173650h.isEmpty()) {
                return listenableFuture;
            }
            if (this.f173651i.b()) {
                f fVar = new f(null);
                l lVar = this.f173646d;
                lVar.p(fVar);
                r0.h hVar = new r0.h(22, lVar, fVar);
                Executor executor = lVar.f173879c;
                listenableFuture = fVar.f173654b;
                listenableFuture.addListener(hVar, executor);
            }
            l0.d dVarA = l0.d.a(listenableFuture);
            a73.m mVar = new a73.m(this, i14, 5);
            Executor executor2 = this.f173644b;
            return l0.j.j(l0.j.j(dVarA, mVar, executor2), new tr2.b(this, 16), executor2);
        }
    }

    public interface e {
        ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class f implements l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.concurrent.futures.b.a<TotalCaptureResult> f173653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.concurrent.futures.b.d f173654b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f173655c;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            androidx.concurrent.futures.b.a<TotalCaptureResult> aVar2 = new androidx.concurrent.futures.b.a<>();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar;
            try {
                this.f173653a = aVar2;
                aVar2.f6079a = "waitFor3AResult";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            this.f173654b = dVar;
            this.f173655c = aVar;
        }

        @Override // v.l.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f173655c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f173653a.b(totalCaptureResult);
            return true;
        }
    }

    public static class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f173656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f173657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f173658c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b0.l0.j f173659d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final y.w f173660e;

        public g(l lVar, Executor executor, ScheduledExecutorService scheduledExecutorService, y.w wVar) {
            this.f173656a = lVar;
            this.f173657b = executor;
            this.f173658c = scheduledExecutorService;
            this.f173660e = wVar;
            b0.l0.j jVar = lVar.f173894r;
            Objects.requireNonNull(jVar);
            this.f173659d = jVar;
        }

        @Override // v.a0.e
        public final ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult) {
            AtomicReference atomicReference = new AtomicReference();
            androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                atomicReference.set(new m0.g(aVar, 1));
                aVar.f6079a = "OnScreenFlashUiApplied";
            } catch (Exception e4) {
                dVar.a(e4);
            }
            androidx.concurrent.futures.b.a aVar2 = new androidx.concurrent.futures.b.a();
            androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
            aVar2.f6080b = dVar2;
            aVar2.f6079a = v.h.class;
            try {
                k0.b.d().execute(new uj2.b(this, 3, atomicReference, aVar2));
                aVar2.f6079a = "OnScreenFlashStart";
            } catch (Exception e14) {
                dVar2.a(e14);
            }
            l0.d dVarA = l0.d.a(dVar2);
            final int i14 = 0;
            l0.a aVar3 = new l0.a(this) { // from class: v.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0.g f173761b;

                {
                    this.f173761b = this;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0090  */
                @Override // l0.a
                public final ListenableFuture apply(Object obj) {
                    int i15 = i14;
                    boolean z14 = true;
                    a0.g gVar = this.f173761b;
                    switch (i15) {
                        case 0:
                            return gVar.f173656a.f173884h.c(true);
                        case 1:
                            androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar3 = new androidx.concurrent.futures.b.d<>(aVar4);
                            aVar4.f6080b = dVar3;
                            aVar4.f6079a = h.class;
                            try {
                                TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = gVar.f173660e.f192967a;
                                if (torchFlashRequiredFor3aUpdateQuirk == null) {
                                    z14 = false;
                                } else {
                                    if (l.t(torchFlashRequiredFor3aUpdateQuirk.f5405a, 5) == 5) {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    gVar.f173656a.r(2);
                                    aVar4.b(null);
                                } else {
                                    aVar4.b(null);
                                }
                                aVar4.f6079a = "EnableTorchInternal";
                                break;
                            } catch (Exception e15) {
                                dVar3.a(e15);
                            }
                            return dVar3;
                        case 2:
                            o1 o1Var = gVar.f173656a.f173884h;
                            o1Var.getClass();
                            androidx.concurrent.futures.b.a aVar5 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar5);
                            aVar5.f6080b = dVar4;
                            aVar5.f6079a = h.class;
                            try {
                                o1Var.f173949b.execute(new r0.h(24, o1Var, aVar5));
                                aVar5.f6079a = "triggerAePrecapture";
                                break;
                            } catch (Exception e16) {
                                dVar4.a(e16);
                            }
                            return dVar4;
                        default:
                            ScheduledExecutorService scheduledExecutorService = gVar.f173658c;
                            l lVar = gVar.f173656a;
                            a0.f fVar = new a0.f(new e0(1));
                            lVar.p(fVar);
                            r0.h hVar = new r0.h(22, lVar, fVar);
                            Executor executor = lVar.f173879c;
                            androidx.concurrent.futures.b.d dVar5 = fVar.f173654b;
                            dVar5.addListener(hVar, executor);
                            l0.j.a aVar6 = l0.j.f107810a;
                            return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar5, scheduledExecutorService, 2000L, 6));
                    }
                }
            };
            Executor executor = this.f173657b;
            final int i15 = 1;
            l0.b bVarJ = l0.j.j(l0.j.j(l0.j.j(dVarA, aVar3, executor), new l0.a(this) { // from class: v.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0.g f173761b;

                {
                    this.f173761b = this;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0090  */
                @Override // l0.a
                public final ListenableFuture apply(Object obj) {
                    int i16 = i15;
                    boolean z14 = true;
                    a0.g gVar = this.f173761b;
                    switch (i16) {
                        case 0:
                            return gVar.f173656a.f173884h.c(true);
                        case 1:
                            androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar3 = new androidx.concurrent.futures.b.d<>(aVar4);
                            aVar4.f6080b = dVar3;
                            aVar4.f6079a = h.class;
                            try {
                                TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = gVar.f173660e.f192967a;
                                if (torchFlashRequiredFor3aUpdateQuirk == null) {
                                    z14 = false;
                                } else {
                                    if (l.t(torchFlashRequiredFor3aUpdateQuirk.f5405a, 5) == 5) {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    gVar.f173656a.r(2);
                                    aVar4.b(null);
                                } else {
                                    aVar4.b(null);
                                }
                                aVar4.f6079a = "EnableTorchInternal";
                                break;
                            } catch (Exception e15) {
                                dVar3.a(e15);
                            }
                            return dVar3;
                        case 2:
                            o1 o1Var = gVar.f173656a.f173884h;
                            o1Var.getClass();
                            androidx.concurrent.futures.b.a aVar5 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar5);
                            aVar5.f6080b = dVar4;
                            aVar5.f6079a = h.class;
                            try {
                                o1Var.f173949b.execute(new r0.h(24, o1Var, aVar5));
                                aVar5.f6079a = "triggerAePrecapture";
                                break;
                            } catch (Exception e16) {
                                dVar4.a(e16);
                            }
                            return dVar4;
                        default:
                            ScheduledExecutorService scheduledExecutorService = gVar.f173658c;
                            l lVar = gVar.f173656a;
                            a0.f fVar = new a0.f(new e0(1));
                            lVar.p(fVar);
                            r0.h hVar = new r0.h(22, lVar, fVar);
                            Executor executor2 = lVar.f173879c;
                            androidx.concurrent.futures.b.d dVar5 = fVar.f173654b;
                            dVar5.addListener(hVar, executor2);
                            l0.j.a aVar6 = l0.j.f107810a;
                            return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar5, scheduledExecutorService, 2000L, 6));
                    }
                }
            }, executor), new o62.b0(20, this, dVar), executor);
            final int i16 = 2;
            l0.b bVarJ2 = l0.j.j(bVarJ, new l0.a(this) { // from class: v.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0.g f173761b;

                {
                    this.f173761b = this;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0090  */
                @Override // l0.a
                public final ListenableFuture apply(Object obj) {
                    int i17 = i16;
                    boolean z14 = true;
                    a0.g gVar = this.f173761b;
                    switch (i17) {
                        case 0:
                            return gVar.f173656a.f173884h.c(true);
                        case 1:
                            androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar3 = new androidx.concurrent.futures.b.d<>(aVar4);
                            aVar4.f6080b = dVar3;
                            aVar4.f6079a = h.class;
                            try {
                                TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = gVar.f173660e.f192967a;
                                if (torchFlashRequiredFor3aUpdateQuirk == null) {
                                    z14 = false;
                                } else {
                                    if (l.t(torchFlashRequiredFor3aUpdateQuirk.f5405a, 5) == 5) {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    gVar.f173656a.r(2);
                                    aVar4.b(null);
                                } else {
                                    aVar4.b(null);
                                }
                                aVar4.f6079a = "EnableTorchInternal";
                                break;
                            } catch (Exception e15) {
                                dVar3.a(e15);
                            }
                            return dVar3;
                        case 2:
                            o1 o1Var = gVar.f173656a.f173884h;
                            o1Var.getClass();
                            androidx.concurrent.futures.b.a aVar5 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar5);
                            aVar5.f6080b = dVar4;
                            aVar5.f6079a = h.class;
                            try {
                                o1Var.f173949b.execute(new r0.h(24, o1Var, aVar5));
                                aVar5.f6079a = "triggerAePrecapture";
                                break;
                            } catch (Exception e16) {
                                dVar4.a(e16);
                            }
                            return dVar4;
                        default:
                            ScheduledExecutorService scheduledExecutorService = gVar.f173658c;
                            l lVar = gVar.f173656a;
                            a0.f fVar = new a0.f(new e0(1));
                            lVar.p(fVar);
                            r0.h hVar = new r0.h(22, lVar, fVar);
                            Executor executor2 = lVar.f173879c;
                            androidx.concurrent.futures.b.d dVar5 = fVar.f173654b;
                            dVar5.addListener(hVar, executor2);
                            l0.j.a aVar6 = l0.j.f107810a;
                            return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar5, scheduledExecutorService, 2000L, 6));
                    }
                }
            }, executor);
            final int i17 = 3;
            l0.b bVarJ3 = l0.j.j(bVarJ2, new l0.a(this) { // from class: v.d0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a0.g f173761b;

                {
                    this.f173761b = this;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0090  */
                @Override // l0.a
                public final ListenableFuture apply(Object obj) {
                    int i18 = i17;
                    boolean z14 = true;
                    a0.g gVar = this.f173761b;
                    switch (i18) {
                        case 0:
                            return gVar.f173656a.f173884h.c(true);
                        case 1:
                            androidx.concurrent.futures.b.a aVar4 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar3 = new androidx.concurrent.futures.b.d<>(aVar4);
                            aVar4.f6080b = dVar3;
                            aVar4.f6079a = h.class;
                            try {
                                TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = gVar.f173660e.f192967a;
                                if (torchFlashRequiredFor3aUpdateQuirk == null) {
                                    z14 = false;
                                } else {
                                    if (l.t(torchFlashRequiredFor3aUpdateQuirk.f5405a, 5) == 5) {
                                        z14 = false;
                                    }
                                }
                                if (z14) {
                                    gVar.f173656a.r(2);
                                    aVar4.b(null);
                                } else {
                                    aVar4.b(null);
                                }
                                aVar4.f6079a = "EnableTorchInternal";
                                break;
                            } catch (Exception e15) {
                                dVar3.a(e15);
                            }
                            return dVar3;
                        case 2:
                            o1 o1Var = gVar.f173656a.f173884h;
                            o1Var.getClass();
                            androidx.concurrent.futures.b.a aVar5 = new androidx.concurrent.futures.b.a();
                            androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar5);
                            aVar5.f6080b = dVar4;
                            aVar5.f6079a = h.class;
                            try {
                                o1Var.f173949b.execute(new r0.h(24, o1Var, aVar5));
                                aVar5.f6079a = "triggerAePrecapture";
                                break;
                            } catch (Exception e16) {
                                dVar4.a(e16);
                            }
                            return dVar4;
                        default:
                            ScheduledExecutorService scheduledExecutorService = gVar.f173658c;
                            l lVar = gVar.f173656a;
                            a0.f fVar = new a0.f(new e0(1));
                            lVar.p(fVar);
                            r0.h hVar = new r0.h(22, lVar, fVar);
                            Executor executor2 = lVar.f173879c;
                            androidx.concurrent.futures.b.d dVar5 = fVar.f173654b;
                            dVar5.addListener(hVar, executor2);
                            l0.j.a aVar6 = l0.j.f107810a;
                            return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar5, scheduledExecutorService, 2000L, 6));
                    }
                }
            }, executor);
            e0 e0Var = new e0(0);
            return l0.j.j(bVarJ3, new l0.i(e0Var), k0.b.a());
        }

        @Override // v.a0.e
        public final boolean b() {
            return false;
        }

        @Override // v.a0.e
        public final void c() {
            TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f173660e.f192967a;
            l lVar = this.f173656a;
            if (torchFlashRequiredFor3aUpdateQuirk != null && l.t(torchFlashRequiredFor3aUpdateQuirk.f5405a, 5) != 5) {
                lVar.r(0);
            }
            lVar.f173884h.c(false).addListener(new ab2.a(9), this.f173657b);
            lVar.f173884h.a(false, true);
            k0.d dVarD = k0.b.d();
            b0.l0.j jVar = this.f173659d;
            Objects.requireNonNull(jVar);
            dVarD.execute(new b0(jVar, 1));
        }
    }

    public static class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f173661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f173662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f173663c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f173664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f173665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f173666f;

        public h(l lVar, int i14, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z14) {
            this.f173661a = lVar;
            this.f173662b = i14;
            this.f173664d = executor;
            this.f173665e = scheduledExecutorService;
            this.f173666f = z14;
        }

        @Override // v.a0.e
        public final ListenableFuture<Boolean> a(TotalCaptureResult totalCaptureResult) {
            a0.c(this.f173662b, totalCaptureResult);
            if (a0.c(this.f173662b, totalCaptureResult)) {
                this.f173661a.getClass();
                if (this.f173661a.f173895s == 0) {
                    this.f173663c = true;
                    androidx.concurrent.futures.b.a<Void> aVar = new androidx.concurrent.futures.b.a<>();
                    androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
                    aVar.f6080b = dVar;
                    aVar.f6079a = v.h.class;
                    try {
                        this.f173661a.f173886j.a(aVar, 2);
                        aVar.f6079a = "TorchOn";
                    } catch (Exception e4) {
                        dVar.a(e4);
                    }
                    l0.d dVarA = l0.d.a(dVar);
                    final int i14 = 0;
                    l0.b bVarJ = l0.j.j(dVarA, new l0.a(this) { // from class: v.f0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a0.h f173800b;

                        {
                            this.f173800b = this;
                        }

                        @Override // l0.a
                        public final ListenableFuture apply(Object obj) {
                            int i15 = i14;
                            a0.h hVar = this.f173800b;
                            switch (i15) {
                                case 0:
                                    if (!hVar.f173666f) {
                                        l0.j.a aVar2 = l0.j.f107810a;
                                        return l0.m.c.f107817b;
                                    }
                                    o1 o1Var = hVar.f173661a.f173884h;
                                    o1Var.getClass();
                                    androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
                                    androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
                                    aVar3.f6080b = dVar2;
                                    aVar3.f6079a = h.class;
                                    try {
                                        o1Var.f173949b.execute(new r0.h(24, o1Var, aVar3));
                                        aVar3.f6079a = "triggerAePrecapture";
                                        return dVar2;
                                    } catch (Exception e14) {
                                        dVar2.a(e14);
                                        return dVar2;
                                    }
                                default:
                                    ScheduledExecutorService scheduledExecutorService = hVar.f173665e;
                                    l lVar = hVar.f173661a;
                                    a0.f fVar = new a0.f(new e0(2));
                                    lVar.p(fVar);
                                    r0.h hVar2 = new r0.h(22, lVar, fVar);
                                    Executor executor = lVar.f173879c;
                                    androidx.concurrent.futures.b.d dVar3 = fVar.f173654b;
                                    dVar3.addListener(hVar2, executor);
                                    l0.j.a aVar4 = l0.j.f107810a;
                                    return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar3, scheduledExecutorService, 2000L, 6));
                            }
                        }
                    }, this.f173664d);
                    final int i15 = 1;
                    l0.b bVarJ2 = l0.j.j(bVarJ, new l0.a(this) { // from class: v.f0

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ a0.h f173800b;

                        {
                            this.f173800b = this;
                        }

                        @Override // l0.a
                        public final ListenableFuture apply(Object obj) {
                            int i16 = i15;
                            a0.h hVar = this.f173800b;
                            switch (i16) {
                                case 0:
                                    if (!hVar.f173666f) {
                                        l0.j.a aVar2 = l0.j.f107810a;
                                        return l0.m.c.f107817b;
                                    }
                                    o1 o1Var = hVar.f173661a.f173884h;
                                    o1Var.getClass();
                                    androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
                                    androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
                                    aVar3.f6080b = dVar2;
                                    aVar3.f6079a = h.class;
                                    try {
                                        o1Var.f173949b.execute(new r0.h(24, o1Var, aVar3));
                                        aVar3.f6079a = "triggerAePrecapture";
                                        return dVar2;
                                    } catch (Exception e14) {
                                        dVar2.a(e14);
                                        return dVar2;
                                    }
                                default:
                                    ScheduledExecutorService scheduledExecutorService = hVar.f173665e;
                                    l lVar = hVar.f173661a;
                                    a0.f fVar = new a0.f(new e0(2));
                                    lVar.p(fVar);
                                    r0.h hVar2 = new r0.h(22, lVar, fVar);
                                    Executor executor = lVar.f173879c;
                                    androidx.concurrent.futures.b.d dVar3 = fVar.f173654b;
                                    dVar3.addListener(hVar2, executor);
                                    l0.j.a aVar4 = l0.j.f107810a;
                                    return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(dVar3, scheduledExecutorService, 2000L, 6));
                            }
                        }
                    }, this.f173664d);
                    e0 e0Var = new e0(0);
                    return l0.j.j(bVarJ2, new l0.i(e0Var), k0.b.a());
                }
            }
            return l0.j.e(Boolean.FALSE);
        }

        @Override // v.a0.e
        public final boolean b() {
            return this.f173662b == 0;
        }

        @Override // v.a0.e
        public final void c() {
            if (this.f173663c) {
                l lVar = this.f173661a;
                lVar.f173886j.a(null, 0);
                if (this.f173666f) {
                    lVar.f173884h.a(false, true);
                }
            }
        }
    }

    public a0(l lVar, androidx.camera.camera2.internal.compat.h hVar, androidx.camera.core.impl.i2 i2Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f173626a = lVar;
        Integer num = (Integer) hVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f173632g = num != null && num.intValue() == 2;
        this.f173630e = executor;
        this.f173631f = scheduledExecutorService;
        this.f173629d = i2Var;
        this.f173627b = new y.x(i2Var);
        this.f173628c = y.f.a(new tr2.b(hVar, 15));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    public static boolean b(TotalCaptureResult totalCaptureResult, boolean z14) {
        androidx.camera.core.impl.x xVar;
        androidx.camera.core.impl.v vVar;
        androidx.camera.core.impl.z zVar;
        if (totalCaptureResult != null) {
            v.g gVar = new v.g(totalCaptureResult);
            Set<androidx.camera.core.impl.y> set = androidx.camera.core.impl.z0.f5878a;
            CaptureResult.Key key = CaptureResult.CONTROL_AF_MODE;
            CaptureResult captureResult = gVar.f173807b;
            Integer num = (Integer) captureResult.get(key);
            if (num == null) {
                xVar = androidx.camera.core.impl.x.UNKNOWN;
            } else {
                int iIntValue = num.intValue();
                if (iIntValue == 0) {
                    xVar = androidx.camera.core.impl.x.OFF;
                } else if (iIntValue == 1 || iIntValue == 2) {
                    xVar = androidx.camera.core.impl.x.ON_MANUAL_AUTO;
                } else if (iIntValue == 3 || iIntValue == 4) {
                    xVar = androidx.camera.core.impl.x.ON_CONTINUOUS_AUTO;
                } else if (iIntValue != 5) {
                    xVar = androidx.camera.core.impl.x.UNKNOWN;
                } else {
                    xVar = androidx.camera.core.impl.x.OFF;
                }
            }
            boolean z15 = xVar == androidx.camera.core.impl.x.OFF || androidx.camera.core.impl.z0.f5878a.contains(gVar.d());
            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_MODE);
            if (num2 == null) {
                vVar = androidx.camera.core.impl.v.UNKNOWN;
            } else {
                int iIntValue2 = num2.intValue();
                if (iIntValue2 == 0) {
                    vVar = androidx.camera.core.impl.v.OFF;
                } else if (iIntValue2 == 1) {
                    vVar = androidx.camera.core.impl.v.ON;
                } else if (iIntValue2 == 2) {
                    vVar = androidx.camera.core.impl.v.ON_AUTO_FLASH;
                } else if (iIntValue2 == 3) {
                    vVar = androidx.camera.core.impl.v.ON_ALWAYS_FLASH;
                } else if (iIntValue2 != 4) {
                    vVar = iIntValue2 != 5 ? androidx.camera.core.impl.v.UNKNOWN : androidx.camera.core.impl.v.ON_EXTERNAL_FLASH;
                } else {
                    vVar = androidx.camera.core.impl.v.ON_AUTO_FLASH_REDEYE;
                }
            }
            boolean z16 = vVar == androidx.camera.core.impl.v.OFF;
            boolean z17 = !z14 ? !(z16 || androidx.camera.core.impl.z0.f5880c.contains(gVar.f())) : !(z16 || androidx.camera.core.impl.z0.f5881d.contains(gVar.f()));
            Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AWB_MODE);
            if (num3 != null) {
                switch (num3.intValue()) {
                    case 0:
                        zVar = androidx.camera.core.impl.z.OFF;
                        break;
                    case 1:
                        zVar = androidx.camera.core.impl.z.AUTO;
                        break;
                    case 2:
                        zVar = androidx.camera.core.impl.z.INCANDESCENT;
                        break;
                    case 3:
                        zVar = androidx.camera.core.impl.z.FLUORESCENT;
                        break;
                    case 4:
                        zVar = androidx.camera.core.impl.z.WARM_FLUORESCENT;
                        break;
                    case 5:
                        zVar = androidx.camera.core.impl.z.DAYLIGHT;
                        break;
                    case 6:
                        zVar = androidx.camera.core.impl.z.CLOUDY_DAYLIGHT;
                        break;
                    case 7:
                        zVar = androidx.camera.core.impl.z.TWILIGHT;
                        break;
                    case 8:
                        zVar = androidx.camera.core.impl.z.SHADE;
                        break;
                    default:
                        zVar = androidx.camera.core.impl.z.UNKNOWN;
                        break;
                }
            } else {
                zVar = androidx.camera.core.impl.z.UNKNOWN;
            }
            boolean z18 = zVar == androidx.camera.core.impl.z.OFF || androidx.camera.core.impl.z0.f5879b.contains(gVar.e());
            Objects.toString(gVar.f());
            Objects.toString(gVar.d());
            Objects.toString(gVar.e());
            if (z15 && z17 && z18) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(int i14, TotalCaptureResult totalCaptureResult) {
        if (i14 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                return false;
            }
            if (i14 != 3) {
                throw new AssertionError(i14);
            }
        }
        return true;
    }

    public final d a(int i14, int i15, int i16) {
        androidx.camera.core.impl.i2 i2Var = this.f173629d;
        y.m mVar = new y.m(i2Var);
        d dVar = new d(this.f173633h, this.f173630e, this.f173631f, this.f173626a, this.f173632g, mVar);
        l lVar = this.f173626a;
        ArrayList arrayList = dVar.f173650h;
        if (i14 == 0) {
            arrayList.add(new b(lVar));
        }
        if (i15 == 3) {
            arrayList.add(new g(lVar, this.f173630e, this.f173631f, new y.w(i2Var)));
        } else if (this.f173628c) {
            boolean z14 = this.f173627b.f192968a;
            if (z14 || this.f173633h == 3 || i16 == 1) {
                arrayList.add(new h(this.f173626a, i15, this.f173630e, this.f173631f, !z14 && lVar.f173892p.f173934b.get() <= 0));
            } else {
                arrayList.add(new a(lVar, i15, mVar));
            }
        }
        Objects.toString(arrayList);
        return dVar;
    }
}
