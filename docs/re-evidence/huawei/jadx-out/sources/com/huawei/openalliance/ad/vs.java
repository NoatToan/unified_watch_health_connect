package com.huawei.openalliance.ad;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vs implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21481a;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        this.f21481a.q();
    }

    public vs(PPSRewardView pPSRewardView) {
        this.f21481a = pPSRewardView;
    }
}
