package com.garmin.android.gncs.handlers;

import android.app.KeyguardManager;
import android.content.Context;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSListenerServiceConfig;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.SmartNotificationsUtil;
import ih2.a;
import ih2.b;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/garmin/android/gncs/handlers/SamsungCalendarAppHandler;", "Lcom/garmin/android/gncs/handlers/AbstractAppHandler;", "()V", "shouldSendToDevice", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "shouldSend", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SamsungCalendarAppHandler extends AbstractAppHandler {
    private static final String TAG = "SamsungCalendarAppHandler";

    @Override // com.garmin.android.gncs.handlers.AbstractAppHandler
    public boolean shouldSendToDevice(GNCSNotificationInfo ni3, boolean shouldSend) {
        boolean zBooleanValue;
        ni3.getClass();
        if (!s.g(ni3.packageName, SmartNotificationsUtil.Packages.SAMSUNG_CALENDAR_PACKAGE_NAME)) {
            return shouldSend;
        }
        boolean z14 = true;
        boolean z15 = (ni3.notificationFlags & 64) != 0;
        b bVar = b.f93516a;
        a aVar = a.f93515a;
        bVar.getClass();
        try {
            GNCSListenerServiceConfig config = GNCSListenerService.getConfig();
            Context appContext = config != null ? config.getAppContext() : null;
            if (appContext != null) {
                Object systemService = appContext.getSystemService("keyguard");
                KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
                if (keyguardManager == null) {
                    b.d("GNCSCoreUtil.isDeviceLocked -> KeyguardManager unavailable");
                } else {
                    zBooleanValue = ((Boolean) aVar.invoke(keyguardManager)).booleanValue();
                }
                if (!shouldSend && (!z15 || !zBooleanValue)) {
                    z14 = false;
                }
                StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("SamsungCalendarAppHandler: Foreground service flag set: [", "], device locked: [", "], shouldSendForSamsungCalendar: [", z15, zBooleanValue);
                sbM.append(z14);
                sbM.append("]");
                b.b(sbM.toString());
                return z14;
            }
            b.d("GNCSCoreUtil.isDeviceLocked -> library not initialized, no app context available");
        } catch (Exception e4) {
            b.a(e4, "GNCSCoreUtil.isDeviceLocked");
        }
        zBooleanValue = false;
        if (!shouldSend) {
            z14 = false;
        }
        StringBuilder sbM2 = com.airbnb.lottie.animation.keyframe.a.m("SamsungCalendarAppHandler: Foreground service flag set: [", "], device locked: [", "], shouldSendForSamsungCalendar: [", z15, zBooleanValue);
        sbM2.append(z14);
        sbM2.append("]");
        b.b(sbM2.toString());
        return z14;
    }
}
