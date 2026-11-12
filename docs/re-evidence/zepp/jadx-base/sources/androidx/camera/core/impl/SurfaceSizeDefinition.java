package androidx.camera.core.impl;

import android.util.Size;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class SurfaceSizeDefinition {
    public static SurfaceSizeDefinition create(Size analysisSize, Size previewSize, Size recordSize) {
        return new AutoValue_SurfaceSizeDefinition(analysisSize, previewSize, recordSize);
    }

    public abstract Size getAnalysisSize();

    public abstract Size getPreviewSize();

    public abstract Size getRecordSize();
}
