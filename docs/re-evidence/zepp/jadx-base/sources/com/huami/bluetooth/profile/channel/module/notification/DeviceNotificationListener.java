package com.huami.bluetooth.profile.channel.module.notification;

import com.huami.bluetooth.profile.channel.module.notification.entity.LogoRequest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\b\u0010\n\u001a\u00020\u0004H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/DeviceNotificationListener;", "", "", "uniqueId", "", "onDeleted", "", "content", "onReplied", "onHangup", "onMute", "Lcom/huami/bluetooth/profile/channel/module/notification/entity/LogoRequest;", "request", "onRequestLogo", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface DeviceNotificationListener {
    void onDeleted(int uniqueId);

    void onHangup();

    void onMute();

    void onReplied(int uniqueId, @NotNull String content);

    void onRequestLogo(@NotNull LogoRequest request);
}
