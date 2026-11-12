package gy0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgy0/n0;", "", "Lby0/a;", "dataSource", "<init>", "(Lby0/a;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final by0.a f80201a;

    public n0(by0.a aVar) {
        aVar.getClass();
        this.f80201a = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(String str, v13.c cVar) {
        m0 m0Var;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i14 = m0Var.f80198c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                m0Var.f80198c = i14 - Integer.MIN_VALUE;
            } else {
                m0Var = new m0(this, cVar);
            }
        } else {
            m0Var = new m0(this, cVar);
        }
        Object objT = m0Var.f80196a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = m0Var.f80198c;
        if (i15 == 0) {
            o13.r.b(objT);
            m0Var.f80198c = 1;
            objT = this.f80201a.t(str, m0Var);
            if (objT == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objT);
        }
        Iterable iterable = (Iterable) objT;
        ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new cy0.p((ps.m) it.next()));
        }
        return arrayList;
    }
}
