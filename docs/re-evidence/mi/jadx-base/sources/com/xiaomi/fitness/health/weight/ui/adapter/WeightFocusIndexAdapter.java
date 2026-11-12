package com.xiaomi.fitness.health.weight.ui.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.weight.bean.WeightDataItem;
import defpackage.b4c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u000fH\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightFocusIndexAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/weight/ui/adapter/WeightFocusItemViewHolder;", "<init>", "()V", "dataList", "", "Lcom/xiaomi/fitness/health/weight/bean/WeightDataItem;", "updateDataList", "", "list", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightFocusIndexAdapter extends RecyclerView.Adapter<WeightFocusItemViewHolder> {

    @Nullable
    private List<WeightDataItem> dataList;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WeightDataItem> list = this.dataList;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    public final void updateDataList(@Nullable List<WeightDataItem> list) {
        this.dataList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WeightFocusItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<WeightDataItem> list = this.dataList;
        Intrinsics.checkNotNull(list);
        holder.bindData(list.get(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WeightFocusItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        b4c b4cVarA0 = b4c.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(b4cVarA0, "inflate(...)");
        return new WeightFocusItemViewHolder(b4cVarA0);
    }
}
