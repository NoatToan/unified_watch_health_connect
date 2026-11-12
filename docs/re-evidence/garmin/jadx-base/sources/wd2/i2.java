package wd2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.ArrayList;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final class i2 {
    public static final Logger a(String str) {
        String strConcat = "LT# - ".concat(str);
        int i14 = gt2.c.f79010a;
        return gt2.b.f79005a.h(strConcat);
    }

    public static final void b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        broadcastReceiver.getClass();
        try {
            Logger loggerA = a("Util");
            ArrayList arrayList = new ArrayList();
            int iCountActions = intentFilter.countActions();
            for (int i14 = 0; i14 < iCountActions; i14++) {
                arrayList.add(intentFilter.getAction(i14));
            }
            loggerA.debug("registered receiver with actions " + arrayList + ", in context " + (context != null ? context.getClass().getSimpleName() : null));
            if (context != null) {
                a7.b.registerReceiver(context, broadcastReceiver, intentFilter, context.getPackageName() + ".permission.RECEIVE_BROADCASTS", null, 2);
            }
        } catch (IllegalArgumentException e4) {
            com.airbnb.lottie.animation.keyframe.a.w("Exception registerReceiver Gdi.Broadcasts ", e4.getMessage(), a("Util"));
        }
    }

    public static final void c(Context context, BroadcastReceiver broadcastReceiver) {
        broadcastReceiver.getClass();
        try {
            a("Util").debug("unregistered receiver in context " + (context != null ? context.getClass().getSimpleName() : null));
            if (context != null) {
                context.unregisterReceiver(broadcastReceiver);
            }
        } catch (IllegalArgumentException e4) {
            com.airbnb.lottie.animation.keyframe.a.w("Exception unregisterReceiver Gdi.Broadcasts ", e4.getMessage(), a("Util"));
        }
    }
}
