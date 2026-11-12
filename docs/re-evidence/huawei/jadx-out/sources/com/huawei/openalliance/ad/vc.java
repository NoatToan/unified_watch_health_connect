package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.DialogClickType;
import com.huawei.openalliance.ad.views.AppDownloadButton;

/* JADX INFO: loaded from: classes12.dex */
public class vc implements com.huawei.openalliance.ad.views.interfaces.aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.openalliance.ad.views.interfaces.j f20709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20710b;

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void c() {
        com.huawei.openalliance.ad.views.u popUpView;
        hw.b("RewardTPopListener", "onNonBtnAreaClick, is clickable: %s", Boolean.valueOf(this.f20710b));
        if (this.f20710b && (popUpView = this.f20709a.getPopUpView()) != null) {
            this.f20709a.a((Integer) 1);
            this.f20709a.a(21, popUpView.getClickInfo());
            this.f20709a.a(false, DialogClickType.NO_BUTTON_AREA);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void b() {
        hw.b("RewardTPopListener", "onCancelClick");
        this.f20709a.a("129");
        this.f20709a.a(true, "cancel");
        AppDownloadButton appDownloadButton = this.f20709a.getAppDownloadButton();
        if (appDownloadButton != null) {
            appDownloadButton.f();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.aa
    public void a() {
        hw.b("RewardTPopListener", "onPopUpClick");
        this.f20709a.d();
        this.f20709a.a(true, DialogClickType.POP_UP);
        this.f20709a.a("128");
    }

    public vc(com.huawei.openalliance.ad.views.interfaces.j jVar, boolean z) {
        this.f20709a = jVar;
        this.f20710b = z;
    }
}
