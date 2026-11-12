package com.huawei.dynamicanimation;

import com.huawei.dynamicanimation.PhysicalModelBase;

/* JADX INFO: loaded from: classes23.dex */
public abstract class BaseDecelerateAnimation<T extends PhysicalModelBase> extends DynamicAnimation<BaseDecelerateAnimation<T>> {
    private static final int ONE_SECOND = 1000;
    private long mFrameTime;
    private float mLastValue;
    protected T mModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.dynamicanimation.DynamicAnimation
    protected float getAcceleration(float f, float f2) {
        return 0.0f;
    }

    abstract void sanityCheck();

    <K> BaseDecelerateAnimation(K k, FloatPropertyCompat<K> floatPropertyCompat, T t) {
        super(k, floatPropertyCompat);
        this.mLastValue = 0.0f;
        this.mModel = t;
        t.setValueThreshold(getValueThreshold());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code duplicated, block: B:11:0x004b  */
    @Override // com.huawei.dynamicanimation.DynamicAnimation
    protected boolean updateValueAndVelocity(long j) {
        boolean zIsAtEquilibrium;
        long j2 = this.mFrameTime + j;
        this.mFrameTime = j2;
        float position = this.mModel.getPosition(j2 / 1000.0f);
        this.mValue += position - this.mLastValue;
        this.mLastValue = position;
        this.mVelocity = this.mModel.getVelocity(this.mFrameTime / 1000.0f);
        if (this.mValue >= this.mMinValue) {
            if (this.mValue > this.mMaxValue) {
                this.mValue = this.mMaxValue;
            } else {
                zIsAtEquilibrium = isAtEquilibrium(this.mValue, this.mVelocity);
            }
            if (zIsAtEquilibrium) {
                reset();
            }
            return zIsAtEquilibrium;
        }
        this.mValue = this.mMinValue;
        zIsAtEquilibrium = true;
        if (zIsAtEquilibrium) {
            reset();
        }
        return zIsAtEquilibrium;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.dynamicanimation.DynamicAnimation
    protected boolean isAtEquilibrium(float f, float f2) {
        return this.mModel.isAtEquilibrium(f, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.dynamicanimation.DynamicAnimation
    protected void setValueThreshold(float f) {
        this.mModel.setValueThreshold(f);
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public void cancel() {
        super.cancel();
        reset();
    }

    public void reset() {
        this.mFrameTime = 0L;
        this.mLastValue = 0.0f;
    }

    public T getmModel() {
        return this.mModel;
    }

    @Override // com.huawei.dynamicanimation.DynamicAnimation
    public void start() {
        if (this.mModel == null) {
            throw new UnsupportedOperationException("Incomplete Animation: Physical Model should be set!");
        }
        sanityCheck();
        this.mModel.setValueThreshold(getValueThreshold());
        super.start();
    }
}
