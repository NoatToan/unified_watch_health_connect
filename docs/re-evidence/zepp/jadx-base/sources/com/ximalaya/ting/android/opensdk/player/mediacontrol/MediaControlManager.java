package com.ximalaya.ting.android.opensdk.player.mediacontrol;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaMetadata;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.ximalaya.ting.android.opensdk.model.track.Track;
import com.ximalaya.ting.android.opensdk.player.receive.WireControlReceiver;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerConfig;
import com.ximalaya.ting.android.opensdk.player.service.XmPlayerService;
import com.ximalaya.ting.android.opensdk.util.FileUtilBase;

/* JADX INFO: loaded from: classes22.dex */
public class MediaControlManager {
    public static final String REMOTE_CONTROL_COVER_DRAWABLE = "reflect_player_cover_default";
    private AudioManager audioManager;
    private boolean isRegisterRemoteControl = false;
    private Context mContext;
    private RemoteControlClient mRemoteControlClient;
    private MediaSession mSession;
    private ComponentName mediaButtonReceiver;
    private WireControlReceiver wireControlReceiver;

    public MediaControlManager(Context context) {
        this.mContext = context;
        if (XmPlayerConfig.getInstance(context).isUseSystemLockScreen()) {
            this.wireControlReceiver = new WireControlReceiver();
            this.audioManager = (AudioManager) context.getSystemService("audio");
        }
    }

