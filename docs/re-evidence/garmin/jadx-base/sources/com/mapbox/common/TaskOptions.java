package com.mapbox.common;

import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class TaskOptions implements Serializable {
    private final long delay;
    private final TaskPriority priority;

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TaskOptions(long j8) {
        this.delay = j8;
        this.priority = TaskPriority.DEFAULT;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOptions taskOptions = (TaskOptions) obj;
        return this.delay == taskOptions.delay && Objects.equals(this.priority, taskOptions.priority);
    }

    public long getDelay() {
        return this.delay;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.delay), this.priority);
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("[delay: ");
        com.google.protobuf.a.h(this.delay, ", priority: ", sb3);
        sb3.append(RecordUtils.fieldToString(this.priority));
        sb3.append("]");
        return sb3.toString();
    }

    public TaskOptions(long j8, TaskPriority taskPriority) {
        this.delay = j8;
        this.priority = taskPriority;
    }
}
