package com.xiaomi.hm.health.imageload;

import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: classes21.dex */
public class GlideRequestListener<R> implements RequestListener<R> {
    private HMLoadListener<R> a;

    public GlideRequestListener(HMLoadListener<R> hMLoadListener) {
        this.a = hMLoadListener;
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onLoadFailed(@Nullable GlideException glideException, Object obj, Target<R> target, boolean z) {
        return this.a.onLoadFailed(glideException);
    }

    @Override // com.bumptech.glide.request.RequestListener
    public boolean onResourceReady(R r, Object obj, Target<R> target, DataSource dataSource, boolean z) {
        return this.a.onLoadFinish(r);
    }
}
