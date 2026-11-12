package rq0;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import tq0.m;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrq0/d;", "", "Lar0/a;", "insightsRepo", "Lbv/d;", "userPreference", "<init>", "(Lar0/a;Lbv/d;)V", "gcm-insights_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar0.a f154123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bv.d f154124b;

    public d(ar0.a aVar, bv.d dVar) {
        aVar.getClass();
        dVar.getClass();
        this.f154123a = aVar;
        this.f154124b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        if (r9 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, tq0.d dVar2, v13.c cVar) {
        b bVar;
        tq0.d dVar3;
        List list;
        dVar.getClass();
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f154116e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f154116e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar, cVar);
            }
        } else {
            bVar = new b(dVar, cVar);
        }
        Object objB = bVar.f154114c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f154116e;
        if (i15 != 0) {
            if (i15 == 1) {
                list = bVar.f154113b;
                dVar3 = bVar.f154112a;
                r.b(objB);
            } else {
                if (i15 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            return (List) objB;
        }
        ArrayList arrayListX = v.h.x(objB);
        ar0.a aVar = dVar.f154123a;
        bVar.f154112a = dVar2;
        bVar.f154113b = arrayListX;
        bVar.f154116e = 1;
        Object objJ = f0.J(aVar, new ar0.d(aVar, null), bVar);
        if (objJ != obj) {
            dVar3 = dVar2;
            list = arrayListX;
            objB = objJ;
        }
        return obj;
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            list = (List) ((v2.b) v2Var).f47386a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        bVar.f154112a = null;
        bVar.f154113b = null;
        bVar.f154116e = 2;
        objB = dVar.b(dVar3, bVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(tq0.d dVar, v13.c cVar) {
        a aVar;
        int i14;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i15 = aVar.f154111d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f154111d = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object obj = aVar.f154109b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = aVar.f154111d;
        if (i16 != 0) {
            if (i16 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = aVar.f154108a;
            r.b(obj);
            return arrayList;
        }
        ArrayList arrayListX = v.h.x(obj);
        br0.b.a aVar3 = br0.b.f19573a;
        List<tq0.a> list = dVar.f166047a;
        aVar3.getClass();
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bv.d dVar2 = (bv.d) KoinJavaComponent.get$default(bv.d.class, null, null, 6, null);
        e12.e eVarI = dVar2.I();
        for (tq0.a aVar4 : list) {
            String str = aVar4.f166036a;
            if (s.g(str, m.RUNNING.f166114a)) {
                linkedHashMap.put(str, aVar4);
            } else if (s.g(str, m.CYCLING.f166114a)) {
                linkedHashMap.put(str, aVar4);
            } else if (s.g(str, m.LAP_SWIMMING.f166114a) || s.g(str, m.OPEN_WATER_SWIMMING.f166114a)) {
                linkedHashMap.put(str, aVar4);
            } else if (s.g(str, m.STAIR_CLIMBING.f166114a)) {
                if (eVarI.J()) {
                    linkedHashMap.put(str, aVar4);
                }
            } else if (s.g(str, m.STEPS.f166114a) || s.g(str, m.SLEEP.f166114a)) {
                if (dVar2.M()) {
                    linkedHashMap.put(str, aVar4);
                }
            }
        }
        int size = linkedHashMap.size();
        boolean zIsEmpty = linkedHashMap.isEmpty();
        List<tq0.a> list2 = dVar.f166047a;
        int i17 = 0;
        if (zIsEmpty) {
            Iterator<tq0.a> it = list2.iterator();
            while (it.hasNext()) {
                String str2 = it.next().f166036a;
                m.f166103c.getClass();
                arrayListX.add(new tq0.f(i17, true, m.a.a(str2)));
                i17++;
            }
        } else {
            Iterator<tq0.a> it3 = list2.iterator();
            while (it3.hasNext()) {
                String str3 = it3.next().f166036a;
                boolean zContainsKey = linkedHashMap.containsKey(str3);
                if (linkedHashMap.containsKey(str3)) {
                    i14 = size;
                    size = i17;
                    i17++;
                } else {
                    i14 = size + 1;
                }
                m.f166103c.getClass();
                arrayListX.add(new tq0.f(size, zContainsKey, m.a.a(str3)));
                size = i14;
            }
        }
        List listB1 = h0.b1(arrayListX);
        aVar.f154108a = arrayListX;
        aVar.f154111d = 1;
        ar0.a aVar5 = this.f154123a;
        return f0.J(aVar5, new ar0.e(aVar5, listB1, null), aVar) == aVar2 ? aVar2 : arrayListX;
    }
}
