package com.huami.devicerecorder.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.devicerecorder.model.SyncItemData;
import com.huami.devicerecorder.viewmodel.IRecorderSyncer;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\u0014\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\fJ\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/huami/devicerecorder/adapter/SyncingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/devicerecorder/adapter/SyncingViewHolder;", "", "position", "Lcom/huami/devicerecorder/model/SyncItemData;", "a", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "getItemCount", "", "data", "", "setData", "holder", "onBindViewHolder", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "onAttachedToRecyclerView", "onViewDetachedFromWindow", "onViewAttachedToWindow", "Landroid/view/LayoutInflater;", "Landroid/view/LayoutInflater;", "inflater", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "b", "Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "getSyncer", "()Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;", "setSyncer", "(Lcom/huami/devicerecorder/viewmodel/IRecorderSyncer;)V", "syncer", "", "c", "Ljava/util/List;", "items", "<init>", "()V", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class SyncingAdapter extends RecyclerView.Adapter<SyncingViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LayoutInflater inflater;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IRecorderSyncer syncer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<SyncItemData> items = new ArrayList();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "bind failed";
        }
    }

    private final SyncItemData a(int position) {
        if (position >= this.items.size() || position < 0) {
            return null;
        }
        return this.items.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getFragmentsCount() {
        return this.items.size();
    }

    @Nullable
    public final IRecorderSyncer getSyncer() {
        return this.syncer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.inflater = LayoutInflater.from(recyclerView.getContext());
    }

    public final void setData(@NotNull List<SyncItemData> data) {
        this.items.clear();
        this.items.addAll(data);
    }

    public final void setSyncer(@Nullable IRecorderSyncer iRecorderSyncer) {
        this.syncer = iRecorderSyncer;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SyncingViewHolder holder, int position) {
        SyncItemData syncItemDataA = a(position);
        if (syncItemDataA == null) {
            HMLog.info("SyncingAdapter", a.a);
        } else {
            holder.onBind(syncItemDataA);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SyncingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater == null) {
            layoutInflater = null;
        }
        SyncingViewHolder syncingViewHolder = new SyncingViewHolder(layoutInflater, parent);
        syncingViewHolder.setSyncer(this.syncer);
        return syncingViewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NotNull SyncingViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        holder.onViewAttachedFromWindow();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NotNull SyncingViewHolder holder) {
        super.onViewDetachedFromWindow(holder);
        holder.onViewDetachedFromWindow();
    }
}
