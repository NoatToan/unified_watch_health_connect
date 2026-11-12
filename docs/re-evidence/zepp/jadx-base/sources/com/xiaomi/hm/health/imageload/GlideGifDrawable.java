package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes21.dex */
public class GlideGifDrawable extends GifDrawable {
    public GlideGifDrawable(Context context, GifDecoder gifDecoder, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        super(context, gifDecoder, bitmapPool, transformation, i, i2, bitmap);
    }
}
