package n70;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ln70/q;", "", "Ln70/c3;", "getRecommendedUserFocusUseCase", "Lf12/l;", "userSettings", "<init>", "(Ln70/c3;Lf12/l;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f124499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.l f124500b;

    public q(c3 c3Var, f12.l lVar) {
        c3Var.getClass();
        lVar.getClass();
        this.f124499a = c3Var;
        this.f124500b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(j70.r rVar, boolean z14, v13.c cVar) {
        p pVar;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i14 = pVar.f124468c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                pVar.f124468c = i14 - Integer.MIN_VALUE;
            } else {
                pVar = new p(this, cVar);
            }
        } else {
            pVar = new p(this, cVar);
        }
        Object objA = pVar.f124466a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = pVar.f124468c;
        if (i15 == 0) {
            o13.r.b(objA);
            if (z14) {
                return new o70.w(null, null);
            }
            if (rVar != j70.r.f97629l) {
                List<String> listJ2 = this.f124500b.J2();
                ArrayList arrayList = new ArrayList();
                for (String str : listJ2) {
                    j70.r.f97623f.getClass();
                    j70.r rVarA = j70.r.a.a(str);
                    if (rVarA != null) {
                        arrayList.add(rVarA);
                    }
                }
                return new o70.w(null, arrayList);
            }
            pVar.f124468c = 1;
            objA = this.f124499a.a(pVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        List list = (List) objA;
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                do {
                    if (it.hasNext()) {
                    }
                } while (((j70.r) it.next()) == j70.r.f97628k);
            }
            return new o70.w(j70.r.f97628k, list);
        }
        if (list != null) {
            if (!list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    if (((j70.r) it3.next()) == j70.r.f97627j) {
                    }
                }
            }
            return new o70.w(j70.r.f97627j, list);
        }
        return new o70.w(null, list);
    }
}
