package w51;

import android.content.Context;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lw51/h0;", "Landroidx/lifecycle/u1;", "Ly51/a;", "activityRepo", "<init>", "(Ly51/a;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y51.a f182266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f182267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f182268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f182269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f182270e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f182271f;

    public h0(y51.a aVar) {
        aVar.getClass();
        this.f182266a = aVar;
        this.f182267b = q2.a(new w(false, false, false, null, null, false, 63, null));
        p2 p2VarA = q2.a(p13.j0.f134944a);
        this.f182268c = p2VarA;
        r53.s.d(p2VarA);
        A4();
    }

    public static final TreeMap x4(h0 h0Var, b63.o oVar, z51.h hVar, Map map) {
        h0Var.getClass();
        if (map == null) {
            map = p13.k0.f134949a;
            map.getClass();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Collection collection = (List) linkedHashMap.get(oVar);
        if (collection == null) {
            collection = p13.j0.f134944a;
        }
        linkedHashMap.put(oVar, p13.h0.N0(p13.h0.D0(collection, hVar), new a0()));
        TreeMap treeMap = new TreeMap(new z());
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0103, code lost:
    
        if (r13 == r14) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y4(h0 h0Var, v13.c cVar) {
        g0 g0Var;
        Object value;
        Object value2;
        p2 p2Var = h0Var.f182268c;
        y51.a aVar = h0Var.f182266a;
        p2 p2Var2 = h0Var.f182267b;
        if (cVar instanceof g0) {
            g0Var = (g0) cVar;
            int i14 = g0Var.f182264c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g0Var.f182264c = i14 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(h0Var, cVar);
            }
        } else {
            g0Var = new g0(h0Var, cVar);
        }
        Object objF = g0Var.f182262a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = g0Var.f182264c;
        if (i15 == 0) {
            o13.r.b(objF);
            g0Var.f182264c = 1;
            objF = aVar.f(g0Var);
            if (objF != aVar2) {
            }
            return aVar2;
        }
        if (i15 == 1) {
            o13.r.b(objF);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        v2 v2Var = (v2) objF;
        if (v2Var instanceof v2.b) {
            p2Var.setValue(((v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            p2Var.setValue(p13.j0.f134944a);
        }
        return Unit.INSTANCE;
        v2 v2Var2 = (v2) objF;
        if (v2Var2 instanceof v2.b) {
            List listN0 = p13.h0.N0(((z51.g) ((v2.b) v2Var2).f47386a).f202501a, new f0());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : listN0) {
                b63.o oVarB = ((z51.h) obj).d().b();
                Object arrayList = linkedHashMap.get(oVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(oVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            TreeMap treeMap = new TreeMap(new e0());
            treeMap.putAll(linkedHashMap);
            if (treeMap.isEmpty()) {
                sz0.f.a aVar3 = sz0.f.f161394a;
                Context contextC = ((c22.o) KoinJavaComponent.get$default(c22.o.class, null, null, 6, null)).c();
                aVar3.getClass();
                sz0.f.a.b(contextC);
            }
            do {
                value2 = p2Var2.getValue();
            } while (!p2Var2.b(value2, w.a((w) p2Var2.getValue(), false, false, null, treeMap, false, 14)));
        } else {
            if (!(v2Var2 instanceof v2.a)) {
                lc.u0.r();
                return null;
            }
            do {
                value = p2Var2.getValue();
            } while (!p2Var2.b(value, w.a((w) p2Var2.getValue(), false, false, null, null, false, 26)));
        }
        g0Var.f182264c = 2;
        objF = aVar.d(g0Var);
    }

    public static final Map z4(h0 h0Var, b63.o oVar, z51.h hVar, Map map) {
        h0Var.getClass();
        if (map == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        List list = (List) linkedHashMap.get(oVar);
        ArrayList arrayListY0 = list != null ? p13.h0.y0(list, hVar) : null;
        if (arrayListY0 == null || arrayListY0.isEmpty()) {
            linkedHashMap.remove(oVar);
        } else {
            linkedHashMap.put(oVar, arrayListY0);
        }
        return p13.u0.m(linkedHashMap);
    }

    public final void A4() {
        ge1.b.T(v1.a(this), null, null, new d0(this, null), 3);
    }
}
