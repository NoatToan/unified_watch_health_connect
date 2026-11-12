package qu;

import android.app.Activity;
import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.library.mobileauth.ui.mfa.MFAPortalFlowActivity;
import o13.q;
import o13.r;
import sc2.o;
import vb.h;
import ve2.e;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(Activity activity, boolean z14, v13.c cVar) {
        a aVar;
        q.b bVar;
        boolean z15;
        int i14;
        Activity activity2;
        String str;
        boolean z16;
        Activity activity3;
        Activity activity4 = activity;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i15 = aVar.f147862g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                aVar.f147862g = i15 - Integer.MIN_VALUE;
            } else {
                aVar = new a(cVar);
            }
        } else {
            aVar = new a(cVar);
        }
        Object objP = aVar.f147861f;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = aVar.f147862g;
        try {
            if (i16 == 0) {
                r.b(objP);
                int i17 = q.f128596b;
                re2.b bVar2 = re2.b.f152215a;
                aVar.f147856a = activity4;
                aVar.f147857b = activity4;
                z15 = z14;
                aVar.f147859d = z15;
                i14 = 0;
                aVar.f147860e = 0;
                aVar.f147862g = 1;
                objP = re2.b.p(bVar2, aVar);
                if (objP != aVar2) {
                    activity2 = activity4;
                }
                return aVar2;
            }
            if (i16 == 1) {
                int i18 = aVar.f147860e;
                z15 = aVar.f147859d;
                activity2 = aVar.f147857b;
                Activity activity5 = aVar.f147856a;
                r.b(objP);
                i14 = i18;
                activity4 = activity5;
            } else {
                if (i16 != 2) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z17 = aVar.f147859d;
                String str2 = aVar.f147858c;
                activity3 = aVar.f147857b;
                r.b(objP);
                z16 = z17;
                str = str2;
            }
            e eVar = (e) objP;
            MFAPortalFlowActivity.a aVar3 = MFAPortalFlowActivity.B;
            sc2.a aVar4 = sc2.a.f158478d;
            aVar3.getClass();
            activity3.getClass();
            eVar.getClass();
            aVar4.getClass();
            str.getClass();
            Context baseContext = activity3.getBaseContext();
            baseContext.getClass();
            return MFAPortalFlowActivity.a.a(baseContext, eVar, z16, null, null, aVar4, str);
            o oVar = (o) objP;
            String str3 = oVar != null ? oVar.f158544a : null;
            if (str3 == null) {
                int i19 = q.f128596b;
                bVar = null;
                Throwable thB = q.b(bVar);
                if (thB != null) {
                    a2 a2Var = a2.GENERAL;
                    i2.f36769a.getClass();
                    i2.a.g(a2Var, "Failed to build MFA intent", thB);
                }
                if (bVar != null) {
                    return null;
                }
                return bVar;
            }
            re2.b bVar3 = re2.b.f152215a;
            aVar.f147856a = activity4;
            aVar.f147857b = activity2;
            aVar.f147858c = str3;
            aVar.f147859d = z15;
            aVar.f147860e = i14;
            aVar.f147862g = 2;
            bVar3.getClass();
            Object objQ = re2.b.q(aVar);
            if (objQ != aVar2) {
                str = str3;
                z16 = z15;
                activity3 = activity2;
                objP = objQ;
                e eVar2 = (e) objP;
                MFAPortalFlowActivity.a aVar5 = MFAPortalFlowActivity.B;
                sc2.a aVar6 = sc2.a.f158478d;
                aVar5.getClass();
                activity3.getClass();
                eVar2.getClass();
                aVar6.getClass();
                str.getClass();
                Context baseContext2 = activity3.getBaseContext();
                baseContext2.getClass();
                return MFAPortalFlowActivity.a.a(baseContext2, eVar2, z16, null, null, aVar6, str);
            }
            return aVar2;
        } catch (Throwable th3) {
            int i24 = q.f128596b;
            bVar = new q.b(th3);
        }
    }
}
