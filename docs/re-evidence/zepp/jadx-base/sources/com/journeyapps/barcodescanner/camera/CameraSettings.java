package com.journeyapps.barcodescanner.camera;

/* JADX INFO: loaded from: classes18.dex */
public class CameraSettings {
    private int a = -1;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private FocusMode i = FocusMode.AUTO;

    public enum FocusMode {
        AUTO,
        CONTINUOUS,
        INFINITY,
        MACRO
    }

    public FocusMode getFocusMode() {
        return this.i;
    }

    public int getRequestedCameraId() {
        return this.a;
    }

    public boolean isAutoFocusEnabled() {
        return this.e;
    }

    public boolean isAutoTorchEnabled() {
        return this.h;
    }

    public boolean isBarcodeSceneModeEnabled() {
        return this.c;
    }

    public boolean isContinuousFocusEnabled() {
        return this.f;
    }

    public boolean isExposureEnabled() {
        return this.g;
    }

    public boolean isMeteringEnabled() {
        return this.d;
    }

    public boolean isScanInverted() {
        return this.b;
    }

    public void setAutoFocusEnabled(boolean z) {
        this.e = z;
        if (z && this.f) {
            this.i = FocusMode.CONTINUOUS;
        } else if (z) {
            this.i = FocusMode.AUTO;
        } else {
            this.i = null;
        }
    }

    public void setAutoTorchEnabled(boolean z) {
        this.h = z;
    }

    public void setBarcodeSceneModeEnabled(boolean z) {
        this.c = z;
    }

    public void setContinuousFocusEnabled(boolean z) {
        this.f = z;
        if (z) {
            this.i = FocusMode.CONTINUOUS;
        } else if (this.e) {
            this.i = FocusMode.AUTO;
        } else {
            this.i = null;
        }
    }

    public void setExposureEnabled(boolean z) {
        this.g = z;
    }

    public void setFocusMode(FocusMode focusMode) {
        this.i = focusMode;
    }

    public void setMeteringEnabled(boolean z) {
        this.d = z;
    }

    public void setRequestedCameraId(int i) {
        this.a = i;
    }

    public void setScanInverted(boolean z) {
        this.b = z;
    }
}
