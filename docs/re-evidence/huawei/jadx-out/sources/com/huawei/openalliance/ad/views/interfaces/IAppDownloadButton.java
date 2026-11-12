package com.huawei.openalliance.ad.views.interfaces;

import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.js;
import com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.AppDownloadButtonStyle;
import com.huawei.openalliance.ad.views.PPSAppDetailView;

/* JADX INFO: loaded from: classes12.dex */
public interface IAppDownloadButton extends js {
    void cancel();

    AppStatus refreshStatus();

    void refreshStatusAsync(AppDownloadButton.OnStatusRefreshedListener onStatusRefreshedListener);

    void setAdLandingPageData(AdLandingPageData adLandingPageData);

    void setAppDetailView(PPSAppDetailView pPSAppDetailView);

    void setAppDownloadButtonStyle(AppDownloadButtonStyle appDownloadButtonStyle);

    void setHandleUrlCallBack(HandleUrlCallBack handleUrlCallBack);

    boolean setNativeAd(INativeAd iNativeAd);

    boolean setPlacementAd(IPlacementAd iPlacementAd);

    void setPpsLinkedView(IPPSLinkedView iPPSLinkedView);

    void setPpsNativeView(IPPSNativeView iPPSNativeView);

    void setPpsPlacementView(IPPSPlacementView iPPSPlacementView);

    void updateContent(String str);

    void updateStartShowTime(long j);
}
