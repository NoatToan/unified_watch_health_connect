package com.xiaomi.smarthome.screenshot.callback;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes2.dex */
public interface ScreenshotListener {
    void onFail(int i, String str);

    void onPreStart();

    void onSuccess(Bitmap bitmap, boolean z);
}
