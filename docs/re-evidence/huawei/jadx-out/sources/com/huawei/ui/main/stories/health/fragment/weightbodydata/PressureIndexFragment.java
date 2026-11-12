package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.exz;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import health.compact.a.UnitUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class PressureIndexFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f27970b;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 12;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27970b = this.mWeightBean.z();
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            setDataInfo(getString(R.string.IDS_hw_show_pressure_index), UnitUtil.e(this.f27970b, 1, 1), "");
            return;
        }
        double[] dArrO = exz.o();
        setIndicatorCardViewVisible();
        float f = (float) dArrO[0];
        float f2 = (float) dArrO[1];
        float f3 = (float) dArrO[2];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        float calculateRangValue2 = getCalculateRangValue(f3, 0.1f, true);
        String strD = d(1);
        String strD2 = d(2);
        String strD3 = d(3);
        String strD4 = d(4);
        int color = getColor(vdc.a(1));
        int color2 = getColor(vdc.a(2));
        int color3 = getColor(vdc.a(3));
        int color4 = getColor(vdc.a(4));
        double[] dArrL = exz.l();
        float f4 = (float) dArrL[0];
        float f5 = (float) dArrL[1];
        float calculateRangValue3 = getCalculateRangValue(f, 0.1f, true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f4, calculateRangValue3, color, strD));
        arrayList.add(new qlj(calculateRangValue3, calculateRangValue, color2, strD2));
        arrayList.add(new qlj(calculateRangValue, calculateRangValue2, color3, strD3));
        arrayList.add(new qlj(calculateRangValue2, f5, color4, strD4));
        setAllLevelsData(arrayList, dArrO, dArrL);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strD, getMinRangContent(f), color));
        arrayList2.add(new WeightBodyDataFragment.c(strD2, getComRangContent(calculateRangValue3, f2), color2));
        arrayList2.add(new WeightBodyDataFragment.c(strD3, getComRangContent(calculateRangValue, f3), color3));
        arrayList2.add(new WeightBodyDataFragment.c(strD4, getMaxRangContent(calculateRangValue2), color4));
        setLevelInfo(arrayList2);
        String strE = UnitUtil.e(this.f27970b, 1, 1);
        double d = UnitUtil.d(this.f27970b, 1);
        this.f27970b = d;
        setLevel(d, strE);
    }

    private String d(int i) {
        return vcz.g(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initAbout(vcw.m(0), vcw.m(1));
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "pressure";
    }
}
