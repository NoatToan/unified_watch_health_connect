package com.xiaomi.hm.health.training.media.factory.broadcastimpl;

import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.R;
import com.xiaomi.hm.health.training.media.audio.model.AudioRes;
import com.xiaomi.hm.health.training.media.factory.IActionBroadCastFactory;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.ActionVideoPlayCommon;
import com.xiaomi.hm.health.traininglib.util.MediaFileUtils;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class OldActionBroadCastFactory extends IActionBroadCastFactory {
    @Override // com.xiaomi.hm.health.training.media.factory.IActionBroadCastFactory
    public ArrayList<AudioRes> create(List<ActionContent> list, int i) {
        ArrayList<AudioRes> arrayList = new ArrayList<>();
        ActionContent actionContent = list.get(i);
        if (i == 0) {
            arrayList.add(new AudioRes(R.raw.first_action));
        } else if (i == list.size() - 1) {
            arrayList.add(new AudioRes(R.raw.last_action));
        } else {
            if (i == (list.size() % 2 == 0 ? list.size() / 2 : (list.size() / 2) + 1)) {
                arrayList.add(new AudioRes(R.raw.training_more_than_half));
                arrayList.add(new AudioRes(R.raw.come_on));
            }
            arrayList.add(new AudioRes(R.raw.next_action));
        }
        List<ActionVideo> list2 = actionContent.videos;
        if (!actionVideosIsEmpty(list2)) {
            actionContent.actionVideo = list2.get(0);
            if (list2.size() == 2) {
                for (ActionVideo actionVideo : list2) {
                    if (actionVideo.getGender().intValue() == this.trainer.gender) {
                        actionContent.actionVideo = actionVideo;
                        break;
                    }
                }
            }
        }
        ActionAudio actionAudio = actionContent.audio;
        arrayList.add(new AudioRes(generateFileUri(MediaFileUtils.getMedialFromCacheByUri(actionAudio.url, actionAudio.size.longValue()).getAbsolutePath())));
        if ("TIME".equals(ActionVideoPlayCommon.getActionType(actionContent))) {
            generateActionCountBroadCast(arrayList, Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, this.trainer)) / 1000);
            arrayList.add(new AudioRes(R.raw.seconds));
        } else {
            generateActionCountBroadCast(arrayList, (int) (((long) Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, this.trainer))) / actionContent.actionVideo.singleActionTime.longValue()));
            arrayList.add(new AudioRes(R.raw.times));
        }
        return arrayList;
    }
}
