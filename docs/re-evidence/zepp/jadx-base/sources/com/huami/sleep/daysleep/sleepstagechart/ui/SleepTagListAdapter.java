package com.huami.sleep.daysleep.sleepstagechart.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.sleep.daysleep.sleepstagechart.ui.SleepTagListAdapter;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagDataVo;
import com.huami.sleep.daysleep.sleepstagechart.vo.SleepTagType;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a¢\u0006\u0004\b$\u0010%J\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u000e\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000eJ\u001c\u0010\u0018\u001a\u00020\u000b2\u0014\u0010\u0017\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b0\u0016J\u0006\u0010\u0019\u001a\u00020\u000bR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010 \u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/huami/sleep/daysleep/sleepstagechart/ui/SleepTagListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "data", "updateData", "item", "setSelected", "addData", "", "has", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "cancelSelect", "", "a", "Ljava/util/List;", "tagList", "b", "Lkotlin/jvm/functions/Function1;", "mListener", "c", "Lcom/huami/sleep/daysleep/sleepstagechart/vo/SleepTagDataVo;", "mSelectItem", "<init>", "(Ljava/util/List;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final class SleepTagListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<SleepTagDataVo> tagList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Function1<? super SleepTagDataVo, Unit> mListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private SleepTagDataVo mSelectItem;

    public SleepTagListAdapter(@NotNull List<SleepTagDataVo> list) {
        this.tagList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SleepTagListAdapter sleepTagListAdapter, int i, View view) {
        SleepTagDataVo sleepTagDataVo;
        SleepTagDataVo sleepTagDataVo2 = sleepTagListAdapter.tagList.get(i);
        if (!Intrinsics.areEqual(sleepTagListAdapter.mSelectItem, sleepTagDataVo2) && (sleepTagDataVo = sleepTagListAdapter.mSelectItem) != null) {
            sleepTagDataVo.setSelect(false);
        }
        if (sleepTagDataVo2.getTagType() == SleepTagType.ADD.getValue()) {
            Function1<? super SleepTagDataVo, Unit> function1 = sleepTagListAdapter.mListener;
            if (function1 == null) {
                return;
            }
            function1.invoke(sleepTagDataVo2);
            return;
        }
        sleepTagDataVo2.setSelect(!sleepTagDataVo2.isSelect());
        if (!sleepTagDataVo2.isSelect()) {
            sleepTagDataVo2 = null;
        }
        sleepTagListAdapter.mSelectItem = sleepTagDataVo2;
        sleepTagListAdapter.notifyDataSetChanged();
        Function1<? super SleepTagDataVo, Unit> function2 = sleepTagListAdapter.mListener;
        if (function2 == null) {
            return;
        }
        function2.invoke(sleepTagListAdapter.mSelectItem);
    }

    public final void addData(@NotNull SleepTagDataVo item) {
        this.tagList.add(item);
        notifyDataSetChanged();
    }

    public final void cancelSelect() {
        SleepTagDataVo sleepTagDataVo = this.mSelectItem;
        if (sleepTagDataVo != null) {
            sleepTagDataVo.setSelect(false);
        }
        this.mSelectItem = null;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.tagList.size();
    }

    public final boolean has(@NotNull SleepTagDataVo item) {
        Iterator<T> it2 = this.tagList.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(((SleepTagDataVo) it2.next()).getTag(), item.getTag())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, final int position) {
        if (holder instanceof SleepTagHolder) {
            ((SleepTagHolder) holder).bindTo(this.tagList.get(position));
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: c37
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepTagListAdapter.b(this.a, position, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new SleepTagHolder(parent);
    }

    public final void setOnItemClickListener(@NotNull Function1<? super SleepTagDataVo, Unit> listener) {
        this.mListener = listener;
    }

    public final void setSelected(@NotNull SleepTagDataVo item) {
        SleepTagDataVo sleepTagDataVo = this.mSelectItem;
        if (sleepTagDataVo != null) {
            sleepTagDataVo.setSelect(false);
        }
        this.mSelectItem = item;
    }

    public final void updateData(@NotNull List<SleepTagDataVo> data) {
        List<SleepTagDataVo> list = this.tagList;
        list.clear();
        list.addAll(data);
        for (SleepTagDataVo sleepTagDataVo : this.tagList) {
            if (Intrinsics.areEqual(sleepTagDataVo, this.mSelectItem)) {
                sleepTagDataVo.setSelect(true);
                this.mSelectItem = sleepTagDataVo;
            }
        }
        notifyDataSetChanged();
    }
}
