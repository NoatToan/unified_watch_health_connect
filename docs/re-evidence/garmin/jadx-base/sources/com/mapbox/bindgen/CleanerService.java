package com.mapbox.bindgen;

/* JADX INFO: loaded from: classes2.dex */
public final class CleanerService {
    private static final Cleaner cleaner = Cleaner.create();

    public static void register(Object obj, Runnable runnable) {
        cleaner.register(obj, runnable);
    }
}
