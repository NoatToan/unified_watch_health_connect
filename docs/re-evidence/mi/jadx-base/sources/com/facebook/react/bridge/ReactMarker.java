package com.facebook.react.bridge;

import defpackage.v07;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
@v07
public class ReactMarker {
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j);
    }

    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @v07
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (list.contains(fabricMarkerListener)) {
            return;
        }
        list.add(fabricMarkerListener);
    }

    @v07
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (list.contains(markerListener)) {
            return;
        }
        list.add(markerListener);
    }

    @v07
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @v07
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @v07
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        Iterator<FabricMarkerListener> it = sFabricMarkerListeners.iterator();
        while (it.hasNext()) {
            it.next().logFabricMarker(reactMarkerConstants, str, i, j);
        }
    }

    @v07
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @v07
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @v07
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @v07
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @v07
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i, -1L);
    }

    @v07
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @v07
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @v07
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @v07
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @v07
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @v07
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i);
        Iterator<MarkerListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().logMarker(reactMarkerConstants, str, i);
        }
    }
}
