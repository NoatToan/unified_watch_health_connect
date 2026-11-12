package com.xiaomi.hm.health.training.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.Gson;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.DaoSession;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingItemDao;
import com.xiaomi.hm.health.training.api.bean.TrainingRecordBody;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.training.api.entity.VideoRecord;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.greendao.query.WhereCondition;

/* JADX INFO: loaded from: classes21.dex */
class j {
    public static boolean a(@NonNull String str) {
        TrainingItem trainingItemUnique = b().getTrainingItemDao().queryBuilder().where(TrainingItemDao.Properties.TrainingId.eq(str), new WhereCondition[0]).build().unique();
        if (trainingItemUnique == null) {
            return true;
        }
        trainingItemUnique.isParticipate = Boolean.FALSE;
        return b().getTrainingItemDao().insertOrReplace(trainingItemUnique) > 0;
    }

    private static DaoSession b() {
        return HMDaoManager.getInstance().getDaoSession();
    }

    public static boolean c(@NonNull com.xiaomi.hm.health.training.api.bean.TrainingItem trainingItem) {
        TrainingItem trainingItem2 = new TrainingItem();
        trainingItem2.trainingId = Long.valueOf(trainingItem.id);
        trainingItem2.name = trainingItem.name;
        trainingItem2.trainingType = trainingItem.trainingType;
        trainingItem2.difficultyDegree = Integer.valueOf(trainingItem.difficultyDegree);
        trainingItem2.participantNumber = Long.valueOf(trainingItem.participantNumber);
        trainingItem2.updateTime = Long.valueOf(trainingItem.updateTime);
        trainingItem2.listImgUrl = trainingItem.listImgUrl;
        trainingItem2.isParticipate = Boolean.TRUE;
        Gson gsonB = m.b();
        trainingItem2.time = gsonB.toJson(trainingItem.duration);
        trainingItem2.instrument = gsonB.toJson(trainingItem.instrument);
        trainingItem2.location = gsonB.toJson(trainingItem.bodyparts);
        trainingItem2.listPageIllustrated = gsonB.toJson(trainingItem.largeListImageUrl);
        trainingItem2.recommendedPageIllustrated = gsonB.toJson(trainingItem.smallListImageUrl);
        trainingItem2.detailImgUrl = gsonB.toJson(trainingItem.detailImageUrl);
        return b().getTrainingItemDao().insertOrReplace(trainingItem2) > 0;
    }

    public static boolean d(@NonNull TrainingRecord trainingRecord, @Nullable String str, int i, boolean z, @Nullable Long l) {
        com.xiaomi.hm.health.databases.model.trainning.TrainingRecord trainingRecord2 = new com.xiaomi.hm.health.databases.model.trainning.TrainingRecord();
        trainingRecord2.trainingId = Long.valueOf(Long.parseLong(trainingRecord.trainingId));
        trainingRecord2.name = str;
        trainingRecord2.trainingType = "EXCELLENT_COURSE";
        trainingRecord2.startTime = Long.valueOf(trainingRecord.startTime);
        trainingRecord2.endTime = Long.valueOf(trainingRecord.endTime);
        trainingRecord2.duration = Long.valueOf(trainingRecord.duration);
        trainingRecord2.consumption = Integer.valueOf((int) trainingRecord.consumption);
        trainingRecord2.finishNumber = Integer.valueOf(i);
        List<VideoRecord> list = trainingRecord.watchedVideos;
        trainingRecord2.actionNumber = Integer.valueOf(list != null ? list.size() : 0);
        trainingRecord2.status = Integer.valueOf(z ? 1 : 0);
        List<VideoRecord> list2 = trainingRecord.watchedVideos;
        if (list2 != null && !list2.isEmpty()) {
            ArrayList arrayList = new ArrayList(trainingRecord.watchedVideos.size());
            for (VideoRecord videoRecord : trainingRecord.watchedVideos) {
                TrainingRecordBody.FinishedVideo finishedVideo = new TrainingRecordBody.FinishedVideo();
                finishedVideo.id = videoRecord.id;
                finishedVideo.watchedCount = videoRecord.watchedCount;
                arrayList.add(finishedVideo);
            }
            trainingRecord2.finishedVideos = m.b().toJson(arrayList);
        }
        if (l != null) {
            trainingRecord2.createTime = l;
        }
        trainingRecord2.generateTrainingRecordId();
        return b().getTrainingRecordDao().insertOrReplace(trainingRecord2) > 0;
    }
}
