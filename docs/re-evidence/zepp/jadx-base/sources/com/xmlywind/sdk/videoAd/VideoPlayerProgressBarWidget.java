package com.xmlywind.sdk.videoAd;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes22.dex */
public class VideoPlayerProgressBarWidget extends ImageView {
    private com.xmlywind.sdk.base.views.f a;
    private final int b;

    public VideoPlayerProgressBarWidget(Context context) {
        super(context);
        com.xmlywind.sdk.base.views.f fVar = new com.xmlywind.sdk.base.views.f(context);
        this.a = fVar;
        setImageDrawable(fVar);
        this.b = com.xmlywind.sdk.common.utils.c.b(2.0f, context);
    }

    @Deprecated
    public com.xmlywind.sdk.base.views.f getImageViewDrawable() {
        return this.a;
    }

    public void setAnchorId(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.b);
        layoutParams.addRule(8, i);
        setLayoutParams(layoutParams);
    }

    @Deprecated
    public void setImageViewDrawable(com.xmlywind.sdk.base.views.f fVar) {
        this.a = fVar;
    }
}
