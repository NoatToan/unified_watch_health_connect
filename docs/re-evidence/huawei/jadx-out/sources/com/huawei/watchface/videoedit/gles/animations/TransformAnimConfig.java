package com.huawei.watchface.videoedit.gles.animations;

import android.view.animation.Interpolator;
import com.huawei.watchface.utils.HwLog;

/* JADX INFO: loaded from: classes20.dex */
public class TransformAnimConfig {
    private Interpolator mPosInterp;
    private Interpolator mRotInterp;
    private Interpolator mScaInterp;
    private float[] mStartPos = {0.0f, 0.0f, 0.0f};
    private float[] mEndPos = {0.0f, 0.0f, 0.0f};
    private float mStartRot = 0.0f;
    private float mEndRot = 0.0f;
    private float[] mRotAxis = {0.0f, 0.0f, 1.0f};
    private float[] mStartScales = {1.0f, 1.0f, 1.0f};
    private float[] mEndScales = {1.0f, 1.0f, 1.0f};

    public float[] getEndPos() {
        return this.mEndPos;
    }

    public float getEndRot() {
        return this.mEndRot;
    }

    public float[] getEndScale() {
        return this.mEndScales;
    }

    public Interpolator getPosInterp() {
        return this.mPosInterp;
    }

    public float[] getRotAxis() {
        return this.mRotAxis;
    }

    public Interpolator getRotInterp() {
        return this.mRotInterp;
    }

    public Interpolator getScaInterp() {
        return this.mScaInterp;
    }

    public float[] getStartPos() {
        return this.mStartPos;
    }

    public float getStartRot() {
        return this.mStartRot;
    }

    public float[] getStartScale() {
        return this.mStartScales;
    }

    public TransformAnimConfig setEndPos(float[] fArr) {
        if (fArr == null) {
            HwLog.d(HwLog.TAG, "setEndPos is null.");
            return this;
        }
        this.mEndPos = (float[]) fArr.clone();
        return this;
    }

    public TransformAnimConfig setEndRot(float f) {
        this.mEndRot = f;
        return this;
    }

    public TransformAnimConfig setEndScale(float[] fArr) {
        if (fArr == null) {
            HwLog.d(HwLog.TAG, "setEndScale is null.");
            return this;
        }
        this.mEndScales = (float[]) fArr.clone();
        return this;
    }

    public TransformAnimConfig setPos(float[] fArr) {
        setStartPos(fArr);
        setEndPos(fArr);
        return this;
    }

    public TransformAnimConfig setPosInterp(Interpolator interpolator) {
        this.mPosInterp = interpolator;
        return this;
    }

    public TransformAnimConfig setRotAxis(float[] fArr) {
        if (fArr == null) {
            HwLog.d(HwLog.TAG, "setRotAxis is null.");
            return this;
        }
        this.mRotAxis = (float[]) fArr.clone();
        return this;
    }

    public TransformAnimConfig setRotInterp(Interpolator interpolator) {
        this.mRotInterp = interpolator;
        return this;
    }

    public TransformAnimConfig setRotation(float f) {
        this.mStartRot = f;
        this.mEndRot = f;
        return this;
    }

    public TransformAnimConfig setScaInterp(Interpolator interpolator) {
        this.mScaInterp = interpolator;
        return this;
    }

    public TransformAnimConfig setScale(float f) {
        setStartScale(f);
        setEndScale(f);
        return this;
    }

    public TransformAnimConfig setStartPos(float[] fArr) {
        if (fArr == null) {
            HwLog.d(HwLog.TAG, "setStartPos is null.");
            return this;
        }
        this.mStartPos = (float[]) fArr.clone();
        return this;
    }

    public TransformAnimConfig setStartRot(float f) {
        this.mStartRot = f;
        return this;
    }

    public TransformAnimConfig setStartScale(float[] fArr) {
        if (fArr == null) {
            HwLog.d(HwLog.TAG, "setStartScale is null.");
            return this;
        }
        this.mStartScales = (float[]) fArr.clone();
        return this;
    }

    public TransformAnimConfig setEndScale(float f) {
        setEndScale(new float[]{f, f, f});
        return this;
    }

    public TransformAnimConfig setStartScale(float f) {
        setStartScale(new float[]{f, f, f});
        return this;
    }
}
