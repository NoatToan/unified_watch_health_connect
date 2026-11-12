package com.huawei.openalliance.ad;

import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;

/* JADX INFO: loaded from: classes12.dex */
public interface of<V extends INativeVideoView> extends oq<V> {
    void a(int i, int i2);

    void a(int i, int i2, long j, IPPSNativeView iPPSNativeView, com.huawei.openalliance.ad.inter.data.e eVar);

    @Override // com.huawei.openalliance.ad.oq
    void a(long j, long j2);

    void a(ImageInfo imageInfo);

    void a(VideoInfo videoInfo);

    void a(com.huawei.openalliance.ad.inter.data.e eVar);

    void a(IPPSNativeView iPPSNativeView, com.huawei.openalliance.ad.inter.data.e eVar);

    void a(boolean z);

    boolean a(MediaPlayerAgent mediaPlayerAgent, com.huawei.openalliance.ad.inter.data.e eVar);
}
