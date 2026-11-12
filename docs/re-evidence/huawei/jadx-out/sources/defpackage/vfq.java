package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.hwbasemgr.WeightBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import com.huawei.ui.main.stories.health.views.HealthBodyDetailData;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes19.dex */
public class vfq extends vfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthBodyDetailData f51035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f51036b;
    private int d;
    private double e;
    private View f;
    private byte g;
    private int h;
    private HealthTextView i;
    private HealthBodyDetailData j;
    private dnb l;
    private double o;

    public vfq(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        if (bodyReportRecycleItem != null) {
            this.l = bodyReportRecycleItem.a();
        }
    }

    @Override // defpackage.vfm
    public String d() {
        if (this.f51031c == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_report_fat_analysis);
    }

    @Override // defpackage.vfm
    public String b() {
        if (this.f51031c == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_motiontrack_show_chart_unit_string, vei.b());
    }

    @Override // defpackage.vfm
    public View e() {
        if (this.l == null) {
            LogUtil.j("BodyReportFatAnalysisView", "getDetailView() mWeightBean is null.");
            return super.e();
        }
        this.f = LayoutInflater.from(this.f51031c).inflate(R.layout.view_body_report_body_muscle_fat, (ViewGroup) null);
        c();
        f();
        if (vei.b(this.l)) {
            if (Utils.o()) {
                j();
                g();
            }
            i();
            return this.f;
        }
        return super.e();
    }

    private void i() {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser.s()) {
            c(currentUser.j());
        } else {
            MultiUsersManager.INSTANCE.getCurrentUser(new AnonymousClass1());
        }
    }

    /* JADX INFO: renamed from: vfq$1, reason: invalid class name */
    class AnonymousClass1 implements WeightBaseResponseCallback<dnj> {
        AnonymousClass1() {
        }

        @Override // com.huawei.hwbasemgr.WeightBaseResponseCallback
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onResponse(final int i, final dnj dnjVar) {
            if (vfq.this.f51031c == null || !(vfq.this.f51031c instanceof Activity)) {
                LogUtil.j("BodyReportFatAnalysisView", "mContext is null or mContext is not Activity");
            } else {
                ((Activity) vfq.this.f51031c).runOnUiThread(new Runnable() { // from class: vfo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.e.d(dnjVar, i);
                    }
                });
            }
        }

        /* synthetic */ void d(dnj dnjVar, int i) {
            if (dnjVar == null || i != 0) {
                LogUtil.j("BodyReportFatAnalysisView", "loadDataSuccess getCurrentUser: currentUser is null return");
                dnjVar = MultiUsersManager.INSTANCE.getCurrentUser();
            }
            vfq.this.c(dnjVar.j());
        }
    }

    private void c() {
        dnb dnbVar = this.l;
        if (dnbVar == null || this.f == null) {
            LogUtil.j("BodyReportFatAnalysisView", "initData WeightBean or View is null");
            return;
        }
        this.d = dnbVar.c();
        this.g = this.l.an();
        this.h = this.l.r();
        this.o = this.l.av();
        this.f51036b = this.l.b();
        double dB = exz.b(this.l.d());
        this.e = dB;
        if (dB <= 0.0d) {
            this.e = exz.c(this.f51036b, this.o);
        }
        this.e = UnitUtil.c(this.e);
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_fat, vei.b(this.e, 1));
        HealthTextView healthTextView = (HealthTextView) this.f.findViewById(R.id.base_weight_segmental);
        this.i = healthTextView;
        healthTextView.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        if (this.l == null || this.f == null) {
            LogUtil.j("BodyReportFatAnalysisView", "initSegmentalFat WeightBean or View is null");
            return;
        }
        dyh dyhVarE = e(i);
        double dC = UnitUtil.c(this.l.v());
        double dC2 = UnitUtil.c(this.l.u());
        double dC3 = UnitUtil.c(this.l.al());
        double dC4 = UnitUtil.c(this.l.ae());
        int[] iArrD = vei.d(exz.f(this.g, dyhVarE.l(), this.d), exz.f(this.g, dyhVarE.ab(), this.d), dC, dC3);
        int[] iArrD2 = vei.d(exz.e(this.g, dyhVarE.o(), this.d), exz.e(this.g, dyhVarE.ad(), this.d), dC2, dC4);
        double dE = exz.e(this.e, dC, dC2, dC3, dC4);
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(dE));
        arrayList.add(Double.valueOf(dC));
        arrayList.add(Double.valueOf(dC3));
        arrayList.add(Double.valueOf(dC2));
        arrayList.add(Double.valueOf(dC4));
        ArrayList<Integer> arrayListE = vei.e(dyhVarE, iArrD, iArrD2, this.l);
        if (Utils.o()) {
            HealthBodyDetailData healthBodyDetailData = (HealthBodyDetailData) this.f.findViewById(R.id.base_weight_segmental_body_detail_data_oversea);
            this.j = healthBodyDetailData;
            healthBodyDetailData.setBodyDetailType(0);
            vei.a(this.j, (ArrayList<Double>) arrayList, arrayListE);
            return;
        }
        HealthBodyDetailData healthBodyDetailData2 = (HealthBodyDetailData) this.f.findViewById(R.id.base_weight_segmental_body_detail_data);
        this.f51035a = healthBodyDetailData2;
        healthBodyDetailData2.setBodyDetailType(0);
        vei.a(this.f51035a, (ArrayList<Double>) arrayList, arrayListE);
    }

    private dyh e(int i) {
        if (dxm.c(this.l)) {
            return new dyh(this.h, (float) this.o, this.g, this.d, i, 8, this.l.ai(), 2, this.l.t());
        }
        return new dyh(this.h, (float) this.o, this.g, this.d, i, this.l.ai());
    }

    private void f() {
        dnb dnbVar = this.l;
        if (dnbVar == null || this.f == null) {
            LogUtil.j("BodyReportFatAnalysisView", "initResult WeightBean or View is null");
            return;
        }
        int iC = exz.c(this.g, this.d, this.f51036b, dnbVar.o());
        if (iC >= 3) {
            iC = 3;
        }
        HealthTextView healthTextView = (HealthTextView) this.f.findViewById(R.id.base_weight_segmental_type);
        healthTextView.setText(vcz.m(0, iC));
        healthTextView.setTextColor(vdc.e(iC));
        int iM = (int) this.l.m();
        ((HealthTextView) this.f.findViewById(R.id.base_weight_segmental_result_title)).setText(BaseApplication.getContext().getResources().getString(R.string.IDS_weight_fat_balance_results_content, vcz.i(iM)));
        ((HealthTextView) this.f.findViewById(R.id.base_weight_segmental_result_content)).setText(vcz.j(iM));
    }

    private void g() {
        if (this.i.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams.setMargins(0, vdo.b(BaseApplication.getContext(), 27.0f), 0, 0);
            this.i.setLayoutParams(layoutParams);
            this.i.setTextSize(1, 10.0f);
        }
    }

    private void j() {
        View view = this.f;
        if (view == null) {
            LogUtil.j("BodyReportFatAnalysisView", "setEvaluationIndexGoneInOversea view is null");
            return;
        }
        view.findViewById(R.id.base_weight_segmental_type).setVisibility(8);
        this.f.findViewById(R.id.base_weight_segmental_include_body_standard_horizontal).setVisibility(8);
        this.f.findViewById(R.id.base_weight_segmental_result_title).setVisibility(8);
        this.f.findViewById(R.id.base_weight_segmental_result_content).setVisibility(8);
        this.f.findViewById(R.id.base_weight_segmental_body_detail_data).setVisibility(8);
        this.f.findViewById(R.id.base_weight_segmental_body_detail_data_oversea).setVisibility(0);
    }
}
