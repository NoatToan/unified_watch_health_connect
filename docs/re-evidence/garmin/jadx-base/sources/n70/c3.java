package n70;

import java.io.Serializable;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ln70/c3;", "", "Ll70/n0;", "userFocusRepository", "<init>", "(Ll70/n0;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70.n0 f124105a;

    public c3(l70.n0 n0Var) {
        n0Var.getClass();
        this.f124105a = n0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(v13.c cVar) {
        b3 b3Var;
        if (cVar instanceof b3) {
            b3Var = (b3) cVar;
            int i14 = b3Var.f124044c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                b3Var.f124044c = i14 - Integer.MIN_VALUE;
            } else {
                b3Var = new b3(this, cVar);
            }
        } else {
            b3Var = new b3(this, cVar);
        }
        Object objR3 = b3Var.f124042a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = b3Var.f124044c;
        if (i15 == 0) {
            o13.r.b(objR3);
            b3Var.f124044c = 1;
            objR3 = this.f124105a.r3(b3Var);
            if (objR3 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objR3);
        }
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) objR3;
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            return j70.z.d((List) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a);
        }
        return null;
    }
}
