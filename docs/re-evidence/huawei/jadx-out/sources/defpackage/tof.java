package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeVipHolder;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class tof extends WearHomeBaseCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WearHomeVipHolder f49428a;

    public tof(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.mContext = context;
        this.mActivity = wearHomeOldActivity;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.f49428a = new WearHomeVipHolder(layoutInflater.inflate(R.layout.wear_home_vip_layout, viewGroup, false));
        b();
        return this.f49428a;
    }

    private void b() {
        LogUtil.a("WearHomeVipCard", "initVipMarketing");
        final MarketingApi marketingApi = (MarketingApi) Services.b("FeatureMarketing", MarketingApi.class);
        this.f49428a.d().removeAllViews();
        marketingApi.getResourceResultInfo(4087).addOnSuccessListener(new OnSuccessListener() { // from class: toc
            @Override // com.huawei.hmf.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                this.f49417a.a(marketingApi, (Map) obj);
            }
        });
    }

    /* synthetic */ void a(MarketingApi marketingApi, Map map) {
        List<View> marketingViewList = marketingApi.getMarketingViewList(this.mContext, marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map));
        ReleaseLogUtil.d("R_WearHomeVipCard", "viewList.size = ", Integer.valueOf(marketingViewList.size()));
        if (njy.e(marketingViewList)) {
            this.f49428a.d().setVisibility(8);
            return;
        }
        this.f49428a.d().setVisibility(0);
        Iterator<View> it = marketingViewList.iterator();
        while (it.hasNext()) {
            this.f49428a.d().addView(it.next());
        }
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        LogUtil.a("WearHomeVipCard", "deviceConnectionChange");
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        LogUtil.a("WearHomeVipCard", BaseDialog.LIFE_CYCLE_ON_RESUME);
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        LogUtil.a("WearHomeVipCard", "onDestroy");
    }
}
