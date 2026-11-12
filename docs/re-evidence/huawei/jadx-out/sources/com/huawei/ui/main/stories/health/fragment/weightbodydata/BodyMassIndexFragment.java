package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.util.Pair;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hihealth.HiHealthData;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import defpackage.etn;
import defpackage.exz;
import defpackage.ezh;
import defpackage.njy;
import defpackage.qlj;
import defpackage.vcw;
import defpackage.vcz;
import defpackage.vdc;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class BodyMassIndexFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f27954c;
    private int d;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 2;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.f27953b = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        double dF = this.mWeightBean.f();
        this.f27954c = dF;
        if (!ezh.c(dF, this.mIsOversea)) {
            this.f27954c = exz.c(this.mWeightBean.av(), this.mWeightBean.r());
        }
        this.d = exz.b(this.f27954c, this.mIsOversea, this.mGender, this.f27953b);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.BMI;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public List<Pair<Long, Float>> buildTrendData(List<HiHealthData> list) {
        double dC;
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            for (HiHealthData hiHealthData : list) {
                if (isSetUnit().booleanValue()) {
                    dC = UnitUtil.c(hiHealthData.getDouble(BleConstants.BMI));
                } else {
                    dC = hiHealthData.getDouble(BleConstants.BMI);
                }
                float fE = (float) dC;
                if (fE <= 0.0f) {
                    double d = hiHealthData.getDouble("bodyWeight");
                    double d2 = hiHealthData.getDouble("height");
                    fE = (float) etn.e(d, d2 <= 0.0d ? MultiUsersManager.INSTANCE.getCurrentUser().e() : (int) d2);
                }
                arrayList.add(new Pair(Long.valueOf(hiHealthData.getStartTime()), Float.valueOf(fE)));
            }
        }
        return arrayList;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        double[] dArrE = exz.e(this.mIsOversea, this.mGender, this.f27953b);
        setIndicatorCardViewVisible();
        float f = (float) dArrE[0];
        float f2 = (float) dArrE[1];
        float f3 = (float) dArrE[2];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        String strD = d(1);
        String strD2 = d(2);
        String strD3 = d(3);
        String strD4 = d(4);
        int color = getColor(vdc.c(1));
        int color2 = getColor(vdc.c(2));
        int color3 = getColor(vdc.c(3));
        int color4 = getColor(vdc.c(4));
        double[] dArrC = exz.c(Utils.o());
        float f4 = (float) dArrC[0];
        float f5 = (float) dArrC[1];
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(f4, f, color, strD));
        arrayList.add(new qlj(f, calculateRangValue, color2, strD2));
        arrayList.add(new qlj(calculateRangValue, f3, color3, strD3));
        arrayList.add(new qlj(f3, f5, color4, strD4));
        setAllLevelsData(arrayList, dArrE, dArrC);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strD, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), color));
        arrayList2.add(new WeightBodyDataFragment.c(strD2, getComRangContent(f, f2), color2));
        arrayList2.add(new WeightBodyDataFragment.c(strD3, getComRangContent(calculateRangValue, getCalculateRangValue(f3, 0.1f, false)), color3));
        arrayList2.add(new WeightBodyDataFragment.c(strD4, getMaxRangContent(f3), color4));
        setLevelInfo(arrayList2);
        String strE = UnitUtil.e(this.f27954c, 1, 1);
        double d = UnitUtil.d(this.f27954c, 1);
        this.f27954c = d;
        setLevel(d, strE);
    }

    private String d(int i) {
        return vcz.d(0, i);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        initResultForGlobal(vcz.d(1, this.d), vcz.d(2, this.d));
        initAbout(vcw.a(0), vcw.a(1));
    }
}
