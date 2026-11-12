package com.xiaomi.hm.health.training.api;

import androidx.annotation.WorkerThread;
import com.huami.tools.log.HMLog;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.PlanDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.TrainingPlan;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.PlanType;
import com.huami.training.dto.TrainingType;
import com.xiaomi.hm.health.HMIntentHandler;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourse;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import com.xiaomi.hm.health.databases.model.trainning.TrainingDetail;
import com.xiaomi.hm.health.training.api.NewTrainingDb;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u001f\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0006J\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/xiaomi/hm/health/training/api/NewTrainingDb;", "", "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingDetail;", "detail", "", "hasDownloaded", "", "insertOrUpdateJoinedTraining", "", "id", "exitJoinedTraining", "hasJoinedTraining", "trainingId", "downloaded", "", "updateParticipationDownloadState", "(JZ)Ljava/lang/Integer;", "Lcom/xiaomi/hm/health/databases/model/trainning/TrainingCourse;", "oldPlan", "insertTrainingPlan", "deleteTrainingPlan", "dayIndex", "finished", "finishPlanTraining", "", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", "getTrainingDb", "()Lcom/huami/training/db/TrainingDb;", "setTrainingDb", "(Lcom/huami/training/db/TrainingDb;)V", "trainingDb", "<init>", "()V", "training-core-api_release"}, k = 1, mv = {1, 5, 1})
public final class NewTrainingDb {

    @NotNull
    public static final NewTrainingDb INSTANCE = new NewTrainingDb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Train-NewTrainingDb";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static TrainingDb trainingDb;

