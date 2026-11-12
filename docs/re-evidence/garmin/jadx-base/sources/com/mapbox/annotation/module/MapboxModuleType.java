package com.mapbox.annotation.module;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/mapbox/annotation/module/MapboxModuleType;", "", "simplifiedName", "", "interfacePackage", "interfaceClassName", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInterfaceClassName", "()Ljava/lang/String;", "getInterfacePackage", "getSimplifiedName", "CommonLibraryLoader", "CommonLogger", "MapTelemetry", "NavigationTripNotification", "annotations"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum MapboxModuleType {
    CommonLibraryLoader("LibraryLoader", "com.mapbox.common.module", "LibraryLoader"),
    CommonLogger("Logger", "com.mapbox.base.common.logger", "Logger"),
    MapTelemetry("MapTelemetry", "com.mapbox.maps.module", "MapTelemetry"),
    NavigationTripNotification("TripNotification", "com.mapbox.navigation.base.trip.notification", "TripNotification");

    private final String interfaceClassName;
    private final String interfacePackage;
    private final String simplifiedName;

    MapboxModuleType(String str, String str2, String str3) {
        this.simplifiedName = str;
        this.interfacePackage = str2;
        this.interfaceClassName = str3;
    }

    public final String getInterfaceClassName() {
        return this.interfaceClassName;
    }

    public final String getInterfacePackage() {
        return this.interfacePackage;
    }

    public final String getSimplifiedName() {
        return this.simplifiedName;
    }
}
