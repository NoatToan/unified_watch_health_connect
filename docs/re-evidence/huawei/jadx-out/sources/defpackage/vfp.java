package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
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
public class vfp extends vfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthBodyDetailData f51033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f51034b;
    private HealthTextView d;
    private HealthBodyDetailData e;
    private HealthTextView f;
    private dnb h;
    private HealthTextView j;

    public vfp(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        if (bodyReportRecycleItem == null) {
            LogUtil.j("BodyReportMuscleAnalysisView", "BodyReportMuscleAnalysisView() data is null.");
        } else {
            this.h = bodyReportRecycleItem.a();
        }
    }

    @Override // defpackage.vfm
    public String d() {
        if (this.f51031c == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_hw_weight_report_muscle_analysis);
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
        if (this.h == null) {
            LogUtil.j("BodyReportMuscleAnalysisView", "getDetailView() mWeightBean is null.");
            return super.e();
        }
        View viewInflate = LayoutInflater.from(this.f51031c).inflate(R.layout.view_body_report_body_muscle_fat, (ViewGroup) null);
        this.e = (HealthBodyDetailData) viewInflate.findViewById(R.id.base_weight_segmental_body_detail_data);
        this.f51033a = (HealthBodyDetailData) viewInflate.findViewById(R.id.base_weight_segmental_body_detail_data_oversea);
        this.f = (HealthTextView) viewInflate.findViewById(R.id.base_weight_segmental);
        this.j = (HealthTextView) viewInflate.findViewById(R.id.base_weight_segmental_type);
        this.f51034b = (HealthTextView) viewInflate.findViewById(R.id.base_weight_segmental_result_title);
        this.d = (HealthTextView) viewInflate.findViewById(R.id.base_weight_segmental_result_content);
        if (vei.e(this.h)) {
            if (Utils.o()) {
                e(viewInflate);
                c();
            } else {
                this.f51033a.setVisibility(8);
                this.e.setVisibility(0);
            }
            e(this.h);
            a(this.h);
            return viewInflate;
        }
        return super.e();
    }

    private void e(dnb dnbVar) {
        this.f.setText(BaseApplication.getContext().getResources().getString(R.string.IDS_hwh_home_skeletal_muscle, vei.b(UnitUtil.b(dnbVar.am(), 1), 1)));
    }

    private void a(dnb dnbVar) {
        double dC = UnitUtil.c(dnbVar.w());
        double dC2 = UnitUtil.c(dnbVar.y());
        double dC3 = UnitUtil.c(dnbVar.aj());
        double dC4 = UnitUtil.c(dnbVar.ah());
        double d = exz.d(UnitUtil.c(dnbVar.am()), dC, dC2, dC3, dC4);
        if (Utils.o()) {
            this.f51033a.setBodyDetailType(1);
        } else {
            this.e.setBodyDetailType(1);
        }
        ArrayList arrayList = new ArrayList(5);
        arrayList.add(Double.valueOf(d));
        arrayList.add(Double.valueOf(dC));
        arrayList.add(Double.valueOf(dC3));
        arrayList.add(Double.valueOf(dC2));
        arrayList.add(Double.valueOf(dC4));
        ArrayList<Integer> arrayListA = vei.a(dnbVar);
        if (Utils.o()) {
            vei.a(this.f51033a, (ArrayList<Double>) arrayList, arrayListA);
        } else {
            vei.a(this.e, (ArrayList<Double>) arrayList, arrayListA);
        }
        d(dnbVar);
    }

    private void d(dnb dnbVar) {
        int iE = exz.e(dnbVar.an(), dnbVar.c(), dnbVar.r(), dnbVar.am(), dnbVar.o());
        int iE2 = vdc.e(iE);
        this.j.setText(vcz.m(0, iE));
        this.j.setTextColor(iE2);
        this.f51034b.setText(BaseApplication.getContext().getString(R.string.IDS_weight_skeletal_muscle_balance_results, vcz.f((int) dnbVar.ab())));
        this.d.setText(vcz.h((int) dnbVar.ab()) + System.lineSeparator() + vcz.m((int) dnbVar.ab()));
    }

    private void c() {
        if (this.f.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.setMargins(0, vdo.b(BaseApplication.getContext(), 27.0f), 0, 0);
            this.f.setLayoutParams(layoutParams);
            this.f.setTextSize(1, 10.0f);
        }
    }

    private void e(View view) {
        if (view == null) {
            LogUtil.j("BodyReportMuscleAnalysisView", "setEvaluationIndexInvisibleInOversea view is null");
            return;
        }
        this.j.setVisibility(8);
        this.f51034b.setVisibility(8);
        this.d.setVisibility(8);
        this.e.setVisibility(8);
        this.f51033a.setVisibility(0);
        view.findViewById(R.id.base_weight_segmental_include_body_standard_horizontal).setVisibility(8);
    }
}
