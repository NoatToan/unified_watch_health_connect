package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ulx extends tvu<LineChartViewInterface> implements LineChartViewPresenter {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LineChartViewInterface f50340c;

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyMaxAndMin(int i, List<HiHealthData> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyRemindData(int i, List<HiHealthData> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initPageParams() {
        this.f50340c = e();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyData(int i, int i2) {
        LineChartViewInterface lineChartViewInterface = this.f50340c;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null) {
            return;
        }
        long j = ((long) i) * 60000;
        this.f50340c.setDayAndWeek(this.f50340c.getLineChart().formatRangeText(i, i2), ezo.m(j), ltb.ac(new Date(j)));
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initLeftArrowClick() {
        LogUtil.d("BloodSugarLineChartViewPresenterImpl", "Day initLeftArrowClick");
        LineChartViewInterface lineChartViewInterface = this.f50340c;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null || this.f50340c.getLineChart().isAnimating()) {
            return;
        }
        this.f50340c.clickLeftArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initRightArrowClick() {
        LineChartViewInterface lineChartViewInterface = this.f50340c;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null || this.f50340c.getLineChart().isAnimating()) {
            return;
        }
        this.f50340c.clickRightArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyCursorDataAndTime(String str, List<HwHealthMarkerView.d> list) {
        if (this.f50340c == null) {
            return;
        }
        if (njy.b(list)) {
            this.f50340c.notifyNumerical(str, list);
        } else {
            this.f50340c.notifyNumerical("--", null);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void startCalendar(Fragment fragment, HealthCalendar healthCalendar) {
        LogUtil.a("BloodSugarLineChartViewPresenterImpl", "initCalendarArrow~~~");
        HealthCalendarActivity.c(fragment, healthCalendar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044  */
    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void startCalendarWithDataType(Fragment fragment, HealthCalendar healthCalendar, String str, DataInfos dataInfos) {
        int[] iArr;
        Bundle bundle;
        int iHashCode = str.hashCode();
        if (iHashCode == 1164722869) {
            if (str.equals("BLOOD_SUGAR_CONTINUE")) {
                iArr = new int[]{47503};
            }
            bundle = new Bundle();
            bundle.putSerializable("calendar", healthCalendar);
            bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(iArr));
            if (dataInfos == DataInfos.BloodSugarDayDetail) {
                bundle.putBoolean("isSetGrayUnmarkedDate", true);
            }
            HealthCalendarActivity.a(fragment, bundle);
        }
        if (iHashCode == 1214310707) {
            str.equals("BLOOD_SUGAR_FINGER_TIP");
        }
        iArr = new int[]{2008, 2009, 2010, 2011, 2012, 2013, 2015, 2014, 2106};
        bundle = new Bundle();
        bundle.putSerializable("calendar", healthCalendar);
        bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(iArr));
        if (dataInfos == DataInfos.BloodSugarDayDetail) {
            bundle.putBoolean("isSetGrayUnmarkedDate", true);
        }
        HealthCalendarActivity.a(fragment, bundle);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public long prossCalendarSelect(HealthCalendar healthCalendar) {
        return healthCalendar.transformCalendar().getTimeInMillis();
    }
}
