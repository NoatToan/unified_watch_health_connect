package com.xiaomi.hm.health.utils;

import android.app.Activity;
import com.xiaomi.hm.health.ui.smartplay.AppNotificationAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.DisconnectRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.IncomingCallAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.PhoneAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.ReachGoalRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.SMAlertActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.logsit.LongSitAlertActivity;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/utils/ConcoAnalyticsImpl;", "Lcom/xiaomi/hm/health/utils/ConcoAnalyticsApi;", "Landroid/app/Activity;", "activity", "", "cincoVibrateAnalytics", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class ConcoAnalyticsImpl implements ConcoAnalyticsApi {
    @Override // com.xiaomi.hm.health.utils.ConcoAnalyticsApi
    @Nullable
    public String cincoVibrateAnalytics(@Nullable Activity activity) {
        if (activity instanceof AppNotificationAlertActivity) {
            return "AppPush";
        }
        if (activity instanceof IncomingCallAlertActivity) {
            return "Call";
        }
        if (activity instanceof SMAlertActivity) {
            return CincoAnalytics.VIBRATE_SMS;
        }
        if (activity instanceof PhoneAlarmActivity) {
            return CincoAnalytics.VIBRATE_PHONE_CLOCK;
        }
        if (activity instanceof DisconnectRemindActivity) {
            return "Disconnect";
        }
        if (activity instanceof LongSitAlertActivity) {
            return "SittingRemind";
        }
        if (activity instanceof ReachGoalRemindActivity) {
            return "GoalsRemind";
        }
        if (activity instanceof MiBandAlarmActivity) {
            return "BandClock";
        }
        if (activity instanceof EventRemindActivity) {
            return CincoAnalytics.VIBRATE_EVENT_REMIND;
        }
        return null;
    }
}
