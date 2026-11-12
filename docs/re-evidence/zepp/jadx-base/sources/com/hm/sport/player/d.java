package com.hm.sport.player;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
final class d implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {
    private AudioManager a;
    private PlayCommand.CommandId b;
    private a c;

    public d(Context context, PlayCommand.CommandId commandId, a aVar) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.b = commandId;
        this.c = aVar;
        this.a = (AudioManager) context.getSystemService("audio");
    }

    private void a(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        AudioManager audioManager = this.a;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(null);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        a(mediaPlayer);
        a aVar = this.c;
        if (aVar != null) {
            aVar.onCompletion(this.b);
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.i("RunPlayer", "PlayListener onError what: " + i + ",extra: " + i2);
        a(mediaPlayer);
        a aVar = this.c;
        if (aVar == null) {
            return true;
        }
        aVar.onError(i, this.b);
        return true;
    }
}
