package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.SurfaceUtil;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f173719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f173720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f173721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g2 f173722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f173723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.camera.core.impl.l2 f173724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f173725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<DeferrableSurface> f173726h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f173727i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a f173728j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.concurrent.futures.b.d f173729k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f173730l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public HashMap f173731m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y.r f173732n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y.v f173733o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y.o f173734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w.d f173735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y.u f173736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f173737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0.f f173738t;

    public enum a {
        UNINITIALIZED,
        RELEASED,
        INITIALIZED,
        GET_SURFACE,
        RELEASING,
        CLOSED,
        OPENING,
        OPENED
    }

    public final class b extends c2.b {
        public b() {
        }

        @Override // v.c2.b
        public final void n(c2 c2Var) {
            synchronized (c1.this.f173719a) {
                try {
                    switch (c1.this.f173728j) {
                        case UNINITIALIZED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + c1.this.f173728j);
                        case RELEASING:
                        case CLOSED:
                        case OPENING:
                            c1.this.l();
                            break;
                    }
                    Objects.toString(c1.this.f173728j);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // v.c2.b
        public final void o(c2 c2Var) {
            synchronized (c1.this.f173719a) {
                try {
                    switch (c1.this.f173728j) {
                        case UNINITIALIZED:
                        case RELEASED:
                        case INITIALIZED:
                        case GET_SURFACE:
                        case OPENED:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + c1.this.f173728j);
                        case RELEASING:
                            c2Var.close();
                            break;
                        case CLOSED:
                            c1.this.f173723e = c2Var;
                            break;
                        case OPENING:
                            c1.this.r(a.OPENED);
                            c1 c1Var = c1.this;
                            c1Var.f173723e = c2Var;
                            c1Var.q(c1Var.f173724f);
                            c1 c1Var2 = c1.this;
                            c1Var2.f173734p.b().addListener(new b0(c1Var2, 2), k0.b.a());
                            break;
                    }
                    Objects.toString(c1.this.f173728j);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // v.c2.b
        public final void p(c2 c2Var) {
            synchronized (c1.this.f173719a) {
                try {
                    if (c1.this.f173728j.ordinal() == 0) {
                        throw new IllegalStateException("onReady() should not be possible in state: " + c1.this.f173728j);
                    }
                    Objects.toString(c1.this.f173728j);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // v.c2.b
        public final void q(c2 c2Var) {
            synchronized (c1.this.f173719a) {
                try {
                    c1 c1Var = c1.this;
                    if (c1Var.f173728j == a.UNINITIALIZED) {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + c1.this.f173728j);
                    }
                    c1Var.l();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public c1(w.d dVar, androidx.camera.core.impl.i2 i2Var, boolean z14, a0.f fVar) {
        this.f173719a = new Object();
        this.f173720b = new ArrayList();
        this.f173725g = new HashMap();
        this.f173726h = Collections.EMPTY_LIST;
        a aVar = a.UNINITIALIZED;
        this.f173727i = aVar;
        this.f173728j = aVar;
        this.f173731m = new HashMap();
        this.f173732n = new y.r();
        this.f173733o = new y.v();
        r(a.INITIALIZED);
        this.f173735q = dVar;
        this.f173721c = new b();
        this.f173734p = new y.o(i2Var.a(CaptureNoResponseQuirk.class));
        this.f173736r = new y.u(i2Var);
        this.f173737s = z14;
        this.f173738t = fVar;
    }

    public static x j(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback xVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.s sVar = (androidx.camera.core.impl.s) it.next();
            if (sVar == null) {
                xVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                y0.a(sVar, arrayList2);
                xVar = arrayList2.size() == 1 ? (CameraCaptureSession.CaptureCallback) arrayList2.get(0) : new x(arrayList2);
            }
            arrayList.add(xVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new x(arrayList);
    }

    public static HashMap k(HashMap map, HashMap map2) {
        HashMap map3 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            for (androidx.camera.core.impl.l2.f fVar : (List) map.get(num)) {
                SurfaceUtil.a aVarA = SurfaceUtil.a((Surface) map2.get(fVar.f()));
                if (i14 == 0) {
                    i14 = aVarA.f5799a;
                }
                ka.i.p();
                int i15 = aVarA.f5800b;
                int i16 = aVarA.f5801c;
                String strD = fVar.d();
                Objects.requireNonNull(strD);
                arrayList.add(ka.i.e(i15, i16, strD));
            }
            if (i14 == 0 || arrayList.isEmpty()) {
                arrayList.size();
            } else {
                List listCreateInstancesForMultiResolutionOutput = OutputConfiguration.createInstancesForMultiResolutionOutput(arrayList, i14);
                if (listCreateInstancesForMultiResolutionOutput != null) {
                    for (androidx.camera.core.impl.l2.f fVar2 : (List) map.get(num)) {
                        OutputConfiguration outputConfiguration = (OutputConfiguration) listCreateInstancesForMultiResolutionOutput.remove(0);
                        outputConfiguration.addSurface((Surface) map2.get(fVar2.f()));
                        map3.put(fVar2, new w.h(outputConfiguration));
                    }
                }
            }
        }
        return map3;
    }

    public static ArrayList n(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w.h hVar = (w.h) it.next();
            if (!arrayList2.contains(hVar.f180969a.getSurface())) {
                arrayList2.add(hVar.f180969a.getSurface());
                arrayList3.add(hVar);
            }
        }
        return arrayList3;
    }

    public static HashMap o(Collection collection) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            androidx.camera.core.impl.l2.f fVar = (androidx.camera.core.impl.l2.f) it.next();
            if (fVar.g() > 0 && fVar.e().isEmpty()) {
                List arrayList = (List) map.get(Integer.valueOf(fVar.g()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Integer.valueOf(fVar.g()), arrayList);
                }
                arrayList.add(fVar);
            }
        }
        HashMap map2 = new HashMap();
        for (Integer num : map.keySet()) {
            num.getClass();
            if (((List) map.get(num)).size() >= 2) {
                map2.put(num, (List) map.get(num));
            }
        }
        return map2;
    }

    @Override // v.d1
    public final void a(HashMap map) {
        synchronized (this.f173719a) {
            this.f173731m = map;
        }
    }

    @Override // v.d1
    public final void b(List<androidx.camera.core.impl.v0> list) {
        synchronized (this.f173719a) {
            try {
                switch (this.f173728j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f173728j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f173720b.addAll(list);
                        break;
                    case OPENED:
                        this.f173720b.addAll(list);
                        this.f173734p.b().addListener(new b0(this, 2), k0.b.a());
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // v.d1
    public final boolean c() {
        boolean z14;
        synchronized (this.f173719a) {
            try {
                a aVar = this.f173728j;
                z14 = aVar == a.OPENED || aVar == a.OPENING;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    @Override // v.d1
    public final void close() {
        synchronized (this.f173719a) {
            try {
                int iOrdinal = this.f173728j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f173728j);
                }
                if (iOrdinal == 2) {
                    r(a.RELEASED);
                } else if (iOrdinal == 3) {
                    k7.h.e(this.f173722d, "The Opener shouldn't null in state:" + this.f173728j);
                    this.f173722d.x();
                    r(a.RELEASED);
                } else if (iOrdinal == 6 || iOrdinal == 7) {
                    k7.h.e(this.f173722d, "The Opener shouldn't null in state:" + this.f173728j);
                    this.f173722d.x();
                    r(a.CLOSED);
                    this.f173734p.c();
                    this.f173724f = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // v.d1
    public final ListenableFuture d(androidx.camera.core.impl.l2 l2Var, CameraDevice cameraDevice, g2 g2Var) {
        synchronized (this.f173719a) {
            try {
                if (this.f173728j.ordinal() != 2) {
                    Objects.toString(this.f173728j);
                    IllegalStateException illegalStateException = new IllegalStateException("open() should not allow the state: " + this.f173728j);
                    l0.j.a aVar = l0.j.f107810a;
                    return new l0.m.a(illegalStateException);
                }
                r(a.GET_SURFACE);
                ArrayList arrayList = new ArrayList(l2Var.b());
                this.f173726h = arrayList;
                this.f173722d = g2Var;
                l0.b bVarJ = l0.j.j(l0.d.a(g2Var.w(arrayList)), new p62.e(this, 12, l2Var, cameraDevice), this.f173722d.f173787d);
                l0.j.a(bVarJ, new a1(this), this.f173722d.f173787d);
                return l0.j.f(bVarJ);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // v.d1
    public final androidx.camera.core.impl.l2 e() {
        androidx.camera.core.impl.l2 l2Var;
        synchronized (this.f173719a) {
            l2Var = this.f173724f;
        }
        return l2Var;
    }

    @Override // v.d1
    public final void f(androidx.camera.core.impl.l2 l2Var) {
        synchronized (this.f173719a) {
            try {
                switch (this.f173728j) {
                    case UNINITIALIZED:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f173728j);
                    case RELEASED:
                    case RELEASING:
                    case CLOSED:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case INITIALIZED:
                    case GET_SURFACE:
                    case OPENING:
                        this.f173724f = l2Var;
                        break;
                    case OPENED:
                        this.f173724f = l2Var;
                        if (l2Var == null) {
                            return;
                        }
                        if (!this.f173725g.keySet().containsAll(l2Var.b())) {
                            return;
                        } else {
                            q(this.f173724f);
                        }
                        break;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // v.d1
    public final void g() {
        ArrayList<androidx.camera.core.impl.v0> arrayList;
        synchronized (this.f173719a) {
            try {
                if (this.f173720b.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(this.f173720b);
                    this.f173720b.clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.v0 v0Var : arrayList) {
                Iterator<androidx.camera.core.impl.s> it = v0Var.f5817e.iterator();
                while (it.hasNext()) {
                    it.next().a(v0Var.b());
                }
            }
        }
    }

    @Override // v.d1
    public final List<androidx.camera.core.impl.v0> h() {
        List<androidx.camera.core.impl.v0> listUnmodifiableList;
        synchronized (this.f173719a) {
            listUnmodifiableList = Collections.unmodifiableList(this.f173720b);
        }
        return listUnmodifiableList;
    }

    public final int i(ArrayList arrayList, o0 o0Var) {
        o0 o0Var2 = new o0();
        Iterator it = arrayList.iterator();
        int iF = -1;
        while (it.hasNext()) {
            CaptureRequest captureRequest = (CaptureRequest) it.next();
            c2 c2Var = this.f173723e;
            Objects.requireNonNull(c2Var);
            List<CaptureRequest> listD = c2Var.d(captureRequest);
            Iterator<CaptureRequest> it3 = listD.iterator();
            while (it3.hasNext()) {
                o0Var2.a(it3.next(), Collections.singletonList(new z1(captureRequest, o0Var)));
            }
            iF = this.f173723e.f(listD, o0Var2);
        }
        return iF;
    }

    public final void l() {
        a aVar = this.f173728j;
        a aVar2 = a.RELEASED;
        if (aVar == aVar2) {
            return;
        }
        r(aVar2);
        this.f173723e = null;
        androidx.concurrent.futures.b.a<Void> aVar3 = this.f173730l;
        if (aVar3 != null) {
            aVar3.b(null);
            this.f173730l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    public final w.h m(androidx.camera.core.impl.l2.f fVar, HashMap map, String str) {
        long jLongValue;
        Surface surface = (Surface) map.get(fVar.f());
        k7.h.e(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        w.h hVar = new w.h(fVar.g(), surface);
        w.h.a aVar = hVar.f180969a;
        if (str != null) {
            aVar.d(str);
        } else {
            aVar.d(fVar.d());
        }
        if (fVar.c() == 0) {
            aVar.f(1);
        } else if (fVar.c() == 1) {
            aVar.f(2);
        }
        if (!fVar.e().isEmpty()) {
            aVar.b();
            Iterator<DeferrableSurface> it = fVar.e().iterator();
            while (it.hasNext()) {
                Surface surface2 = (Surface) map.get(it.next());
                k7.h.e(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                aVar.a(surface2);
            }
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            w.d dVar = this.f173735q;
            dVar.getClass();
            k7.h.f(i14 >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
            DynamicRangeProfiles dynamicRangeProfilesC = dVar.f180963a.c();
            if (dynamicRangeProfilesC == null) {
                jLongValue = 1;
            } else {
                b0.b0 b0VarB = fVar.b();
                Long lA = w.c.a(b0VarB, dynamicRangeProfilesC);
                if (lA == null) {
                    Objects.toString(b0VarB);
                    jLongValue = 1;
                } else {
                    jLongValue = lA.longValue();
                }
            }
        } else {
            jLongValue = 1;
        }
        aVar.e(jLongValue);
        return hVar;
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
    public final void p(ArrayList arrayList) {
        androidx.camera.core.impl.c0 c0Var;
        synchronized (this.f173719a) {
            try {
                if (this.f173728j != a.OPENED) {
                    return;
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    o0 o0Var = new o0();
                    ArrayList<CaptureRequest> arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    boolean z14 = false;
                    while (it.hasNext()) {
                        androidx.camera.core.impl.v0 v0Var = (androidx.camera.core.impl.v0) it.next();
                        if (!Collections.unmodifiableList(v0Var.f5813a).isEmpty()) {
                            Iterator it3 = Collections.unmodifiableList(v0Var.f5813a).iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    if (v0Var.f5815c == 2) {
                                        z14 = true;
                                    }
                                    androidx.camera.core.impl.v0.a aVarF = androidx.camera.core.impl.v0.a.f(v0Var);
                                    if (v0Var.f5815c == 5 && (c0Var = v0Var.f5820h) != null) {
                                        aVarF.f5828h = c0Var;
                                    }
                                    androidx.camera.core.impl.l2 l2Var = this.f173724f;
                                    if (l2Var != null) {
                                        aVarF.c(l2Var.f5608g.f5814b);
                                    }
                                    aVarF.c(v0Var.f5814b);
                                    CaptureRequest captureRequestC = g0.c(aVarF.e(), this.f173723e.getDevice(), this.f173725g, false, this.f173736r);
                                    if (captureRequestC != null) {
                                        ArrayList arrayList3 = new ArrayList();
                                        Iterator<androidx.camera.core.impl.s> it4 = v0Var.f5817e.iterator();
                                        while (it4.hasNext()) {
                                            y0.a(it4.next(), arrayList3);
                                        }
                                        o0Var.a(captureRequestC, arrayList3);
                                        arrayList2.add(captureRequestC);
                                        break;
                                    }
                                    return;
                                }
                                DeferrableSurface deferrableSurface = (DeferrableSurface) it3.next();
                                if (!this.f173725g.containsKey(deferrableSurface)) {
                                    Objects.toString(deferrableSurface);
                                    break;
                                }
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f173732n.a(arrayList2, z14)) {
                            this.f173723e.a();
                            o0Var.f173946b = new z0(this);
                        }
                        if (this.f173733o.b(arrayList2, z14)) {
                            o0Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new b1(this)));
                        }
                        if (this.f173738t != null) {
                            for (CaptureRequest captureRequest : arrayList2) {
                                this.f173738t.a();
                            }
                        }
                        androidx.camera.core.impl.l2 l2Var2 = this.f173724f;
                        if (l2Var2 == null || l2Var2.f5609h != 1) {
                            this.f173723e.f(arrayList2, o0Var);
                        } else {
                            i(arrayList2, o0Var);
                        }
                    }
                } catch (CameraAccessException e4) {
                    e4.getMessage();
                    Thread.dumpStack();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void q(androidx.camera.core.impl.l2 l2Var) {
        synchronized (this.f173719a) {
            try {
                if (l2Var == null) {
                    return;
                }
                if (this.f173728j != a.OPENED) {
                    return;
                }
                androidx.camera.core.impl.v0 v0Var = l2Var.f5608g;
                boolean zIsEmpty = Collections.unmodifiableList(v0Var.f5813a).isEmpty();
                c2 c2Var = this.f173723e;
                if (zIsEmpty) {
                    try {
                        c2Var.a();
                    } catch (CameraAccessException e4) {
                        e4.getMessage();
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    CaptureRequest captureRequestC = g0.c(v0Var, c2Var.getDevice(), this.f173725g, true, this.f173736r);
                    if (captureRequestC == null) {
                        return;
                    }
                    CameraCaptureSession.CaptureCallback captureCallbackA = this.f173734p.a(j(v0Var.f5817e, new CameraCaptureSession.CaptureCallback[0]));
                    a0.f fVar = this.f173738t;
                    if (fVar != null) {
                        fVar.a();
                    }
                    int i14 = l2Var.f5609h;
                    c2 c2Var2 = this.f173723e;
                    if (i14 != 1) {
                        c2Var2.j(captureRequestC, captureCallbackA);
                        return;
                    } else {
                        this.f173723e.b(c2Var2.d(captureRequestC), captureCallbackA);
                        return;
                    }
                } catch (CameraAccessException e14) {
                    e14.getMessage();
                    Thread.dumpStack();
                    return;
                }
                throw th;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void r(a aVar) {
        if (aVar.ordinal() > this.f173727i.ordinal()) {
            this.f173727i = aVar;
        }
        this.f173728j = aVar;
        if (!ce.a.b() || this.f173727i.ordinal() < a.GET_SURFACE.ordinal()) {
            return;
        }
        ce.a.c(aVar.ordinal(), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007e, B:28:0x0091), top: B:31:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x004c A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007e, B:28:0x0091), top: B:31:0x0009 }] */
    @Override // v.d1
    public final ListenableFuture release() {
        synchronized (this.f173719a) {
            try {
                int iOrdinal = this.f173728j.ordinal();
                if (iOrdinal == 0) {
                    throw new IllegalStateException("release() should not be possible in state: " + this.f173728j);
                }
                switch (iOrdinal) {
                    case 2:
                        r(a.RELEASED);
                        l0.j.a aVar = l0.j.f107810a;
                        return l0.m.c.f107817b;
                    case 3:
                        k7.h.e(this.f173722d, "The Opener shouldn't null in state:" + this.f173728j);
                        this.f173722d.x();
                        r(a.RELEASED);
                        l0.j.a aVar2 = l0.j.f107810a;
                        return l0.m.c.f107817b;
                    case 4:
                        if (this.f173729k == null) {
                            this.f173729k = androidx.concurrent.futures.b.a(new z0(this));
                        }
                        return this.f173729k;
                    case 5:
                    case 7:
                        c2 c2Var = this.f173723e;
                        if (c2Var != null) {
                            c2Var.close();
                        }
                        r(a.RELEASING);
                        this.f173734p.c();
                        k7.h.e(this.f173722d, "The Opener shouldn't null in state:" + this.f173728j);
                        if (this.f173722d.x()) {
                            l();
                            l0.j.a aVar3 = l0.j.f107810a;
                            return l0.m.c.f107817b;
                        }
                        if (this.f173729k == null) {
                            this.f173729k = androidx.concurrent.futures.b.a(new z0(this));
                        }
                        return this.f173729k;
                    case 6:
                        r(a.RELEASING);
                        this.f173734p.c();
                        k7.h.e(this.f173722d, "The Opener shouldn't null in state:" + this.f173728j);
                        if (this.f173722d.x()) {
                            l();
                            l0.j.a aVar4 = l0.j.f107810a;
                            return l0.m.c.f107817b;
                        }
                        if (this.f173729k == null) {
                            this.f173729k = androidx.concurrent.futures.b.a(new z0(this));
                        }
                        return this.f173729k;
                    default:
                        l0.j.a aVar5 = l0.j.f107810a;
                        return l0.m.c.f107817b;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public c1(w.d dVar, boolean z14) {
        this(dVar, new androidx.camera.core.impl.i2(Collections.EMPTY_LIST), z14, null);
    }

    public c1(w.d dVar, androidx.camera.core.impl.i2 i2Var) {
        this(dVar, i2Var, false, null);
    }

    public c1(w.d dVar, boolean z14, a0.f fVar) {
        this(dVar, new androidx.camera.core.impl.i2(Collections.EMPTY_LIST), z14, fVar);
    }

    public c1(w.d dVar, androidx.camera.core.impl.i2 i2Var, a0.f fVar) {
        this(dVar, i2Var, false, fVar);
    }

    public c1(w.d dVar) {
        this(dVar, false);
    }
}
