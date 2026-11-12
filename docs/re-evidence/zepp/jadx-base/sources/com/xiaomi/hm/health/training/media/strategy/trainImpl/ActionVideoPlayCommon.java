package com.xiaomi.hm.health.training.media.strategy.trainImpl;

import android.text.TextUtils;
import com.xiaomi.hm.health.databases.model.trainning.ActionContent;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.xiaomi.hm.health.training.ui.fragment.TrainingPlayingFragment;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import com.xiaomi.hm.health.traininglib.webapi.ParseJsonUtil;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ActionVideoPlayCommon {
    private static TrainerInfo a = TrainerInfo.get();

    public static String getActionName(ActionContent actionContent) {
        List<ActionVideo> list = actionContent.videos;
        return (list == null || list.size() <= 0 || TextUtils.isEmpty(actionContent.videos.get(0).getType())) ? actionContent.actionVideo.name : actionContent.videos.get(0).getName();
    }

    public static String getActionType(ActionContent actionContent) {
        String type = actionContent.getType();
        if (!TextUtils.isEmpty(type)) {
            return type;
        }
        List<ActionVideo> list = actionContent.videos;
        return (list == null || list.size() <= 0 || TextUtils.isEmpty(actionContent.videos.get(0).getType())) ? actionContent.actionVideo.type : actionContent.videos.get(0).getType();
    }

    public static long getCricleProgressDurationTime(ActionContent actionContent) {
        List<ActionVideo> list;
        int iIntValue = (!"TIME".equals(getActionType(actionContent)) && (list = actionContent.videos) != null && list.size() > 0 && actionContent.videos.get(0).getTime().intValue() > 0) ? actionContent.videos.get(0).getTime().intValue() : Integer.parseInt(ParseJsonUtil.getStringByGender(actionContent.duration, getTrainer()));
        return iIntValue;
    }

    public static long getSingleActionTime(ActionContent actionContent) {
        return actionContent.videos.get(0).getTime().intValue() / actionContent.videos.get(0).getActionNumber().intValue();
    }

    public static TrainerInfo getTrainer() {
        return a;
    }

    public static void notifyArcProgressOther(TrainingPlayingFragment trainingPlayingFragment, long j, int i, int i2) {
        trainingPlayingFragment.trainingArcProgress.setUnitUpdateTime(j);
        trainingPlayingFragment.trainingArcProgress.setCountType(i);
        trainingPlayingFragment.trainingArcProgress.setMaxCount(i2);
    }
}
