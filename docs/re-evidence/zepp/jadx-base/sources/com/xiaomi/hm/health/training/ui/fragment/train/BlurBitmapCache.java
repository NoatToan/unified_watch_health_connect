package com.xiaomi.hm.health.training.ui.fragment.train;

import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.collection.LruCache;

/* JADX INFO: loaded from: classes21.dex */
public class BlurBitmapCache {
    private static volatile BlurBitmapCache b;
    private LruCache<String, Bitmap> a = new a(((int) Runtime.getRuntime().maxMemory()) / 10);

    public class a extends LruCache<String, Bitmap> {
        public a(int i) {
            super(i);
        }

        @Override // androidx.collection.LruCache
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    private BlurBitmapCache() {
    }

    public static BlurBitmapCache getInstance() {
        if (b == null) {
            synchronized (BlurBitmapCache.class) {
                if (b == null) {
                    b = new BlurBitmapCache();
                }
            }
        }
        return b;
    }

    public void clear() {
        this.a.evictAll();
        synchronized (BlurBitmapCache.class) {
            if (b != null) {
                b = null;
            }
        }
    }

    public Bitmap get(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.a.get(str);
    }

    public void put(String str, Bitmap bitmap) {
        if (TextUtils.isEmpty(str) || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.a.put(str, bitmap);
    }
}
