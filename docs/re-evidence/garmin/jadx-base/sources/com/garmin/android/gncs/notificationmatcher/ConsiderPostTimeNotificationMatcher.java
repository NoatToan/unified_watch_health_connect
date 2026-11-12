package com.garmin.android.gncs.notificationmatcher;

import com.garmin.android.gncs.GNCSNotificationInfo;

/* JADX INFO: loaded from: classes11.dex */
public class ConsiderPostTimeNotificationMatcher extends NotificationMatcher {
    @Override // com.garmin.android.gncs.notificationmatcher.NotificationMatcher
    public boolean isWhenMatch(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2) {
        if (gNCSNotificationInfo.when != 0 || gNCSNotificationInfo2.when != 0) {
            return super.isWhenMatch(gNCSNotificationInfo, gNCSNotificationInfo2);
        }
        long j8 = gNCSNotificationInfo.postTime - gNCSNotificationInfo2.postTime;
        return j8 >= -60000 && j8 <= 60000;
    }
}
