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
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class TotalBodyWaterFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27977a;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 3;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.e = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        this.f27977a = (int) this.mWeightBean.getDoubleOrIntLevelByType(3);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.MOISTURE_RATE;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            setDataInfo(getString(R.string.IDS_hw_show_water), UnitUtil.e(this.mWeightBean.aq(), 2, 1), "");
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(300);
        double[] dArrH = exz.h(this.mGender, this.e);
        if (doubleOrIntLevelByType == -1 || !vei.b(dArrH, 1)) {
            LogUtil.a("HealthWeight_TotalBodyWaterFragment", "initSpecification totalBodyWaterProgressNew is invalid or totalBodyWatersNew is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) dArrH[0];
        float f2 = (float) dArrH[1];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        String strD = d(1);
        String strD2 = d(2);
        String strD3 = d(3);
        int iE = e(1);
        int iE2 = e(2);
        int iE3 = e(3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(0.0f, f, iE, strD));
        arrayList.add(new qlj(f, calculateRangValue, iE2, strD2));
        arrayList.add(new qlj(calculateRangValue, 100.0f, iE3, strD3));
        setAllLevelsData(arrayList, dArrH, new double[]{0.0d, 100.0d});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strD, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), iE));
        arrayList2.add(new WeightBodyDataFragment.c(strD2, getComRangContent(f, f2), iE2));
        arrayList2.add(new WeightBodyDataFragment.c(strD3, getMaxRangContent(calculateRangValue), iE3));
        setLevelInfo(arrayList2);
        setLevelUnitString(UnitUtil.d(this.mWeightBean.aq(), 1), UnitUtil.e(this.mWeightBean.aq(), 1, 1), getString(R.string.IDS_hw_health_show_healthdata_weight_percent));
    }

    private int e(int i) {
        return getColor(vdc.c(i));
    }

    private String d(int i) {
        return vcz.l(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.f27977a != -1) {
            d();
        }
        initAbout(vcw.s(0), vcw.s(1));
    }

    private void d() {
        initResult(vcz.h(1, this.f27977a, this.e), vcz.h(2, this.f27977a, this.e));
    }
}
