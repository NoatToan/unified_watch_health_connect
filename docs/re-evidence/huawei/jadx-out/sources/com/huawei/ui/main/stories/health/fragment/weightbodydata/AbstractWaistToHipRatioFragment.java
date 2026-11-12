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
public class AbstractWaistToHipRatioFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected double f27950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f27951c;
    protected int d;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            d(true);
            return;
        }
        double[] dArrB = exz.b(this.mGender);
        setIndicatorCardViewVisible();
        float f = (float) dArrB[0];
        float calculateRangValue = getCalculateRangValue(f, 0.01f, false);
        String strD = d(1);
        String strD2 = d(2);
        int iC = c(1);
        int iC2 = c(2);
        double[] dArrAd = exz.ad();
        float f2 = (float) dArrAd[0];
        float f3 = (float) dArrAd[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f2, f, iC, strD));
        arrayList.add(new qlj(f, f3, iC2, strD2));
        setAllLevelsData(arrayList, dArrB, dArrAd);
        ArrayList arrayList2 = new ArrayList();
        String string = this.mContext.getString(R.string.IDS_bp_min_scope_value, UnitUtil.e(calculateRangValue, 1, 2));
        String string2 = this.mContext.getString(R.string.IDS_bp_max_explain, UnitUtil.e(f, 1, 2));
        arrayList2.add(new WeightBodyDataFragment.c(strD, string, iC));
        arrayList2.add(new WeightBodyDataFragment.c(strD2, string2, iC2));
        setLevelInfo(arrayList2);
        d(false);
    }

    private void d(boolean z) {
        double d = UnitUtil.d(this.f27950b, 2);
        this.f27950b = d;
        String strE = UnitUtil.e(d, 1, 2);
        if (z) {
            setDataInfo(getString(R.string.IDS_weight_spectral_waist_to_hip_ratio), UnitUtil.b(this.mContext, "[\\.\\d]", strE, R.style.health_weight_body_data_value, R.style.health_weight_body_data_unit));
        } else {
            setLevel(this.f27950b, strE);
        }
    }

    private int c(int i) {
        return getColor(vdc.i(i));
    }

    private String d(int i) {
        return vcz.n(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initResult(vcz.n(1, this.d), vcz.n(2, this.d));
        initAbout(this.f27951c, vcw.p(1));
    }
}
