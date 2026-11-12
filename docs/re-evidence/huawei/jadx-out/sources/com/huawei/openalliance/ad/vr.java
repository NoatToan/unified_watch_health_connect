package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vr implements com.huawei.openalliance.ad.views.interfaces.aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21480a;

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void c() {
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void b() {
        this.f21480a.c("129");
        AppDownloadButton appDownloadButton = this.f21480a.getAppDetailView().getAppDownloadButton();
        if (appDownloadButton != null) {
            appDownloadButton.f();
        }
        this.f21480a.o();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void a() {
        AppDownloadButton appDownloadButton = this.f21480a.getAppDetailView().getAppDownloadButton();
        this.f21480a.c("128");
        if (appDownloadButton != null) {
            appDownloadButton.a(this.f21480a.getWebPopUpView().getClickInfo());
            appDownloadButton.setSource(5);
            appDownloadButton.performClick();
        }
        this.f21480a.o();
    }

    public vr(PPSRewardView pPSRewardView) {
        this.f21480a = pPSRewardView;
    }
}
