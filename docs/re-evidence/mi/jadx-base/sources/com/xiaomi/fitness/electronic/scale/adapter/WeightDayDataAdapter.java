package com.xiaomi.fitness.electronic.scale.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.electronic.scale.adapter.WeightDayDataAdapter;
import com.xiaomi.fitness.electronic.scale.data.WeightDataItem;
import defpackage.n48;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDayDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDataItemViewHolder;", "<init>", "()V", "dataList", "", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "onItemClickListener", "Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDayDataAdapter$OnItemClickListener;", "updateDataList", "", "list", "setOnItemClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "OnItemClickListener", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeightDayDataAdapter extends RecyclerView.Adapter<WeightDataItemViewHolder> {

    @Nullable
    private List<WeightDataItem> dataList;

    @Nullable
    private OnItemClickListener onItemClickListener;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/adapter/WeightDayDataAdapter$OnItemClickListener;", "", "onClick", "", "weightDataItem", "Lcom/xiaomi/fitness/electronic/scale/data/WeightDataItem;", "electronic-scale_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onClick(@NotNull WeightDataItem weightDataItem);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(WeightDayDataAdapter this$0, WeightDataItem weightDataItem, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(weightDataItem, "$weightDataItem");
        OnItemClickListener onItemClickListener = this$0.onItemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            onItemClickListener.onClick(weightDataItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<WeightDataItem> list = this.dataList;
        if (list == null) {
            return 0;
        }
        Intrinsics.checkNotNull(list);
        return list.size();
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onItemClickListener = listener;
    }

    public final void updateDataList(@Nullable List<WeightDataItem> list) {
        this.dataList = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull WeightDataItemViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        List<WeightDataItem> list = this.dataList;
        Intrinsics.checkNotNull(list);
        final WeightDataItem weightDataItem = list.get(position);
        holder.bindData(weightDataItem);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ifr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WeightDayDataAdapter.onBindViewHolder$lambda$0(this.f21101a, weightDataItem, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public WeightDataItemViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        n48 n48VarA0 = n48.A0(ExtUtilsKt.getInflater(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(n48VarA0, "inflate(...)");
        return new WeightDataItemViewHolder(n48VarA0);
    }
}
