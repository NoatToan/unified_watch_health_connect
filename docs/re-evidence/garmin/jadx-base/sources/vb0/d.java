package vb0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n70.e3;
import n70.h3;
import o13.r;
import p005kotlin.Metadata;
import p13.j0;
import p13.y;
import rd2.f;
import rd2.j;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvb0/d;", "Lvb0/b;", "Ll80/a;", "deviceDelegate", "Lrd2/f;", "deviceDao", "<init>", "(Ll80/a;Lrd2/f;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.a f176838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f176839b;

    public d(l80.a aVar, f fVar) {
        aVar.getClass();
        fVar.getClass();
        this.f176838a = aVar;
        this.f176839b = fVar;
    }

    @Override // vb0.b
    public final Object a(h3 h3Var) {
        return this.f176838a.J(h3Var);
    }

    @Override // vb0.b
    public final Object b(e3 e3Var) {
        return this.f176838a.v(true, e3Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [p13.j0] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    @Override // vb0.b
    public final Serializable c(v13.c cVar) {
        c cVar2;
        ?? arrayList;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f176837c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f176837c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objV = cVar2.f176835a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f176837c;
        if (i15 == 0) {
            r.b(objV);
            cVar2.f176837c = 1;
            objV = this.f176838a.v(true, cVar2);
            if (objV == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objV);
        }
        List list = (List) objV;
        this.f176839b.f152045a.getClass();
        ArrayList arrayListE = j.e();
        if (arrayListE != null) {
            arrayList = new ArrayList(y.r(arrayListE, 10));
            Iterator it = arrayListE.iterator();
            while (it.hasNext()) {
                q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList);
            }
        } else {
            arrayList = j0.f134944a;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!arrayList.contains(new Long(((Number) obj).longValue()))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }
}
