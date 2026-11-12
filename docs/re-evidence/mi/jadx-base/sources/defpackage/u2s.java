package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class u2s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f35322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f35323b;

    static {
        HashMap map = new HashMap();
        f35322a = map;
        HashMap map2 = new HashMap();
        f35323b = map2;
        map.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        map.put(-2, "The requested pack is not available.");
        map.put(-3, "The request is invalid.");
        map.put(-4, "The requested download is not found.");
        map.put(-5, "The Asset Delivery API is not available.");
        map.put(-6, "Network error. Unable to obtain the asset pack details.");
        map.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        map.put(-10, "Asset pack download failed due to insufficient storage.");
        map.put(-11, "The Play Store app is either not installed or not the official version.");
        map.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        map.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        map.put(-14, "Tried to show the confirmation dialog but no asset packs are waiting for user confirmation.");
        map.put(-14, "The installed app version was not installed by Play.");
        map.put(-100, "Unknown error downloading an asset pack.");
        map2.put(-1, "APP_UNAVAILABLE");
        map2.put(-2, "PACK_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(-4, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(-6, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(-10, "INSUFFICIENT_STORAGE");
        map2.put(-11, "PLAY_STORE_NOT_FOUND");
        map2.put(-12, "NETWORK_UNRESTRICTED");
        map2.put(-13, "APP_NOT_OWNED");
        map2.put(-14, "CONFIRMATION_NOT_REQUIRED");
        map2.put(-15, "UNRECOGNIZED_INSTALLATION");
        map2.put(-100, "INTERNAL_ERROR");
    }

    public static String a(int i) {
        Map map = f35322a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        return ((String) map.get(numValueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#" + ((String) f35323b.get(numValueOf)) + ")";
    }
}
