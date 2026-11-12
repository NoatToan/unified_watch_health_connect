package com.xiaomi.fitness.training_plan.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.training_plan.adapter.HabitTrainAdapter;
import com.xiaomi.fitness.training_plan_export.model.HabitDayPlan;
import defpackage.csi;
import defpackage.jvi;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u0014\u0010\u0016\u001a\u00020\u00152\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u001a\u0010\b\u001a\u00020\tX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/training_plan/widget/HabitHomeTrainFutureCard;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "adapter", "Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter;", "getAdapter", "()Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter;", "setAdapter", "(Lcom/xiaomi/fitness/training_plan/adapter/HabitTrainAdapter;)V", "futureRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "getFutureRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "setFutureRecycler", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onFinishInflate", "", "render", "planData", "", "Lcom/xiaomi/fitness/training_plan_export/model/HabitDayPlan;", "training-plan_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HabitHomeTrainFutureCard extends LinearLayout {
    public HabitTrainAdapter adapter;
    public RecyclerView futureRecycler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HabitHomeTrainFutureCard(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(context).inflate(jvi.K, this);
    }

    @NotNull
    public final HabitTrainAdapter getAdapter() {
        HabitTrainAdapter habitTrainAdapter = this.adapter;
        if (habitTrainAdapter != null) {
            return habitTrainAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("adapter");
        return null;
    }

    @NotNull
    public final RecyclerView getFutureRecycler() {
        RecyclerView recyclerView = this.futureRecycler;
        if (recyclerView != null) {
            return recyclerView;
        }
        Intrinsics.throwUninitializedPropertyAccessException("futureRecycler");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setFutureRecycler((RecyclerView) findViewById(csi.l4));
        setAdapter(new HabitTrainAdapter(CollectionsKt__CollectionsKt.emptyList()));
        getFutureRecycler().setAdapter(getAdapter());
    }

    public final void render(@NotNull List<HabitDayPlan> planData) {
        Intrinsics.checkNotNullParameter(planData, "planData");
        getAdapter().setData(planData);
    }

    public final void setAdapter(@NotNull HabitTrainAdapter habitTrainAdapter) {
        Intrinsics.checkNotNullParameter(habitTrainAdapter, "<set-?>");
        this.adapter = habitTrainAdapter;
    }

    public final void setFutureRecycler(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "<set-?>");
        this.futureRecycler = recyclerView;
    }
}
