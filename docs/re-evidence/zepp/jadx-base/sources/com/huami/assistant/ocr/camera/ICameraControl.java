package com.huami.assistant.ocr.camera;

import android.graphics.Rect;
import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public interface ICameraControl {
    public static final int FLASH_MODE_AUTO = 2;
    public static final int FLASH_MODE_OFF = 0;
    public static final int FLASH_MODE_TORCH = 1;

    public @interface FlashMode {
    }

    public interface OnDetectPictureCallback {
        int onDetect(byte[] data, int rotation);
    }

    public interface OnTakePictureCallback {
        void onPictureTaken(byte[] data);
    }

    AtomicBoolean getAbortingScan();

    View getDisplayView();

    @FlashMode
    int getFlashMode();

    Rect getPreviewFrame();

    void pause();

    void refreshPermission();

    void resume();

    void setDetectCallback(OnDetectPictureCallback callback);

    void setDisplayOrientation(@CameraView.Orientation int displayOrientation);

    void setFlashMode(@FlashMode int flashMode);

    void setPermissionCallback(PermissionCallback callback);

    void start();

    void stop();

    void takePicture(OnTakePictureCallback callback);
}
