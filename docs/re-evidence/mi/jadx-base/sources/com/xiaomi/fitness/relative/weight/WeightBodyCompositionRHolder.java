package com.xiaomi.fitness.relative.weight;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.nfr;
import defpackage.ozb;
import defpackage.pni;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b'\u0010(J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0017\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010%\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lcom/xiaomi/fitness/relative/weight/WeightBodyCompositionRHolder;", "", "", "initBodyCompositionRecyclerView", "()V", "updateRecyclerLayoutManager", "updateBodyItemList", "updateIconAndTitle", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "item", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lozb;", "binding", "Lozb;", "getBinding", "()Lozb;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "contentView", "Landroid/view/ViewGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bodyCompositionDistributeContent", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "bodyCompositionRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "bodyCompositionAdapter", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "<init>", "(Landroidx/fragment/app/Fragment;Lozb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nWeightBodyCompositionRHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeightBodyCompositionRHolder.kt\ncom/xiaomi/fitness/relative/weight/WeightBodyCompositionRHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
public final class WeightBodyCompositionRHolder {

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

    public WeightBodyCompositionRHolder(@NotNull Fragment parent, @NotNull ozb binding) {
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

    private final void initBodyCompositionRecyclerView() {
        this.bodyCompositionRecycler.addItemDecoration(new nfr(ExtUtilsKt.getDp(16)));
        this.bodyCompositionAdapter = new WeightDayDataAdapter();
        updateRecyclerLayoutManager();
        this.bodyCompositionRecycler.setAdapter(this.bodyCompositionAdapter);
        this.bodyCompositionRecycler.setHasFixedSize(true);
    }

    private final void updateBodyItemList() {
        if (this.weightItem == null) {
            ViewExtKt.setVisible(this.bodyCompositionRecycler, false);
            return;
        }
        ArrayList arrayList = new ArrayList();
        WeightItem weightItem = this.weightItem;
        Intrinsics.checkNotNull(weightItem);
        Float bmi = weightItem.getBmi();
        float fFloatValue = bmi != null ? bmi.floatValue() : 0.0f;
        if (fFloatValue > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper = WeightEvaluationHelper.INSTANCE;
            Float fValueOf = Float.valueOf(fFloatValue);
            WeightItem weightItem2 = this.weightItem;
            Intrinsics.checkNotNull(weightItem2);
            WeightDataItem weightDataItemBuildWeightDataByType = weightEvaluationHelper.buildWeightDataByType(0, fValueOf, weightItem2);
            weightDataItemBuildWeightDataByType.setCurrentLevelPosition(-1);
            arrayList.add(weightDataItemBuildWeightDataByType);
        }
        WeightItem weightItem3 = this.weightItem;
        Intrinsics.checkNotNull(weightItem3);
        Float bodyFatRate = weightItem3.getBodyFatRate();
        float fFloatValue2 = bodyFatRate != null ? bodyFatRate.floatValue() : 0.0f;
        if (fFloatValue2 > 0.0f) {
            WeightEvaluationHelper weightEvaluationHelper2 = WeightEvaluationHelper.INSTANCE;
            Float fValueOf2 = Float.valueOf(fFloatValue2);
            WeightItem weightItem4 = this.weightItem;
            Intrinsics.checkNotNull(weightItem4);
            WeightDataItem weightDataItemBuildWeightDataByType2 = weightEvaluationHelper2.buildWeightDataByType(1, fValueOf2, weightItem4);
            weightDataItemBuildWeightDataByType2.setCurrentLevelPosition(-1);
            arrayList.add(weightDataItemBuildWeightDataByType2);
        }
        if (ArrayUtils.isEmpty(arrayList)) {
            ViewExtKt.setVisible(this.bodyCompositionRecycler, false);
            return;
        }
        ViewExtKt.setVisible(this.bodyCompositionRecycler, true);
        WeightDayDataAdapter weightDayDataAdapter = this.bodyCompositionAdapter;
        if (weightDayDataAdapter != null) {
            weightDayDataAdapter.updateDataList(arrayList);
        }
    }

    private final void updateIconAndTitle() {
        this.binding.B.A.setBackgroundResource(pni.n2);
        this.binding.B.B.setText(ExtUtilKt.getString(c0j.k3));
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
