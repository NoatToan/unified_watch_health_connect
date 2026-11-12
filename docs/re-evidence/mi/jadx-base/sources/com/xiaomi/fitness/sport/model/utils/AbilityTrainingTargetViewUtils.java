package com.xiaomi.fitness.sport.model.utils;

import android.content.Context;
import com.miui.tsmclient.util.StringUtils;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.sport.model.utils.AbilityTrainingTargetViewUtils;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.training_plan_export.manager.ITrainingManager;
import com.xiaomi.fitness.training_plan_export.manager.TrainingManagerExtKt;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourse;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseContent;
import com.xiaomi.fitness.training_plan_export.model.AbilityPlanRunningCourseItem;
import com.xiaomi.fitness.training_plan_export.model.RunningPaceRange;
import defpackage.c1j;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J&\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\"\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070(2\u0006\u0010)\u001a\u00020\u0007H\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0007H\u0002J\u0010\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0007H\u0002J\b\u0010-\u001a\u00020\u0019H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0011¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/sport/model/utils/AbilityTrainingTargetViewUtils;", "Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "course", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourse;)V", "lastSegmentIndex", "", "firstSegmentSetting", "", "needNotifySegment", "flatCourseItems", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/training_plan_export/model/AbilityPlanRunningCourseItem;", "durationFormat", "Ljava/text/SimpleDateFormat;", "getDurationFormat", "()Ljava/text/SimpleDateFormat;", "durationFormat$delegate", "Lkotlin/Lazy;", "paceFormat", "getPaceFormat", "paceFormat$delegate", "needShowTargetView", "buildProgressValue", "", "sportInfo", "Lcom/xiaomi/fitness/sport/model/utils/SportInfo;", "buildProgressDetail", "context", "Landroid/content/Context;", "buildMajorData", "buildProgressPercentage", "buildUnit", "processSportListData", "", "list", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "calcCurCourseItemInfo", "Lkotlin/Triple;", "duration", "getNameByRunningType", "type", "convertTypeToProtocolType", "getSportType", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAbilityTrainingTargetViewUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbilityTrainingTargetViewUtils.kt\ncom/xiaomi/fitness/sport/model/utils/AbilityTrainingTargetViewUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,205:1\n1863#2:206\n1863#2,2:207\n1864#2:209\n1#3:210\n*S KotlinDebug\n*F\n+ 1 AbilityTrainingTargetViewUtils.kt\ncom/xiaomi/fitness/sport/model/utils/AbilityTrainingTargetViewUtils\n*L\n43#1:206\n46#1:207,2\n43#1:209\n*E\n"})
public final class AbilityTrainingTargetViewUtils implements ITargetTitleViewUtils {

    @NotNull
    private static final String TAG = "AbilityTrainingTargetViewUtils";

    @Nullable
    private final AbilityPlanRunningCourse course;
    private int lastSegmentIndex;
    private boolean firstSegmentSetting = true;
    private boolean needNotifySegment = true;

    @NotNull
    private final ArrayList<AbilityPlanRunningCourseItem> flatCourseItems = new ArrayList<>();

