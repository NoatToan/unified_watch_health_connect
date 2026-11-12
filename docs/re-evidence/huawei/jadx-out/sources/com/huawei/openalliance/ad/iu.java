package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes41.dex */
public class iu implements iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<INativeVideoView> f19274a;

    @Override // com.huawei.openalliance.ad.iy
    public void a(final int i) {
        hw.b("NativeVideoStreamListener", "stream error, code: %s", Integer.valueOf(i));
        final INativeVideoView iNativeVideoView = this.f19274a.get();
        if (iNativeVideoView != null) {
            com.huawei.openalliance.ad.utils.dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.iu.1
                @Override // java.lang.Runnable
                public void run() {
                    iNativeVideoView.notifyStreamError(i);
                    if (i == -2) {
                        iNativeVideoView.stop();
                    }
                }
            });
        }
    }

    public iu(INativeVideoView iNativeVideoView) {
        this.f19274a = new WeakReference<>(iNativeVideoView);
    }
}
