package com.xiaomi.fitness.health.sleep.interfere.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportFragment;
import com.xiaomi.fitness.health.sleep.interfere.adapter.SleepInterfereHistoryAdapter;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.utils.DateTimeUtils;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eod;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00192\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fH\u0007J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u001c\u0010\u0016\u001a\u00020\r2\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0014H\u0016R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter$SleepInterfereHistoryViewHolder;", "ctx", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getCtx", "()Landroid/content/Context;", "planHistoryList", "Ljava/util/ArrayList;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "addPlanHistory", "", "list", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "getItemCount", "onBindViewHolder", "holder", "position", "Companion", "SleepInterfereHistoryViewHolder", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterfereHistoryAdapter extends RecyclerView.Adapter<SleepInterfereHistoryViewHolder> {
    private static final int DAY_IN_SECOND = 86400;

    @NotNull
    private final Context ctx;

    @NotNull
    private final ArrayList<SleepInterferePlan> planHistoryList;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter$SleepInterfereHistoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "plan", "", "bind", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;)V", "Leod;", "binding", "Leod;", "getBinding", "()Leod;", "<init>", "(Lcom/xiaomi/fitness/health/sleep/interfere/adapter/SleepInterfereHistoryAdapter;Leod;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class SleepInterfereHistoryViewHolder extends RecyclerView.d0 {

        @NotNull
        private final eod binding;
        final /* synthetic */ SleepInterfereHistoryAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SleepInterfereHistoryViewHolder(@NotNull SleepInterfereHistoryAdapter sleepInterfereHistoryAdapter, eod binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.this$0 = sleepInterfereHistoryAdapter;
            this.binding = binding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bind$lambda$0(SleepInterfereHistoryAdapter this$0, SleepInterferePlan plan, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(plan, "$plan");
            SleepInterfereReportFragment.INSTANCE.launch(this$0.getCtx(), plan.getId());
        }

        public final void bind(@NotNull final SleepInterferePlan plan) {
            Intrinsics.checkNotNullParameter(plan, "plan");
            long jAbs = (Math.abs(plan.getEndDate() - plan.getStartDate()) / ((long) 86400)) + 1;
            TextView textView = this.binding.A;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = ExtUtilKt.getString(c0j.xg);
            DateTimeUtils dateTimeUtils = DateTimeUtils.INSTANCE;
            String str = String.format(string, Arrays.copyOf(new Object[]{dateTimeUtils.formatTitleDate(plan.getStartDate(), 0)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            textView.setText(str);
            this.binding.B.setText(this.this$0.getCtx().getResources().getQuantityString(qxi.C0, (int) jAbs, dateTimeUtils.formatDescDate(plan.getStartDate(), 0), dateTimeUtils.formatDescDate(plan.getEndDate(), 0), Long.valueOf(jAbs)));
            View root = this.binding.getRoot();
            final SleepInterfereHistoryAdapter sleepInterfereHistoryAdapter = this.this$0;
            root.setOnClickListener(new View.OnClickListener() { // from class: snm
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepInterfereHistoryAdapter.SleepInterfereHistoryViewHolder.bind$lambda$0(sleepInterfereHistoryAdapter, plan, view);
                }
            });
        }

        @NotNull
        public final eod getBinding() {
            return this.binding;
        }
    }

    public SleepInterfereHistoryAdapter(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        this.ctx = ctx;
        this.planHistoryList = new ArrayList<>();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void addPlanHistory(@Nullable List<SleepInterferePlan> list) {
        if (list != null) {
            this.planHistoryList.addAll(list);
            notifyDataSetChanged();
        }
    }

    @NotNull
    public final Context getCtx() {
        return this.ctx;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        return this.planHistoryList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull SleepInterfereHistoryViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SleepInterferePlan sleepInterferePlan = this.planHistoryList.get(position);
        Intrinsics.checkNotNullExpressionValue(sleepInterferePlan, "get(...)");
        holder.bind(sleepInterferePlan);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SleepInterfereHistoryViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        eod eodVarA0 = eod.A0(LayoutInflater.from(this.ctx), parent, false);
        Intrinsics.checkNotNullExpressionValue(eodVarA0, "inflate(...)");
        return new SleepInterfereHistoryViewHolder(this, eodVarA0);
    }
}
