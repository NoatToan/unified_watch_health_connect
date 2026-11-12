package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.health.sleep.ui.SleepHrmDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepHeartRateDayHolderV2;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.qxi;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepHeartRateDayHolderV2;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mContext", "Landroid/content/Context;", "mRootView", "rightArrowSingleLineTextView", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "updateReport", "", "report", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepHeartRateDayHolderV2 {

    @NotNull
    private static final String TAG = "SleepHeartRateDayHolder";

    @NotNull
    private final Context mContext;

    @NotNull
    private final View mRootView;

    @NotNull
    private RightArrowSingleLineTextView rightArrowSingleLineTextView;

    public SleepHeartRateDayHolderV2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        View viewFindViewById = view.findViewById(eri.V9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(eri.be);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RightArrowSingleLineTextView rightArrowSingleLineTextView = (RightArrowSingleLineTextView) viewFindViewById2;
        this.rightArrowSingleLineTextView = rightArrowSingleLineTextView;
        rightArrowSingleLineTextView.showMore(true);
        this.rightArrowSingleLineTextView.setStartIconVisible(false);
        this.rightArrowSingleLineTextView.updateTitleMaxLines(3);
        this.rightArrowSingleLineTextView.setTitle(c0j.Ad);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateReport$lambda$0(SleepSegmentReport report, SleepHeartRateDayHolderV2 this$0, View view) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putSerializable("report", report);
        bundle.putSerializable("record_list", (Serializable) report.getHrRecords());
        HealthUtil.INSTANCE.gotoPage(this$0.mContext, SleepHrmDetailFragment.class, bundle, null);
        SleepTrackHelper.INSTANCE.trackSleepDayItemClick(1);
    }

    public final void updateReport(@NotNull final SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        if (!ArrayUtils.isEmpty(report.getHrRecords()) && report.getAvgHr() != null) {
            Integer avgHr = report.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            if (avgHr.intValue() > 0) {
                this.mRootView.setVisibility(0);
                this.mRootView.requestLayout();
                Resources resources = this.mContext.getResources();
                int i = qxi.common_unit_heart_rate_desc;
                Integer avgHr2 = report.getAvgHr();
                Intrinsics.checkNotNull(avgHr2);
                String quantityString = resources.getQuantityString(i, avgHr2.intValue(), report.getAvgHr());
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
                this.rightArrowSingleLineTextView.setRemindText(quantityString);
                this.rightArrowSingleLineTextView.setOnClickListener(new View.OnClickListener() { // from class: tmm
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SleepHeartRateDayHolderV2.updateReport$lambda$0(report, this, view);
                    }
                });
                return;
            }
        }
        this.mRootView.setVisibility(8);
        this.mRootView.requestLayout();
    }
}
