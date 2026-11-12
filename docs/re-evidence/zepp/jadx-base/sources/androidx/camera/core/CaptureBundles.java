package androidx.camera.core;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureBundle;
import androidx.camera.core.impl.CaptureStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class CaptureBundles {

    public static final class CaptureBundleImpl implements CaptureBundle {
        public final List<CaptureStage> mCaptureStageList;

        public CaptureBundleImpl(List<CaptureStage> captureStageList) {
            if (captureStageList == null || captureStageList.isEmpty()) {
                throw new IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.mCaptureStageList = Collections.unmodifiableList(new ArrayList(captureStageList));
        }

        @Override // androidx.camera.core.impl.CaptureBundle
        public List<CaptureStage> getCaptureStages() {
            return this.mCaptureStageList;
        }
    }

    private CaptureBundles() {
    }

    @NonNull
    public static CaptureBundle createCaptureBundle(@NonNull CaptureStage... captureStages) {
        return new CaptureBundleImpl(Arrays.asList(captureStages));
    }

    @NonNull
    public static CaptureBundle singleDefaultCaptureBundle() {
        return createCaptureBundle(new CaptureStage.DefaultCaptureStage());
    }

    @NonNull
    public static CaptureBundle createCaptureBundle(@NonNull List<CaptureStage> captureStageList) {
        return new CaptureBundleImpl(captureStageList);
    }
}
