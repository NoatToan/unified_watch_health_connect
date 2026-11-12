package com.huami.watch.companion.notification;

import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteController;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import androidx.annotation.RequiresApi;
import com.huami.device.feature.notification.module.IMusicRemoteControl;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.companion.mediac.CommandHandler;
import com.huami.watch.companion.mediac.MediaInfo;
import com.huami.watch.companion.mediac.MusicAction;
import com.huami.watch.companion.mediac.MusicClientInterface;
import com.huami.watch.companion.sync.ble.SyncBleNotificationHelper;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;

/* JADX INFO: loaded from: classes16.dex */
@RequiresApi(api = 19)
public class CompanionMusicControl implements IMusicRemoteControl {
    private static final String f = "Noti-Companion-Music";
    private Context a;
    private SyncBleNotificationHelper b = SyncBleNotificationHelper.getHelper();
    private RemoteController c;
    private RemoteController.OnClientUpdateListener d;
    private MusicClientInterface e;

    public class a implements MusicClientInterface.MusicStateListener {
        public a() {
        }

        @Override // com.huami.watch.companion.mediac.MusicClientInterface.MusicStateListener
        public void onActionChanged(MusicAction musicAction) {
            Log.d(CompanionMusicControl.f, "On MusicControl Action Changed: " + musicAction, new Object[0]);
            Context context = CompanionMusicControl.this.a;
            if (!DeviceManager.getManager(context).isCurrentDeviceBLE()) {
                CommandHandler.getInstance(context).sendAction(musicAction);
                return;
            }
            HMMusicControl hMMusicControl = null;
            if (Command.PLAYER_GONE.equals(musicAction.actionDesc)) {
                hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
                hMMusicControl.setException(HMMusicControl.AppException.APP_KILL);
            }
            if (hMMusicControl != null) {
                hMMusicControl.setTitle("");
                CompanionMusicControl.this.b.syncMusicControlStateToWatch(hMMusicControl);
            }
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004e  */
        @Override // com.huami.watch.companion.mediac.MusicClientInterface.MusicStateListener
        public void onStateChanged(MediaInfo mediaInfo) {
            int i = 0;
            Log.d(CompanionMusicControl.f, "On MusicControl State Changed: " + mediaInfo, new Object[0]);
            Context context = CompanionMusicControl.this.a;
            if (!DeviceManager.getManager(context).isCurrentDeviceBLE()) {
                CommandHandler.getInstance(context).syncStateToWatch(mediaInfo);
                return;
            }
            HMMusicControl hMMusicControl = null;
            int iIntValue = mediaInfo.state.intValue();
            if (iIntValue == 1 || iIntValue == 2) {
                hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            } else if (iIntValue == 3) {
                hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PLAY);
            } else if (iIntValue == 8) {
                hMMusicControl = new HMMusicControl(HMMusicControl.PhoneState.PAUSE);
            }
            try {
                i = (int) ((mediaInfo.currVol / mediaInfo.maxVol) * 100.0f);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (hMMusicControl != null) {
                hMMusicControl.setTitle(mediaInfo.title);
                hMMusicControl.setArtist(mediaInfo.artist);
                hMMusicControl.setAlbum(mediaInfo.album);
                hMMusicControl.setVolume(i);
                CompanionMusicControl.this.b.syncMusicControlStateToWatch(hMMusicControl);
            }
        }
    }

    public CompanionMusicControl(Context context) {
        this.a = context;
    }

    private void d() {
        if (this.c != null) {
            try {
                ((AudioManager) this.a.getSystemService("audio")).unregisterRemoteController(this.c);
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.c = null;
        }
        this.d = null;
    }

    public void c(RemoteController.OnClientUpdateListener onClientUpdateListener) {
        this.d = onClientUpdateListener;
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onClientChange(boolean z) {
        MusicClientInterface.getInstance(this.a).onClientChange(z);
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        MusicClientInterface.getInstance(this.a).onClientMetadataUpdate(metadataEditor);
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onClientPlaybackStateUpdate(int i) {
        MusicClientInterface.getInstance(this.a).onClientPlaybackStateUpdate(i);
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onClientTransportControlUpdate(int i) {
        MusicClientInterface.getInstance(this.a).onClientTransportControlUpdate(i);
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onDeInit() {
        d();
        MusicClientInterface musicClientInterface = this.e;
        if (musicClientInterface != null) {
            musicClientInterface.doCleanUp();
            this.e = null;
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onInit() {
        if (this.e == null) {
            MusicClientInterface musicClientInterface = MusicClientInterface.getInstance(this.a);
            this.e = musicClientInterface;
            musicClientInterface.setStateListener(new a());
            RemoteController.OnClientUpdateListener onClientUpdateListener = this.d;
            if (onClientUpdateListener == null) {
                Log.w(f, "Music RemoteController Listener is Null!!", new Object[0]);
            } else {
                registerRemoteController(onClientUpdateListener);
                this.e.bindService(this.c);
            }
        }
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onMusicControlReceived(byte b) {
        MusicClientInterface musicClientInterface = this.e;
        if (musicClientInterface != null) {
            musicClientInterface.handleBLECommand(b);
        }
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onNotificationPosted(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.e.onNotificationPosted(statusBarNotification);
    }

    @Override // com.huami.device.feature.notification.module.INotificationListener
    public void onNotificationRemoved(StatusBarNotification statusBarNotification, NotificationListenerService.RankingMap rankingMap) {
        this.e.onNotificationRemoved(statusBarNotification);
    }

    public void registerRemoteController(RemoteController.OnClientUpdateListener onClientUpdateListener) {
        boolean zRegisterRemoteController;
        this.c = new RemoteController(this.a, onClientUpdateListener);
        try {
            zRegisterRemoteController = ((AudioManager) this.a.getSystemService("audio")).registerRemoteController(this.c);
        } catch (NullPointerException unused) {
            zRegisterRemoteController = false;
        }
        if (zRegisterRemoteController) {
            try {
                this.c.setArtworkConfiguration(100, 100);
                this.c.setSynchronizationMode(1);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
        Log.i(WebConstant.QueryParam.TYPE_MUSIC, "register result rcc : " + zRegisterRemoteController, new Object[0]);
    }

    @Override // com.huami.device.feature.notification.module.IMusicRemoteControl
    public void onClientPlaybackStateUpdate(int i, long j, long j2, float f2) {
        MusicClientInterface.getInstance(this.a).onClientPlaybackStateUpdate(i, j, j2, f2);
    }
}
