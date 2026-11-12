package com.huami.view.videoview;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes15.dex */
public interface FrameVideoViewListener {
    void mediaPlayerPrepareFailed(MediaPlayer mediaPlayer, String str);

    void mediaPlayerPrepared(MediaPlayer mediaPlayer);
}
