package androidx.camera.camera2.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
abstract class CameraDeviceId {
    @NonNull
    public static CameraDeviceId create(@NonNull String brand, @NonNull String device, @NonNull String model, @NonNull String cameraId) {
        return new AutoValue_CameraDeviceId(brand.toLowerCase(), device.toLowerCase(), model.toLowerCase(), cameraId.toLowerCase());
    }

    @NonNull
    public abstract String getBrand();

    @NonNull
    public abstract String getCameraId();

    @NonNull
    public abstract String getDevice();

    @NonNull
    public abstract String getModel();
}
