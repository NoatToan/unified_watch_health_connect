package com.huami.sleep.daysleep.sleepstagechart.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.daysleep.sleepstagechart.ui.OverlayDataAdapter;
import com.huami.sleep.daysleep.sleepstagechart.vo.SelectItemInfoVo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001c\u0010\u0013\u001a\u00020\u000b2\u0014\u0010\u0012\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\u0011R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001a\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/OverlayDataAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectItemInfoVo;", "data", "updateData", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "", "a", "Ljava/util/List;", "selectList", "b", "Lkotlin/jvm/functions/Function1;", "mListener", "c", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SelectItemInfoVo;", "mSelectedInfo", "<init>", "(Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class OverlayDataAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SelectItemInfoVo> selectList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super SelectItemInfoVo, Unit> mListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SelectItemInfoVo mSelectedInfo;

    public OverlayDataAdapter(@NotNull List<SelectItemInfoVo> list) {
        this.selectList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(OverlayDataAdapter overlayDataAdapter, int i, View view) {
        SelectItemInfoVo selectItemInfoVo = overlayDataAdapter.selectList.get(i);
        selectItemInfoVo.setSelected(!selectItemInfoVo.getSelected());
        SelectItemInfoVo selectItemInfoVo2 = overlayDataAdapter.mSelectedInfo;
        if (selectItemInfoVo2 != null && !Intrinsics.areEqual(selectItemInfoVo2.getId(), selectItemInfoVo.getId())) {
            selectItemInfoVo2.setSelected(false);
        }
        overlayDataAdapter.notifyDataSetChanged();
        if (selectItemInfoVo.getSelected()) {
            overlayDataAdapter.mSelectedInfo = selectItemInfoVo;
            Function1<? super SelectItemInfoVo, Unit> function1 = overlayDataAdapter.mListener;
            if (function1 == null) {
                return;
            }
            function1.invoke(overlayDataAdapter.selectList.get(i));
            return;
        }
        overlayDataAdapter.mSelectedInfo = null;
        Function1<? super SelectItemInfoVo, Unit> function2 = overlayDataAdapter.mListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.selectList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof DataHolder) {
            ((DataHolder) holder).bindTo(this.selectList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: sn5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OverlayDataAdapter.b(this.a, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new DataHolder(parent);
    }

    public final void setOnItemClickListener(@NotNull Function1<? super SelectItemInfoVo, Unit> listener) {
        this.mListener = listener;
    }

    public final void updateData(@NotNull List<SelectItemInfoVo> data) {
        List<SelectItemInfoVo> list = this.selectList;
        list.clear();
        list.addAll(data);
        notifyDataSetChanged();
    }
}
