package com.xiaomi.hm.health.training.media.factory;

import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.media.factory.broadcastimpl.NewActionBroadCastFactory;
import com.xiaomi.hm.health.training.media.factory.broadcastimpl.OldActionBroadCastFactory;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.NewActionVideoCricleProgressStrategy;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.NewPlayActionVideoBottomProgress;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.OldActionVideoCricleProgressStrategy;
import com.xiaomi.hm.health.training.media.strategy.trainImpl.OldPlayActionVideoBottomProgress;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class PlayActionVideoStrategyFactory {
    private static boolean a(ActionVideo actionVideo) {
        return actionVideo.getActionNumber() != null && actionVideo.getActionNumber().intValue() >= 1 && actionVideo.getTime().intValue() > 1;
    }

    private static boolean b(TrainingDetail trainingDetail) {
        boolean z = true;
        if (trainingDetail != null) {
            for (ActionContent actionContent : trainingDetail.content) {
                List<ActionVideo> list = actionContent.videos;
                if (list != null && list.size() > 0) {
                    Iterator<ActionVideo> it2 = actionContent.videos.iterator();
                    while (it2.hasNext()) {
                        if (!a(it2.next())) {
                        }
                    }
                }
                z = false;
            }
        }
        return z;
    }

    public static PlayActionVideoOptions create(TrainingDetail trainingDetail) {
        boolean zB = b(trainingDetail);
        return zB ? new PlayActionVideoOptions.Builder().isResultActionNumber(zB).actionBroadCastFactory(new NewActionBroadCastFactory()).bottomProgressStrategy(new NewPlayActionVideoBottomProgress()).circleProgressStrategy(new NewActionVideoCricleProgressStrategy()).build() : new PlayActionVideoOptions.Builder().isResultActionNumber(zB).actionBroadCastFactory(new OldActionBroadCastFactory()).bottomProgressStrategy(new OldPlayActionVideoBottomProgress()).circleProgressStrategy(new OldActionVideoCricleProgressStrategy()).build();
    }
}
