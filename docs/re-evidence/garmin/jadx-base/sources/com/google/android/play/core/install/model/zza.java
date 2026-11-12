package com.google.android.play.core.install.model;

import com.nimbusds.jose.shaded.gson.internal.a;
import fb1.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class zza {
    private static final Map zza;
    private static final Map zzb;

    static {
        HashMap map = new HashMap();
        zza = map;
        HashMap map2 = new HashMap();
        zzb = map2;
        Integer numJ = c.j(-3, -2, "An unknown error occurred.", "The API is not available on this device.", map);
        Integer numJ2 = c.j(-5, -4, "The request that was sent by the app is malformed.", "The install is unavailable to this user or device.", map);
        Integer numJ3 = c.j(-7, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", "The install/update has not been (fully) downloaded yet.", map);
        Integer numJ4 = c.j(-9, -8, "The install is already in progress and there is no UI flow to resume.", "The Play Store app is either not installed or not the official version.", map);
        Integer numJ5 = c.j(-100, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "An internal error happened in the Play Store.", map);
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(numJ, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(numJ2, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(numJ3, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(numJ5, "ERROR_INTERNAL_ERROR");
        map2.put(numJ4, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(-10, "ERROR_APP_NOT_OWNED");
        map2.put(numJ5, "ERROR_INTERNAL_ERROR");
    }

    public static String zza(@InstallErrorCode int i14) {
        Map map = zza;
        Integer numValueOf = Integer.valueOf(i14);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        Map map2 = zzb;
        return !map2.containsKey(numValueOf) ? "" : a.h((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf), ")");
    }
}
