package com.xiaomi.fitness.health.sleep.interfere.report;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import defpackage.bom;
import defpackage.jui;
import defpackage.kom;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "plan", "", "updatePlan", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;)V", "", "getItemCount", "()I", "position", "getItemViewType", "(I)I", "Landroid/view/ViewGroup;", "parent", "type", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "holder", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Landroid/content/Context;", "ctx", "Landroid/content/Context;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "", "showEmpty", "Ljava/lang/Boolean;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereReportAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportAdapter.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
public final class SleepInterfereReportAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    @NotNull
    public static final String TAG = "SleepInterfereReportAdapter";
    private static final int TYPE_DURATION = 2;
    private static final int TYPE_EMPTY = 5;
    private static final int TYPE_NAP = 4;
    private static final int TYPE_NIGHT_AWAKE = 3;
    private static final int TYPE_REGULARITY = 1;
    private static final int TYPE_SUMMARY = 0;

    @NotNull
    private final Context ctx;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @Nullable
    private Boolean showEmpty;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    public SleepInterfereReportAdapter(@NotNull Context ctx, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.ctx = ctx;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        Boolean bool = this.showEmpty;
        if (bool != null) {
            return bool.booleanValue() ? 2 : 5;
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0022, code lost:
    
        if (r4 == 3) goto L13;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getItemViewType(int r4) {
        /*
            r3 = this;
            java.lang.Boolean r0 = r3.showEmpty
            r1 = 5
            if (r0 == 0) goto L44
            boolean r0 = r0.booleanValue()
            if (r4 != 0) goto Ld
            r1 = 0
            goto L44
        Ld:
            r2 = 1
            if (r0 == 0) goto L13
            if (r4 != r2) goto L13
            goto L44
        L13:
            if (r0 != 0) goto L19
            if (r4 != r2) goto L19
        L17:
            r1 = r2
            goto L44
        L19:
            if (r0 != 0) goto L1f
            r2 = 2
            if (r4 != r2) goto L1f
            goto L17
        L1f:
            if (r0 != 0) goto L25
            r2 = 3
            if (r4 != r2) goto L25
            goto L17
        L25:
            if (r0 != 0) goto L2c
            r0 = 4
            if (r4 != r0) goto L2c
            r1 = r0
            goto L44
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "getItemViewType: unknown position: "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "SleepInterfereReportAdapter"
            com.xiaomi.fitness.common.log.Logger.i(r0, r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L44:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportAdapter.getItemViewType(int):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int type) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (type == 0) {
            View viewInflate = LayoutInflater.from(this.ctx).inflate(jui.y8, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            return new SleepInterfereReportSummaryHolder(viewInflate, this.lifecycleOwner, this.viewModel);
        }
        if (type == 1) {
            View viewInflate2 = LayoutInflater.from(this.ctx).inflate(jui.x8, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate2, "inflate(...)");
            return new SleepInterfereReportSleepRegularityHolder(viewInflate2, this.lifecycleOwner, this.viewModel);
        }
        if (type == 2) {
            View viewInflate3 = LayoutInflater.from(this.ctx).inflate(jui.w8, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate3, "inflate(...)");
            return new SleepInterfereReportSleepDurationHolder(viewInflate3, this.lifecycleOwner, this.viewModel);
        }
        if (type == 3) {
            View viewInflate4 = LayoutInflater.from(this.ctx).inflate(jui.v8, parent, false);
            Intrinsics.checkNotNullExpressionValue(viewInflate4, "inflate(...)");
            return new SleepInterfereReportNightAwakeCountHolder(viewInflate4, this.lifecycleOwner, this.viewModel);
        }
        if (type == 4) {
            Context context = this.ctx;
            kom komVarA0 = kom.A0(LayoutInflater.from(context), parent, false);
            Intrinsics.checkNotNullExpressionValue(komVarA0, "inflate(...)");
            return new SleepInterfereReportNapHolder(context, komVarA0, this.lifecycleOwner, this.viewModel);
        }
        if (type != 5) {
            return new RecyclerView.d0(new View(this.ctx)) { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportAdapter.onCreateViewHolder.1
            };
        }
        Context context2 = this.ctx;
        bom bomVarA0 = bom.A0(LayoutInflater.from(context2), parent, false);
        Intrinsics.checkNotNullExpressionValue(bomVarA0, "inflate(...)");
        return new SleepInterfereReportEmptyHolder(context2, bomVarA0, this.lifecycleOwner, this.viewModel);
    }

    public final void updatePlan(@NotNull SleepInterferePlan plan) {
        Intrinsics.checkNotNullParameter(plan, "plan");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        this.showEmpty = Boolean.valueOf(((long) (plan.getReport().getCompletedDaysCount() * 2)) <= ChronoUnit.DAYS.between(Instant.ofEpochSecond(plan.getStartDate()).atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochSecond(plan.getEndDate()).atZone(zoneIdSystemDefault).toLocalDate()));
        notifyDataSetChanged();
    }
}
