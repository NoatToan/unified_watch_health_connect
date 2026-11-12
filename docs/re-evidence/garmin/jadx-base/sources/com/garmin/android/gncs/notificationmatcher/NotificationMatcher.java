package com.garmin.android.gncs.notificationmatcher;

import com.garmin.android.gncs.GNCSNotificationInfo;
import ih2.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class NotificationMatcher {
    protected static final int MAX_SAME_NOTIFICATION_DIFF_TIME_MS = 60000;
    private static final Map<String, Class<? extends NotificationMatcher>> sNotificationMatchers = new HashMap();
    private static final NotificationMatcher S_DEFAULT_NOTIFICATION_MATCHER = new NotificationMatcher();

    public static NotificationMatcher getNotificationMatcher(String str, int i14) {
        Map<String, Class<? extends NotificationMatcher>> map = sNotificationMatchers;
        Class<? extends NotificationMatcher> cls = map.get(str + ":" + i14);
        if (cls == null) {
            cls = map.get(str + ":0");
        }
        if (cls != null) {
            try {
                return cls.getConstructor(null).newInstance(null);
            } catch (Exception e4) {
                b bVar = b.f93516a;
                b.a(e4, e4.getClass().getName());
            }
        }
        return S_DEFAULT_NOTIFICATION_MATCHER;
    }

    public static boolean isNotificationMatch(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2, boolean z14) {
        return getNotificationMatcher(gNCSNotificationInfo.packageName, 0).contentMatches(gNCSNotificationInfo, gNCSNotificationInfo2, z14);
    }

    public static void registerNotificationMatcher(String str, int i14, Class<? extends NotificationMatcher> cls) {
        sNotificationMatchers.put(str + ":" + i14, cls);
    }

    public boolean contentMatches(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2, boolean z14) {
        return (!z14 || isWhenMatch(gNCSNotificationInfo, gNCSNotificationInfo2)) && Objects.equals(gNCSNotificationInfo.title, gNCSNotificationInfo2.title) && Objects.equals(gNCSNotificationInfo.subTitle, gNCSNotificationInfo2.subTitle) && Objects.equals(gNCSNotificationInfo.message, gNCSNotificationInfo2.message);
    }

    public boolean isWhenMatch(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2) {
        return Math.abs(gNCSNotificationInfo.when - gNCSNotificationInfo2.when) < 60000;
    }
}
