package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import com.huawei.ui.main.stories.health.views.HealthBodyRingData;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;

/* JADX INFO: loaded from: classes19.dex */
public class vfr extends vfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dnb f51038a;

    public vfr(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        if (bodyReportRecycleItem == null) {
            LogUtil.j("BodyReportBodyCompositionView", "BodyReportBodyCompositionView data is null");
        } else {
            this.f51038a = bodyReportRecycleItem.a();
        }
    }

    private float[] c() {
        double dAq = this.f51038a.aq();
        if (!ezh.r(dAq)) {
            dAq = this.f51038a.ak();
        }
        double dB = this.f51038a.b();
        int fractionDigitByType = this.f51038a.getFractionDigitByType(0);
        double dAv = this.f51038a.av();
        double dC = exz.c(dB, dAv);
        double dE = exz.e(dAq, dAv);
        double dB2 = UnitUtil.b(dAv, fractionDigitByType);
        double dB3 = UnitUtil.b(dC, 2);
        double dB4 = UnitUtil.b(dE, 2);
        double dB5 = UnitUtil.b(this.f51038a.g(), 2);
        return new float[]{(float) dB4, (float) UnitUtil.d(((dB2 - dB4) - dB3) - dB5, 2), (float) dB3, (float) dB5};
    }

    @Override // defpackage.vfm
    public String d() {
        if (this.f51031c == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_weight_body_composition_analysis);
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
        View viewInflate;
        if (this.f51038a == null) {
            LogUtil.j("BodyReportBodyCompositionView", "getDetailView WeightBean is null");
            return super.e();
        }
        if (Utils.o()) {
            viewInflate = LayoutInflater.from(this.f51031c).inflate(R.layout.view_body_oversea_report_body_composition, (ViewGroup) null);
        } else {
            viewInflate = LayoutInflater.from(this.f51031c).inflate(R.layout.view_body_report_body_composition, (ViewGroup) null);
        }
        ((HealthBodyRingData) viewInflate.findViewById(R.id.health_body_ring_data)).setBodyCircleViewData(c(), UnitUtil.c(this.f51038a.av()), 2);
        return viewInflate;
    }
}
