package com.xiaomi.fitness.statistics;

import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.example.statistics.export.OneTrackStatBean;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.statistics.export.annotation.OneTrackReport;
import defpackage.nrd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import org.aspectj.lang.NoAspectBoundException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/statistics/OneTrackReportAspect;", "", "Lcom/xiaomi/fitness/statistics/export/annotation/OneTrackReport;", "oneTrackReport", "", "pointcut", "(Lcom/xiaomi/fitness/statistics/export/annotation/OneTrackReport;)V", "Lnrd;", "joinPoint", "oneTrackReportPageView", "(Lnrd;Lcom/xiaomi/fitness/statistics/export/annotation/OneTrackReport;)V", "<init>", "()V", "Companion", "statistics_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class OneTrackReportAspect {

    @NotNull
    private static final String TAG = "OneTrackReportAspect";
    private static /* synthetic */ Throwable ajc$initFailureCause;
    public static /* synthetic */ OneTrackReportAspect ajc$perSingletonInstance;

    static {
        try {
            ajc$postClinit();
        } catch (Throwable th) {
            ajc$initFailureCause = th;
        }
    }

    private static /* synthetic */ void ajc$postClinit() {
        ajc$perSingletonInstance = new OneTrackReportAspect();
    }

    public static OneTrackReportAspect aspectOf() {
        OneTrackReportAspect oneTrackReportAspect = ajc$perSingletonInstance;
        if (oneTrackReportAspect != null) {
            return oneTrackReportAspect;
        }
        throw new NoAspectBoundException("com.xiaomi.fitness.statistics.OneTrackReportAspect", ajc$initFailureCause);
    }

    public static boolean hasAspect() {
        return ajc$perSingletonInstance != null;
    }

    public final void oneTrackReportPageView(@NotNull nrd joinPoint, @NotNull OneTrackReport oneTrackReport) throws Throwable {
        long durationSec;
        Intrinsics.checkNotNullParameter(joinPoint, "joinPoint");
        Intrinsics.checkNotNullParameter(oneTrackReport, "oneTrackReport");
        Object target = joinPoint.getTarget();
        Intrinsics.checkNotNullExpressionValue(target, "getTarget(...)");
        if (target instanceof BaseFragment) {
            durationSec = ((BaseFragment) target).getDurationSec();
        } else {
            durationSec = target instanceof BaseActivity ? ((BaseActivity) target).getDurationSec() : -1L;
        }
        if (durationSec > 0) {
            IOnetrack oneTrackExtKt = OneTrackExtKt.getInstance(IOnetrack.INSTANCE);
            OneTrackStatBean oneTrackStatBean = new OneTrackStatBean("c_pa_v3", oneTrackReport.tip());
            SpreadBuilder spreadBuilder = new SpreadBuilder(3);
            spreadBuilder.add("duration_sec");
            spreadBuilder.add(Long.valueOf(durationSec));
            spreadBuilder.addSpread(oneTrackReport.args());
            oneTrackExtKt.reportData(oneTrackStatBean, spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            Logger.d(TAG, "OneTrack Report Point tip:" + oneTrackReport + "  duration:" + durationSec + " ");
        }
    }

    public final void pointcut(@NotNull OneTrackReport oneTrackReport) {
        Intrinsics.checkNotNullParameter(oneTrackReport, "oneTrackReport");
    }
}
