package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.util.Pair;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import com.huawei.ui.main.stories.health.util.TrendFragmentCallback;
import defpackage.dnb;
import defpackage.exz;
import defpackage.ezh;
import defpackage.lsl;
import defpackage.njy;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ProteinFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27971a;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 8;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27971a = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        this.e = (int) this.mWeightBean.getDoubleOrIntLevelByType(8);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "protein";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            c(true);
            return;
        }
        if (((int) this.mWeightBean.getDoubleOrIntLevelByType(800)) == -1) {
            LogUtil.j("HealthWeight_ProteinFragment", "initSpecification, proteinRateProgressNew is invalid.");
            return;
        }
        double[] dArrE = exz.e(this.mGender, this.f27971a);
        if (!vei.b(dArrE, 1)) {
            LogUtil.j("HealthWeight_ProteinFragment", "initSpecification, proteinRatesNew is out of bound.");
            return;
        }
        if (this.e == -1) {
            LogUtil.j("HealthWeight_ProteinFragment", "initSpecification, mGradeNew is invalid.");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) dArrE[0];
        float f2 = (float) dArrE[1];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        String strF = vcz.f(0, 1);
        String strF2 = vcz.f(0, 2);
        String strF3 = vcz.f(0, 3);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(0.0f, f, color, strF));
        arrayList.add(new qlj(f, calculateRangValue, color2, strF2));
        arrayList.add(new qlj(calculateRangValue, 100.0f, color3, strF3));
        setAllLevelsData(arrayList, dArrE, new double[]{0.0d, 100.0d});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strF, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), color));
        arrayList2.add(new WeightBodyDataFragment.c(strF2, getComRangContent(f, f2), color2));
        arrayList2.add(new WeightBodyDataFragment.c(strF3, getMaxRangContent(calculateRangValue), color3));
        setLevelInfo(arrayList2);
        c(false);
    }

    private void c(boolean z) {
        double dB = b(this.mWeightBean);
        String strE = UnitUtil.e(dB, (LanguageUtil.o(this.mContext) || LanguageUtil.q(this.mContext)) ? 2 : 1, 1);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_protein), UnitUtil.b(this.mContext, "[\\.\\d]", strE, R.style.health_weight_body_data_value, R.style.health_weight_body_data_unit));
            return;
        }
        String strE2 = UnitUtil.e(dB, 1, 1);
        double d = UnitUtil.d(dB, 1);
        setLevelSpannableString(d, strE);
        setLevelUnitString(d, strE2, getString(R.string.IDS_hw_health_show_healthdata_weight_percent));
    }

    private double b(dnb dnbVar) {
        if (!dnbVar.isVisible(8, false)) {
            return 0.0d;
        }
        double dAq = dnbVar.aq();
        if (!ezh.r(dAq)) {
            dAq = dnbVar.ak();
        }
        return exz.e(dnbVar.av(), dAq, dnbVar.b(), dnbVar.g(), dnbVar.getFractionDigitByType(0));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.e != -1) {
            b();
        }
        initAbout(vcw.l(0), vcw.l(1));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public HiAggregateOption getHiAggregateOption() {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(getTrendStartTime(), getTrendEndTime());
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        LogUtil.a("HealthWeight_ProteinFragment", "getChartData() aggregateOption = ", hiAggregateOption.toString());
        return hiAggregateOption;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void getChartData() {
        vei.d(MultiUsersManager.INSTANCE.getCurrentUser(), getHiAggregateOption(), new TrendFragmentCallback() { // from class: com.huawei.ui.main.stories.health.fragment.weightbodydata.ProteinFragment.5
            @Override // com.huawei.ui.main.stories.health.util.TrendFragmentCallback
            public void getWeight(ArrayList<dnb> arrayList, boolean z) {
                Collections.reverse(arrayList);
                ProteinFragment.this.updateTrendData(ProteinFragment.this.b(arrayList));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Pair<Long, Float>> b(ArrayList<dnb> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        if (njy.e(arrayList)) {
            return arrayList2;
        }
        long jR = 0;
        int i = 0;
        double d = 0.0d;
        for (dnb dnbVar : arrayList) {
            if (!lsl.c(jR, dnbVar.ax())) {
                e(jR, d, i, arrayList2);
                jR = lsl.r(dnbVar.ax());
                i = 0;
                d = 0.0d;
            }
            double dB = b(dnbVar);
            if (dB > 0.0d) {
                d += dB;
                i++;
                jR = lsl.r(dnbVar.ax());
            }
        }
        e(jR, d, i, arrayList2);
        return arrayList2;
    }

    private void e(long j, double d, int i, List<Pair<Long, Float>> list) {
        if (i > 0) {
            list.add(new Pair<>(Long.valueOf(j), Float.valueOf((float) (d / ((double) i)))));
        }
    }

    private void b() {
        initResult(vcz.g(1, this.e, this.f27971a), vcz.g(2, this.e, this.f27971a));
    }
}
