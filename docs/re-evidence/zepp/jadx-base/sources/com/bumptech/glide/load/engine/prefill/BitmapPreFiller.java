package com.bumptech.glide.load.engine.prefill;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.cache.MemoryCache;
import com.bumptech.glide.util.Util;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class BitmapPreFiller {
    private final MemoryCache a;
    private final BitmapPool b;
    private final DecodeFormat c;
    private final Handler d = new Handler(Looper.getMainLooper());
    private a e;

    public BitmapPreFiller(MemoryCache memoryCache, BitmapPool bitmapPool, DecodeFormat decodeFormat) {
        this.a = memoryCache;
        this.b = bitmapPool;
        this.c = decodeFormat;
    }

    private static int b(PreFillType preFillType) {
        return Util.getBitmapByteSize(preFillType.d(), preFillType.b(), preFillType.a());
    }

    @VisibleForTesting
    public b a(PreFillType... preFillTypeArr) {
        long maxSize = (this.a.getMaxSize() - this.a.getCurrentSize()) + this.b.getMaxSize();
        int iC = 0;
        for (PreFillType preFillType : preFillTypeArr) {
            iC += preFillType.c();
        }
        float f = maxSize / iC;
        HashMap map = new HashMap();
        for (PreFillType preFillType2 : preFillTypeArr) {
            map.put(preFillType2, Integer.valueOf(Math.round(preFillType2.c() * f) / b(preFillType2)));
        }
        return new b(map);
    }

    public void preFill(PreFillType.Builder... builderArr) {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel();
        }
        PreFillType[] preFillTypeArr = new PreFillType[builderArr.length];
        for (int i = 0; i < builderArr.length; i++) {
            PreFillType.Builder builder = builderArr[i];
            if (builder.b() == null) {
                builder.setConfig(this.c == DecodeFormat.PREFER_ARGB_8888 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            preFillTypeArr[i] = builder.a();
        }
        a aVar2 = new a(this.b, this.a, a(preFillTypeArr));
        this.e = aVar2;
        this.d.post(aVar2);
    }
}