    private void register(MediaSession mediaSession) {
        if (!XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen() || mediaSession == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(new ComponentName(this.mContext, (Class<?>) WireControlReceiver.class));
        mediaSession.setMediaButtonReceiver(PendingIntent.getBroadcast(this.mContext.getApplicationContext(), 0, intent, 0));
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setUsage(1).setContentType(2);
        mediaSession.setPlaybackToLocal(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRemoteControlClientInfor(String str, String str2, String str3, long j, Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 14) {
            RemoteControlClient.MetadataEditor metadataEditorEditMetadata = this.mRemoteControlClient.editMetadata(true);
            metadataEditorEditMetadata.putString(7, str);
            metadataEditorEditMetadata.putString(1, str2);
            metadataEditorEditMetadata.putString(2, str3);
            metadataEditorEditMetadata.putLong(9, j);
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeResource(this.mContext.getResources(), this.mContext.getResources().getIdentifier(REMOTE_CONTROL_COVER_DRAWABLE, "drawable", this.mContext.getPackageName()));
            }
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    metadataEditorEditMetadata.putBitmap(100, bitmap);
                } catch (Exception unused) {
                }
            }
            metadataEditorEditMetadata.apply();
        }
    }

    private void updateScreenImg() {
        XmPlayerService playerSrvice;
        Track track;
        if (Build.VERSION.SDK_INT < 14 || this.mRemoteControlClient == null || (playerSrvice = XmPlayerService.getPlayerSrvice()) == null || playerSrvice.getPlayListControl() == null || (track = (Track) playerSrvice.getPlayListControl().getCurrentPlayableModel()) == null) {
            return;
        }
        final String trackTitle = track.getTrackTitle();
        final String albumTitle = track.getAlbum() != null ? track.getAlbum().getAlbumTitle() : "";
        final String nickname = track.getAnnouncer() != null ? track.getAnnouncer().getNickname() : "";
        final long duration = track.getDuration();
        int i = this.mContext.getResources().getDisplayMetrics().widthPixels;
        int i2 = this.mContext.getResources().getDisplayMetrics().heightPixels;
        FileUtilBase.getBitmapByUrl(this.mContext, track, 0, 0, new FileUtilBase.IBitmapDownOkCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.mediacontrol.MediaControlManager.3
            @Override // com.ximalaya.ting.android.opensdk.util.FileUtilBase.IBitmapDownOkCallBack
            public void onSuccess(Bitmap bitmap) {
                if (MediaControlManager.this.mRemoteControlClient == null || bitmap == null) {
                    return;
                }
                MediaControlManager.this.updateRemoteControlClientInfor(trackTitle, albumTitle, nickname, duration, bitmap);
            }
        });
    }

    public void initMediaControl() {
        if (XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen() && Build.VERSION.SDK_INT >= 21) {
            try {
                this.mSession = new MediaSession(this.mContext, "MusicService");
            } catch (Throwable th) {
                th.printStackTrace();
            }
            MediaSession mediaSession = this.mSession;
            if (mediaSession != null) {
                mediaSession.setCallback(new MediaSession.Callback() { // from class: com.ximalaya.ting.android.opensdk.player.mediacontrol.MediaControlManager.1
                    @Override // android.media.session.MediaSession.Callback
                    public boolean onMediaButtonEvent(Intent intent) {
                        MediaControlManager.this.wireControlReceiver.onReceive(MediaControlManager.this.mContext, intent);
                        return super.onMediaButtonEvent(intent);
                    }
                });
                this.mSession.setFlags(3);
            }
        }
    }

    public void pausePlay() {
        RemoteControlClient remoteControlClient;
        if (XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && this.mSession != null) {
                this.mSession.setPlaybackState(new PlaybackState.Builder().setState(2, 0L, 1.0f).build());
            }
            if (i < 14 || (remoteControlClient = this.mRemoteControlClient) == null) {
                return;
            }
            remoteControlClient.setPlaybackState(2);
        }
    }

    public void release() {
        MediaSession mediaSession;
        if (XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && (mediaSession = this.mSession) != null) {
                mediaSession.setActive(false);
                this.mSession.release();
            }
            if (i >= 14) {
                AudioManager audioManager = (AudioManager) this.mContext.getSystemService("audio");
                if (audioManager != null) {
                    ComponentName componentName = this.mediaButtonReceiver;
                    if (componentName != null) {
                        audioManager.unregisterMediaButtonEventReceiver(componentName);
                    }
                    RemoteControlClient remoteControlClient = this.mRemoteControlClient;
                    if (remoteControlClient != null) {
                        audioManager.unregisterRemoteControlClient(remoteControlClient);
                    }
                }
                WireControlReceiver wireControlReceiver = this.wireControlReceiver;
                if (wireControlReceiver == null || !this.isRegisterRemoteControl) {
                    return;
                }
                try {
                    this.mContext.unregisterReceiver(wireControlReceiver);
                } catch (Exception unused) {
                }
            }
        }
    }

    public void startPlay() {
        final Track track;
        if (XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                PlaybackState playbackStateBuild = new PlaybackState.Builder().setActions(1591L).setState(3, 0L, 1.0f, SystemClock.elapsedRealtime()).build();
                MediaSession mediaSession = this.mSession;
                if (mediaSession != null) {
                    register(mediaSession);
                    this.mSession.setActive(true);
                    this.mSession.setPlaybackState(playbackStateBuild);
                }
                XmPlayerService playerSrvice = XmPlayerService.getPlayerSrvice();
                if (playerSrvice == null || (track = (Track) playerSrvice.getPlayListControl().getCurrentPlayableModel()) == null) {
                    return;
                }
                int i2 = this.mContext.getResources().getDisplayMetrics().widthPixels;
                int i3 = this.mContext.getResources().getDisplayMetrics().heightPixels;
                FileUtilBase.getBitmapByUrl(this.mContext, track, 0, 0, new FileUtilBase.IBitmapDownOkCallBack() { // from class: com.ximalaya.ting.android.opensdk.player.mediacontrol.MediaControlManager.2
                    @Override // com.ximalaya.ting.android.opensdk.util.FileUtilBase.IBitmapDownOkCallBack
                    public void onSuccess(Bitmap bitmap) {
                        int i4 = Build.VERSION.SDK_INT;
                        if (i4 < 14 || i4 < 21) {
                            return;
                        }
                        MediaMetadata.Builder builder = new MediaMetadata.Builder();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            builder.putBitmap(MediaMetadataCompat.METADATA_KEY_ART, bitmap);
                        }
                        builder.putString(MediaMetadataCompat.METADATA_KEY_TITLE, track.getTrackTitle());
                        if (track.getAlbum() != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_ALBUM, track.getAlbum().getAlbumTitle());
                        }
                        if (track.getAnnouncer() != null) {
                            builder.putString(MediaMetadataCompat.METADATA_KEY_ARTIST, track.getAnnouncer().getNickname());
                        }
                        if (MediaControlManager.this.mSession != null) {
                            MediaControlManager.this.mSession.setMetadata(builder.build());
                        }
                    }
                });
            }
            if (i >= 14) {
                this.audioManager = (AudioManager) this.mContext.getSystemService("audio");
                ComponentName componentName = new ComponentName(this.mContext.getPackageName(), WireControlReceiver.class.getName());
                this.mediaButtonReceiver = componentName;
                this.audioManager.registerMediaButtonEventReceiver(componentName);
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(this.mediaButtonReceiver);
                RemoteControlClient remoteControlClient = new RemoteControlClient(PendingIntent.getBroadcast(this.mContext, 0, intent, AMapEngineUtils.HALF_MAX_P20_WIDTH));
                this.mRemoteControlClient = remoteControlClient;
                this.audioManager.registerRemoteControlClient(remoteControlClient);
                this.mRemoteControlClient.setTransportControlFlags(669);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_BUTTON");
                intentFilter.setPriority(10000);
                this.mContext.registerReceiver(this.wireControlReceiver, intentFilter);
                if (i >= 14 && i < 21) {
                    updateScreenImg();
                    RemoteControlClient remoteControlClient2 = this.mRemoteControlClient;
                    if (remoteControlClient2 != null) {
                        remoteControlClient2.setPlaybackState(3);
                    }
                }
                this.isRegisterRemoteControl = true;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void stopPlay() {
        RemoteControlClient remoteControlClient;
        if (XmPlayerConfig.getInstance(this.mContext).isUseSystemLockScreen()) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21 && this.mSession != null) {
                this.mSession.setPlaybackState(new PlaybackState.Builder().setState(1, 0L, 1.0f).build());
            }
            if (i < 14 || (remoteControlClient = this.mRemoteControlClient) == null) {
                return;
            }
            remoteControlClient.setPlaybackState(1);
        }
    }
}
