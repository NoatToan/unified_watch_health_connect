package com.garmin.android.gncs;

import android.content.Context;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.music.MusicConfig;
import com.garmin.android.music.MusicDataHandler;
import java.util.ArrayList;
import java.util.Collection;
import rs2.h;

/* JADX INFO: loaded from: classes11.dex */
public final class GncsGdiHelper {
    private static final String TAG = "GncsGdiHelper: ";
    private static GfdiNotificationMessageReceiver sNotificationsReceiver;
    private static final byte[] sReceiverLock = new byte[0];

    public static Collection<h> createHandlers(rs2.c cVar, Context context) {
        boolean zIsInitialized = SmartNotificationsConfig.isInitialized();
        boolean zIsInitialized2 = MusicConfig.isInitialized();
        String strE = com.airbnb.lottie.animation.keyframe.a.e("smartNotifications[", "], musicControls[", "]", zIsInitialized, zIsInitialized2);
        if (!zIsInitialized && !zIsInitialized2) {
            ih2.b.d(TAG.concat(strE));
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(2);
        Context applicationContext = context.getApplicationContext();
        if (zIsInitialized) {
            synchronized (sReceiverLock) {
                try {
                    if (sNotificationsReceiver == null) {
                        sNotificationsReceiver = new GfdiNotificationMessageReceiver();
                        da2.d.c(applicationContext).f58886a.b(sNotificationsReceiver);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            arrayList.add(new SmartNotificationsDataHandler(cVar, applicationContext));
        }
        if (zIsInitialized2) {
            arrayList.add(new MusicDataHandler(cVar));
        }
        ih2.b.b(TAG.concat(strE));
        return arrayList;
    }
}
