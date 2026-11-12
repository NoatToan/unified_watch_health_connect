package z20;

import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz20/r;", "", "Ld60/b;", "coursesRepo", "<init>", "(Ld60/b;)V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d60.b f201941a;

    static {
        d60.b.a aVar = d60.b.f57806c;
    }

    public r(d60.b bVar) {
        bVar.getClass();
        this.f201941a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(List list, boolean z14, v13.c cVar) {
        q qVar;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f201940c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f201940c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objC = qVar.f201938a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f201940c;
        if (i15 == 0) {
            o13.r.b(objC);
            if (list != null && !list.isEmpty() && z14) {
                qVar.f201940c = 1;
                d60.b bVar = this.f201941a;
                objC = bVar.C(new d60.y(list, bVar, null), qVar);
                if (objC == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(objC);
        v2 v2Var = (v2) objC;
        if (v2Var instanceof v2.b) {
            k30.u uVar = (k30.u) ((v2.b) v2Var).f47386a;
            if (uVar != null) {
                gl1.y.U(uVar);
                return uVar;
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return null;
    }
}
