package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.health.interactors.healthdata.BodyReportRecycleItem;
import com.huawei.ui.main.stories.health.views.HealthBodyBarData;

/* JADX INFO: loaded from: classes19.dex */
public class vfu extends vfm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private dnb f51043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f51044b;

    public vfu(Context context, BodyReportRecycleItem bodyReportRecycleItem) {
        super(context, bodyReportRecycleItem);
        if (bodyReportRecycleItem == null) {
            LogUtil.j("BodyReportPeerComparisonView", "BodyReportPeerComparisonView data is null");
            return;
        }
        dnb dnbVarA = bodyReportRecycleItem.a();
        this.f51043a = dnbVarA;
        if (dnbVarA == null) {
            LogUtil.j("BodyReportPeerComparisonView", "BodyReportPeerComparisonView mWeightBean is null");
        }
    }

    @Override // defpackage.vfm
    public String d() {
        if (this.f51031c == null) {
            return super.d();
        }
        return BaseApplication.getContext().getResources().getString(R.string.IDS_weight_peer_comparison);
    }

    @Override // defpackage.vfm
    public View e() {
        if (this.f51031c == null) {
            return super.e();
        }
        this.f51044b = LayoutInflater.from(this.f51031c).inflate(R.layout.view_body_report_peer_comparison, (ViewGroup) null);
        c();
        return this.f51044b;
    }

    private void c() {
        HealthBodyBarData healthBodyBarData = (HealthBodyBarData) this.f51044b.findViewById(R.id.health_body_bar_data);
        if (this.f51031c == null) {
            LogUtil.j("BodyReportPeerComparisonView", "setBodyBarData Context is null");
        } else if (this.f51043a == null) {
            LogUtil.j("BodyReportPeerComparisonView", "setBodyBarData WeightBean is null");
        } else {
            vdh.d(this.f51031c, this.f51043a, healthBodyBarData);
        }
    }
}
