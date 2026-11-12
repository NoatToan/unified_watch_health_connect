package com.xiaomi.fitness.health.weight.holder;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.health.weight.holder.WeightBodyScoreHolder;
import com.xiaomi.fitness.health.weight.ui.view.BodyIndicatorEstimationCardView;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.view.WeightEvaluationDialog;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.jui;
import defpackage.qzb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightBodyScoreHolder;", "", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "item", "", "showEvaluationDialog", "(Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;)V", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightItem", "lastWeightItem", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lqzb;", "binding", "Lqzb;", "getBinding", "()Lqzb;", "<init>", "(Landroidx/fragment/app/Fragment;Lqzb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightBodyScoreHolder {

    @NotNull
    public static final String TAG = "WeightBodyScoreHolder";

    @NotNull
    private final qzb binding;

    @NotNull
    private final Fragment parent;

    public WeightBodyScoreHolder(@NotNull Fragment parent, @NotNull qzb binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$2(WeightBodyScoreHolder this$0, WeightDataItem bmiWeightDataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bmiWeightDataItem, "$bmiWeightDataItem");
        this$0.showEvaluationDialog(bmiWeightDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$3(WeightBodyScoreHolder this$0, WeightDataItem bodyFatRateWeightDataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bodyFatRateWeightDataItem, "$bodyFatRateWeightDataItem");
        this$0.showEvaluationDialog(bodyFatRateWeightDataItem);
    }

    private final void showEvaluationDialog(WeightDataItem item) {
        WeightEvaluationDialog weightEvaluationDialogCreate = new WeightEvaluationDialog.Builder("weight_evaluation").setCustomLayoutId(jui.q3).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(c0j.E4).create();
        Intrinsics.checkNotNullExpressionValue(weightEvaluationDialogCreate, "create(...)");
        WeightEvaluationDialog weightEvaluationDialog = weightEvaluationDialogCreate;
        weightEvaluationDialog.updateData(item);
        weightEvaluationDialog.showIfNeed(this.parent.getChildFragmentManager());
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    public final void bindData(@Nullable WeightItem weightItem, @Nullable WeightItem lastWeightItem) {
        float fCalculateBmi;
        float fCalculateBmi2;
        float fFloatValue;
        Float bodyFatRate;
        Float bmi;
        Integer bodyScore;
        int iIntValue = (weightItem == null || (bodyScore = weightItem.getBodyScore()) == null) ? 0 : bodyScore.intValue();
        if (iIntValue <= 0) {
            BodyIndicatorEstimationCardView bodyIndicatorEstimation = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(bodyIndicatorEstimation, "bodyIndicatorEstimation");
            ViewExtKt.gone(bodyIndicatorEstimation);
            return;
        }
        BodyIndicatorEstimationCardView bodyIndicatorEstimation2 = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(bodyIndicatorEstimation2, "bodyIndicatorEstimation");
        ViewExtKt.visible(bodyIndicatorEstimation2);
        if (weightItem == null) {
            fCalculateBmi = 0.0f;
        } else if (weightItem.getBmi() == null || Intrinsics.areEqual(weightItem.getBmi(), 0.0f)) {
            fCalculateBmi = WeightEvaluationHelper.INSTANCE.calculateBmi(weightItem.getWeight(), HealthUtil.getHeight());
        } else {
            Float bmi2 = weightItem.getBmi();
            Intrinsics.checkNotNull(bmi2);
            fCalculateBmi = bmi2.floatValue();
        }
        if (lastWeightItem == null) {
            fCalculateBmi2 = 0.0f;
        } else if (lastWeightItem.getBmi() == null || Intrinsics.areEqual(lastWeightItem.getBmi(), 0.0f)) {
            fCalculateBmi2 = WeightEvaluationHelper.INSTANCE.calculateBmi(lastWeightItem.getWeight(), HealthUtil.getHeight());
        } else {
            Float bmi3 = lastWeightItem.getBmi();
            Intrinsics.checkNotNull(bmi3);
            fCalculateBmi2 = bmi3.floatValue();
        }
        this.binding.A.updateBmiView(Float.valueOf(fCalculateBmi), Float.valueOf((fCalculateBmi == 0.0f || fCalculateBmi2 == 0.0f) ? 0.0f : fCalculateBmi - fCalculateBmi2));
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null) {
            fFloatValue = 0.0f;
        } else {
            if ((lastWeightItem != null ? lastWeightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f) || Intrinsics.areEqual(lastWeightItem.getBodyFatRate(), 0.0f)) {
                fFloatValue = 0.0f;
            } else {
                Float bodyFatRate2 = weightItem.getBodyFatRate();
                Intrinsics.checkNotNull(bodyFatRate2);
                float fFloatValue2 = bodyFatRate2.floatValue();
                Float bodyFatRate3 = lastWeightItem.getBodyFatRate();
                Intrinsics.checkNotNull(bodyFatRate3);
                fFloatValue = fFloatValue2 - bodyFatRate3.floatValue();
            }
        }
        this.binding.A.updateBodyFateRateView(weightItem != null ? weightItem.getBodyFatRate() : null, Float.valueOf(fFloatValue));
        this.binding.A.updateBmiScoreAndDescription(iIntValue, weightItem != null ? weightItem.getSomatotype() : null, weightItem != null ? weightItem.getScoreStandardType() : null);
        this.binding.A.updateBodyShapeImageAndName(weightItem != null ? weightItem.getBodyShape() : null);
        float fFloatValue3 = (weightItem == null || (bmi = weightItem.getBmi()) == null) ? 0.0f : bmi.floatValue();
        if (fFloatValue3 > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
            Float fValueOf = Float.valueOf(fFloatValue3);
            Intrinsics.checkNotNull(weightItem);
            final WeightDataItem weightDataItemBuildWeightDataByType = weightEvaluationHelper.buildWeightDataByType(0, fValueOf, weightItem);
            this.binding.A.setBmiClickListener(new View.OnClickListener() { // from class: xer
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightBodyScoreHolder.bindData$lambda$2(this.f39056a, weightDataItemBuildWeightDataByType, view);
                }
            });
        }
        float fFloatValue4 = (weightItem == null || (bodyFatRate = weightItem.getBodyFatRate()) == null) ? 0.0f : bodyFatRate.floatValue();
        if (fFloatValue4 > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper2 = WeightEvaluationHelper.INSTANCE;
            Float fValueOf2 = Float.valueOf(fFloatValue4);
            Intrinsics.checkNotNull(weightItem);
            final WeightDataItem weightDataItemBuildWeightDataByType2 = weightEvaluationHelper2.buildWeightDataByType(1, fValueOf2, weightItem);
            this.binding.A.setBodyFatRateClickListener(new View.OnClickListener() { // from class: zer
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightBodyScoreHolder.bindData$lambda$3(this.f41201a, weightDataItemBuildWeightDataByType2, view);
                }
            });
        }
    }

    @NotNull
    public final qzb getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
