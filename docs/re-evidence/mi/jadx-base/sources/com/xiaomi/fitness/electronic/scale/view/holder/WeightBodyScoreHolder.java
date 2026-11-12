package com.xiaomi.fitness.electronic.scale.view.holder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import com.xiaomi.fitness.electronic.scale.view.BodyIndicatorEstimationCardView;
import com.xiaomi.fitness.electronic.scale.view.WeightEvaluationDialog;
import com.xiaomi.fitness.electronic.scale.view.holder.WeightBodyScoreHolder;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.f4b;
import defpackage.gui;
import defpackage.zzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyScoreHolder;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "bodyIndicatorEstimation", "Lcom/xiaomi/fitness/electronic/scale/view/BodyIndicatorEstimationCardView;", "maxHeight", "", "bindData", "", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "lastWeightItem", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "showEvaluationDialog", "item", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightBodyScoreHolder {

    @NotNull
    public static final String TAG = "WeightBodyScoreHolder";

    @NotNull
    private BodyIndicatorEstimationCardView bodyIndicatorEstimation;

    @NotNull
    private final Context context;
    private int maxHeight;

    public WeightBodyScoreHolder(@NotNull Context context, @NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.context = context;
        this.bodyIndicatorEstimation = (BodyIndicatorEstimationCardView) rootView.findViewById(bri.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$0(WeightBodyScoreHolder this$0, WeightDataItem bmiWeightDataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bmiWeightDataItem, "$bmiWeightDataItem");
        this$0.showEvaluationDialog(bmiWeightDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindData$lambda$1(WeightBodyScoreHolder this$0, WeightDataItem bodyFatRateWeightDataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(bodyFatRateWeightDataItem, "$bodyFatRateWeightDataItem");
        this$0.showEvaluationDialog(bodyFatRateWeightDataItem);
    }

    private final void showEvaluationDialog(WeightDataItem item) {
        WeightEvaluationDialog weightEvaluationDialogCreate = new WeightEvaluationDialog.Builder("weight_evaluation").setCustomLayoutId(gui.H).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(zzi.H2).create();
        Intrinsics.checkNotNullExpressionValue(weightEvaluationDialogCreate, "create(...)");
        WeightEvaluationDialog weightEvaluationDialog = weightEvaluationDialogCreate;
        weightEvaluationDialog.updateData(item);
        Context context = this.context;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        weightEvaluationDialog.showIfNeed(((BaseActivity) context).getSupportFragmentManager());
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f3  */
    public final void bindData(@Nullable WeightItem weightItem, @Nullable WeightItem lastWeightItem, @NotNull VirtualAccount virtualAccount) {
        float fFloatValue;
        float fFloatValue2;
        Float bodyFatRate;
        Float bmi;
        Integer bodyScore;
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        Logger.i("WeightBodyScoreHolder", "weightItem is $" + f4b.c(weightItem));
        if (lastWeightItem == null) {
            Logger.i("WeightBodyScoreHolder", "lastWeightItem is null");
        } else {
            Logger.i("WeightBodyScoreHolder", "lastWeightItem : " + f4b.c(lastWeightItem));
        }
        this.maxHeight = 0;
        int iIntValue = (weightItem == null || (bodyScore = weightItem.getBodyScore()) == null) ? 0 : bodyScore.intValue();
        if (iIntValue <= 0) {
            ViewExtKt.gone(this.bodyIndicatorEstimation);
            return;
        }
        ViewExtKt.visible(this.bodyIndicatorEstimation);
        if ((weightItem != null ? weightItem.getBmi() : null) == null) {
            fFloatValue = 0.0f;
        } else {
            if ((lastWeightItem != null ? lastWeightItem.getBmi() : null) == null || Intrinsics.areEqual(weightItem.getBmi(), 0.0f) || Intrinsics.areEqual(lastWeightItem.getBmi(), 0.0f)) {
                fFloatValue = 0.0f;
            } else {
                Float bmi2 = weightItem.getBmi();
                Intrinsics.checkNotNull(bmi2);
                float fFloatValue3 = bmi2.floatValue();
                Float bmi3 = lastWeightItem.getBmi();
                Intrinsics.checkNotNull(bmi3);
                fFloatValue = fFloatValue3 - bmi3.floatValue();
            }
        }
        this.bodyIndicatorEstimation.updateBmiView(weightItem != null ? weightItem.getBmi() : null, Float.valueOf(fFloatValue));
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null) {
            fFloatValue2 = 0.0f;
        } else {
            if ((lastWeightItem != null ? lastWeightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f) || Intrinsics.areEqual(lastWeightItem.getBodyFatRate(), 0.0f)) {
                fFloatValue2 = 0.0f;
            } else {
                Float bodyFatRate2 = weightItem.getBodyFatRate();
                Intrinsics.checkNotNull(bodyFatRate2);
                float fFloatValue4 = bodyFatRate2.floatValue();
                Float bodyFatRate3 = lastWeightItem.getBodyFatRate();
                Intrinsics.checkNotNull(bodyFatRate3);
                fFloatValue2 = fFloatValue4 - bodyFatRate3.floatValue();
            }
        }
        this.bodyIndicatorEstimation.updateBodyFateRateView(weightItem != null ? weightItem.getBodyFatRate() : null, Float.valueOf(fFloatValue2));
        this.bodyIndicatorEstimation.updateBmiScoreAndDescription(iIntValue, weightItem != null ? weightItem.getSomatotype() : null);
        this.bodyIndicatorEstimation.updateBodyShapeImageAndName(weightItem != null ? weightItem.getBodyShape() : null);
        float fFloatValue5 = (weightItem == null || (bmi = weightItem.getBmi()) == null) ? 0.0f : bmi.floatValue();
        if (fFloatValue5 > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
            Float fValueOf = Float.valueOf(fFloatValue5);
            Intrinsics.checkNotNull(weightItem);
            final WeightDataItem weightDataItemBuildWeightDataByType = weightEvaluationHelper.buildWeightDataByType(0, fValueOf, weightItem, virtualAccount);
            this.bodyIndicatorEstimation.setBmiClickListener(new View.OnClickListener() { // from class: yer
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightBodyScoreHolder.bindData$lambda$0(this.f40108a, weightDataItemBuildWeightDataByType, view);
                }
            });
        }
        float fFloatValue6 = (weightItem == null || (bodyFatRate = weightItem.getBodyFatRate()) == null) ? 0.0f : bodyFatRate.floatValue();
        if (fFloatValue6 > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper2 = WeightEvaluationHelper.INSTANCE;
            Float fValueOf2 = Float.valueOf(fFloatValue6);
            Intrinsics.checkNotNull(weightItem);
            final WeightDataItem weightDataItemBuildWeightDataByType2 = weightEvaluationHelper2.buildWeightDataByType(1, fValueOf2, weightItem, virtualAccount);
            this.bodyIndicatorEstimation.setBodyFatRateClickListener(new View.OnClickListener() { // from class: afr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeightBodyScoreHolder.bindData$lambda$1(this.f961a, weightDataItemBuildWeightDataByType2, view);
                }
            });
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
