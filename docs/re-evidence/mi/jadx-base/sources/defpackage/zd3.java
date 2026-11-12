package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class zd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd3 f41137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xdq f41138b;
    public final lgi c;
    public final Executor d;
    public final boolean e;
    public int f = 1;

    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dd3 f41139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ofh f41140b;
        public final int c;
        public boolean d = false;

        public a(dd3 dd3Var, int i, ofh ofhVar) {
            this.f41139a = dd3Var;
            this.c = i;
            this.f41140b = ofhVar;
        }

        public static /* synthetic */ Boolean g(Void r0) {
            return Boolean.TRUE;
        }

        @Override // zd3.d
        public lhe<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!zd3.a(this.c, totalCaptureResult)) {
                return oua.h(Boolean.FALSE);
            }
            zpe.a("Camera2CapturePipeline", "Trigger AE");
            this.d = true;
            return kua.a(cb3.a(new cb3.c() { // from class: xd3
                @Override // cb3.c
                public final Object a(cb3.a aVar) {
                    return this.f39008a.f(aVar);
                }
            })).d(new Function() { // from class: yd3
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return zd3.a.g((Void) obj);
                }
            }, li3.a());
        }

        @Override // zd3.d
        public boolean b() {
            return this.c == 0;
        }

        @Override // zd3.d
        public void c() {
            if (this.d) {
                zpe.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f41139a.y().c(false, true);
                this.f41140b.a();
            }
        }

        public final /* synthetic */ Object f(cb3.a aVar) throws Exception {
            this.f41139a.y().p(aVar);
            this.f41140b.b();
            return "AePreCapture";
        }
    }

    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dd3 f41141a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41142b = false;

        public b(dd3 dd3Var) {
            this.f41141a = dd3Var;
        }

        @Override // zd3.d
        public lhe<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            lhe<Boolean> lheVarH = oua.h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return lheVarH;
            }
            int iIntValue = num.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                zpe.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    zpe.a("Camera2CapturePipeline", "Trigger AF");
                    this.f41142b = true;
                    this.f41141a.y().q(null, false);
                }
            }
            return lheVarH;
        }

        @Override // zd3.d
        public boolean b() {
            return true;
        }

        @Override // zd3.d
        public void c() {
            if (this.f41142b) {
                zpe.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f41141a.y().c(true, false);
            }
        }
    }

    @VisibleForTesting
    public static class c {
        public static final long i;
        public static final long j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f41143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f41144b;
        public final dd3 c;
        public final ofh d;
        public final boolean e;
        public long f = i;
        public final List<d> g = new ArrayList();
        public final d h = new a();

        public class a implements d {
            public a() {
            }

            public static /* synthetic */ Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // zd3.d
            public lhe<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = c.this.g.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return oua.o(oua.c(arrayList), new Function() { // from class: ge3
                    @Override // androidx.arch.core.util.Function
                    public final Object apply(Object obj) {
                        return zd3.c.a.e((List) obj);
                    }
                }, li3.a());
            }

            @Override // zd3.d
            public boolean b() {
                Iterator<d> it = c.this.g.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // zd3.d
            public void c() {
                Iterator<d> it = c.this.g.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        public class b extends we3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ cb3.a f41146a;

            public b(cb3.a aVar) {
                this.f41146a = aVar;
            }

            @Override // defpackage.we3
            public void a() {
                this.f41146a.f(new ImageCaptureException(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // defpackage.we3
            public void b(ye3 ye3Var) {
                this.f41146a.c(null);
            }

            @Override // defpackage.we3
            public void c(CameraCaptureFailure cameraCaptureFailure) {
                this.f41146a.f(new ImageCaptureException(2, "Capture request failed with reason " + cameraCaptureFailure.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            i = timeUnit.toNanos(1L);
            j = timeUnit.toNanos(5L);
        }

        public c(int i2, Executor executor, dd3 dd3Var, boolean z, ofh ofhVar) {
            this.f41143a = i2;
            this.f41144b = executor;
            this.c = dd3Var;
            this.e = z;
            this.d = ofhVar;
        }

        public void g(d dVar) {
            this.g.add(dVar);
        }

        @OptIn(markerClass = {dj8.class})
        public final void h(androidx.camera.core.impl.e.a aVar) {
            pe3.a aVar2 = new pe3.a();
            aVar2.e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(aVar2.c());
        }

        public final void i(androidx.camera.core.impl.e.a aVar, androidx.camera.core.impl.e eVar) {
            int i2;
            if (this.f41143a != 3 || this.e) {
                i2 = (eVar.g() == -1 || eVar.g() == 5) ? 2 : -1;
            } else {
                i2 = 4;
            }
            if (i2 != -1) {
                aVar.p(i2);
            }
        }

        public lhe<List<Void>> j(final List<androidx.camera.core.impl.e> list, final int i2) {
            lhe lheVarH = oua.h(null);
            if (!this.g.isEmpty()) {
                lheVarH = kua.a(this.h.b() ? s(0L, null) : oua.h(null)).e(new fl1() { // from class: ae3
                    @Override // defpackage.fl1
                    public final lhe apply(Object obj) {
                        return this.f915a.l(i2, (TotalCaptureResult) obj);
                    }
                }, this.f41144b).e(new fl1() { // from class: be3
                    @Override // defpackage.fl1
                    public final lhe apply(Object obj) {
                        return this.f4119a.m((Boolean) obj);
                    }
                }, this.f41144b);
            }
            kua kuaVarE = kua.a(lheVarH).e(new fl1() { // from class: ce3
                @Override // defpackage.fl1
                public final lhe apply(Object obj) {
                    return this.f5238a.n(list, i2, (TotalCaptureResult) obj);
                }
            }, this.f41144b);
            kuaVarE.addListener(new Runnable() { // from class: de3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15432a.o();
                }
            }, this.f41144b);
            return kuaVarE;
        }

        public final boolean k(TotalCaptureResult totalCaptureResult) {
            if (totalCaptureResult == null) {
                return false;
            }
            hc3 hc3Var = new hc3(totalCaptureResult);
            boolean z = hc3Var.f() == CameraCaptureMetaData$AfMode.OFF || hc3Var.f() == CameraCaptureMetaData$AfMode.UNKNOWN || hc3Var.g() == CameraCaptureMetaData$AfState.PASSIVE_FOCUSED || hc3Var.g() == CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED || hc3Var.g() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || hc3Var.g() == CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED;
            boolean z2 = hc3Var.e() == CameraCaptureMetaData$AeState.CONVERGED || hc3Var.e() == CameraCaptureMetaData$AeState.FLASH_REQUIRED || hc3Var.e() == CameraCaptureMetaData$AeState.UNKNOWN;
            boolean z3 = hc3Var.h() == CameraCaptureMetaData$AwbState.CONVERGED || hc3Var.h() == CameraCaptureMetaData$AwbState.UNKNOWN;
            zpe.a("Camera2CapturePipeline", "checkCaptureResult, AE=" + hc3Var.e() + " AF =" + hc3Var.g() + " AWB=" + hc3Var.h());
            return z && z2 && z3;
        }

        public final /* synthetic */ lhe l(int i2, TotalCaptureResult totalCaptureResult) throws Exception {
            if (zd3.a(i2, totalCaptureResult)) {
                q(j);
            }
            return this.h.a(totalCaptureResult);
        }

        public final /* synthetic */ lhe m(Boolean bool) throws Exception {
            return bool.booleanValue() ? s(this.f, new e.a() { // from class: fe3
                @Override // zd3.e.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return this.f17698a.k(totalCaptureResult);
                }
            }) : oua.h(null);
        }

        public final /* synthetic */ lhe n(List list, int i2, TotalCaptureResult totalCaptureResult) throws Exception {
            return r(list, i2);
        }

        public final /* synthetic */ void o() {
            this.h.c();
        }

        public final /* synthetic */ Object p(androidx.camera.core.impl.e.a aVar, cb3.a aVar2) throws Exception {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        public final void q(long j2) {
            this.f = j2;
        }

        public lhe<List<Void>> r(List<androidx.camera.core.impl.e> list, int i2) {
            m mVarC;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (androidx.camera.core.impl.e eVar : list) {
                final androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(eVar);
                ye3 ye3VarA = (eVar.g() == 5 && (mVarC = this.c.H().c()) != null && this.c.H().d(mVarC)) ? af3.a(mVarC.H()) : null;
                if (ye3VarA != null) {
                    aVarK.n(ye3VarA);
                } else {
                    i(aVarK, eVar);
                }
                if (this.d.c(i2)) {
                    h(aVarK);
                }
                arrayList.add(cb3.a(new cb3.c() { // from class: ee3
                    @Override // cb3.c
                    public final Object a(cb3.a aVar) {
                        return this.f16554a.p(aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.c.d0(arrayList2);
            return oua.c(arrayList);
        }

        public final lhe<TotalCaptureResult> s(long j2, e.a aVar) {
            e eVar = new e(j2, aVar);
            this.c.t(eVar);
            return eVar.c();
        }
    }

    public interface d {
        lhe<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class e implements dd3.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public cb3.a<TotalCaptureResult> f41148a;
        public final long c;
        public final a d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final lhe<TotalCaptureResult> f41149b = cb3.a(new cb3.c() { // from class: he3
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f19968a.d(aVar);
            }
        });
        public volatile Long e = null;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public e(long j, a aVar) {
            this.c = j;
            this.d = aVar;
        }

        @Override // dd3.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.e == null) {
                this.e = l;
            }
            Long l2 = this.e;
            if (0 == this.c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.c) {
                a aVar = this.d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f41148a.c(totalCaptureResult);
                return true;
            }
            this.f41148a.c(null);
            zpe.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l + " first: " + l2);
            return true;
        }

        public lhe<TotalCaptureResult> c() {
            return this.f41149b;
        }

        public final /* synthetic */ Object d(cb3.a aVar) throws Exception {
            this.f41148a = aVar;
            return "waitFor3AResult";
        }
    }

    public static class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dd3 f41150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f41151b;
        public boolean c = false;

        public f(dd3 dd3Var, int i) {
            this.f41150a = dd3Var;
            this.f41151b = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object f(cb3.a aVar) throws Exception {
            this.f41150a.E().g(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean g(Void r0) {
            return Boolean.TRUE;
        }

        @Override // zd3.d
        public lhe<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (zd3.a(this.f41151b, totalCaptureResult)) {
                if (!this.f41150a.M()) {
                    zpe.a("Camera2CapturePipeline", "Turn on torch");
                    this.c = true;
                    return kua.a(cb3.a(new cb3.c() { // from class: ie3
                        @Override // cb3.c
                        public final Object a(cb3.a aVar) {
                            return this.f21044a.f(aVar);
                        }
                    })).d(new Function() { // from class: je3
                        @Override // androidx.arch.core.util.Function
                        public final Object apply(Object obj) {
                            return zd3.f.g((Void) obj);
                        }
                    }, li3.a());
                }
                zpe.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return oua.h(Boolean.FALSE);
        }

        @Override // zd3.d
        public boolean b() {
            return this.f41151b == 0;
        }

        @Override // zd3.d
        public void c() {
            if (this.c) {
                this.f41150a.E().g(null, false);
                zpe.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    public zd3(dd3 dd3Var, vf3 vf3Var, lgi lgiVar, Executor executor) {
        this.f41137a = dd3Var;
        Integer num = (Integer) vf3Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.e = num != null && num.intValue() == 2;
        this.d = executor;
        this.c = lgiVar;
        this.f41138b = new xdq(lgiVar);
    }

    public static boolean a(int i, TotalCaptureResult totalCaptureResult) {
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new AssertionError(i);
    }

    public final boolean b(int i) {
        return this.f41138b.a() || this.f == 3 || i == 1;
    }

    public void c(int i) {
        this.f = i;
    }

    public lhe<List<Void>> d(List<androidx.camera.core.impl.e> list, int i, int i2, int i3) {
        ofh ofhVar = new ofh(this.c);
        c cVar = new c(this.f, this.d, this.f41137a, this.e, ofhVar);
        if (i == 0) {
            cVar.g(new b(this.f41137a));
        }
        if (b(i3)) {
            cVar.g(new f(this.f41137a, i2));
        } else {
            cVar.g(new a(this.f41137a, i2, ofhVar));
        }
        return oua.j(cVar.j(list, i2));
    }
}
