package com.mapbox.maps;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/MapboxTracing;", "", "()V", "MAPBOX_TRACE_ID", "", "platformTracingEnabled", "", "getPlatformTracingEnabled$maps_sdk_release", "()Z", "setPlatformTracingEnabled$maps_sdk_release", "(Z)V", "disableAll", "", "enableAll", "enableCore", "enablePlatform", "maps-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapboxTracing {
    public static final MapboxTracing INSTANCE = new MapboxTracing();
    public static final String MAPBOX_TRACE_ID = "mbx";
    private static boolean platformTracingEnabled;

    private MapboxTracing() {
    }

    public final void disableAll() {
        platformTracingEnabled = false;
        Tracing.setTracingBackendType(TracingBackendType.NOOP);
    }

    public final void enableAll() {
        platformTracingEnabled = true;
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enableCore() {
        Tracing.setTracingBackendType(TracingBackendType.PLATFORM);
    }

    public final void enablePlatform() {
        platformTracingEnabled = true;
    }

    public final boolean getPlatformTracingEnabled$maps_sdk_release() {
        return platformTracingEnabled;
    }

    public final void setPlatformTracingEnabled$maps_sdk_release(boolean z14) {
        platformTracingEnabled = z14;
    }
}
