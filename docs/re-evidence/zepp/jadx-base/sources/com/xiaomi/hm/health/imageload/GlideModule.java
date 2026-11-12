package com.xiaomi.hm.health.imageload;

import android.content.Context;
import androidx.annotation.NonNull;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.HByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.module.AppGlideModule;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes21.dex */
public class GlideModule extends AppGlideModule {
    @Override // com.bumptech.glide.module.AppGlideModule
    public boolean isManifestParsingEnabled() {
        return false;
    }

    @Override // com.bumptech.glide.module.LibraryGlideModule, com.bumptech.glide.module.b
    public void registerComponents(@NonNull Context context, @NonNull Glide glide, @NonNull Registry registry) {
        BitmapPool bitmapPool = glide.getBitmapPool();
        ArrayPool arrayPool = glide.getArrayPool();
        HByteBufferGifDecoder hByteBufferGifDecoder = new HByteBufferGifDecoder(context, registry.getImageHeaderParsers(), bitmapPool, arrayPool);
        registry.append(Registry.BUCKET_GIF, InputStream.class, GifDrawable.class, new StreamGifDecoder(registry.getImageHeaderParsers(), hByteBufferGifDecoder, arrayPool)).append(Registry.BUCKET_GIF, ByteBuffer.class, GifDrawable.class, hByteBufferGifDecoder);
    }
}
