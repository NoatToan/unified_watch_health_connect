package defpackage;

import android.content.Context;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.MainLoginCallBack;
import com.huawei.pluginachievement.PluginAchieveAdapter;
import com.huawei.pluginachievement.impl.AchieveCallback;
import com.huawei.pluginachievement.report.bean.AnnualReport;
import com.huawei.pluginachievement.report.bean.AnnualReportMarathon;
import com.huawei.pluginachievement.report.bean.AnnualReportRun;
import com.huawei.pluginachievement.report.bean.MarathonGradleDetail;
import com.huawei.pluginachievement.report.constant.EnumAnnualType;
import com.huawei.pluginachievement.report.iterface.BaseCalculator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes13.dex */
public class ovx extends BaseCalculator {
    private CountDownLatch e = null;
    private int d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f44891c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PluginAchieveAdapter f44890b = getPluginAchieveAdapter();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f44889a = BaseApplication.getContext();

    @Override // com.huawei.pluginachievement.report.iterface.BaseCalculator
    public void compute(int i) {
    }

    public void d(int i) {
        this.e = new CountDownLatch(i);
    }

    public void a() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public void d() {
        CountDownLatch countDownLatch = this.e;
        if (countDownLatch != null) {
            oxi.d(countDownLatch, 8000L);
        }
    }

    public void b(int i, final int i2) {
        LogUtil.a("PLGACHIEVE_RunCalculator", "enter getAnnualRunSumData");
        if (this.f44890b == null) {
            oxi.a(this.e);
            LogUtil.j("PLGACHIEVE_RunCalculator", "achieveAdapter is null,return");
            return;
        }
        long jA = oxi.a(i2, true);
        long jA2 = oxi.a(i2, false);
        this.f44890b.fetchSequenceDataBySportType(this.f44889a, jA, jA2, 258, new AchieveCallback() { // from class: ovx.5
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i3, Object obj) {
                ovx.this.c(obj, i2);
                ovx.this.a();
            }
        });
        if (i2 >= 2022) {
            int i3 = i2 - 1;
            this.f44890b.fetchSequenceDataBySportType(this.f44889a, oxi.a(i3, true), oxi.a(i3, false), 258, new AchieveCallback() { // from class: ovx.1
                @Override // com.huawei.pluginachievement.impl.AchieveCallback
                public void onResponse(int i4, Object obj) {
                    ovx.this.b(obj, i2);
                    ovx.this.a();
                }
            });
        }
        this.f44890b.getTrackSumDistanceData(this.f44889a, oxi.a(i, true), jA2, 11, new AchieveCallback() { // from class: ovx.4
            @Override // com.huawei.pluginachievement.impl.AchieveCallback
            public void onResponse(int i4, Object obj) {
                ovx.this.e(obj, i2);
                ovx.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj, int i) {
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!(obj instanceof List)) {
                LogUtil.j("PLGACHIEVE_RunCalculator", "computeLastData data is not correct.");
                return;
            }
            arrayList.addAll((List) obj);
            if (njy.e(arrayList)) {
                LogUtil.j("PLGACHIEVE_RunCalculator", "computeLastData dataInfos is empty");
                return;
            }
            HashMap map = new HashMap(2);
            int i2 = i - 1;
            oxc.b(arrayList, i2, map);
            if (map.containsKey(Integer.valueOf(i2))) {
                LogUtil.a("PLGACHIEVE_RunCalculator", "saveRunCompare paceMap ", map.toString(), " lastYearPace ", Integer.valueOf(i2));
                int iIntValue = ((Integer) map.get(Integer.valueOf(i2))).intValue();
                this.f44891c = iIntValue;
                e(i, this.d, iIntValue);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_RunCalculator", "getTrackListByRunType data ClassCastException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void e(T t, int i) {
        if (t == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "getTrackSumDistanceData obj null");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!(t instanceof List)) {
                LogUtil.j("PLGACHIEVE_RunCalculator", "computeTrackSumDistanceData data is not correct.");
            } else {
                arrayList.addAll((List) t);
                e(oxc.e(arrayList), i);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_RunCalculator", "getTrackListByRunType ClassCastException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void c(T t, int i) {
        if (t == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "getTrackListData obj null");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList(16);
            if (!(t instanceof List)) {
                LogUtil.j("PLGACHIEVE_RunCalculator", "computeTrackListData data is not correct.");
                return;
            }
            arrayList.addAll((List) t);
            if (njy.e(arrayList)) {
                LogUtil.j("PLGACHIEVE_RunCalculator", "computeTrackListData dataInfos is empty");
                return;
            }
            HashMap map = new HashMap(2);
            e(oxc.b(arrayList, i, map), i);
            if (map.containsKey(Integer.valueOf(i))) {
                LogUtil.a("PLGACHIEVE_RunCalculator", "saveRunCompare paceMap ", map.toString(), " currentYear ", Integer.valueOf(i));
                int iIntValue = ((Integer) map.get(Integer.valueOf(i))).intValue();
                this.d = iIntValue;
                e(i, iIntValue, this.f44891c);
            }
        } catch (ClassCastException unused) {
            LogUtil.e("PLGACHIEVE_RunCalculator", "getTrackListByRunType data ClassCastException");
        }
    }

    private void e(int i, int i2, int i3) {
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 10025, String.valueOf(i2 - i3));
    }

    private void e(Map<String, Integer> map, int i) {
        int iIntValue = 0;
        int iIntValue2 = (map == null || !map.containsKey(String.valueOf(i))) ? 0 : map.get(String.valueOf(i)).intValue();
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2001, String.valueOf(iIntValue2));
        if (i <= 2019) {
            insertData(i, EnumAnnualType.REPORT_RUN.value(), MainLoginCallBack.PHASE_NOCLOUD_NOLOGIN, oxc.d(map));
            return;
        }
        if (map != null) {
            int i2 = i - 1;
            if (map.containsKey(String.valueOf(i2))) {
                iIntValue = map.get(String.valueOf(i2)).intValue();
            }
        }
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2007, String.valueOf(oxi.e(iIntValue2, iIntValue, 3000)));
    }

