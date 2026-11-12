package com.xiaomi.fitness.health.weight.holder;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.health.weight.ui.adapter.WeightDayDataAdapter;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.view.WeightEvaluationDialog;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.jui;
import defpackage.mxb;
import defpackage.nfr;
import defpackage.ozb;
import defpackage.pni;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b2\u00103J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0004J\u0017\u0010\u0015\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00100\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightBodyCompositionHolder;", "", "", "initBodyCompositionRecyclerView", "()V", "updateRecyclerLayoutManager", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "item", "showEvaluationDialog", "(Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;)V", "updateBodyItemList", "updateBodyDistribute", "", "showBodyDistributeEnable", "()Z", "", "float", "floatValid", "(Ljava/lang/Float;)Z", "updateIconAndTitle", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lozb;", "binding", "Lozb;", "getBinding", "()Lozb;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "contentView", "Landroid/view/ViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bodyCompositionDistributeContent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "bodyCompositionRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "bodyCompositionAdapter", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "<init>", "(Landroidx/fragment/app/Fragment;Lozb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightBodyCompositionHolder {

    @NotNull
    private final ozb binding;

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
    private final Fragment parent;

    @Nullable
    private WeightItem weightItem;

    public WeightBodyCompositionHolder(@NotNull Fragment parent, @NotNull ozb binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        LinearLayout weightBodyCompositionCard = binding.C;
        Intrinsics.checkNotNullExpressionValue(weightBodyCompositionCard, "weightBodyCompositionCard");
        this.contentView = weightBodyCompositionCard;
        ConstraintLayout weightBodyCompositionDistributionContent = binding.D;
        Intrinsics.checkNotNullExpressionValue(weightBodyCompositionDistributionContent, "weightBodyCompositionDistributionContent");
        this.bodyCompositionDistributeContent = weightBodyCompositionDistributionContent;
        RecyclerView weightBodyCompositionRecycler = binding.E;
        Intrinsics.checkNotNullExpressionValue(weightBodyCompositionRecycler, "weightBodyCompositionRecycler");
        this.bodyCompositionRecycler = weightBodyCompositionRecycler;
        updateIconAndTitle();
        initBodyCompositionRecyclerView();
    }

    private final boolean floatValid(Float f) {
        return f != null && f.floatValue() > 0.0f;
    }

    private final void initBodyCompositionRecyclerView() {
        this.bodyCompositionRecycler.addItemDecoration(new nfr(ExtUtilsKt.getDp(16)));
        WeightDayDataAdapter weightDayDataAdapter = new WeightDayDataAdapter();
        this.bodyCompositionAdapter = weightDayDataAdapter;
        Intrinsics.checkNotNull(weightDayDataAdapter);
        weightDayDataAdapter.setOnItemClickListener(new WeightDayDataAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.weight.holder.WeightBodyCompositionHolder.initBodyCompositionRecyclerView.1
            @Override // com.xiaomi.fitness.health.weight.ui.adapter.WeightDayDataAdapter.OnItemClickListener
            public void onClick(WeightDataItem weightDataItem) {
                Intrinsics.checkNotNullParameter(weightDataItem, "weightDataItem");
                if (weightDataItem.getJumpEnable()) {
                    WeightBodyCompositionHolder.this.showEvaluationDialog(weightDataItem);
                }
            }
        });
        updateRecyclerLayoutManager();
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
        WeightEvaluationDialog weightEvaluationDialogCreate = new WeightEvaluationDialog.Builder("weight_evaluation").setCustomLayoutId(jui.q3).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(c0j.E4).create();
        Intrinsics.checkNotNullExpressionValue(weightEvaluationDialogCreate, "create(...)");
        WeightEvaluationDialog weightEvaluationDialog = weightEvaluationDialogCreate;
        weightEvaluationDialog.updateData(item);
        weightEvaluationDialog.showIfNeed(this.parent.getChildFragmentManager());
    }

    private final void updateBodyDistribute() {
        if (!showBodyDistributeEnable()) {
            ViewExtKt.setVisible(this.bodyCompositionDistributeContent, false);
            return;
        }
        ViewExtKt.setVisible(this.bodyCompositionDistributeContent, true);
        this.binding.A.setImageResource(HealthUtil.isFemale() ? pni.o2 : pni.p2);
        mxb weightItemWater = this.binding.I;
        Intrinsics.checkNotNullExpressionValue(weightItemWater, "weightItemWater");
        weightItemWater.D.setText(ExtUtilKt.getString(c0j.i4));
        String string = ExtUtilKt.getString(c0j.w5);
        weightItemWater.E.setText(string);
        TextView textView = weightItemWater.F;
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        WeightItem weightItem = this.weightItem;
        Intrinsics.checkNotNull(weightItem);
        Float moistureRate = weightItem.getMoistureRate();
        textView.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, moistureRate != null ? moistureRate.floatValue() : 0.0f, 1, null));
        mxb weightItemFat = this.binding.F;
        Intrinsics.checkNotNullExpressionValue(weightItemFat, "weightItemFat");
        weightItemFat.D.setText(ExtUtilKt.getString(c0j.r8));
        weightItemFat.E.setText(string);
        TextView textView2 = weightItemFat.F;
        WeightItem weightItem2 = this.weightItem;
        Intrinsics.checkNotNull(weightItem2);
        Float bodyFatRate = weightItem2.getBodyFatRate();
        textView2.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, bodyFatRate != null ? bodyFatRate.floatValue() : 0.0f, 1, null));
        mxb weightItemSalt = this.binding.H;
        Intrinsics.checkNotNullExpressionValue(weightItemSalt, "weightItemSalt");
        weightItemSalt.D.setText(ExtUtilKt.getString(c0j.l3));
        weightItemSalt.E.setText(string);
        TextView textView3 = weightItemSalt.F;
        WeightItem weightItem3 = this.weightItem;
        Intrinsics.checkNotNull(weightItem3);
        Float boneSaltRate = weightItem3.getBoneSaltRate();
        textView3.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, boneSaltRate != null ? boneSaltRate.floatValue() : 0.0f, 1, null));
        mxb weightItemProtein = this.binding.G;
        Intrinsics.checkNotNullExpressionValue(weightItemProtein, "weightItemProtein");
        weightItemProtein.D.setText(ExtUtilKt.getString(c0j.Ab));
        weightItemProtein.E.setText(string);
        TextView textView4 = weightItemProtein.F;
        WeightItem weightItem4 = this.weightItem;
        Intrinsics.checkNotNull(weightItem4);
        Float proteinRate = weightItem4.getProteinRate();
        textView4.setText(WeightEvaluationHelper.formatFloatValue$default(weightEvaluationHelper, 0, proteinRate != null ? proteinRate.floatValue() : 0.0f, 1, null));
    }

    private final void updateBodyItemList() {
        WeightItem weightItem = this.weightItem;
        if (weightItem == null) {
            ViewExtKt.setVisible(this.bodyCompositionRecycler, false);
            return;
        }
        WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
        Intrinsics.checkNotNull(weightItem);
        List<WeightDataItem> listCreateBodyCompositionDataList = weightEvaluationHelper.createBodyCompositionDataList(weightItem, WeightEvaluationHelper.FILTER.NORMAL_DATA, true);
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
        this.binding.B.A.setBackgroundResource(pni.n2);
        this.binding.B.B.setText(ExtUtilKt.getString(c0j.R2));
    }

    private final void updateRecyclerLayoutManager() {
        WeightDayDataAdapter weightDayDataAdapter = this.bodyCompositionAdapter;
        if (weightDayDataAdapter != null) {
            RecyclerView recyclerView = this.bodyCompositionRecycler;
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNull(weightDayDataAdapter);
            recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(context, weightDayDataAdapter));
        }
    }

    public final void bindData(@Nullable WeightItem item) {
        if (item == null || item.getWeight() <= 0.0f) {
            ViewExtKt.setVisible(this.contentView, false);
            return;
        }
        ViewExtKt.setVisible(this.contentView, true);
        this.weightItem = item;
        updateBodyDistribute();
        updateBodyItemList();
    }

    @NotNull
    public final ozb getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
