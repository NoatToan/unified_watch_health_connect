package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class LruCache implements Cache {
    public final LinkedHashMap<String, Bitmap> a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public LruCache(Context context) {
        this(u.b(context));
    }

    private void a(int i) {
        while (true) {
            synchronized (this) {
                if (this.c < 0 || (this.a.isEmpty() && this.c != 0)) {
                    break;
                }
                if (this.c > i && !this.a.isEmpty()) {
                    Map.Entry<String, Bitmap> next = this.a.entrySet().iterator().next();
                    String key = next.getKey();
                    Bitmap value = next.getValue();
                    this.a.remove(key);
                    this.c -= u.l(value);
                    this.e++;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized void clear() {
        evictAll();
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized void clearKeyUri(String str) {
        int length = str.length();
        Iterator<Map.Entry<String, Bitmap>> it2 = this.a.entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Map.Entry<String, Bitmap> next = it2.next();
            String key = next.getKey();
            Bitmap value = next.getValue();
            int iIndexOf = key.indexOf(10);
            if (iIndexOf == length && key.substring(0, iIndexOf).equals(str)) {
                it2.remove();
                this.c -= u.l(value);
                z = true;
            }
        }
        if (z) {
            a(this.b);
        }
    }

    public final void evictAll() {
        a(-1);
    }

    public final synchronized int evictionCount() {
        return this.e;
    }

    @Override // com.squareup.picasso.Cache
    public Bitmap get(String str) {
        Objects.requireNonNull(str, "key == null");
        synchronized (this) {
            Bitmap bitmap = this.a.get(str);
            if (bitmap != null) {
                this.f++;
                return bitmap;
            }
            this.g++;
            return null;
        }
    }

    public final synchronized int hitCount() {
        return this.f;
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized int maxSize() {
        return this.b;
    }

    public final synchronized int missCount() {
        return this.g;
    }

    public final synchronized int putCount() {
        return this.d;
    }

    @Override // com.squareup.picasso.Cache
    public void set(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.d++;
            this.c += u.l(bitmap);
            Bitmap bitmapPut = this.a.put(str, bitmap);
            if (bitmapPut != null) {
                this.c -= u.l(bitmapPut);
            }
        }
        a(this.b);
    }

    @Override // com.squareup.picasso.Cache
    public final synchronized int size() {
        return this.c;
    }

    public LruCache(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.b = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }
}
