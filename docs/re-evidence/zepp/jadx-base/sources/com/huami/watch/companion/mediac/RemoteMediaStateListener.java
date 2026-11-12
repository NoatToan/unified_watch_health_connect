package com.huami.watch.companion.mediac;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import android.media.RemoteController;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import com.huami.sky.lib.constant.WebConstant;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@TargetApi(19)
public class RemoteMediaStateListener implements RemoteController.OnClientUpdateListener {
    public String a = WebConstant.QueryParam.TYPE_MUSIC;
    private RemoteController.OnClientUpdateListener b;
    private String c;
    private String d;
    private MusicClientInterface.MusicStateListener e;
    public RemoteController remoteController;

    public class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ StatusBarNotification b;

        public a(Context context, StatusBarNotification statusBarNotification) {
            this.a = context;
            this.b = statusBarNotification;
        }

        @Override // java.lang.Runnable
        public void run() {
            AudioManager audioManager = (AudioManager) this.a.getSystemService("audio");
            int iIntValue = MusicClientInterface.getInstance(this.a).getTheJustCurrMediaInfo().state.intValue();
            if (audioManager.isMusicActive() || iIntValue == 2 || iIntValue == 8) {
                Log.e(RemoteMediaStateListener.this.a, "Blocked onNotificationRemoved " + this.b + "-state=" + iIntValue);
                return;
            }
            Log.e(RemoteMediaStateListener.this.a, "onNotificationRemoved... " + this.b);
            StatusBarNotification statusBarNotification = this.b;
            if (statusBarNotification == null) {
                return;
            }
            String packageName = statusBarNotification.getPackageName();
            PackageManager packageManager = this.a.getPackageManager();
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(packageName);
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 131072);
            if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
                return;
            }
            Log.e(RemoteMediaStateListener.this.a, "音乐通知移除...");
            Log.e(RemoteMediaStateListener.this.a, this.b.getPackageName());
            RemoteMediaStateListener remoteMediaStateListener = RemoteMediaStateListener.this;
            remoteMediaStateListener.d = null;
            remoteMediaStateListener.c = null;
            MusicClientInterface.getInstance(this.a).getTheJustCurrMediaInfo().playerHasGone = 1;
            if (RemoteMediaStateListener.this.e != null) {
                RemoteMediaStateListener.this.e.onActionChanged(new MusicAction(Command.PLAYER_GONE));
            }
        }
    }

    public RemoteMediaStateListener(RemoteController remoteController) {
        Log.i(WebConstant.QueryParam.TYPE_MUSIC, " oncreate RCC Service Now !");
        this.remoteController = remoteController;
    }

    private void d(Context context, KeyEvent keyEvent) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                audioManager.dispatchMediaKeyEvent(keyEvent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void doCleanUp() {
    }

    public void e(MusicClientInterface.MusicStateListener musicStateListener) {
        this.e = musicStateListener;
    }

    public String getCurrPlayerName(Context context) {
        if (context == null) {
            return "";
        }
        if (TextUtils.isEmpty(this.d)) {
            MusicAction musicAction = new MusicAction(Command.PLAYER_IN);
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setPackage(this.d);
            PackageManager packageManager = context.getPackageManager();
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
                intent.addCategory("android.intent.category.DEFAULT");
                List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent, 0);
                if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                    this.c = null;
                } else {
                    String string = listQueryIntentActivities2.get(0).loadLabel(packageManager).toString();
                    musicAction.playerName = string;
                    this.c = string;
                }
            } else {
                String string2 = listQueryIntentActivities.get(0).loadLabel(packageManager).toString();
                musicAction.playerName = string2;
                this.c = string2;
            }
        }
        return this.c;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientChange(boolean z) {
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.b;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientChange(z);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientMetadataUpdate(RemoteController.MetadataEditor metadataEditor) {
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.b;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientMetadataUpdate(metadataEditor);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i) {
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.b;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientPlaybackStateUpdate(i);
        }
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientTransportControlUpdate(int i) {
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.b;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientTransportControlUpdate(i);
        }
    }

    public void onNotificationPosted(Context context, StatusBarNotification statusBarNotification) {
        if (!((AudioManager) context.getSystemService("audio")).isMusicActive()) {
            Log.e(this.a, "Blocked onNotificationPosted " + statusBarNotification);
            return;
        }
        Log.e(this.a, "onNotificationPosted..." + statusBarNotification);
        String packageName = statusBarNotification.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(packageName);
        List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 131072);
        if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.isEmpty()) {
            return;
        }
        Log.e(this.a, "音乐软件正在播放...");
        Log.e(this.a, statusBarNotification.getPackageName());
        this.d = packageName;
        MusicAction musicAction = new MusicAction(Command.PLAYER_IN);
        Intent intent2 = new Intent("android.intent.action.MAIN");
        intent2.addCategory("android.intent.category.LAUNCHER");
        intent2.setPackage(packageName);
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 0);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            intent2.addCategory("android.intent.category.DEFAULT");
            List<ResolveInfo> listQueryIntentActivities2 = packageManager.queryIntentActivities(intent2, 0);
            if (listQueryIntentActivities2 == null || listQueryIntentActivities2.isEmpty()) {
                this.c = null;
            } else {
                String string = listQueryIntentActivities2.get(0).loadLabel(packageManager).toString();
                musicAction.playerName = string;
                this.c = string;
            }
        } else {
            String string2 = listQueryIntentActivities.get(0).loadLabel(packageManager).toString();
            musicAction.playerName = string2;
            this.c = string2;
        }
        MusicClientInterface.getInstance(context).getTheJustCurrMediaInfo().playerHasGone = 0;
        MusicClientInterface.MusicStateListener musicStateListener = this.e;
        if (musicStateListener != null) {
            musicStateListener.onActionChanged(musicAction);
        }
    }

    public void onNotificationRemoved(Context context, StatusBarNotification statusBarNotification) {
        MusicClientInterface.getInstance(context).getWorkHandler().postDelayed(new a(context, statusBarNotification), 500L);
    }

    public boolean sendMusicKeyEvent(Context context, int i) {
        if (this.remoteController != null) {
            return this.remoteController.sendMediaKeyEvent(new KeyEvent(0, i)) && this.remoteController.sendMediaKeyEvent(new KeyEvent(1, i));
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        KeyEvent keyEvent = new KeyEvent(jUptimeMillis, jUptimeMillis, 0, i, 0);
        d(context, keyEvent);
        d(context, KeyEvent.changeAction(keyEvent, 1));
        return false;
    }

    public void setClientUpdateListener(RemoteController.OnClientUpdateListener onClientUpdateListener) {
        this.b = onClientUpdateListener;
    }

    @Override // android.media.RemoteController.OnClientUpdateListener
    public void onClientPlaybackStateUpdate(int i, long j, long j2, float f) {
        RemoteController.OnClientUpdateListener onClientUpdateListener = this.b;
        if (onClientUpdateListener != null) {
            onClientUpdateListener.onClientPlaybackStateUpdate(i, j, j2, f);
        }
    }
}
