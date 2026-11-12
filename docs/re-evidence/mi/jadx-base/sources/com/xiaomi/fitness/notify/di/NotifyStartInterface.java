package com.xiaomi.fitness.notify.di;

import com.xiaomi.fitness.notify.BaseNotifySyncService;
import com.xiaomi.fitness.notify.DeviceNotificationSettingManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/notify/di/NotifyStartInterface;", "", "toggleNotificationListenerService", "", "provideNotificationService", "Ljava/lang/Class;", "Lcom/xiaomi/fitness/notify/BaseNotifySyncService;", "provideDeviceNotificationSettingManager", "Lcom/xiaomi/fitness/notify/DeviceNotificationSettingManager;", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NotifyStartInterface {
    @Nullable
    DeviceNotificationSettingManager provideDeviceNotificationSettingManager();

    @NotNull
    Class<? extends BaseNotifySyncService> provideNotificationService();

    void toggleNotificationListenerService();
}
