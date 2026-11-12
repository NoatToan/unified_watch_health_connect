package com.garmin.android.gncs.handlers;

import com.airbnb.lottie.animation.keyframe.a;
import com.garmin.android.gncs.AppManager;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.SmartNotificationsUtil;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/garmin/android/gncs/handlers/TrueCallerAppHandler;", "Lcom/garmin/android/gncs/handlers/AbstractAppHandler;", "()V", "shouldSendToDevice", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "shouldSend", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TrueCallerAppHandler extends AbstractAppHandler {
    @Override // com.garmin.android.gncs.handlers.AbstractAppHandler
    public boolean shouldSendToDevice(GNCSNotificationInfo ni3, boolean shouldSend) {
        ni3.getClass();
        if (!SmartNotificationsUtil.Packages.TRUE_CALLER_PACKAGE_NAME.equals(ni3.packageName)) {
            return shouldSend;
        }
        if (ni3.type != GNCSNotificationInfo.NotificationType.INCOMING_CALL) {
            return true;
        }
        AppManager appManager = AppManager.INSTANCE;
        String str = ni3.packageName;
        str.getClass();
        boolean zIsDefaultDialer = appManager.isDefaultDialer(str);
        String str2 = ni3.packageName;
        if (zIsDefaultDialer) {
            a.s("TrueCallerAppHandler.shouldSendToDevice -> Sending incoming call notification from [", str2, "] as it is the default dialer");
            return true;
        }
        a.s("TrueCallerAppHandler.shouldSendToDevice -> Not sending incoming call notification from [", str2, "] as it is not the default dialer");
        return false;
    }
}
