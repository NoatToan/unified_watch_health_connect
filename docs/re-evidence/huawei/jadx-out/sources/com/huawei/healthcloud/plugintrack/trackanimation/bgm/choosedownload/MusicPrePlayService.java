package com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import defpackage.jaa;
import health.compact.a.util.LogUtil;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public class MusicPrePlayService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f10641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer f10642c;
    private MusicPrePlayBinder d;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.d = new MusicPrePlayBinder();
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        if (systemService instanceof AudioManager) {
            this.f10641b = (AudioManager) systemService;
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent == null) {
            LogUtil.d("Track_MusicPrePlayService", "onBind intent is null");
            return this.d;
        }
        if (jaa.b(this.f10641b) == 0) {
            return this.d;
        }
        String stringExtra = intent.getStringExtra("dynamic_music_path");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.f10642c = MediaPlayer.create(this, Uri.fromFile(new File(stringExtra)));
        }
        MediaPlayer mediaPlayer = this.f10642c;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: com.huawei.healthcloud.plugintrack.trackanimation.bgm.choosedownload.MusicPrePlayService.3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public void onCompletion(MediaPlayer mediaPlayer2) {
                    if (mediaPlayer2 == null) {
                        LogUtil.d("Track_MusicPrePlayService", "mediaPlayer is null");
                    } else {
                        mediaPlayer2.seekTo(0);
                        mediaPlayer2.start();
                    }
                }
            });
            this.f10642c.start();
            this.f10642c.setLooping(true);
        }
        return this.d;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogUtil.a("Track_MusicPrePlayService", "onUnbind enter");
        MediaPlayer mediaPlayer = this.f10642c;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f10642c.stop();
            this.f10642c.release();
            this.f10642c = null;
        }
        jaa.e(this.f10641b);
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f10642c;
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                this.f10642c.stop();
            }
            this.f10642c.release();
        }
    }

    public class MusicPrePlayBinder extends Binder {
        public MusicPrePlayBinder() {
        }

        public MusicPrePlayService getService() {
            return MusicPrePlayService.this;
        }
    }
}
