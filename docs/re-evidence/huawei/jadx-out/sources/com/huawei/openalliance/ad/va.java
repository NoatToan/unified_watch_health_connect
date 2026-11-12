package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.views.PPSRewardView;
import com.huawei.openalliance.ad.views.RewardVideoView;

/* JADX INFO: loaded from: classes12.dex */
public class va {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private mh f20707a = new lw();

    public void d() {
        this.f20707a.a(mw.CLICK);
    }

    public void c() {
        mh mhVar = this.f20707a;
        if (mhVar != null) {
            mhVar.e();
        }
    }

    public void b() {
        this.f20707a.b();
    }

    public void a(PPSRewardView pPSRewardView, IRewardAd iRewardAd, RewardVideoView rewardVideoView) {
        ContentRecord contentRecordA = pw.a((com.huawei.openalliance.ad.inter.data.i) iRewardAd);
        if (contentRecordA == null || contentRecordA.b(pPSRewardView.getContext()) == null) {
            hw.c("RewardOmProxy", "there is no reward ad or om is null");
            return;
        }
        hw.b("RewardOmProxy", "init om");
        this.f20707a.a(pPSRewardView.getContext(), contentRecordA, pPSRewardView, true);
        this.f20707a.c();
        a(rewardVideoView, this.f20707a);
    }

    public void a() {
        this.f20707a.j();
    }

    private void a(RewardVideoView rewardVideoView, mh mhVar) {
        if (rewardVideoView != null) {
            rewardVideoView.a(mhVar);
        }
    }
}
