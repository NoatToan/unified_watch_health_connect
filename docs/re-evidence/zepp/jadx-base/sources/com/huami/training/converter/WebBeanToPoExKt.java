package com.huami.training.converter;

import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.training.api.DifficultyBo;
import com.huami.training.api.DisplayModeBo;
import com.huami.training.api.DtoConvertersKt;
import com.huami.training.api.TargetModeBo;
import com.huami.training.api.TrainingTypeBo;
import com.huami.training.api.pojo.EntranceCardBean;
import com.huami.training.api.pojo.EntranceCardExtension;
import com.huami.training.api.pojo.EntranceKingBean;
import com.huami.training.api.pojo.ExtensionClassify;
import com.huami.training.api.pojo.FilterModeBean;
import com.huami.training.api.pojo.GenderStringPair;
import com.huami.training.api.pojo.JoinedTrainingBean;
import com.huami.training.api.pojo.LabelBean;
import com.huami.training.api.pojo.PlanTrainingBean;
import com.huami.training.api.pojo.TagBean;
import com.huami.training.api.pojo.TrainingBean;
import com.huami.training.api.pojo.TrainingPlanBean;
import com.huami.training.db.po.EntranceKing;
import com.huami.training.db.po.FilterMode;
import com.huami.training.db.po.Participation;
import com.huami.training.db.po.PlanTraining;
import com.huami.training.db.po.Subject;
import com.huami.training.db.po.Tag;
import com.huami.training.db.po.Training;
import com.huami.training.db.po.TrainingPlan;
import com.huami.training.dto.Difficulty;
import com.huami.training.dto.DisplayMode;
import com.huami.training.dto.GenderPair;
import com.huami.training.dto.TrainingType;
import com.xiaomi.hm.health.traininglib.util.TrainingDateUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0003\u001a\n\u0010\b\u001a\u00020\u0007*\u00020\u0006\u001a\u0012\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u000e\u001a\n\u0010\u0013\u001a\u00020\u0012*\u00020\u0011\u001a\n\u0010\u0016\u001a\u00020\u0015*\u00020\u0014\u001a\n\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/training/api/pojo/TrainingBean;", "Lcom/huami/training/db/po/Training;", "toTrainingPo", "Lcom/huami/training/api/pojo/JoinedTrainingBean;", "Lcom/huami/training/db/po/Participation;", "toParticipationPo", "Lcom/huami/training/api/pojo/TrainingPlanBean;", "Lcom/huami/training/db/po/TrainingPlan;", "toTrainingPlanPo", "Lcom/huami/training/api/pojo/PlanTrainingBean;", "", BloodPressureConst.ParamKey.PLANID, "Lcom/huami/training/db/po/PlanTraining;", "toPlanTrainingPo", "Lcom/huami/training/api/pojo/EntranceKingBean;", "Lcom/huami/training/db/po/EntranceKing;", "toEntranceKingPo", "Lcom/huami/training/api/pojo/EntranceCardBean;", "Lcom/huami/training/db/po/Subject;", "toEntranceSubjectPo", "Lcom/huami/training/api/pojo/FilterModeBean;", "Lcom/huami/training/db/po/FilterMode;", "toFilterModePo", "Lcom/huami/training/api/pojo/TagBean;", "Lcom/huami/training/db/po/Tag;", "toTodayTagPo", "lib_release"}, k = 2, mv = {1, 5, 1})
public final class WebBeanToPoExKt {
    @NotNull
    public static final EntranceKing toEntranceKingPo(@NotNull EntranceKingBean entranceKingBean) {
        return new EntranceKing(entranceKingBean.getIconUrl(), entranceKingBean.getName(), entranceKingBean.getJumpType());
    }

    @NotNull
    public static final Subject toEntranceSubjectPo(@NotNull EntranceCardBean entranceCardBean) {
        ExtensionClassify classify;
        DisplayModeBo displayMode;
        String id = entranceCardBean.getId();
        String title = entranceCardBean.getTitle();
        String subtitle = entranceCardBean.getSubtitle();
        String imageUrl = entranceCardBean.getImageUrl();
        String targetUrl = entranceCardBean.getTargetUrl();
        EntranceCardExtension extensions = entranceCardBean.getExtensions();
        DisplayMode dto = (extensions == null || (classify = extensions.getClassify()) == null || (displayMode = classify.getDisplayMode()) == null) ? null : DtoConvertersKt.toDto(displayMode);
        TargetModeBo targetMode = entranceCardBean.getTargetMode();
        return new Subject(id, title, subtitle, imageUrl, targetUrl, targetMode != null ? DtoConvertersKt.toDto(targetMode) : null, dto);
    }

    @NotNull
    public static final FilterMode toFilterModePo(@NotNull FilterModeBean filterModeBean) {
        return new FilterMode(filterModeBean.getText(), filterModeBean.getJumpType(), filterModeBean.getDefaultOrder(), filterModeBean.getSupportOrders());
    }

    @Nullable
    public static final Participation toParticipationPo(@NotNull JoinedTrainingBean joinedTrainingBean) {
        if (joinedTrainingBean.getTrainingType() == null) {
            return null;
        }
        long id = joinedTrainingBean.getId();
        Integer finishedTimes = joinedTrainingBean.getFinishedTimes();
        int iIntValue = finishedTimes == null ? 0 : finishedTimes.intValue();
        Long expirationDate = joinedTrainingBean.getExpirationDate();
        return new Participation(id, iIntValue, joinedTrainingBean.getLastTrainingTime() == null ? Long.valueOf(joinedTrainingBean.getUpdateTime()) : null, joinedTrainingBean.getLastTrainingTime(), Long.valueOf(joinedTrainingBean.getUpdateTime()), expirationDate, null, 64, null);
    }

