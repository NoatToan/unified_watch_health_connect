package com.hm.sport.player;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
interface a {
    void a(PlayCommand.CommandId commandId, MediaPlayer mediaPlayer);

    void onCompletion(PlayCommand.CommandId commandId);

    boolean onError(int i, PlayCommand.CommandId commandId);
}
