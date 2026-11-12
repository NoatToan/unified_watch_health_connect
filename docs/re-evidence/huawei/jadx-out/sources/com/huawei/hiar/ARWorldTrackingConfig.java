package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARWorldTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    public void setPlaneFindingMode(ARConfigBase.PlaneFindingMode planeFindingMode) {
        super.setPlaneFindingMode(planeFindingMode);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public void setFaceDetectMode(long j) {
        super.setFaceDetectMode(j);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public void setAugmentedImageDatabase(ARAugmentedImageDatabase aRAugmentedImageDatabase) {
        super.setAugmentedImageDatabase(aRAugmentedImageDatabase);
    }

    @Override // com.huawei.hiar.ARConfigBase
    public ARConfigBase.PlaneFindingMode getPlaneFindingMode() {
        return super.getPlaneFindingMode();
    }

    @Override // com.huawei.hiar.ARConfigBase
    public long getFaceDetectMode() {
        return super.getFaceDetectMode();
    }

    @Override // com.huawei.hiar.ARConfigBase
    public ARAugmentedImageDatabase getAugmentedImageDatabase() {
        return super.getAugmentedImageDatabase();
    }

    public ARWorldTrackingConfig(ARSession aRSession) {
        super(aRSession);
        super.setArType(1);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.REAR);
        super.setFocusMode(ARConfigBase.FocusMode.FIXED_FOCUS);
    }

    ARWorldTrackingConfig() {
    }
}
