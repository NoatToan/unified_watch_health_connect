package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MemoryMonitorStatus implements Serializable {
    private final MemoryMonitorState state;
    private final long totalMemory;
    private final long usedMemory;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public MemoryMonitorStatus(MemoryMonitorState memoryMonitorState, long j8, long j14) {
        this.state = memoryMonitorState;
        this.totalMemory = j8;
        this.usedMemory = j14;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorStatus.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorStatus memoryMonitorStatus = (MemoryMonitorStatus) obj;
        return Objects.equals(this.state, memoryMonitorStatus.state) && this.totalMemory == memoryMonitorStatus.totalMemory && this.usedMemory == memoryMonitorStatus.usedMemory;
    }

    public MemoryMonitorState getState() {
        return this.state;
    }

    public long getTotalMemory() {
        return this.totalMemory;
    }

    public long getUsedMemory() {
        return this.usedMemory;
    }

    public int hashCode() {
        return Objects.hash(this.state, Long.valueOf(this.totalMemory), Long.valueOf(this.usedMemory));
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[state: ");
        sb3.append(RecordUtils.fieldToString(this.state));
        sb3.append(", totalMemory: ");
        com.google.protobuf.a.h(this.totalMemory, ", usedMemory: ", sb3);
        sb3.append(RecordUtils.fieldToString(Long.valueOf(this.usedMemory)));
        sb3.append("]");
        return sb3.toString();
    }
}
