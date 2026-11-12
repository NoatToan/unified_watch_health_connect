package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vi implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f20716a;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f20716a.l();
    }

    public vi(PPSRewardView pPSRewardView) {
        this.f20716a = pPSRewardView;
    }
}
