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
public class VisceralFatGradeFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27978b;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 5;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.e = this.mWeightBean.c();
        this.f27978b = (int) this.mWeightBean.getDoubleOrIntLevelByType(5);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.VISCERAL_FAT_LEVEL;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            e(true);
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(500);
        double[] dArrZ = exz.z();
        if (doubleOrIntLevelByType == -1 || !vei.b(dArrZ, 2)) {
            LogUtil.j("HealthWeight_VisceralFatGradeFragment", "visceralFatGradeProgressNew is not invalid or visceralFatGradesNew is out of bound");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) dArrZ[0];
        float f2 = (float) dArrZ[1];
        float f3 = (float) dArrZ[2];
        String strB = b(1);
        String strB2 = b(2);
        String strB3 = b(3);
        String strB4 = b(4);
        int iE = e(1);
        int iE2 = e(2);
        int iE3 = e(3);
        int iE4 = e(4);
        double[] dArrW = exz.w();
        float f4 = (float) dArrW[0];
        float f5 = (float) dArrW[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f4, f, iE, strB));
        arrayList.add(new qlj(f, f2, iE2, strB2));
        arrayList.add(new qlj(f2, f3, iE3, strB3));
        arrayList.add(new qlj(f3, f5, iE4, strB4));
        setAllLevelsData(arrayList, dArrZ, dArrW);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strB, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), iE));
        arrayList2.add(new WeightBodyDataFragment.c(strB2, getComRangContent(f, getCalculateRangValue(f2, 0.1f, false)), iE2));
        arrayList2.add(new WeightBodyDataFragment.c(strB3, getComRangContent(f2, getCalculateRangValue(f3, 0.1f, false)), iE3));
        arrayList2.add(new WeightBodyDataFragment.c(strB4, getMaxRangContent(f3), iE4));
        setLevelInfo(arrayList2);
        e(false);
    }

    private void e(boolean z) {
        String strE = UnitUtil.e(this.mWeightBean.s(), 1, 1);
        String string = getString(R.string.IDS_hw_show_haslet_unit);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_haslet), strE, string);
        } else {
            setLevelUnitString(UnitUtil.d(this.mWeightBean.s(), 1), strE, string);
        }
    }

    private int e(int i) {
        return getColor(vdc.g(i));
    }

    private String b(int i) {
        return vcz.k(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.f27978b != -1) {
            d();
        }
        initAbout(vcw.q(0), vcw.q(1));
    }

    private void d() {
        initResult(vcz.f(1, this.f27978b, this.e), vcz.f(2, this.f27978b, this.e));
    }
}
