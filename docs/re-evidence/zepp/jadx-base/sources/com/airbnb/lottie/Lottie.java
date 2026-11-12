package com.airbnb.lottie;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Lottie {
    private Lottie() {
    }

    public static void initialize(@NonNull LottieConfig lottieConfig) {
        L.setFetcher(lottieConfig.a);
        L.setCacheProvider(lottieConfig.b);
        L.setTraceEnabled(lottieConfig.c);
    }
}
