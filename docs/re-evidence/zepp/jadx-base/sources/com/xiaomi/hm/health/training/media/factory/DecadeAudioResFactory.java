package com.xiaomi.hm.health.training.media.factory;

import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;

/* JADX INFO: loaded from: classes21.dex */
public class DecadeAudioResFactory {
    public static AudioRes create(int i) {
        switch (i) {
            case 1:
                return new AudioRes(R.raw.num_ten_10);
            case 2:
                return new AudioRes(R.raw.num_ten_20);
            case 3:
                return new AudioRes(R.raw.num_ten_30);
            case 4:
                return new AudioRes(R.raw.num_ten_40);
            case 5:
                return new AudioRes(R.raw.num_ten_50);
            case 6:
                return new AudioRes(R.raw.num_ten_60);
            case 7:
                return new AudioRes(R.raw.num_ten_70);
            case 8:
                return new AudioRes(R.raw.num_ten_80);
            case 9:
                return new AudioRes(R.raw.num_ten_90);
            default:
                return null;
        }
    }
}
