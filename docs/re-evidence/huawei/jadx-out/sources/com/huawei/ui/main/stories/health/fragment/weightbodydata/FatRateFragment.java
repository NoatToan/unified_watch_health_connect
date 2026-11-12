package com.huawei.ui.main.stories.health.fragment.weightbodydata;

import android.app.Activity;
import android.view.View;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment;
import com.huawei.ui.main.stories.health.views.HealthBodyDetailData;
import defpackage.dnj;
import defpackage.dxm;
import defpackage.dyh;
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
public class FatRateFragment extends WeightBodyDataFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f27965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f27966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f27967c;
    private int d;
    private int e;

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public int getBiType() {
        return 1;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initView(View view) {
        super.initView(view);
        if (this.mIsOversea || !this.mWeightBean.isVisible(32, this.mIsOversea)) {
            this.mIdealDescription.setVisibility(8);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initData() {
        this.e = this.mWeightBean.c();
        this.mGender = this.mWeightBean.an();
        this.d = this.mWeightBean.r();
        this.f27966b = this.mWeightBean.av();
        this.f27965a = this.mWeightBean.b();
        this.f27967c = (int) this.mWeightBean.getDoubleOrIntLevelByType(1);
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public Boolean isShowHistoricalData() {
        return true;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public String getBodyDataKey() {
        return BleConstants.BODY_FAT_RATE;
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initSpecification() {
        if (!vdo.a()) {
            a(true);
            return;
        }
        double[] doubleArrayLevelByType = this.mWeightBean.getDoubleArrayLevelByType(1);
        if (this.f27967c == -1 || !vei.b(doubleArrayLevelByType, 2)) {
            LogUtil.j("HealthWeight_FatRateFragment", "initSpecification mGradeNew is invalid", "or fat rates standard range out of bound");
            return;
        }
        setIndicatorCardViewVisible();
        float f = (float) doubleArrayLevelByType[0];
        float f2 = (float) doubleArrayLevelByType[1];
        float f3 = (float) doubleArrayLevelByType[2];
        float calculateRangValue = getCalculateRangValue(f2, 0.1f, true);
        float calculateRangValue2 = getCalculateRangValue(f3, 0.1f, true);
        String strA = a(1);
        String strA2 = a(2);
        String strA3 = a(3);
        String strA4 = a(4);
        int iE = e(1);
        int iE2 = e(2);
        int iE3 = e(3);
        int iE4 = e(4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qlj(0.0f, f, iE, strA));
        arrayList.add(new qlj(f, calculateRangValue, iE2, strA2));
        arrayList.add(new qlj(calculateRangValue, calculateRangValue2, iE3, strA3));
        arrayList.add(new qlj(calculateRangValue2, 100.0f, iE4, strA4));
        setAllLevelsData(arrayList, doubleArrayLevelByType, new double[]{0.0d, 100.0d});
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new WeightBodyDataFragment.c(strA, getMinRangContent(getCalculateRangValue(f, 0.1f, false)), iE));
        arrayList2.add(new WeightBodyDataFragment.c(strA2, getComRangContent(f, f2), iE2));
        arrayList2.add(new WeightBodyDataFragment.c(strA3, getComRangContent(calculateRangValue, f3), iE3));
        arrayList2.add(new WeightBodyDataFragment.c(strA4, getMaxRangContent(calculateRangValue2), iE4));
        setLevelInfo(arrayList2);
        a(false);
    }

    private void a(boolean z) {
        String strE = UnitUtil.e(this.f27965a, 2, 1);
        if (z) {
            setDataInfo(getString(R.string.IDS_hw_show_body_fat), UnitUtil.b(this.mContext, "[\\.\\d]", strE, R.style.health_weight_body_data_value, R.style.health_weight_body_data_unit));
        } else if (((int) this.mWeightBean.getDoubleOrIntLevelByType(101)) != -1) {
            setLevelUnitString(UnitUtil.d(this.f27965a, 1), UnitUtil.e(this.f27965a, 1, 1), getString(R.string.IDS_hw_health_show_healthdata_weight_percent));
        }
    }

    private int e(int i) {
        return getColor(vdc.c(i));
    }

    private String a(int i) {
        return vcz.i(0, i);
    }

    private void c() {
        if (vei.b(this.mWeightBean)) {
            setSegmentalCardViewState(0);
            if (this.mSegmentalSubHeader != null) {
                this.mSegmentalSubHeader.setHeadTitleText(this.mResources.getString(R.string.IDS_weight_segmental_fat));
            }
            String string = this.mResources.getString(R.string.IDS_weight_unit);
            if (!LanguageUtil.o(this.mContext)) {
                string = string + " ";
            }
            String str = string + vei.e(0.0d, false);
            HealthTextView healthTextView = (HealthTextView) this.mSegmental.findViewById(R.id.base_weight_segmental_unit);
            healthTextView.setText(str);
            healthTextView.setVisibility(0);
            e();
            return;
        }
        setSegmentalCardViewState(8);
    }

    private void e() {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser.s()) {
            b(currentUser.j());
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: uvp
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f50613c.c(i, (dnj) obj);
                }
            });
        }
    }

    public /* synthetic */ void c(final int i, final dnj dnjVar) {
        if (!(this.mContext instanceof Activity)) {
            LogUtil.j("HealthWeight_FatRateFragment", "mContext is null or mContext is not Activity");
        } else {
            ((Activity) this.mContext).runOnUiThread(new Runnable() { // from class: uvq
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(dnjVar, i);
                }
            });
        }
    }

    public /* synthetic */ void c(dnj dnjVar, int i) {
        if (dnjVar == null || i != 0) {
            LogUtil.j("HealthWeight_FatRateFragment", "loadDataSuccess getCurrentUser: currentUser is null return");
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        b(dnjVar.j());
    }

    private void b(int i) {
        double d = this.mWeightBean.d();
        if (d <= 0.0d) {
            d = exz.c(this.f27965a, this.f27966b);
        }
        double dB = UnitUtil.b(this.mWeightBean.v(), 1);
        double dB2 = UnitUtil.b(this.mWeightBean.u(), 1);
        double dB3 = UnitUtil.b(this.mWeightBean.al(), 1);
        double dB4 = UnitUtil.b(this.mWeightBean.ae(), 1);
        double dE = exz.e(UnitUtil.c(d), dB, dB2, dB3, dB4);
        HealthBodyDetailData healthBodyDetailData = (HealthBodyDetailData) this.mSegmental.findViewById(R.id.base_weight_segmental_body_detail_data);
        healthBodyDetailData.setBodyDetailType(0);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(dE));
        arrayList.add(Double.valueOf(dB));
        arrayList.add(Double.valueOf(dB3));
        arrayList.add(Double.valueOf(dB2));
        arrayList.add(Double.valueOf(dB4));
        dyh dyhVarC = c(i);
        vei.a(healthBodyDetailData, (ArrayList<Double>) arrayList, vei.e(dyhVarC, vei.d(exz.f(this.mGender, dyhVarC.l(), this.e), exz.f(this.mGender, dyhVarC.ab(), this.e), dB, dB3), vei.d(exz.e(this.mGender, dyhVarC.o(), this.e), exz.e(this.mGender, dyhVarC.ad(), this.e), dB2, dB4), this.mWeightBean));
        healthBodyDetailData.setVisibility(0);
        if (Utils.o()) {
            vei.d(this.mSegmental, R.id.base_weight_segmental_include_body_standard_horizontal);
        }
    }

    private dyh c(int i) {
        if (dxm.c(this.mWeightBean)) {
            return new dyh(this.d, (float) this.f27966b, this.mGender, this.e, i, 8, this.mWeightBean.ai(), 2, this.mWeightBean.t());
        }
        return new dyh(this.d, (float) this.f27966b, this.mGender, this.e, i, this.mWeightBean.ai());
    }

    private void a() {
        int iM = (int) this.mWeightBean.m();
        if (ezh.i(iM)) {
            setBalanceInfo(false, this.mResources.getString(R.string.IDS_weight_fat_balance_results), this.mResources.getString(R.string.IDS_weight_fat_balance_results_content, vcz.i(iM)), vcz.j(iM), "");
        } else {
            setBalanceResultViewState(8);
        }
    }

    @Override // com.huawei.ui.main.stories.health.fragment.WeightBodyDataFragment
    public void initAnalysisAndInterpretation() {
        String strE;
        if (this.mWeightBean.ac() == 2) {
            c();
            a();
        }
        double doubleOrIntLevelByType = this.mWeightBean.getDoubleOrIntLevelByType(102);
        if (!exz.d(doubleOrIntLevelByType, -1.0d)) {
            if (LanguageUtil.br(this.mContext)) {
                strE = this.mResources.getString(R.string.IDS_hw_health_show_healthdata_weight_percent) + doubleOrIntLevelByType;
            } else {
                strE = UnitUtil.e(doubleOrIntLevelByType, 2, 1);
            }
            if (!LanguageUtil.o(this.mContext)) {
                strE = " " + strE;
            }
            String string = this.mResources.getString(R.string.IDS_weight_ideal_body_fat_rate, strE);
            String string2 = this.mResources.getString(R.string.IDS_hw_weight_ideal_body_fat_ratiodes_des);
            String str = String.format(this.mResources.getString(R.string.IDS_hw_weight_suggest_description_ideal_fat), strE);
            if (!LanguageUtil.o(this.mContext)) {
                string2 = string2 + " ";
            }
            initIdeal(this.mResources.getString(R.string.IDS_weight_ideal_body_fat_rate_name), string, string2 + str);
        }
        if (this.f27967c != -1) {
            b();
        }
        initAbout(vcw.h(0), vcw.h(1));
    }

    private void b() {
        initResult(vcz.a(1, this.f27967c, this.e), vcz.a(2, this.f27967c, this.e));
    }
}
