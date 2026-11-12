package com.huami.device.feature.notification.module;

import android.content.Context;
import android.content.SharedPreferences;
import android.service.notification.NotificationListenerService;
import com.huami.device.feature.notification.data.AlertDataCompat;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH&J\b\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000eH&J(\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0011j\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t`\u0013H&J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\tH&J \u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH&¨\u0006\u001d"}, d2 = {"Lcom/huami/device/feature/notification/module/INotificationModule;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "currentDevice", "", "hasFeatureLinkageNotification", "isSmsNotifyEnabled", "", "pkgName", "isFromMiPush", "Landroid/content/SharedPreferences;", "getSharedPreferences", "Ljava/lang/Class;", "Landroid/service/notification/NotificationListenerService;", "getNotificationListenerService", "Ljava/util/HashMap;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lkotlin/collections/HashMap;", "getSettingsOfActive", "type", "json", "", "saveSettings", "key", "Lcom/huami/device/feature/notification/data/AlertDataCompat;", "entity", "syncToDevice", "notification_release"}, k = 1, mv = {1, 5, 1})
public interface INotificationModule {
    @NotNull
    Context context();

    @Nullable
    HMMiLiDevice currentDevice();

    @NotNull
    Class<? extends NotificationListenerService> getNotificationListenerService();

    @NotNull
    HashMap<HMDeviceType, String> getSettingsOfActive();

    @NotNull
    SharedPreferences getSharedPreferences();

    boolean hasFeatureLinkageNotification();

    boolean isFromMiPush(@NotNull Context context, @Nullable String pkgName);

    boolean isSmsNotifyEnabled();

    void saveSettings(@NotNull HMDeviceType type, @NotNull String json);

    void syncToDevice(@NotNull HMDeviceType type, @NotNull String key, @NotNull AlertDataCompat entity);
}
