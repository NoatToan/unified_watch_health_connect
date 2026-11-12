package com.xiaomi.hm.health.ui.smartplay;

import com.google.gson.Gson;
import com.huami.device.feature.notification.data.AppsNotificationInfo;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.webapi.HMAccountWebExtAPI;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/NotificationHelper;", "", "Lcom/xiaomi/hm/health/model/account/HMMiliConfig;", "config", "", "a", "isNotificationOn", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NotificationHelper {

    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    private NotificationHelper() {
    }

    private final boolean a(HMMiliConfig config) {
        AppsNotificationInfo appsNotificationInfo = (AppsNotificationInfo) new Gson().fromJson(config.getAndroidappNotifySettings(), AppsNotificationInfo.class);
        if (!MiuiAPI.getInstance().isSupportMiuiNotify()) {
            return (appsNotificationInfo == null ? false : appsNotificationInfo.getNotificationOn()) || config.isSmsNotifyEnabled() || config.isInComingCallEnabled();
        }
        if (appsNotificationInfo == null) {
            return false;
        }
        return appsNotificationInfo.getNotificationOn();
    }

    public final boolean isNotificationOn() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        HMMiliConfig miliConfig = hMPersonInfo.getMiliConfig();
        boolean zIsNotificationOn = miliConfig.isNotificationOn();
        if (!miliConfig.isCheckNotification()) {
            zIsNotificationOn = a(miliConfig) || zIsNotificationOn;
            miliConfig.setNotificationOn(zIsNotificationOn);
            miliConfig.setCheckNotification(true);
            hMPersonInfo.saveInfo(2);
            HMAccountWebExtAPI.updateProfile();
        }
        return zIsNotificationOn;
    }
}
