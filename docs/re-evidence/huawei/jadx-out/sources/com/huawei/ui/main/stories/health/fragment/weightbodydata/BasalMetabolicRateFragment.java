package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.exz;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vde;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class BasalMetabolicRateFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27952a;
    private int d;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 4;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27952a = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(4);
        this.d = doubleOrIntLevelByType;
        LogUtil.a("HealthWeight_BasalMetabolicRateFragment", "initData mGradNew = ", Integer.valueOf(doubleOrIntLevelByType));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.BASAL_METABOLISM;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            setDataInfo(getString(R.string.IDS_hw_show_metabolism), UnitUtil.e(this.mWeightBean.e(), 1, 1), getString(R.string.IDS_hw_show_sport_cal_unit_new));
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(400);
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(4);
        if (doubleOrIntLevelByType == -1 || !vei.b(doubleArrayLevelByType, 1)) {
            LogUtil.j("HealthWeight_BasalMetabolicRateFragment", "initSpecification, basalMetabolicRateProgressNew is null or basalMetabolicRatesNew is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) doubleArrayLevelByType[0];
        float f2 = (float) doubleArrayLevelByType[1];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        String strE = e(1);
        String strE2 = e(2);
        String strE3 = e(3);
        int iA = a(1);
        int iA2 = a(2);
        int iA3 = a(3);
        double[] dArrD = exz.d();
        float f3 = (float) dArrD[0];
        float f4 = (float) dArrD[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f3, f, iA, strE));
        arrayList.add(new qlj(f, calculateRangValue, iA2, strE2));
        arrayList.add(new qlj(calculateRangValue, f4, iA3, strE3));
        setAllLevelsData(arrayList, doubleArrayLevelByType, dArrD);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strE, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), iA));
        arrayList2.add(new WeightBodyDataFragment.c(strE2, getComRangContent(f, f2), iA2));
        arrayList2.add(new WeightBodyDataFragment.c(strE3, getMaxRangContent(calculateRangValue), iA3));
        setLevelInfo(arrayList2);
        setLevelUnitString(UnitUtil.d(this.mWeightBean.e(), 1), UnitUtil.e(this.mWeightBean.e(), 1, 1), getString(R.string.IDS_hw_show_sport_cal_unit_new));
    }

    private int a(int i) {
        return getColor(vdc.c(i));
    }

    private String e(int i) {
        return vcz.b(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.d != -1) {
            a();
        }
        initAbout(vcw.d(0), vcw.d(1));
    }

    private void a() {
        String strE = vcz.e(1, this.d, this.f27952a);
        String strE2 = vcz.e(2, this.d, this.f27952a);
        if (!this.mWeightBean.isNewScaleType()) {
            if (LanguageUtil.l(this.mContext)) {
                int iC = vde.c(this.f27952a);
                if (iC != -1) {
                    strE2 = vde.b(vde.b(4, this.mGender, iC, this.d), this.mWeightBean.ax());
                }
                strE = "";
            } else {
                strE = "";
                strE2 = strE;
            }
        }
        initResult(strE, strE2);
    }
}
