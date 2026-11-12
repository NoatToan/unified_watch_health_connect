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
public class RelativeAppendicularSkeletalMuscleFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f27974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f27975c;
    private int d;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 26;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27974b = this.mWeightBean.an();
        this.f27975c = this.mWeightBean.af();
        int iC = this.mWeightBean.c();
        this.f27973a = iC;
        this.d = exz.c(this.f27974b, this.f27975c, iC);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "rasm";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            setDataInfo(getString(R.string.IDS_weight_limb_skeletal_muscle_index), UnitUtil.e(this.f27975c, 1, 1), getString(R.string.IDS_weight_kg_square));
            return;
        }
        double[] dArrD = exz.d(this.f27974b, this.f27973a);
        setIndicatorCardViewVisible();
        float f = (float) dArrD[0];
        float f2 = (float) dArrD[1];
        float fD = (float) UnitUtil.d(getCalculateRangValue(f2, 0.1f, true), 1);
        String strE = e(1);
        String strE2 = e(2);
        String strE3 = e(3);
        int iA = a(1);
        int iA2 = a(2);
        int iA3 = a(3);
        exz.a(this.f27974b, this.f27975c, this.f27973a);
        double[] dArrP = exz.p();
        float f3 = (float) dArrP[0];
        float f4 = (float) dArrP[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f3, f, iA, strE));
        arrayList.add(new qlj(f, fD, iA2, strE2));
        arrayList.add(new qlj(fD, f4, iA3, strE3));
        setAllLevelsData(arrayList, dArrD, dArrP);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strE, getMinRangContent((float) UnitUtil.d(getCalculateRangValue(f, 0.1f, false), 1)), iA));
        arrayList2.add(new WeightBodyDataFragment.c(strE2, getComRangContent(f, f2), iA2));
        arrayList2.add(new WeightBodyDataFragment.c(strE3, getMaxRangContent(fD), iA3));
        setLevelInfo(arrayList2);
        String strE4 = UnitUtil.e(this.f27975c, 1, 1);
        double d = UnitUtil.d(this.f27975c, 1);
        this.f27975c = d;
        setLevelUnitString(d, strE4, getString(R.string.IDS_weight_kg_square));
    }

    private int a(int i) {
        return getColor(vdc.c(i));
    }

    private String e(int i) {
        return vcz.o(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initResult(vcz.o(1, this.d), vcz.o(2, this.d));
        initAbout(vcw.o(0), vcw.o(1));
    }
}
