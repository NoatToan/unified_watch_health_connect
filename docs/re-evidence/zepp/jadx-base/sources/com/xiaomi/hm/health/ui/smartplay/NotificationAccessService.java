package com.xiaomi.hm.health.ui.smartplay;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.media.RemoteController;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.huami.device.feature.notification.appnotify.BaseNotificationListenerService;
import com.huami.device.feature.notification.appnotify.LinkageNotificationCenter;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.device.feature.notification.statistics.NotificationStatisticsKt;
import com.huami.musiccontrol.MusicControllerModule;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.notification.CompanionMusicControl;
import com.huami.watch.companion.notification.CompanionNotificationListener;
import com.xiaomi.hm.health.ui.smartplay.meidacontrol.MediaUtil;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@RequiresApi(19)
public class NotificationAccessService extends BaseNotificationListenerService implements RemoteController.OnClientUpdateListener {
    private static final String f = "NotificationAccessService";
    private RemoteController b;
    private CompanionNotificationListener c;
    private RemoteController.OnClientUpdateListener d;
    private MusicControllerModule.IMusicListenerService e = new a();

    public class a implements MusicControllerModule.IMusicListenerService {
        public a() {
        }

        @Override // com.huami.musiccontrol.MusicControllerModule.IMusicListenerService
        @Nullable
        public NotificationListenerService getService() {
            return NotificationAccessService.this;
        }

        @Override // com.huami.musiccontrol.MusicControllerModule.IMusicListenerService
        public void setClientUpdateListener(@NotNull RemoteController.OnClientUpdateListener onClientUpdateListener) {
            NotificationAccessService.this.d = onClientUpdateListener;
        }
    }

    private void b() {
        MusicControllerModule.INSTANCE.getInstance().bindToService(this.e);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean clearing) {
        CompanionMusicControl companionMusicControl;
        HMLog.d(f, "onClientChange, clearing: " + clearing, new Object[0]);
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null && (companionMusicControl = companionNotificationListener.mMusicControl) != null) {
            companionMusicControl.onClientChange(clearing);
        }
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientChange(clearing);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        CompanionMusicControl companionMusicControl;
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null && (companionMusicControl = companionNotificationListener.mMusicControl) != null) {
            companionMusicControl.onClientMetadataUpdate(metadataEditor);
        }
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientMetadataUpdate(metadataEditor);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state) {
        CompanionMusicControl companionMusicControl;
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null && (companionMusicControl = companionNotificationListener.mMusicControl) != null) {
            companionMusicControl.onClientPlaybackStateUpdate(state);
        }
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientPlaybackStateUpdate(state);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int transportControlFlags) {
        CompanionMusicControl companionMusicControl;
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null && (companionMusicControl = companionNotificationListener.mMusicControl) != null) {
            companionMusicControl.onClientTransportControlUpdate(transportControlFlags);
        }
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientTransportControlUpdate(transportControlFlags);
        }
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.app.Service
    public void onCreate() {
        super.onCreate();
        if (MediaUtil.shouldInitMusic() && !MediaUtil.useMediaSession()) {
            registerRemoteController();
        }
        b();
        CompanionNotificationListener companionNotificationListener = new CompanionNotificationListener(this);
        this.c = companionNotificationListener;
        companionNotificationListener.setMusicRemoteControllerListener(this);
        this.c.onInit();
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.service.notification.NotificationListenerService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null) {
            companionNotificationListener.onDeInit();
            this.c = null;
        }
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        if (LinkageNotificationCenter.supportLinkageNotification()) {
            try {
                LinkageNotificationCenter.INSTANCE.initIdKeyMap(getActiveNotifications());
            } catch (SecurityException e) {
                HMLog.error(new Function0() { // from class: xf5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.getLocalizedMessage();
                    }
                });
            }
        }
        HMLog.i(f, "mifit 2 Notify Listener Connected!!", new Object[0]);
        NotificationStatisticsKt.recordEvent(NotificationEvent.SERVICE_CONNECTED, getPackageName());
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        HMLog.i(f, "onListenerDisconnected() invoke. NotificationAccessService is disconnected!!!", new Object[0]);
        NotificationStatisticsKt.recordEvent(NotificationEvent.SERVICE_DISCONNECTED, getPackageName());
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification sbn, NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationPosted(sbn, rankingMap);
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null) {
            companionNotificationListener.onNotificationPosted(sbn, rankingMap);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
    }

    @Override // com.huami.device.feature.notification.appnotify.BaseNotificationListenerService, android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification sbn, NotificationListenerService.RankingMap rankingMap) {
        super.onNotificationRemoved(sbn, rankingMap);
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null) {
            companionNotificationListener.onNotificationRemoved(sbn, rankingMap);
        }
    }

    @TargetApi(19)
    public void registerRemoteController() {
        boolean zRegisterRemoteController;
        this.b = new RemoteController(this, this);
        try {
            AudioManager audioManager = (AudioManager) getSystemService("audio");
            if (audioManager == null) {
                return;
            } else {
                zRegisterRemoteController = audioManager.registerRemoteController(this.b);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
            zRegisterRemoteController = false;
        }
        if (zRegisterRemoteController) {
            try {
                this.b.setArtworkConfiguration(100, 100);
                this.b.setSynchronizationMode(1);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
            }
        }
        HMLog.d(f, "registered: " + zRegisterRemoteController, new Object[0]);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int state, long stateChangeTimeMs, long currentPosMs, float speed) {
        CompanionMusicControl companionMusicControl;
        CompanionNotificationListener companionNotificationListener = this.c;
        if (companionNotificationListener != null && (companionMusicControl = companionNotificationListener.mMusicControl) != null) {
            companionMusicControl.onClientPlaybackStateUpdate(state, stateChangeTimeMs, currentPosMs, speed);
        }
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientPlaybackStateUpdate(state, stateChangeTimeMs, currentPosMs, speed);
        }
    }
}
