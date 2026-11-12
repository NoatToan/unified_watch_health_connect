package dt2;

import com.garmin.proto.generated.GDISmartProto;
import o13.r;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(k kVar, GDISmartProto.Smart smart, v13.c cVar) {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f61201b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f61201b = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(cVar);
            }
        } else {
            iVar = new i(cVar);
        }
        Object obj = iVar.f61200a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f61201b;
        try {
            if (i15 == 0) {
                r.b(obj);
                iVar.f61201b = 1;
                if (kVar.a(smart, iVar) == obj2) {
                    return obj2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }
}
