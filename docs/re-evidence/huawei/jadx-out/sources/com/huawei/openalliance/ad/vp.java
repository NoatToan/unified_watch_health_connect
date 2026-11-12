package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.constant.StatusChangeMethods;
import com.huawei.openalliance.ad.download.app.AppDownloadTask;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes41.dex */
public class vp implements com.huawei.openalliance.ad.download.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21477a;

    @Override // com.huawei.openalliance.ad.download.k
    public void a(String str, int i) {
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void b(String str) {
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void c(String str) {
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void b(AppDownloadTask appDownloadTask) {
        hw.b("RewardViewOSCL", StatusChangeMethods.STATUS_CHANGE);
        if (appDownloadTask != null) {
            com.huawei.openalliance.ad.download.e eVarI = appDownloadTask.i();
            hw.b("RewardViewOSCL", "status:" + eVarI);
            if (com.huawei.openalliance.ad.download.e.DOWNLOADING == eVarI) {
                this.f21477a.b("3");
            }
        }
        this.f21477a.d();
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void a(String str) {
        this.f21477a.d();
    }

    @Override // com.huawei.openalliance.ad.download.l
    public void a(AppDownloadTask appDownloadTask) {
        this.f21477a.d();
    }

    public vp(PPSRewardView pPSRewardView) {
        this.f21477a = pPSRewardView;
    }
}
