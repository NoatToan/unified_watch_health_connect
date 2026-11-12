package com.xiaomi.hm.health.device.settings.alert.state;

import android.content.Context;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppsNotificationRepo;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/state/AppNotificationState;", "Lcom/xiaomi/hm/health/device/settings/alert/state/EnableState;", "", "isEnable", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AppNotificationState extends EnableState {
    public AppNotificationState(@NotNull Context context) {
        super(context);
    }

    @Override // com.xiaomi.hm.health.device.settings.alert.state.EnableState
    public boolean isEnable() {
        return AppsNotificationRepo.isNotificationOn$default(NotificationManager.getInstance().getAppsRepo(), null, 1, null);
    }
}
