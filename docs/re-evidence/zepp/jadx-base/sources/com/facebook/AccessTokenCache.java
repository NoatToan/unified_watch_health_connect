package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.widget.share.ShareAnalytics;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dB\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000b8C@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00058B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0019¨\u0006!"}, d2 = {"Lcom/facebook/AccessTokenCache;", "", "", GoogleApiAvailabilityLight.a, "e", "Lcom/facebook/AccessToken;", PointCategory.LOAD, "accessToken", "", ShareAnalytics.ParamValue.SAVE, "clear", "Lcom/facebook/LegacyTokenHelper;", "a", "Lcom/facebook/LegacyTokenHelper;", "tokenCachingStrategyField", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "sharedPreferences", "Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;", "c", "Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;", "tokenCachingStrategyFactory", "()Lcom/facebook/LegacyTokenHelper;", "tokenCachingStrategy", "()Lcom/facebook/AccessToken;", "cachedAccessToken", "legacyAccessToken", "<init>", "(Landroid/content/SharedPreferences;Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;)V", "()V", "Companion", "SharedPreferencesTokenCachingStrategyFactory", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessTokenCache {

    @NotNull
    public static final String CACHED_ACCESS_TOKEN_KEY = "com.facebook.AccessTokenManager.CachedAccessToken";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private LegacyTokenHelper tokenCachingStrategyField;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SharedPreferences sharedPreferences;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final SharedPreferencesTokenCachingStrategyFactory tokenCachingStrategyFactory;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;", "", "Lcom/facebook/LegacyTokenHelper;", "create", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class SharedPreferencesTokenCachingStrategyFactory {
        @NotNull
        public final LegacyTokenHelper create() {
            return new LegacyTokenHelper(FacebookSdk.getApplicationContext(), null, 2, null);
        }
    }

    public AccessTokenCache(@NotNull SharedPreferences sharedPreferences, @NotNull SharedPreferencesTokenCachingStrategyFactory sharedPreferencesTokenCachingStrategyFactory) {
        this.sharedPreferences = sharedPreferences;
        this.tokenCachingStrategyFactory = sharedPreferencesTokenCachingStrategyFactory;
    }

    private final AccessToken a() {
        String string = this.sharedPreferences.getString(CACHED_ACCESS_TOKEN_KEY, null);
        if (string == null) {
            return null;
        }
        try {
            return AccessToken.INSTANCE.createFromJSONObject$facebook_core_release(new JSONObject(string));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final AccessToken b() {
        Bundle bundleLoad = c().load();
        if (bundleLoad == null || !LegacyTokenHelper.INSTANCE.hasTokenInformation(bundleLoad)) {
            return null;
        }
        return AccessToken.INSTANCE.createFromLegacyCache$facebook_core_release(bundleLoad);
    }

    private final LegacyTokenHelper c() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            if (this.tokenCachingStrategyField == null) {
                synchronized (this) {
                    if (this.tokenCachingStrategyField == null) {
                        this.tokenCachingStrategyField = this.tokenCachingStrategyFactory.create();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            LegacyTokenHelper legacyTokenHelper = this.tokenCachingStrategyField;
            if (legacyTokenHelper != null) {
                return legacyTokenHelper;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final boolean d() {
        return this.sharedPreferences.contains(CACHED_ACCESS_TOKEN_KEY);
    }

    private final boolean e() {
        return FacebookSdk.isLegacyTokenUpgradeSupported();
    }

    public final void clear() {
        this.sharedPreferences.edit().remove(CACHED_ACCESS_TOKEN_KEY).apply();
        if (e()) {
            c().clear();
        }
    }

    @Nullable
    public final AccessToken load() {
        if (d()) {
            return a();
        }
        if (!e()) {
            return null;
        }
        AccessToken accessTokenB = b();
        if (accessTokenB == null) {
            return accessTokenB;
        }
        save(accessTokenB);
        c().clear();
        return accessTokenB;
    }

    public final void save(@NotNull AccessToken accessToken) {
        try {
            this.sharedPreferences.edit().putString(CACHED_ACCESS_TOKEN_KEY, accessToken.toJSONObject$facebook_core_release().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public AccessTokenCache() {
        this(FacebookSdk.getApplicationContext().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new SharedPreferencesTokenCachingStrategyFactory());
    }
}
