package com.xiaomi.hm.health.devicex.proxy.other;

import android.app.Notification;
import android.app.PendingIntent;
import com.huami.devicex.injection.AppNotificationApi;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode;
import com.xiaomi.hm.health.notification.AppNotification;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J8\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/devicex/proxy/other/AppNotificationImpl;", "Lcom/huami/devicex/injection/AppNotificationApi;", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "deviceInfo", "", "showFwUpgradeFinish", "", "title", "content", "", "icon", "", "autoCancel", "Landroid/app/PendingIntent;", "intent", "Landroid/app/Notification;", "createNotification", "Lcom/xiaomi/hm/health/device/service/residentnoti/notify/NotificationMode;", "mode", "coreServiceStatus", "keepLive", "createForegroundNotification", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "showFindPhoneNotification", "cancelFindPhoneNotification", "showSBENotification", "cancelSBENotification", "isBackgroundPermission", "showGpsNoPermission", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AppNotificationImpl implements AppNotificationApi {
    @Override // com.huami.devicex.injection.AppNotificationApi
    public void cancelFindPhoneNotification() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    public void cancelSBENotification() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    @Nullable
    public Notification createForegroundNotification(@Nullable NotificationMode mode, @NotNull String coreServiceStatus, int keepLive) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    @Nullable
    public Notification createNotification(@Nullable String title, @Nullable String content, int icon, boolean autoCancel, @Nullable PendingIntent intent) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    public void showFindPhoneNotification(@NotNull HMDeviceSource source) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    public void showFwUpgradeFinish(@NotNull DeviceInfo deviceInfo) {
        AppNotification.showFwUpgradeFinish(deviceInfo);
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    public void showGpsNoPermission(boolean isBackgroundPermission) {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "未实现 @桂索"));
    }

    @Override // com.huami.devicex.injection.AppNotificationApi
    public void showSBENotification() {
        throw new NotImplementedError(Intrinsics.stringPlus("An operation is not implemented: ", "Not yet implemented"));
    }
}
