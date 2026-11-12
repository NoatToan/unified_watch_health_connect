package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepDurationHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.widget.view.DurationTextView;
import defpackage.lbe;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepDurationHolder;", "", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "report", "", "updateReport", "(Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Llbe;", "binding", "Llbe;", "", "dayWeekMonthPosition", "I", "Landroid/widget/TextView;", "tvTitle", "Landroid/widget/TextView;", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "durationView", "Lcom/xiaomi/fitness/widget/view/DurationTextView;", "Landroid/content/Context;", "mContext", "Landroid/content/Context;", "<init>", "(Llbe;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepDurationHolder {

    @NotNull
    private final lbe binding;
    private final int dayWeekMonthPosition;

    @NotNull
    private final DurationTextView durationView;

    @NotNull
    private final Context mContext;

    @NotNull
    private final TextView tvTitle;

    public SleepDurationHolder(@NotNull lbe binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.dayWeekMonthPosition = i;
        TextView tvTitle = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
        this.tvTitle = tvTitle;
        DurationTextView durationView = binding.A;
        Intrinsics.checkNotNullExpressionValue(durationView, "durationView");
        this.durationView = durationView;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        tvTitle.setOnClickListener(new View.OnClickListener() { // from class: bmm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepDurationHolder._init_$lambda$0(this.f4372a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(SleepDurationHolder this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SleepExtKt.jumpUnderstandSleepPage(this$0.mContext);
    }

    public final void updateReport(@Nullable AllDaySleepReport report) {
        List<SleepSegmentReport> sleepSegments;
        if (report == null || (sleepSegments = report.getSleepSegments()) == null || sleepSegments.size() <= 1) {
            this.binding.getRoot().setVisibility(8);
        } else {
            this.binding.getRoot().setVisibility(0);
            this.durationView.setDuration(TimeUnit.MINUTES.toMillis(this.dayWeekMonthPosition == 0 ? report.getTotalDuration() : report.getAvgDuration()));
        }
    }
}
