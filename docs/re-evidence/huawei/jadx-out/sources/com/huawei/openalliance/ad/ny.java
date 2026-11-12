package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.views.interfaces.IRewardVideoView;

/* JADX INFO: loaded from: classes41.dex */
public class ny extends ni<IRewardVideoView> implements on<IRewardVideoView> {
    @Override // com.huawei.openalliance.ad.on
    public void a(com.huawei.openalliance.ad.inter.data.i iVar) {
        this.f19383a = pw.a(iVar);
        this.f19384b = new pc(this.f19738c, new tb(this.f19738c), this.f19383a);
    }

    @Override // com.huawei.openalliance.ad.on
    public void a(final VideoInfo videoInfo) {
        if (videoInfo == null) {
            return;
        }
        hw.b("RewardVideoViewPresenter", "checkVideoHash");
        com.huawei.openalliance.ad.utils.o.f(new Runnable() { // from class: com.huawei.openalliance.ad.ny.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.huawei.openalliance.ad.utils.dg.l(videoInfo.getVideoDownloadUrl()) || videoInfo.b(ny.this.f19738c)) {
                    com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.ny.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ((IRewardVideoView) ny.this.d()).onCheckVideoHashResult(videoInfo, true);
                        }
                    });
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.on
    public void a(Context context, long j, long j2, int i) {
        new com.huawei.openalliance.ad.analysis.c(context).a(this.f19383a, j, j2, i);
    }

    @Override // com.huawei.openalliance.ad.on
    public void a(int i) {
        new com.huawei.openalliance.ad.analysis.c(this.f19738c).c(this.f19383a, i);
    }

    public ny(Context context, IRewardVideoView iRewardVideoView) {
        super(context);
        a(iRewardVideoView);
        this.f19384b = new pc(context, new tb(context));
    }
}