    private void e(AnnualReport annualReport, int i) {
        if (annualReport == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "saveRunAndMarathonData annualReport is null");
            return;
        }
        AnnualReportRun reportRun = annualReport.getReportRun();
        AnnualReportMarathon reportMarathon = annualReport.getReportMarathon();
        b(reportRun, i);
        c(reportMarathon, i);
    }

    private void b(AnnualReportRun annualReportRun, int i) {
        if (annualReportRun == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "saveRunData annualReportRun is null");
            return;
        }
        addStarData("runStar", oxc.b(annualReportRun.acquireTotalDistance()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2003, String.valueOf(annualReportRun.acquireMaxDistance()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2004, String.valueOf(annualReportRun.acquireMaxDistanceDay()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2002, String.valueOf(annualReportRun.acquireNumberOfTimes()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2005, String.valueOf(annualReportRun.acquireTimeOfDay()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2006, String.valueOf(annualReportRun.acquireDescription()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 10022, String.valueOf(annualReportRun.getRunNumberOfDays()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 10023, String.valueOf(annualReportRun.getMaxRunContinuousDays()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 10024, String.valueOf(annualReportRun.getBestPace()));
    }

    private void c(AnnualReportMarathon annualReportMarathon, int i) {
        if (annualReportMarathon == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "saveMarathonData annualReportMarathon is null");
        } else if (i <= 2019) {
            b(annualReportMarathon, i);
        } else {
            a(annualReportMarathon, i);
        }
    }

    private void b(AnnualReportMarathon annualReportMarathon, int i) {
        if (annualReportMarathon == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "saveMarathonData2019 annualReportMarathon is null");
            return;
        }
        String strD = HiJsonUtil.d(annualReportMarathon.getHalfMarathon());
        String strD2 = HiJsonUtil.d(annualReportMarathon.getFullMarathon());
        insertData(i, EnumAnnualType.REPORT_MARATHON.value(), 9004, strD);
        insertData(i, EnumAnnualType.REPORT_MARATHON.value(), 9005, strD2);
    }

    private void a(AnnualReportMarathon annualReportMarathon, int i) {
        if (annualReportMarathon == null) {
            LogUtil.j("PLGACHIEVE_RunCalculator", "saveMarathonData2020 annualReportMarathon is null");
            return;
        }
        MarathonGradleDetail halfMarathon = annualReportMarathon.getHalfMarathon();
        MarathonGradleDetail fullMarathon = annualReportMarathon.getFullMarathon();
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 9004, String.valueOf(halfMarathon.getTimes()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2008, String.valueOf(oxi.c(halfMarathon.getBestRecord())));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2009, String.valueOf(halfMarathon.getBestTime()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 9005, String.valueOf(fullMarathon.getTimes()));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2010, String.valueOf(oxi.c(fullMarathon.getBestRecord())));
        insertData(i, EnumAnnualType.REPORT_RUN.value(), 2011, String.valueOf(fullMarathon.getBestTime()));
    }
}
