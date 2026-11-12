package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.exz;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class HeartRateFragment extends WeightBodyDataFragment {
    private double d;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 11;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        double dQ = this.mWeightBean.q();
        this.d = dQ;
        this.e = exz.a(dQ);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        double[] dArrI = exz.i();
        setIndicatorCardViewVisible();
        int i = (int) dArrI[0];
        int i2 = (int) dArrI[1];
        int i3 = (int) dArrI[2];
        int i4 = i2 + 1;
        int i5 = i3 + 1;
        String strA = a(1);
        String strA2 = a(2);
        String strA3 = a(3);
        String strA4 = a(4);
        int iE = e(1);
        int iE2 = e(2);
        int iE3 = e(3);
        int iE4 = e(4);
        double[] dArrJ = exz.j();
        float f = (float) dArrJ[0];
        float f2 = (float) dArrJ[1];
        ArrayList arrayList = new ArrayList();
        float f3 = i;
        arrayList.add(new qlj(f, f3, iE, strA));
        float f4 = i4;
        arrayList.add(new qlj(f3, f4, iE2, strA2));
        float f5 = i5;
        arrayList.add(new qlj(f4, f5, iE3, strA3));
        arrayList.add(new qlj(f5, f2, iE4, strA4));
        setAllLevelsData(arrayList, dArrI, dArrJ);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strA, this.mContext.getString(R.string.IDS_bp_min_scope_value, UnitUtil.e(i - 1, 1, 0)), iE));
        arrayList2.add(new WeightBodyDataFragment.c(strA2, this.mContext.getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0)), iE2));
        arrayList2.add(new WeightBodyDataFragment.c(strA3, this.mContext.getString(R.string.IDS_hw_pressure_grade_range, UnitUtil.e(i4, 1, 0), UnitUtil.e(i3, 1, 0)), iE3));
        arrayList2.add(new WeightBodyDataFragment.c(strA4, this.mContext.getString(R.string.IDS_bp_max_explain, UnitUtil.e(i5, 1, 0)), iE4));
        setLevelInfo(arrayList2);
        String strE = UnitUtil.e(this.d, 1, 0);
        double d = UnitUtil.d(this.d, 0);
        this.d = d;
        setLevelUnitString(d, strE, getString(R.string.ie_main_watch_heart_rate_unit_string));
    }

    private int e(int i) {
        return getColor(vdc.c(i));
    }

    private String a(int i) {
        return vcz.h(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return IndoorEquipManagerApi.KEY_HEART_RATE;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initResultForGlobal(vcz.h(1, this.e), vcz.h(2, this.e));
        initAbout(vcw.g(0), vcw.g(1));
    }
}
