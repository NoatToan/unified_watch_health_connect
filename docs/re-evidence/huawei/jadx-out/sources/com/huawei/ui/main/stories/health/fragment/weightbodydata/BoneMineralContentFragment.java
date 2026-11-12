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
public class BoneMineralContentFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27962a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27963c;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 7;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.e = this.mWeightBean.c();
        this.f27962a = this.mWeightBean.getFractionDigitByType(7);
        this.f27963c = (int) this.mWeightBean.getDoubleOrIntLevelByType(7);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.BONE_SALT;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isSetUnit() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            d(true);
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(700);
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(7);
        if (doubleOrIntLevelByType == -1 || !vei.b(doubleArrayLevelByType, 1)) {
            LogUtil.j("HealthWeight_BoneMineralContentFragment", "initSpecification, boneMineralContentProgressNew is invalid.");
            return;
        }
        setIndicatorCardViewVisible();
        float fB = (float) UnitUtil.b(doubleArrayLevelByType[0], 2);
        float fB2 = (float) UnitUtil.b(doubleArrayLevelByType[1], 2);
        float calculateRangValue = getCalculateRangValue(fB2, 0.01f, true);
        String strC = c(1);
        String strC2 = c(2);
        String strC3 = c(3);
        int iD = d(1);
        int iD2 = d(2);
        int iD3 = d(3);
        double[] dArrB = exz.b();
        float fC = (float) UnitUtil.c(dArrB[0]);
        float fC2 = (float) UnitUtil.c(dArrB[1]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(fC, fB, iD, strC));
        arrayList.add(new qlj(fB, calculateRangValue, iD2, strC2));
        arrayList.add(new qlj(calculateRangValue, fC2, iD3, strC3));
        setAllLevelsData(arrayList, new double[]{fB, fB2}, new double[]{fC, fC2});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strC, this.mContext.getString(R.string.IDS_bp_min_scope_value, UnitUtil.e(getCalculateRangValue(fB, 0.01f, false), 1, 2)), iD));
        arrayList2.add(new WeightBodyDataFragment.c(strC2, d(fB, fB2), iD2));
        arrayList2.add(new WeightBodyDataFragment.c(strC3, this.mContext.getString(R.string.IDS_bp_max_explain, UnitUtil.e(calculateRangValue, 1, 2)), iD3));
        setLevelInfo(arrayList2);
        d(false);
    }

    private String d(float f, float f2) {
        return this.mContext.getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(f, 1, 2), UnitUtil.e(f2, 1, 2));
    }

    private int d(int i) {
        return getColor(vdc.c(i));
    }

    private String c(int i) {
        return vcz.a(0, i);
    }

    private void d(boolean z) {
        double dC = UnitUtil.c(this.mWeightBean.g());
        String strE = UnitUtil.e(dC, 1, this.f27962a);
        double d = UnitUtil.d(dC, this.f27962a);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_bone), strE, vei.b());
        } else {
            setLevelUnitString(d, strE, vei.b());
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.f27963c != -1) {
            c();
        }
        initAbout(vcw.f(0), vcw.f(1));
    }

    private void c() {
        initResult(vcz.b(1, this.f27963c, this.e), vcz.b(2, this.f27963c, this.e));
    }
}
