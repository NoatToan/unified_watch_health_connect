package com.huami.femalehealth.uilib.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.femalehealth.uilib.adapter.TrainingAdapter;
import com.huami.training.domain.model.TrainingVo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0014\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fR0\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/huami/femalehealth/uilib/adapter/TrainingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/femalehealth/uilib/adapter/TrainingViewHolder;", "", "position", "Lcom/huami/training/domain/model/TrainingVo;", "b", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "holder", "", "onBindViewHolder", "getItemCount", "", "list", "submit", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getOnItemClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnItemClickListener", "(Lkotlin/jvm/functions/Function1;)V", "onItemClickListener", "", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "dataList", "<init>", "()V", "uilib_release"}, k = 1, mv = {1, 5, 1})
public final class TrainingAdapter extends RecyclerView.Adapter<TrainingViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super TrainingVo, Unit> onItemClickListener;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private List<TrainingVo> dataList = new ArrayList();

    private final TrainingVo b(int position) {
        return this.dataList.get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TrainingAdapter trainingAdapter, TrainingViewHolder trainingViewHolder, View view) {
        Function1<TrainingVo, Unit> onItemClickListener = trainingAdapter.getOnItemClickListener();
        if (onItemClickListener == null) {
            return;
        }
        onItemClickListener.invoke(trainingAdapter.b(trainingViewHolder.getAdapterPosition()));
    }

    @NotNull
    public final List<TrainingVo> getDataList() {
        return this.dataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.dataList.size();
    }

    @Nullable
    public final Function1<TrainingVo, Unit> getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void setDataList(@NotNull List<TrainingVo> list) {
        this.dataList = list;
    }

    public final void setOnItemClickListener(@Nullable Function1<? super TrainingVo, Unit> function1) {
        this.onItemClickListener = function1;
    }

    public final void submit(@NotNull List<TrainingVo> list) {
        this.dataList.clear();
        this.dataList.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull TrainingViewHolder holder, int position) {
        holder.bind(b(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public TrainingViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        final TrainingViewHolder trainingViewHolder = new TrainingViewHolder(parent);
        trainingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: tt7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingAdapter.c(this.a, trainingViewHolder, view);
            }
        });
        return trainingViewHolder;
    }
}
