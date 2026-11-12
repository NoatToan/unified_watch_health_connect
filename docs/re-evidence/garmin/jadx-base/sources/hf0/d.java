package hf0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(v13.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f83625b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f83625b = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object objM = cVar2.f83624a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f83625b;
        if (i15 == 0) {
            r.b(objM);
            qf1.b bVar = (qf1.b) KoinJavaComponent.get$default(qf1.b.class, null, null, 6, null);
            cVar2.f83625b = 1;
            objM = bVar.m(cVar2);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objM);
        }
        boolean zBooleanValue = ((Boolean) objM).booleanValue();
        i2.a aVar2 = i2.f36769a;
        aVar2.getClass();
        i2.a.b(a2.GENERAL, "UserPreferenceGhsEcgHelper", "[updateUserPreferenceGhsEcgEnabled] ECG enabled = " + zBooleanValue);
        ((jf0.a) KoinJavaComponent.get$default(jf0.a.class, null, null, 6, null)).c().d(zBooleanValue);
        return Unit.INSTANCE;
    }
}
