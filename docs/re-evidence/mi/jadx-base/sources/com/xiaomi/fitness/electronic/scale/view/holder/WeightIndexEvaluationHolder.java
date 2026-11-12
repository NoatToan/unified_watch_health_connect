package com.xiaomi.fitness.electronic.scale.view.holder;

import android.content.Context;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.common.utils.SettingsPropertiesUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.electronic.scale.adapter.WeightDayDataAdapter;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import com.xiaomi.fitness.electronic.scale.export.bean.VirtualAccount;
import com.xiaomi.fitness.electronic.scale.extensions.DataExtensionKt;
import com.xiaomi.fitness.electronic.scale.util.WeightEvaluationHelper;
import com.xiaomi.fitness.electronic.scale.view.SomatoTypeTreemapView;
import com.xiaomi.fitness.electronic.scale.view.WeightEvaluationDialog;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.bri;
import defpackage.gui;
import defpackage.ofr;
import defpackage.zzi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0018\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u001a\u0010\u001c\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J!\u0010\u001d\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/view/holder/WeightIndexEvaluationHolder;", "", "context", "Landroid/content/Context;", "rootView", "Landroid/view/ViewGroup;", "<init>", "(Landroid/content/Context;Landroid/view/ViewGroup;)V", "getContext", "()Landroid/content/Context;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "weightTreemap", "Lcom/xiaomi/fitness/electronic/scale/view/SomatoTypeTreemapView;", "weightDayDataAdapter", "Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDayDataAdapter;", "initRecyclerView", "", "bindData", "weightItem", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "virtualAccount", "Lcom/xiaomi/fitness/electronic/scale/export/bean/VirtualAccount;", "showEvaluationDialog", "item", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "fillRecyclerView", "fillTreemap", "isFemale", "", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;Ljava/lang/Boolean;)V", "Companion", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightIndexEvaluationHolder {

    @NotNull
    public static final String TAG = "WeightIndexEvaluationHolder";

    @NotNull
    private ConstraintLayout container;

    @NotNull
    private final Context context;

    @NotNull
    private RecyclerView recyclerView;

    @Nullable
    private WeightDayDataAdapter weightDayDataAdapter;

    @NotNull
    private SomatoTypeTreemapView weightTreemap;

    public WeightIndexEvaluationHolder(@NotNull Context context, @NotNull ViewGroup rootView) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.context = context;
        this.recyclerView = (RecyclerView) rootView.findViewById(bri.y7);
        this.weightTreemap = (SomatoTypeTreemapView) rootView.findViewById(bri.z7);
        this.container = (ConstraintLayout) rootView.findViewById(bri.E);
        initRecyclerView();
    }

    private final void fillRecyclerView(WeightItem weightItem, VirtualAccount virtualAccount) {
        if (weightItem == null) {
            ViewExtKt.gone(this.recyclerView);
            return;
        }
        List<WeightDataItem> listCreateIndexEvaluationDataList = WeightEvaluationHelper.INSTANCE.createIndexEvaluationDataList(weightItem, virtualAccount);
        if (ArrayUtils.isEmpty(listCreateIndexEvaluationDataList)) {
            ViewExtKt.gone(this.recyclerView);
            return;
        }
        ViewExtKt.visible(this.recyclerView);
        WeightDayDataAdapter weightDayDataAdapter = this.weightDayDataAdapter;
        if (weightDayDataAdapter != null) {
            weightDayDataAdapter.updateDataList(listCreateIndexEvaluationDataList);
        }
    }

    private final void fillTreemap(WeightItem weightItem, Boolean isFemale) {
        if (weightItem == null || isFemale == null || weightItem.getSomatotype() == null) {
            ViewExtKt.gone(this.weightTreemap);
        } else {
            ViewExtKt.visible(this.weightTreemap);
            this.weightTreemap.updateGenderAndSomatoType(Integer.valueOf(Intrinsics.areEqual(isFemale, Boolean.TRUE) ? 2 : 1), weightItem.getSomatotype());
        }
    }

    private final void initRecyclerView() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.context, (SettingsPropertiesUtil.INSTANCE.isFoldDisplayAndExpand() || UIUtils.INSTANCE.isTabletAndLandscape(this.context)) ? 3 : 2);
        gridLayoutManager.D(new GridLayoutManager.b() { // from class: com.xiaomi.fitness.electronic.scale.view.holder.WeightIndexEvaluationHolder.initRecyclerView.1
            @Override // androidx.recyclerview.widget.GridLayoutManager.b
            public int getSpanSize(int position) {
                return 1;
            }
        });
        this.recyclerView.setLayoutManager(gridLayoutManager);
        this.recyclerView.addItemDecoration(new ofr());
        WeightDayDataAdapter weightDayDataAdapter = new WeightDayDataAdapter();
        this.weightDayDataAdapter = weightDayDataAdapter;
        Intrinsics.checkNotNull(weightDayDataAdapter);
        weightDayDataAdapter.setOnItemClickListener(new WeightDayDataAdapter.OnItemClickListener() { // from class: com.xiaomi.fitness.electronic.scale.view.holder.WeightIndexEvaluationHolder.initRecyclerView.2
            @Override // com.xiaomi.fitness.electronic.scale.adapter.WeightDayDataAdapter.OnItemClickListener
            public void onClick(WeightDataItem weightDataItem) {
                Intrinsics.checkNotNullParameter(weightDataItem, "weightDataItem");
                if (weightDataItem.getJumpEnable()) {
                    WeightIndexEvaluationHolder.this.showEvaluationDialog(weightDataItem);
                }
            }
        });
        this.recyclerView.setAdapter(this.weightDayDataAdapter);
        this.recyclerView.setHasFixedSize(true);
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

    public final void bindData(@Nullable WeightItem weightItem, @NotNull VirtualAccount virtualAccount) {
        Intrinsics.checkNotNullParameter(virtualAccount, "virtualAccount");
        if ((weightItem != null ? weightItem.getBodyFatRate() : null) == null || Intrinsics.areEqual(weightItem.getBodyFatRate(), 0.0f)) {
            ViewExtKt.gone(this.container);
        } else {
            if (WeightEvaluationHelper.INSTANCE.shouldHideEvaluationIndexCardBasedOnFields(weightItem)) {
                ViewExtKt.gone(this.container);
                return;
            }
            ViewExtKt.visible(this.container);
            fillTreemap(weightItem, Boolean.valueOf(DataExtensionKt.isFemale(virtualAccount.getSex())));
            fillRecyclerView(weightItem, virtualAccount);
        }
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }
}
