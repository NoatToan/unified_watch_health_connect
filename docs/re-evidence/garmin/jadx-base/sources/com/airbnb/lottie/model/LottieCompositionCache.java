package com.airbnb.lottie.model;

import com.airbnb.lottie.LottieComposition;
import p1.c0;

/* JADX INFO: loaded from: classes7.dex */
public class LottieCompositionCache {
    private static final LottieCompositionCache INSTANCE = new LottieCompositionCache();
    private final c0<String, LottieComposition> cache = new c0<>(20);

    public static LottieCompositionCache getInstance() {
        return INSTANCE;
    }

    public void clear() {
        this.cache.evictAll();
    }

    public LottieComposition get(String str) {
        if (str == null) {
            return null;
        }
        return this.cache.get(str);
    }

    public void put(String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.cache.put(str, lottieComposition);
    }

    public void resize(int i14) {
        this.cache.resize(i14);
    }
}
