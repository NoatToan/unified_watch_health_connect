package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

/* JADX INFO: loaded from: classes14.dex */
@UsedByNative("jni_common.cc")
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    public float[] getExtraScales() {
        return this.extraScales;
    }

    public int getMinimumDetectedDimension() {
        return this.minimumDetectedDimension;
    }

    public boolean getSkipProcessingIfBarcodeFound() {
        return this.skipProcessingIfBarcodeFound;
    }

    public void setExtraScales(float[] fArr) {
        this.extraScales = fArr;
    }

    public void setMinimumDetectedDimension(int i14) {
        this.minimumDetectedDimension = i14;
    }

    public void setSkipProcessingIfBarcodeFound(boolean z14) {
        this.skipProcessingIfBarcodeFound = z14;
    }
}
