package com.xiaomi.fitness.habit.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.habit.ui.AddHabitTimeAdapter;
import defpackage.dri;
import defpackage.iui;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\"#$B=\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00160\u0015\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u0019¢\u0006\u0004\b \u0010!J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R.\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "holder", "", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "Lkotlin/Pair;", "dataList", "Ljava/util/List;", "Lkotlin/Function1;", "onAddClickListener", "Lkotlin/jvm/functions/Function1;", "getOnAddClickListener", "()Lkotlin/jvm/functions/Function1;", "setOnAddClickListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Companion", "AddHabitTimeViewHolder", "AddHabitAddViewHolder", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class AddHabitTimeAdapter extends RecyclerView.Adapter<RecyclerView.d0> {
    public static final int sTypeAdd = -1;

    @NotNull
    private Context context;

    @NotNull
    private List<Pair<Integer, Integer>> dataList;

    @NotNull
    private Function1<? super Unit, Unit> onAddClickListener;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter$AddHabitAddViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "<init>", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class AddHabitAddViewHolder extends RecyclerView.d0 {

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddHabitAddViewHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.view = view;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter$AddHabitTimeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lkotlin/Pair;", "", "pair", "", "bindData", "(Lkotlin/Pair;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "timeView", "Landroid/widget/TextView;", "getTimeView", "()Landroid/widget/TextView;", "setTimeView", "(Landroid/widget/TextView;)V", "Landroid/widget/ImageView;", "deleteView", "Landroid/widget/ImageView;", "getDeleteView", "()Landroid/widget/ImageView;", "setDeleteView", "(Landroid/widget/ImageView;)V", "<init>", "(Lcom/xiaomi/fitness/habit/ui/AddHabitTimeAdapter;Landroid/view/View;)V", "habit_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class AddHabitTimeViewHolder extends RecyclerView.d0 {

        @NotNull
        private ImageView deleteView;
        final /* synthetic */ AddHabitTimeAdapter this$0;

        @NotNull
        private TextView timeView;

        @NotNull
        private View view;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddHabitTimeViewHolder(@NotNull AddHabitTimeAdapter addHabitTimeAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = addHabitTimeAdapter;
            this.view = view;
            View viewFindViewById = view.findViewById(dri.f15841r);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.timeView = (TextView) viewFindViewById;
            View viewFindViewById2 = this.view.findViewById(dri.o);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.deleteView = (ImageView) viewFindViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindData$lambda$0(AddHabitTimeAdapter this$0, Pair pair, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pair, "$pair");
            this$0.dataList.remove(pair);
            this$0.notifyDataSetChanged();
        }

        public final void bindData(@NotNull final Pair<Integer, Integer> pair) {
            String strValueOf;
            String strValueOf2;
            Intrinsics.checkNotNullParameter(pair, "pair");
            if (pair.getFirst().intValue() < 10) {
                strValueOf = "0" + pair.getFirst();
            } else {
                strValueOf = String.valueOf(pair.getFirst().intValue());
            }
            if (pair.getSecond().intValue() < 10) {
                strValueOf2 = "0" + pair.getSecond();
            } else {
                strValueOf2 = String.valueOf(pair.getSecond().intValue());
            }
            this.timeView.setText(strValueOf + ":" + strValueOf2);
            ImageView imageView = this.deleteView;
            final AddHabitTimeAdapter addHabitTimeAdapter = this.this$0;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: qs0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddHabitTimeAdapter.AddHabitTimeViewHolder.bindData$lambda$0(addHabitTimeAdapter, pair, view);
                }
            });
        }

        @NotNull
        public final ImageView getDeleteView() {
            return this.deleteView;
        }

        @NotNull
        public final TextView getTimeView() {
            return this.timeView;
        }

        @NotNull
        public final View getView() {
            return this.view;
        }

        public final void setDeleteView(@NotNull ImageView imageView) {
            Intrinsics.checkNotNullParameter(imageView, "<set-?>");
            this.deleteView = imageView;
        }

        public final void setTimeView(@NotNull TextView textView) {
            Intrinsics.checkNotNullParameter(textView, "<set-?>");
            this.timeView = textView;
        }

        public final void setView(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "<set-?>");
            this.view = view;
        }
    }

    public AddHabitTimeAdapter(@NotNull Context context, @NotNull List<Pair<Integer, Integer>> dataList, @NotNull Function1<? super Unit, Unit> onAddClickListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        Intrinsics.checkNotNullParameter(onAddClickListener, "onAddClickListener");
        this.context = context;
        this.dataList = dataList;
        this.onAddClickListener = onAddClickListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(AddHabitTimeAdapter this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super Unit, Unit> function1 = this$0.onAddClickListener;
        if (function1 != null) {
            function1.invoke2(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(AddHabitTimeAdapter this$0, Pair addHabitBean, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(addHabitBean, "$addHabitBean");
        this$0.dataList.remove(addHabitBean);
        List<Pair<Integer, Integer>> list = this$0.dataList;
        Pair<Integer, Integer> pair = list.get(CollectionsKt__CollectionsKt.getLastIndex(list));
        if (pair.getFirst().intValue() != -1 && pair.getSecond().intValue() != -1) {
            this$0.dataList.add(new Pair<>(-1, -1));
        }
        this$0.notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.dataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        Pair<Integer, Integer> pair = this.dataList.get(position);
        return (pair.getFirst().intValue() == -1 && pair.getSecond().intValue() == -1) ? -1 : 0;
    }

    @NotNull
    public final Function1<Unit, Unit> getOnAddClickListener() {
        return this.onAddClickListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AddHabitAddViewHolder) {
            ((AddHabitAddViewHolder) holder).getView().setOnClickListener(new View.OnClickListener() { // from class: os0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddHabitTimeAdapter.onBindViewHolder$lambda$0(this.f29640a, view);
                }
            });
        } else if (holder instanceof AddHabitTimeViewHolder) {
            final Pair<Integer, Integer> pair = this.dataList.get(position);
            AddHabitTimeViewHolder addHabitTimeViewHolder = (AddHabitTimeViewHolder) holder;
            addHabitTimeViewHolder.bindData(pair);
            addHabitTimeViewHolder.getDeleteView().setOnClickListener(new View.OnClickListener() { // from class: ps0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AddHabitTimeAdapter.onBindViewHolder$lambda$1(this.f30693a, pair, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == -1) {
            View viewInflate = LayoutInflater.from(this.context).inflate(iui.g, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new AddHabitAddViewHolder(viewInflate);
        }
        View viewInflate2 = LayoutInflater.from(this.context).inflate(iui.f22105k, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
        return new AddHabitTimeViewHolder(this, viewInflate2);
    }

    public final void setOnAddClickListener(@NotNull Function1<? super Unit, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onAddClickListener = function1;
    }
}
