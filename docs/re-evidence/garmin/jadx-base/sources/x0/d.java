package x0;

import android.content.Context;
import android.os.Trace;
import androidx.camera.core.impl.e0;
import androidx.camera.core.impl.g0;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.j0;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.l0;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.n0;
import b0.a0;
import b0.i1;
import b0.p;
import b0.q;
import b0.s0;
import b0.t;
import b0.v;
import b0.x;
import com.google.common.util.concurrent.ListenableFuture;
import j0.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import l0.j;
import l0.m;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx0/d;", "", "<init>", "()V", "camera-lifecycle_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f188213a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l0.d f188214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListenableFuture<Void> f188215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f188216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f188217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f188218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f188219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashSet<e.a> f188220h;

    public d() {
        e eVar;
        j.a aVar = j.f107810a;
        m.c cVar = m.c.f107817b;
        cVar.getClass();
        this.f188215c = cVar;
        synchronized (e.f188221f) {
            try {
                if (e.f188222g == null) {
                    e.f188222g = new e();
                }
                eVar = e.f188222g;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        eVar.getClass();
        this.f188216d = eVar;
        this.f188219g = new HashMap();
        this.f188220h = new HashSet<>();
    }

    public static final e0 a(d dVar, t tVar, k0 k0Var) {
        Iterator<p> it = tVar.f14050a.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().getClass();
            l lVar = p.f14043a;
            if (!s.g(lVar, lVar)) {
                synchronized (g1.f5558a) {
                }
                dVar.f188218f.getClass();
            }
        }
        return g0.f5557a;
    }

    public static final void b(d dVar, int i14) {
        x xVar = dVar.f188217e;
        if (xVar == null) {
            return;
        }
        j0 j0Var = xVar.f14095g;
        if (j0Var == null) {
            h.z("CameraX not initialized yet.");
            return;
        }
        z.a aVarF = j0Var.f();
        synchronized (aVarF.f200493a) {
            try {
                int i15 = aVarF.f200499g;
                if (i14 == i15) {
                    return;
                }
                aVarF.f200499g = i14;
                ArrayList arrayList = new ArrayList(aVarF.f200495c);
                if (i15 == 2 && i14 != 2) {
                    aVarF.f200498f.clear();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c0.a.InterfaceC0337a) it.next()).a(i15, i14);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r18v1, types: [androidx.camera.core.impl.c, androidx.camera.core.impl.l0] */
    public static b c(d dVar, n0 n0Var, t tVar, s0 s0Var) {
        b bVarB;
        Collection collectionUnmodifiableCollection;
        Object obj;
        boolean zContains;
        a0 a0Var = a0.f13841d;
        dVar.getClass();
        Trace.beginSection(ce.a.d("CX:bindToLifecycle-internal"));
        try {
            u.a();
            x xVar = dVar.f188217e;
            xVar.getClass();
            l0 l0VarC = tVar.c(xVar.f14089a.c());
            l0VarC.getClass();
            l0VarC.g(true);
            androidx.camera.core.impl.c cVarD = dVar.d(tVar);
            q.f14044c.getClass();
            Object obj2 = null;
            q qVarB = q.a.b(cVarD, null);
            e eVar = dVar.f188216d;
            synchronized (eVar.f188223a) {
                bVarB = (b) eVar.f188224b.get(new a(System.identityHashCode(n0Var), qVarB));
            }
            e eVar2 = dVar.f188216d;
            synchronized (eVar2.f188223a) {
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(eVar2.f188224b.values());
            }
            for (i1 i1Var : s0Var.f14129f) {
                for (Object obj3 : collectionUnmodifiableCollection) {
                    obj3.getClass();
                    b bVar = (b) obj3;
                    synchronized (bVar.f188205a) {
                        obj = obj2;
                        zContains = ((ArrayList) bVar.f188207c.w()).contains(i1Var);
                    }
                    if (zContains && !s.g(bVar.k(), n0Var)) {
                        x0 x0Var = x0.f105818a;
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{i1Var}, 1)));
                    }
                    obj2 = obj;
                }
            }
            ?? r18 = obj2;
            if (bVarB == null) {
                e eVar3 = dVar.f188216d;
                x xVar2 = dVar.f188217e;
                xVar2.getClass();
                v vVar = xVar2.f14099k;
                if (vVar == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                a0Var.getClass();
                a0Var.getClass();
                bVarB = eVar3.b(n0Var, new CameraUseCaseAdapter(l0VarC, r18, cVarD, r18, a0Var, a0Var, vVar.f14065b, vVar.f14067d, vVar.f14066c));
            }
            if (!s0Var.f14129f.isEmpty()) {
                e eVar4 = dVar.f188216d;
                x xVar3 = dVar.f188217e;
                xVar3.getClass();
                j0 j0Var = xVar3.f14095g;
                if (j0Var == null) {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
                eVar4.a(bVarB, s0Var, j0Var.f());
                dVar.f188220h.add(new a(System.identityHashCode(n0Var), qVarB));
            }
            Trace.endSection();
            return bVarB;
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    public final androidx.camera.core.impl.c d(t tVar) {
        Object cVar;
        tVar.getClass();
        Trace.beginSection(ce.a.d("CX:getCameraInfo"));
        try {
            x xVar = this.f188217e;
            xVar.getClass();
            k0 k0VarC = tVar.c(xVar.f14089a.c()).c();
            k0VarC.getClass();
            e0 e0VarA = a(this, tVar, k0VarC);
            q.a aVar = q.f14044c;
            String strQ = k0VarC.q();
            strQ.getClass();
            l lVar = ((g0.a) e0VarA).N;
            aVar.getClass();
            q qVarA = q.a.a(strQ, null, lVar);
            synchronized (this.f188213a) {
                try {
                    cVar = this.f188219g.get(qVarA);
                    if (cVar == null) {
                        cVar = new androidx.camera.core.impl.c(k0VarC, e0VarA);
                        this.f188219g.put(qVarA, cVar);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            androidx.camera.core.impl.c cVar2 = (androidx.camera.core.impl.c) cVar;
            Trace.endSection();
            return cVar2;
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }

    public final void e() {
        Trace.beginSection(ce.a.d("CX:unbindAll"));
        try {
            u.a();
            b(this, 0);
            this.f188216d.j(this.f188220h);
            Unit unit = Unit.INSTANCE;
        } finally {
            Trace.endSection();
        }
    }
}
