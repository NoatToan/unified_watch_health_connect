package com.huami.phn.coach.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.phn.coach.R;
import com.huami.phn.coach.ui.adapter.PHNRestDaysSelectAdapter;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0015\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u0007\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter$ViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "", "selectedArray", "initSelectedArray", "", "getSelectList", "", "", "a", "Ljava/util/List;", "dataList", "b", "Ljava/util/Set;", "daySelectedList", "<init>", "(Ljava/util/List;)V", "ViewHolder", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class PHNRestDaysSelectAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<String> dataList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private Set<Integer> daySelectedList = new LinkedHashSet();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/widget/TextView;", "a", "Landroid/widget/TextView;", "getTvRestDay", "()Landroid/widget/TextView;", "setTvRestDay", "(Landroid/widget/TextView;)V", "tvRestDay", "Landroid/view/View;", "itemView", "<init>", "(Lcom/huami/phn/coach/ui/adapter/PHNRestDaysSelectAdapter;Landroid/view/View;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
    public final class ViewHolder extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private TextView tvRestDay;

        public ViewHolder(View view) {
            super(view);
            this.tvRestDay = (TextView) view.findViewById(R.id.tv_rest_day);
        }

        @NotNull
        public final TextView getTvRestDay() {
            return this.tvRestDay;
        }

        public final void setTvRestDay(@NotNull TextView textView) {
            this.tvRestDay = textView;
        }
    }

    public PHNRestDaysSelectAdapter(@NotNull List<String> list) {
        this.dataList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(PHNRestDaysSelectAdapter pHNRestDaysSelectAdapter, int i, ViewHolder viewHolder, View view) {
        if (!pHNRestDaysSelectAdapter.daySelectedList.contains(Integer.valueOf(i)) && pHNRestDaysSelectAdapter.daySelectedList.size() < 4) {
            pHNRestDaysSelectAdapter.daySelectedList.add(Integer.valueOf(i));
            viewHolder.getTvRestDay().setSelected(true);
            viewHolder.getTvRestDay().setBackgroundResource(R.drawable.phn_shape_oval_s51);
        } else if (pHNRestDaysSelectAdapter.daySelectedList.contains(Integer.valueOf(i))) {
            pHNRestDaysSelectAdapter.daySelectedList.remove(Integer.valueOf(i));
            viewHolder.getTvRestDay().setSelected(false);
            viewHolder.getTvRestDay().setBackground(null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.dataList.size();
    }

    @NotNull
    public final Set<Integer> getSelectList() {
        return this.daySelectedList;
    }

    public final void initSelectedArray(@NotNull int[] selectedArray) {
        if (!(selectedArray.length == 0)) {
            this.daySelectedList.addAll(ArraysKt___ArraysKt.toList(selectedArray));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final ViewHolder holder, final int position) {
        holder.getTvRestDay().setText(this.dataList.get(position));
        holder.getTvRestDay().setSelected(this.daySelectedList.contains(Integer.valueOf(position)));
        if (holder.getTvRestDay().isSelected()) {
            holder.getTvRestDay().setBackgroundResource(R.drawable.phn_shape_oval_s51);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: bp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PHNRestDaysSelectAdapter.b(this.a, position, holder, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.phn_item_rest_day, parent, false));
    }
}
