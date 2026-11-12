package wj0;

import com.garmin.android.apps.connectmobile.settings.notifications.model.NotificationPreferencesDTO;
import com.garmin.android.apps.connectmobile.v2;
import o13.r;
import org.koin.java.KoinJavaComponent;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object a(v13.c cVar) {
        c cVar2;
        boolean z14;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f185781b;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f185781b = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(cVar);
            }
        } else {
            cVar2 = new c(cVar);
        }
        Object objB = cVar2.f185780a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f185781b;
        if (i15 == 0) {
            r.b(objB);
            dj1.a aVar2 = (dj1.a) KoinJavaComponent.get$default(dj1.a.class, null, null, 6, null);
            cVar2.f185781b = 1;
            objB = aVar2.b(cVar2);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objB);
        }
        v2 v2Var = (v2) objB;
        if (v2Var instanceof v2.b) {
            NotificationPreferencesDTO notificationPreferencesDTO = (NotificationPreferencesDTO) ((v2.b) v2Var).f47386a;
            z14 = notificationPreferencesDTO.N0 && notificationPreferencesDTO.Y0;
        }
        return Boolean.valueOf(z14);
    }
}
