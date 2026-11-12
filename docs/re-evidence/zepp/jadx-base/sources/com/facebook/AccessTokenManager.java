package com.facebook;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 (2\u00020\u0001:\u0005()*\u000e+B\u0019\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\u0006\u0010 \u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\t\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006J\u0010\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006,"}, d2 = {"Lcom/facebook/AccessTokenManager;", "", "Lcom/facebook/AccessToken;", "currentAccessToken", "", "saveToCache", "", "c", "oldAccessToken", "b", GoogleApiAvailabilityLight.a, "e", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "callback", "a", "loadCurrentAccessToken", "currentAccessTokenChanged", "extendAccessTokenIfNeeded", "refreshCurrentAccessToken", "Lcom/facebook/AccessToken;", "currentAccessTokenField", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tokenRefreshInProgress", "Ljava/util/Date;", "Ljava/util/Date;", "lastAttemptedTokenExtendDate", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "localBroadcastManager", "Lcom/facebook/AccessTokenCache;", "Lcom/facebook/AccessTokenCache;", "accessTokenCache", "value", "getCurrentAccessToken", "()Lcom/facebook/AccessToken;", "setCurrentAccessToken", "(Lcom/facebook/AccessToken;)V", "<init>", "(Landroidx/localbroadcastmanager/content/LocalBroadcastManager;Lcom/facebook/AccessTokenCache;)V", "Companion", "FacebookRefreshTokenInfo", "InstagramRefreshTokenInfo", "RefreshTokenInfo", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessTokenManager {

    @NotNull
    public static final String ACTION_CURRENT_ACCESS_TOKEN_CHANGED = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EXTRA_NEW_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN";

    @NotNull
    public static final String EXTRA_OLD_ACCESS_TOKEN = "com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN";

    @NotNull
    public static final String SHARED_PREFERENCES_NAME = "com.facebook.AccessTokenManager.SharedPreferences";

    @NotNull
    public static final String TAG = "AccessTokenManager";
    private static final int f = 86400;
    private static final int g = 3600;
    private static final String h = "me/permissions";
    private static AccessTokenManager i;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private AccessToken currentAccessTokenField;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AtomicBoolean tokenRefreshInProgress = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Date lastAttemptedTokenExtendDate = new Date(0);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalBroadcastManager localBroadcastManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AccessTokenCache accessTokenCache;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0007R\u0016\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/facebook/AccessTokenManager$Companion;", "", "Lcom/facebook/AccessToken;", "accessToken", "Lcom/facebook/GraphRequest$Callback;", "callback", "Lcom/facebook/GraphRequest;", "b", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "c", "a", "Lcom/facebook/AccessTokenManager;", "getInstance", "", "ACTION_CURRENT_ACCESS_TOKEN_CHANGED", "Ljava/lang/String;", "EXTRA_NEW_ACCESS_TOKEN", "EXTRA_OLD_ACCESS_TOKEN", "ME_PERMISSIONS_GRAPH_PATH", "SHARED_PREFERENCES_NAME", "TAG", "", "TOKEN_EXTEND_RETRY_SECONDS", LogUtil.I, "TOKEN_EXTEND_THRESHOLD_SECONDS", "instanceField", "Lcom/facebook/AccessTokenManager;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest a(AccessToken accessToken, GraphRequest.Callback callback) {
            RefreshTokenInfo refreshTokenInfoC = c(accessToken);
            Bundle bundle = new Bundle();
            bundle.putString("grant_type", refreshTokenInfoC.getGrantType());
            bundle.putString("client_id", accessToken.getApplicationId());
            bundle.putString(GraphRequest.FIELDS_PARAM, "access_token,expires_at,expires_in,data_access_expiration_time,graph_domain");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(accessToken, refreshTokenInfoC.getGraphPath(), callback);
            graphRequestNewGraphPathRequest.setParameters(bundle);
            graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GraphRequest b(AccessToken accessToken, GraphRequest.Callback callback) {
            Bundle bundle = new Bundle();
            bundle.putString(GraphRequest.FIELDS_PARAM, "permission,status");
            GraphRequest graphRequestNewGraphPathRequest = GraphRequest.INSTANCE.newGraphPathRequest(accessToken, AccessTokenManager.h, callback);
            graphRequestNewGraphPathRequest.setParameters(bundle);
            graphRequestNewGraphPathRequest.setHttpMethod(HttpMethod.GET);
            return graphRequestNewGraphPathRequest;
        }

        private final RefreshTokenInfo c(AccessToken accessToken) {
            String graphDomain = accessToken.getGraphDomain();
            if (graphDomain == null) {
                graphDomain = "facebook";
            }
            return (graphDomain.hashCode() == 28903346 && graphDomain.equals("instagram")) ? new InstagramRefreshTokenInfo() : new FacebookRefreshTokenInfo();
        }

        @JvmStatic
        @NotNull
        public final AccessTokenManager getInstance() {
            AccessTokenManager accessTokenManager;
            AccessTokenManager accessTokenManager2 = AccessTokenManager.i;
            if (accessTokenManager2 != null) {
                return accessTokenManager2;
            }
            synchronized (this) {
                accessTokenManager = AccessTokenManager.i;
                if (accessTokenManager == null) {
                    AccessTokenManager accessTokenManager3 = new AccessTokenManager(LocalBroadcastManager.getInstance(FacebookSdk.getApplicationContext()), new AccessTokenCache());
                    AccessTokenManager.i = accessTokenManager3;
                    accessTokenManager = accessTokenManager3;
                }
            }
            return accessTokenManager;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/facebook/AccessTokenManager$FacebookRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "a", "Ljava/lang/String;", "getGraphPath", "()Ljava/lang/String;", "graphPath", "b", "getGrantType", "grantType", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class FacebookRefreshTokenInfo implements RefreshTokenInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String graphPath = "oauth/access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String grantType = "fb_extend_sso_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        @NotNull
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        @NotNull
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0007\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\n\u001a\u00020\u00028\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/facebook/AccessTokenManager$InstagramRefreshTokenInfo;", "Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "a", "Ljava/lang/String;", "getGraphPath", "()Ljava/lang/String;", "graphPath", "b", "getGrantType", "grantType", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class InstagramRefreshTokenInfo implements RefreshTokenInfo {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String graphPath = "refresh_access_token";

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String grantType = "ig_refresh_token";

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        @NotNull
        public String getGrantType() {
            return this.grantType;
        }

        @Override // com.facebook.AccessTokenManager.RefreshTokenInfo
        @NotNull
        public String getGraphPath() {
            return this.graphPath;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/facebook/AccessTokenManager$RefreshTokenInfo;", "", "", "getGraphPath", "()Ljava/lang/String;", "graphPath", "getGrantType", "grantType", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface RefreshTokenInfo {
        @NotNull
        String getGrantType();

        @NotNull
        String getGraphPath();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001a\u0010\u0005\"\u0004\b\u001b\u0010\u0007¨\u0006\u001f"}, d2 = {"com/facebook/AccessTokenManager$a", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "accessToken", "", "b", LogUtil.I, "c", "()I", "h", "(I)V", "expiresAt", GoogleApiAvailabilityLight.a, "i", "expiresIn", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "g", "(Ljava/lang/Long;)V", SDKConstants.PARAM_DATA_ACCESS_EXPIRATION_TIME, "e", z.j, SDKConstants.PARAM_GRAPH_DOMAIN, "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        private String accessToken;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int expiresAt;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int expiresIn;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private Long dataAccessExpirationTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private String graphDomain;

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccessToken() {
            return this.accessToken;
        }

        @Nullable
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Long getDataAccessExpirationTime() {
            return this.dataAccessExpirationTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getExpiresAt() {
            return this.expiresAt;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getExpiresIn() {
            return this.expiresIn;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getGraphDomain() {
            return this.graphDomain;
        }

        public final void f(@Nullable String str) {
            this.accessToken = str;
        }

        public final void g(@Nullable Long l) {
            this.dataAccessExpirationTime = l;
        }

        public final void h(int i) {
            this.expiresAt = i;
        }

        public final void i(int i) {
            this.expiresIn = i;
        }

        public final void j(@Nullable String str) {
            this.graphDomain = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ AccessToken.AccessTokenRefreshCallback b;

        public b(AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback) {
            this.b = accessTokenRefreshCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AccessTokenManager.this.a(this.b);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphRequestBatch;", "it", "", "onBatchCompleted", "(Lcom/facebook/GraphRequestBatch;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c implements GraphRequestBatch.Callback {
        public final /* synthetic */ a b;
        public final /* synthetic */ AccessToken c;
        public final /* synthetic */ AccessToken.AccessTokenRefreshCallback d;
        public final /* synthetic */ AtomicBoolean e;
        public final /* synthetic */ Set f;
        public final /* synthetic */ Set g;
        public final /* synthetic */ Set h;

        public c(a aVar, AccessToken accessToken, AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.b = aVar;
            this.c = accessToken;
            this.d = accessTokenRefreshCallback;
            this.e = atomicBoolean;
            this.f = set;
            this.g = set2;
            this.h = set3;
        }

        @Override // com.facebook.GraphRequestBatch.Callback
        public final void onBatchCompleted(@NotNull GraphRequestBatch graphRequestBatch) throws Throwable {
            String accessToken = this.b.getAccessToken();
            int expiresAt = this.b.getExpiresAt();
            Long dataAccessExpirationTime = this.b.getDataAccessExpirationTime();
            String graphDomain = this.b.getGraphDomain();
            AccessToken accessToken2 = null;
            try {
                Companion companion = AccessTokenManager.INSTANCE;
                if (companion.getInstance().getCurrentAccessTokenField() != null) {
                    AccessToken currentAccessTokenField = companion.getInstance().getCurrentAccessTokenField();
                    if ((currentAccessTokenField != null ? currentAccessTokenField.getUserId() : null) == this.c.getUserId()) {
                        if (!this.e.get() && accessToken == null && expiresAt == 0) {
                            AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback = this.d;
                            if (accessTokenRefreshCallback != null) {
                                accessTokenRefreshCallback.OnTokenRefreshFailed(new FacebookException("Failed to refresh access token"));
                            }
                            AccessTokenManager.this.tokenRefreshInProgress.set(false);
                            return;
                        }
                        Date expires = this.c.getExpires();
                        if (this.b.getExpiresAt() != 0) {
                            expires = new Date(((long) this.b.getExpiresAt()) * 1000);
                        } else if (this.b.getExpiresIn() != 0) {
                            expires = new Date((((long) this.b.getExpiresIn()) * 1000) + new Date().getTime());
                        }
                        Date date = expires;
                        if (accessToken == null) {
                            accessToken = this.c.getToken();
                        }
                        String str = accessToken;
                        String applicationId = this.c.getApplicationId();
                        String userId = this.c.getUserId();
                        Set<String> permissions = this.e.get() ? this.f : this.c.getPermissions();
                        Set<String> declinedPermissions = this.e.get() ? this.g : this.c.getDeclinedPermissions();
                        Set<String> expiredPermissions = this.e.get() ? this.h : this.c.getExpiredPermissions();
                        AccessTokenSource source = this.c.getSource();
                        Date date2 = new Date();
                        Date date3 = dataAccessExpirationTime != null ? new Date(dataAccessExpirationTime.longValue() * 1000) : this.c.getDataAccessExpirationTime();
                        if (graphDomain == null) {
                            graphDomain = this.c.getGraphDomain();
                        }
                        AccessToken accessToken3 = new AccessToken(str, applicationId, userId, permissions, declinedPermissions, expiredPermissions, source, date, date2, date3, graphDomain);
                        try {
                            companion.getInstance().setCurrentAccessToken(accessToken3);
                            AccessTokenManager.this.tokenRefreshInProgress.set(false);
                            AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback2 = this.d;
                            if (accessTokenRefreshCallback2 != null) {
                                accessTokenRefreshCallback2.OnTokenRefreshed(accessToken3);
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            accessToken2 = accessToken3;
                            AccessTokenManager.this.tokenRefreshInProgress.set(false);
                            AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback3 = this.d;
                            if (accessTokenRefreshCallback3 != null && accessToken2 != null) {
                                accessTokenRefreshCallback3.OnTokenRefreshed(accessToken2);
                            }
                            throw th;
                        }
                    }
                }
                AccessToken.AccessTokenRefreshCallback accessTokenRefreshCallback4 = this.d;
                if (accessTokenRefreshCallback4 != null) {
                    accessTokenRefreshCallback4.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                }
                AccessTokenManager.this.tokenRefreshInProgress.set(false);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d implements GraphRequest.Callback {
        public final /* synthetic */ AtomicBoolean a;
        public final /* synthetic */ Set b;
        public final /* synthetic */ Set c;
        public final /* synthetic */ Set d;

        public d(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.a = atomicBoolean;
            this.b = set;
            this.c = set2;
            this.d = set3;
        }

        /* JADX WARN: Code duplicated, block: B:33:0x0085  */
        /* JADX WARN: Instruction removed from duplicated block: B:33:0x0085, please report this as an issue */
        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            JSONArray jSONArrayOptJSONArray;
            JSONObject jsonObject = graphResponse.getJsonObject();
            if (jsonObject == null || (jSONArrayOptJSONArray = jsonObject.optJSONArray("data")) == null) {
                return;
            }
            this.a.set(true);
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString(PointCategory.PERMISSION);
                    String strOptString2 = jSONObjectOptJSONObject.optString("status");
                    if (!Utility.isNullOrEmpty(strOptString) && !Utility.isNullOrEmpty(strOptString2)) {
                        Locale locale = Locale.US;
                        Objects.requireNonNull(strOptString2, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = strOptString2.toLowerCase(locale);
                        if (lowerCase != null) {
                            int iHashCode = lowerCase.hashCode();
                            if (iHashCode != -1309235419) {
                                if (iHashCode != 280295099) {
                                    if (iHashCode == 568196142 && lowerCase.equals("declined")) {
                                        this.c.add(strOptString);
                                    } else {
                                        Log.w(AccessTokenManager.TAG, "Unexpected status: " + lowerCase);
                                    }
                                } else if (lowerCase.equals("granted")) {
                                    this.b.add(strOptString);
                                } else {
                                    Log.w(AccessTokenManager.TAG, "Unexpected status: " + lowerCase);
                                }
                            } else if (lowerCase.equals(Constants.EXPIRED)) {
                                this.d.add(strOptString);
                            } else {
                                Log.w(AccessTokenManager.TAG, "Unexpected status: " + lowerCase);
                            }
                        } else {
                            Log.w(AccessTokenManager.TAG, "Unexpected status: " + lowerCase);
                        }
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/facebook/GraphResponse;", AbstractJSONTokenResponse.RESPONSE, "", "onCompleted", "(Lcom/facebook/GraphResponse;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e implements GraphRequest.Callback {
        public final /* synthetic */ a a;

        public e(a aVar) {
            this.a = aVar;
        }

        @Override // com.facebook.GraphRequest.Callback
        public final void onCompleted(@NotNull GraphResponse graphResponse) {
            JSONObject jsonObject = graphResponse.getJsonObject();
            if (jsonObject != null) {
                this.a.f(jsonObject.optString("access_token"));
                this.a.h(jsonObject.optInt(com.google.firebase.crashlytics.internal.settings.b.a));
                this.a.i(jsonObject.optInt("expires_in"));
                this.a.g(Long.valueOf(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME)));
                this.a.j(jsonObject.optString("graph_domain", null));
            }
        }
    }

    public AccessTokenManager(@NotNull LocalBroadcastManager localBroadcastManager, @NotNull AccessTokenCache accessTokenCache) {
        this.localBroadcastManager = localBroadcastManager;
        this.accessTokenCache = accessTokenCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(AccessToken.AccessTokenRefreshCallback callback) {
        AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            if (callback != null) {
                callback.OnTokenRefreshFailed(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.tokenRefreshInProgress.compareAndSet(false, true)) {
            if (callback != null) {
                callback.OnTokenRefreshFailed(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.lastAttemptedTokenExtendDate = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        a aVar = new a();
        Companion companion = INSTANCE;
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch(companion.b(currentAccessTokenField, new d(atomicBoolean, hashSet, hashSet2, hashSet3)), companion.a(currentAccessTokenField, new e(aVar)));
        graphRequestBatch.addCallback(new c(aVar, currentAccessTokenField, callback, atomicBoolean, hashSet, hashSet2, hashSet3));
        graphRequestBatch.executeAsync();
    }

    private final void b(AccessToken oldAccessToken, AccessToken currentAccessToken) {
        Intent intent = new Intent(FacebookSdk.getApplicationContext(), (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
        intent.putExtra(EXTRA_OLD_ACCESS_TOKEN, oldAccessToken);
        intent.putExtra(EXTRA_NEW_ACCESS_TOKEN, currentAccessToken);
        this.localBroadcastManager.sendBroadcast(intent);
    }

    private final void c(AccessToken currentAccessToken, boolean saveToCache) {
        AccessToken accessToken = this.currentAccessTokenField;
        this.currentAccessTokenField = currentAccessToken;
        this.tokenRefreshInProgress.set(false);
        this.lastAttemptedTokenExtendDate = new Date(0L);
        if (saveToCache) {
            if (currentAccessToken != null) {
                this.accessTokenCache.save(currentAccessToken);
            } else {
                this.accessTokenCache.clear();
                Utility.clearFacebookCookies(FacebookSdk.getApplicationContext());
            }
        }
        if (Utility.areObjectsEqual(accessToken, currentAccessToken)) {
            return;
        }
        b(accessToken, currentAccessToken);
        d();
    }

    private final void d() {
        Context applicationContext = FacebookSdk.getApplicationContext();
        AccessToken.Companion companion = AccessToken.INSTANCE;
        AccessToken currentAccessToken = companion.getCurrentAccessToken();
        AlarmManager alarmManager = (AlarmManager) applicationContext.getSystemService("alarm");
        if (companion.isCurrentAccessTokenActive()) {
            if ((currentAccessToken != null ? currentAccessToken.getExpires() : null) == null || alarmManager == null) {
                return;
            }
            Intent intent = new Intent(applicationContext, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
            intent.setAction(ACTION_CURRENT_ACCESS_TOKEN_CHANGED);
            try {
                alarmManager.set(1, currentAccessToken.getExpires().getTime(), Build.VERSION.SDK_INT >= 23 ? PendingIntent.getBroadcast(applicationContext, 0, intent, 67108864) : PendingIntent.getBroadcast(applicationContext, 0, intent, 0));
            } catch (Exception unused) {
            }
        }
    }

    private final boolean e() {
        AccessToken currentAccessTokenField = getCurrentAccessTokenField();
        if (currentAccessTokenField == null) {
            return false;
        }
        long time = new Date().getTime();
        return currentAccessTokenField.getSource().getCanExtendToken() && time - this.lastAttemptedTokenExtendDate.getTime() > ((long) 3600000) && time - currentAccessTokenField.getLastRefresh().getTime() > ((long) 86400000);
    }

    @JvmStatic
    @NotNull
    public static final AccessTokenManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final void currentAccessTokenChanged() {
        b(getCurrentAccessTokenField(), getCurrentAccessTokenField());
    }

    public final void extendAccessTokenIfNeeded() {
        if (e()) {
            refreshCurrentAccessToken(null);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCurrentAccessToken, reason: from getter */
    public final AccessToken getCurrentAccessTokenField() {
        return this.currentAccessTokenField;
    }

    public final boolean loadCurrentAccessToken() {
        AccessToken accessTokenLoad = this.accessTokenCache.load();
        if (accessTokenLoad == null) {
            return false;
        }
        c(accessTokenLoad, false);
        return true;
    }

    public final void refreshCurrentAccessToken(@Nullable AccessToken.AccessTokenRefreshCallback callback) {
        if (Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper())) {
            a(callback);
        } else {
            new Handler(Looper.getMainLooper()).post(new b(callback));
        }
    }

    public final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
        c(accessToken, true);
    }
}
