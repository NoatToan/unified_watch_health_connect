package com.xiaomi.fitness.health.weight.holder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.util.WeightParamUtil;
import com.xiaomi.fitness.health.weight.view.SEGMENTAL;
import com.xiaomi.fitness.health.weight.view.WeightSegmentalView;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.a0c;
import defpackage.c0j;
import defpackage.gfe;
import defpackage.mxb;
import defpackage.pni;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010%\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightSegmentalHolder;", "", "", "initLevelRecycler", "()V", "updateIconAndTitle", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightItem", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "La0c;", "binding", "La0c;", "getBinding", "()La0c;", "Lcom/xiaomi/fitness/health/weight/view/SEGMENTAL;", "segmentalType", "Lcom/xiaomi/fitness/health/weight/view/SEGMENTAL;", "Lcom/xiaomi/fitness/health/weight/view/WeightSegmentalView;", "weightSegmentalView", "Lcom/xiaomi/fitness/health/weight/view/WeightSegmentalView;", "Landroidx/recyclerview/widget/RecyclerView;", "weightLevelRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lmxb;", "weightLeftUpperItem", "Lmxb;", "weightLeftLowerItem", "weightRightUpperItem", "weightRightLowerItem", "weightTrunkItem", "", "isSegmentalFat", "()Z", "<init>", "(Landroidx/fragment/app/Fragment;La0c;Lcom/xiaomi/fitness/health/weight/view/SEGMENTAL;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightSegmentalHolder {

    @NotNull
    private final a0c binding;

    @NotNull
    private final Fragment parent;

    @NotNull
    private final SEGMENTAL segmentalType;

    @NotNull
    private final mxb weightLeftLowerItem;

    @NotNull
    private final mxb weightLeftUpperItem;

    @NotNull
    private final RecyclerView weightLevelRecyclerView;

    @NotNull
    private final mxb weightRightLowerItem;

    @NotNull
    private final mxb weightRightUpperItem;

    @NotNull
    private final WeightSegmentalView weightSegmentalView;

    @NotNull
    private final mxb weightTrunkItem;

    public WeightSegmentalHolder(@NotNull Fragment parent, @NotNull a0c binding, @NotNull SEGMENTAL segmentalType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(segmentalType, "segmentalType");
        this.parent = parent;
        this.binding = binding;
        this.segmentalType = segmentalType;
        WeightSegmentalView ivWeightSegmental = binding.D;
        Intrinsics.checkNotNullExpressionValue(ivWeightSegmental, "ivWeightSegmental");
        this.weightSegmentalView = ivWeightSegmental;
        RecyclerView levelRecycler = binding.F;
        Intrinsics.checkNotNullExpressionValue(levelRecycler, "levelRecycler");
        this.weightLevelRecyclerView = levelRecycler;
        mxb weightItemLeftUpper = binding.Q;
        Intrinsics.checkNotNullExpressionValue(weightItemLeftUpper, "weightItemLeftUpper");
        this.weightLeftUpperItem = weightItemLeftUpper;
        mxb weightItemLeftLower = binding.P;
        Intrinsics.checkNotNullExpressionValue(weightItemLeftLower, "weightItemLeftLower");
        this.weightLeftLowerItem = weightItemLeftLower;
        mxb weightItemRightUpper = binding.S;
        Intrinsics.checkNotNullExpressionValue(weightItemRightUpper, "weightItemRightUpper");
        this.weightRightUpperItem = weightItemRightUpper;
        mxb weightItemRightLower = binding.R;
        Intrinsics.checkNotNullExpressionValue(weightItemRightLower, "weightItemRightLower");
        this.weightRightLowerItem = weightItemRightLower;
        mxb weightItemTrunk = binding.T;
        Intrinsics.checkNotNullExpressionValue(weightItemTrunk, "weightItemTrunk");
        this.weightTrunkItem = weightItemTrunk;
        updateIconAndTitle();
        initLevelRecycler();
    }

    private final void initLevelRecycler() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
            arrayList.add(new LevelBarView.LevelItem(weightEvaluationHelper.getCOMMON_THREE_SEGMENT_COLOR_LOW_NORMAL_HIGH()[i], weightEvaluationHelper.getCOMMON_THREE_SEGMENT_SHORT_DESC()[i]));
        }
        ViewGroup.LayoutParams layoutParams = this.weightLevelRecyclerView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        Context context = this.parent.getContext();
        marginLayoutParams.width = (context == null || !UIUtils.INSTANCE.isTabletAndLandscape(context)) ? -1 : ExtUtilsKt.getDp(300);
        this.weightLevelRecyclerView.setLayoutParams(marginLayoutParams);
        gfe gfeVar = new gfe(this.parent.requireContext(), arrayList, 3);
        this.weightLevelRecyclerView.setLayoutManager(new GridLayoutManager(this.parent.requireContext(), 3));
        this.weightLevelRecyclerView.setHasFixedSize(true);
        this.weightLevelRecyclerView.setNestedScrollingEnabled(false);
        this.weightLevelRecyclerView.setAdapter(gfeVar);
        gfeVar.notifyDataSetChanged();
    }

    private final boolean isSegmentalFat() {
        return this.segmentalType == SEGMENTAL.FAT;
    }

    private final void updateIconAndTitle() {
        this.binding.E.A.setBackgroundResource(isSegmentalFat() ? pni.s2 : pni.u2);
        this.binding.E.B.setText(ExtUtilKt.getString(isSegmentalFat() ? c0j.Hc : c0j.Ic));
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
            LinearLayout container = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container, "container");
            ViewExtKt.setVisible(container, false);
            return;
        }
        String string = ExtUtilKt.getString(c0j.zp);
        float fFloatValue = (!isSegmentalFat() ? (leftUpperLimbMuscleMass = weightItem.getLeftUpperLimbMuscleMass()) != null : (leftUpperLimbMuscleMass = weightItem.getLeftUpperLimbFatMass()) != null) ? 0.0f : leftUpperLimbMuscleMass.floatValue();
        float fFloatValue2 = (!isSegmentalFat() ? (leftLowerLimbMuscleMass = weightItem.getLeftLowerLimbMuscleMass()) != null : (leftLowerLimbMuscleMass = weightItem.getLeftLowerLimbFatMass()) != null) ? 0.0f : leftLowerLimbMuscleMass.floatValue();
        float fFloatValue3 = (!isSegmentalFat() ? (rightUpperLimbMuscleMass = weightItem.getRightUpperLimbMuscleMass()) != null : (rightUpperLimbMuscleMass = weightItem.getRightUpperLimbFatMass()) != null) ? 0.0f : rightUpperLimbMuscleMass.floatValue();
        float fFloatValue4 = (!isSegmentalFat() ? (rightLowerLimbMuscleMass = weightItem.getRightLowerLimbMuscleMass()) != null : (rightLowerLimbMuscleMass = weightItem.getRightLowerLimbFatMass()) != null) ? 0.0f : rightLowerLimbMuscleMass.floatValue();
        float fFloatValue5 = (!isSegmentalFat() ? (trunkMuscleMass = weightItem.getTrunkMuscleMass()) != null : (trunkMuscleMass = weightItem.getTrunkFatMass()) != null) ? 0.0f : trunkMuscleMass.floatValue();
        if (fFloatValue <= 0.0f && fFloatValue2 <= 0.0f && fFloatValue3 <= 0.0f && fFloatValue4 <= 0.0f && fFloatValue5 <= 0.0f) {
            LinearLayout container2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container2, "container");
            ViewExtKt.setVisible(container2, false);
            return;
        }
        LinearLayout container3 = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(container3, "container");
        ViewExtKt.setVisible(container3, true);
        TextView textView = this.weightLeftUpperItem.F;
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        textView.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue, 1, null));
        this.weightLeftUpperItem.E.setText(string);
        this.weightLeftUpperItem.D.setText(ExtUtilKt.getString(c0j.r9));
        this.weightLeftLowerItem.F.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue2, 1, null));
        this.weightLeftLowerItem.E.setText(string);
        this.weightLeftLowerItem.D.setText(ExtUtilKt.getString(c0j.o9));
        this.weightRightUpperItem.F.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue3, 1, null));
        this.weightRightUpperItem.E.setText(string);
        this.weightRightUpperItem.D.setText(ExtUtilKt.getString(c0j.gc));
        this.weightRightLowerItem.F.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue4, 1, null));
        this.weightRightLowerItem.E.setText(string);
        this.weightRightLowerItem.D.setText(ExtUtilKt.getString(c0j.dc));
        this.weightTrunkItem.F.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, fFloatValue5, 1, null));
        this.weightTrunkItem.E.setText(string);
        this.weightTrunkItem.D.setText(ExtUtilKt.getString(c0j.ho));
        TextView textView2 = this.binding.J;
        WeightParamUtil weightParamUtil = WeightParamUtil.INSTANCE;
        textView2.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getUpperLimbFatBalance() : weightItem.getUpperLimbMuscleBalance()));
        this.binding.H.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getLowerLimbFatBalance() : weightItem.getLowerLimbMuscleBalance()));
        this.binding.L.setText(weightParamUtil.getWeightBalanceLevelName(isSegmentalFat() ? weightItem.getLimbsFatBalance() : weightItem.getLimbsMuscleBalance()));
        this.weightSegmentalView.refreshView(weightItem, this.segmentalType);
    }

    @NotNull
    public final a0c getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
