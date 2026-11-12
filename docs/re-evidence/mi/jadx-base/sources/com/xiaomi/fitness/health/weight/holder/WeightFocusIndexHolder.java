package com.xiaomi.fitness.health.weight.holder;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.WeightItem;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import com.xiaomi.fitness.health.weight.ui.adapter.WeightFocusIndexAdapter;
import com.xiaomi.fitness.health.weight.util.WeightEvaluationHelper;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.pni;
import defpackage.wzb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/health/weight/holder/WeightFocusIndexHolder;", "", "", "initEvaluationRecyclerView", "()V", "updateIconAndTitle", "Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;", "weightItem", "bindData", "(Lcom/xiaomi/fit/fitness/export/data/item/WeightItem;)V", "Landroidx/fragment/app/Fragment;", "parent", "Landroidx/fragment/app/Fragment;", "getParent", "()Landroidx/fragment/app/Fragment;", "Lwzb;", "binding", "Lwzb;", "getBinding", "()Lwzb;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroidx/recyclerview/widget/RecyclerView;", "focusRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightFocusIndexAdapter;", "focusIndexAdapter", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightFocusIndexAdapter;", "<init>", "(Landroidx/fragment/app/Fragment;Lwzb;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class WeightFocusIndexHolder {

    @NotNull
    private final wzb binding;

    @NotNull
    private final Context context;
    private WeightFocusIndexAdapter focusIndexAdapter;

    @NotNull
    private final RecyclerView focusRecyclerView;

    @NotNull
    private final Fragment parent;

    public WeightFocusIndexHolder(@NotNull Fragment parent, @NotNull wzb binding) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.parent = parent;
        this.binding = binding;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        RecyclerView recycler = binding.C;
        Intrinsics.checkNotNullExpressionValue(recycler, "recycler");
        this.focusRecyclerView = recycler;
        updateIconAndTitle();
        initEvaluationRecyclerView();
    }

    private final void initEvaluationRecyclerView() {
        this.focusRecyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        WeightFocusIndexAdapter weightFocusIndexAdapter = new WeightFocusIndexAdapter();
        this.focusIndexAdapter = weightFocusIndexAdapter;
        this.focusRecyclerView.setAdapter(weightFocusIndexAdapter);
        this.focusRecyclerView.setHasFixedSize(true);
        this.focusRecyclerView.setNestedScrollingEnabled(false);
    }

    private final void updateIconAndTitle() {
        this.binding.B.A.setBackgroundResource(pni.q2);
        this.binding.B.B.setText(ExtUtilKt.getString(c0j.lp));
    }

    public final void bindData(@Nullable WeightItem weightItem) {
        if (weightItem == null) {
            LinearLayout container = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container, "container");
            ViewExtKt.setVisible(container, false);
            return;
        }
        List<WeightDataItem> listCreateBodyCompositionDataList$default = WeightEvaluationHelper.createBodyCompositionDataList$default(WeightEvaluationHelper.INSTANCE, weightItem, WeightEvaluationHelper.FILTER.ABNORMAL_DATA, false, 4, null);
        if (ArrayUtils.isEmpty(listCreateBodyCompositionDataList$default)) {
            LinearLayout container2 = this.binding.A;
            Intrinsics.checkNotNullExpressionValue(container2, "container");
            ViewExtKt.setVisible(container2, false);
            return;
        }
        LinearLayout container3 = this.binding.A;
        Intrinsics.checkNotNullExpressionValue(container3, "container");
        ViewExtKt.setVisible(container3, true);
        WeightFocusIndexAdapter weightFocusIndexAdapter = this.focusIndexAdapter;
        if (weightFocusIndexAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("focusIndexAdapter");
            weightFocusIndexAdapter = null;
        }
        weightFocusIndexAdapter.updateDataList(listCreateBodyCompositionDataList$default);
    }

    @NotNull
    public final wzb getBinding() {
        return this.binding;
    }

    @NotNull
    public final Fragment getParent() {
        return this.parent;
    }
}