    /* JADX INFO: renamed from: durationFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy durationFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ku
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbilityTrainingTargetViewUtils.durationFormat_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: paceFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy paceFormat = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mu
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbilityTrainingTargetViewUtils.paceFormat_delegate$lambda$3();
        }
    });

    public AbilityTrainingTargetViewUtils(@Nullable AbilityPlanRunningCourse abilityPlanRunningCourse) {
        List<AbilityPlanRunningCourseContent> courseContent;
        this.course = abilityPlanRunningCourse;
        this.lastSegmentIndex = -1;
        if (abilityPlanRunningCourse == null || (courseContent = abilityPlanRunningCourse.getCourseContent()) == null) {
            return;
        }
        for (AbilityPlanRunningCourseContent abilityPlanRunningCourseContent : courseContent) {
            if (abilityPlanRunningCourseContent.isLoop()) {
                Integer loopCount = abilityPlanRunningCourseContent.getLoopCount();
                Intrinsics.checkNotNull(loopCount);
                int iIntValue = loopCount.intValue();
                for (int i = 0; i < iIntValue; i++) {
                    Iterator<T> it = abilityPlanRunningCourseContent.getCourseList().iterator();
                    while (it.hasNext()) {
                        this.flatCourseItems.add((AbilityPlanRunningCourseItem) it.next());
                    }
                }
            } else if (!abilityPlanRunningCourseContent.getCourseList().isEmpty()) {
                this.flatCourseItems.add(abilityPlanRunningCourseContent.getCourseList().get(0));
            }
            this.lastSegmentIndex = 0;
        }
    }

    private final Triple<Integer, Integer, Integer> calcCurCourseItemInfo(int duration) {
        boolean z = false;
        if (this.firstSegmentSetting) {
            if (this.flatCourseItems.size() > 1) {
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).segmentSport(convertTypeToProtocolType(this.flatCourseItems.get(0).getType()), convertTypeToProtocolType(this.flatCourseItems.get(1).getType()));
            } else {
                SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).segmentSport(convertTypeToProtocolType(this.flatCourseItems.get(0).getType()), -1);
            }
            this.firstSegmentSetting = false;
        }
        Logger.d(TAG, "calcCurCourseItemInfo: " + duration);
        int duration2 = 0;
        int size = 0;
        while (duration2 < duration && size < this.flatCourseItems.size()) {
            duration2 += this.flatCourseItems.get(size).getDuration() * 60;
            if (duration < duration2) {
                break;
            }
            size++;
        }
        if (size > this.flatCourseItems.size() - 1) {
            size = this.flatCourseItems.size() - 1;
            if (this.needNotifySegment) {
                ISportRemoteState sportManagerExtKt = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE);
                ArrayList<AbilityPlanRunningCourseItem> arrayList = this.flatCourseItems;
                sportManagerExtKt.segmentSport(convertTypeToProtocolType(arrayList.get(arrayList.size() - 1).getType()), convertTypeToProtocolType(-1));
            }
            this.needNotifySegment = false;
            z = true;
        } else if (this.needNotifySegment && size != this.lastSegmentIndex) {
            SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).segmentSport(convertTypeToProtocolType(this.flatCourseItems.get(size - 1).getType()), convertTypeToProtocolType(this.flatCourseItems.get(size).getType()));
            this.lastSegmentIndex = size;
        }
        return new Triple<>(Integer.valueOf(size), Integer.valueOf(!z ? duration - (duration2 - (this.flatCourseItems.get(size).getDuration() * 60)) : this.flatCourseItems.get(size).getDuration() * 60), Integer.valueOf(this.flatCourseItems.get(size).getDuration() * 60));
    }

    private final int convertTypeToProtocolType(int type) {
        if (type == 1) {
            return 10;
        }
        if (type != 2) {
            return type != 3 ? -1 : 12;
        }
        return 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat durationFormat_delegate$lambda$1() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StringUtils.EXPECT_TIME_FORMAT);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat;
    }

    private final SimpleDateFormat getDurationFormat() {
        return (SimpleDateFormat) this.durationFormat.getValue();
    }

    private final String getNameByRunningType(int type) {
        if (type == 1) {
            return ResourceExtKt.getString(c1j.L5);
        }
        if (type != 2) {
            return type != 3 ? "" : ResourceExtKt.getString(c1j.K5);
        }
        return ResourceExtKt.getString(c1j.M5);
    }

    private final SimpleDateFormat getPaceFormat() {
        return (SimpleDateFormat) this.paceFormat.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat paceFormat_delegate$lambda$3() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+00:00"));
        return simpleDateFormat;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildMajorData(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        String str = getDurationFormat().format(new Date(((long) sportInfo.getDuration()) * 1000));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildProgressDetail(@NotNull Context context, @NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Triple<Integer, Integer, Integer> tripleCalcCurCourseItemInfo = calcCurCourseItemInfo(sportInfo.getDuration());
        AbilityPlanRunningCourseItem abilityPlanRunningCourseItem = this.flatCourseItems.get(tripleCalcCurCourseItemInfo.getFirst().intValue());
        Intrinsics.checkNotNullExpressionValue(abilityPlanRunningCourseItem, "get(...)");
        AbilityPlanRunningCourseItem abilityPlanRunningCourseItem2 = abilityPlanRunningCourseItem;
        String nameByRunningType = getNameByRunningType(abilityPlanRunningCourseItem2.getType());
        StringBuilder sb = new StringBuilder();
        sb.append((tripleCalcCurCourseItemInfo.getFirst().intValue() + 1) + "/" + this.flatCourseItems.size() + " " + nameByRunningType);
        if (abilityPlanRunningCourseItem2.getPaceRange() != null) {
            ITrainingManager.Companion companion = ITrainingManager.INSTANCE;
            ITrainingManager trainingManagerExtKt = TrainingManagerExtKt.getInstance(companion);
            RunningPaceRange paceRange = abilityPlanRunningCourseItem2.getPaceRange();
            Intrinsics.checkNotNull(paceRange);
            String strBuildPaceStr = trainingManagerExtKt.buildPaceStr(paceRange.getMinPace());
            ITrainingManager trainingManagerExtKt2 = TrainingManagerExtKt.getInstance(companion);
            RunningPaceRange paceRange2 = abilityPlanRunningCourseItem2.getPaceRange();
            Intrinsics.checkNotNull(paceRange2);
            String strBuildPaceStr2 = trainingManagerExtKt2.buildPaceStr(paceRange2.getMaxPace());
            sb.append("|");
            sb.append(strBuildPaceStr + "-" + strBuildPaceStr2);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildProgressPercentage(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Triple<Integer, Integer, Integer> tripleCalcCurCourseItemInfo = calcCurCourseItemInfo(sportInfo.getDuration());
        return getPaceFormat().format(new Date(tripleCalcCurCourseItemInfo.getSecond().longValue() * 1000)) + "/" + getPaceFormat().format(new Date(tripleCalcCurCourseItemInfo.getThird().longValue() * 1000));
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildProgressValue(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Triple<Integer, Integer, Integer> tripleCalcCurCourseItemInfo = calcCurCourseItemInfo(sportInfo.getDuration());
        int iIntValue = (int) ((tripleCalcCurCourseItemInfo.getSecond().intValue() / tripleCalcCurCourseItemInfo.getThird().floatValue()) * 100);
        return iIntValue > 100 ? "100" : String.valueOf(iIntValue);
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildUnit(@NotNull Context context, @NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        String string = context.getString(c1j.l1);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String getSportType() {
        String name;
        AbilityPlanRunningCourse abilityPlanRunningCourse = this.course;
        return (abilityPlanRunningCourse == null || (name = abilityPlanRunningCourse.getName()) == null) ? "" : name;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    public boolean needShowTargetView() {
        AbilityPlanRunningCourse abilityPlanRunningCourse = this.course;
        return abilityPlanRunningCourse != null && (abilityPlanRunningCourse.getCourseContent().isEmpty() ^ true) && this.course.getTotalDuration() > 0;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    public void processSportListData(@NotNull Context context, @NotNull SportInfo sportInfo, @NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Intrinsics.checkNotNullParameter(list, "list");
        list.set(0, new SportingItemData(String.valueOf((int) (sportInfo.getCalorie() / 1000)), context.getString(c1j.u0), null, 4, null));
        SportingItemData sportingItemData = list.get(1);
        list.set(1, CommonSportModelUtil.INSTANCE.getDistance(sportInfo.getDistance()));
        list.set(2, sportingItemData);
    }
}
