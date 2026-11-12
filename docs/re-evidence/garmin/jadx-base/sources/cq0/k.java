package cq0;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
    public static final boolean a(List<l20.c> list) {
        if (list.isEmpty()) {
            return false;
        }
        for (l20.c cVar : list) {
            com.garmin.android.apps.connectmobile.contacts.i.a aVar = com.garmin.android.apps.connectmobile.contacts.i.f32732a;
            String str = cVar.getCom.google.firebase.analytics.FirebaseAnalytics.Param.CONTENT java.lang.String();
            aVar.getClass();
            if (com.garmin.android.apps.connectmobile.contacts.i.a.a(str)) {
                return true;
            }
        }
        return false;
    }
}
