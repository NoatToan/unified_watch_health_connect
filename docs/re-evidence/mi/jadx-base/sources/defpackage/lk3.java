package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.m;
import androidx.camera.core.impl.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class lk3 implements mk3 {

    @GuardedBy("mSessionLock")
    public ivo e;

    @GuardedBy("mSessionLock")
    public wuo f;

    @GuardedBy("mSessionLock")
    public SessionConfig g;

    @GuardedBy("mSessionLock")
    public d l;

    @GuardedBy("mSessionLock")
    public lhe<Void> m;

    @GuardedBy("mSessionLock")
    public cb3.a<Void> n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25153a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public final List<androidx.camera.core.impl.e> f25154b = new ArrayList();
    public final CameraCaptureSession.CaptureCallback c = new a();

    @GuardedBy("mSessionLock")
    public Config h = n.L();

    @GuardedBy("mSessionLock")
    public xg3 i = xg3.e();

    @GuardedBy("mSessionLock")
    public final Map<DeferrableSurface, Surface> j = new HashMap();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mSessionLock")
    public List<DeferrableSurface> f25155k = Collections.emptyList();
    public final wfo o = new wfo();

    @GuardedBy("mSessionLock")
    public final e d = new e();

    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    public class b implements jua<Void> {
        public b() {
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            synchronized (lk3.this.f25153a) {
                try {
                    lk3.this.e.e();
                    int i = c.f25158a[lk3.this.l.ordinal()];
                    if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                        zpe.l("CaptureSession", "Opening session with fail " + lk3.this.l, th);
                        lk3.this.l();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25158a;

        static {
            int[] iArr = new int[d.values().length];
            f25158a = iArr;
            try {
                iArr[d.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25158a[d.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25158a[d.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25158a[d.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25158a[d.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25158a[d.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25158a[d.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f25158a[d.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum d {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    public final class e extends wuo.a {
        public e() {
        }

        @Override // wuo.a
        public void p(wuo wuoVar) {
            synchronized (lk3.this.f25153a) {
                try {
                    switch (c.f25158a[lk3.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + lk3.this.l);
                        case 4:
                        case 6:
                        case 7:
                            lk3.this.l();
                            break;
                        case 8:
                            zpe.a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                            break;
                    }
                    zpe.c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + lk3.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // wuo.a
        public void q(wuo wuoVar) {
            synchronized (lk3.this.f25153a) {
                try {
                    switch (c.f25158a[lk3.this.l.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 5:
                        case 8:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + lk3.this.l);
                        case 4:
                            lk3 lk3Var = lk3.this;
                            lk3Var.l = d.OPENED;
                            lk3Var.f = wuoVar;
                            if (lk3Var.g != null) {
                                List<androidx.camera.core.impl.e> listB = lk3Var.i.d().b();
                                if (!listB.isEmpty()) {
                                    lk3 lk3Var2 = lk3.this;
                                    lk3Var2.m(lk3Var2.u(listB));
                                }
                            }
                            zpe.a("CaptureSession", "Attempting to send capture request onConfigured");
                            lk3 lk3Var3 = lk3.this;
                            lk3Var3.o(lk3Var3.g);
                            lk3.this.n();
                            break;
                        case 6:
                            lk3.this.f = wuoVar;
                            break;
                        case 7:
                            wuoVar.close();
                            break;
                    }
                    zpe.a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + lk3.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // wuo.a
        public void r(wuo wuoVar) {
            synchronized (lk3.this.f25153a) {
                try {
                    if (c.f25158a[lk3.this.l.ordinal()] == 1) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + lk3.this.l);
                    }
                    zpe.a("CaptureSession", "CameraCaptureSession.onReady() " + lk3.this.l);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // wuo.a
        public void s(wuo wuoVar) {
            synchronized (lk3.this.f25153a) {
                try {
                    if (lk3.this.l == d.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + lk3.this.l);
                    }
                    zpe.a("CaptureSession", "onSessionFinished()");
                    lk3.this.l();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public lk3() {
        this.l = d.UNINITIALIZED;
        this.l = d.INITIALIZED;
    }

    public static Config s(List<androidx.camera.core.impl.e> list) {
        m mVarO = m.O();
        Iterator<androidx.camera.core.impl.e> it = list.iterator();
        while (it.hasNext()) {
            Config configD = it.next().d();
            for (Config.a<?> aVar : configD.h()) {
                Object objD = configD.d(aVar, null);
                if (mVarO.f(aVar)) {
                    Object objD2 = mVarO.d(aVar, null);
                    if (!Objects.equals(objD2, objD)) {
                        zpe.a("CaptureSession", "Detect conflicting option " + aVar.c() + " : " + objD + " != " + objD2);
                    }
                } else {
                    mVarO.z(aVar, objD);
                }
            }
        }
        return mVarO;
    }

    @Override // defpackage.mk3
    public lhe<Void> a(final SessionConfig sessionConfig, final CameraDevice cameraDevice, ivo ivoVar) {
        synchronized (this.f25153a) {
            try {
                if (c.f25158a[this.l.ordinal()] == 2) {
                    this.l = d.GET_SURFACE;
                    ArrayList arrayList = new ArrayList(sessionConfig.j());
                    this.f25155k = arrayList;
                    this.e = ivoVar;
                    kua kuaVarE = kua.a(ivoVar.d(arrayList, 5000L)).e(new fl1() { // from class: kk3
                        @Override // defpackage.fl1
                        public final lhe apply(Object obj) {
                            return this.f23938a.q(sessionConfig, cameraDevice, (List) obj);
                        }
                    }, this.e.b());
                    oua.b(kuaVarE, new b(), this.e.b());
                    return oua.j(kuaVarE);
                }
                zpe.c("CaptureSession", "Open not allowed in state: " + this.l);
                return oua.f(new IllegalStateException("open() should not allow the state: " + this.l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mk3
    public lhe<Void> b(boolean z) {
        synchronized (this.f25153a) {
            switch (c.f25158a[this.l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("release() should not be possible in state: " + this.l);
                case 3:
                    g6i.h(this.e, "The Opener shouldn't null in state:" + this.l);
                    this.e.e();
                case 2:
                    this.l = d.RELEASED;
                    return oua.h(null);
                case 5:
                case 6:
                    wuo wuoVar = this.f;
                    if (wuoVar != null) {
                        if (z) {
                            try {
                                wuoVar.d();
                            } catch (CameraAccessException e2) {
                                zpe.d("CaptureSession", "Unable to abort captures.", e2);
                            }
                        }
                        this.f.close();
                        break;
                    }
                case 4:
                    this.l = d.RELEASING;
                    g6i.h(this.e, "The Opener shouldn't null in state:" + this.l);
                    if (this.e.e()) {
                        l();
                        return oua.h(null);
                    }
                case 7:
                    if (this.m == null) {
                        this.m = cb3.a(new cb3.c() { // from class: jk3
                            @Override // cb3.c
                            public final Object a(cb3.a aVar) {
                                return this.f22883a.r(aVar);
                            }
                        });
                    }
                    return this.m;
                default:
                    return oua.h(null);
            }
        }
    }

    @Override // defpackage.mk3
    public SessionConfig c() {
        SessionConfig sessionConfig;
        synchronized (this.f25153a) {
            sessionConfig = this.g;
        }
        return sessionConfig;
    }

    @Override // defpackage.mk3
    public void close() {
        synchronized (this.f25153a) {
            int i = c.f25158a[this.l.ordinal()];
            if (i == 1) {
                throw new IllegalStateException("close() should not be possible in state: " + this.l);
            }
            if (i == 2) {
                this.l = d.RELEASED;
            } else if (i == 3) {
                g6i.h(this.e, "The Opener shouldn't null in state:" + this.l);
                this.e.e();
                this.l = d.RELEASED;
            } else if (i == 4) {
                g6i.h(this.e, "The Opener shouldn't null in state:" + this.l);
                this.e.e();
                this.l = d.CLOSED;
                this.g = null;
            } else if (i == 5) {
                if (this.g != null) {
                    List<androidx.camera.core.impl.e> listA = this.i.d().a();
                    if (!listA.isEmpty()) {
                        try {
                            e(u(listA));
                        } catch (IllegalStateException e2) {
                            zpe.d("CaptureSession", "Unable to issue the request before close the capture session", e2);
                        }
                    }
                }
                g6i.h(this.e, "The Opener shouldn't null in state:" + this.l);
                this.e.e();
                this.l = d.CLOSED;
                this.g = null;
            }
        }
    }

    @Override // defpackage.mk3
    public void d(SessionConfig sessionConfig) {
        synchronized (this.f25153a) {
            try {
                switch (c.f25158a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.g = sessionConfig;
                        break;
                    case 5:
                        this.g = sessionConfig;
                        if (sessionConfig == null) {
                            return;
                        }
                        if (!this.j.keySet().containsAll(sessionConfig.j())) {
                            zpe.c("CaptureSession", "Does not have the proper configured lists");
                            return;
                        } else {
                            zpe.a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                            o(this.g);
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mk3
    public void e(List<androidx.camera.core.impl.e> list) {
        synchronized (this.f25153a) {
            try {
                switch (c.f25158a[this.l.ordinal()]) {
                    case 1:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.l);
                    case 2:
                    case 3:
                    case 4:
                        this.f25154b.addAll(list);
                        break;
                    case 5:
                        this.f25154b.addAll(list);
                        n();
                        break;
                    case 6:
                    case 7:
                    case 8:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.mk3
    public void f() {
        ArrayList arrayList;
        synchronized (this.f25153a) {
            try {
                if (this.f25154b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f25154b);
                    this.f25154b.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<we3> it2 = ((androidx.camera.core.impl.e) it.next()).b().iterator();
                while (it2.hasNext()) {
                    it2.next().a();
                }
            }
        }
    }

    @Override // defpackage.mk3
    public List<androidx.camera.core.impl.e> g() {
        List<androidx.camera.core.impl.e> listUnmodifiableList;
        synchronized (this.f25153a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f25154b);
        }
        return listUnmodifiableList;
    }

    @GuardedBy("mSessionLock")
    public final CameraCaptureSession.CaptureCallback k(List<we3> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator<we3> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(qj3.a(it.next()));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return vd3.a(arrayList);
    }

    @GuardedBy("mSessionLock")
    public void l() {
        d dVar = this.l;
        d dVar2 = d.RELEASED;
        if (dVar == dVar2) {
            zpe.a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.l = dVar2;
        this.f = null;
        cb3.a<Void> aVar = this.n;
        if (aVar != null) {
            aVar.c(null);
            this.n = null;
        }
    }

    public int m(List<androidx.camera.core.impl.e> list) {
        synchronized (this.f25153a) {
            try {
                if (list.isEmpty()) {
                    return -1;
                }
                try {
                    ve3 ve3Var = new ve3();
                    ArrayList arrayList = new ArrayList();
                    zpe.a("CaptureSession", "Issuing capture request.");
                    boolean z = false;
                    for (androidx.camera.core.impl.e eVar : list) {
                        if (!eVar.e().isEmpty()) {
                            Iterator<DeferrableSurface> it = eVar.e().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    if (eVar.g() == 2) {
                                        z = true;
                                    }
                                    androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(eVar);
                                    if (eVar.g() == 5 && eVar.c() != null) {
                                        aVarK.n(eVar.c());
                                    }
                                    SessionConfig sessionConfig = this.g;
                                    if (sessionConfig != null) {
                                        aVarK.e(sessionConfig.g().d());
                                    }
                                    aVarK.e(this.h);
                                    aVarK.e(eVar.d());
                                    CaptureRequest captureRequestB = ke3.b(aVarK.h(), this.f.getDevice(), this.j);
                                    if (captureRequestB != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator<we3> it2 = eVar.b().iterator();
                                        while (it2.hasNext()) {
                                            qj3.b(it2.next(), arrayList2);
                                        }
                                        ve3Var.a(captureRequestB, arrayList2);
                                        arrayList.add(captureRequestB);
                                        break;
                                    }
                                    zpe.a("CaptureSession", "Skipping issuing request without surface.");
                                    return -1;
                                }
                                DeferrableSurface next = it.next();
                                if (!this.j.containsKey(next)) {
                                    zpe.a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    break;
                                }
                            }
                        } else {
                            zpe.a("CaptureSession", "Skipping issuing empty capture request.");
                        }
                    }
                    if (arrayList.isEmpty()) {
                        zpe.a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                        return -1;
                    }
                    if (this.o.a(arrayList, z)) {
                        this.f.g();
                        ve3Var.c(new ve3.a() { // from class: ik3
                            @Override // ve3.a
                            public final void a(CameraCaptureSession cameraCaptureSession, int i, boolean z2) {
                                this.f21243a.p(cameraCaptureSession, i, z2);
                            }
                        });
                    }
                    return this.f.e(arrayList, ve3Var);
                } catch (CameraAccessException e2) {
                    zpe.c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                    Thread.dumpStack();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("mSessionLock")
    public void n() {
        if (this.f25154b.isEmpty()) {
            return;
        }
        try {
            m(this.f25154b);
        } finally {
            this.f25154b.clear();
        }
    }

    public int o(SessionConfig sessionConfig) {
        synchronized (this.f25153a) {
            try {
                if (sessionConfig == null) {
                    zpe.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                    return -1;
                }
                androidx.camera.core.impl.e eVarG = sessionConfig.g();
                if (eVarG.e().isEmpty()) {
                    zpe.a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        this.f.g();
                    } catch (CameraAccessException e2) {
                        zpe.c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                        Thread.dumpStack();
                    }
                    return -1;
                }
                try {
                    zpe.a("CaptureSession", "Issuing request for session.");
                    androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(eVarG);
                    Config configS = s(this.i.d().d());
                    this.h = configS;
                    aVarK.e(configS);
                    CaptureRequest captureRequestB = ke3.b(aVarK.h(), this.f.getDevice(), this.j);
                    if (captureRequestB == null) {
                        zpe.a("CaptureSession", "Skipping issuing empty request for session.");
                        return -1;
                    }
                    return this.f.j(captureRequestB, k(eVarG.b(), this.c));
                } catch (CameraAccessException e3) {
                    zpe.c("CaptureSession", "Unable to access camera: " + e3.getMessage());
                    Thread.dumpStack();
                    return -1;
                }
                throw th;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ void p(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f25153a) {
            try {
                if (this.l == d.OPENED) {
                    o(this.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object r(cb3.a aVar) throws Exception {
        String str;
        synchronized (this.f25153a) {
            g6i.j(this.n == null, "Release completer expected to be null");
            this.n = aVar;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    @OptIn(markerClass = {dj8.class})
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final lhe<Void> q(List<Surface> list, SessionConfig sessionConfig, CameraDevice cameraDevice) {
        synchronized (this.f25153a) {
            try {
                int i = c.f25158a[this.l.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        this.j.clear();
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            this.j.put(this.f25155k.get(i2), list.get(i2));
                        }
                        ArrayList arrayList = new ArrayList(new LinkedHashSet(list));
                        this.l = d.OPENING;
                        zpe.a("CaptureSession", "Opening capture session.");
                        wuo.a aVarU = jvo.u(this.d, new jvo.a(sessionConfig.h()));
                        pe3 pe3Var = new pe3(sessionConfig.d());
                        xg3 xg3VarL = pe3Var.L(xg3.e());
                        this.i = xg3VarL;
                        List<androidx.camera.core.impl.e> listC = xg3VarL.d().c();
                        androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(sessionConfig.g());
                        Iterator<androidx.camera.core.impl.e> it = listC.iterator();
                        while (it.hasNext()) {
                            aVarK.e(it.next().d());
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            jeh jehVar = new jeh((Surface) it2.next());
                            jehVar.c(pe3Var.Q(null));
                            arrayList2.add(jehVar);
                        }
                        pyl pylVarA = this.e.a(0, arrayList2, aVarU);
                        try {
                            CaptureRequest captureRequestC = ke3.c(aVarK.h(), cameraDevice);
                            if (captureRequestC != null) {
                                pylVarA.f(captureRequestC);
                            }
                            return this.e.c(cameraDevice, pylVarA, this.f25155k);
                        } catch (CameraAccessException e2) {
                            return oua.f(e2);
                        }
                    }
                    if (i != 5) {
                        return oua.f(new CancellationException("openCaptureSession() not execute in state: " + this.l));
                    }
                }
                return oua.f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("mSessionLock")
    public List<androidx.camera.core.impl.e> u(List<androidx.camera.core.impl.e> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<androidx.camera.core.impl.e> it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(it.next());
            aVarK.p(1);
            Iterator<DeferrableSurface> it2 = this.g.g().e().iterator();
            while (it2.hasNext()) {
                aVarK.f(it2.next());
            }
            arrayList.add(aVarK.h());
        }
        return arrayList;
    }
}
