package com.google.android.play.core.splitinstall.model;

import com.nimbusds.jose.shaded.gson.internal.a;
import fb1.c;
import java.util.HashMap;
import java.util.Map;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
public final class zza {
    private static final Map zza;
    private static final Map zzb;
    private static final Map zzc;

    static {
        HashMap map = new HashMap();
        zza = map;
        HashMap map2 = new HashMap();
        zzb = map2;
        Integer numJ = c.j(-2, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", "A requested module is not available (to this user/device, for the installed apk).", map);
        Integer numJ2 = c.j(-4, -3, "Request is otherwise invalid.", "Requested session is not found.", map);
        Integer numJ3 = c.j(-6, -5, "Split Install API is not available.", "Network error: unable to obtain split details.", map);
        Integer numJ4 = c.j(-8, -7, "Download not permitted under current device circumstances (e.g. in background).", "Requested session contains modules from an existing active session and also new modules.", map);
        Integer numJ5 = c.j(-10, -9, "Service handling split install has died.", "Install failed due to insufficient storage.", map);
        Integer numJ6 = c.j(-12, -11, "Signature verification error when invoking SplitCompat.", "Error in SplitCompat emulation.", map);
        Integer numJ7 = c.j(-14, -13, "Error in copying files for SplitCompat.", "The Play Store app is either not installed or not the official version.", map);
        Integer numJ8 = c.j(-16, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "The download is too large to start over the current connection.", map);
        map.put(-100, "Unknown error processing split install.");
        map2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        map2.put(numJ, "MODULE_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numJ2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numJ3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numJ4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        map2.put(-9, "SERVICE_DIED");
        map2.put(numJ5, "INSUFFICIENT_STORAGE");
        map2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        map2.put(numJ6, "SPLITCOMPAT_EMULATION_ERROR");
        map2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        map2.put(numJ7, "PLAY_STORE_NOT_FOUND");
        map2.put(-15, "APP_NOT_OWNED");
        map2.put(numJ8, "DOWNLOAD_TOO_LARGE");
        map2.put(-100, "INTERNAL_ERROR");
        zzc = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            zzc.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }

    @SplitInstallErrorCode
    public static int zza(String str) {
        Integer num = (Integer) zzc.get(str);
        if (num != null) {
            return num.intValue();
        }
        h.s(String.valueOf(str).concat(" is unknown error."));
        return 0;
    }

    public static String zzb(@SplitInstallErrorCode int i14) {
        Map map = zza;
        Integer numValueOf = Integer.valueOf(i14);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        Map map2 = zzb;
        return !map2.containsKey(numValueOf) ? "" : a.h((String) map.get(numValueOf), " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#", (String) map2.get(numValueOf), ")");
    }
}
