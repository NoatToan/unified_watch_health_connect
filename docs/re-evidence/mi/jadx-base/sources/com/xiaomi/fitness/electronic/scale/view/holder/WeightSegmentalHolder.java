package com.xiaomi.fitness.electronic.scale.view.holder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import com.xiaomi.fitness.electronic.scale.util.WeightParamUtil;
import com.xiaomi.fitness.electronic.scale.view.SEGMENTAL;
import com.xiaomi.fitness.electronic.scale.view.WeightSegmentalView;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.export.WeightExtKt;
import defpackage.bri;
import defpackage.ffe;
import defpackage.lni;
import defpackage.zzi;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u001f2\b\u0010%\u001a\u0004\u0018\u00010&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightSegmentalHolder;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "segmentalType", "Lcom/xiaomi/fitness/electronic/scale/view/SEGMENTAL;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/xiaomi/fitness/electronic/scale/view/SEGMENTAL;)V", "getContext", "()Landroid/content/Context;", "weightSegmentalView", "Lcom/xiaomi/fitness/electronic/scale/view/WeightSegmentalView;", "weightLevelRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "weightLeftUpperItem", "weightLeftLowerItem", "weightRightUpperItem", "weightRightLowerItem", "weightTrunkItem", "container", "Landroid/widget/LinearLayout;", "tvUpperBalance", "Landroid/widget/TextView;", "tvLowerBalance", "tvUpperLowerBalance", "ivIcon", "Landroid/widget/ImageView;", "tvLabel", "initLevelRecycler", "", "updateIconAndTitle", "isSegmentalFat", "", "()Z", "bindData", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightSegmentalHolder {

    @NotNull
    private final LinearLayout container;

    @NotNull
    private final Context context;

    @NotNull
    private final ImageView ivIcon;

    @NotNull
    private final SEGMENTAL segmentalType;

    @NotNull
    private final TextView tvLabel;

    @NotNull
    private final TextView tvLowerBalance;

    @NotNull
    private final TextView tvUpperBalance;

    @NotNull
    private final TextView tvUpperLowerBalance;

    @NotNull
    private final ViewGroup weightLeftLowerItem;

    @NotNull
    private final ViewGroup weightLeftUpperItem;

    @NotNull
    private final RecyclerView weightLevelRecyclerView;

    @NotNull
    private final ViewGroup weightRightLowerItem;

    @NotNull
    private final ViewGroup weightRightUpperItem;

    @NotNull
    private final WeightSegmentalView weightSegmentalView;

    @NotNull
    private final ViewGroup weightTrunkItem;

    public WeightSegmentalHolder(@NotNull Context context, @NotNull ViewGroup rootView, @NotNull SEGMENTAL segmentalType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(segmentalType, "segmentalType");
        this.context = context;
        this.segmentalType = segmentalType;
        this.weightSegmentalView = (WeightSegmentalView) rootView.findViewById(bri.u1);
        this.weightLevelRecyclerView = (RecyclerView) rootView.findViewById(bri.P1);
        this.weightLeftUpperItem = (ViewGroup) rootView.findViewById(bri.o7);
        this.weightLeftLowerItem = (ViewGroup) rootView.findViewById(bri.n7);
        this.weightRightUpperItem = (ViewGroup) rootView.findViewById(bri.r7);
        this.weightRightLowerItem = (ViewGroup) rootView.findViewById(bri.q7);
        this.weightTrunkItem = (ViewGroup) rootView.findViewById(bri.t7);
        this.container = (LinearLayout) rootView.findViewById(bri.E);
        this.tvUpperBalance = (TextView) rootView.findViewById(bri.L5);
        this.tvLowerBalance = (TextView) rootView.findViewById(bri.W4);
        this.tvUpperLowerBalance = (TextView) rootView.findViewById(bri.M5);
        this.ivIcon = (ImageView) rootView.findViewById(bri.m1);
        this.tvLabel = (TextView) rootView.findViewById(bri.T4);
        updateIconAndTitle();
        initLevelRecycler();
    }

    private final void initLevelRecycler() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(new LevelBarView.LevelItem(WeightExtKt.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH()[i], WeightEvaluationHelper.INSTANCE.getCOMMON_THREE_SEGMENT_SHORT_DESC()[i]));
        }
        ffe ffeVar = new ffe(this.context, arrayList, 3);
        this.weightLevelRecyclerView.setLayoutManager(new GridLayoutManager(this.context, 3));
        this.weightLevelRecyclerView.setHasFixedSize(true);
        this.weightLevelRecyclerView.setNestedScrollingEnabled(false);
        this.weightLevelRecyclerView.setAdapter(ffeVar);
        ffeVar.notifyDataSetChanged();
    }

    private final boolean isSegmentalFat() {
        return this.segmentalType == SEGMENTAL.FAT;
    }

    private final void updateIconAndTitle() {
        this.ivIcon.setBackgroundResource(isSegmentalFat() ? lni.m : lni.o);
        this.tvLabel.setText(ResourceExtKt.getString(isSegmentalFat() ? zzi.e3 : zzi.f3));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:6:0x000e  */
    public final void bindData(@Nullable WeightItem weightItem) {
        Integer upperLimbMuscleBalance;
        Integer lowerLimbMuscleBalance;
        Integer limbsMuscleBalance;
        Float leftUpperLimbMuscleMass;
        Float leftLowerLimbMuscleMass;
        Float rightUpperLimbMuscleMass;
        Float rightLowerLimbMuscleMass;
        Float trunkMuscleMass;
        if (isSegmentalFat()) {
            if (weightItem != null) {
                upperLimbMuscleBalance = weightItem.getUpperLimbFatBalance();
            } else {
                upperLimbMuscleBalance = null;
            }
        } else if (weightItem != null) {
            upperLimbMuscleBalance = weightItem.getUpperLimbMuscleBalance();
        } else {
            upperLimbMuscleBalance = null;
        }
        if (isSegmentalFat()) {
            if (weightItem != null) {
                lowerLimbMuscleBalance = weightItem.getLowerLimbFatBalance();
            } else {
                lowerLimbMuscleBalance = null;
            }
        } else if (weightItem != null) {
            lowerLimbMuscleBalance = weightItem.getLowerLimbMuscleBalance();
        } else {
            lowerLimbMuscleBalance = null;
        }
        if (isSegmentalFat()) {
            if (weightItem != null) {
                limbsMuscleBalance = weightItem.getLimbsFatBalance();
            } else {
                limbsMuscleBalance = null;
            }
        } else if (weightItem != null) {
            limbsMuscleBalance = weightItem.getLimbsMuscleBalance();
        } else {
            limbsMuscleBalance = null;
        }
        if (weightItem == null || upperLimbMuscleBalance == null || lowerLimbMuscleBalance == null || limbsMuscleBalance == null) {
            ViewExtKt.setVisible(this.container, false);
            return;
        }
        String string = ResourceExtKt.getString(zzi.q5);
        float fFloatValue = (!isSegmentalFat() ? (leftUpperLimbMuscleMass = weightItem.getLeftUpperLimbMuscleMass()) != null : (leftUpperLimbMuscleMass = weightItem.getLeftUpperLimbFatMass()) != null) ? 0.0f : leftUpperLimbMuscleMass.floatValue();
        float fFloatValue2 = (!isSegmentalFat() ? (leftLowerLimbMuscleMass = weightItem.getLeftLowerLimbMuscleMass()) != null : (leftLowerLimbMuscleMass = weightItem.getLeftLowerLimbFatMass()) != null) ? 0.0f : leftLowerLimbMuscleMass.floatValue();
        float fFloatValue3 = (!isSegmentalFat() ? (rightUpperLimbMuscleMass = weightItem.getRightUpperLimbMuscleMass()) != null : (rightUpperLimbMuscleMass = weightItem.getRightUpperLimbFatMass()) != null) ? 0.0f : rightUpperLimbMuscleMass.floatValue();
        float fFloatValue4 = (!isSegmentalFat() ? (rightLowerLimbMuscleMass = weightItem.getRightLowerLimbMuscleMass()) != null : (rightLowerLimbMuscleMass = weightItem.getRightLowerLimbFatMass()) != null) ? 0.0f : rightLowerLimbMuscleMass.floatValue();
        float fFloatValue5 = (!isSegmentalFat() ? (trunkMuscleMass = weightItem.getTrunkMuscleMass()) != null : (trunkMuscleMass = weightItem.getTrunkFatMass()) != null) ? 0.0f : trunkMuscleMass.floatValue();
        if (fFloatValue <= 0.0f && fFloatValue2 <= 0.0f && fFloatValue3 <= 0.0f && fFloatValue4 <= 0.0f && fFloatValue5 <= 0.0f) {
            ViewExtKt.setVisible(this.container, false);
            return;
        }
        ViewExtKt.setVisible(this.container, true);
        TextView textView = (TextView) this.weightLeftUpperItem.findViewById(bri.P5);
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        textView.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue, 1, null));
        ((TextView) this.weightLeftUpperItem.findViewById(bri.K5)).setText(string);
        ((TextView) this.weightLeftUpperItem.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.M2));
        ((TextView) this.weightLeftLowerItem.findViewById(bri.P5)).setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue2, 1, null));
        ((TextView) this.weightLeftLowerItem.findViewById(bri.K5)).setText(string);
        ((TextView) this.weightLeftLowerItem.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.L2));
        ((TextView) this.weightRightUpperItem.findViewById(bri.P5)).setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue3, 1, null));
        ((TextView) this.weightRightUpperItem.findViewById(bri.K5)).setText(string);
        ((TextView) this.weightRightUpperItem.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.d3));
        ((TextView) this.weightRightLowerItem.findViewById(bri.P5)).setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue4, 1, null));
        ((TextView) this.weightRightLowerItem.findViewById(bri.K5)).setText(string);
        ((TextView) this.weightRightLowerItem.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.c3));
        ((TextView) this.weightTrunkItem.findViewById(bri.P5)).setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue5, 1, null));
        ((TextView) this.weightTrunkItem.findViewById(bri.K5)).setText(string);
        ((TextView) this.weightTrunkItem.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.q3));
        TextView textView2 = this.tvUpperBalance;
        WeightParamUtil weightParamUtil = WeightParamUtil.INSTANCE;
        textView2.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getUpperLimbFatBalance() : weightItem.getUpperLimbMuscleBalance()));
        this.tvLowerBalance.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getLowerLimbFatBalance() : weightItem.getLowerLimbMuscleBalance()));
        this.tvUpperLowerBalance.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getLimbsFatBalance() : weightItem.getLimbsMuscleBalance()));
        this.weightSegmentalView.refreshView(weightItem, this.segmentalType);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
