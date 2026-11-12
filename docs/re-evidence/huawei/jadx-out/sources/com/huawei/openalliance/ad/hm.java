package com.huawei.openalliance.ad;

import android.graphics.drawable.Drawable;
import com.huawei.openalliance.ad.inter.data.ImageInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.linked.view.LinkedAppDetailView;
import com.huawei.openalliance.ad.views.VideoView;

/* JADX INFO: loaded from: classes12.dex */
public interface hm extends js {
    void a(ImageInfo imageInfo, Drawable drawable);

    void a(VideoInfo videoInfo, boolean z);

    void b(String str);

    void g();

    ha getLinkedNativeAd();

    hk getLinkedVideoControlBridge();

    VideoView getVideoView();

    LinkedAppDetailView h();

    void i();

    void setLinkedLandView(hl hlVar);

    void setLinkedNativeAd(gz gzVar);

    void setVideoView(VideoView videoView);
}
