package kd0;

import android.app.Activity;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import com.garmin.android.apps.connectmobile.contacts.details.ContactDetailsActivity;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactActivity;
import com.garmin.android.apps.connectmobile.contacts.emergency.EmergencyContactSendRequestActivity;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/o0;", "Luu0/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o0 implements uu0.c {
    @Override // uu0.c
    public final Intent a(Activity activity, pu0.b bVar, pu0.i iVar, boolean z14, hl.a aVar) {
        boolean z15;
        activity.getClass();
        bVar.getClass();
        aVar.getClass();
        List listC = iVar == null ? p13.j0.f134944a : p13.w.c(nu0.a.g(iVar));
        EmergencyContactSendRequestActivity.a aVar2 = EmergencyContactSendRequestActivity.f32570v;
        l20.a aVarB = nu0.a.b(bVar);
        if (!z14 && (listC == null || !listC.isEmpty())) {
            Iterator it = listC.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((l20.c) it.next()).G()) {
                        if (listC.isEmpty()) {
                            break;
                        }
                        Iterator it3 = listC.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                if (((l20.c) it3.next()).g0()) {
                                    z15 = true;
                                    break;
                                }
                            }
                        }
                    }
                }
                z15 = false;
                break;
            }
        }
        z15 = false;
        break;
        boolean z16 = z15;
        aVar2.getClass();
        return EmergencyContactSendRequestActivity.a.a(activity, aVarB, listC, false, true, z16, aVar);
    }

    @Override // uu0.c
    public final Intent b(Activity activity, pu0.b bVar) {
        activity.getClass();
        return ContactDetailsActivity.a.b(ContactDetailsActivity.f32429g, activity, nu0.a.b(bVar), null, 60);
    }

    @Override // uu0.c
    public final Intent c(Activity activity, pu0.b bVar) {
        bVar.getClass();
        EditContactActivity.a aVar = EditContactActivity.f32500n;
        l20.a aVarB = nu0.a.b(bVar);
        hl.a.c cVar = hl.a.c.f84256b;
        aVar.getClass();
        cVar.getClass();
        Intent intentA = EditContactActivity.a.a(aVar, activity, aVarB, null, 4);
        intentA.putExtra("EXTRA_CREATE_NEW_PHONE_NUMBER", true);
        intentA.putExtra("GCM_extra_screen_access_role", cVar);
        return intentA;
    }

    @Override // uu0.c
    public final Intent d(Activity activity, boolean z14, hl.a aVar) {
        activity.getClass();
        aVar.getClass();
        return ContactActivity.a.a(ContactActivity.T, activity, false, 3, null, 50, z14, aVar, 10);
    }
}
