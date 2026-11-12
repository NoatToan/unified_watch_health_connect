package com.xiaomi.hm.health.training.media.factory.mediaImpl;

import android.content.Context;
import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory;

/* JADX INFO: loaded from: classes21.dex */
public class HundredPlayerFactory implements IMediaPlayerFactory {
    @Override // com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory
    public MediaPlayer create(Context context, int i) {
        return MediaPlayer.create(context, R.raw.number_hundred);
    }
}
