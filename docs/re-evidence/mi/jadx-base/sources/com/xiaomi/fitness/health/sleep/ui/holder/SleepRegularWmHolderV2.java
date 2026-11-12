package com.xiaomi.fitness.health.sleep.ui.holder;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.recycer.BarChartRecyclerHelper;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.utils.SleepExtKt;
import com.xiaomi.fitness.health.sleep.view.wm.SleepRegularView;
import defpackage.c0j;
import defpackage.mzb;
import defpackage.ni4;
import defpackage.pni;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/holder/SleepRegularWmHolderV2;", "", "", "initView", "()V", "updateRegularViewType", "Lorg/joda/time/LocalDate;", "localDate", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "allDaySleepReport", "updateReport", "(Lorg/joda/time/LocalDate;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;)V", "Lmzb;", "binding", "Lmzb;", "", "position", "I", "Lcom/xiaomi/fitness/health/sleep/view/wm/SleepRegularView;", "sleepRegularView", "Lcom/xiaomi/fitness/health/sleep/view/wm/SleepRegularView;", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "tvAvgBedTime", "Landroid/widget/TextView;", "tvAvgBedLabel", "tvAvgWakeTime", "tvAvgWakeLabel", "<init>", "(Lmzb;I)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepRegularWmHolderV2 {

    @NotNull
    private final mzb binding;

    @NotNull
    private final Context context;
    private final int position;

    @NotNull
    private final View rootView;

    @NotNull
    private SleepRegularView sleepRegularView;

    @NotNull
    private final TextView tvAvgBedLabel;

    @NotNull
    private final TextView tvAvgBedTime;

    @NotNull
    private final TextView tvAvgWakeLabel;

    @NotNull
    private final TextView tvAvgWakeTime;

    public SleepRegularWmHolderV2(@NotNull mzb binding, int i) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.position = i;
        SleepRegularView sleepRegularView = binding.C;
        Intrinsics.checkNotNullExpressionValue(sleepRegularView, "sleepRegularView");
        this.sleepRegularView = sleepRegularView;
        View root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.rootView = root;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.context = context;
        TextView tvAvgBedTime = binding.E;
        Intrinsics.checkNotNullExpressionValue(tvAvgBedTime, "tvAvgBedTime");
        this.tvAvgBedTime = tvAvgBedTime;
        TextView tvAvgBedLabel = binding.D;
        Intrinsics.checkNotNullExpressionValue(tvAvgBedLabel, "tvAvgBedLabel");
        this.tvAvgBedLabel = tvAvgBedLabel;
        TextView tvAvgWakeTime = binding.G;
        Intrinsics.checkNotNullExpressionValue(tvAvgWakeTime, "tvAvgWakeTime");
        this.tvAvgWakeTime = tvAvgWakeTime;
        TextView tvAvgWakeLabel = binding.F;
        Intrinsics.checkNotNullExpressionValue(tvAvgWakeLabel, "tvAvgWakeLabel");
        this.tvAvgWakeLabel = tvAvgWakeLabel;
        initView();
    }

    private final void initView() {
        TextView tvLabel = this.binding.A.B;
        Intrinsics.checkNotNullExpressionValue(tvLabel, "tvLabel");
        AppCompatImageView ivIcon = this.binding.A.A;
        Intrinsics.checkNotNullExpressionValue(ivIcon, "ivIcon");
        ivIcon.setBackground(ni4.e(this.context, pni.d2));
        tvLabel.setText(c0j.Zj);
        updateRegularViewType();
    }

    private final void updateRegularViewType() {
        if (this.position == 1) {
            this.sleepRegularView.setViewType(0);
        } else {
            this.sleepRegularView.setViewType(1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ec  */
    public final void updateReport(@Nullable LocalDate localDate, @Nullable AllDaySleepReport allDaySleepReport) {
        List<AllDaySleepReport> dayReportList;
        if (allDaySleepReport == null || (dayReportList = allDaySleepReport.getDayReportList()) == null || dayReportList.isEmpty()) {
            this.rootView.setVisibility(8);
            return;
        }
        this.rootView.setVisibility(0);
        List<AllDaySleepReport> dayReportList2 = allDaySleepReport.getDayReportList();
        Intrinsics.checkNotNull(dayReportList2);
        ArrayList arrayList = new ArrayList();
        Iterator<AllDaySleepReport> it = dayReportList2.iterator();
        Long lValueOf = null;
        Long lValueOf2 = null;
        long j = 0;
        long bedTime = 0;
        long j2 = 0;
        long wakeupTime = 0;
        while (it.hasNext()) {
            AllDaySleepReport next = it.next();
            List<SleepSegmentReport> sleepSegments = next.getSleepSegments();
            List<SleepSegmentReport> list = sleepSegments;
            if (list == null || list.isEmpty()) {
                it = it;
            } else {
                for (SleepSegmentReport sleepSegmentReport : sleepSegments) {
                    SleepRegularView.b bVar = new SleepRegularView.b();
                    bVar.f12291a = sleepSegmentReport.getBedTime();
                    bVar.f12292b = sleepSegmentReport.getWakeupTime();
                    bVar.c = TimeDateUtil.changZeroOfTheDay(sleepSegmentReport.getTimestamp());
                    arrayList.add(bVar);
                }
                List<SleepSegmentReport> listFilterAndSortSleepLong = SleepExtKt.filterAndSortSleepLong(sleepSegments);
                if (listFilterAndSortSleepLong.isEmpty()) {
                    it = it;
                } else {
                    SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepLong);
                    long time = next.getTime();
                    bedTime += sleepSegmentReport2.getBedTime() - time;
                    long j3 = j + 1;
                    wakeupTime += sleepSegmentReport2.getWakeupTime() - time;
                    j2++;
                    long wakeupTime2 = ((SleepSegmentReport) CollectionsKt___CollectionsKt.last((List) listFilterAndSortSleepLong)).getWakeupTime() - time;
                    Iterator<AllDaySleepReport> it2 = it;
                    long bedTime2 = ((SleepSegmentReport) CollectionsKt___CollectionsKt.first((List) listFilterAndSortSleepLong)).getBedTime() - time;
                    if (lValueOf2 != null) {
                        wakeupTime2 = Math.min(lValueOf2.longValue(), wakeupTime2);
                    }
                    lValueOf2 = Long.valueOf(wakeupTime2);
                    if (lValueOf != null) {
                        bedTime2 = Math.max(lValueOf.longValue(), bedTime2);
                    }
                    lValueOf = Long.valueOf(bedTime2);
                    it = it2;
                    j = j3;
                }
            }
        }
        List<SleepRegularView.a<SleepRegularView.b>> listK = SleepRegularView.K(arrayList);
        SleepRegularView sleepRegularView = this.sleepRegularView;
        Intrinsics.checkNotNull(localDate);
        Long l = lValueOf2;
        Long l2 = lValueOf;
        sleepRegularView.A(TimeDateUtil.changZeroOfTheDay(localDate), TimeDateUtil.localDateToTimestamp(BarChartRecyclerHelper.INSTANCE.getWeekOrMonthEndDate(this.position, localDate)));
        this.sleepRegularView.setDataList(listK);
        long beginOfToday = TimeUtils.getBeginOfToday();
        if (j <= 0) {
            ViewExtKt.setVisible(this.tvAvgBedTime, false);
            ViewExtKt.setVisible(this.tvAvgBedLabel, false);
        } else {
            ViewExtKt.setVisible(this.tvAvgBedTime, true);
            ViewExtKt.setVisible(this.tvAvgBedLabel, true);
            this.tvAvgBedTime.setText(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(((bedTime / j) * ((long) 1000)) + beginOfToday)));
        }
        if (j2 <= 0) {
            ViewExtKt.setVisible(this.tvAvgWakeTime, false);
            ViewExtKt.setVisible(this.tvAvgWakeLabel, false);
        } else {
            ViewExtKt.setVisible(this.tvAvgWakeTime, true);
            ViewExtKt.setVisible(this.tvAvgWakeLabel, true);
            this.tvAvgWakeTime.setText(TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(((wakeupTime / j2) * ((long) 1000)) + beginOfToday)));
        }
        if (l2 == null || l == null) {
            TextView tvHighLightTip = this.binding.H;
            Intrinsics.checkNotNullExpressionValue(tvHighLightTip, "tvHighLightTip");
            ViewExtKt.setVisible(tvHighLightTip, false);
            return;
        }
        long j4 = 1000;
        String date = TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf((l.longValue() * j4) + beginOfToday));
        String date2 = TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf((l2.longValue() * j4) + beginOfToday));
        TextView tvHighLightTip2 = this.binding.H;
        Intrinsics.checkNotNullExpressionValue(tvHighLightTip2, "tvHighLightTip");
        ViewExtKt.setVisible(tvHighLightTip2, true);
        this.binding.H.setText(this.context.getString(this.position == 1 ? c0j.Ff : c0j.Ef, date, date2));
    }
}
