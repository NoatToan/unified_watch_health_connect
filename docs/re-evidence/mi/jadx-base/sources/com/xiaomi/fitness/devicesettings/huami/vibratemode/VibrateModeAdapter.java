package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeAdapter;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.eui;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB\u001f\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bJ#\u0010\u000f\u001a\u00020\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0004¢\u0006\u0002\u0010\bJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0015H\u0016R \u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0006j\b\u0012\u0004\u0012\u00020\u0005`\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter$ViewHolder;", "mDataList", "Lkotlin/collections/ArrayList;", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeBean;", "Ljava/util/ArrayList;", "<init>", "(Ljava/util/ArrayList;)V", "Ljava/util/ArrayList;", "itemClickListener", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter$OnItemClickListener;", "setOnItemClickListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "updateData", "list", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "getItemCount", "OnItemClickListener", "ViewHolder", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VibrateModeAdapter extends RecyclerView.Adapter<ViewHolder> {

    @Nullable
    private OnItemClickListener itemClickListener;

    @NotNull
    private final ArrayList<VibrateModeBean> mDataList;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter$OnItemClickListener;", "", "onItemClick", "", "position", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/VibrateModeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class ViewHolder extends RecyclerView.d0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(@NotNull View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
        }
    }

    public VibrateModeAdapter(@NotNull ArrayList<VibrateModeBean> mDataList) {
        Intrinsics.checkNotNullParameter(mDataList, "mDataList");
        this.mDataList = mDataList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateViewHolder$lambda$0(VibrateModeAdapter this$0, View itemView, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(itemView, "$itemView");
        OnItemClickListener onItemClickListener = this$0.itemClickListener;
        if (onItemClickListener != null) {
            Intrinsics.checkNotNull(onItemClickListener);
            Object tag = itemView.getTag();
            Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.Int");
            onItemClickListener.onItemClick(((Integer) tag).intValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    public final void setOnItemClickListener(@Nullable OnItemClickListener listener) {
        this.itemClickListener = listener;
    }

    public final void updateData(@NotNull ArrayList<VibrateModeBean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.mDataList.clear();
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.itemView.setTag(Integer.valueOf(position));
        VibrateModeBean vibrateModeBean = this.mDataList.get(position);
        Intrinsics.checkNotNullExpressionValue(vibrateModeBean, "get(...)");
        VibrateModeBean vibrateModeBean2 = vibrateModeBean;
        View view = holder.itemView;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.xiaomi.fitness.widget.RightArrowSingleLineTextView");
        RightArrowSingleLineTextView rightArrowSingleLineTextView = (RightArrowSingleLineTextView) view;
        rightArrowSingleLineTextView.setTitle(vibrateModeBean2.getName());
        rightArrowSingleLineTextView.setRemindText(vibrateModeBean2.getVibrateName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        final View viewInflate = LayoutInflater.from(parent.getContext()).inflate(eui.Z1, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: qpq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VibrateModeAdapter.onCreateViewHolder$lambda$0(this.f31730a, viewInflate, view);
            }
        });
        return new ViewHolder(viewInflate);
    }
}
