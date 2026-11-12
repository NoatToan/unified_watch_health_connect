package com.yalantis.ucrop.callback;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public interface BitmapCropCallback {
    void onBitmapCropped(Uri uri, int i14, int i15, int i16, int i17);

    void onCropFailure(Throwable th3);
}
