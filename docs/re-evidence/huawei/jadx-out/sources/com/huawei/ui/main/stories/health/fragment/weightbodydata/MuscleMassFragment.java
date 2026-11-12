package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.view.View;
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
public class MuscleMassFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27968a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27969c;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 6;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        LogUtil.a("HealthWeight_MuscleMassFragment", "initViewTahiti()");
        vei.d().c(this.mContext, this.mAboutImage);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        super.initView(view);
        vei.d().c(this.mContext, this.mAboutImage);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27968a = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        this.f27969c = (int) this.mWeightBean.getDoubleOrIntLevelByType(6);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.MUSCLE_MASS;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isSetUnit() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            e(true);
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(600);
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(6);
        if (doubleOrIntLevelByType == -1 || !vei.b(doubleArrayLevelByType, 1)) {
            LogUtil.j("HealthWeight_MuscleMassFragment", "initSpecification, muscleMassProgressNew is invalid or muscleMassValuesNew is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float fC = (float) UnitUtil.c(doubleArrayLevelByType[0]);
        float fC2 = (float) UnitUtil.c(doubleArrayLevelByType[1]);
        float calculateRangValue = getCalculateRangValue(fC2, 0.1f, true);
        String strJ = vcz.j(0, 1);
        String strJ2 = vcz.j(0, 2);
        String strJ3 = vcz.j(0, 3);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        double[] dArrK = exz.k();
        float fC3 = (float) UnitUtil.c(dArrK[0]);
        float fC4 = (float) UnitUtil.c(dArrK[1]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(fC3, fC, color, strJ));
        arrayList.add(new qlj(fC, calculateRangValue, color2, strJ2));
        arrayList.add(new qlj(calculateRangValue, fC4, color3, strJ3));
        setAllLevelsData(arrayList, new double[]{fC, fC2}, new double[]{fC3, fC4});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strJ, getMinRangContent(getCalculateRangValue(fC, 0.1f, false)), color));
        arrayList2.add(new WeightBodyDataFragment.c(strJ2, getComRangContent(fC, fC2), color2));
        arrayList2.add(new WeightBodyDataFragment.c(strJ3, getMaxRangContent(calculateRangValue), color3));
        setLevelInfo(arrayList2);
        e(false);
    }

    private void e(boolean z) {
        double dC = UnitUtil.c(this.mWeightBean.ad());
        String strE = UnitUtil.e(dC, 1, 1);
        double d = UnitUtil.d(dC, 1);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_muscle), strE, vei.b());
        } else {
            setLevelUnitString(d, strE, vei.b());
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        int iC;
        if (this.f27969c != -1) {
            initResult("", (!LanguageUtil.l(this.mContext) || (iC = vde.c(this.f27968a)) == -1) ? "" : vde.b(vde.b(6, this.mGender, iC, this.f27969c), this.mWeightBean.ax()));
        }
        initAbout(vcw.k(0), vcw.k(1));
        initAboutImage(R.drawable.img_musclemass);
    }
}
