package com.xiaomi.hm.health.training.api;

import androidx.annotation.WorkerThread;
import com.huami.tools.log.HMLog;
import com.huami.training.db.TrainingDb;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.Training;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.xiaomi.hm.health.training.api.bean.Label;
import com.xiaomi.hm.health.training.api.bean.TrainingItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/training/api/NewDbApi;", "", "Lcom/xiaomi/hm/health/training/api/bean/TrainingItem;", "webItem", "", "insertOrUpdateJoinedTraining", "", "id", "exitJoinedTraining", "", "a", "Ljava/lang/String;", "TAG", "Lcom/huami/training/db/TrainingDb;", "b", "Lcom/huami/training/db/TrainingDb;", "getTrainingDb", "()Lcom/huami/training/db/TrainingDb;", "setTrainingDb", "(Lcom/huami/training/db/TrainingDb;)V", "trainingDb", "<init>", "()V", "training-cloud-api_release"}, k = 1, mv = {1, 5, 1})
public final class NewDbApi {

    @NotNull
    public static final NewDbApi INSTANCE = new NewDbApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "Train-NewDbApi";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static TrainingDb trainingDb;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ TrainingItem a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TrainingItem trainingItem) {
            super(0);
            this.a = trainingItem;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "无效的训练类型, id: " + this.a.id + ", type:" + ((Object) this.a.trainingType);
        }
    }

    private NewDbApi() {
    }

    public final void exitJoinedTraining(long id) {
        ParticipationDao participationDao;
        TrainingDb trainingDb2 = trainingDb;
        if (trainingDb2 == null || (participationDao = trainingDb2.participationDao()) == null) {
            return;
        }
        participationDao.deleteParticipation(id);
    }

    @Nullable
    public final TrainingDb getTrainingDb() {
        return trainingDb;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0084  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    @WorkerThread
    public final void insertOrUpdateJoinedTraining(@NotNull TrainingItem webItem) {
        TrainingType trainingType;
        TrainingType trainingType2;
        TrainingDb trainingDb2;
        List<Label> list;
        int i;
        Difficulty difficulty;
        String str = webItem.trainingType;
        String str2 = null;
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
                        list = webItem.courseLabels;
                        if (list != null && !list.isEmpty()) {
                            str2 = webItem.courseLabels.get(0).value;
                        }
                        String str3 = str2;
                        long j = webItem.id;
                        String str4 = webItem.name;
                        GenderPair genderPair = new GenderPair(webItem.largeListImageUrl.male, webItem.largeListImageUrl.female);
                        i = webItem.difficultyDegree;
                        if (i == 1) {
                            difficulty = Difficulty.JUNIOR;
                        } else if (i == 2) {
                            difficulty = Difficulty.INTERMEDIATE;
                        } else if (i != 3) {
                            difficulty = Difficulty.JUNIOR;
                        } else {
                            difficulty = Difficulty.SENIOR;
                        }
                        trainingDao.insertOrUpdateTraining(new Training(j, trainingType2, str4, genderPair, difficulty, Integer.valueOf(webItem.consumption), Integer.valueOf(webItem.participantNumber), webItem.actionAmount, str3, null, 512, null));
                        ParticipationDao participationDao = trainingDb2.participationDao();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        participationDao.insertOrUpdateParticipation(new Participation(webItem.id, webItem.finishNumber, Long.valueOf(jCurrentTimeMillis), null, Long.valueOf(jCurrentTimeMillis), null, null, 64, null));
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
                    list = webItem.courseLabels;
                    if (list != null) {
                        str2 = webItem.courseLabels.get(0).value;
                    }
                    String str5 = str2;
                    long j2 = webItem.id;
                    String str6 = webItem.name;
                    GenderPair genderPair2 = new GenderPair(webItem.largeListImageUrl.male, webItem.largeListImageUrl.female);
                    i = webItem.difficultyDegree;
                    if (i == 1) {
                        difficulty = Difficulty.JUNIOR;
                    } else if (i == 2) {
                        difficulty = Difficulty.INTERMEDIATE;
                    } else if (i != 3) {
                        difficulty = Difficulty.JUNIOR;
                    } else {
                        difficulty = Difficulty.SENIOR;
                    }
                    trainingDao2.insertOrUpdateTraining(new Training(j2, trainingType2, str6, genderPair2, difficulty, Integer.valueOf(webItem.consumption), Integer.valueOf(webItem.participantNumber), webItem.actionAmount, str5, null, 512, null));
                    ParticipationDao participationDao2 = trainingDb2.participationDao();
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    participationDao2.insertOrUpdateParticipation(new Participation(webItem.id, webItem.finishNumber, Long.valueOf(jCurrentTimeMillis2), null, Long.valueOf(jCurrentTimeMillis2), null, null, 64, null));
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
                list = webItem.courseLabels;
                if (list != null) {
                    str2 = webItem.courseLabels.get(0).value;
                }
                String str7 = str2;
                long j3 = webItem.id;
                String str8 = webItem.name;
                GenderPair genderPair3 = new GenderPair(webItem.largeListImageUrl.male, webItem.largeListImageUrl.female);
                i = webItem.difficultyDegree;
                if (i == 1) {
                    difficulty = Difficulty.JUNIOR;
                } else if (i == 2) {
                    difficulty = Difficulty.INTERMEDIATE;
                } else if (i != 3) {
                    difficulty = Difficulty.JUNIOR;
                } else {
                    difficulty = Difficulty.SENIOR;
                }
                trainingDao3.insertOrUpdateTraining(new Training(j3, trainingType2, str8, genderPair3, difficulty, Integer.valueOf(webItem.consumption), Integer.valueOf(webItem.participantNumber), webItem.actionAmount, str7, null, 512, null));
                ParticipationDao participationDao3 = trainingDb2.participationDao();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                participationDao3.insertOrUpdateParticipation(new Participation(webItem.id, webItem.finishNumber, Long.valueOf(jCurrentTimeMillis3), null, Long.valueOf(jCurrentTimeMillis3), null, null, 64, null));
                return;
            }
        }
        HMLog.warn$default(TAG, null, new a(webItem), 2, null);
    }

    public final void setTrainingDb(@Nullable TrainingDb trainingDb2) {
        trainingDb = trainingDb2;
    }
}
