package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARBodyTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    public void setCameraLensFacing(ARConfigBase.CameraLensFacing cameraLensFacing) {
        super.setCameraLensFacing(cameraLensFacing);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public ARConfigBase.CameraLensFacing getCameraLensFacing() {
        return super.getCameraLensFacing();
    }

    public ARBodyTrackingConfig(ARSession aRSession) {
        super(aRSession);
        setArType(2);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.REAR);
        super.setFocusMode(ARConfigBase.FocusMode.AUTO_FOCUS);
    }

    ARBodyTrackingConfig() {
    }
}
