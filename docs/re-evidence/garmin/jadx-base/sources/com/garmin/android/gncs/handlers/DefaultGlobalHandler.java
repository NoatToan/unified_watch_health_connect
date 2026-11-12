package com.garmin.android.gncs.handlers;

import android.text.TextUtils;
import com.airbnb.lottie.animation.keyframe.a;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.settings.GNCSSettings;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import com.garmin.android.gncs.telephony.PhoneCallListener;
import d53.u;
import ih2.b;
import java.util.Set;
import org.apache.commons.text.lookup.StringLookupFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/garmin/android/gncs/handlers/DefaultGlobalHandler;", "Lcom/garmin/android/gncs/handlers/AbstractAppHandler;", "dialerPackageList", "", "", "(Ljava/util/Set;)V", "checkFlags", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "shouldSendToDevice", "shouldSend", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DefaultGlobalHandler extends AbstractAppHandler {
    private final Set<String> dialerPackageList;

    public DefaultGlobalHandler(Set<String> set) {
        set.getClass();
        this.dialerPackageList = set;
    }

    private final boolean checkFlags(GNCSNotificationInfo ni3) {
        String str = ni3.packageName;
        int i14 = ni3.priority;
        int i15 = ni3.notificationFlags;
        if (TextUtils.equals(ni3.category, StringLookupFactory.KEY_SYS)) {
            a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] is of category 'system'");
            return false;
        }
        if ((i15 & 64) != 0 && i14 < 1) {
            a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] is a foreground service and less than priority HIGH");
            return false;
        }
        if ((i15 & 256) != 0 && (i15 & 2) != 0) {
            a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] is local only and ongoing");
            return false;
        }
        if ((i15 & 2) == 0 || i14 >= 1) {
            return true;
        }
        a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] is ongoing and less than priority HIGH");
        return false;
    }

    @Override // com.garmin.android.gncs.handlers.AbstractAppHandler
    public boolean shouldSendToDevice(GNCSNotificationInfo ni3, boolean shouldSend) {
        GNCSNotificationInfo.NotificationType notificationType;
        ni3.getClass();
        String str = ni3.packageName;
        if (!GNCSSettings.getInstance().isPackageEnabled(str)) {
            a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] disabled");
            return false;
        }
        if (SmartNotificationsConfig.getInstance().isRestrictedType(ni3.type)) {
            a.s("GNCSSettings.shouldSendToDevice -> no, type [", ni3.type.name(), "] is restricted by config");
            return false;
        }
        if (!this.dialerPackageList.contains(ni3.packageName) && (notificationType = ni3.type) != GNCSNotificationInfo.NotificationType.INCOMING_CALL && notificationType != GNCSNotificationInfo.NotificationType.MISSED_CALL) {
            if (!checkFlags(ni3)) {
                return false;
            }
            if (!s.g(str, "android") && !s.g(str, "com.android.systemui")) {
                str.getClass();
                if (!u.y(str, "com.android.providers", false)) {
                    return true;
                }
            }
            a.s("GNCSSettings.shouldSendToDevice -> no, [", str, "] is 'android'");
            return false;
        }
        PhoneCallListener.CallState callState = PhoneCallListener.INSTANCE.getCallState();
        if (callState == PhoneCallListener.CallState.INCOMING_STARTED || callState == PhoneCallListener.CallState.INCOMING_MISSED || callState == PhoneCallListener.CallState.INCOMING_ANSWERED) {
            return true;
        }
        b.b("GNCSSettings.shouldSendToDevice -> no, [" + str + "] is a dialer and don't care about call state [" + callState + "]");
        return false;
    }
}
