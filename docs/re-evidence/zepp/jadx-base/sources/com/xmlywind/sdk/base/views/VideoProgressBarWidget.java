package com.xmlywind.sdk.base.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes22.dex */
public class VideoProgressBarWidget extends ImageView {
    private f a;
    private final int b;

    public VideoProgressBarWidget(Context context) {
        super(context);
        f fVar = new f(context);
        this.a = fVar;
        setImageDrawable(fVar);
        this.b = com.xmlywind.sdk.common.utils.c.b(2.0f, context);
    }

    public void a(int i) {
        this.a.a(i);
    }

    public void a(int i, int i2) {
        this.a.a(i, i2);
        setVisibility(0);
    }

    @Deprecated
    public f getImageViewDrawable() {
        return this.a;
    }

    public void setAnchorId(int i) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.b);
        layoutParams.addRule(12, i);
        setLayoutParams(layoutParams);
    }

    @Deprecated
    public void setImageViewDrawable(f fVar) {
        this.a = fVar;
    }
}
