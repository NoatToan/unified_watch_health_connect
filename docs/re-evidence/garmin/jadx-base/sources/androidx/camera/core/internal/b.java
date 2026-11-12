package androidx.camera.core.internal;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.e;
import androidx.camera.core.impl.e0;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.k0;
import androidx.camera.core.impl.q2;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.r2;
import androidx.camera.core.impl.t2;
import androidx.camera.core.impl.v2;
import androidx.camera.core.impl.x0;
import b0.b0;
import b0.i1;
import b0.w0;
import j0.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import m0.i;
import m0.j;
import m0.k;
import p005kotlin.Metadata;
import p13.u0;
import v.b2;
import v.h0;
import v0.d;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/camera/core/internal/b;", "Lm0/j;", "Landroidx/camera/core/impl/c3;", "useCaseConfigFactory", "Landroidx/camera/core/impl/i0;", "cameraDeviceSurfaceManager", "<init>", "(Landroidx/camera/core/impl/c3;Landroidx/camera/core/impl/i0;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f5915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i0 f5916c;

    public b(c3 c3Var, i0 i0Var) {
        c3Var.getClass();
        this.f5915b = c3Var;
        this.f5916c = i0Var;
    }

    @Override // m0.j
    public final i a(int i14, k0 k0Var, ArrayList arrayList, ArrayList arrayList2, e0 e0Var, Range range, boolean z14) {
        int i15;
        Rect rectT;
        k0Var.getClass();
        e0Var.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String strQ = k0Var.q();
        strQ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            q2 q2Var = i1Var.f13970i;
            if (q2Var == null) {
                h.s("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
            i0 i0Var = this.f5916c;
            if (i0Var == null) {
                h.z("Required value was null.");
                return null;
            }
            int iZ = i1Var.f13969h.z();
            q2 q2Var2 = i1Var.f13970i;
            Size sizeF = q2Var2 != null ? q2Var2.f() : null;
            if (sizeF == null) {
                h.s("Attached surface resolution cannot be null for already attached use cases.");
                return null;
            }
            r2 r2VarX = i1Var.f13969h.x();
            b2 b2Var = (b2) ((h0) i0Var).f173827b.get(strQ);
            k7.h.b(b2Var != null, "No such camera id in supported combination list: ".concat(strQ));
            r rVarL = b2Var.l(iZ);
            t2.c cVar = t2.c.CAPTURE_SESSION_TABLES;
            t2.f5758e.getClass();
            t2 t2VarB = t2.a.b(iZ, sizeF, rVarL, i14, cVar, r2VarX);
            int iZ2 = i1Var.f13969h.z();
            q2 q2Var3 = i1Var.f13970i;
            Size sizeF2 = q2Var3 != null ? q2Var3.f() : null;
            sizeF2.getClass();
            b0 b0VarB = q2Var.b();
            ArrayList arrayListK = d.K(i1Var);
            x0 x0VarD = q2Var.d();
            int sessionType = i1Var.f13969h.getSessionType();
            Range<Integer> rangeM = i1Var.f13969h.M(q2.f5715a);
            if (rangeM == null) {
                h.s("Required value was null.");
                return null;
            }
            f fVar = new f(t2VarB, iZ2, sizeF2, b0VarB, arrayListK, x0VarD, sessionType, rangeM, i1Var.f13969h.v());
            arrayList3.add(fVar);
            linkedHashMap2.put(fVar, i1Var);
            linkedHashMap.put(i1Var, q2Var);
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object obj = pair.second;
        obj.getClass();
        Map map = (Map) obj;
        HashMap mapU = CameraUseCaseAdapter.u(arrayList, (c3) e0Var.f(e0.f5531a, c3.f5519a), this.f5915b, range);
        String strQ2 = k0Var.q();
        strQ2.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (arrayList.isEmpty()) {
            i15 = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rectT = k0Var.t();
            } catch (NullPointerException unused) {
                rectT = null;
            }
            k kVar = new k(k0Var, rectT != null ? v.g(rectT) : null);
            Iterator it3 = arrayList.iterator();
            boolean z15 = false;
            while (it3.hasNext()) {
                i1 i1Var2 = (i1) it3.next();
                Object obj2 = mapU.get(i1Var2);
                if (obj2 == null) {
                    h.s("Required value was null.");
                    return null;
                }
                CameraUseCaseAdapter.a aVar = (CameraUseCaseAdapter.a) obj2;
                HashMap map2 = mapU;
                b3<?> b3VarP = i1Var2.p(k0Var, aVar.f5903a, aVar.f5904b);
                b3VarP.getClass();
                linkedHashMap4.put(b3VarP, i1Var2);
                linkedHashMap5.put(b3VarP, kVar.b(b3VarP));
                if ((i1Var2 instanceof w0) || (i1Var2 instanceof d)) {
                    z15 = b3VarP.C() == 2;
                }
                mapU = map2;
            }
            i0 i0Var2 = this.f5916c;
            if (i0Var2 == null) {
                h.z("Required value was null.");
                return null;
            }
            ArrayList arrayList4 = new ArrayList(map.keySet());
            boolean z16 = CameraUseCaseAdapter.z(arrayList);
            k7.h.b(!linkedHashMap5.isEmpty(), "No new use cases to be bound.");
            b2 b2Var2 = (b2) ((h0) i0Var2).f173827b.get(strQ2);
            k7.h.b(b2Var2 != null, "No such camera id in supported combination list: ".concat(strQ2));
            v2 v2VarJ = b2Var2.j(i14, arrayList4, linkedHashMap5, z15, z16, z14);
            Map<b3<?>, q2> map3 = v2VarJ.f5829a;
            Map<e, q2> map4 = v2VarJ.f5830b;
            i15 = v2VarJ.f5831c;
            for (Map.Entry entry : linkedHashMap4.entrySet()) {
                Object value = entry.getValue();
                q2 q2Var4 = map3.get(entry.getKey());
                if (q2Var4 == null) {
                    h.s("Required value was null.");
                    return null;
                }
                linkedHashMap3.put(value, q2Var4);
            }
            for (Map.Entry<e, q2> entry2 : map4.entrySet()) {
                if (map.containsKey(entry2.getKey())) {
                    Object obj3 = map.get(entry2.getKey());
                    if (obj3 == null) {
                        h.s("Required value was null.");
                        return null;
                    }
                    linkedHashMap3.put(obj3, entry2.getValue());
                }
            }
        }
        i iVar = new i(linkedHashMap3, i15);
        Object obj4 = pair.first;
        obj4.getClass();
        return new i(u0.h((Map) obj4, iVar.f115502a), iVar.f115503b);
    }

    public /* synthetic */ b(c3 c3Var, i0 i0Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(c3Var, (i14 & 2) != 0 ? null : i0Var);
    }
}
