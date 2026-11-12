package com.xiaomi.hm.health.bt.profile.alert;

import com.huami.bluetooth.profile.channel.module.notification.NotificationApi;
import com.huami.bluetooth.profile.channel.module.notification.NotificationModule;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/alert/NotificationControllerFactory;", "", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "baseProfile", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "create", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationControllerFactory {

    @NotNull
    public static final NotificationControllerFactory INSTANCE = new NotificationControllerFactory();

    private NotificationControllerFactory() {
    }

    @Nullable
    public final NotificationApi create(@NotNull BaseProfile baseProfile) {
        NotificationModule notificationModule;
        if (!baseProfile.supportModule(NotificationModule.class) || (notificationModule = (NotificationModule) baseProfile.getChannelModule(NotificationModule.class)) == null) {
            return null;
        }
        return notificationModule.loadApi();
    }
}
