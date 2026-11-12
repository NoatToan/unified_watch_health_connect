package defpackage;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraFilters;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jj0 {
    @NonNull
    public static CameraFilter a(CameraConfig _this) {
        return (CameraFilter) _this.retrieveOption(CameraConfig.OPTION_CAMERA_FILTER, CameraFilters.ANY);
    }
}
