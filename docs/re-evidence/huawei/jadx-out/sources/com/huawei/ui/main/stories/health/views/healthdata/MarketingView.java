package com.huawei.ui.main.stories.health.views.healthdata;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.Services;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class MarketingView extends LinearLayout {
    public MarketingView(Context context) {
        super(context);
    }

    public MarketingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarketingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b(int i) {
        LogUtil.a("MarketingView", "init marketing layout, positionId is ", Integer.valueOf(i));
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi == null) {
            LogUtil.e("MarketingView", "marketing api is null return");
        } else {
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: vff
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f51027b.e(marketingApi, (Map) obj);
                }
            });
        }
    }

    public /* synthetic */ void e(MarketingApi marketingApi, Map map) {
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
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            addView(it.next());
        }
    }
}
