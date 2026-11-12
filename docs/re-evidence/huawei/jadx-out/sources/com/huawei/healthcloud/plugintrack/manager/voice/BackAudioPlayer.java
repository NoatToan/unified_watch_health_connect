package com.huawei.healthcloud.plugintrack.manager.voice;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.text.TextUtils;
import com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes10.dex */
public class BackAudioPlayer implements VoicePlayInterface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AudioManager f10481b;
    private String d;
    private boolean g;
    private MediaPlayer i;
    private Queue<String> e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaPlayer.OnCompletionListener f10482c = new MediaPlayer.OnCompletionListener() { // from class: com.huawei.healthcloud.plugintrack.manager.voice.BackAudioPlayer.5
        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            LogUtil.a("Track_BackAudioPlayer", "play complete.");
            if (BackAudioPlayer.this.e != null) {
                BackAudioPlayer.this.e.poll();
                String str = (String) BackAudioPlayer.this.e.peek();
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                BackAudioPlayer.this.startPlay(str);
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AudioManager.OnAudioFocusChangeListener f10480a = new AudioManager.OnAudioFocusChangeListener() { // from class: com.huawei.healthcloud.plugintrack.manager.voice.BackAudioPlayer.1
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (BackAudioPlayer.this.g) {
                LogUtil.j("Track_BackAudioPlayer", "onAudioFocusChange is in mute. focusChange is ", Integer.valueOf(i));
                return;
            }
            if (i == -3) {
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
                BackAudioPlayer.this.e();
                return;
            }
            if (i == -2) {
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_LOSS_TRANSIENT");
                BackAudioPlayer.this.e();
                return;
            }
            if (i == -1) {
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_LOSS");
                BackAudioPlayer.this.e();
                return;
            }
            if (i == 1) {
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_GAIN");
                BackAudioPlayer.this.resumeVolume();
            } else if (i == 2) {
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_GAIN_TRANSIENT");
                BackAudioPlayer.this.resumeVolume();
            } else {
                if (i != 3) {
                    return;
                }
                LogUtil.a("Track_BackAudioPlayer", "AudioFocus: received AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK");
                BackAudioPlayer.this.resumeVolume();
            }
        }
    };

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public int getType() {
        return 1;
    }

    public BackAudioPlayer(Context context) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.i = mediaPlayer;
        mediaPlayer.setLooping(false);
        this.g = false;
        Object systemService = context.getSystemService("audio");
        if (systemService instanceof AudioManager) {
            this.f10481b = (AudioManager) systemService;
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void startPlay(String str) {
        LogUtil.a("Track_BackAudioPlayer", "startPlay,", str);
        if (this.i == null) {
            LogUtil.j("Track_BackAudioPlayer", "media player null");
            return;
        }
        if (d() == 0) {
            LogUtil.e("Track_BackAudioPlayer", "request music focus failed.");
        }
        this.d = str;
        try {
            this.i.reset();
            this.i.setDataSource(str);
            this.i.prepare();
            this.i.start();
            this.i.setOnCompletionListener(this.f10482c);
        } catch (IOException | IllegalArgumentException | IllegalStateException | SecurityException e) {
            LogUtil.e("Track_BackAudioPlayer", "play audio exception.", LogAnonymous.b(e));
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void pausePlay() {
        LogUtil.a("Track_BackAudioPlayer", "pausePlay,", this.d);
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer == null) {
            LogUtil.j("Track_BackAudioPlayer", "media player null");
        } else if (mediaPlayer.isPlaying()) {
            this.i.pause();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void continuePlay() {
        LogUtil.a("Track_BackAudioPlayer", "continuePlay,", this.d);
        if (this.i == null) {
            LogUtil.j("Track_BackAudioPlayer", "media player null");
            return;
        }
        if (d() == 0) {
            LogUtil.e("Track_BackAudioPlayer", "request music focus failed.");
        }
        if (this.i.isPlaying()) {
            return;
        }
        LogUtil.a("Track_BackAudioPlayer", "continue.");
        this.i.start();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void muteVolume() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
            this.g = true;
            LogUtil.a("Track_BackAudioPlayer", "mute volume");
        }
    }

    private int d() {
        AudioManager audioManager = this.f10481b;
        if (audioManager == null) {
            LogUtil.e("Track_BackAudioPlayer", "mAudioManager is null.");
            return 0;
        }
        return audioManager.requestAudioFocus(this.f10480a, 3, 1);
    }

    private int b() {
        AudioManager audioManager = this.f10481b;
        if (audioManager == null) {
            LogUtil.e("Track_BackAudioPlayer", "mAudioManager is null.");
            return 0;
        }
        return audioManager.abandonAudioFocus(this.f10480a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.5f, 0.5f);
            LogUtil.a("Track_BackAudioPlayer", "reduce volume");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void resumeVolume() {
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
            this.g = false;
            LogUtil.a("Track_BackAudioPlayer", "resume volume");
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void stopPlay() {
        LogUtil.a("Track_BackAudioPlayer", "stopPlay,");
        this.i.stop();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void insertVoice(Intent intent) {
        String stringExtra = intent.getStringExtra("param_long_audio_url");
        this.e.offer(stringExtra);
        LogUtil.a("Track_BackAudioPlayer", "insertVoice audioUrl:", stringExtra, " queue:", Integer.valueOf(this.e.size()));
        if (this.e.size() == 1) {
            String strPeek = this.e.peek();
            if (TextUtils.isEmpty(strPeek)) {
                return;
            }
            startPlay(strPeek);
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void resetPlayer() {
        LogUtil.a("Track_BackAudioPlayer", "resetPlayer,");
        if (this.e != null) {
            this.i.stop();
            this.i.reset();
            this.e.clear();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.voice.constructor.VoicePlayInterface
    public void destroy() {
        resetPlayer();
        MediaPlayer mediaPlayer = this.i;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.i = null;
            b();
            LogUtil.a("Track_BackAudioPlayer", "release,");
        }
    }
}
