package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.utils.ExifData;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static void a(@NonNull CameraCaptureResult _this, ExifData.Builder builder) {
        builder.setFlashState(_this.getFlashState());
    }
}
