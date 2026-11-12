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
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class vbe extends tvu<LineChartViewInterface> implements LineChartViewPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f50894a;
    private LineChartViewInterface d;

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyCursorDataAndTime(String str, List<HwHealthMarkerView.d> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyData(int i, int i2) {
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void startCalendarWithDataType(Fragment fragment, HealthCalendar healthCalendar, String str, DataInfos dataInfos) {
    }

    static class e extends BaseHandler<vbe> {
        private e(vbe vbeVar) {
            super(Looper.getMainLooper(), vbeVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandler
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void handleMessageWhenReferenceNotNull(vbe vbeVar, Message message) {
            List list = message.obj instanceof List ? (List) message.obj : null;
            int i = message.what;
            if (i == 0) {
                vbeVar.a(message.arg1, list);
            } else if (i == 1) {
                vbeVar.b(message.arg1, list);
            } else {
                LogUtil.j("TemperatureBarChartViewPresenterImpl", "MyHandler other msg");
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initPageParams() {
        this.d = e();
        this.f50894a = new e();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initLeftArrowClick() {
        LogUtil.d("TemperatureBarChartViewPresenterImpl", "Day initLeftArrowClick");
        LineChartViewInterface lineChartViewInterface = this.d;
        if (lineChartViewInterface == null || lineChartViewInterface.getBarChart() == null || this.d.getBarChart().isAnimating()) {
            return;
        }
        this.d.clickLeftArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void initRightArrowClick() {
        LineChartViewInterface lineChartViewInterface = this.d;
        if (lineChartViewInterface == null || lineChartViewInterface.getBarChart() == null || this.d.getBarChart().isAnimating()) {
            return;
        }
        this.d.clickRightArrow();
    }

    @Override // com.huawei.ui.main.stories.fitness.views.bloodsugar.LineChartViewPresenter
    public void notifyMaxAndMin(int i, List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        messageObtain.obj = list;
        messageObtain.what = 0;
        messageObtain.arg1 = i;
        this.f50894a.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, List<HiHealthData> list) {
        LineChartViewInterface lineChartViewInterface = this.d;
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
        this.f50894a.sendMessage(messageObtain);
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
    public void b(int i, List<HiHealthData> list) {
        LineChartViewInterface lineChartViewInterface = this.d;
        if (lineChartViewInterface == null) {
            return;
        }
        lineChartViewInterface.notifyRemindData(i, list);
    }
}
