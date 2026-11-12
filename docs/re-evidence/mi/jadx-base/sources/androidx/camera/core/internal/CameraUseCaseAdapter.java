package androidx.camera.core.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.r;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.core.j;
import androidx.camera.core.o;
import androidx.camera.core.s;
import androidx.core.util.Consumer;
import defpackage.ch3;
import defpackage.dh3;
import defpackage.g6i;
import defpackage.gwq;
import defpackage.jwq;
import defpackage.li3;
import defpackage.ue3;
import defpackage.vg3;
import defpackage.zf3;
import defpackage.zpe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class CameraUseCaseAdapter implements ue3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CameraInternal f1756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet<CameraInternal> f1757b;
    public final vg3 c;
    public final UseCaseConfigFactory d;
    public final a e;

    @GuardedBy("mLock")
    public gwq g;

    @GuardedBy("mLock")
    public final List<s> f = new ArrayList();

    @GuardedBy("mLock")
    public c h = zf3.a();
    public final Object i = new Object();

    @GuardedBy("mLock")
    public boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public Config f1758k = null;

    @GuardedBy("mLock")
    public List<s> l = new ArrayList();

    public static final class CameraException extends Exception {
        public CameraException() {
        }

        public CameraException(String str) {
            super(str);
        }

        public CameraException(Throwable th) {
            super(th);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<String> f1759a = new ArrayList();

        public a(LinkedHashSet<CameraInternal> linkedHashSet) {
            Iterator<CameraInternal> it = linkedHashSet.iterator();
            while (it.hasNext()) {
                this.f1759a.add(it.next().c().a());
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.f1759a.equals(((a) obj).f1759a);
            }
            return false;
        }

        public int hashCode() {
            return this.f1759a.hashCode() * 53;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r<?> f1760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public r<?> f1761b;

        public b(r<?> rVar, r<?> rVar2) {
            this.f1760a = rVar;
            this.f1761b = rVar2;
        }
    }

    public CameraUseCaseAdapter(LinkedHashSet<CameraInternal> linkedHashSet, vg3 vg3Var, UseCaseConfigFactory useCaseConfigFactory) {
        this.f1756a = linkedHashSet.iterator().next();
        LinkedHashSet<CameraInternal> linkedHashSet2 = new LinkedHashSet<>(linkedHashSet);
        this.f1757b = linkedHashSet2;
        this.e = new a(linkedHashSet2);
        this.c = vg3Var;
        this.d = useCaseConfigFactory;
    }

    public static /* synthetic */ void D(Surface surface, SurfaceTexture surfaceTexture, androidx.camera.core.r.f fVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void E(androidx.camera.core.r rVar) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(rVar.l().getWidth(), rVar.l().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        rVar.v(surface, li3.a(), new Consumer() { // from class: di3
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                CameraUseCaseAdapter.D(surface, surfaceTexture, (androidx.camera.core.r.f) obj);
            }
        });
    }

    public static Matrix o(Rect rect, Size size) {
        g6i.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static a u(LinkedHashSet<CameraInternal> linkedHashSet) {
        return new a(linkedHashSet);
    }

    public final boolean A(List<s> list) {
        boolean z = false;
        boolean z2 = false;
        for (s sVar : list) {
            if (C(sVar)) {
                z2 = true;
            } else if (B(sVar)) {
                z = true;
            }
        }
        return z && !z2;
    }

    public final boolean B(s sVar) {
        return sVar instanceof j;
    }

    public final boolean C(s sVar) {
        return sVar instanceof o;
    }

    public void F(Collection<s> collection) {
        synchronized (this.i) {
            s(new ArrayList(collection));
            if (y()) {
                this.l.removeAll(collection);
                try {
                    k(Collections.emptyList());
                } catch (CameraException unused) {
                    throw new IllegalArgumentException("Failed to add extra fake Preview or ImageCapture use case!");
                }
            }
        }
    }

    public final void G() {
        synchronized (this.i) {
            try {
                if (this.f1758k != null) {
                    this.f1756a.g().e(this.f1758k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void H(gwq gwqVar) {
        synchronized (this.i) {
            this.g = gwqVar;
        }
    }

    public final void I(Map<s, Size> map, Collection<s> collection) {
        synchronized (this.i) {
            try {
                if (this.g != null) {
                    Map<s, Rect> mapA = jwq.a(this.f1756a.g().f(), this.f1756a.c().b().intValue() == 0, this.g.a(), this.f1756a.c().e(this.g.c()), this.g.d(), this.g.b(), map);
                    for (s sVar : collection) {
                        sVar.H((Rect) g6i.g(mapA.get(sVar)));
                        sVar.G(o(this.f1756a.g().f(), map.get(sVar)));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ue3
    public CameraControl a() {
        return this.f1756a.g();
    }

    public void d(c cVar) {
        synchronized (this.i) {
            if (cVar == null) {
                try {
                    cVar = zf3.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.f.isEmpty() && !this.h.w().equals(cVar.w())) {
                throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
            }
            this.h = cVar;
            this.f1756a.d(cVar);
        }
    }

    public ch3 getCameraInfo() {
        return this.f1756a.c();
    }

    public void h(boolean z) {
        this.f1756a.h(z);
    }

    public void k(Collection<s> collection) throws CameraException {
        synchronized (this.i) {
            try {
                ArrayList<s> arrayList = new ArrayList();
                for (s sVar : collection) {
                    if (this.f.contains(sVar)) {
                        zpe.a("CameraUseCaseAdapter", "Attempting to attach already attached UseCase");
                    } else {
                        arrayList.add(sVar);
                    }
                }
                List<s> arrayList2 = new ArrayList<>(this.f);
                List<s> listEmptyList = Collections.emptyList();
                List<s> listEmptyList2 = Collections.emptyList();
                if (y()) {
                    arrayList2.removeAll(this.l);
                    arrayList2.addAll(arrayList);
                    listEmptyList = n(arrayList2, new ArrayList<>(this.l));
                    ArrayList arrayList3 = new ArrayList(listEmptyList);
                    arrayList3.removeAll(this.l);
                    arrayList.addAll(arrayList3);
                    listEmptyList2 = new ArrayList<>(this.l);
                    listEmptyList2.removeAll(listEmptyList);
                }
                Map<s, b> mapW = w(arrayList, this.h.k(), this.d);
                try {
                    List<s> arrayList4 = new ArrayList<>(this.f);
                    arrayList4.removeAll(listEmptyList2);
                    Map<s, Size> mapP = p(this.f1756a.c(), arrayList, arrayList4, mapW);
                    I(mapP, collection);
                    this.l = listEmptyList;
                    s(listEmptyList2);
                    for (s sVar2 : arrayList) {
                        b bVar = mapW.get(sVar2);
                        sVar2.w(this.f1756a, bVar.f1760a, bVar.f1761b);
                        sVar2.J((Size) g6i.g(mapP.get(sVar2)));
                    }
                    this.f.addAll(arrayList);
                    if (this.j) {
                        this.f1756a.i(arrayList);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((s) it.next()).u();
                    }
                } catch (IllegalArgumentException e) {
                    throw new CameraException(e.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l() {
        synchronized (this.i) {
            try {
                if (!this.j) {
                    this.f1756a.i(this.f);
                    G();
                    Iterator<s> it = this.f.iterator();
                    while (it.hasNext()) {
                        it.next().u();
                    }
                    this.j = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m() {
        synchronized (this.i) {
            CameraControlInternal cameraControlInternalG = this.f1756a.g();
            this.f1758k = cameraControlInternalG.h();
            cameraControlInternalG.i();
        }
    }

    public final List<s> n(List<s> list, List<s> list2) {
        ArrayList arrayList = new ArrayList(list2);
        boolean zA = A(list);
        boolean z = z(list);
        s sVar = null;
        s sVar2 = null;
        for (s sVar3 : list2) {
            if (C(sVar3)) {
                sVar = sVar3;
            } else if (B(sVar3)) {
                sVar2 = sVar3;
            }
        }
        if (zA && sVar == null) {
            arrayList.add(r());
        } else if (!zA && sVar != null) {
            arrayList.remove(sVar);
        }
        if (z && sVar2 == null) {
            arrayList.add(q());
        } else if (!z && sVar2 != null) {
            arrayList.remove(sVar2);
        }
        return arrayList;
    }

    public final Map<s, Size> p(dh3 dh3Var, List<s> list, List<s> list2, Map<s, b> map) {
        ArrayList arrayList = new ArrayList();
        String strA = dh3Var.a();
        HashMap map2 = new HashMap();
        for (s sVar : list2) {
            arrayList.add(this.c.a(strA, sVar.i(), sVar.c()));
            map2.put(sVar, sVar.c());
        }
        if (!list.isEmpty()) {
            HashMap map3 = new HashMap();
            for (s sVar2 : list) {
                b bVar = map.get(sVar2);
                map3.put(sVar2.q(dh3Var, bVar.f1760a, bVar.f1761b), sVar2);
            }
            Map<r<?>, Size> mapB = this.c.b(strA, arrayList, new ArrayList(map3.keySet()));
            for (Map.Entry entry : map3.entrySet()) {
                map2.put((s) entry.getValue(), mapB.get(entry.getKey()));
            }
        }
        return map2;
    }

    public final j q() {
        return new j.f().i("ImageCapture-Extra").c();
    }

    public final o r() {
        o oVarC = new o.b().i("Preview-Extra").c();
        oVarC.S(new o.d() { // from class: ci3
            @Override // androidx.camera.core.o.d
            public final void a(androidx.camera.core.r rVar) {
                CameraUseCaseAdapter.E(rVar);
            }
        });
        return oVarC;
    }

    public final void s(List<s> list) {
        synchronized (this.i) {
            try {
                if (!list.isEmpty()) {
                    this.f1756a.j(list);
                    for (s sVar : list) {
                        if (this.f.contains(sVar)) {
                            sVar.z(this.f1756a);
                        } else {
                            zpe.c("CameraUseCaseAdapter", "Attempting to detach non-attached UseCase: " + sVar);
                        }
                    }
                    this.f.removeAll(list);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void t() {
        synchronized (this.i) {
            try {
                if (this.j) {
                    this.f1756a.j(new ArrayList(this.f));
                    m();
                    this.j = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a v() {
        return this.e;
    }

    public final Map<s, b> w(List<s> list, UseCaseConfigFactory useCaseConfigFactory, UseCaseConfigFactory useCaseConfigFactory2) {
        HashMap map = new HashMap();
        for (s sVar : list) {
            map.put(sVar, new b(sVar.h(false, useCaseConfigFactory), sVar.h(true, useCaseConfigFactory2)));
        }
        return map;
    }

    public List<s> x() {
        ArrayList arrayList;
        synchronized (this.i) {
            arrayList = new ArrayList(this.f);
        }
        return arrayList;
    }

    public final boolean y() {
        boolean z;
        synchronized (this.i) {
            z = true;
            if (this.h.B() != 1) {
                z = false;
            }
        }
        return z;
    }

    public final boolean z(List<s> list) {
        boolean z = false;
        boolean z2 = false;
        for (s sVar : list) {
            if (C(sVar)) {
                z = true;
            } else if (B(sVar)) {
                z2 = true;
            }
        }
        return z && !z2;
    }
}
