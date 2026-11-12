package sf1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(v13.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f158874b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f158874b = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar);
            }
        } else {
            bVar = new b(cVar);
        }
        Object objD = bVar.f158873a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f158874b;
        if (i15 == 0) {
            r.b(objD);
            qf1.b bVar2 = (qf1.b) KoinJavaComponent.get$default(qf1.b.class, null, null, 6, null);
            bVar.f158874b = 1;
            objD = bVar2.d(bVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objD);
        }
        boolean zBooleanValue = ((Boolean) objD).booleanValue();
        i2.a aVar2 = i2.f36769a;
        aVar2.getClass();
        i2.a.b(a2.GENERAL, "UserPreferenceGhsHelper", "[updateUserPreferenceGhsAccountCreated] GHS account created = " + zBooleanValue);
        ((uf1.a) KoinJavaComponent.get$default(uf1.a.class, null, null, 6, null)).c().f158872a.O2("key_ghs_account_created", zBooleanValue);
        return Unit.INSTANCE;
    }
}
