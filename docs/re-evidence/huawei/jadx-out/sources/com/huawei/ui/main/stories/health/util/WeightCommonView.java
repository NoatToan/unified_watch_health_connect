package com.huawei.ui.main.stories.health.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.chart.HealthRingChart;
import com.huawei.ui.commonui.chart.HealthRingChartAdapter;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.views.HealthBodyBarData;
import com.huawei.ui.main.stories.health.views.HealthBodyDetailData;
import defpackage.dnb;
import defpackage.dnj;
import defpackage.dxm;
import defpackage.dyh;
import defpackage.exz;
import defpackage.ezh;
import defpackage.lmf;
import defpackage.qjm;
import defpackage.qqv;
import defpackage.qsp;
import defpackage.ust;
import defpackage.vdh;
import defpackage.vdo;
import defpackage.vei;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class WeightCommonView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f28170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f28171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthColumnSystem f28172c;
    private LinearLayout d;
    private Context e;
    private LinearLayout f;
    private LinearLayout g;
    private HealthSubHeader h;
    private HealthSubHeader i;
    private LinearLayout j;
    private dnb m;
    private LinearLayout n;

    public WeightCommonView(Context context) {
        this(context, null);
    }

    public WeightCommonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        a();
    }

    private void a() {
        if (this.e == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initView Context is null");
            return;
        }
        this.f28172c = new HealthColumnSystem(this.e);
        LayoutInflater layoutInflater = (LayoutInflater) this.e.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initView LayoutInflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.health_weight_body_view, this);
        this.h = (HealthSubHeader) qsp.a(viewInflate, R.id.base_weight_segmental_fat_sub_header);
        this.f = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_segmental_fat);
        this.i = (HealthSubHeader) qsp.a(viewInflate, R.id.base_weight_segmental_skeletal_muscle_sub_header);
        this.g = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_segmental_skeletal_muscle);
        this.d = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_body_analysis_layout);
        this.f28170a = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_peer_comparison_layout);
        this.n = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_suggest_layout);
        this.j = (LinearLayout) qsp.a(viewInflate, R.id.base_weight_age_suggest_layout);
        d();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        d();
        super.onConfigurationChanged(configuration);
    }

    private void d() {
        Context context;
        HealthColumnSystem healthColumnSystem = this.f28172c;
        if (healthColumnSystem == null || (context = this.e) == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "resetColumnLayoutParams Context or mHealthColumnSystem is null");
            return;
        }
        healthColumnSystem.b(context);
        int dimension = (int) this.e.getResources().getDimension(R.dimen.health_main_weight_segmental_default_margin);
        if (this.f28172c.j() > 4) {
            this.f28172c.d(0);
            dimension = (qqv.d(this.e) - this.f28172c.g()) / 2;
        }
        e(this.f.getLayoutParams(), dimension, this.f);
        e(this.g.getLayoutParams(), dimension, this.g);
    }

    private void e(ViewGroup.LayoutParams layoutParams, int i, LinearLayout linearLayout) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
            linearLayout.setLayoutParams(marginLayoutParams);
        }
    }

    public void setWeightCommonView(dnb dnbVar, boolean z, boolean z2) {
        this.f28171b = z;
        this.m = dnbVar;
        if (dnbVar == null || this.e == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "WeightBean or mContext is null.");
        } else {
            d(z2);
        }
    }

    private void d(boolean z) {
        if (!z) {
            LogUtil.a("HealthWeight_WeightCommonView", "not expend, not initWeightCommonView");
            return;
        }
        c(this.m);
        if (this.m.av() <= 0.0d || !this.m.isVisible(1, this.f28171b) || !vei.b(this.m, this.f28171b)) {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
            this.i.setVisibility(8);
            this.g.setVisibility(8);
            this.d.setVisibility(8);
            this.f28170a.setVisibility(8);
            LogUtil.a("HealthWeight_WeightCommonView", "setWeightCommonView mSegmentalFat mSegmentalSkeletalMuscle isGone");
            return;
        }
        this.d.setVisibility(0);
        this.f28170a.setVisibility(0);
        this.n.setVisibility(0);
        a(this.m);
        b(this.m);
        d(this.m);
        i(this.m);
    }

    private void d(dnb dnbVar) {
        if (h(dnbVar) && !Utils.o()) {
            c("peers");
            this.f28170a.setVisibility(0);
            HealthSubHeader healthSubHeader = (HealthSubHeader) this.f28170a.findViewById(R.id.peer_comparison_health_subheader);
            if (healthSubHeader != null) {
                healthSubHeader.setSubHeaderBackgroundColor(0);
            }
            vdh.d(this.e, dnbVar, (HealthBodyBarData) this.f28170a.findViewById(R.id.healthBodyBarData));
            qsp.b((HealthTextView) this.f28170a.findViewById(R.id.peer_comparison_health_summary), vdh.b(dnbVar));
            return;
        }
        this.f28170a.setVisibility(8);
        LogUtil.a("HealthWeight_WeightCommonView", "showPeerComparisonChart mPeerComparisonLayout isGone");
    }

    private void a(dnb dnbVar) {
        if (vei.b(dnbVar)) {
            this.f.setVisibility(0);
            j(dnbVar);
        } else {
            this.h.setVisibility(8);
            this.f.setVisibility(8);
            LogUtil.a("HealthWeight_WeightCommonView", "setWeightCommonView mSegmentalFat isGone");
        }
        if (vei.e(dnbVar)) {
            this.g.setVisibility(0);
            e(dnbVar);
        } else {
            this.i.setVisibility(8);
            this.g.setVisibility(8);
            LogUtil.a("HealthWeight_WeightCommonView", "setWeightCommonView mSegmentalSkeletalMuscle isGone");
        }
    }

    private void c(dnb dnbVar) {
        boolean zD;
        if (dnbVar == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initWeightAgeSuggest weightBean is null.");
            return;
        }
        int iC = dnbVar.c();
        String weightScaleProductId = dnbVar.getWeightScaleProductId();
        int i = 81;
        int i2 = 18;
        if (dxm.v(weightScaleProductId) && !this.f28171b) {
            if (Utils.o()) {
                zD = vdo.d(iC);
            } else {
                zD = vdo.b(iC);
                i2 = 6;
            }
        } else if (dxm.u(weightScaleProductId) || dxm.q(weightScaleProductId) || (dxm.v(weightScaleProductId) && this.f28171b)) {
            zD = vdo.d(iC);
        } else {
            zD = vdo.c(iC);
            i = 66;
        }
        if (zD) {
            this.j.setVisibility(8);
            LogUtil.a("HealthWeight_WeightCommonView", "initWeightAgeSuggest age is over limit");
            return;
        }
        int iO = dnbVar.o();
        if (iO > 0 && !(dnbVar instanceof ust)) {
            LogUtil.d("HealthWeight_WeightCommonView", "initWeightAgeSuggest age = ", Integer.valueOf(iC), ", dataType = ", Integer.valueOf(iO));
            ((HealthTextView) this.j.findViewById(R.id.weight_result_suggest_age_tips)).setText(this.e.getResources().getString(R.string.IDS_device_result_data_analysis_age_tips, Integer.valueOf(i2), Integer.valueOf(i - 1)));
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
            LogUtil.a("HealthWeight_WeightCommonView", "initWeightAgeSuggest dataType is illegal");
        }
    }

    private String a(int i, double d) {
        return this.e.getResources().getString(i, vei.b(UnitUtil.c(d), 1));
    }

    private void j(final dnb dnbVar) {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser.s()) {
            c(dnbVar, currentUser.j());
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new WeightBaseResponseCallback() { // from class: vdt
                @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
                public final void onResponse(int i, Object obj) {
                    this.f50972c.a(dnbVar, i, (dnj) obj);
                }
            });
        }
    }

    public /* synthetic */ void a(final dnb dnbVar, final int i, final dnj dnjVar) {
        Context context = this.e;
        if (!(context instanceof Activity)) {
            LogUtil.j("HealthWeight_WeightCommonView", "mContext is null or mContext is not Activity");
        } else {
            ((Activity) context).runOnUiThread(new Runnable() { // from class: vdu
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(dnjVar, i, dnbVar);
                }
            });
        }
    }

    public /* synthetic */ void c(dnj dnjVar, int i, dnb dnbVar) {
        if (dnjVar == null || i != 0) {
            LogUtil.j("HealthWeight_WeightCommonView", "loadDataSuccess getCurrentUser: currentUser is null return");
            dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
        }
        c(dnbVar, dnjVar.j());
    }

    private void c(dnb dnbVar, int i) {
        if (this.f == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initSegmentalFat mSegmentalFat is null");
            return;
        }
        double dB = exz.b(dnbVar.d());
        if (dB <= 0.0d) {
            dB = exz.c(dnbVar.b(), dnbVar.av());
        }
        HealthSubHeader healthSubHeader = this.h;
        if (healthSubHeader != null) {
            healthSubHeader.setVisibility(0);
            this.h.setSubHeaderBackgroundColor(0);
            this.h.setHeadTitleText(a(R.string.IDS_hwh_home_fat, dB));
        }
        byte bAn = dnbVar.an();
        int iC = dnbVar.c();
        dyh dyhVarE = e(dnbVar, bAn, i);
        double dB2 = UnitUtil.b(dnbVar.v(), 1);
        double dB3 = UnitUtil.b(dnbVar.u(), 1);
        double dB4 = UnitUtil.b(dnbVar.al(), 1);
        double dB5 = UnitUtil.b(dnbVar.ae(), 1);
        int[] iArrD = vei.d(exz.f(bAn, dyhVarE.l(), iC), exz.f(bAn, dyhVarE.ab(), iC), dB2, dB4);
        int[] iArrD2 = vei.d(exz.e(bAn, dyhVarE.o(), iC), exz.e(bAn, dyhVarE.ad(), iC), dB3, dB5);
        double dE = exz.e(UnitUtil.c(dB), dB2, dB3, dB4, dB5);
        HealthBodyDetailData healthBodyDetailData = (HealthBodyDetailData) this.f.findViewById(R.id.base_weight_segmental_body_detail_data);
        if (healthBodyDetailData == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initSegmentalFat: bodyDetailData is null");
            return;
        }
        healthBodyDetailData.setBodyDetailType(0);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(dE));
        arrayList.add(Double.valueOf(dB2));
        arrayList.add(Double.valueOf(dB4));
        arrayList.add(Double.valueOf(dB3));
        arrayList.add(Double.valueOf(dB5));
        vei.a(healthBodyDetailData, (ArrayList<Double>) arrayList, vei.e(dyhVarE, iArrD, iArrD2, dnbVar));
        c();
    }

    private void c() {
        if (!Utils.o() || Utils.c(BaseApplication.getContext())) {
            return;
        }
        vei.d(this.f, R.id.base_weight_segmental_include_body_standard_horizontal);
    }

    private dyh e(dnb dnbVar, byte b2, int i) {
        if (dxm.c(dnbVar)) {
            return new dyh(dnbVar.r(), (float) dnbVar.av(), b2, dnbVar.c(), i, 8, dnbVar.ai(), 2, dnbVar.t());
        }
        return new dyh(dnbVar.r(), (float) dnbVar.av(), b2, dnbVar.c(), i, dnbVar.ai());
    }

    private void e(dnb dnbVar) {
        if (this.g == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initSegmentalSkeletalMuscle mSegmentalSkeletalMuscle is null");
            return;
        }
        double dAm = dnbVar.am();
        HealthSubHeader healthSubHeader = this.i;
        if (healthSubHeader != null) {
            healthSubHeader.setVisibility(0);
            this.i.setSubHeaderBackgroundColor(0);
            this.i.setHeadTitleText(a(R.string.IDS_hwh_home_skeletal_muscle, dAm));
        }
        double dB = UnitUtil.b(dnbVar.w(), 1);
        double dB2 = UnitUtil.b(dnbVar.y(), 1);
        double dB3 = UnitUtil.b(dnbVar.aj(), 1);
        double dB4 = UnitUtil.b(dnbVar.ah(), 1);
        double d = exz.d(UnitUtil.c(dAm), dB, dB2, dB3, dB4);
        HealthBodyDetailData healthBodyDetailData = (HealthBodyDetailData) this.g.findViewById(R.id.base_weight_segmental_body_detail_data);
        if (healthBodyDetailData == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initSegmentalSkeletalMuscle: bodyDetailData is null");
            return;
        }
        healthBodyDetailData.setBodyDetailType(1);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(d));
        arrayList.add(Double.valueOf(dB));
        arrayList.add(Double.valueOf(dB3));
        arrayList.add(Double.valueOf(dB2));
        arrayList.add(Double.valueOf(dB4));
        vei.a(healthBodyDetailData, (ArrayList<Double>) arrayList, vei.a(dnbVar));
        if (!Utils.o() || Utils.c(BaseApplication.getContext())) {
            return;
        }
        vei.d(this.g, R.id.base_weight_segmental_include_body_standard_horizontal);
    }

    private void b(dnb dnbVar) {
        int i;
        if (this.d == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initBodyAnalysisChart mBodyAnalysisLayout is null");
            return;
        }
        if (f(dnbVar)) {
            c("bodyComposition");
            this.d.setVisibility(0);
            HealthRingChart healthRingChart = (HealthRingChart) this.d.findViewById(R.id.body_analysis_chart_view);
            if (healthRingChart == null) {
                LogUtil.e("HealthWeight_WeightCommonView", "initBodyAnalysisChart healthRingChart is null!");
                return;
            }
            double dAq = dnbVar.aq();
            if (!ezh.r(dAq)) {
                dAq = dnbVar.ak();
            }
            double dB = dnbVar.b();
            double dB2 = UnitUtil.b(dnbVar.av(), dnbVar.getFractionDigitByType(0));
            double dB3 = UnitUtil.b(exz.c(dB, dnbVar.av()), 2);
            double dB4 = UnitUtil.b(dnbVar.g(), 2);
            double dB5 = UnitUtil.b(exz.e(dAq, dnbVar.av()), 2);
            double d = UnitUtil.d(((dB2 - dB5) - dB3) - dB4, 2);
            int iE = UnitUtil.e();
            if (iE == 1) {
                i = R.string.IDS_weight_body_component_catty;
            } else if (iE == 3) {
                i = R.string.IDS_weight_body_component_lbs;
            } else {
                i = R.string.IDS_weight_body_component_kg;
            }
            ((HealthTextView) this.d.findViewById(R.id.base_weight_body_analysis_weight_introduction)).setText(i);
            HealthRingChartAdapter healthRingChartAdapter = new HealthRingChartAdapter(this.e, new qjm().b(false).c(true).d(false), vei.b(this.e, new float[]{(float) dB5, (float) d, (float) dB3, (float) dB4}));
            healthRingChartAdapter.d(new HealthRingChartAdapter.DataFormatter() { // from class: vdr
                @Override // com.huawei.ui.commonui.chart.HealthRingChartAdapter.DataFormatter
                public final String format(qjp qjpVar) {
                    return UnitUtil.e(qjpVar.f(), 1, 2);
                }
            });
            healthRingChart.setAdapter(healthRingChartAdapter);
            d(dB2, healthRingChart);
            return;
        }
        this.d.setVisibility(8);
    }

    private void c(String str) {
        HashMap map = new HashMap();
        map.put("click", "1");
        map.put("dataType", str);
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.WEIGHT_PAGE_SLIDE_DATA_DETAIL_2160114.value(), map, 0);
    }

    private void d(double d, HealthRingChart healthRingChart) {
        HealthSubHeader healthSubHeader;
        LinearLayout linearLayout = this.d;
        if (linearLayout != null && (healthSubHeader = (HealthSubHeader) linearLayout.findViewById(R.id.base_weight_body_composition_analysis_sub_header)) != null) {
            healthSubHeader.setSubHeaderBackgroundColor(0);
        }
        if (LanguageUtil.o(this.e)) {
            healthRingChart.setDesc(this.e.getResources().getString(R.string.IDS_hw_health_show_healthdata_weight), String.valueOf(d));
        }
    }

    private void i(dnb dnbVar) {
        LinearLayout linearLayout = this.n;
        if (linearLayout == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initWeightSuggest mWeightSuggestLayout is null");
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) linearLayout.findViewById(R.id.base_weight_bottom_logo);
        if (relativeLayout == null) {
            LogUtil.j("HealthWeight_WeightCommonView", "initWeightSuggest logo Layout is null");
            return;
        }
        if (!dnbVar.isNewScaleType()) {
            if (dnbVar.o() == 133) {
                ImageView imageView = (ImageView) this.n.findViewById(R.id.img_origin_icon);
                HealthTextView healthTextView = (HealthTextView) this.n.findViewById(R.id.information_source_company);
                imageView.setVisibility(8);
                healthTextView.setText(this.e.getResources().getString(R.string.IDS_weight_chip_sea_company));
                ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
                layoutParams.height = (int) this.e.getResources().getDimension(R.dimen.hw_show_public_size_48);
                relativeLayout.setLayoutParams(layoutParams);
                relativeLayout.setVisibility(0);
                this.n.setVisibility(0);
                return;
            }
            return;
        }
        relativeLayout.setVisibility(0);
    }

    private boolean f(dnb dnbVar) {
        if (ezh.r(dnbVar.aq()) && ezh.n(dnbVar.aa()) && ezh.b(dnbVar.g()) && ezh.g(dnbVar.b())) {
            return true;
        }
        LogUtil.j("HealthWeight_WeightCommonView", "showBodyAnalysisChart invalid data in BodyAnalysisChart");
        return false;
    }

    private boolean h(dnb dnbVar) {
        if (this.f28171b || !dnbVar.isVisible(30, false)) {
            LogUtil.j("HealthWeight_WeightCommonView", "is oversea or peerComparisonVisible is false ");
            return false;
        }
        if (ezh.t(dnbVar.am()) || ezh.u(dnbVar.s()) || ezh.g(dnbVar.b()) || ezh.c(dnbVar.f(), false)) {
            return true;
        }
        LogUtil.j("HealthWeight_WeightCommonView", "showPeerComparisonChart peerComparisonChart not show");
        return false;
    }
}
