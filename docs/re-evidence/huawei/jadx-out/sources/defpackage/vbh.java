package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import androidx.fragment.app.Fragment;
import com.huawei.haf.handler.BaseHandler;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.calendarview.HealthCalendar;
import com.huawei.ui.commonui.calendarview.HealthCalendarActivity;
import com.huawei.ui.commonui.calendarview.HealthDataMarkDateTrigger;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewInterface;
import com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vbh extends tvu<LineChartViewInterface> implements LineChartViewPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LineChartViewInterface f50898a;
    private a e;

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void startCalendarWithDataType(Fragment fragment, HealthCalendar healthCalendar, String str, DataInfos dataInfos) {
    }

    static class a extends BaseHandler<vbh> {
        private a(vbh vbhVar) {
            super(Looper.getMainLooper(), vbhVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(vbh vbhVar, Message message) {
            List list = message.obj instanceof List ? (List) message.obj : null;
            int i = message.what;
            if (i == 0) {
                vbhVar.d(message.arg1, list);
            } else if (i == 1) {
                vbhVar.e(message.arg1, list);
            } else {
                LogUtil.j("TemperatureLineChartViewPresenterImpl", "MyHandler other msg");
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initPageParams() {
        this.f50898a = e();
        this.e = new a();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyData(int i, int i2) {
        LineChartViewInterface lineChartViewInterface = this.f50898a;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null) {
            return;
        }
        long j = ((long) i) * 60000;
        this.f50898a.setDayAndWeek(this.f50898a.getLineChart().formatRangeText(i, i2), ezo.m(j), ltb.ac(new Date(j)));
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initLeftArrowClick() {
        LogUtil.d("TemperatureLineChartViewPresenterImpl", "Day initLeftArrowClick");
        LineChartViewInterface lineChartViewInterface = this.f50898a;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null || this.f50898a.getLineChart().isAnimating()) {
            return;
        }
        this.f50898a.clickLeftArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initRightArrowClick() {
        LineChartViewInterface lineChartViewInterface = this.f50898a;
        if (lineChartViewInterface == null || lineChartViewInterface.getLineChart() == null || this.f50898a.getLineChart().isAnimating()) {
            return;
        }
        this.f50898a.clickRightArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyCursorDataAndTime(String str, List<HwHealthMarkerView.d> list) {
        if (this.f50898a == null) {
            return;
        }
        if (njy.b(list)) {
            this.f50898a.notifyNumerical(str, list);
        } else {
            this.f50898a.notifyNumerical("--", null);
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyMaxAndMin(int i, List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList(16);
        vbr.b(list, arrayList);
        Message messageObtain = Message.obtain();
        messageObtain.obj = arrayList;
        messageObtain.what = 0;
        messageObtain.arg1 = i;
        this.e.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, List<HiHealthData> list) {
        LineChartViewInterface lineChartViewInterface = this.f50898a;
        if (lineChartViewInterface == null) {
            return;
        }
        lineChartViewInterface.notifyMaxAndMin(i, list);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyRemindData(int i, List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = list;
        messageObtain.what = 1;
        messageObtain.arg1 = i;
        this.e.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void startCalendar(Fragment fragment, HealthCalendar healthCalendar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("calendar", healthCalendar);
        bundle.putParcelable("markDateTrigger", new HealthDataMarkDateTrigger(new int[]{2104, HiHealthDataType.d, DicDataTypeUtil.DataType.SKIN_TEMPERATURE.value()}, new int[]{vbk.c().g(), vbk.c().f()}));
        HealthCalendarActivity.a(fragment, bundle);
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public long prossCalendarSelect(HealthCalendar healthCalendar) {
        return healthCalendar.transformCalendar().getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, List<HiHealthData> list) {
        LineChartViewInterface lineChartViewInterface = this.f50898a;
        if (lineChartViewInterface == null) {
            return;
        }
        lineChartViewInterface.notifyRemindData(i, list);
    }
}
