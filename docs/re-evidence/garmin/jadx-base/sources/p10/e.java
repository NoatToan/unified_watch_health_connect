package p10;

import com.garmin.android.apps.connectmobile.v2;
import e23.l;
import java.io.IOException;
import o13.r;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class e {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(l lVar, String str, v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f134891c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f134891c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar);
            }
        } else {
            dVar = new d(cVar);
        }
        Object objInvoke = dVar.f134890b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f134891c;
        try {
            if (i15 == 0) {
                r.b(objInvoke);
                dVar.f134889a = str;
                dVar.f134891c = 1;
                objInvoke = lVar.invoke(dVar);
                if (objInvoke == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = dVar.f134889a;
                r.b(objInvoke);
            }
            return (v2) objInvoke;
        } catch (Exception e4) {
            return new v2.a(new IOException(str, e4), null, null, 6, null);
        }
    }
}
