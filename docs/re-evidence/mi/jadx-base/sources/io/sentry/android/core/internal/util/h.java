package io.sentry.android.core.internal.util;

import io.sentry.protocol.Device;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class h {
    @Nullable
    public static Device.DeviceOrientation a(int i) {
        if (i == 1) {
            return Device.DeviceOrientation.PORTRAIT;
        }
        if (i != 2) {
            return null;
        }
        return Device.DeviceOrientation.LANDSCAPE;
    }
}
