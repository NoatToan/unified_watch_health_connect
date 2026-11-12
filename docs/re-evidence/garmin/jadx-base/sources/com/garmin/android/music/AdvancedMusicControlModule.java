package com.garmin.android.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.os.Handler;
import c32.k;
import cd0.h0;
import com.garmin.android.gncs.GNCSListenerService;
import com.garmin.android.gncs.NotificationListenerServiceModule;
import com.garmin.android.gncs.SmartNotifOSServiceLifecycleCallback;
import com.google.maps.android.BuildConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class AdvancedMusicControlModule extends NotificationListenerServiceModule {
    private static final String LOG_TAG = "MC#MusicModule";
    private final AtomicReference<MediaController> activeMediaController;
    private final MediaSessionManager.OnActiveSessionsChangedListener activeSessionChangedListener;
    private final ComponentName gncsListenerServiceComponentName;
    private final MediaController.Callback mediaControllerCallback;
    private final MusicManager.OnMusicControlCommandReceivedListener musicControlCommandReceiver;
    private final AndroidVolumeChangedBroadcastReceiver volumeChangedBroadcastReceiver;

    public AdvancedMusicControlModule(GNCSListenerService gNCSListenerService, Handler handler) {
        super(gNCSListenerService, handler);
        this.volumeChangedBroadcastReceiver = new AndroidVolumeChangedBroadcastReceiver();
        this.musicControlCommandReceiver = new MusicManager.OnMusicControlCommandReceivedListener() { // from class: com.garmin.android.music.a
            @Override // com.garmin.android.music.MusicManager.OnMusicControlCommandReceivedListener
            public final void onMusicControlCommandReceived(MusicControlCommand musicControlCommand) {
                this.f50584a.lambda$new$0(musicControlCommand);
            }
        };
        AtomicReference<MediaController> atomicReference = new AtomicReference<>();
        this.activeMediaController = atomicReference;
        this.mediaControllerCallback = new MediaControllerCallback(atomicReference, this.appContext.getContentResolver());
        this.activeSessionChangedListener = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: com.garmin.android.music.b
            @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
            public final void onActiveSessionsChanged(List list) {
                this.f50585a.lambda$new$1(list);
            }
        };
        this.gncsListenerServiceComponentName = new ComponentName(this.appContext.getPackageName(), GNCSListenerService.class.getName());
    }

    private void evaluateActiveSessions() {
        this.handler.postAtFrontOfQueue(new h0(this, 12));
    }

    private void executeCommand(MusicControlCommand musicControlCommand, boolean z14) {
        if (GNCSListenerService.isServiceConnected()) {
            if (this.activeMediaController.get() == null) {
                int i14 = gt2.c.f79010a;
                gt2.b.f79005a.i(LOG_TAG).warn("executeCommand -> no active media controller, evaluating...");
                evaluateActiveSessions();
            }
            MediaController mediaController = this.activeMediaController.get();
            if ((mediaController != null && mediaController.getPlaybackState() != null) || (musicControlCommand != MusicControlCommand.TOGGLE_PLAY_PAUSE && musicControlCommand != MusicControlCommand.PLAY)) {
                this.handler.post(new MusicCommandRunner(this.appContext, musicControlCommand, mediaController));
                return;
            }
            if (z14) {
                int i15 = gt2.c.f79010a;
                gt2.b.f79005a.i(LOG_TAG).debug("executeCommand -> forbid to launch media player...");
            } else {
                int i16 = gt2.c.f79010a;
                gt2.b.f79005a.i(LOG_TAG).debug("executeCommand -> launching media player...");
                MusicPlayerUtilKt.launchMusicPlayer(this.appContext, this.activeMediaController, this.handler, new k(this, 23));
            }
        }
    }

    private static String getAppName(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return BuildConfig.TRAVIS;
        }
    }

    private static MediaSessionManager getMediaSessionManager(Context context) {
        return (MediaSessionManager) context.getSystemService("media_session");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$evaluateActiveSessions$3() {
        if (GNCSListenerService.isServiceConnected()) {
            MediaSessionManager mediaSessionManager = getMediaSessionManager(this.appContext);
            if (mediaSessionManager == null) {
                int i14 = gt2.c.f79010a;
                gt2.b.f79005a.i(LOG_TAG).warn("evaluateActiveSessions -> MediaSessionManager is null");
                return;
            }
            try {
                MediaController mediaController = this.activeMediaController.get();
                if (mediaController != null) {
                    mediaController.unregisterCallback(this.mediaControllerCallback);
                }
            } catch (Exception unused) {
            }
            try {
                List<MediaController> activeSessions = mediaSessionManager.getActiveSessions(this.gncsListenerServiceComponentName);
                if (activeSessions.isEmpty()) {
                    int i15 = gt2.c.f79010a;
                    gt2.b.f79005a.i(LOG_TAG).warn("evaluateActiveSessions -> no active media sessions");
                    this.activeMediaController.set(null);
                    MusicManager.getInstance().clear();
                } else {
                    MediaController mediaController2 = activeSessions.get(0);
                    String packageName = mediaController2.getPackageName();
                    if (MusicConfig.getInstance().notMusicPlayer(packageName)) {
                        int i16 = gt2.c.f79010a;
                        gt2.b.f79005a.i(LOG_TAG).warn("evaluateActiveSessions -> active media session (package name: '" + packageName + "') is not from a music player");
                        this.activeMediaController.set(null);
                        MusicManager.getInstance().clear();
                    } else {
                        this.activeMediaController.set(mediaController2);
                        MusicControlsSharedPrefs.setLastUsedPlayer(this.appContext, packageName);
                        MusicManager.getInstance().init(mediaController2, getAppName(this.appContext, packageName), this.appContext.getContentResolver());
                        mediaController2.registerCallback(this.mediaControllerCallback, this.handler);
                        int i17 = gt2.c.f79010a;
                        gt2.b.f79005a.i(LOG_TAG).debug("evaluateActiveSessions -> active media session: '" + packageName + "'");
                    }
                }
            } catch (Exception e4) {
                int i18 = gt2.c.f79010a;
                gt2.b.f79005a.i(LOG_TAG).warn("evaluateActiveSessions -> user may have revoked access to Android notifications", (Throwable) e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$executeCommand$2() {
        executeCommand(MusicControlCommand.PLAY, true);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$0(MusicControlCommand musicControlCommand) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(LOG_TAG).debug("musicControlCommandReceiver -> " + musicControlCommand);
        executeCommand(musicControlCommand, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$1(List list) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(LOG_TAG).debug("activeSessionChangedListener -> evaluating...");
        evaluateActiveSessions();
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    public void onListenerConnected(List<SmartNotifOSServiceLifecycleCallback> list) {
        int i14 = gt2.c.f79010a;
        gt2.b.a aVar = gt2.b.f79005a;
        aVar.i(LOG_TAG).info("onListenerConnected");
        a7.b.registerReceiver(this.appContext, this.volumeChangedBroadcastReceiver, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"), null, this.handler, 4);
        MusicManager.getInstance().registerOnMusicControlCommandReceivedListener(this.musicControlCommandReceiver);
        MediaSessionManager mediaSessionManager = getMediaSessionManager(this.appContext);
        if (mediaSessionManager == null) {
            aVar.i(LOG_TAG).info("onListenerConnected -> no media session manager");
            return;
        }
        try {
            mediaSessionManager.addOnActiveSessionsChangedListener(this.activeSessionChangedListener, this.gncsListenerServiceComponentName, this.handler);
        } catch (SecurityException e4) {
            gt2.b.f79005a.i(LOG_TAG).error("onListenerConnected", (Throwable) e4);
        }
        evaluateActiveSessions();
    }

    @Override // com.garmin.android.gncs.NotificationListenerServiceModule
    public void onListenerDisconnected(List<SmartNotifOSServiceLifecycleCallback> list) {
        int i14 = gt2.c.f79010a;
        gt2.b.f79005a.i(LOG_TAG).info("onListenerDisconnected");
        try {
            MusicManager.getInstance().unregisterOnMusicControlCommandReceivedListener(this.musicControlCommandReceiver);
        } catch (Exception unused) {
        }
        try {
            this.appContext.unregisterReceiver(this.volumeChangedBroadcastReceiver);
        } catch (Exception unused2) {
        }
        MediaController mediaController = this.activeMediaController.get();
        if (mediaController != null) {
            mediaController.unregisterCallback(this.mediaControllerCallback);
        }
        MediaSessionManager mediaSessionManager = getMediaSessionManager(this.appContext);
        if (mediaSessionManager == null) {
            gt2.b.f79005a.i(LOG_TAG).info("onListenerDisconnected -> no media session manager");
        } else {
            mediaSessionManager.removeOnActiveSessionsChangedListener(this.activeSessionChangedListener);
        }
    }
}
