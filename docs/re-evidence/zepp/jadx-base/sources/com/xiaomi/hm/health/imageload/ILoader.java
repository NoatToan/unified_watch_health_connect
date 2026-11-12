package com.xiaomi.hm.health.imageload;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import java.io.File;

/* JADX INFO: loaded from: classes21.dex */
public interface ILoader {
    void clearMemory(Context context);

    @MainThread
    void downloadOnly(DisplayConfig displayConfig);

    @WorkerThread
    void downloadOnlyExecute(DisplayConfig displayConfig);

    Bitmap get(DisplayConfig displayConfig);

    void init(Context context, int i, HMImageLoader.MemoryCategory memoryCategory, boolean z);

    File obtain(DisplayConfig displayConfig);

    void onLowMemory(Context context);

    void onTrimMemory(Context context, int i);

    void preload(DisplayConfig displayConfig);

    void show(DisplayConfig displayConfig);
}
