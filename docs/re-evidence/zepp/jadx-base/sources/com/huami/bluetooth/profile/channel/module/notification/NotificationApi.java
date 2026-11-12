package com.huami.bluetooth.profile.channel.module.notification;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.xiaomi.hm.health.bt.profile.alert.NotificationInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 30)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J$\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&R\u0016\u0010\u000f\u001a\u00020\f8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi;", "", "Lcom/xiaomi/hm/health/bt/profile/alert/NotificationInfo;", "info", "Lkotlin/Function1;", "", "", "action", "notify", "Lcom/huami/bluetooth/profile/channel/module/notification/DeviceNotificationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setDeviceNotificationListener", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "version", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface NotificationApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int VERSION_1 = 1;
    public static final int VERSION_2 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/NotificationApi$Companion;", "", "", "VERSION_1", LogUtil.I, "VERSION_2", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final int VERSION_1 = 1;
        public static final int VERSION_2 = 2;
        public static final /* synthetic */ Companion a = new Companion();

        private Companion() {
        }
    }

    @NotNull
    NotificationVersion getVersion();

    void notify(@NotNull NotificationInfo info, @NotNull Function1<? super Boolean, Unit> action);

    void setDeviceNotificationListener(@NotNull DeviceNotificationListener listener);
}
