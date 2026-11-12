package com.xiaomi.fitness.habit.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.habit.bean.AddHabitDayBean;
import com.xiaomi.fitness.habit.ui.AddHabitDayAdapter;
import defpackage.hji;
import defpackage.iui;
import defpackage.nni;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB1\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitDayAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;", "dataList", "Ljava/util/List;", "Lkotlin/Function1;", "onClickListener", "Lkotlin/jvm/functions/Function1;", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "AddHabitDayViewHolder", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddHabitDayAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    private Context context;

    @NotNull
    private List<AddHabitDayBean> dataList;

    @NotNull
    private Function1<? super AddHabitDayBean, Unit> onClickListener;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitDayAdapter$AddHabitDayViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;", "addHabitDayBean", "", "bindData", "(Lcom/xiaomi/fitness/habit/bean/AddHabitDayBean;)V", "Landroid/widget/TextView;", "textView", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "setTextView", "(Landroid/widget/TextView;)V", "<init>", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AddHabitDayViewHolder extends RecyclerView.d0 {

        @NotNull
        private TextView textView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddHabitDayViewHolder(@NotNull TextView textView) {
            super(textView);
            Intrinsics.checkNotNullParameter(textView, "textView");
            this.textView = textView;
        }

        public final void bindData(@NotNull AddHabitDayBean addHabitDayBean) {
            Intrinsics.checkNotNullParameter(addHabitDayBean, "addHabitDayBean");
            if (addHabitDayBean.getType() == -1) {
                this.textView.setBackground(null);
            } else {
                this.textView.setBackgroundResource(nni.d);
                if (addHabitDayBean.getIsSelected()) {
                    this.textView.setTextColor(AppUtil.getApp().getColor(hji.f));
                } else {
                    this.textView.setTextColor(AppUtil.getApp().getColor(hji.f20133b));
                }
            }
            this.textView.setText(addHabitDayBean.getText());
            this.textView.setSelected(addHabitDayBean.getIsSelected());
        }

        @NotNull
        public final TextView getTextView() {
            return this.textView;
        }

        public final void setTextView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.textView = textView;
        }
    }

    public AddHabitDayAdapter(@NotNull Context context, @NotNull List<AddHabitDayBean> dataList, @NotNull Function1<? super AddHabitDayBean, Unit> onClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onClickListener, "onClickListener");
        this.context = context;
        this.dataList = dataList;
        this.onClickListener = onClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AddHabitDayAdapter this$0, AddHabitDayBean addHabitBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(addHabitBean, "$addHabitBean");
        Function1<? super AddHabitDayBean, Unit> function1 = this$0.onClickListener;
        if (function1 != null) {
            function1.invoke2(addHabitBean);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final AddHabitDayBean addHabitDayBean = this.dataList.get(position);
        ((AddHabitDayViewHolder) holder).bindData(addHabitDayBean);
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: ms0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddHabitDayAdapter.onBindViewHolder$lambda$0(this.f27146a, addHabitDayBean, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(iui.h, parent, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
        return new AddHabitDayViewHolder((TextView) viewInflate);
    }
}
