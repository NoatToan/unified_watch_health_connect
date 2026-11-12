package gy0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/g0;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80161a;

    public g0(by0.a aVar) {
        aVar.getClass();
        this.f80161a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(String str, b63.o oVar, b63.o oVar2, m61.a aVar, v13.c cVar) {
        e0 e0Var;
        Map<String, n61.g> mapG;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i14 = e0Var.f80138c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                e0Var.f80138c = i14 - Integer.MIN_VALUE;
            } else {
                e0Var = new e0(this, cVar);
            }
        } else {
            e0Var = new e0(this, cVar);
        }
        e0 e0Var2 = e0Var;
        Object objK = e0Var2.f80136a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = e0Var2.f80138c;
        if (i15 == 0) {
            o13.r.b(objK);
            e0Var2.f80138c = 1;
            objK = this.f80161a.k(str, oVar, oVar2, aVar, e0Var2);
            if (objK == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objK);
        }
        n61.f fVar = (n61.f) objK;
        if (fVar == null || (mapG = fVar.g()) == null || mapG.isEmpty()) {
            return null;
        }
        Collection<n61.g> collectionValues = mapG.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            Integer groupAverage = ((n61.g) it.next()).getGroupAverage();
            if (groupAverage != null) {
                arrayList.add(groupAverage);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r12 == r0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, b63.o oVar, b63.o oVar2, v13.c cVar) {
        f0 f0Var;
        String str2;
        b63.o oVar3;
        b63.o oVar4;
        n61.f fVar;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i14 = f0Var.f80155g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f0Var.f80155g = i14 - Integer.MIN_VALUE;
            } else {
                f0Var = new f0(this, cVar);
            }
        } else {
            f0Var = new f0(this, cVar);
        }
        f0 f0Var2 = f0Var;
        Object objA = f0Var2.f80153e;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = f0Var2.f80155g;
        if (i15 == 0) {
            o13.r.b(objA);
            m61.a aVar = m61.a.WEEKLY;
            f0Var2.f80149a = str;
            f0Var2.f80150b = oVar;
            f0Var2.f80151c = oVar2;
            f0Var2.f80155g = 1;
            str2 = str;
            oVar3 = oVar;
            oVar4 = oVar2;
            objA = a(str2, oVar3, oVar4, aVar, f0Var2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i15 == 1) {
            b63.o oVar5 = f0Var2.f80151c;
            b63.o oVar6 = f0Var2.f80150b;
            String str3 = f0Var2.f80149a;
            o13.r.b(objA);
            str2 = str3;
            oVar3 = oVar6;
            oVar4 = oVar5;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar = f0Var2.f80152d;
            o13.r.b(objA);
        }
        return new k(fVar, (n61.f) objA);
        fVar = (n61.f) objA;
        m61.a aVar2 = m61.a.DAILY;
        f0Var2.f80149a = null;
        f0Var2.f80150b = null;
        f0Var2.f80151c = null;
        f0Var2.f80152d = fVar;
        f0Var2.f80155g = 2;
        objA = a(str2, oVar3, oVar4, aVar2, f0Var2);
    }
}
