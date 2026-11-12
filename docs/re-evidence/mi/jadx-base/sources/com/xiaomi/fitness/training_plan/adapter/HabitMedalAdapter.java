package com.xiaomi.fitness.training_plan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.notch.ScreenUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.training_plan.habit_plan.HabitMedalData;
import defpackage.csi;
import defpackage.eki;
import defpackage.jvi;
import defpackage.uli;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u001c\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\u0006\u0010\u0014\u001a\u00020\u0011R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter$HabitMedalViewHolder;", "data", "", "Lcom/xiaomi/fitness/training_plan/habit_plan/HabitMedalData;", "<init>", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "refresh", "HabitMedalViewHolder", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitMedalAdapter extends RecyclerView.Adapter<HabitMedalViewHolder> {

    @NotNull
    private final List<HabitMedalData> data;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter$HabitMedalViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/widget/ImageView;", "medalRes", "Landroid/widget/ImageView;", "getMedalRes", "()Landroid/widget/ImageView;", "lockIcon", "getLockIcon", "Landroid/widget/TextView;", "medalDesc", "Landroid/widget/TextView;", "getMedalDesc", "()Landroid/widget/TextView;", "Landroid/view/View;", "lineLeft", "Landroid/view/View;", "getLineLeft", "()Landroid/view/View;", "lineRight", "getLineRight", "view", "<init>", "(Lcom/xiaomi/fitness/training_plan/adapter/HabitMedalAdapter;Landroid/view/View;)V", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class HabitMedalViewHolder extends RecyclerView.d0 {

        @NotNull
        private final View lineLeft;

        @NotNull
        private final View lineRight;

        @NotNull
        private final ImageView lockIcon;

        @NotNull
        private final TextView medalDesc;

        @NotNull
        private final ImageView medalRes;
        final /* synthetic */ HabitMedalAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HabitMedalViewHolder(@NotNull HabitMedalAdapter habitMedalAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            this.this$0 = habitMedalAdapter;
            View viewFindViewById = view.findViewById(csi.D1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.medalRes = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(csi.C1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.lockIcon = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(csi.A1);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.medalDesc = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(csi.X0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.lineLeft = viewFindViewById4;
            View viewFindViewById5 = view.findViewById(csi.Y0);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
            this.lineRight = viewFindViewById5;
        }

        @NotNull
        public final View getLineLeft() {
            return this.lineLeft;
        }

        @NotNull
        public final View getLineRight() {
            return this.lineRight;
        }

        @NotNull
        public final ImageView getLockIcon() {
            return this.lockIcon;
        }

        @NotNull
        public final TextView getMedalDesc() {
            return this.medalDesc;
        }

        @NotNull
        public final ImageView getMedalRes() {
            return this.medalRes;
        }
    }

    public HabitMedalAdapter(@NotNull List<HabitMedalData> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @NotNull
    public final List<HabitMedalData> getData() {
        return this.data;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.data.size();
    }

    public final void refresh() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull HabitMedalViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        HabitMedalData habitMedalData = this.data.get(position);
        holder.getMedalDesc().setTextColor(ExtUtilsKt.getColor(habitMedalData.getHasMadel() ? eki.d : eki.f));
        holder.getMedalDesc().setText(habitMedalData.getTitle());
        if (position == 0) {
            ViewExtKt.setVisible(holder.getLineLeft(), false);
            ViewExtKt.setVisible(holder.getLineRight(), true);
        } else if (position == this.data.size() - 1) {
            ViewExtKt.setVisible(holder.getLineLeft(), true);
            ViewExtKt.setVisible(holder.getLineRight(), false);
        } else {
            ViewExtKt.setVisible(holder.getLineLeft(), true);
            ViewExtKt.setVisible(holder.getLineRight(), true);
        }
        holder.getMedalRes().setImageResource(habitMedalData.getResId());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public HabitMedalViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(jvi.N, parent, false);
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        float dimension = parent.getContext().getResources().getDimension(uli.f35911a);
        ScreenUtil screenUtil = ScreenUtil.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = screenUtil.getScreenSize(context)[0];
        float f = 4;
        layoutParams.width = (int) (((UIUtils.INSTANCE.isTablet() ? Float.valueOf(i * 0.85f) : Integer.valueOf(i)).intValue() - (dimension * f)) / f);
        viewInflate.setLayoutParams(layoutParams);
        Intrinsics.checkNotNull(viewInflate);
        return new HabitMedalViewHolder(this, viewInflate);
    }
}
