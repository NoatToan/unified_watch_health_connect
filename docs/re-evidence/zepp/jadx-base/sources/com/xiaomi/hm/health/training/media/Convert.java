package com.xiaomi.hm.health.training.media;

import com.xiaomi.hm.health.training.R;

/* JADX INFO: loaded from: classes21.dex */
public class Convert {
    public static int digitalToAudio(int i) {
        switch (i) {
            case 1:
                return R.raw.num_1;
            case 2:
                return R.raw.num_2;
            case 3:
                return R.raw.num_3;
            case 4:
                return R.raw.num_4;
            case 5:
                return R.raw.num_5;
            case 6:
                return R.raw.num_6;
            case 7:
                return R.raw.num_7;
            case 8:
                return R.raw.num_8;
            case 9:
                return R.raw.num_9;
            default:
                return R.raw.empty_voice;
        }
    }
}
