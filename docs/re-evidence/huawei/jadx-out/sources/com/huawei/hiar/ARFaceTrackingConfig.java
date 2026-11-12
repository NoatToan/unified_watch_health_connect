package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARFaceTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    public void setFaceDetectMode(long j) {
        super.setFaceDetectMode(j);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public void setCameraLensFacing(ARConfigBase.CameraLensFacing cameraLensFacing) {
        super.setCameraLensFacing(cameraLensFacing);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public long getFaceDetectMode() {
        return super.getFaceDetectMode();
    }

    public ARFaceTrackingConfig(ARSession aRSession) {
        super(aRSession);
        super.setArType(16);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.FRONT);
        super.setFocusMode(ARConfigBase.FocusMode.AUTO_FOCUS);
    }

    ARFaceTrackingConfig() {
    }
}
