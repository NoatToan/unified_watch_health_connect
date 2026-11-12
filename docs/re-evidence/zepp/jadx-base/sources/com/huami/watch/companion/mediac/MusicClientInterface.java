package com.huami.watch.companion.mediac;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioManager;
import android.media.RemoteController;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes16.dex */
@TargetApi(19)
public class MusicClientInterface implements RemoteController.OnClientUpdateListener {
    private static final String i = "music";
    private static MusicClientInterface j;
    private static HandlerThread k;
    private static Handler l;
    private Context a;
    private RemoteMediaStateListener b;
    private NotificationListenerService c;
    private MusicStateListener d;
    private MediaInfo g;
    public boolean e = false;
    public RemoteController.OnClientUpdateListener f = new a();
    private Runnable h = new b();

    public interface MusicStateListener {
        void onActionChanged(MusicAction musicAction);

        void onStateChanged(MediaInfo mediaInfo);
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MusicClientInterface.this.g == null) {
                return;
            }
            AudioManager audioManager = (AudioManager) MusicClientInterface.this.a.getSystemService("audio");
            if (!audioManager.isMusicActive() && MusicClientInterface.this.g.playerHasGone.intValue() != 0) {
                Log.e("music", "Blocked SyncStateToWatch ...Music is not active", new Object[0]);
                return;
            }
            MusicClientInterface.this.g.currVol = audioManager.getStreamVolume(3);
            MusicClientInterface.this.g.maxVol = audioManager.getStreamMaxVolume(3);
            MusicClientInterface.this.g.mediaPlayerName = MusicClientInterface.this.b == null ? "" : MusicClientInterface.this.b.getCurrPlayerName(MusicClientInterface.this.a);
            if (MusicClientInterface.this.d != null) {
                MusicClientInterface.this.d.onStateChanged(MusicClientInterface.this.g);
            }
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("media-state-console");
        k = handlerThread;
        handlerThread.start();
        l = new Handler(k.getLooper());
    }

    private MusicClientInterface(Context context) {
        this.a = context;
        f();
        this.g.playerHasGone = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.g == null) {
            this.g = new MediaInfo();
        }
    }

    public static MusicClientInterface getInstance(Context context) {
        if (j == null) {
            synchronized (MusicClientInterface.class) {
                if (j == null) {
                    j = new MusicClientInterface(context);
                }
            }
            CommandHandler.getInstance(context);
        }
        return j;
    }

    public void bindNotiService(NotificationListenerService notificationListenerService) {
        this.c = notificationListenerService;
    }

    public MusicClientInterface bindService(RemoteController remoteController) {
        RemoteMediaStateListener remoteMediaStateListener = new RemoteMediaStateListener(remoteController);
        this.b = remoteMediaStateListener;
        remoteMediaStateListener.setClientUpdateListener(this.f);
        this.b.e(this.d);
        return this;
    }

    public void doCleanUp() {
        this.d = null;
        RemoteMediaStateListener remoteMediaStateListener = this.b;
        if (remoteMediaStateListener != null) {
            remoteMediaStateListener.e(null);
        }
    }

    public void drawTheBow() {
        f();
        l.removeCallbacks(this.h);
        l.postDelayed(this.h, 500L);
    }

    public MediaInfo getTheJustCurrMediaInfo() {
        f();
        return this.g;
    }

    public Handler getWorkHandler() {
        return l;
    }

    public void handleBLECommand(byte b2) {
        CommandHandler commandHandler = CommandHandler.getInstance(this.a);
        if (b2 == 0) {
            Log.d("music", "Handle MusicControl [Play]", new Object[0]);
            commandHandler.f();
            return;
        }
        if (b2 == 1) {
            Log.d("music", "Handle MusicControl [Pause]", new Object[0]);
            commandHandler.d();
            return;
        }
        if (b2 == 3) {
            Log.d("music", "Handle MusicControl [Next]", new Object[0]);
            commandHandler.g();
            return;
        }
        if (b2 == 4) {
            Log.d("music", "Handle MusicControl [Prev]", new Object[0]);
            commandHandler.h();
        } else if (b2 == 5) {
            Log.d("music", "Handle MusicControl [VolUp]", new Object[0]);
            commandHandler.j(true);
        } else {
            if (b2 != 6) {
                return;
            }
            Log.d("music", "Handle MusicControl [VolDown]", new Object[0]);
            commandHandler.j(false);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean z) {
        this.f.onClientChange(z);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        this.f.onClientMetadataUpdate(metadataEditor);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i2) {
        this.f.onClientPlaybackStateUpdate(i2);
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int i2) {
        this.f.onClientTransportControlUpdate(i2);
    }

    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        RemoteMediaStateListener remoteMediaStateListener = this.b;
        if (remoteMediaStateListener != null) {
            remoteMediaStateListener.onNotificationPosted(this.a, statusBarNotification);
        }
    }

    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        RemoteMediaStateListener remoteMediaStateListener = this.b;
        if (remoteMediaStateListener != null) {
            remoteMediaStateListener.onNotificationRemoved(this.a, statusBarNotification);
        }
    }

    public void sendMusicKeyEvent(int i2) {
        RemoteMediaStateListener remoteMediaStateListener = this.b;
        if (remoteMediaStateListener != null) {
            remoteMediaStateListener.sendMusicKeyEvent(this.c, i2);
        }
    }

    public void setStateListener(MusicStateListener musicStateListener) {
        this.d = musicStateListener;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i2, long j2, long j3, float f) {
        this.f.onClientPlaybackStateUpdate(i2, j2, j3, f);
    }

    public class a implements RemoteController.OnClientUpdateListener {
        public a() {
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientChange(boolean z) {
            MusicClientInterface.this.f();
            Log.e("music", "onClientChange()... " + z, new Object[0]);
            MusicClientInterface musicClientInterface = MusicClientInterface.this;
            if (musicClientInterface.e) {
                musicClientInterface.g.state = 3;
                MusicClientInterface.this.e = false;
            } else if (z) {
                musicClientInterface.g.state = -1;
            }
            MusicClientInterface.this.drawTheBow();
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
            MusicClientInterface.this.e = true;
            String string = metadataEditor.getString(2, "null");
            String string2 = metadataEditor.getString(1, "null");
            String string3 = metadataEditor.getString(7, "null");
            Long lValueOf = Long.valueOf(metadataEditor.getLong(9, -1L));
            MusicClientInterface.this.f();
            MusicClientInterface.this.g.artist = string;
            MusicClientInterface.this.g.album = string2;
            MusicClientInterface.this.g.title = string3;
            MusicClientInterface.this.g.duration = lValueOf;
            MusicClientInterface.this.drawTheBow();
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientPlaybackStateUpdate(int i) {
            Log.e("music", "onClientPlaybackStateUpdate()... " + i, new Object[0]);
            MusicClientInterface.this.f();
            MusicClientInterface.this.g.state = Integer.valueOf(i);
            MusicClientInterface.this.drawTheBow();
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientTransportControlUpdate(int i) {
            Log.e("music", "onClientTransportControlUpdate()...", new Object[0]);
        }

        @Override // android.media.RemoteController.OnClientUpdateListener
        public void onClientPlaybackStateUpdate(int i, long j, long j2, float f) {
            long jCurrentTimeMillis = (System.currentTimeMillis() + j) - SystemClock.elapsedRealtime();
            Log.e("music", "onClientPlaybackStateUpdate()... state:" + i + ", stateChangeTimeMs:" + jCurrentTimeMillis + ", pos:" + j2 + " , speed:" + f, new Object[0]);
            MusicClientInterface.this.f();
            MusicClientInterface.this.g.pos = Long.valueOf(j2);
            MusicClientInterface.this.g.state = Integer.valueOf(i);
            MusicClientInterface.this.g.stateChangeTimeMs = Long.valueOf(jCurrentTimeMillis);
            MusicClientInterface.this.g.speed = f;
            MusicClientInterface.this.drawTheBow();
        }
    }
}
