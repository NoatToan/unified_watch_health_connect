package com.xiaomi.hm.health.device.setting.life.impl;

import com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener;
import com.huami.bluetooth.profile.channel.module.notification.entity.AppReplyResult;
import com.huami.bluetooth.profile.channel.module.notification.entity.LogoRequest;
import com.huami.device.feature.notification.appnotify.BusinessProcessing;
import com.huami.device.feature.notification.appnotify.LinkageNotificationCenter;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.notification.TransferAppLogo;
import com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle;
import com.xiaomi.hm.health.utils.HMPhoneUtil;
import com.xiaomi.hm.health.utils.TelephonyUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/impl/NotificationDeviceLifeCycle;", "Lcom/xiaomi/hm/health/device/setting/life/DeviceLifeCycle;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "a", "onDeviceBind", "onDeviceUnBind", "onBoundedDeviceConnected", "", "deviceId", "onBoundedDeviceDisconnect", "Lcom/xiaomi/hm/health/databases/model/Device;", "", "status", "onDeviceStatusChange", "enable", WatchFaceApi.CUSTOMIZABLE_DISABLE, "Ljava/lang/String;", "tag", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NotificationDeviceLifeCycle implements DeviceLifeCycle {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "NotificationDeviceLifeCycle";

    private final void a(final HMBaseDevice device) {
        HMMiLiProDevice hMMiLiProDevice = device instanceof HMMiLiProDevice ? (HMMiLiProDevice) device : null;
        if (hMMiLiProDevice == null) {
            return;
        }
        hMMiLiProDevice.setDeviceNotificationListener(new DeviceNotificationListener() { // from class: com.xiaomi.hm.health.device.setting.life.impl.NotificationDeviceLifeCycle$registerNotificationDeviceListener$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(int i) {
                    super(0);
                    this.a = i;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "delete uniqueId " + this.a;
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function0<String> {
                public final /* synthetic */ int a;
                public final /* synthetic */ String b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(int i, String str) {
                    super(0);
                    this.a = i;
                    this.b = str;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "reply from device: uniqueId " + this.a + " content:" + this.b;
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener
            public void onDeleted(int uniqueId) {
                HMLog.debug(this.a.tag, new a(uniqueId));
                LinkageNotificationCenter.deleteAlertOnPhone(uniqueId);
            }

            @Override // com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener
            public void onHangup() {
                HMPhoneUtil.endCall(DeviceXFunctionsKt.getContext());
            }

            @Override // com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener
            public void onMute() {
                TelephonyUtil.INSTANCE.mute(true);
            }

            @Override // com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener
            public void onReplied(int uniqueId, @NotNull String content) {
                HMLog.info(this.a.tag, new b(uniqueId, content));
                boolean zReplyToApp = BusinessProcessing.INSTANCE.replyToApp(DeviceXFunctionsKt.getContext(), uniqueId, content);
                HMMiLiProDevice hMMiLiProDevice2 = (HMMiLiProDevice) device;
                AppReplyResult appReplyResult = new AppReplyResult(uniqueId, zReplyToApp);
                final NotificationDeviceLifeCycle notificationDeviceLifeCycle = this.a;
                hMMiLiProDevice2.setAppReplyResult(appReplyResult, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.setting.life.impl.NotificationDeviceLifeCycle$registerNotificationDeviceListener$1$onReplied$2

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public final /* synthetic */ boolean a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public a(boolean z) {
                            super(0);
                            this.a = z;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final String getA() {
                            return "reply to device: " + this.a;
                        }
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                        onFinish(bool.booleanValue());
                    }

                    @Override // com.xiaomi.hm.health.bt.device.HMCallback
                    public void onFinish(boolean result) {
                        HMLog.info(notificationDeviceLifeCycle.tag, new a(result));
                    }
                });
            }

            @Override // com.huami.bluetooth.profile.channel.module.notification.DeviceNotificationListener
            public void onRequestLogo(@NotNull LogoRequest request) {
                TransferAppLogo.INSTANCE.handleLogoRequest(DeviceXFunctionsKt.getContext(), (HMMiLiProDevice) device, request);
            }
        });
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void disable(@NotNull HMBaseDevice device) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceVisibility
    public void enable(@NotNull HMBaseDevice device) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceConnected(@NotNull HMBaseDevice device) {
        a(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onBoundedDeviceDisconnect(@NotNull String deviceId) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceBind(@NotNull HMBaseDevice device) {
        a(device);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceStatusChange(@Nullable Device device, int status) {
    }

    @Override // com.xiaomi.hm.health.device.setting.life.DeviceLifeCycle
    public void onDeviceUnBind(@NotNull HMBaseDevice device) {
    }
}
