package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.LottieComposition;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class LottieCompositionCache {
    private static final LottieCompositionCache b = new LottieCompositionCache();
    private final LruCache<String, LottieComposition> a = new LruCache<>(20);

    @VisibleForTesting
    public LottieCompositionCache() {
    }

    public static LottieCompositionCache getInstance() {
        return b;
    }

    public void clear() {
        this.a.evictAll();
    }

    @Nullable
    public LottieComposition get(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.a.get(str);
    }

    public void put(@Nullable String str, LottieComposition lottieComposition) {
        if (str == null) {
            return;
        }
        this.a.put(str, lottieComposition);
    }

    public void resize(int i) {
        this.a.resize(i);
    }
}
