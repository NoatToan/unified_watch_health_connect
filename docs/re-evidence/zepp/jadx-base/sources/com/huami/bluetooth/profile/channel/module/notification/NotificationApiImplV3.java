package com.huami.bluetooth.profile.channel.module.notification;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV3;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiV3;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApiImplV2;", "", "supportMsgReply", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;", "module", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/notification/NotificationModule;Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class NotificationApiImplV3 extends NotificationApiImplV2 implements NotificationApiV3 {
    public NotificationApiImplV3(@NotNull NotificationModule notificationModule, @NotNull NotificationVersion notificationVersion) {
        super(notificationModule, notificationVersion);
    }

    @Override // com.huami.bluetooth.profile.channel.module.notification.NotificationApiV3
    public boolean supportMsgReply() {
        return getVersion().getSupportReply();
    }
}
