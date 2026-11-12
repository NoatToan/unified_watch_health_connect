package com.xiaomi.fitness.electronic.scale.view.holder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.electronic.scale.adapter.WeightDayDataAdapter;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.extensions.DataExtensionKt;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import com.xiaomi.fitness.electronic.scale.view.WeightEvaluationDialog;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.gui;
import defpackage.lni;
import defpackage.ofr;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020$J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010'\u001a\u00020(H\u0002J\u0017\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0002\u0010,J\b\u0010-\u001a\u00020\u001eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightBodyCompositionHolder;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "contentView", "bodyCompositionDistributeContent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bodyCompositionRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "bodyCompositionAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDayDataAdapter;", "ivBodyDistribution", "Landroid/widget/ImageView;", "weightItemWater", "weightItemFat", "weightItemSalt", "weightItemProtein", "iconTitle", "ivIcon", "tvLabel", "Landroid/widget/TextView;", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "initBodyCompositionRecyclerView", "", "showEvaluationDialog", "item", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "bindData", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "updateBodyItemList", "updateBodyDistribute", "showBodyDistributeEnable", "", "floatValid", "float", "", "(Ljava/lang/Float;)Z", "updateIconAndTitle", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightBodyCompositionHolder {

    @Nullable
    private WeightDayDataAdapter bodyCompositionAdapter;

    @NotNull
    private final ConstraintLayout bodyCompositionDistributeContent;

    @NotNull
    private RecyclerView bodyCompositionRecycler;

    @NotNull
    private final ViewGroup contentView;

    @NotNull
    private final Context context;

    @NotNull
    private final ViewGroup iconTitle;

    @NotNull
    private final ImageView ivBodyDistribution;

    @NotNull
    private final ImageView ivIcon;

    @NotNull
    private final TextView tvLabel;

    @Nullable
    private WeightItem weightItem;

    @NotNull
    private final ViewGroup weightItemFat;

    @NotNull
    private final ViewGroup weightItemProtein;

    @NotNull
    private final ViewGroup weightItemSalt;

    @NotNull
    private final ViewGroup weightItemWater;

    public WeightBodyCompositionHolder(@NotNull Context context, @NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.context = context;
        this.contentView = (ViewGroup) rootView.findViewById(bri.X6);
        this.bodyCompositionDistributeContent = (ConstraintLayout) rootView.findViewById(bri.Y6);
        this.bodyCompositionRecycler = (RecyclerView) rootView.findViewById(bri.Z6);
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(bri.x1);
        this.iconTitle = viewGroup;
        this.ivIcon = (ImageView) viewGroup.findViewById(bri.m1);
        this.tvLabel = (TextView) viewGroup.findViewById(bri.T4);
        this.ivBodyDistribution = (ImageView) rootView.findViewById(bri.i1);
        this.weightItemWater = (ViewGroup) rootView.findViewById(bri.u7);
        this.weightItemFat = (ViewGroup) rootView.findViewById(bri.m7);
        this.weightItemSalt = (ViewGroup) rootView.findViewById(bri.s7);
        this.weightItemProtein = (ViewGroup) rootView.findViewById(bri.p7);
        updateIconAndTitle();
        initBodyCompositionRecyclerView();
    }

    private final boolean floatValid(Float f) {
        return f != null && f.floatValue() > 0.0f;
    }

    private final void initBodyCompositionRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.context, (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || UIUtils.INSTANCE.isTabletAndLandscape(this.context)) ? 3 : 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.electronic.scale.view.holder.WeightBodyCompositionHolder.initBodyCompositionRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        this.bodyCompositionRecycler.setLayoutManager(gridLayoutManager);
        this.bodyCompositionRecycler.addItemDecoration(new ofr());
        WeightDayDataAdapter weightDayDataAdapter = new WeightDayDataAdapter();
        this.bodyCompositionAdapter = weightDayDataAdapter;
        Intrinsics.checkNotNull(weightDayDataAdapter);
        weightDayDataAdapter.setOnItemClickListener(new WeightDayDataAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.electronic.scale.view.holder.WeightBodyCompositionHolder.initBodyCompositionRecyclerView.2
            @Override // com.xiaomi.fitness.electronic.scale.adapter.WeightDayDataAdapter.OnItemClickListener
            public void onClick(WeightDataItem weightDataItem) {
                Intrinsics.checkNotNullParameter(weightDataItem, "weightDataItem");
                if (weightDataItem.getJumpEnable()) {
                    WeightBodyCompositionHolder.this.showEvaluationDialog(weightDataItem);
                }
            }
        });
        this.bodyCompositionRecycler.setAdapter(this.bodyCompositionAdapter);
        this.bodyCompositionRecycler.setHasFixedSize(true);
    }

    private final boolean showBodyDistributeEnable() {
        WeightItem weightItem = this.weightItem;
        if (weightItem != null) {
            Intrinsics.checkNotNull(weightItem);
            if (floatValid(weightItem.getMoistureRate())) {
                WeightItem weightItem2 = this.weightItem;
                Intrinsics.checkNotNull(weightItem2);
                if (floatValid(weightItem2.getBodyFatRate())) {
                    WeightItem weightItem3 = this.weightItem;
                    Intrinsics.checkNotNull(weightItem3);
                    if (floatValid(weightItem3.getBoneSaltRate())) {
                        WeightItem weightItem4 = this.weightItem;
                        Intrinsics.checkNotNull(weightItem4);
                        if (floatValid(weightItem4.getProteinRate())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEvaluationDialog(WeightDataItem item) {
        WeightEvaluationDialog weightEvaluationDialogCreate = new WeightEvaluationDialog.Builder("weight_evaluation").setCustomLayoutId(gui.H).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(zzi.H2).create();
        Intrinsics.checkNotNullExpressionValue(weightEvaluationDialogCreate, "create(...)");
        WeightEvaluationDialog weightEvaluationDialog = weightEvaluationDialogCreate;
        weightEvaluationDialog.updateData(item);
        Context context = this.context;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.xiaomi.fitness.baseui.view.BaseActivity");
        weightEvaluationDialog.showIfNeed(((BaseActivity) context).getSupportFragmentManager());
    }

    private final void updateBodyDistribute(VirtualAccount virtualAccount) {
        if (!showBodyDistributeEnable()) {
            ViewExtKt.setVisible(this.bodyCompositionDistributeContent, false);
            return;
        }
        ViewExtKt.setVisible(this.bodyCompositionDistributeContent, true);
        this.ivBodyDistribution.setImageResource(DataExtensionKt.isFemale(virtualAccount.getSex()) ? lni.j : lni.f25246k);
        ((TextView) this.weightItemWater.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.w2));
        String string = ResourceExtKt.getString(zzi.I2);
        ((TextView) this.weightItemWater.findViewById(bri.K5)).setText(string);
        TextView textView = (TextView) this.weightItemWater.findViewById(bri.P5);
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        WeightItem weightItem = this.weightItem;
        Intrinsics.checkNotNull(weightItem);
        Float moistureRate = weightItem.getMoistureRate();
        textView.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, moistureRate != null ? moistureRate.floatValue() : 0.0f, 1, null));
        ((TextView) this.weightItemFat.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.J2));
        ((TextView) this.weightItemFat.findViewById(bri.K5)).setText(string);
        TextView textView2 = (TextView) this.weightItemFat.findViewById(bri.P5);
        WeightItem weightItem2 = this.weightItem;
        Intrinsics.checkNotNull(weightItem2);
        Float bodyFatRate = weightItem2.getBodyFatRate();
        textView2.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, bodyFatRate != null ? bodyFatRate.floatValue() : 0.0f, 1, null));
        ((TextView) this.weightItemSalt.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.Q1));
        ((TextView) this.weightItemSalt.findViewById(bri.K5)).setText(string);
        TextView textView3 = (TextView) this.weightItemSalt.findViewById(bri.P5);
        WeightItem weightItem3 = this.weightItem;
        Intrinsics.checkNotNull(weightItem3);
        Float boneSaltRate = weightItem3.getBoneSaltRate();
        textView3.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, boneSaltRate != null ? boneSaltRate.floatValue() : 0.0f, 1, null));
        ((TextView) this.weightItemProtein.findViewById(bri.T4)).setText(ResourceExtKt.getString(zzi.Z2));
        ((TextView) this.weightItemProtein.findViewById(bri.K5)).setText(string);
        TextView textView4 = (TextView) this.weightItemProtein.findViewById(bri.P5);
        WeightItem weightItem4 = this.weightItem;
        Intrinsics.checkNotNull(weightItem4);
        Float proteinRate = weightItem4.getProteinRate();
        textView4.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, proteinRate != null ? proteinRate.floatValue() : 0.0f, 1, null));
    }

    private final void updateBodyItemList(VirtualAccount virtualAccount) {
        WeightItem weightItem = this.weightItem;
        if (weightItem == null) {
            ViewExtKt.setVisible(this.bodyCompositionRecycler, false);
            return;
        }
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        Intrinsics.checkNotNull(weightItem);
        List<WeightDataItem> listCreateBodyCompositionDataList = weightEvaluationHelper.createBodyCompositionDataList(weightItem, WeightEvaluationHelper.FILTER.NONE, virtualAccount);
        if (ArrayUtils.isEmpty(listCreateBodyCompositionDataList)) {
            ViewExtKt.setVisible(this.bodyCompositionRecycler, false);
            return;
        }
        ViewExtKt.setVisible(this.bodyCompositionRecycler, true);
        WeightDayDataAdapter weightDayDataAdapter = this.bodyCompositionAdapter;
        if (weightDayDataAdapter != null) {
            weightDayDataAdapter.updateDataList(listCreateBodyCompositionDataList);
        }
    }

    private final void updateIconAndTitle() {
        this.ivIcon.setBackgroundResource(lni.i);
        this.tvLabel.setText(ResourceExtKt.getString(zzi.w1));
    }

    public final void bindData(@Nullable WeightItem item, @NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        if (item == null || item.getWeight() <= 0.0f) {
            ViewExtKt.setVisible(this.contentView, false);
            return;
        }
        ViewExtKt.setVisible(this.contentView, true);
        this.weightItem = item;
        updateBodyDistribute(virtualAccount);
        updateBodyItemList(virtualAccount);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
