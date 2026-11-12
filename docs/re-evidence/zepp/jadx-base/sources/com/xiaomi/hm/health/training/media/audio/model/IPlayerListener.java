package com.xiaomi.hm.health.training.media.audio.model;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes21.dex */
public interface IPlayerListener {
    void onComplete(AudioRes audioRes);

    void onError(AudioRes audioRes);

    void onPrepared(AudioRes audioRes, MediaPlayer mediaPlayer);
}
