package com.huami.training.converter;

import com.huami.tools.log.HMLog;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.JoinedTraining;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.TrainingPlanWithTrainings;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TargetMode;
import com.huami.training.dto.TrainingPlanState;
import com.huami.training.dto.TrainingType;
import com.huami.training.util.DateUtilsKt;
import com.huami.training.util.PlanUtils;
import com.huami.training.util.TrainingUtils;
import com.huami.training.vo.EntranceKingVo;
import com.huami.training.vo.EntranceSubjectVo;
import com.huami.training.vo.FilterModeVo;
import com.huami.training.vo.JoinedCourseVo;
import com.huami.training.vo.TagVo;
import com.huami.training.vo.TrainingPlanVo;
import com.huami.training.vo.TrainingVo;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\u0012\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007\u001a\n\u0010\r\u001a\u00020\f*\u00020\u000b\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/training/db/po/TrainingPlanWithTrainings;", "Lcom/huami/training/vo/TrainingPlanVo;", "toTrainingPlanVo", "Lcom/huami/training/db/po/Subject;", "Lcom/huami/training/vo/EntranceSubjectVo;", "toEntranceSubjectVo", "Lcom/huami/training/db/po/Training;", "", "isMale", "Lcom/huami/training/vo/TrainingVo;", "toTrainingVo", "Lcom/huami/training/db/po/JoinedTraining;", "Lcom/huami/training/vo/JoinedCourseVo;", "toJoinedCourseVo", "Lcom/huami/training/db/po/FilterMode;", "Lcom/huami/training/vo/FilterModeVo;", "toFilterModeVo", "Lcom/huami/training/db/po/EntranceKing;", "Lcom/huami/training/vo/EntranceKingVo;", "toEntranceKingVo", "Lcom/huami/training/db/po/Tag;", "Lcom/huami/training/vo/TagVo;", "toTodayTagVo", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class PoToVoExKt {
    @NotNull
    public static final EntranceKingVo toEntranceKingVo(@NotNull EntranceKing entranceKing) {
        return new EntranceKingVo(entranceKing.getIconUrl(), entranceKing.getName(), entranceKing.getJumpType());
    }

    @NotNull
    public static final EntranceSubjectVo toEntranceSubjectVo(@NotNull Subject subject) {
        Pair<Long, TrainingType> training = subject.getTargetMode() == TargetMode.INTERNAL ? TrainingUtils.INSTANCE.parseTraining(subject.getTargetUrl()) : new Pair<>(null, null);
        return new EntranceSubjectVo(subject.getId(), subject.getTitle(), subject.getSubtitle(), subject.getImageUrl(), subject.getTargetUrl(), subject.getTargetMode(), subject.getDisplayMode(), training.component2(), training.component1());
    }

    @NotNull
    public static final FilterModeVo toFilterModeVo(@NotNull FilterMode filterMode) {
        return new FilterModeVo(filterMode.getText(), filterMode.getJumpType(), filterMode.getDefaultOrder(), filterMode.getSupportOrders());
    }

    @NotNull
    public static final JoinedCourseVo toJoinedCourseVo(@NotNull JoinedTraining joinedTraining) {
        long id = joinedTraining.getId();
        TrainingType type = joinedTraining.getType();
        String name = joinedTraining.getName();
        String str = name == null ? "" : name;
        Integer contentCount = joinedTraining.getContentCount();
        return new JoinedCourseVo(id, str, contentCount == null ? 0 : contentCount.intValue(), joinedTraining.getTrainTimes(), joinedTraining.getExpiry() != null ? TrainingUtils.INSTANCE.parseExpiry(joinedTraining.getExpiry().longValue()) : "", joinedTraining.getHasDownloaded(), type);
    }

    @NotNull
    public static final TagVo toTodayTagVo(@NotNull Tag tag) {
        return new TagVo(tag.getTagId(), tag.getName());
    }

    @Nullable
    public static final TrainingPlanVo toTrainingPlanVo(@NotNull TrainingPlanWithTrainings trainingPlanWithTrainings) {
        TrainingPlanState trainingPlanState;
        Long duration;
        Integer numValueOf;
        int i;
        if (DateUtilsKt.isAfterDay(Calendar.getInstance().getTime(), DateUtilsKt.daysAfter(new Date(trainingPlanWithTrainings.getPlan().getStartDay()), trainingPlanWithTrainings.getPlan().getTotalDays() - 1))) {
            return null;
        }
        Pair<Integer, PlanTraining> pairFindTodayTraining = PlanUtils.INSTANCE.findTodayTraining(trainingPlanWithTrainings.getPlan(), trainingPlanWithTrainings.getTrainings());
        int iIntValue = pairFindTodayTraining.component1().intValue();
        PlanTraining planTrainingComponent2 = pairFindTodayTraining.component2();
        int i2 = 0;
        if (planTrainingComponent2 != null) {
            if (planTrainingComponent2.getTrainingId() == 0) {
                trainingPlanState = TrainingPlanState.TODAY_REST;
            } else {
                trainingPlanState = planTrainingComponent2.isFinished() ? TrainingPlanState.TODAY_FINISHED : TrainingPlanState.ONGOING;
            }
        } else {
            if (iIntValue <= 0) {
                HMLog.w("TrainingPlanWithTrainings.toTrainingPlanVo()", "训练计划既没有找到今日的训练，也没有等待的天数，数据有误", new Object[0]);
                return null;
            }
            trainingPlanState = TrainingPlanState.WAIT;
        }
        TrainingPlanState trainingPlanState2 = trainingPlanState;
        if (planTrainingComponent2 == null || (duration = planTrainingComponent2.getDuration()) == null) {
            numValueOf = null;
        } else {
            long jLongValue = duration.longValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int minutes = (int) timeUnit.toMinutes(jLongValue);
            if (((int) timeUnit.toSeconds(jLongValue)) - (minutes * 60) >= 30) {
                minutes++;
            } else if (minutes == 0) {
                minutes = 1;
            }
            numValueOf = Integer.valueOf(minutes);
        }
        long id = trainingPlanWithTrainings.getPlan().getId();
        String name = trainingPlanWithTrainings.getPlan().getName();
        String detailImageUrl = trainingPlanWithTrainings.getPlan().getDetailImageUrl();
        int consumption = trainingPlanWithTrainings.getPlan().getConsumption();
        Difficulty difficulty = trainingPlanWithTrainings.getPlan().getDifficulty();
        int totalDays = trainingPlanWithTrainings.getPlan().getTotalDays();
        int trainingDays = trainingPlanWithTrainings.getPlan().getTrainingDays();
        List<PlanTraining> trainings = trainingPlanWithTrainings.getTrainings();
        if ((trainings instanceof Collection) && trainings.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it2 = trainings.iterator();
            while (it2.hasNext()) {
                if (((PlanTraining) it2.next()).isFinished() && (i2 = i2 + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
            i = i2;
        }
        return new TrainingPlanVo(id, trainingPlanState2, name, detailImageUrl, consumption, totalDays, trainingDays, i, iIntValue, planTrainingComponent2 == null ? null : Integer.valueOf(planTrainingComponent2.getDayIndex() + 1), difficulty, numValueOf, planTrainingComponent2 != null ? planTrainingComponent2.getName() : null);
    }

    @NotNull
    public static final TrainingVo toTrainingVo(@NotNull Training training, boolean z) {
        String male;
        long id = training.getId();
        String name = training.getName();
        String str = "";
        String str2 = name == null ? "" : name;
        GenderPair<String> listImage = training.getListImage();
        if (listImage != null) {
            String male2 = z ? listImage.getMale() : listImage.getFemale();
            if (male2 != null) {
                str = male2;
            }
        }
        Difficulty difficulty = training.getDifficulty();
        Integer contentCount = training.getContentCount();
        int iIntValue = contentCount == null ? 0 : contentCount.intValue();
        Integer consumption = training.getConsumption();
        int iIntValue2 = consumption == null ? 0 : consumption.intValue();
        Integer participants = training.getParticipants();
        int iIntValue3 = participants == null ? 0 : participants.intValue();
        TrainingType type = training.getType();
        String label = training.getLabel();
        GenderPair<String> squareImage = training.getSquareImage();
        if (squareImage == null) {
            male = null;
        } else {
            male = z ? squareImage.getMale() : squareImage.getFemale();
        }
        return new TrainingVo(id, str, str2, difficulty, iIntValue, iIntValue2, iIntValue3, type, label, male);
    }
}
