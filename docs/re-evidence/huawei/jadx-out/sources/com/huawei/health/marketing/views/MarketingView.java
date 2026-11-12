package com.huawei.health.marketing.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class MarketingView extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IBaseResponseCallback f8347c;

    public MarketingView(Context context) {
        super(context);
    }

    public MarketingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarketingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void d(int i) {
        LogUtil.a("MarketingView", "init marketing layout");
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.e("MarketingView", "marketing api is null return");
        } else {
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: fzp
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.e.c(marketingApi, (Map) obj);
                }
            });
        }
    }

    public /* synthetic */ void c(MarketingApi marketingApi, Map map) {
        removeAllViews();
        Map<Integer, ResourceResultInfo> mapFilterMarketingRules = marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map);
        if (mapFilterMarketingRules == null) {
            LogUtil.e("MarketingView", "filter result is null return");
            return;
        }
        List<View> marketingViewList = marketingApi.getMarketingViewList(getContext(), mapFilterMarketingRules);
        if (marketingViewList == null) {
            LogUtil.e("MarketingView", "view list is null");
            return;
        }
        for (View view : marketingViewList) {
            LogUtil.a("MarketingView", "add view success");
            addView(view);
        }
        IBaseResponseCallback iBaseResponseCallback = this.f8347c;
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(0, "");
        }
    }

    public void setInvalidateCallback(IBaseResponseCallback iBaseResponseCallback) {
        this.f8347c = iBaseResponseCallback;
    }
}
