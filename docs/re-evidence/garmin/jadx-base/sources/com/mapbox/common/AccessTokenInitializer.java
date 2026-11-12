package com.mapbox.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import o13.l;
import o13.m;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R#\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/mapbox/common/AccessTokenInitializer;", "", "<init>", "()V", "", "getAccessTokenFromEnv", "()Ljava/lang/String;", "", "readEnvAndSetAccessToken", "", "isAccessTokenInitializationAllowed", "()Z", "allowed", "setAllowInitialization", "(Z)V", "getAllowInitialization", "MAPBOX_PREFERENCES_NAME", "Ljava/lang/String;", "SETTING_NAME", "TAG", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "Lo13/l;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AccessTokenInitializer {
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_initialization_settings";
    private static final String SETTING_NAME = "MapboxInitialized";
    private static final String TAG = "AccessTokenInitializer";
    public static final AccessTokenInitializer INSTANCE = new AccessTokenInitializer();

    /* JADX INFO: renamed from: preferences$delegate, reason: from kotlin metadata */
    private static final l preferences = m.b(AccessTokenInitializer$preferences$2.INSTANCE);

    private AccessTokenInitializer() {
    }

    public static final String getAccessTokenFromEnv() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier("mapbox_access_token", "string", str)) == 0) {
                return "";
            }
            String string = resources.getString(identifier);
            string.getClass();
            return string;
        } catch (Throwable unused) {
            Log.warning("Unable to fetch `mapbox_access_token` resource value", TAG);
            return "";
        }
    }

    private static final boolean getAllowInitialization() {
        try {
            return INSTANCE.getPreferences().getBoolean(SETTING_NAME, false);
        } catch (ClassCastException e4) {
            Log.error("Unable to get a value for MapboxInitialized: " + e4.getMessage(), TAG);
            return false;
        }
    }

    private final SharedPreferences getPreferences() {
        return (SharedPreferences) preferences.getValue();
    }

    public static final boolean isAccessTokenInitializationAllowed() {
        String str;
        Resources resources;
        int identifier;
        try {
            Context context = MapboxSDKCommon.INSTANCE.getContext();
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null || (str = applicationInfo.packageName) == null || (identifier = (resources = context.getResources()).getIdentifier("com.mapbox.common.enable_delayed_initialization_logic", "bool", str)) == 0 || !resources.getBoolean(identifier)) {
                return true;
            }
            return getAllowInitialization();
        } catch (Throwable th3) {
            Log.error("Unable to get access token initialization status: " + th3.getMessage(), TAG);
        }
        return true;
    }

    @o13.e
    public static final void readEnvAndSetAccessToken() {
    }

    public static final void setAllowInitialization(boolean allowed) {
        if (allowed) {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationTrue").increment();
        } else {
            FeatureTelemetryCounter.create("common/AccessToken/allowInitializationFalse").increment();
        }
        SharedPreferences.Editor editorEdit = INSTANCE.getPreferences().edit();
        editorEdit.putBoolean(SETTING_NAME, allowed);
        editorEdit.apply();
    }
}
