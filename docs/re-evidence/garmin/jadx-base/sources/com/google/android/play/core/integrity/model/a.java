package com.google.android.play.core.integrity.model;

import fb1.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map f53378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f53379b;

    static {
        HashMap map = new HashMap();
        f53378a = map;
        HashMap map2 = new HashMap();
        f53379b = map2;
        Integer numJ = c.j(-2, -1, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n", "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n", map);
        Integer numJ2 = c.j(-4, -3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n", "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n", map);
        Integer numJ3 = c.j(-6, -5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n", "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n", map);
        Integer numJ4 = c.j(-8, -7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n", "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n", map);
        Integer numJ5 = c.j(-10, -9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n", "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n", map);
        Integer numJ6 = c.j(-12, -11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n", "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", map);
        Integer numJ7 = c.j(-14, -13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n", "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n", map);
        Integer numJ8 = c.j(-16, -15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n", "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n", map);
        Integer numJ9 = c.j(-17, -100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", "There is a transient error on the calling device.\nRetry with an exponential backoff.\n", map);
        map2.put(-1, "API_NOT_AVAILABLE");
        map2.put(-3, "NETWORK_ERROR");
        map2.put(numJ, "PLAY_STORE_NOT_FOUND");
        map2.put(numJ2, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        map2.put(numJ7, "PLAY_STORE_VERSION_OUTDATED");
        map2.put(-5, "APP_NOT_INSTALLED");
        map2.put(numJ3, "PLAY_SERVICES_NOT_FOUND");
        map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        map2.put(-7, "APP_UID_MISMATCH");
        map2.put(numJ4, "TOO_MANY_REQUESTS");
        map2.put(-9, "CANNOT_BIND_TO_SERVICE");
        map2.put(numJ5, "NONCE_TOO_SHORT");
        map2.put(-11, "NONCE_TOO_LONG");
        map2.put(-13, "NONCE_IS_NOT_BASE64");
        map2.put(numJ8, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        map2.put(numJ6, "GOOGLE_SERVER_UNAVAILABLE");
        map2.put(-100, "INTERNAL_ERROR");
        map2.put(numJ9, "CLIENT_TRANSIENT_ERROR");
    }

    public static String a(int i14) {
        Map map = f53378a;
        Integer numValueOf = Integer.valueOf(i14);
        if (!map.containsKey(numValueOf)) {
            return "";
        }
        Map map2 = f53379b;
        return !map2.containsKey(numValueOf) ? "" : com.nimbusds.jose.shaded.gson.internal.a.h((String) map.get(numValueOf), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/IntegrityErrorCode.html#", (String) map2.get(numValueOf), ")");
    }
}
