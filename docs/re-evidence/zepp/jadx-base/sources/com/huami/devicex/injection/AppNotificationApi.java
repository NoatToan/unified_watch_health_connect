package com.huami.devicex.injection;

import android.app.Notification;
import android.app.PendingIntent;
import androidx.annotation.DrawableRes;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J:\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&J$\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0019\u001a\u00020\u0004H&J\b\u0010\u001a\u001a\u00020\u0004H&J\b\u0010\u001b\u001a\u00020\u0004H&J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bH&¨\u0006\u001e"}, d2 = {"Lcom/huami/devicex/injection/AppNotificationApi;", "", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "showFwUpgradeFinish", "", "title", "content", "", "icon", "", "autoCancel", "Landroid/app/PendingIntent;", "intent", "Landroid/app/Notification;", "createNotification", "Lcom/xiaomi/hm/health/device/service/residentnoti/notify/NotificationMode;", "mode", "coreServiceStatus", "keepLive", "createForegroundNotification", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "showFindPhoneNotification", "cancelFindPhoneNotification", "showSBENotification", "cancelSBENotification", "isBackgroundPermission", "showGpsNoPermission", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AppNotificationApi {
    void cancelFindPhoneNotification();

    void cancelSBENotification();

    @Nullable
    Notification createForegroundNotification(@Nullable NotificationMode mode, @NotNull String coreServiceStatus, int keepLive);

    @Nullable
    Notification createNotification(@Nullable String title, @Nullable String content, @DrawableRes int icon, boolean autoCancel, @Nullable PendingIntent intent);

    void showFindPhoneNotification(@NotNull HMDeviceSource source);

    void showFwUpgradeFinish(@NotNull DeviceInfo deviceInfo);

    void showGpsNoPermission(boolean isBackgroundPermission);

    void showSBENotification();
}
