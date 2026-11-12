package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.record.TimesDataRecordInt;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.view.DataTitleView;
import defpackage.c0j;
import defpackage.eri;
import defpackage.ni4;
import defpackage.pni;
import defpackage.qxi;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepRHeartRateDayHolder;", "", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "mContext", "Landroid/content/Context;", "mRootView", "dataTitleView", "Lcom/xiaomi/fitness/view/DataTitleView;", "initView", "", "updateReport", "report", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "updateTitle", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepRHeartRateDayHolder {

    @NotNull
    public static final String TAG = "SleepRHeartRateDayHolder";
    private DataTitleView dataTitleView;

    @NotNull
    private final Context mContext;

    @NotNull
    private final View mRootView;

    public SleepRHeartRateDayHolder(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.mContext = context;
        View viewFindViewById = view.findViewById(eri.W9);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.mRootView = viewFindViewById;
        initView();
    }

    private final void initView() {
        TextView textView = (TextView) this.mRootView.findViewById(eri.Bl);
        View viewFindViewById = this.mRootView.findViewById(eri.X8);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ((AppCompatImageView) viewFindViewById).setBackgroundDrawable(ni4.e(this.mContext, pni.S1));
        textView.setText(c0j.ki);
        this.dataTitleView = (DataTitleView) this.mRootView.findViewById(eri.H2);
    }

    private final void updateTitle(SleepSegmentReport report) {
        String strValueOf;
        Logger.i(TAG, "max " + report.getMaxHr() + " ,min " + report.getMinHr() + ",avg " + report.getAvgHr());
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        String str = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{TimeDateUtil.getDateStr(report.getBedTime(), TimeUtils.FORMAT_H_M), TimeDateUtil.getDateStr(report.getWakeupTime(), TimeUtils.FORMAT_H_M)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        String quantityString = this.mContext.getResources().getQuantityString(qxi.common_unit_heart_rate, 1);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        if (Intrinsics.areEqual(report.getMaxHr(), report.getMinHr())) {
            strValueOf = String.valueOf(report.getMaxHr());
        } else {
            strValueOf = String.format(locale, "%s-%s", Arrays.copyOf(new Object[]{String.valueOf(report.getMinHr()), String.valueOf(report.getMaxHr())}, 2));
            Intrinsics.checkNotNullExpressionValue(strValueOf, "format(...)");
        }
        DataTitleView dataTitleView = this.dataTitleView;
        if (dataTitleView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dataTitleView");
            dataTitleView = null;
        }
        dataTitleView.a(this.mContext, strValueOf + " " + quantityString, strValueOf, str);
    }

    public final void updateReport(@NotNull SleepSegmentReport report) {
        Intrinsics.checkNotNullParameter(report, "report");
        List<TimesDataRecordInt> hrRecords = report.getHrRecords();
        Integer numValueOf = hrRecords != null ? Integer.valueOf(hrRecords.size()) : null;
        Logger.i(TAG, "hr records size " + numValueOf + ",records " + report.getHrRecords());
        if (report.getAvgHr() != null) {
            Integer avgHr = report.getAvgHr();
            Intrinsics.checkNotNull(avgHr);
            if (avgHr.intValue() <= 0) {
                return;
            }
            updateTitle(report);
            this.mRootView.setVisibility(0);
            this.mRootView.requestLayout();
        }
    }
}
