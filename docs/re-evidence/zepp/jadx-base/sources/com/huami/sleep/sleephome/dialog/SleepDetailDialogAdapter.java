package com.huami.sleep.sleephome.dialog;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sleep.sleephome.dialog.SleepDetailDialogAdapter;
import com.huami.sleep.sleephome.vo.ShowActionItemInfo;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rR\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter$OnItemClickListener;", "onItemClickListener", "setOnItemClickListener", "", "Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "a", "Ljava/util/List;", "durList", "b", "Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter$OnItemClickListener;", "mListener", "<init>", "(Ljava/util/List;)V", "OnItemClickListener", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepDetailDialogAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<ShowActionItemInfo> durList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private OnItemClickListener mListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/huami/sleep/sleephome/dialog/SleepDetailDialogAdapter$OnItemClickListener;", "", "Lcom/huami/sleep/sleephome/vo/ShowActionItemInfo;", "info", "", "onItemClick", "sleep_release"}, k = 1, mv = {1, 5, 1})
    public interface OnItemClickListener {
        void onItemClick(@NotNull ShowActionItemInfo info);
    }

    public SleepDetailDialogAdapter(@NotNull List<ShowActionItemInfo> list) {
        this.durList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SleepDetailDialogAdapter sleepDetailDialogAdapter, int i, View view) {
        OnItemClickListener onItemClickListener = sleepDetailDialogAdapter.mListener;
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.onItemClick(sleepDetailDialogAdapter.durList.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.durList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof StageDurDataHolder) {
            ((StageDurDataHolder) holder).bindTo(this.durList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: wz6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepDetailDialogAdapter.b(this.a, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new StageDurDataHolder(parent);
    }

    public final void setOnItemClickListener(@NotNull OnItemClickListener onItemClickListener) {
        this.mListener = onItemClickListener;
    }
}
