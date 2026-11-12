package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.DialogClickType;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vq implements com.huawei.openalliance.ad.views.interfaces.aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PPSRewardView f21479b;

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void c() {
        hw.b("RewardViewPUCL", "popUpView, non button area clicked, is clickable: %s", Boolean.valueOf(this.f21478a));
        if (this.f21478a) {
            PPSRewardView pPSRewardView = this.f21479b;
            pPSRewardView.a(pPSRewardView.getPopUpView().getClickInfo());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void b() {
        this.f21479b.a("129");
        this.f21479b.a(true, "cancel");
        AppDownloadButton appDownloadButton = this.f21479b.getAppDetailView().getAppDownloadButton();
        if (appDownloadButton != null) {
            appDownloadButton.f();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void a() {
        AppDownloadButton appDownloadButton = this.f21479b.getAppDetailView().getAppDownloadButton();
        if (appDownloadButton != null) {
            appDownloadButton.a(this.f21479b.getPopUpView().getClickInfo());
            appDownloadButton.setNeedShowConfirmDialog(false);
            appDownloadButton.setSource(16);
            appDownloadButton.performClick();
            this.f21479b.a("128");
        }
        this.f21479b.a(true, DialogClickType.POP_UP);
    }

    public vq(PPSRewardView pPSRewardView, boolean z) {
        this.f21478a = z;
        this.f21479b = pPSRewardView;
    }
}
