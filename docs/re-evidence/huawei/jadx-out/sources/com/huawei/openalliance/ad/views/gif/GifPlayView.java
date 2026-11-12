package com.huawei.openalliance.ad.views.gif;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes12.dex */
public class GifPlayView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f21217a;

    public void setPlayerCallback(d dVar) {
        this.f21217a = dVar;
    }

    public void setGifDrawable(b bVar) {
        bVar.a(this.f21217a);
        setImageDrawable(bVar);
    }

    public GifPlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GifPlayView(Context context) {
        super(context);
    }
}
