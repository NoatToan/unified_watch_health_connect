package com.huami.view.videoview;

import android.media.MediaPlayer;
import android.view.View;

/* JADX INFO: loaded from: classes15.dex */
public class InfoListener implements MediaPlayer.OnInfoListener {
    private View a;

    public InfoListener(View view) {
        this.a = view;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        this.a.setVisibility(8);
        return true;
    }
}
