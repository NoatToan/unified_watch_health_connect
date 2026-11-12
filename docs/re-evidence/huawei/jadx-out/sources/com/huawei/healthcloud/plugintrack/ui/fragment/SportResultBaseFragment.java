package com.huawei.healthcloud.plugintrack.ui.fragment;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackDetailActivity;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseFragment;
import defpackage.jqp;
import defpackage.njy;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SportResultBaseFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f11098a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected jqp f11099c = null;
    protected View e;

    protected int c() {
        return 4155;
    }

    protected String d() {
        return "Track_SportResultBaseFragment";
    }

    protected void h() {
        int iC;
        if (l() && (iC = c()) != -1) {
            final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
            Task<Map<Integer, ResourceResultInfo>> resourceResultInfo = marketingApi.getResourceResultInfo(iC);
            resourceResultInfo.addOnSuccessListener(new OnSuccessListener() { // from class: joo
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.d.c(marketingApi, (Map) obj);
                }
            });
            resourceResultInfo.addOnFailureListener(new OnFailureListener() { // from class: jom
                @Override // com.huawei.hmf.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    this.f38772b.e(exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(MarketingApi marketingApi, Map map) {
        LinearLayout linearLayout = (LinearLayout) this.e.findViewById(R.id.layout_marketing);
        List<View> marketingViewList = marketingApi.getMarketingViewList(getContext(), marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map));
        if (njy.e(marketingViewList)) {
            return;
        }
        linearLayout.setVisibility(0);
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            linearLayout.addView(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(Exception exc) {
        LogUtil.e(d(), "initMarketing onFailure ", exc == null ? "" : exc.getMessage());
    }

    protected boolean i() {
        if (getActivity() instanceof TrackDetailActivity) {
            return false;
        }
        ReleaseLogUtil.a("Track_SportResultBaseFragment", "activity type error");
        return true;
    }

    protected void g() {
        this.f11099c = ((TrackDetailActivity) getActivity()).c();
        this.f11098a = getActivity();
    }

    protected boolean l() {
        jqp jqpVar = this.f11099c;
        return (jqpVar == null || jqpVar.d() == null) ? false : true;
    }

    protected boolean j() {
        jqp jqpVar = this.f11099c;
        return (jqpVar == null || jqpVar.b() == null) ? false : true;
    }
}
