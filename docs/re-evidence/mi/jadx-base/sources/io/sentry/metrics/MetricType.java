package io.sentry.metrics;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public enum MetricType {
    Counter(PluginDeviceInfo.FICONON),
    Gauge(PluginDeviceInfo.FLOCALIZATIONS),
    Distribution(PluginDeviceInfo.FICONOFF),
    Set("s");


    @NotNull
    final String statsdCode;

    MetricType(String str) {
        this.statsdCode = str;
    }
}
