package com.huawei.hiar;

/* JADX INFO: loaded from: classes33.dex */
public class ARWorldBodyTrackingConfig extends ARConfigBase {
    @Override // com.huawei.hiar.ARConfigBase
    public void setPlaneFindingMode(ARConfigBase.PlaneFindingMode planeFindingMode) {
        super.setPlaneFindingMode(planeFindingMode);
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
    public ARAugmentedImageDatabase getAugmentedImageDatabase() {
        return super.getAugmentedImageDatabase();
    }

    public ARWorldBodyTrackingConfig(ARSession aRSession) {
        super(aRSession);
        setArType(3);
        super.setCameraLensFacing(ARConfigBase.CameraLensFacing.REAR);
        super.setFocusMode(ARConfigBase.FocusMode.FIXED_FOCUS);
    }

    ARWorldBodyTrackingConfig() {
    }
}
