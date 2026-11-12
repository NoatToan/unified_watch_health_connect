package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vh implements com.huawei.openalliance.ad.views.interfaces.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f20715a;

    @Override // com.huawei.openalliance.ad.views.interfaces.d
    public void a(boolean z, boolean z2, String str, boolean z3) {
        hw.a("RewardViewECCL", "onCardClick, isAppRelated: %s, isHanlded: %s, destination: %s, isButtonClicked: %s", Boolean.valueOf(z), Boolean.valueOf(z2), str, Boolean.valueOf(z3));
        com.huawei.openalliance.ad.views.interfaces.b bVar = new com.huawei.openalliance.ad.views.interfaces.b(z, true, str, 20);
        if (!z) {
            this.f20715a.b(new com.huawei.openalliance.ad.views.interfaces.b(false, z2, str, 20));
        } else if ("app".equals(str)) {
            this.f20715a.b("4");
            this.f20715a.b(bVar);
            if (!z3) {
                this.f20715a.getEndCardView().e();
            }
        } else {
            PPSRewardView pPSRewardView = this.f20715a;
            if (z3) {
                pPSRewardView.b(bVar);
                this.f20715a.b("3");
            } else {
                pPSRewardView.b(new com.huawei.openalliance.ad.views.interfaces.b(true, false, str, 20));
            }
        }
        this.f20715a.setClickInfo(null);
    }

    public vh(PPSRewardView pPSRewardView) {
        this.f20715a = pPSRewardView;
    }
}
