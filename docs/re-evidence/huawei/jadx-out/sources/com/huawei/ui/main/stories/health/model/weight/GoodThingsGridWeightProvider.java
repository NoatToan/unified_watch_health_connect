package com.huawei.ui.main.stories.health.model.weight;

import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.knit.section.model.SectionBean;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider;
import defpackage.njy;
import defpackage.vyp;
import defpackage.vyw;
import defpackage.vzg;
import defpackage.vzi;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class GoodThingsGridWeightProvider extends GoodThingsGridProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f27999a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SectionWeightView f28000b;

    @Override // com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider
    public void getNetData(SectionBean sectionBean) {
        LogUtil.a("GoodThingsGridWeightProvider", "getNetData");
        b();
        vyp.c().getShoppingInfoList(buildGetShoppingInfoListReq(), new UiCallback<vyw>() { // from class: com.huawei.ui.main.stories.health.model.weight.GoodThingsGridWeightProvider.5
            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            public void onFailure(int i, String str) {
                LogUtil.a("GoodThingsGridWeightProvider", "getShoppingInfoList onFailure ", str);
            }

            @Override // com.huawei.basefitnessadvice.callback.UiCallback
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(vyw vywVar) {
                List<vzg> listD = vywVar.d();
                LogUtil.a("GoodThingsGridWeightProvider", "getShoppingInfoList success list is null ", Boolean.valueOf(njy.e(listD)));
                if (njy.e(listD)) {
                    return;
                }
                vzi vziVar = new vzi();
                vziVar.d(listD);
                GoodThingsGridWeightProvider.this.mPaginationRsp = vywVar.a();
                if (GoodThingsGridWeightProvider.this.f28000b != null) {
                    GoodThingsGridWeightProvider.this.mShowStartTime = System.currentTimeMillis();
                    GoodThingsGridWeightProvider.this.f28000b.setVisibility(0);
                    GoodThingsGridWeightProvider goodThingsGridWeightProvider = GoodThingsGridWeightProvider.this;
                    goodThingsGridWeightProvider.parseParams(goodThingsGridWeightProvider.f28000b.getContext(), GoodThingsGridWeightProvider.this.f28000b.getViewMap(), vziVar);
                    GoodThingsGridWeightProvider.this.f28000b.bindParamsToView(GoodThingsGridWeightProvider.this.f28000b.getViewMap());
                }
            }
        });
    }

    private void b() {
        LogUtil.d("GoodThingsGridWeightProvider", "preGetNetData");
        if (this.f28000b != null && isActive(null) && this.f27999a) {
            parseParams(this.f28000b.getContext(), this.f28000b.getViewMap(), new vzi());
            SectionWeightView sectionWeightView = this.f28000b;
            sectionWeightView.bindParamsToView(sectionWeightView.getViewMap());
            this.f27999a = false;
        }
    }

    @Override // com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider
    public void onNoInterestButtonClicked() {
        LogUtil.a("GoodThingsGridWeightProvider", "onNoInterstButtonClicked");
        updateButtonClickedInfo();
        MarketingBiUtils.b(this.mResPosId, this.mResourceBriefInfo, this.mShowStartTime);
        this.f28000b.setVisibility(8);
        ObserverManagerUtil.e("MARKETING_GOOD_THING_CLOSE" + this.mResourceBriefInfo.getResourceId(), new Object[0]);
    }

    @Override // com.huawei.ui.main.stories.oa.goodthingsrecommended.provider.GoodThingsGridProvider
    public void onChangeBatchButtonClicked() {
        LogUtil.a("GoodThingsGridWeightProvider", "onChangeBatchButtonClicked");
        updatePaginationRsp();
        getNetData(null);
    }
}
