package com.xiaomi.hm.health.training.media.factory;

import android.net.Uri;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.Convert;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class IActionBroadCastFactory {
    public TrainerInfo trainer = TrainerInfo.get();

    public boolean actionVideosIsEmpty(List<ActionVideo> list) {
        return list == null || list.size() == 0;
    }

    public abstract ArrayList<AudioRes> create(List<ActionContent> list, int i);

    public void generateActionCountBroadCast(List<AudioRes> list, int i) {
        if (i < 0 || i >= 1000) {
            return;
        }
        int i2 = i / 100;
        if (i2 != 0) {
            list.add(new AudioRes(Convert.digitalToAudio(i2)));
            list.add(new AudioRes(R.raw.number_hundred));
        }
        int i3 = i % 100;
        int i4 = i3 / 10;
        if (i4 != 0) {
            list.add(DecadeAudioResFactory.create(i4));
        }
        int i5 = i3 % 10;
        if (i5 != 0) {
            list.add(new AudioRes(Convert.digitalToAudio(i5)));
        }
    }

    public Uri generateFileUri(String str) {
        return Uri.fromFile(new File(str));
    }
}
