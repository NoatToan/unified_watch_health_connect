package com.xiaomi.hm.health.imageload;

import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;

/* JADX INFO: loaded from: classes21.dex */
public class GlideSimpleTarget<R> extends SimpleTarget<R> {
    private HMLoadTarget<R> d;

    public GlideSimpleTarget(HMLoadTarget<R> hMLoadTarget) {
        this.d = hMLoadTarget;
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
        HMLoadTarget<R> hMLoadTarget = this.d;
        if (hMLoadTarget != null) {
            hMLoadTarget.onLoadCancel();
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadFailed(@Nullable Drawable drawable) {
        HMLoadTarget<R> hMLoadTarget = this.d;
        if (hMLoadTarget != null) {
            hMLoadTarget.onLoadFailed(new Exception("have an exception"));
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void onLoadStarted(Drawable drawable) {
        HMLoadTarget<R> hMLoadTarget = this.d;
        if (hMLoadTarget != null) {
            hMLoadTarget.onLoadStarted();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onResourceReady(R r, Transition<? super R> transition) {
        HMLoadTarget<R> hMLoadTarget = this.d;
        if (hMLoadTarget != null) {
            hMLoadTarget.onLoadFinish(r);
        }
    }
}
