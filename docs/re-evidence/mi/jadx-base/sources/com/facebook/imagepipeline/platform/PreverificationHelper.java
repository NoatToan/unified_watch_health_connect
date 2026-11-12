package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import defpackage.u07;

/* JADX INFO: loaded from: classes4.dex */
@u07
class PreverificationHelper {
    @TargetApi(26)
    @u07
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
