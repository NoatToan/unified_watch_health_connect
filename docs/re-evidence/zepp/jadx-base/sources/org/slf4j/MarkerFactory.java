package org.slf4j;

import org.slf4j.helpers.BasicMarkerFactory;
import org.slf4j.helpers.Util;
import org.slf4j.impl.StaticMarkerBinder;

/* JADX INFO: loaded from: classes23.dex */
public class MarkerFactory {
    public static IMarkerFactory a;

    static {
        try {
            a = a();
        } catch (Exception e) {
            Util.report("Unexpected failure while binding MarkerFactory", e);
        } catch (NoClassDefFoundError unused) {
            a = new BasicMarkerFactory();
        }
    }

    private MarkerFactory() {
    }

    private static IMarkerFactory a() throws NoClassDefFoundError {
        try {
            return StaticMarkerBinder.getSingleton().getMarkerFactory();
        } catch (NoSuchMethodError unused) {
            return StaticMarkerBinder.SINGLETON.getMarkerFactory();
        }
    }

    public static Marker getDetachedMarker(String str) {
        return a.getDetachedMarker(str);
    }

    public static IMarkerFactory getIMarkerFactory() {
        return a;
    }

    public static Marker getMarker(String str) {
        return a.getMarker(str);
    }
}
