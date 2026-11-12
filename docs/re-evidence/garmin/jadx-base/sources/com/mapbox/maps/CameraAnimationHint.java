package com.mapbox.maps;

import com.mapbox.bindgen.RecordUtils;
import com.mapbox.common.BaseMapboxInitializer;
import com.mapbox.maps.loader.MapboxMapsInitializerImpl;
import j20.x;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class CameraAnimationHint implements Serializable {
    private final List<CameraAnimationHintStage> stages;

    public static final class Builder {
        private List<CameraAnimationHintStage> stages;

        public CameraAnimationHint build() {
            if (this.stages != null) {
                return new CameraAnimationHint(this.stages);
            }
            x.l("stages shouldn't be null");
            return null;
        }

        public Builder stages(List<CameraAnimationHintStage> list) {
            this.stages = list;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxMapsInitializerImpl.class);
    }

    private CameraAnimationHint(List<CameraAnimationHintStage> list) {
        this.stages = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && CameraAnimationHint.class == obj.getClass() && Objects.equals(this.stages, ((CameraAnimationHint) obj).stages);
    }

    public List<CameraAnimationHintStage> getStages() {
        return this.stages;
    }

    public int hashCode() {
        return Objects.hash(this.stages);
    }

    public Builder toBuilder() {
        return new Builder().stages(this.stages);
    }

    public String toString() {
        return "[stages: " + RecordUtils.fieldToString(this.stages) + "]";
    }
}
