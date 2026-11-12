package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.util.Pair;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.exz;
import defpackage.njy;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class FatFreeFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27964a;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 14;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27964a = (int) this.mWeightBean.getDoubleOrIntLevelByType(14);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public List<Pair<Long, Float>> buildTrendData(List<HiHealthData> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (HiHealthData hiHealthData : list) {
                double d = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
                if (d > 0.0d) {
                    double d2 = UnitUtil.d(UnitUtil.c(exz.a(d, hiHealthData.getDouble("bodyWeight"))), 1);
                    if (d2 > 0.0d) {
                        arrayList.add(new Pair(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf((float) d2)));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            a(true);
            return;
        }
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(14);
        if (!vei.b(doubleArrayLevelByType, 1) || this.f27964a == -1) {
            LogUtil.j("HealthWeight_FatFreeFragment", "initSpecification fatFreeValuesNew is out of bound or mGradeNew is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float fC = (float) UnitUtil.c(doubleArrayLevelByType[0]);
        float fC2 = (float) UnitUtil.c(doubleArrayLevelByType[1]);
        float calculateRangValue = getCalculateRangValue(fC2, 0.1f, true);
        String strE = vcz.e(0, 2);
        String strE2 = vcz.e(0, 3);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        double[] dArrG = exz.g();
        float fC3 = (float) UnitUtil.c(dArrG[0]);
        float fC4 = (float) UnitUtil.c(dArrG[1]);
        String strE3 = vcz.e(0, 1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(fC3, fC, color, strE3));
        arrayList.add(new qlj(fC, calculateRangValue, color2, strE));
        arrayList.add(new qlj(calculateRangValue, fC4, color3, strE2));
        setAllLevelsData(arrayList, new double[]{fC, fC2}, new double[]{fC3, fC4});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strE3, getMinRangContent(getCalculateRangValue(fC, 0.1f, false)), color));
        arrayList2.add(new WeightBodyDataFragment.c(strE, getComRangContent(fC, fC2), color2));
        arrayList2.add(new WeightBodyDataFragment.c(strE2, getMaxRangContent(calculateRangValue), color3));
        setLevelInfo(arrayList2);
        a(false);
    }

    private void a(boolean z) {
        double dC = UnitUtil.c(exz.a(this.mWeightBean.b(), this.mWeightBean.av()));
        String strE = UnitUtil.e(dC, 1, 1);
        double d = UnitUtil.d(dC, 1);
        if (z) {
            setDataInfo(getString(R.string.IDS_weight_fat_free), strE, vei.b());
        } else {
            setLevelUnitString(d, strE, vei.b());
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        int i = this.f27964a;
        if (i != -1) {
            initResult(vcz.d(1, i, this.mWeightBean.c()), vcz.d(2, this.f27964a, this.mWeightBean.c()));
        }
        initAbout(vcw.i(0), vcw.i(1));
    }
}
