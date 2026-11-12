package com.xiaomi.hm.health.training.media.audio.player;

import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.audio.model.IPlayerListener;

/* JADX INFO: loaded from: classes21.dex */
public class AudioPlayerListener implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    private IPlayerListener a;
    private AudioRes b;

    public AudioPlayerListener(IPlayerListener iPlayerListener, AudioRes audioRes) {
        this.a = iPlayerListener;
        this.b = audioRes;
    }

    private void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
            mediaPlayer.release();
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        a(mediaPlayer);
        this.a.onComplete(this.b);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        a(mediaPlayer);
        this.a.onError(this.b);
        return true;
    }
}
