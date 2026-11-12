package zd0;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzd0/n;", "", "Lpc0/j;", "devicesRepository", "Lkg1/a;", "developerSettings", "<init>", "(Lpc0/j;Lkg1/a;)V", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kg1.a f204082a;

    public n(pc0.j jVar, kg1.a aVar) {
        jVar.getClass();
        aVar.getClass();
        this.f204082a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(v13.c cVar) {
        m mVar;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i14 = mVar.f204079c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f204079c = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(this, cVar);
            }
        } else {
            mVar = new m(this, cVar);
        }
        Object objY = mVar.f204077a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f204079c;
        if (i15 == 0) {
            o13.r.b(objY);
            pc0.c0 c0VarJ = pc0.j.j();
            mVar.f204079c = 1;
            objY = r53.s.y(c0VarJ, mVar);
            if (objY == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        Iterable iterable = (List) objY;
        if (iterable == null) {
            iterable = p13.j0.f134944a;
        }
        if (this.f204082a.N()) {
            return iterable;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (((sd2.f) obj).d2()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
