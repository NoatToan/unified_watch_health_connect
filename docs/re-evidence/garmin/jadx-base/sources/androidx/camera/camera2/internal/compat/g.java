package androidx.camera.camera2.internal.compat;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Gainmap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g {
    public static /* bridge */ /* synthetic */ Activity.ScreenCaptureCallback f(Object obj) {
        return (Activity.ScreenCaptureCallback) obj;
    }

    public static /* synthetic */ Gainmap y(Bitmap bitmap) {
        return new Gainmap(bitmap);
    }
}
