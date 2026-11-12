package defpackage;

import android.content.Context;
import android.graphics.Color;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.healthcloud.plugintrack.ui.runningpostureadvicemgr.RunningPostureAdviceBase;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.linechart.HwHealthChartHolder;
import com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder;
import com.huawei.ui.commonui.linechart.common.DataInfos;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseEntry;
import com.huawei.ui.commonui.linechart.icommon.IChartStorageHelper;
import com.huawei.ui.commonui.linechart.view.HwHealthLineChart;
import com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.IHwHealthLineDataSet;
import com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineStateChartStorageHelper;
import com.huawei.ui.main.stories.health.fragment.rqpackage.RqLineVo2maxChartStorageHelper;
import com.huawei.up.model.UserInfomation;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class uvi extends HwHealthLineScrollChartHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f50608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HwHealthLineChart f50609c;
    private boolean d;
    private Context e;
    private IHealthMultiColorMode f;
    private IHealthMultiColorMode g;
    private IChartStorageHelper h;
    private IHealthMultiColorMode i;
    private int j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private int p;
    private IHealthMultiColorMode r;
    private float s;

    static /* synthetic */ boolean a(int i, int i2, int i3) {
        return true;
    }

    static /* synthetic */ boolean d(int i, int i2, int i3) {
        return true;
    }

    static /* synthetic */ boolean e(int i, int i2, int i3) {
        return true;
    }

    public uvi(Context context, int i, int i2) {
        super(context);
        this.s = 91.0f;
        this.i = new IHealthMultiColorMode() { // from class: uvi.2
            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public int[] getDataColor() {
                int[] iArr = new int[7];
                if (wka.e()) {
                    iArr[0] = -2539198;
                    iArr[1] = -35584;
                    iArr[2] = -26624;
                    iArr[3] = -15078;
                    iArr[4] = -10175652;
                    iArr[5] = -11748673;
                    iArr[6] = -10575361;
                    return iArr;
                }
                iArr[0] = -16733458;
                iArr[1] = -11748673;
                iArr[2] = -10175652;
                iArr[3] = -15078;
                iArr[4] = -26624;
                iArr[5] = -35584;
                iArr[6] = -2539198;
                return iArr;
            }

            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public float[] getThreshold() {
                return new float[]{25.0f, 30.0f, 40.0f, 50.0f, 60.0f, 65.0f};
            }
        };
        this.g = new IHealthMultiColorMode() { // from class: uvi.1
            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public int[] getDataColor() {
                int[] iArr = new int[7];
                if (wka.e()) {
                    iArr[0] = -2539198;
                    iArr[1] = -35584;
                    iArr[2] = -26624;
                    iArr[3] = -15078;
                    iArr[4] = -10175652;
                    iArr[5] = -11748673;
                    iArr[6] = -10575361;
                    return iArr;
                }
                iArr[0] = -16733458;
                iArr[1] = -11748673;
                iArr[2] = -10175652;
                iArr[3] = -15078;
                iArr[4] = -26624;
                iArr[5] = -35584;
                iArr[6] = -2539198;
                return iArr;
            }

            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public float[] getThreshold() {
                return new float[]{22.0f, 27.0f, 36.0f, 45.0f, 53.0f, 58.0f};
            }
        };
        this.f = new IHealthMultiColorMode() { // from class: uvi.4
            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public int[] getDataColor() {
                return new int[]{RunningPostureAdviceBase.COLOR_POORER, -35584, -15078, RunningPostureAdviceBase.COLOR_NORMAL, -16733458};
            }

            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public float[] getThreshold() {
                return new float[]{-16.0f, -6.0f, 0.5f, 3.0f};
            }
        };
        this.r = new IHealthMultiColorMode() { // from class: uvi.5
            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public int[] getDataColor() {
                return new int[]{RunningPostureAdviceBase.COLOR_POORER, -35584, RunningPostureAdviceBase.COLOR_SUBOPTIMAL, -15078, RunningPostureAdviceBase.COLOR_NORMAL, -11748673, -16733458};
            }

            @Override // com.huawei.ui.commonui.linechart.view.commonlinechart.IHealthMultiColorMode
            public float[] getThreshold() {
                Integer[] numArrE = uvi.this.e();
                return new float[]{numArrE[1].intValue(), numArrE[2].intValue(), numArrE[3].intValue(), numArrE[4].intValue(), numArrE[5].intValue(), numArrE[6].intValue()};
            }
        };
        this.e = context;
        this.p = i;
        this.j = i2;
        if (i == 0) {
            this.h = new uvk();
        } else if (i == 1) {
            this.h = new RqLineStateChartStorageHelper(i2);
        } else {
            this.h = new RqLineVo2maxChartStorageHelper();
        }
    }

    public boolean a() {
        return this.d;
    }

    public void d(boolean z) {
        this.d = z;
    }

    public boolean d() {
        return this.f50608b;
    }

    public void b(boolean z) {
        this.f50608b = z;
    }

    public boolean c() {
        return this.f50607a;
    }

    public void a(boolean z) {
        this.f50607a = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Integer[] e() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            userInfo = new UserInfomation(UnitUtil.f() ? 1 : 0);
        }
        return vds.a(userInfo.getGender(), userInfo.getAge());
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder
    public IChartStorageHelper acquireStorageHelper() {
        return this.h;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065 A[RETURN] */
    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMax(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        HwHealthLineChart hwHealthLineChart;
        float fE;
        if (Math.abs(f) == Float.MAX_VALUE || Math.abs(f2) == Float.MAX_VALUE || "VO2MAX_TABLE".equals(hwHealthBaseBarLineDataSet.getLabel()) || (hwHealthLineChart = this.f50609c) == null) {
            return 100.0f;
        }
        List<T> dataSets = ((qnt) hwHealthLineChart.getData()).getDataSets();
        boolean z = dataSets.size() > 1;
        Iterator it = dataSets.iterator();
        while (it.hasNext()) {
            if ("STATE_TABLE".equals(((IHwHealthLineDataSet) it.next()).getLabel())) {
                fE = c(f, f2);
                if (z) {
                    return d(hwHealthBaseBarLineDataSet, fE);
                }
                return fE;
            }
        }
        fE = e(f, f2);
        if (z) {
            return d(hwHealthBaseBarLineDataSet, fE);
        }
        return fE;
    }

    private float d(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f) {
        String label = hwHealthBaseBarLineDataSet.getLabel();
        if (label.equals("STATE_TABLE")) {
            this.n = f;
        } else if (label.equals("FITNESS_TABLE")) {
            this.k = f;
        } else {
            this.m = f;
        }
        return Math.max(this.m, Math.max(this.n, this.k));
    }

    private float e(float f, float f2) {
        float f3 = (f + f2) / 2.0f;
        float fMax = (float) Math.max(f3 + (Math.min(f - f3, f3 - f2) * 2.0f * 0.65f), ((double) f) + (Math.pow(Math.max(f3, 5.0f), 0.5d) * 0.5d));
        LogUtil.a("RqChartLineViewHolder", "computeDynamicBorderMax: ", "runningMaxValue: ", Float.valueOf(fMax));
        return fMax;
    }

    private float c(float f, float f2) {
        float fMax;
        float fAbs = Math.abs(Math.max(f, 0.0f));
        float fAbs2 = Math.abs(Math.min(f2, 0.0f));
        if (fAbs > fAbs2 * 2.5f) {
            fMax = Math.max(6.0f, fAbs * 1.24f);
        } else if (fAbs2 > 2.5f * fAbs) {
            fMax = Math.max(6.0f, fAbs2 * 1.24f) / 3.0f;
        } else {
            fMax = Math.max(4.0f, Math.max(fAbs, fAbs2) * 1.1f);
        }
        LogUtil.a("RqChartLineViewHolder", "computeDynamicBorderMax: ", "stateMaxValue: ", Float.valueOf(fMax));
        return fMax;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[RETURN] */
    @Override // com.huawei.ui.commonui.linechart.scrolladapter.DynamicBorderSupportable
    public float computeDynamicBorderMin(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f, float f2) {
        HwHealthLineChart hwHealthLineChart;
        float fB;
        if (Math.abs(f) == Float.MAX_VALUE || Math.abs(f2) == Float.MAX_VALUE || "VO2MAX_TABLE".equals(hwHealthBaseBarLineDataSet.getLabel()) || (hwHealthLineChart = this.f50609c) == null) {
            return 0.0f;
        }
        List<T> dataSets = ((qnt) hwHealthLineChart.getData()).getDataSets();
        boolean z = dataSets.size() > 1;
        Iterator it = dataSets.iterator();
        while (it.hasNext()) {
            if ("STATE_TABLE".equals(((IHwHealthLineDataSet) it.next()).getLabel())) {
                fB = a(f, f2);
                if (z) {
                    return c(hwHealthBaseBarLineDataSet, fB);
                }
                return fB;
            }
        }
        fB = b(f, f2);
        this.s = 91.0f;
        if (z) {
            return c(hwHealthBaseBarLineDataSet, fB);
        }
        return fB;
    }

    private float c(HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, float f) {
        String label = hwHealthBaseBarLineDataSet.getLabel();
        if (label.equals("STATE_TABLE")) {
            this.s = f;
        } else if (label.equals("FITNESS_TABLE")) {
            this.o = f;
        } else {
            this.l = f;
        }
        return Math.min(this.l, Math.min(this.s, this.o));
    }

    private float b(float f, float f2) {
        double dMin;
        float f3 = (f + f2) / 2.0f;
        double dMin2 = Math.min(((double) f2) - (((double) (Math.min(f - f3, f3 - f2) * 2.0f)) * 0.05d), ((double) f3) * 0.8d);
        if (this.p == 0) {
            dMin = Math.max(dMin2, 0.0d);
        } else {
            dMin = Math.min(dMin2, 0.0d);
        }
        float f4 = (float) dMin;
        LogUtil.a("RqChartLineViewHolder", "computeDynamicBorderMin: ", "runningMinValue: ", Float.valueOf(f4));
        return f4;
    }

    private float a(float f, float f2) {
        float f3;
        float fAbs = Math.abs(Math.max(f, 0.0f));
        float fAbs2 = Math.abs(Math.min(f2, 0.0f));
        if (fAbs > fAbs2 * 2.5f) {
            f3 = (-Math.max(6.0f, fAbs * 1.24f)) / 3.0f;
        } else if (fAbs2 > 2.5f * fAbs) {
            f3 = (-(Math.max(6.0f, fAbs2 * 1.24f) / 3.0f)) * 3.0f;
        } else {
            f3 = -Math.max(4.0f, Math.max(fAbs, fAbs2) * 1.1f);
        }
        LogUtil.a("RqChartLineViewHolder", "computeDynamicBorderMin: ", "stateMinValue: ", Float.valueOf(f3));
        return f3;
    }

    public String d(HwHealthBaseEntry hwHealthBaseEntry) {
        if (hwHealthBaseEntry == null || ((int) hwHealthBaseEntry.getY()) == Integer.MIN_VALUE) {
            return "--";
        }
        return wka.d(hwHealthBaseEntry.getY());
    }

    protected String b() {
        if (a()) {
            return "STATE_TABLE";
        }
        if (d()) {
            return "FITNESS_TABLE";
        }
        return "FATIGUE_TABLE";
    }

    @Override // com.huawei.ui.commonui.linechart.HwHealthLineScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthScrollChartHolder, com.huawei.ui.commonui.linechart.HwHealthChartHolder
    public HwHealthLineDataSet onCreateDataSet(HwHealthLineChart hwHealthLineChart, DataInfos dataInfos, HwHealthChartHolder.c cVar) {
        this.f50609c = hwHealthLineChart;
        ArrayList arrayList = new ArrayList();
        if (a() || d() || c()) {
            HwHealthLineDataSet hwHealthLineDataSet = new HwHealthLineDataSet(this.e, arrayList, getChartBrief(dataInfos), b(), getChartUnit(dataInfos));
            hwHealthLineDataSet.d(Color.argb(229, 178, 178, 178));
            hwHealthLineDataSet.setLabelCount(5, true);
            hwHealthLineDataSet.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: uvh
                @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
                public final boolean drawLine(int i, int i2, int i3) {
                    return uvi.d(i, i2, i3);
                }
            });
            hwHealthLineDataSet.setLineWidth(1.5f);
            hwHealthLineDataSet.setShowMaxMinValue(false);
            if (a()) {
                hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_b));
                return hwHealthLineDataSet;
            }
            if (d()) {
                hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_a));
                return hwHealthLineDataSet;
            }
            hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_sss));
            return hwHealthLineDataSet;
        }
        qny qnyVar = new qny(arrayList, getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos));
        int i = this.p;
        if (i == 0) {
            qnyVar.b(wka.c() == 0 ? this.i : this.g);
            qnyVar.setLabel("RUNNING_TABLE");
        } else {
            if (i == 1) {
                HwHealthLineDataSet hwHealthLineDataSet2 = new HwHealthLineDataSet(this.e, arrayList, getChartBrief(dataInfos), getChartLabel(dataInfos), getChartUnit(dataInfos));
                a(hwHealthLineDataSet2);
                hwHealthLineDataSet2.d(Color.argb(229, 178, 178, 178));
                hwHealthLineDataSet2.setLabelCount(5, true);
                hwHealthLineDataSet2.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: uvj
                    @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
                    public final boolean drawLine(int i2, int i3, int i4) {
                        return uvi.a(i2, i3, i4);
                    }
                });
                hwHealthLineDataSet2.setLineWidth(1.5f);
                hwHealthLineDataSet2.setLabel("STATE_TABLE");
                hwHealthLineDataSet2.setShowMaxMinValue(false);
                return hwHealthLineDataSet2;
            }
            qnyVar.b(this.r);
            qnyVar.setLabel("VO2MAX_TABLE");
        }
        qnyVar.d(Color.argb(229, 178, 178, 178));
        qnyVar.setLabelCount(5, true);
        qnyVar.b(new HwHealthLineDataSet.LineLinkerFilter() { // from class: uvm
            @Override // com.huawei.ui.commonui.linechart.view.HwHealthLineDataSet.LineLinkerFilter
            public final boolean drawLine(int i2, int i3, int i4) {
                return uvi.e(i2, i3, i4);
            }
        });
        qnyVar.setLineWidth(1.5f);
        qnyVar.setShowMaxMinValue(false);
        return qnyVar;
    }

    private void a(HwHealthLineDataSet hwHealthLineDataSet) {
        if (this.j == 0) {
            hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_b));
        }
        if (this.j == 1) {
            hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_a));
        }
        if (this.j == 2) {
            hwHealthLineDataSet.setColor(qqn.b(this.e, R.color.pie_sector_running_level_color_sss));
        }
    }
}
