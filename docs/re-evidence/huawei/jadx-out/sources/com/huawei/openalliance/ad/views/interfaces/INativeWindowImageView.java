package com.huawei.openalliance.ad.views.interfaces;

import android.view.View;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.js;

/* JADX INFO: loaded from: classes12.dex */
public interface INativeWindowImageView extends js {
    void setDisplayView(View view);

    void setNativeAd(INativeAd iNativeAd);
}
