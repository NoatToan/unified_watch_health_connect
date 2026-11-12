package com.xiaomi.hm.health.training.media.factory.mediaImpl;

import android.content.Context;
import android.media.MediaPlayer;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory;

/* JADX INFO: loaded from: classes21.dex */
public class DecadePlayerFactory implements IMediaPlayerFactory {
    @Override // com.xiaomi.hm.health.training.media.factory.IMediaPlayerFactory
    public MediaPlayer create(Context context, int i) {
        switch (i) {
            case 1:
                return MediaPlayer.create(context, R.raw.num_ten_10);
            case 2:
                return MediaPlayer.create(context, R.raw.num_ten_20);
            case 3:
                return MediaPlayer.create(context, R.raw.num_ten_30);
            case 4:
                return MediaPlayer.create(context, R.raw.num_ten_40);
            case 5:
                return MediaPlayer.create(context, R.raw.num_ten_50);
            case 6:
                return MediaPlayer.create(context, R.raw.num_ten_60);
            case 7:
                return MediaPlayer.create(context, R.raw.num_ten_70);
            case 8:
                return MediaPlayer.create(context, R.raw.num_ten_80);
            case 9:
                return MediaPlayer.create(context, R.raw.num_ten_90);
            default:
                return null;
        }
    }
}
