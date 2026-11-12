package com.huawei.openalliance.ad;

import android.content.DialogInterface;
import com.huawei.openalliance.ad.views.PPSRewardView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class uv implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<PPSRewardView> f20697a;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        PPSRewardView pPSRewardView = this.f20697a.get();
        if (pPSRewardView != null) {
            pPSRewardView.resumeView();
            pPSRewardView.a("130");
            pPSRewardView.setAdDialog(null);
        }
    }

    public uv(PPSRewardView pPSRewardView) {
        this.f20697a = new WeakReference<>(pPSRewardView);
    }
}
