package tv0;

import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltv0/v;", "", "Lqv0/a;", "lifestyleLoggingPreferences", "Lrv0/a;", "repository", "Ltv0/b;", "getAutoLoggableBehaviorsUseCase", "<init>", "(Lqv0/a;Lrv0/a;Ltv0/b;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qv0.a f166647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rv0.a f166648b;

    public v(qv0.a aVar, rv0.a aVar2, b bVar) {
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.f166647a = aVar;
        this.f166648b = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(List list, v13.c cVar) {
        u uVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f166646c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f166646c = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objO = uVar.f166644a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f166646c;
        boolean z14 = false;
        if (i15 == 0) {
            o13.r.b(objO);
            qv0.a aVar2 = this.f166647a;
            if (!aVar2.o() && aVar2.i()) {
                ArrayList arrayListL = androidx.core.view.j.l(list);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    pv0.h hVar = (pv0.h) it.next();
                    pv0.w.a aVar3 = pv0.w.f141433b;
                    Long l14 = hVar.f141374a;
                    aVar3.getClass();
                    pv0.w wVarA = pv0.w.a.a(l14);
                    if (wVarA != null) {
                        arrayListL.add(wVarA);
                    }
                }
                if (b.a(arrayListL, false).isEmpty()) {
                    return Boolean.FALSE;
                }
                uVar.f166646c = 1;
                objO = this.f166648b.o(uVar);
                if (objO == aVar) {
                    return aVar;
                }
            }
            return Boolean.FALSE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objO);
        v2 v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            if (!((Boolean) ((v2.b) v2Var).f47386a).booleanValue()) {
                z14 = true;
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Boolean.valueOf(z14);
    }
}
