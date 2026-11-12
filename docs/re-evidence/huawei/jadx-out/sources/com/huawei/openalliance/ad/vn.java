package com.huawei.openalliance.ad;

import android.view.View;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes41.dex */
public class vn implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21472a;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (R.id.reward_close == view.getId()) {
            this.f21472a.d(true);
        } else if (R.id.reward_mute_icon == view.getId()) {
            this.f21472a.i();
        }
    }

    public vn(PPSRewardView pPSRewardView) {
        this.f21472a = pPSRewardView;
    }
}
