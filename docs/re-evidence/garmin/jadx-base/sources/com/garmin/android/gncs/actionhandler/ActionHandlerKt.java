package com.garmin.android.gncs.actionhandler;

import android.service.notification.StatusBarNotification;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSNotificationManager;
import com.garmin.android.gncs.persistence.CacheManager;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import ih2.b;
import p005kotlin.Metadata;
import p13.u;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0007"}, d2 = {"answerIncomingCall", "", "Lcom/garmin/android/gncs/GNCSListenerService;", "dismiss", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "rejectIncomingCall", "gncs-all-modules_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ActionHandlerKt {
    public static final void answerIncomingCall(GNCSListenerService gNCSListenerService) {
        gNCSListenerService.getClass();
        b.b("performAction -> accept incoming call");
        TelephonyUtilKt.answerCall(gNCSListenerService);
    }

    public static final void dismiss(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo) {
        GNCSNotificationInfo groupSummaryNotification;
        gNCSListenerService.getClass();
        gNCSNotificationInfo.getClass();
        if (((GNCSNotificationManager) jb2.b.a(GNCSNotificationManager.class)).shouldRemoveSummaryFor(gNCSNotificationInfo)) {
            CacheManager cacheManager = CacheManager.INSTANCE;
            String str = gNCSNotificationInfo.groupKey;
            str.getClass();
            groupSummaryNotification = cacheManager.getGroupSummaryNotification(str);
        } else {
            groupSummaryNotification = null;
        }
        b.b("performAndroidAction -> notification dismissed".concat(groupSummaryNotification != null ? ", including group summary" : ""));
        gNCSListenerService.cancelNotification(gNCSNotificationInfo.notificationKey);
        if (groupSummaryNotification != null) {
            gNCSListenerService.cancelNotification(groupSummaryNotification.notificationKey);
        }
    }

    public static final void rejectIncomingCall(GNCSListenerService gNCSListenerService, GNCSNotificationInfo gNCSNotificationInfo) {
        gNCSListenerService.getClass();
        gNCSNotificationInfo.getClass();
        b.b("performAction -> reject incoming call");
        StatusBarNotification[] activeNotifications = gNCSListenerService.getActiveNotifications(new String[]{gNCSNotificationInfo.notificationKey});
        activeNotifications.getClass();
        TelephonyUtilKt.rejectCall(gNCSListenerService, (StatusBarNotification) u.H(activeNotifications));
    }
}
