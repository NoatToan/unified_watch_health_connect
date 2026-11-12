package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class ux implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IRewardAd f20699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PPSRewardView f20700b;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IRewardAd iRewardAd = this.f20699a;
        if (iRewardAd == null) {
            hw.c("RewardChoiceViewOCL", "AdInfo is null or contentData is null");
        } else if (com.huawei.openalliance.ad.utils.bm.a(iRewardAd.getCompliance())) {
            com.huawei.openalliance.ad.utils.d.a(this.f20700b.getContext(), this.f20699a);
        } else {
            ComplianceActivity.a(this.f20700b.getContext(), view, pw.a((com.huawei.openalliance.ad.inter.data.i) this.f20699a), true);
        }
    }

    public ux(PPSRewardView pPSRewardView, IRewardAd iRewardAd) {
        this.f20699a = iRewardAd;
        this.f20700b = pPSRewardView;
    }
}
