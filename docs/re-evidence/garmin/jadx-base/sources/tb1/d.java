package tb1;

import fw.m;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public static final com.garmin.android.library.backgroundtaskmanagement.b.c a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            com.garmin.android.library.backgroundtaskmanagement.b.c cVarA = th3 != null ? cx0.b.a(th3) : null;
            if ((cVarA != null && cVarA != com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE) || cVarA != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK) {
                return cx0.b.a(th3);
            }
        }
        return com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
    }

    public static m b(Object obj, Integer num, Throwable th3, com.garmin.android.library.backgroundtaskmanagement.b.c cVar, int i14) {
        com.garmin.android.library.backgroundtaskmanagement.b.c cVar2;
        if ((i14 & 1) != 0) {
            obj = null;
        }
        if ((i14 & 2) != 0) {
            num = null;
        }
        if ((i14 & 4) != 0) {
            th3 = null;
        }
        if ((i14 & 8) != 0) {
            cVar = null;
        }
        if (cVar == null) {
            if (num != null) {
                int iIntValue = num.intValue();
                if (200 <= iIntValue && iIntValue < 300) {
                    cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
                } else if (iIntValue == 401) {
                    cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHENTICATED;
                } else if (403 > iIntValue || iIntValue >= 414) {
                    cVar2 = (500 > iIntValue || iIntValue >= 600) ? com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE : com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE;
                } else {
                    cVar2 = com.garmin.android.library.backgroundtaskmanagement.b.c.USER_NOT_AUTHORIZED;
                }
                cVar = cVar2;
            } else {
                cVar = th3 != null ? cx0.b.a(th3) : com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS;
            }
        }
        return cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS ? m.a.g(m.f73767e, obj, 1) : m.a.c(m.f73767e, null, cVar, 5);
    }
}
