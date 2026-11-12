package com.xiaomi.fitness.health.weight.holder;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.health.weight.ui.adapter.WeightDayDataAdapter;
import com.xiaomi.fitness.health.weight.ui.view.SomatoTypeTreemapView;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.health.weight.view.WeightEvaluationDialog;
import com.xiaomi.fitness.util.ExtUtilKt;
import com.xiaomi.fitness.util.HealthUtil;
import defpackage.c0j;
import defpackage.jui;
import defpackage.nfr;
import defpackage.yzb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b)\u0010*J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\rR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightIndexEvaluationHolder;", "", "", "initRecyclerView", "()V", "updateRecyclerLayoutManager", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "item", "showEvaluationDialog", "(Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;)V", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightItem", "fillRecyclerView", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "", "isFemale", "fillTreemap", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;Ljava/lang/Boolean;)V", "bindData", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lyzb;", "binding", "Lyzb;", "getBinding", "()Lyzb;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/weight/ui/view/SomatoTypeTreemapView;", "weightTreemap", "Lcom/xiaomi/fitness/health/weight/ui/view/SomatoTypeTreemapView;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "weightDayDataAdapter", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightDayDataAdapter;", "<init>", "(Landroidx/fragment/app/Fragment;Lyzb;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightIndexEvaluationHolder {

    @NotNull
    public static final String TAG = "WeightIndexEvaluationHolder";

    @NotNull
    private final yzb binding;

    @NotNull
    private final Context context;

    @NotNull
    private final Fragment parent;

    @NotNull
    private RecyclerView recyclerView;

    @Nullable
    private WeightDayDataAdapter weightDayDataAdapter;

    @NotNull
    private SomatoTypeTreemapView weightTreemap;

    public WeightIndexEvaluationHolder(@NotNull Fragment parent, @NotNull yzb binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
        RecyclerView weightSomatotypeRecycler = binding.D;
        Intrinsics.checkNotNullExpressionValue(weightSomatotypeRecycler, "weightSomatotypeRecycler");
        this.recyclerView = weightSomatotypeRecycler;
        SomatoTypeTreemapView weightTreemap = binding.E;
        Intrinsics.checkNotNullExpressionValue(weightTreemap, "weightTreemap");
        this.weightTreemap = weightTreemap;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        initRecyclerView();
    }

    private final void fillRecyclerView(WeightItem weightItem) {
        if (weightItem == null) {
            ExtUtilKt.gone(this.recyclerView);
            return;
        }
        List<WeightDataItem> listCreateIndexEvaluationDataList = WeightEvaluationHelper.INSTANCE.createIndexEvaluationDataList(weightItem);
        if (ArrayUtils.isEmpty(listCreateIndexEvaluationDataList)) {
            ExtUtilKt.gone(this.recyclerView);
            return;
        }
        ExtUtilKt.visible(this.recyclerView);
        WeightDayDataAdapter weightDayDataAdapter = this.weightDayDataAdapter;
        if (weightDayDataAdapter != null) {
            weightDayDataAdapter.updateDataList(listCreateIndexEvaluationDataList);
        }
    }

    private final void fillTreemap(WeightItem weightItem, Boolean isFemale) {
        if (weightItem == null || isFemale == null || weightItem.getSomatotype() == null) {
            ExtUtilKt.gone(this.weightTreemap);
        } else {
            ExtUtilKt.visible(this.weightTreemap);
            this.weightTreemap.updateGenderAndSomatoType(Integer.valueOf(Intrinsics.areEqual(isFemale, Boolean.TRUE) ? 2 : 1), weightItem.getSomatotype());
        }
    }

    private final void initRecyclerView() {
        this.recyclerView.addItemDecoration(new nfr(ExtUtilsKt.getDp(16)));
        WeightDayDataAdapter weightDayDataAdapter = new WeightDayDataAdapter();
        this.weightDayDataAdapter = weightDayDataAdapter;
        Intrinsics.checkNotNull(weightDayDataAdapter);
        weightDayDataAdapter.setOnItemClickListener(new WeightDayDataAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.health.weight.holder.WeightIndexEvaluationHolder.initRecyclerView.1
            @Override // com.xiaomi.fitness.health.weight.ui.adapter.WeightDayDataAdapter.OnItemClickListener
            public void onClick(WeightDataItem weightDataItem) {
                Intrinsics.checkNotNullParameter(weightDataItem, "weightDataItem");
                if (weightDataItem.getJumpEnable()) {
                    WeightIndexEvaluationHolder.this.showEvaluationDialog(weightDataItem);
                }
            }
        });
        updateRecyclerLayoutManager();
        this.recyclerView.setAdapter(this.weightDayDataAdapter);
        this.recyclerView.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showEvaluationDialog(WeightDataItem item) {
        WeightEvaluationDialog weightEvaluationDialogCreate = new WeightEvaluationDialog.Builder("weight_evaluation").setCustomLayoutId(jui.q3).setCancelable(true).setCanceledOnTouchOutside(true).setNegativeText(c0j.E4).create();
        Intrinsics.checkNotNullExpressionValue(weightEvaluationDialogCreate, "create(...)");
        WeightEvaluationDialog weightEvaluationDialog = weightEvaluationDialogCreate;
        weightEvaluationDialog.updateData(item);
        weightEvaluationDialog.showIfNeed(this.parent.getChildFragmentManager());
    }

    private final void updateRecyclerLayoutManager() {
        WeightDayDataAdapter weightDayDataAdapter = this.weightDayDataAdapter;
        if (weightDayDataAdapter != null) {
            RecyclerView recyclerView = this.recyclerView;
            HealthUtil healthUtil = HealthUtil.INSTANCE;
            Context context = this.context;
            Intrinsics.checkNotNull(weightDayDataAdapter);
            recyclerView.setLayoutManager(healthUtil.buildCommonDataAdapterLayoutManager(context, weightDayDataAdapter));
        }
    }

    public final void bindData(@Nullable WeightItem weightItem) {
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f)) {
            ConstraintLayout container = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container, "container");
            ExtUtilKt.gone(container);
        } else if (WeightEvaluationHelper.INSTANCE.shouldHideEvaluationIndexCardBasedOnFields(weightItem)) {
            ConstraintLayout container2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container2, "container");
            ExtUtilKt.gone(container2);
        } else {
            ConstraintLayout container3 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container3, "container");
            ExtUtilKt.visible(container3);
            fillTreemap(weightItem, Boolean.valueOf(HealthUtil.isFemale()));
            fillRecyclerView(weightItem);
        }
    }

    @NotNull
    public final yzb getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