    @NotNull
    public static final PlanTraining toPlanTrainingPo(@NotNull PlanTrainingBean planTrainingBean, long j) {
        return new PlanTraining(j, planTrainingBean.getId(), planTrainingBean.getName(), planTrainingBean.getDayOfWeek(), planTrainingBean.getDuration(), planTrainingBean.getConsumption(), planTrainingBean.isFinished(), planTrainingBean.getDayIndex(), planTrainingBean.getArticleId(), planTrainingBean.getArticleTitle(), planTrainingBean.getArticleDescription(), planTrainingBean.getArticleLink(), planTrainingBean.getArticleImgUrl());
    }

    @NotNull
    public static final Tag toTodayTagPo(@NotNull TagBean tagBean) {
        return new Tag(tagBean.getId(), tagBean.getName());
    }

    @NotNull
    public static final TrainingPlan toTrainingPlanPo(@NotNull TrainingPlanBean trainingPlanBean) {
        return new TrainingPlan(trainingPlanBean.getPlanId(), trainingPlanBean.getName(), trainingPlanBean.getListImageUrl(), trainingPlanBean.getDetailImageUrl(), trainingPlanBean.getConsumption(), trainingPlanBean.getIntroduction(), DtoConvertersKt.toDto(trainingPlanBean.getType()), DtoConvertersKt.toDto(trainingPlanBean.getDifficulty()), trainingPlanBean.getDuration(), trainingPlanBean.getTrainingDays(), trainingPlanBean.getTotalDays(), new SimpleDateFormat(TrainingDateUtils.PATTERN_YMD, Locale.getDefault()).parse(trainingPlanBean.getStartDay()).getTime());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    @Nullable
    public static final Training toTrainingPo(@NotNull TrainingBean trainingBean) {
        String value;
        TrainingTypeBo trainingType = trainingBean.getTrainingType();
        if (trainingType == null) {
            return null;
        }
        long id = trainingBean.getId();
        TrainingType dto = DtoConvertersKt.toDto(trainingType);
        GenderStringPair largeListImageUrl = trainingBean.getLargeListImageUrl();
        GenderPair genderPair = largeListImageUrl == null ? null : new GenderPair(largeListImageUrl.getMale(), largeListImageUrl.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String());
        String name = trainingBean.getName();
        DifficultyBo difficulty = trainingBean.getDifficulty();
        Difficulty dto2 = difficulty == null ? null : DtoConvertersKt.toDto(difficulty);
        Integer contentCount = trainingBean.getContentCount();
        int iIntValue = contentCount == null ? 0 : contentCount.intValue();
        int calorie = trainingBean.getCalorie();
        int participants = trainingBean.getParticipants();
        List<LabelBean> label = trainingBean.getLabel();
        if (label == null) {
            value = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : label) {
                if (((LabelBean) obj).getValue() != null) {
                    arrayList.add(obj);
                }
            }
            LabelBean labelBean = (LabelBean) CollectionsKt.getOrNull(arrayList, 0);
            if (labelBean == null) {
                value = null;
            } else {
                value = labelBean.getValue();
            }
        }
        GenderStringPair squareListImageUrl = trainingBean.getSquareListImageUrl();
        return new Training(id, dto, name, genderPair, dto2, Integer.valueOf(calorie), Integer.valueOf(participants), Integer.valueOf(iIntValue), value, squareListImageUrl == null ? null : new GenderPair(squareListImageUrl.getMale(), squareListImageUrl.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String()));
    }

    @Nullable
    public static final Training toTrainingPo(@NotNull JoinedTrainingBean joinedTrainingBean) {
        GenderPair genderPair;
        GenderPair genderPair2;
        TrainingTypeBo trainingType = joinedTrainingBean.getTrainingType();
        if (trainingType == null) {
            return null;
        }
        long id = joinedTrainingBean.getId();
        TrainingType dto = DtoConvertersKt.toDto(trainingType);
        String name = joinedTrainingBean.getName();
        GenderStringPair largeListImageUrl = joinedTrainingBean.getLargeListImageUrl();
        if (largeListImageUrl == null) {
            genderPair = null;
        } else {
            genderPair = new GenderPair(largeListImageUrl.getMale(), largeListImageUrl.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String());
        }
        DifficultyBo difficulty = joinedTrainingBean.getDifficulty();
        Difficulty dto2 = difficulty == null ? null : DtoConvertersKt.toDto(difficulty);
        Integer contentCount = joinedTrainingBean.getContentCount();
        GenderStringPair squareImageUrl = joinedTrainingBean.getSquareImageUrl();
        if (squareImageUrl == null) {
            genderPair2 = null;
        } else {
            genderPair2 = new GenderPair(squareImageUrl.getMale(), squareImageUrl.getCom.xiaomi.hm.health.HMIntentHandler.NAME_FEMALE java.lang.String());
        }
        return new Training(id, dto, name, genderPair, dto2, 12, null, contentCount, null, genderPair2, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, null);
    }
}
