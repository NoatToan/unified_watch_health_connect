package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.exz;
import defpackage.ezh;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes19.dex */
public class BodyWeightFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f27960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27961c;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 0;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.mGender = this.mWeightBean.an();
        this.f27959a = this.mWeightBean.r();
        this.f27961c = this.mWeightBean.c();
        this.f27960b = this.mWeightBean.f();
        double dAv = this.mWeightBean.av();
        if (ezh.c(this.f27960b, this.mIsOversea)) {
            return;
        }
        this.f27960b = exz.c(dAv, this.f27959a);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return "bodyWeight";
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isSetUnit() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        double[] dArrE = exz.e(this.mIsOversea, this.mGender, this.f27961c);
        if (!vei.b(dArrE, 2)) {
            LogUtil.j("HealthWeight_BodyWeightFragment", "initSpecification, bodyMassIndexValue is out of bound.");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) dArrE[0];
        float f2 = (float) dArrE[1];
        float f3 = (float) dArrE[2];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        String strB = b(1);
        String strB2 = b(2);
        String strB3 = b(3);
        String strB4 = b(4);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        int color4 = getColor(vdc.c(4));
        double[] dArrC = exz.c(Utils.o());
        float f4 = (float) dArrC[0];
        float f5 = (float) dArrC[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f4, f, color, strB));
        arrayList.add(new qlj(f, calculateRangValue, color2, strB2));
        arrayList.add(new qlj(calculateRangValue, f3, color3, strB3));
        arrayList.add(new qlj(f3, f5, color4, strB4));
        setAllLevelsData(arrayList, dArrE, dArrC);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strB, "", color));
        arrayList2.add(new WeightBodyDataFragment.c(strB2, "", color2));
        arrayList2.add(new WeightBodyDataFragment.c(strB3, "", color3));
        arrayList2.add(new WeightBodyDataFragment.c(strB4, "", color4));
        setLevelInfo(arrayList2);
        a();
    }

    private String b(int i) {
        return vcz.d(0, i);
    }

    private void a() {
        String strE = UnitUtil.e(UnitUtil.c(this.mWeightBean.av()), 1, this.mWeightBean.getFractionDigitByType(0));
        double d = UnitUtil.d(this.f27960b, 1);
        this.f27960b = d;
        setLevelUnitString(d, strE, vei.b());
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        int i;
        String str;
        int fractionDigitByType = this.mWeightBean.getFractionDigitByType(0);
        double d = exz.d(this.mGender, this.f27959a, this.f27961c);
        double d2 = UnitUtil.d(this.mWeightBean.av(), fractionDigitByType) - UnitUtil.d(d, fractionDigitByType);
        double dAbs = Math.abs(d2);
        double dC = UnitUtil.c(d);
        double dC2 = UnitUtil.c(dAbs);
        int iE = UnitUtil.e();
        if (iE == 1) {
            i = R.plurals.IDS_health_catty;
        } else if (iE == 3) {
            i = R.plurals.IDS_lb_string;
        } else {
            i = R.plurals.IDS_kg_string;
        }
        String quantityString = this.mResources.getQuantityString(i, vdo.b(dC), UnitUtil.e(dC, 1, 1));
        String quantityString2 = this.mResources.getQuantityString(i, vdo.b(dC2), UnitUtil.e(dC2, 1, fractionDigitByType));
        if (d2 > 0.0d) {
            str = String.format(this.mResources.getString(R.string.IDS_hw_weight_suggest_description_more_than_ideal), quantityString, quantityString2);
        } else if (d2 < 0.0d) {
            str = String.format(this.mResources.getString(R.string.IDS_hw_weight_suggest_description_less_than_ideal), quantityString, quantityString2);
        } else {
            str = String.format(this.mResources.getString(R.string.IDS_hw_weight_suggest_description_equal_ideal), quantityString);
        }
        initIdealForGlobal(this.mResources.getString(R.string.IDS_weight_ideal), String.format(Locale.ENGLISH, this.mResources.getString(R.string.IDS_hwh_home_ideal_weight), vei.b(dC, 1)), str);
        initAbout(vcw.j(0), vcw.j(1));
    }
}
