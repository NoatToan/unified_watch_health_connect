package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARImageTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    public void setAugmentedImageDatabase(ARAugmentedImageDatabase aRAugmentedImageDatabase) {
        super.setAugmentedImageDatabase(aRAugmentedImageDatabase);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public ARAugmentedImageDatabase getAugmentedImageDatabase() {
        return super.getAugmentedImageDatabase();
    }

    public ARImageTrackingConfig(ARSession aRSession) {
        super(aRSession);
        super.setArType(128);
        super.setFocusMode(ARConfigBase.FocusMode.AUTO_FOCUS);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.REAR);
    }

    ARImageTrackingConfig() {
    }
}
