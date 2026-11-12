package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.view.View;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import com.huawei.ui.main.stories.health.views.HealthBodyDetailData;
import defpackage.exz;
import defpackage.ezh;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class SkeletalMuscleFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27976b;
    private int d;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 10;
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        LogUtil.a("HealthWeight_SkeletalMuscleFragment", "initViewTahiti()");
        vei.d().c(this.mContext, this.mAboutImage);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        super.initView(view);
        vei.d().c(this.mContext, this.mAboutImage);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.d = this.mWeightBean.c();
        this.f27976b = (int) this.mWeightBean.getDoubleOrIntLevelByType(10);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "skeletalMusclelMass";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isSetUnit() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            c(true);
            return;
        }
        int doubleOrIntLevelByType = (int) this.mWeightBean.getDoubleOrIntLevelByType(1000);
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(10);
        if (doubleOrIntLevelByType == -1 || !vei.b(doubleArrayLevelByType, 1)) {
            LogUtil.a("HealthWeight_SkeletalMuscleFragment", "initSpecification skeletalMuscleProgressNew is invalid or skeletalMuscleValuesNew is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float fC = (float) UnitUtil.c(doubleArrayLevelByType[0]);
        float fC2 = (float) UnitUtil.c(doubleArrayLevelByType[1]);
        float calculateRangValue = getCalculateRangValue(fC2, 0.1f, true);
        String strE = e(1);
        String strE2 = e(2);
        String strE3 = e(3);
        int iD = d(1);
        int iD2 = d(2);
        int iD3 = d(3);
        double[] dArrQ = exz.q();
        float fC3 = (float) UnitUtil.c(dArrQ[0]);
        float fC4 = (float) UnitUtil.c(dArrQ[1]);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(fC3, fC, iD, strE));
        arrayList.add(new qlj(fC, calculateRangValue, iD2, strE2));
        arrayList.add(new qlj(calculateRangValue, fC4, iD3, strE3));
        setAllLevelsData(arrayList, new double[]{fC, fC2}, new double[]{fC3, fC4});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strE, getMinRangContent(getCalculateRangValue(fC, 0.1f, false)), iD));
        arrayList2.add(new WeightBodyDataFragment.c(strE2, getComRangContent(fC, fC2), iD2));
        arrayList2.add(new WeightBodyDataFragment.c(strE3, getMaxRangContent(calculateRangValue), iD3));
        setLevelInfo(arrayList2);
        c(false);
    }

    private int d(int i) {
        return getColor(vdc.c(i));
    }

    private String e(int i) {
        return vcz.m(0, i);
    }

    private void c(boolean z) {
        double dB = UnitUtil.b(this.mWeightBean.am(), 1);
        String strE = UnitUtil.e(dB, 1, 1);
        double d = UnitUtil.d(dB, 1);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_skeletal_muscle_mass), strE, vei.b());
        } else {
            setLevelUnitString(d, strE, vei.b());
        }
    }

    private void d() {
        if (vei.e(this.mWeightBean)) {
            setSegmentalCardViewState(0);
            if (this.mSegmentalSubHeader != null) {
                this.mSegmentalSubHeader.setHeadTitleText(this.mResources.getString(R.string.IDS_weight_segmental_skeletal_muscle));
            }
            String string = this.mResources.getString(R.string.IDS_weight_unit);
            if (!LanguageUtil.o(this.mContext)) {
                string = string + " ";
            }
            String str = string + vei.b();
            HealthTextView healthTextView = (HealthTextView) this.mSegmental.findViewById(R.id.base_weight_segmental_unit);
            healthTextView.setText(str);
            healthTextView.setVisibility(0);
            c();
            return;
        }
        setSegmentalCardViewState(8);
    }

    private void c() {
        double dB = UnitUtil.b(this.mWeightBean.w(), 1);
        double dB2 = UnitUtil.b(this.mWeightBean.y(), 1);
        double dB3 = UnitUtil.b(this.mWeightBean.aj(), 1);
        double dB4 = UnitUtil.b(this.mWeightBean.ah(), 1);
        double d = exz.d(UnitUtil.c(this.mWeightBean.am()), dB, dB2, dB3, dB4);
        HealthBodyDetailData healthBodyDetailData = (HealthBodyDetailData) this.mSegmental.findViewById(R.id.base_weight_segmental_body_detail_data);
        healthBodyDetailData.setBodyDetailType(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(d));
        arrayList.add(Double.valueOf(dB));
        arrayList.add(Double.valueOf(dB3));
        arrayList.add(Double.valueOf(dB2));
        arrayList.add(Double.valueOf(dB4));
        vei.a(healthBodyDetailData, (ArrayList<Double>) arrayList, vei.a(this.mWeightBean));
        if (Utils.o()) {
            vei.d(this.mSegmental, R.id.base_weight_segmental_include_body_standard_horizontal);
        }
    }

    private void e() {
        int iAb = (int) this.mWeightBean.ab();
        if (ezh.s(iAb)) {
            setBalanceInfo(false, this.mResources.getString(R.string.IDS_weight_skeletal_muscle_balance_results), this.mResources.getString(R.string.IDS_weight_skeletal_muscle_balance_results_content, vcz.f(iAb)), vcz.h(iAb), vcz.m(iAb));
            return;
        }
        setBalanceResultViewState(8);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        if (this.mWeightBean.ac() == 2) {
            d();
            e();
        }
        if (this.f27976b != -1) {
            a();
        }
        initAbout(vcw.n(0), vcw.n(1));
        initAboutImage(R.drawable.img_skeletalmuscle);
    }

    private void a() {
        initResult(vcz.i(1, this.f27976b, this.d), vcz.i(2, this.f27976b, this.d));
    }
}
