package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    @NonNull
    public static CameraManagerCompat.CameraManagerCompatImpl a(@NonNull Context context, @NonNull Handler compatHandler) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            return new CameraManagerCompatApi29Impl(context);
        }
        return i >= 28 ? CameraManagerCompatApi28Impl.create(context) : CameraManagerCompatBaseImpl.create(context, compatHandler);
    }
}
