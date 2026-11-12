package com.mapbox.maps.plugin.viewport.util;

import com.mapbox.maps.module.TelemetryEvent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/plugin/viewport/util/ViewportTelemetryEvents;", "", "()V", "stateFollowPuck", "Lcom/mapbox/maps/module/TelemetryEvent;", "getStateFollowPuck", "()Lcom/mapbox/maps/module/TelemetryEvent;", "stateOverview", "getStateOverview", "stateTransition", "getStateTransition", "plugin-viewport_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ViewportTelemetryEvents {
    public static final ViewportTelemetryEvents INSTANCE = new ViewportTelemetryEvents();
    private static final TelemetryEvent stateFollowPuck;
    private static final TelemetryEvent stateOverview;
    private static final TelemetryEvent stateTransition;

    static {
        TelemetryEvent.Companion companion = TelemetryEvent.INSTANCE;
        stateFollowPuck = companion.create("viewport/state/follow-puck");
        stateOverview = companion.create("viewport/state/overview");
        stateTransition = companion.create("viewport/state/transition");
    }

    private ViewportTelemetryEvents() {
    }

    public final TelemetryEvent getStateFollowPuck() {
        return stateFollowPuck;
    }

    public final TelemetryEvent getStateOverview() {
        return stateOverview;
    }

    public final TelemetryEvent getStateTransition() {
        return stateTransition;
    }
}
