package c30;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc30/j0;", "", "<init>", "()V", "gcm-courses_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j0 {
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(j0 j0Var, com.garmin.android.library.mapsdkadapter.f fVar, v13.c cVar) {
        h0 h0Var;
        j0Var.getClass();
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i14 = h0Var.f23891c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                h0Var.f23891c = i14 - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(j0Var, cVar);
            }
        } else {
            h0Var = new h0(j0Var, cVar);
        }
        Object objA = h0Var.f23889a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = h0Var.f23891c;
        if (i15 == 0) {
            o13.r.b(objA);
            com.garmin.android.library.mapsdkadapter.g gVar = new com.garmin.android.library.mapsdkadapter.g(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            h0Var.f23891c = 1;
            objA = gVar.f50285a.a(fVar, h0Var);
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA);
        }
        return p13.h0.d0((List) objA);
    }
}
