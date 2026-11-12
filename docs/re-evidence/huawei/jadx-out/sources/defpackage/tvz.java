package defpackage;

import android.os.Handler;
import android.os.Message;
import com.huawei.health.knit.section.chart.BloodOxygenLineChart;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.view.HwHealthMarkerView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter;
import com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentView;
import health.compact.a.UnitUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class tvz extends tvu<BloodOxygenDayDetailFragmentView> implements BloodOxygenDayDetailFragmentPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f49723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f49724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BloodOxygenDayDetailFragmentView f49725c;
    private Date e = null;
    private long d = 0;

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void initLeftArrowClick() {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void initRightArrowClick() {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyAltitude(int i, List<HiHealthData> list) {
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyLakelouise(int i, List<HiHealthData> list) {
    }

    static class b extends Handler {
        private final WeakReference<tvz> d;

        private b(tvz tvzVar) {
            this.d = new WeakReference<>(tvzVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String strValueOf;
            long jLongValue;
            if (message == null) {
                LogUtil.j("R_BloodOxygen_BloodOxygenDayDetailFragmentPresenterImpl", "handleMessage: msg is null");
                return;
            }
            super.handleMessage(message);
            tvz tvzVar = this.d.get();
            if (tvzVar == null) {
                LogUtil.j("R_BloodOxygen_BloodOxygenDayDetailFragmentPresenterImpl", "handleMessage: presenterImpl is null");
                return;
            }
            int i = message.what;
            if (i == 1) {
                d(message, tvzVar);
                return;
            }
            if (i == 2) {
                if (message.arg1 == 0 && (message.obj instanceof Long)) {
                    jLongValue = ((Long) message.obj).longValue();
                    strValueOf = String.valueOf(message.arg2);
                } else {
                    strValueOf = "--";
                    jLongValue = 0;
                }
                if (tvzVar.f49725c != null) {
                    tvzVar.f49725c.setBloodOxygenLatest(strValueOf, jLongValue);
                    return;
                }
                return;
            }
            if (i != 3) {
                LogUtil.a("R_BloodOxygen_BloodOxygenDayDetailFragmentPresenterImpl", "MyHandler what unkonw ");
                return;
            }
            List<HiHealthData> arrayList = new ArrayList<>(16);
            if (message.arg1 == 0 && (message.obj instanceof List)) {
                arrayList = (List) message.obj;
            }
            if (tvzVar.f49725c != null) {
                tvzVar.f49725c.setBloodOxygenData(arrayList);
            }
        }

        private void d(Message message, tvz tvzVar) {
            String string;
            String string2;
            if (message.arg1 == 0 && (message.obj instanceof List)) {
                List list = (List) message.obj;
                if (njy.b(list)) {
                    string = ((Integer) Collections.max(list)).toString();
                    string2 = ((Integer) Collections.min(list)).toString();
                } else {
                    LogUtil.j("BloodOxygenDayDetailFragmentPresenterImpl", "handleMessage scoreList is empty");
                    string = "--";
                    string2 = "--";
                }
            } else {
                string = "--";
                string2 = "--";
            }
            if (tvzVar.f49725c != null) {
                tvzVar.f49725c.setBloodOxygenMaxAndMin(string, string2);
            }
        }
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void initPageParams() {
        this.f49725c = e();
        this.d = ltb.m(ltb.b());
        this.e = new Date(this.d * 1000);
        this.f49724b = new b();
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void initBloodOxygenInterval() {
        if (this.f49725c == null) {
            return;
        }
        this.f49723a = new ArrayList(16);
        String strE = UnitUtil.e(70.0d, 2, 0);
        String strE2 = UnitUtil.e(70.0d, 1, 0);
        String strE3 = UnitUtil.e(89.0d, 2, 0);
        String strE4 = UnitUtil.e(90.0d, 2, 0);
        String strE5 = UnitUtil.e(70.0d, 2, 0);
        this.f49723a.add(strE);
        this.f49723a.add(strE2);
        this.f49723a.add(strE3);
        this.f49723a.add(strE4);
        this.f49723a.add(strE5);
        this.f49725c.setBloodOxygenInterval(this.f49723a);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyData(int i, int i2) {
        BloodOxygenDayDetailFragmentView bloodOxygenDayDetailFragmentView = this.f49725c;
        if (bloodOxygenDayDetailFragmentView == null) {
            return;
        }
        BloodOxygenLineChart bloodOxygenLineChart = bloodOxygenDayDetailFragmentView.getBloodOxygenLineChart();
        if (bloodOxygenLineChart == null) {
            LogUtil.j("BloodOxygenDayDetailFragmentPresenterImpl", "the currentBloodOxygenLineChart is NULL");
            return;
        }
        long j = ((long) i) * 60000;
        this.f49725c.setDayAndWeek(bloodOxygenLineChart.formatRangeText(i, i2), ezo.m(j), ltb.ac(new Date(j)), j);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifySourceAndTime(String str, List<HwHealthMarkerView.d> list) {
        String strE;
        int size = list.size() - 1;
        HwHealthBaseEntry hwHealthBaseEntry = list.get(size).f23737a;
        String string = BaseApplication.getContext().getString(R.string.IDS_hw_health_blood_oxygen_elevation);
        if (hwHealthBaseEntry == null) {
            this.f49725c.notifyNumerical(str, "--", string + " --");
            return;
        }
        int y = 0;
        int iB = Integer.MAX_VALUE;
        for (T t : list.get(0).f23739c.getEntriesForXValue(hwHealthBaseEntry.getX())) {
            if (t.getY() != 0.0f) {
                y = (int) t.getY();
            }
            if (t.getData() instanceof fqt) {
                fqt fqtVar = (fqt) t.getData();
                if (fqtVar.b() != Integer.MAX_VALUE) {
                    iB = fqtVar.b();
                }
            }
        }
        String str2 = iB != Integer.MAX_VALUE ? string + " " + UnitUtil.e(iB, 1, 0) : string + " --";
        if (y != 0) {
            strE = UnitUtil.e(y, 1, 0);
        } else {
            strE = e(list.get(size).f23737a);
        }
        this.f49725c.notifyNumerical(str, strE, str2);
    }

    private String e(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return UnitUtil.e(hwHealthBaseEntry.getY(), 1, 0);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyMaxAndMinBloodOxy(int i, List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.arg1 = -1;
        if (list == null) {
            this.f49724b.sendMessage(messageObtain);
            return;
        }
        if (i == 0 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(16);
            Iterator<HiHealthData> it = list.iterator();
            while (it.hasNext()) {
                int intValue = it.next().getIntValue();
                if (intValue > 0 && intValue <= 100) {
                    arrayList.add(Integer.valueOf(intValue));
                }
            }
            messageObtain.arg1 = 0;
            messageObtain.obj = arrayList;
        }
        this.f49724b.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyLatestBloodOxygen(int i, List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 2;
        if (list == null) {
            messageObtain.arg1 = -1;
            this.f49724b.sendMessage(messageObtain);
            return;
        }
        if (i != 0 || list.isEmpty()) {
            messageObtain.arg1 = -1;
            this.f49724b.sendMessage(messageObtain);
            return;
        }
        int intValue = 0;
        long startTime = 0;
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && hiHealthData.getStartTime() > startTime) {
                startTime = hiHealthData.getStartTime();
                intValue = hiHealthData.getIntValue();
            }
        }
        if (startTime > 0 && intValue > 0) {
            messageObtain.arg1 = 0;
            messageObtain.arg2 = intValue;
            messageObtain.obj = Long.valueOf(startTime);
        } else {
            messageObtain.arg1 = 100001;
        }
        this.f49724b.sendMessage(messageObtain);
    }

    @Override // com.huawei.ui.main.stories.fitness.activity.bloodoxygen.dayfragment.BloodOxygenDayDetailFragmentPresenter
    public void notifyRemindBloodOxygen(int i, List<HiHealthData> list) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        if (list == null) {
            messageObtain.arg1 = -1;
            this.f49724b.sendMessage(messageObtain);
            return;
        }
        if (i == 0 && !list.isEmpty()) {
            messageObtain.arg1 = 0;
            messageObtain.obj = list;
        } else {
            messageObtain.arg1 = -1;
        }
        this.f49724b.sendMessage(messageObtain);
    }
}
