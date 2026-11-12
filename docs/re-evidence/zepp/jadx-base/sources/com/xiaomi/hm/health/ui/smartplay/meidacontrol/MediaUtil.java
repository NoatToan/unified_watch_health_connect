package com.xiaomi.hm.health.ui.smartplay.meidacontrol;

import android.content.Context;
import android.media.AudioManager;
import android.service.notification.NotificationListenerService;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.utils.AppUtil;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.ui.smartplay.NotificationAccessService;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtil;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public class MediaUtil {
    private static final String a = "MediaUtil";
    private static final int b = 100;
    private static final int c = -1;

    public class a implements MusicControllerModule.IMusicModuleDelegate {
        public final /* synthetic */ Context a;

        public a(final Context val$context) {
            this.a = val$context;
        }

        @Override // com.huami.musiccontrol.MusicControllerModule.IMusicModuleDelegate
        @NotNull
        public <S extends NotificationListenerService> Class<S> getServiceClass() {
            return NotificationAccessService.class;
        }

        @Override // com.huami.musiccontrol.MusicControllerModule.IMusicModuleDelegate
        public boolean hasPermission() {
            return AppUtil.INSTANCE.isNotificationAccessEnabled(this.a);
        }

        @Override // com.huami.musiccontrol.MusicControllerModule.IMusicModuleDelegate
        public void tryToStartService() {
            if (AppUtil.INSTANCE.isNotificationAccessEnabled(this.a)) {
                NotificationManager.getInstance().restartNotificationListenerService(this.a);
            } else {
                HMLog.i(MediaUtil.a, "try to start service failed as notification access not enable", new Object[0]);
            }
        }
    }

    @Deprecated
    public static int b() {
        AudioManager audioManager = (AudioManager) BraceletApp.getContext().getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        if (streamMaxVolume <= 0) {
            return -1;
        }
        return Math.min((streamVolume * 100) / streamMaxVolume, 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c(boolean z) {
        return "init music module and needInit: " + z;
    }

    public static void deInitMedia() {
        MusicControllerModule.INSTANCE.getInstance().deInit();
    }

    public static void handleDeviceCommand(HMLFEvent event) {
        byte[] extra = event.getExtra();
        HMLog.i("HMDeviceMusicView", "judge handle music command: " + GattUtils.bytesToHexString(extra), new Object[0]);
        if (extra == null || extra.length != 1) {
            return;
        }
        HMMusicControl.DeviceCommand deviceCommandFrom = HMMusicControl.DeviceCommand.from(extra[0]);
        HMDeviceMusicView hMDeviceMusicView = (HMDeviceMusicView) MusicControllerModule.INSTANCE.getInstance().getDeviceMusicView();
        if (hMDeviceMusicView != null) {
            hMDeviceMusicView.handleCommand(deviceCommandFrom);
        } else {
            HMLog.i("HMDeviceMusicView", "handle command failed as music view is null", new Object[0]);
        }
    }

    public static void initMedia(Context context) {
        MusicControllerModule.Companion companion = MusicControllerModule.INSTANCE;
        final boolean zNeedInit = companion.getInstance().needInit();
        HMLog.info(a, new Function0() { // from class: hy4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MediaUtil.c(zNeedInit);
            }
        });
        if (!zNeedInit) {
            handleDeviceCommand(HMMusicControl.DeviceCommand.STOP);
        } else {
            companion.getInstance().init(context, new a(context));
            companion.getInstance().setDeviceMusicView(new HMDeviceMusicView());
        }
    }

    public static boolean shouldInitMusic() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        if (hMDeviceManager != null) {
            return HMDeviceConfig.supportMusicControl(hMDeviceManager.getBoundDeviceSource(HMDeviceType.MILI));
        }
        return false;
    }

    @Deprecated
    public static boolean useMediaSession() {
        return true;
    }

    public static void handleDeviceCommand(HMMusicControl.DeviceCommand command) {
        HMDeviceMusicView hMDeviceMusicView = (HMDeviceMusicView) MusicControllerModule.INSTANCE.getInstance().getDeviceMusicView();
        if (hMDeviceMusicView != null) {
            hMDeviceMusicView.handleCommand(command);
            return;
        }
        HMLog.i("HMDeviceMusicView", "handleDeviceCommand failed as music view is null and command is: " + command, new Object[0]);
    }
}
