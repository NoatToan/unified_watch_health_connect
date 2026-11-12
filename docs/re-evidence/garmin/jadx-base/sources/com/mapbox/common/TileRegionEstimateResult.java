package com.mapbox.common;

import com.mapbox.bindgen.PartialEq;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.bindgen.Value;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TileRegionEstimateResult implements Serializable {
    private final double errorMargin;
    private final Value extraData;
    private final long storageSize;
    private final long transferSize;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TileRegionEstimateResult(double d14, long j8, long j14, Value value) {
        this.errorMargin = d14;
        this.transferSize = j8;
        this.storageSize = j14;
        this.extraData = value;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TileRegionEstimateResult tileRegionEstimateResult = (TileRegionEstimateResult) obj;
        return PartialEq.compare(this.errorMargin, tileRegionEstimateResult.errorMargin) && this.transferSize == tileRegionEstimateResult.transferSize && this.storageSize == tileRegionEstimateResult.storageSize && Objects.equals(this.extraData, tileRegionEstimateResult.extraData);
    }

    public double getErrorMargin() {
        return this.errorMargin;
    }

    public Value getExtraData() {
        return this.extraData;
    }

    public long getStorageSize() {
        return this.storageSize;
    }

    public long getTransferSize() {
        return this.transferSize;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.errorMargin), Long.valueOf(this.transferSize), Long.valueOf(this.storageSize), this.extraData);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[errorMargin: ");
        com.google.protobuf.a.c(this.errorMargin, ", transferSize: ", sb3);
        com.google.protobuf.a.h(this.transferSize, ", storageSize: ", sb3);
        com.google.protobuf.a.h(this.storageSize, ", extraData: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.extraData));
        sb3.append("]");
        return sb3.toString();
    }
}
