package com.xiaomi.hm.health.training.media.factory.mediaImpl;

import android.content.Context;
import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory;

/* JADX INFO: loaded from: classes21.dex */
public class UnitPlayerFactory implements IMediaPlayerFactory {
    @Override // com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory
    public MediaPlayer create(Context context, int i) {
        switch (i) {
            case 1:
                return MediaPlayer.create(context, R.raw.num_1);
            case 2:
                return MediaPlayer.create(context, R.raw.num_2);
            case 3:
                return MediaPlayer.create(context, R.raw.num_3);
            case 4:
                return MediaPlayer.create(context, R.raw.num_4);
            case 5:
                return MediaPlayer.create(context, R.raw.num_5);
            case 6:
                return MediaPlayer.create(context, R.raw.num_6);
            case 7:
                return MediaPlayer.create(context, R.raw.num_7);
            case 8:
                return MediaPlayer.create(context, R.raw.num_8);
            case 9:
                return MediaPlayer.create(context, R.raw.num_9);
            default:
                return null;
        }
    }
}
