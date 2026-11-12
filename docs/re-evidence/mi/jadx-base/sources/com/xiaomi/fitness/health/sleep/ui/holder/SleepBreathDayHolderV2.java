package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.health.sleep.ui.SleepBreathQualityDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.SleepBreathRateDetailFragment;
import com.xiaomi.fitness.health.sleep.ui.holder.SleepBreathDayHolderV2;
import com.xiaomi.fitness.health.sleep.utils.SleepTrackHelper;
import com.xiaomi.fitness.util.HealthUtil;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.qxi;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepBreathDayHolderV2;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mContext", "Landroid/content/Context;", "mRootView", "rightArrowSingleLineTextView", "Lcom/xiaomi/fitness/widget/RightArrowSingleLineTextView;", "updateReport", "", "report", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "showBreathRateView", "avgBreathRate", "", "showBreathQualityView", "breathQuality", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepBreathDayHolderV2 {

    @NotNull
    private static final String TAG = "SleepBreathDayHolder";

    @NotNull
    private final Context mContext;

    @NotNull
    private final View mRootView;

    @NotNull
    private RightArrowSingleLineTextView rightArrowSingleLineTextView;

    public SleepBreathDayHolderV2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        View viewFindViewById = view.findViewById(eri.T9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        View viewFindViewById2 = viewFindViewById.findViewById(eri.be);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        RightArrowSingleLineTextView rightArrowSingleLineTextView = (RightArrowSingleLineTextView) viewFindViewById2;
        this.rightArrowSingleLineTextView = rightArrowSingleLineTextView;
        rightArrowSingleLineTextView.showMore(true);
        this.rightArrowSingleLineTextView.setStartIconVisible(false);
        this.rightArrowSingleLineTextView.updateTitleMaxLines(3);
    }

    private final void showBreathQualityView(final int breathQuality) {
        this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: kim
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SleepBreathDayHolderV2.showBreathQualityView$lambda$2(breathQuality, this, view);
            }
        });
        if (breathQuality == 0) {
            this.rightArrowSingleLineTextView.setTitle(this.mContext.getString(c0j.be));
            this.rightArrowSingleLineTextView.setRemindText(this.mContext.getString(c0j.common_data_empty));
        } else {
            this.rightArrowSingleLineTextView.setTitle(this.mContext.getResources().getString(c0j.be));
            this.rightArrowSingleLineTextView.setRemindText(this.mContext.getResources().getQuantityString(qxi.S0, breathQuality, Integer.valueOf(breathQuality)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBreathQualityView$lambda$2(int i, SleepBreathDayHolderV2 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt(SleepBreathQualityDetailFragment.KEY_BREATH_QUALITY, i);
        HealthUtil.INSTANCE.gotoPage(this$0.mContext, SleepBreathQualityDetailFragment.class, bundle, null);
        SleepTrackHelper.INSTANCE.trackSleepDayItemClick(3);
    }

    private final void showBreathRateView(final int avgBreathRate, final SleepSegmentReport report) {
        List<TimesDataRecordInt> list;
        this.rightArrowSingleLineTextView.setTitle(this.mContext.getResources().getString(c0j.Fd));
        List<TimesDataRecordInt> breathRateRecords = report.getBreathRateRecords();
        if (avgBreathRate <= 0 || (list = breathRateRecords) == null || list.isEmpty()) {
            this.rightArrowSingleLineTextView.setRemindText(this.mContext.getString(c0j.common_data_empty));
            this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: iim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepBreathDayHolderV2.showBreathRateView$lambda$0(view);
                }
            });
        } else {
            this.rightArrowSingleLineTextView.setRemindText(this.mContext.getResources().getQuantityString(qxi.k0, avgBreathRate, Integer.valueOf(avgBreathRate)));
            this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: jim
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SleepBreathDayHolderV2.showBreathRateView$lambda$1(avgBreathRate, report, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBreathRateView$lambda$0(View view) {
        ToastUtil.showShortToast(c0j.H6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showBreathRateView$lambda$1(int i, SleepSegmentReport report, SleepBreathDayHolderV2 this$0, View view) {
        Intrinsics.checkNotNullParameter(report, "$report");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt(SleepBreathRateDetailFragment.KEY_AVG_BREATH_RATE, i);
        bundle.putSerializable(SleepBreathRateDetailFragment.KEY_RATE_RECORD_LIST, (Serializable) report.getBreathRateRecords());
        bundle.putLong(SleepBreathRateDetailFragment.KEY_BED_TIME, report.getBedTime());
        bundle.putLong(SleepBreathRateDetailFragment.KEY_WAKE_TIME, report.getWakeupTime());
        HealthUtil.INSTANCE.gotoPage(this$0.mContext, SleepBreathRateDetailFragment.class, bundle, null);
    }

    public final void updateReport(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        Integer breathQuality = report.getBreathQuality();
        Integer avgBreathRate = report.getAvgBreathRate();
        Logger.i(TAG, "breathQuality : " + breathQuality + ";breathRate " + avgBreathRate);
        if ((breathQuality == null || breathQuality.intValue() < 0) && (avgBreathRate == null || avgBreathRate.intValue() < 0)) {
            this.mRootView.setVisibility(8);
            this.mRootView.requestLayout();
            return;
        }
        this.mRootView.setVisibility(0);
        this.mRootView.requestLayout();
        if (breathQuality != null) {
            showBreathQualityView(breathQuality.intValue());
        }
        if (avgBreathRate != null) {
            showBreathRateView(avgBreathRate.intValue(), report);
        }
    }
}
