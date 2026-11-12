package com.xiaomi.fitness.sport.model.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import com.xiaomi.fitness.sport.bean.SportingItemData;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.c1j;
import defpackage.zxi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/model/utils/HabitTrainingTargetViewUtils;", "Lcom/xiaomi/fitness/sport/model/utils/ITargetTitleViewUtils;", "habitDayPlan", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "<init>", "(Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;)V", "needShowTargetView", "", "buildProgressPercentage", "", "sportInfo", "Lcom/xiaomi/fitness/sport/model/utils/SportInfo;", "buildProgressValue", "buildProgressDetail", "context", "Landroid/content/Context;", "buildMajorData", "buildUnit", "processSportListData", "", "list", "", "Lcom/xiaomi/fitness/sport/bean/SportingItemData;", "getSportType", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitTrainingTargetViewUtils implements ITargetTitleViewUtils {

    @Nullable
    private final HabitDayPlan habitDayPlan;

    public HabitTrainingTargetViewUtils(@Nullable HabitDayPlan habitDayPlan) {
        this.habitDayPlan = habitDayPlan;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildMajorData(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        return CommonSportModelUtil.INSTANCE.getDistance(sportInfo.getDistance()).getData();
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @SuppressLint({"StringFormatMatches"})
    @NotNull
    public String buildProgressDetail(@NotNull Context context, @NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Resources resources = context.getResources();
        int i = c1j.f5;
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        Intrinsics.checkNotNull(habitDayPlan);
        String string = resources.getString(i, Float.valueOf(habitDayPlan.getDistance()));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildProgressPercentage(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        return buildProgressValue(sportInfo) + "%";
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildProgressValue(@NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        float distance = sportInfo.getDistance();
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        Intrinsics.checkNotNull(habitDayPlan);
        float distance2 = (distance / (habitDayPlan.getDistance() * 1000)) * 100;
        return distance2 >= 100.0f ? "100" : String.valueOf((int) distance2);
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String buildUnit(@NotNull Context context, @NotNull SportInfo sportInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        if (sportInfo.getDistance() < 1000) {
            String quantityString = context.getResources().getQuantityString(zxi.q, sportInfo.getDistance());
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        }
        String quantityString2 = context.getResources().getQuantityString(zxi.p, sportInfo.getDistance() / 1000);
        Intrinsics.checkNotNull(quantityString2);
        return quantityString2;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    @NotNull
    public String getSportType() {
        return "";
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    public boolean needShowTargetView() {
        HabitDayPlan habitDayPlan = this.habitDayPlan;
        return habitDayPlan != null && habitDayPlan.getDistance() > 0.0f;
    }

    @Override // com.xiaomi.fitness.sport.model.utils.ITargetTitleViewUtils
    public void processSportListData(@NotNull Context context, @NotNull SportInfo sportInfo, @NotNull List<SportingItemData> list) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sportInfo, "sportInfo");
        Intrinsics.checkNotNullParameter(list, "list");
        SportingItemData sportingItemData = list.get(2);
        list.set(2, list.get(1));
        list.set(1, sportingItemData);
    }
}
