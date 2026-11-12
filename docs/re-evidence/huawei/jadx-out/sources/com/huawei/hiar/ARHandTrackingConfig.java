package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARHandTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    @Deprecated
    public void setHandFindingMode(ARConfigBase.HandFindingMode handFindingMode) {
        super.setHandFindingMode(handFindingMode);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public void setCameraLensFacing(ARConfigBase.CameraLensFacing cameraLensFacing) {
        super.setCameraLensFacing(cameraLensFacing);
    }

    @Override // com.huawei.hiar.ARConfigBase
    @Deprecated
    public ARConfigBase.HandFindingMode getHandFindingMode() {
        return super.getHandFindingMode();
    }

    @Override // com.huawei.hiar.ARConfigBase
    public ARConfigBase.CameraLensFacing getCameraLensFacing() {
        return super.getCameraLensFacing();
    }

    public ARHandTrackingConfig(ARSession aRSession) {
        super(aRSession);
        setArType(4);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.REAR);
        super.setFocusMode(ARConfigBase.FocusMode.AUTO_FOCUS);
    }

    ARHandTrackingConfig() {
    }
}
