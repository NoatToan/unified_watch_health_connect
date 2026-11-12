package com.huawei.openalliance.ad;

import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.views.PPSRewardView;

/* JADX INFO: loaded from: classes12.dex */
public class vo implements com.huawei.openalliance.ad.utils.bd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PPSRewardView f21473a;

    @Override // com.huawei.openalliance.ad.utils.bd.a
    public void a(final Drawable drawable) {
        if (drawable != null) {
            final Drawable drawableA = com.huawei.openalliance.ad.utils.bb.a(this.f21473a.getContext(), drawable, 5.0f, 8.0f);
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.vo.1
                @Override // java.lang.Runnable
                public void run() {
                    vo.this.f21473a.a(drawable, drawableA);
                }
            });
        }
    }

    @Override // com.huawei.openalliance.ad.utils.bd.a
    public void a() {
        hw.b("RewardViewOIDL", "get icon failed");
    }

    public vo(PPSRewardView pPSRewardView) {
        this.f21473a = pPSRewardView;
    }
}
