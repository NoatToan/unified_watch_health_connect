package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.views.PPSRewardView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class uw implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<PPSRewardView> f20698a;

    @Override // java.lang.Runnable
    public void run() {
        PPSRewardView pPSRewardView = this.f20698a.get();
        if (pPSRewardView == null) {
            return;
        }
        pPSRewardView.c(false);
    }

    public uw(PPSRewardView pPSRewardView) {
        this.f20698a = new WeakReference<>(pPSRewardView);
    }
}
