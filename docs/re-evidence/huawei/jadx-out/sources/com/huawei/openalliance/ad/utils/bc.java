package com.huawei.openalliance.ad.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.huawei.openalliance.ad.hw;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class bc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f20476b = "bc";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static bc f20477c;
    private static final byte[] d = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LruCache<String, WeakReference<Drawable>> f20478a;

    public void a(String str, Drawable drawable) {
        try {
            this.f20478a.put(str, new WeakReference<>(drawable));
        } catch (Throwable th) {
            hw.c(f20476b, "put cache encounter: " + th.getClass().getSimpleName());
        }
    }

    public Drawable a(String str) {
        try {
            WeakReference<Drawable> weakReference = this.f20478a.get(str);
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        } catch (Throwable th) {
            hw.c(f20476b, "get cache encounter: " + th.getClass().getSimpleName());
            return null;
        }
    }

    private void b() {
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        this.f20478a = new LruCache<String, WeakReference<Drawable>>(Math.min(31457280, iMaxMemory > 0 ? iMaxMemory / 4 : 31457280)) { // from class: com.huawei.openalliance.ad.utils.bc.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int sizeOf(String str, WeakReference<Drawable> weakReference) {
                Drawable drawable;
                if (weakReference == null || (drawable = weakReference.get()) == null) {
                    return 1;
                }
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof com.huawei.openalliance.ad.views.gif.b) {
                        return ((com.huawei.openalliance.ad.views.gif.b) drawable).c();
                    }
                    return 1;
                }
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (bitmap != null) {
                    return bitmap.getByteCount();
                }
                return 1;
            }
        };
    }

    public static bc a() {
        bc bcVar;
        synchronized (d) {
            if (f20477c == null) {
                f20477c = new bc();
            }
            bcVar = f20477c;
        }
        return bcVar;
    }

    private bc() {
        b();
    }
}
