package com.garmin.android.gncs.handlers;

import com.airbnb.lottie.animation.keyframe.a;
import com.garmin.android.gncs.GNCSNotificationInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/garmin/android/gncs/handlers/DoNotSendIfLocalAppHandler;", "Lcom/garmin/android/gncs/handlers/AbstractAppHandler;", "()V", "shouldSendToDevice", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "shouldSend", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DoNotSendIfLocalAppHandler extends AbstractAppHandler {
    @Override // com.garmin.android.gncs.handlers.AbstractAppHandler
    public boolean shouldSendToDevice(GNCSNotificationInfo ni3, boolean shouldSend) {
        ni3.getClass();
        if (shouldSend) {
            if ((ni3.notificationFlags & 256) == 0) {
                return true;
            }
            a.s("DoNotSendIfLocalAppHandler: not sending notification for package [", ni3.packageName, "] -> local only flag set");
        }
        return false;
    }
}
