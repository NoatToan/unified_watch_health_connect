package androidx.camera.camera2.internal.compat.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.DeviceQuirks;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ExcludedSupportedSizesContainer {

    @NonNull
    private final String mCameraId;

    public ExcludedSupportedSizesContainer(@NonNull String cameraId) {
        this.mCameraId = cameraId;
    }

    @NonNull
    public List<Size> get(int imageFormat) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) DeviceQuirks.get(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, imageFormat);
    }
}
