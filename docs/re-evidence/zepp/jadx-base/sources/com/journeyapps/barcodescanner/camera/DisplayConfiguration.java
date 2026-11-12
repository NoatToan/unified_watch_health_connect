package com.journeyapps.barcodescanner.camera;

import android.graphics.Rect;
import com.journeyapps.barcodescanner.Size;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class DisplayConfiguration {
    private static final String e = "DisplayConfiguration";
    private Size a;
    private int b;
    private boolean c = false;
    private PreviewScalingStrategy d = new FitCenterStrategy();

    public DisplayConfiguration(int i) {
        this.b = i;
    }

    public Size getBestPreviewSize(List<Size> list, boolean z) {
        return this.d.getBestPreviewSize(list, getDesiredPreviewSize(z));
    }

    public Size getDesiredPreviewSize(boolean z) {
        Size size = this.a;
        if (size == null) {
            return null;
        }
        return z ? size.rotate() : size;
    }

    public PreviewScalingStrategy getPreviewScalingStrategy() {
        return this.d;
    }

    public int getRotation() {
        return this.b;
    }

    public Size getViewfinderSize() {
        return this.a;
    }

    public Rect scalePreview(Size size) {
        return this.d.scalePreview(size, this.a);
    }

    public void setPreviewScalingStrategy(PreviewScalingStrategy previewScalingStrategy) {
        this.d = previewScalingStrategy;
    }

    public DisplayConfiguration(int i, Size size) {
        this.b = i;
        this.a = size;
    }
}
