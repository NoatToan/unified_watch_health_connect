package com.huawei.ui.main.stories.template.health.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.health.marketing.api.MarketingApi;
import com.huawei.health.marketing.datatype.MarketingOption;
import com.huawei.health.marketing.datatype.ResourceResultInfo;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.template.BaseComponent;
import com.huawei.ui.main.stories.template.health.config.HealthCommonExpandViewConfig;
import com.huawei.ui.main.stories.template.health.config.HealthNoDeviceConfig;
import defpackage.dlo;
import defpackage.vdj;
import defpackage.wqo;
import health.compact.a.Services;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class NoDataViewContainer extends BaseNoDataView {
    private static final String TAG = "Main_NoDataViewContainer";
    private SparseArray<NoDataBuyDeviceView> mBuyDeviceLayoutArray;
    private LinearLayout mContainerLayout;
    private NoDataBuyDeviceView mDefBuyDeviceLayout;
    private NoDataNewsView mDefInfoLayout;
    private NoDataServiceView mDefServicesLayout;
    private HealthNoDeviceConfig mHealthNoDeviceConfig;
    private SparseArray<NoDataNewsView> mInfoLayoutArray;
    private boolean mIsNeedShowBuyDeviceView;
    private boolean mIsNeedShowInformationView;
    private boolean mIsNeedShowServiceView;
    private List<dlo> mModuleObjectList;
    private SparseArray<NoDataServiceView> mServicesLayoutArray;

    public NoDataViewContainer(Context context) {
        this(context, null);
    }

    public NoDataViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoDataViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBuyDeviceLayoutArray = new SparseArray<>();
        this.mServicesLayoutArray = new SparseArray<>();
        this.mInfoLayoutArray = new SparseArray<>();
        LayoutInflater.from(context).inflate(R.layout.layout_no_data_container, this);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mContainerLayout = (LinearLayout) findViewById(R.id.layout_health_container);
    }

    public void setConfigInfo(HealthNoDeviceConfig healthNoDeviceConfig, boolean z) {
        this.mHealthNoDeviceConfig = healthNoDeviceConfig;
        if (healthNoDeviceConfig == null) {
            LogUtil.j(TAG, "setConfigInfo healthNoDeviceConfig is null");
            return;
        }
        this.mDefServicesLayout = (NoDataServiceView) getExpandedView(healthNoDeviceConfig.getServiceViewConfig());
        this.mDefInfoLayout = (NoDataNewsView) getExpandedView(this.mHealthNoDeviceConfig.getInfoViewConfig());
        if (!z) {
            this.mDefBuyDeviceLayout = (NoDataBuyDeviceView) getExpandedView(this.mHealthNoDeviceConfig.getBuyDeviceViewConfig());
        }
        setComponentInfo(z);
    }

    private void setComponentInfo(boolean z) {
        if (this.mDefBuyDeviceLayout != null && !z) {
            this.mIsNeedShowBuyDeviceView = true;
        }
        if (this.mDefServicesLayout != null) {
            this.mIsNeedShowServiceView = true;
        }
        if (this.mDefInfoLayout != null) {
            this.mIsNeedShowInformationView = true;
        }
    }

    private void setGuideBuyInfo(dlo dloVar) {
        if (!this.mIsNeedShowBuyDeviceView) {
            LogUtil.a(TAG, "setGuideBuyInfo config file do not show BuyDeviceView");
            return;
        }
        if (this.mHealthNoDeviceConfig == null) {
            LogUtil.j(TAG, "setGuideBuyInfo healthNoDeviceConfig is null");
            return;
        }
        if (dloVar == null) {
            LogUtil.j(TAG, "setGuideBuyInfo guideBuyData is null");
            return;
        }
        NoDataBuyDeviceView noDataBuyDeviceView = this.mDefBuyDeviceLayout;
        if (noDataBuyDeviceView != null) {
            this.mContainerLayout.removeView(noDataBuyDeviceView);
            this.mDefBuyDeviceLayout = null;
        }
        int iH = dloVar.h();
        LogUtil.d(TAG, "setGuideBuyInfo: pageModuleId :", Integer.valueOf(iH));
        NoDataBuyDeviceView noDataBuyDeviceView2 = this.mBuyDeviceLayoutArray.get(iH);
        if (noDataBuyDeviceView2 != null) {
            this.mContainerLayout.removeView(noDataBuyDeviceView2);
            this.mBuyDeviceLayoutArray.remove(iH);
        }
        NoDataBuyDeviceView noDataBuyDeviceView3 = (NoDataBuyDeviceView) getExpandedView(this.mHealthNoDeviceConfig.getBuyDeviceViewConfig());
        LogUtil.d(TAG, "setGuideBuyInfo: buyDeviceLayout : ", noDataBuyDeviceView3);
        if (noDataBuyDeviceView3 != null) {
            noDataBuyDeviceView3.setUiData(dloVar);
            this.mContainerLayout.addView(noDataBuyDeviceView3);
            this.mBuyDeviceLayoutArray.put(iH, noDataBuyDeviceView3);
        }
    }

    private void setServicesUiData(dlo dloVar) {
        if (!this.mIsNeedShowServiceView) {
            LogUtil.a(TAG, "setServicesUiData config file do not show ServiceView");
            return;
        }
        if (this.mHealthNoDeviceConfig == null) {
            LogUtil.j(TAG, "setServicesUiData healthNoDeviceConfig is null");
            return;
        }
        if (dloVar == null) {
            LogUtil.j(TAG, "setServicesUiData servicesUiData is null");
            return;
        }
        NoDataServiceView noDataServiceView = this.mDefServicesLayout;
        if (noDataServiceView != null) {
            this.mContainerLayout.removeView(noDataServiceView);
            this.mDefServicesLayout = null;
        }
        int iH = dloVar.h();
        LogUtil.d(TAG, "setServicesUiData: pageModuleId :", Integer.valueOf(iH));
        NoDataServiceView noDataServiceView2 = this.mServicesLayoutArray.get(iH);
        if (noDataServiceView2 != null) {
            this.mContainerLayout.removeView(noDataServiceView2);
            this.mServicesLayoutArray.remove(iH);
        }
        NoDataServiceView noDataServiceView3 = (NoDataServiceView) getExpandedView(this.mHealthNoDeviceConfig.getServiceViewConfig());
        if (noDataServiceView3 != null) {
            noDataServiceView3.setUiData(dloVar);
            this.mContainerLayout.addView(noDataServiceView3);
            this.mServicesLayoutArray.put(iH, noDataServiceView3);
        }
    }

    private void setNewsUiData(dlo dloVar) {
        if (!this.mIsNeedShowInformationView) {
            LogUtil.a(TAG, "setNewsUiData config file do not show InformationView");
            return;
        }
        if (this.mHealthNoDeviceConfig == null) {
            LogUtil.j(TAG, "setNewsUiData healthNoDeviceConfig is null");
            return;
        }
        if (dloVar == null) {
            LogUtil.j(TAG, "setNewsUiData newsUiData is null");
            return;
        }
        NoDataNewsView noDataNewsView = this.mDefInfoLayout;
        if (noDataNewsView != null) {
            this.mContainerLayout.removeView(noDataNewsView);
            this.mDefInfoLayout = null;
        }
        int iH = dloVar.h();
        LogUtil.d(TAG, "setNewsUiData: pageModuleId :", Integer.valueOf(iH));
        NoDataNewsView noDataNewsView2 = this.mInfoLayoutArray.get(iH);
        if (noDataNewsView2 != null) {
            this.mContainerLayout.removeView(noDataNewsView2);
            this.mInfoLayoutArray.remove(iH);
        }
        NoDataNewsView noDataNewsView3 = (NoDataNewsView) getExpandedView(this.mHealthNoDeviceConfig.getInfoViewConfig());
        if (noDataNewsView3 != null) {
            noDataNewsView3.setUiData(dloVar);
            this.mContainerLayout.addView(noDataNewsView3);
            this.mInfoLayoutArray.put(iH, noDataNewsView3);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    public void setMarketingResource(Context context, String str) {
        str.hashCode();
        switch (str) {
            case "BloodOxygenCardConstructor":
                initMarketingResource(context, 380, 4029);
                break;
            case "StressCardConstructor":
                initMarketingGrid(context, 4030);
                break;
            case "SleepCardConstructor":
                initSleepMarketingResource(context);
                break;
            case "BloodSugarCardConstructor":
                initMarketingResource(context, 350, 4033);
                break;
            case "HeartRateConstructor":
                initMarketingGrid(context, 4028);
                break;
            case "BloodPressureCardConstructor":
                initMarketingGrid(context, 4034);
                break;
            case "BodyTemperatureCardConstructor":
                initMarketingResource(context, 370, 4035);
                break;
            default:
                LogUtil.d(TAG, "No serviceId match for trigger marketing resource. ServiceId: ", str);
                break;
        }
    }

    private void initMarketingGrid(final Context context, int i) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.getResourceResultInfo(i).addOnSuccessListener(new OnSuccessListener() { // from class: wqj
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f52349a.m1765x23b1d25d(marketingApi, context, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initMarketingGrid$0$com-huawei-ui-main-stories-template-health-view-NoDataViewContainer, reason: not valid java name */
    public /* synthetic */ void m1765x23b1d25d(MarketingApi marketingApi, Context context, Map map) {
        Iterator<View> it = marketingApi.getMarketingViewList(context, marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map)).iterator();
        while (it.hasNext()) {
            this.mContainerLayout.addView(it.next());
        }
    }

    private void initMarketingResource(Context context, int i, int i2) {
        MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(context).setPageId(i).setLayoutMap(setLayoutMap(i2)).build());
        }
    }

    private Map<Integer, LinearLayout> setLayoutMap(int i) {
        HashMap map = new HashMap();
        map.put(Integer.valueOf(i), this.mContainerLayout);
        return map;
    }

    private void initSleepMarketingResource(final Context context) {
        final MarketingApi marketingApi = (MarketingApi) Services.d("FeatureMarketing", MarketingApi.class);
        if (marketingApi != null) {
            marketingApi.requestMarketingResource(new MarketingOption.Builder().setContext(context).setPageId(310).build());
            marketingApi.getResourceResultInfo(4031).addOnSuccessListener(new OnSuccessListener() { // from class: wqk
                @Override // com.huawei.hmf.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    this.f52353b.m1766x78046449(marketingApi, context, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: lambda$initSleepMarketingResource$1$com-huawei-ui-main-stories-template-health-view-NoDataViewContainer, reason: not valid java name */
    public /* synthetic */ void m1766x78046449(MarketingApi marketingApi, Context context, Map map) {
        refreshMarketingLayout(marketingApi.getMarketingViewList(context, marketingApi.filterMarketingRules((Map<Integer, ResourceResultInfo>) map)), null);
    }

    public void refreshMarketingLayout(List<View> list, List<Integer> list2) {
        vdj.b(this.mContainerLayout, list, list2);
    }

    public void setAllViewData(List<dlo> list) {
        this.mModuleObjectList = list;
        if (list == null) {
            LogUtil.j(TAG, "setAllViewData moduleObjectList is null");
            return;
        }
        for (dlo dloVar : list) {
            if (dloVar != null) {
                int iA = dloVar.a();
                if (iA == 1) {
                    setServicesUiData(dloVar);
                } else if (iA != 4) {
                    LogUtil.j(TAG, "setAllViewData unSupport moduleType", Integer.valueOf(iA));
                } else {
                    setBuyOrNews(dloVar);
                }
            }
        }
    }

    private void setBuyOrNews(dlo dloVar) {
        if (dloVar == null) {
            LogUtil.j(TAG, "setBuyOrNews moduleObject is null");
        } else if (dloVar.c() == 11) {
            setGuideBuyInfo(dloVar);
        } else {
            setNewsUiData(dloVar);
        }
    }

    public void refreshTahiti() {
        setAllViewData(this.mModuleObjectList);
    }

    private <T extends BaseNoDataView> T getExpandedView(HealthCommonExpandViewConfig healthCommonExpandViewConfig) {
        if (healthCommonExpandViewConfig == null) {
            return null;
        }
        String newComponent = healthCommonExpandViewConfig.getNewComponent();
        LogUtil.d(TAG, "component value", newComponent);
        if (TextUtils.isEmpty(newComponent)) {
            return null;
        }
        BaseComponent baseComponentD = wqo.d(newComponent, getContext());
        if (baseComponentD == null) {
            LogUtil.j(TAG, "baseComponent is null");
        }
        if (healthCommonExpandViewConfig.getParams() == null) {
            LogUtil.j(TAG, "config getparam is null");
        } else {
            LogUtil.j(TAG, "config getparam is not null");
            if (baseComponentD != null) {
                baseComponentD.initComponent(healthCommonExpandViewConfig.getParams());
            }
        }
        if (((BaseNoDataView) baseComponentD) != null) {
            return (T) baseComponentD.getView(getContext());
        }
        return null;
    }
}
