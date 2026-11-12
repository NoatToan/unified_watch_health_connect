package com.mapbox.maps.extension.style.utils;

import com.mapbox.maps.module.TelemetryEvent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/extension/style/utils/StyleTelemetryEvents;", "", "()V", "dsl", "Lcom/mapbox/maps/module/TelemetryEvent;", "getDsl", "()Lcom/mapbox/maps/module/TelemetryEvent;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class StyleTelemetryEvents {
    public static final StyleTelemetryEvents INSTANCE = new StyleTelemetryEvents();
    private static final TelemetryEvent dsl = TelemetryEvent.INSTANCE.create("style/dsl");

    private StyleTelemetryEvents() {
    }

    public final TelemetryEvent getDsl() {
        return dsl;
    }
}
