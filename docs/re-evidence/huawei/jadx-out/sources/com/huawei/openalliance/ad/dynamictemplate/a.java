package com.huawei.openalliance.ad.dynamictemplate;

import android.util.LruCache;

/* JADX INFO: loaded from: classes41.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f18675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18676b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private IImageLoader f18677c;
    private final LruCache<String, String> d = new LruCache<>(100);

    public void a(IImageLoader iImageLoader) {
        this.f18677c = iImageLoader;
    }

    public static a a() {
        a aVar;
        synchronized (f18676b) {
            if (f18675a == null) {
                f18675a = new a();
            }
            aVar = f18675a;
        }
        return aVar;
    }
}
