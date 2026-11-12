package com.huawei.hwcommonmodel.camera;

import android.media.Image;

/* JADX INFO: loaded from: classes10.dex */
public interface CameraStateListener {
    void onCameraError(String str);

    void onCameraOpened(int i);

    void onPreviewFrame(Image image, int i);
}
