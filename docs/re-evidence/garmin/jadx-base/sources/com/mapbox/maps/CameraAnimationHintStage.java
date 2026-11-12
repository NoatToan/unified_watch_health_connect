package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationHintStage implements Serializable {
    private final CameraOptions camera;
    private final long progress;

    public static final class Builder {
        private CameraOptions camera;
        private long progress;

        public CameraAnimationHintStage build() {
            if (this.camera != null) {
                return new CameraAnimationHintStage(this.progress, this.camera);
            }
            x.l("camera shouldn't be null");
            return null;
        }

        public Builder camera(CameraOptions cameraOptions) {
            this.camera = cameraOptions;
            return this;
        }

        public Builder progress(long j8) {
            this.progress = j8;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CameraAnimationHintStage(long j8, CameraOptions cameraOptions) {
        this.progress = j8;
        this.camera = cameraOptions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CameraAnimationHintStage.class != obj.getClass()) {
            return false;
        }
        CameraAnimationHintStage cameraAnimationHintStage = (CameraAnimationHintStage) obj;
        return this.progress == cameraAnimationHintStage.progress && Objects.equals(this.camera, cameraAnimationHintStage.camera);
    }

    public CameraOptions getCamera() {
        return this.camera;
    }

    public long getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.progress), this.camera);
    }

    public Builder toBuilder() {
        return new Builder().progress(this.progress).camera(this.camera);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[progress: ");
        com.google.protobuf.a.h(this.progress, ", camera: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.camera));
        sb3.append("]");
        return sb3.toString();
    }
}