    private NewTrainingDb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(PlanDao planDao) {
        planDao.clearPlan();
        planDao.clearPlanTrainings();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public static final void d(PlanDao planDao, TrainingCourse trainingCourse) {
        Difficulty difficulty;
        Long l = trainingCourse.trainingPlanId;
        String str = trainingCourse.name;
        String str2 = trainingCourse.detailsPageIllustrated;
        Integer num = trainingCourse.consumption;
        String str3 = trainingCourse.introduction;
        long j = trainingCourse.time;
        int i = trainingCourse.trainingDays;
        int i2 = trainingCourse.totalDays;
        long time = new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD, Locale.getDefault()).parse(trainingCourse.startDay).getTime();
        PlanType planType = PlanType.LOSE_FAT;
        String str4 = trainingCourse.difficultyDegree;
        if (str4 == null) {
            difficulty = Difficulty.JUNIOR;
        } else {
            int iHashCode = str4.hashCode();
            if (iHashCode != -894922694) {
                if (iHashCode != 97853518) {
                    if (iHashCode == 1389075079 && str4.equals("HIGH_LEVEL")) {
                        difficulty = Difficulty.SENIOR;
                    } else {
                        difficulty = Difficulty.JUNIOR;
                    }
                } else if (str4.equals("JUNIOR_LEVEL")) {
                    difficulty = Difficulty.JUNIOR;
                } else {
                    difficulty = Difficulty.JUNIOR;
                }
            } else if (str4.equals("MIDDLE_LEVEL")) {
                difficulty = Difficulty.INTERMEDIATE;
            } else {
                difficulty = Difficulty.JUNIOR;
            }
        }
        planDao.insertPlan(new TrainingPlan(l.longValue(), str, str2, str2, num.intValue(), str3, planType, difficulty, j, i, i2, time));
        TrainingCourse trainingCourse2 = trainingCourse;
        List<TrainingCourseItem> list = trainingCourse2.dayTrainingItems;
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TrainingCourseItem trainingCourseItem : list) {
            Long l2 = trainingCourse2.trainingPlanId;
            Long l3 = trainingCourseItem.trainingId;
            String str5 = trainingCourseItem.name;
            Integer num2 = trainingCourseItem.dayOfWeek;
            Integer num3 = trainingCourseItem.dayIndex;
            long jIntValue = trainingCourseItem.time.intValue();
            Integer num4 = trainingCourseItem.consumption;
            Boolean bool = trainingCourseItem.isFinished;
            arrayList.add(new PlanTraining(l2.longValue(), l3.longValue(), str5, num2.intValue(), Long.valueOf(jIntValue), num4, bool.booleanValue(), num3.intValue(), null, trainingCourseItem.articleTitle, null, trainingCourseItem.articleLink, trainingCourseItem.articleImgUrl));
            trainingCourse2 = trainingCourse;
        }
        planDao.insertPlanTrainings(arrayList);
    }

    public final void deleteTrainingPlan() {
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null) {
            return;
        }
        final PlanDao planDao = trainingDb2.planDao();
        trainingDb2.runInTransaction(new Runnable() { // from class: ie5
            @Override // java.lang.Runnable
            public final void run() {
                NewTrainingDb.c(planDao);
            }
        });
    }

    public final void exitJoinedTraining(long id) {
        ParticipationDao participationDao;
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null || (participationDao = trainingDb2.participationDao()) == null) {
            return;
        }
        participationDao.deleteParticipation(id);
    }

    public final void finishPlanTraining(long trainingId, int dayIndex, boolean finished) {
        PlanDao planDao;
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null || (planDao = trainingDb2.planDao()) == null) {
            return;
        }
        planDao.finishPlanTraining(trainingId, dayIndex, finished);
    }

    @Nullable
    public final TrainingDb getTrainingDb() {
        return trainingDb;
    }

    public final boolean hasJoinedTraining(long id) {
        ParticipationDao participationDao;
        TrainingDb trainingDb2 = trainingDb;
        JoinedTraining joinedTrainingQueryJoinedTraining = null;
        if (trainingDb2 != null && (participationDao = trainingDb2.participationDao()) != null) {
            joinedTrainingQueryJoinedTraining = participationDao.queryJoinedTraining(id);
        }
        return joinedTrainingQueryJoinedTraining != null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    @WorkerThread
    public final void insertOrUpdateJoinedTraining(@NotNull TrainingDetail detail, boolean hasDownloaded) {
        TrainingType trainingType;
        TrainingType trainingType2;
        TrainingDb trainingDb2;
        GenderPair genderPair;
        Integer num;
        Difficulty difficulty;
        String str = detail.trainingType;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -980820892) {
                if (iHashCode != -463568143) {
                    if (iHashCode == 2729584 && str.equals("YOGA")) {
                        trainingType = TrainingType.YOGA;
                        trainingType2 = trainingType;
                        trainingDb2 = trainingDb;
                        if (trainingDb2 == null) {
                            return;
                        }
                        TrainingDao trainingDao = trainingDb2.trainingDao();
                        long jLongValue = detail.trainingId.longValue();
                        String str2 = detail.name;
                        try {
                            JSONObject jSONObject = new JSONObject(detail.listPageIllustrated);
                            jSONObject.optString(HMIntentHandler.NAME_FEMALE);
                            genderPair = new GenderPair(jSONObject.optString("male"), jSONObject.optString(HMIntentHandler.NAME_FEMALE));
                        } catch (Throwable unused) {
                            genderPair = null;
                        }
                        num = detail.difficultyDegree;
                        if (num == null && num.intValue() == 3) {
                            difficulty = Difficulty.SENIOR;
                        } else if (num == null && num.intValue() == 2) {
                            difficulty = Difficulty.INTERMEDIATE;
                        } else if (num == null && num.intValue() == 1) {
                            difficulty = Difficulty.JUNIOR;
                        } else {
                            difficulty = Difficulty.JUNIOR;
                        }
                        trainingDao.insertOrUpdateTraining(new Training(jLongValue, trainingType2, str2, genderPair, difficulty, detail.consumption, Integer.valueOf((int) detail.participantNumber.longValue()), Integer.valueOf(detail.content.size()), null, null, 768, null));
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ParticipationDao participationDao = trainingDb2.participationDao();
                        Participation participation = new Participation(detail.trainingId.longValue(), detail.finishNumber.intValue(), Long.valueOf(jCurrentTimeMillis), null, Long.valueOf(jCurrentTimeMillis), null, null, 96, null);
                        participation.setHasDownloaded(Boolean.valueOf(hasDownloaded));
                        Unit unit = Unit.INSTANCE;
                        participationDao.insertOrUpdateParticipation(participation);
                        return;
                    }
                } else if (str.equals("SINGLE_TRAINING")) {
                    trainingType = TrainingType.ACTION;
                    trainingType2 = trainingType;
                    trainingDb2 = trainingDb;
                    if (trainingDb2 == null) {
                        return;
                    }
                    TrainingDao trainingDao2 = trainingDb2.trainingDao();
                    long jLongValue2 = detail.trainingId.longValue();
                    String str3 = detail.name;
                    JSONObject jSONObject2 = new JSONObject(detail.listPageIllustrated);
                    jSONObject2.optString(HMIntentHandler.NAME_FEMALE);
                    genderPair = new GenderPair(jSONObject2.optString("male"), jSONObject2.optString(HMIntentHandler.NAME_FEMALE));
                    num = detail.difficultyDegree;
                    if (num == null) {
                        difficulty = Difficulty.SENIOR;
                    } else if (num == null) {
                        difficulty = Difficulty.INTERMEDIATE;
                    } else if (num == null) {
                        difficulty = Difficulty.JUNIOR;
                    } else {
                        difficulty = Difficulty.JUNIOR;
                    }
                    trainingDao2.insertOrUpdateTraining(new Training(jLongValue2, trainingType2, str3, genderPair, difficulty, detail.consumption, Integer.valueOf((int) detail.participantNumber.longValue()), Integer.valueOf(detail.content.size()), null, null, 768, null));
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ParticipationDao participationDao2 = trainingDb2.participationDao();
                    Participation participation2 = new Participation(detail.trainingId.longValue(), detail.finishNumber.intValue(), Long.valueOf(jCurrentTimeMillis2), null, Long.valueOf(jCurrentTimeMillis2), null, null, 96, null);
                    participation2.setHasDownloaded(Boolean.valueOf(hasDownloaded));
                    Unit unit2 = Unit.INSTANCE;
                    participationDao2.insertOrUpdateParticipation(participation2);
                    return;
                }
            } else if (str.equals("EXCELLENT_COURSE")) {
                trainingType = TrainingType.FEATURED_COURSE;
                trainingType2 = trainingType;
                trainingDb2 = trainingDb;
                if (trainingDb2 == null) {
                    return;
                }
                TrainingDao trainingDao3 = trainingDb2.trainingDao();
                long jLongValue3 = detail.trainingId.longValue();
                String str4 = detail.name;
                JSONObject jSONObject3 = new JSONObject(detail.listPageIllustrated);
                jSONObject3.optString(HMIntentHandler.NAME_FEMALE);
                genderPair = new GenderPair(jSONObject3.optString("male"), jSONObject3.optString(HMIntentHandler.NAME_FEMALE));
                num = detail.difficultyDegree;
                if (num == null) {
                    difficulty = Difficulty.SENIOR;
                } else if (num == null) {
                    difficulty = Difficulty.INTERMEDIATE;
                } else if (num == null) {
                    difficulty = Difficulty.JUNIOR;
                } else {
                    difficulty = Difficulty.JUNIOR;
                }
                trainingDao3.insertOrUpdateTraining(new Training(jLongValue3, trainingType2, str4, genderPair, difficulty, detail.consumption, Integer.valueOf((int) detail.participantNumber.longValue()), Integer.valueOf(detail.content.size()), null, null, 768, null));
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                ParticipationDao participationDao3 = trainingDb2.participationDao();
                Participation participation3 = new Participation(detail.trainingId.longValue(), detail.finishNumber.intValue(), Long.valueOf(jCurrentTimeMillis3), null, Long.valueOf(jCurrentTimeMillis3), null, null, 96, null);
                participation3.setHasDownloaded(Boolean.valueOf(hasDownloaded));
                Unit unit3 = Unit.INSTANCE;
                participationDao3.insertOrUpdateParticipation(participation3);
                return;
            }
        }
        HMLog.w(TAG, "无效的训练类型, id: " + detail.trainingId + ", type:" + ((Object) detail.trainingType), new Object[0]);
    }

    public final void insertTrainingPlan(@NotNull final TrainingCourse oldPlan) {
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null) {
            return;
        }
        final PlanDao planDao = trainingDb2.planDao();
        trainingDb2.runInTransaction(new Runnable() { // from class: je5
            @Override // java.lang.Runnable
            public final void run() {
                NewTrainingDb.d(planDao, oldPlan);
            }
        });
    }

    public final void setTrainingDb(@Nullable TrainingDb trainingDb2) {
        trainingDb = trainingDb2;
    }

    @Nullable
    public final Integer updateParticipationDownloadState(long trainingId, boolean downloaded) {
        ParticipationDao participationDao;
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null || (participationDao = trainingDb2.participationDao()) == null) {
            return null;
        }
        return Integer.valueOf(participationDao.updateParticipationDownloadState(trainingId, downloaded));
    }
}
