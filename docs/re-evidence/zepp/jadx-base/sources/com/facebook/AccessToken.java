package com.facebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alipay.sdk.m.u.i;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.loc.z;
import com.xmlywind.sdk.common.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b&\n\u0002\u0010\u001e\n\u0002\b\u000b\u0018\u0000 Q2\u00020\u0001:\u0003RSQB\u008b\u0001\b\u0017\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0010\u0010&\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010I\u0012\u0010\u0010(\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010I\u0012\u0010\u0010+\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010I\u0012\b\u0010J\u001a\u0004\u0018\u00010\t\u0012\b\u0010K\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010L\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010A\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\bM\u0010NB\u0011\b\u0010\u0012\u0006\u0010O\u001a\u00020\u0019¢\u0006\u0004\bM\u0010PJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0018\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0012H\u0016R\u0019\u0010!\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R!\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R!\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b'\u0010%R!\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\"8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010%R\u0019\u00100\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u00105\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u00108\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010\u001e\u001a\u0004\b7\u0010 R\u0019\u0010;\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010-\u001a\u0004\b:\u0010/R\u0019\u0010>\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010/R\u0019\u0010A\u001a\u00020\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u001e\u001a\u0004\b@\u0010 R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010-\u001a\u0004\bC\u0010/R\u0013\u0010D\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0013\u0010F\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\bF\u0010ER\u0013\u0010G\u001a\u00020\u00108F@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010E¨\u0006T"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "", "c", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "a", "Lcom/facebook/AccessTokenSource;", "tokenSource", SDKConstants.PARAM_GRAPH_DOMAIN, "b", "toString", "", "other", "", "equals", "", "hashCode", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "()Lorg/json/JSONObject;", "toJSONObject", "describeContents", "Landroid/os/Parcel;", "dest", DataCacher.j, "writeToParcel", "Ljava/util/Date;", "Ljava/util/Date;", "getExpires", "()Ljava/util/Date;", "expires", "", "Ljava/util/Set;", "getPermissions", "()Ljava/util/Set;", "permissions", "getDeclinedPermissions", SDKConstants.PARAM_DECLINED_PERMISSIONS, GoogleApiAvailabilityLight.a, "getExpiredPermissions", SDKConstants.PARAM_EXPIRED_PERMISSIONS, "e", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "f", "Lcom/facebook/AccessTokenSource;", "getSource", "()Lcom/facebook/AccessTokenSource;", "source", "g", "getLastRefresh", "lastRefresh", "h", "getApplicationId", "applicationId", "i", "getUserId", "userId", z.j, "getDataAccessExpirationTime", SDKConstants.PARAM_DATA_ACCESS_EXPIRATION_TIME, hl.k, "getGraphDomain", Constants.IS_EXPIRED, "()Z", "isDataAccessExpired", "isInstagramToken", "accessToken", "", SDKConstants.PARAM_ACCESS_TOKEN_SOURCE, SDKConstants.PARAM_EXPIRATION_TIME, SDKConstants.PARAM_LAST_REFRESH_TIME, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "(Landroid/os/Parcel;)V", "Companion", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AccessToken implements Parcelable {

    @NotNull
    public static final String ACCESS_TOKEN_KEY = "access_token";

    @JvmField
    @NotNull
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DATA_ACCESS_EXPIRATION_TIME = "data_access_expiration_time";

    @NotNull
    public static final String DEFAULT_GRAPH_DOMAIN = "facebook";

    @NotNull
    public static final String EXPIRES_IN_KEY = "expires_in";

    @NotNull
    public static final String GRAPH_DOMAIN = "graph_domain";

    @NotNull
    public static final String USER_ID_KEY = "user_id";
    private static final Date l;
    private static final Date m;
    private static final Date n;
    private static final AccessTokenSource o;
    private static final int p = 1;
    private static final String q = "version";
    private static final String r = "expires_at";
    private static final String s = "permissions";
    private static final String t = "declined_permissions";
    private static final String u = "expired_permissions";
    private static final String v = "token";
    private static final String w = "source";
    private static final String x = "last_refresh";
    private static final String y = "application_id";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Date expires;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Set<String> permissions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Set<String> declinedPermissions;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Set<String> expiredPermissions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String token;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final AccessTokenSource source;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Date lastRefresh;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String applicationId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Date dataAccessExpirationTime;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final String graphDomain;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "", "Lcom/facebook/AccessToken;", "token", "", "onSuccess", "Lcom/facebook/FacebookException;", "error", "onError", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface AccessTokenCreationCallback {
        void onError(@Nullable FacebookException error);

        void onSuccess(@Nullable AccessToken token);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "Lcom/facebook/AccessToken;", "accessToken", "", "OnTokenRefreshed", "Lcom/facebook/FacebookException;", io.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION, "OnTokenRefreshFailed", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface AccessTokenRefreshCallback {
        void OnTokenRefreshFailed(@Nullable FacebookException exception);

        void OnTokenRefreshed(@Nullable AccessToken accessToken);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bN\u0010OJ<\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007J\b\u0010\u0013\u001a\u00020\u0012H\u0007J\b\u0010\u0014\u001a\u00020\u0012H\u0007J\b\u0010\u0015\u001a\u00020\u0012H\u0007J\b\u0010\u0016\u001a\u00020\u0010H\u0007J\b\u0010\u0017\u001a\u00020\u0010H\u0007J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007J \u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001cH\u0007J!\u0010\"\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b&\u0010'J)\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b/\u00100R\u0016\u00102\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00103R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\f058\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u00103R\u0016\u0010<\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00103R\u0016\u0010=\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bA\u00103R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0016\u0010C\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00103R\u0016\u0010D\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00103R\u0016\u0010E\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bE\u00103R\u0016\u0010F\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bF\u00103R\u0016\u0010G\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00103R\u0016\u0010H\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010@R\u0016\u0010I\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u00103R\u0016\u0010J\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u00103R\u0016\u0010K\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u00103R\u0016\u0010L\u001a\u00020\u00038\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\bL\u00103R\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u00103¨\u0006P"}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "", "", "requestedPermissions", "Landroid/os/Bundle;", "bundle", "Lcom/facebook/AccessTokenSource;", "source", "Ljava/util/Date;", "expirationBase", "applicationId", "Lcom/facebook/AccessToken;", "a", "getCurrentAccessToken", "accessToken", "", "setCurrentAccessToken", "", "isCurrentAccessTokenActive", "isDataAccessActive", "isLoggedInWithInstagram", "expireCurrentAccessToken", "refreshCurrentAccessTokenAsync", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "callback", "Landroid/content/Intent;", "intent", "Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "accessTokenCallback", "createFromNativeLinkingIntent", "current", "createFromRefresh$facebook_core_release", "(Lcom/facebook/AccessToken;Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "createFromRefresh", "createExpired$facebook_core_release", "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;", "createExpired", "createFromLegacyCache$facebook_core_release", "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;", "createFromLegacyCache", "key", "getPermissionsFromBundle$facebook_core_release", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "getPermissionsFromBundle", "Lorg/json/JSONObject;", "jsonObject", "createFromJSONObject$facebook_core_release", "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;", "createFromJSONObject", "ACCESS_TOKEN_KEY", "Ljava/lang/String;", "APPLICATION_ID_KEY", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "CURRENT_JSON_FORMAT", LogUtil.I, "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final AccessToken a(List<String> requestedPermissions, Bundle bundle, AccessTokenSource source, Date expirationBase, String applicationId) {
            Date bundleLongAsDate;
            String string;
            String string2 = bundle.getString("access_token");
            if (string2 == null || (bundleLongAsDate = Utility.getBundleLongAsDate(bundle, "expires_in", expirationBase)) == null || (string = bundle.getString("user_id")) == null) {
                return null;
            }
            return new AccessToken(string2, applicationId, string, requestedPermissions, null, null, source, bundleLongAsDate, new Date(), Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L)), null, 1024, null);
        }

        @NotNull
        public final AccessToken createExpired$facebook_core_release(@NotNull AccessToken current) {
            return new AccessToken(current.getToken(), current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), new Date(), new Date(), current.getDataAccessExpirationTime(), null, 1024, null);
        }

        @JvmStatic
        @NotNull
        public final AccessToken createFromJSONObject$facebook_core_release(@NotNull JSONObject jsonObject) throws JSONException {
            if (jsonObject.getInt("version") > 1) {
                throw new FacebookException("Unknown AccessToken serialization format.");
            }
            String string = jsonObject.getString("token");
            Date date = new Date(jsonObject.getLong("expires_at"));
            JSONArray jSONArray = jsonObject.getJSONArray("permissions");
            JSONArray jSONArray2 = jsonObject.getJSONArray(AccessToken.t);
            JSONArray jSONArrayOptJSONArray = jsonObject.optJSONArray(AccessToken.u);
            Date date2 = new Date(jsonObject.getLong(AccessToken.x));
            AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(jsonObject.getString("source"));
            return new AccessToken(string, jsonObject.getString(AccessToken.y), jsonObject.getString("user_id"), Utility.jsonArrayToStringList(jSONArray), Utility.jsonArrayToStringList(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : Utility.jsonArrayToStringList(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, new Date(jsonObject.optLong(AccessToken.DATA_ACCESS_EXPIRATION_TIME, 0L)), jsonObject.optString("graph_domain", null));
        }

        @JvmStatic
        @Nullable
        public final AccessToken createFromLegacyCache$facebook_core_release(@NotNull Bundle bundle) {
            String string;
            List<String> permissionsFromBundle$facebook_core_release = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release2 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.DECLINED_PERMISSIONS_KEY);
            List<String> permissionsFromBundle$facebook_core_release3 = getPermissionsFromBundle$facebook_core_release(bundle, LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY);
            LegacyTokenHelper.Companion companion = LegacyTokenHelper.INSTANCE;
            String applicationId = companion.getApplicationId(bundle);
            if (Utility.isNullOrEmpty(applicationId)) {
                applicationId = FacebookSdk.getApplicationId();
            }
            String str = applicationId;
            String token = companion.getToken(bundle);
            if (token != null) {
                JSONObject jSONObjectAwaitGetGraphMeRequestWithCache = Utility.awaitGetGraphMeRequestWithCache(token);
                if (jSONObjectAwaitGetGraphMeRequestWithCache != null) {
                    try {
                        string = jSONObjectAwaitGetGraphMeRequestWithCache.getString("id");
                    } catch (JSONException unused) {
                        return null;
                    }
                } else {
                    string = null;
                }
                if (str != null && string != null) {
                    return new AccessToken(token, str, string, permissionsFromBundle$facebook_core_release, permissionsFromBundle$facebook_core_release2, permissionsFromBundle$facebook_core_release3, companion.getSource(bundle), companion.getExpirationDate(bundle), companion.getLastRefreshDate(bundle), null, null, 1024, null);
                }
            }
            return null;
        }

        @JvmStatic
        public final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull final String applicationId, @NotNull final AccessTokenCreationCallback accessTokenCallback) {
            if (intent.getExtras() == null) {
                accessTokenCallback.onError(new FacebookException("No extras found on intent"));
                return;
            }
            final Bundle bundle = new Bundle(intent.getExtras());
            String string = bundle.getString("access_token");
            if (string != null) {
                if (!(string.length() == 0)) {
                    String string2 = bundle.getString("user_id");
                    if (string2 != null) {
                        if (!(string2.length() == 0)) {
                            accessTokenCallback.onSuccess(a(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                            return;
                        }
                    }
                    Utility.getGraphMeRequestWithCacheAsync(string, new Utility.GraphMeRequestWithCacheCallback() { // from class: com.facebook.AccessToken$Companion$createFromNativeLinkingIntent$1
                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onFailure(@Nullable FacebookException error) {
                            accessTokenCallback.onError(error);
                        }

                        @Override // com.facebook.internal.Utility.GraphMeRequestWithCacheCallback
                        public void onSuccess(@Nullable JSONObject userInfo) {
                            String string3;
                            if (userInfo != null) {
                                try {
                                    string3 = userInfo.getString("id");
                                } catch (Exception unused) {
                                    accessTokenCallback.onError(new FacebookException("Unable to generate access token due to missing user id"));
                                    return;
                                }
                            } else {
                                string3 = null;
                            }
                            if (string3 == null) {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            bundle.putString("user_id", string3);
                            accessTokenCallback.onSuccess(AccessToken.INSTANCE.a(null, bundle, AccessTokenSource.FACEBOOK_APPLICATION_WEB, new Date(), applicationId));
                        }
                    });
                    return;
                }
            }
            accessTokenCallback.onError(new FacebookException("No access token found on intent"));
        }

        @JvmStatic
        @SuppressLint({"FieldGetter"})
        @Nullable
        public final AccessToken createFromRefresh$facebook_core_release(@NotNull AccessToken current, @NotNull Bundle bundle) {
            if (current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_WEB && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_NATIVE && current.getSource() != AccessTokenSource.FACEBOOK_APPLICATION_SERVICE) {
                throw new FacebookException("Invalid token source: " + current.getSource());
            }
            Date bundleLongAsDate = Utility.getBundleLongAsDate(bundle, "expires_in", new Date(0L));
            String string = bundle.getString("access_token");
            if (string == null) {
                return null;
            }
            String string2 = bundle.getString("graph_domain");
            Date bundleLongAsDate2 = Utility.getBundleLongAsDate(bundle, AccessToken.DATA_ACCESS_EXPIRATION_TIME, new Date(0L));
            if (Utility.isNullOrEmpty(string)) {
                return null;
            }
            return new AccessToken(string, current.getApplicationId(), current.getUserId(), current.getPermissions(), current.getDeclinedPermissions(), current.getExpiredPermissions(), current.getSource(), bundleLongAsDate, new Date(), bundleLongAsDate2, string2);
        }

        @JvmStatic
        public final void expireCurrentAccessToken() {
            AccessToken currentAccessTokenField = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            if (currentAccessTokenField != null) {
                setCurrentAccessToken(createExpired$facebook_core_release(currentAccessTokenField));
            }
        }

        @JvmStatic
        @Nullable
        public final AccessToken getCurrentAccessToken() {
            return AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
        }

        @JvmStatic
        @NotNull
        public final List<String> getPermissionsFromBundle$facebook_core_release(@NotNull Bundle bundle, @Nullable String key) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(key);
            return stringArrayList == null ? CollectionsKt__CollectionsKt.emptyList() : Collections.unmodifiableList(new ArrayList(stringArrayList));
        }

        @JvmStatic
        public final boolean isCurrentAccessTokenActive() {
            AccessToken currentAccessTokenField = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isDataAccessActive() {
            AccessToken currentAccessTokenField = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isDataAccessExpired()) ? false : true;
        }

        @JvmStatic
        public final boolean isLoggedInWithInstagram() {
            AccessToken currentAccessTokenField = AccessTokenManager.INSTANCE.getInstance().getCurrentAccessTokenField();
            return (currentAccessTokenField == null || currentAccessTokenField.isExpired() || !currentAccessTokenField.isInstagramToken()) ? false : true;
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync() {
            AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(null);
        }

        @JvmStatic
        public final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
            AccessTokenManager.INSTANCE.getInstance().setCurrentAccessToken(accessToken);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback callback) {
            AccessTokenManager.INSTANCE.getInstance().refreshCurrentAccessToken(callback);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccessTokenSource.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[AccessTokenSource.FACEBOOK_APPLICATION_WEB.ordinal()] = 1;
            iArr[AccessTokenSource.CHROME_CUSTOM_TAB.ordinal()] = 2;
            iArr[AccessTokenSource.WEB_VIEW.ordinal()] = 3;
        }
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        l = date;
        m = date;
        n = new Date();
        o = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new Parcelable.Creator<AccessToken>() { // from class: com.facebook.AccessToken$Companion$CREATOR$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken createFromParcel(@NotNull Parcel source) {
                return new AccessToken(source);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @NotNull
            public AccessToken[] newArray(int size) {
                return new AccessToken[size];
            }
        };
    }

    @JvmOverloads
    public AccessToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null, 1024, null);
    }

    public /* synthetic */ AccessToken(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, (i & 1024) != 0 ? "facebook" : str4);
    }

    private final void a(StringBuilder builder) {
        builder.append(" permissions:");
        builder.append("[");
        builder.append(TextUtils.join(", ", this.permissions));
        builder.append("]");
    }

    private final AccessTokenSource b(AccessTokenSource tokenSource, String graphDomain) {
        if (graphDomain == null || !graphDomain.equals("instagram")) {
            return tokenSource;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[tokenSource.ordinal()];
        if (i == 1) {
            return AccessTokenSource.INSTAGRAM_APPLICATION_WEB;
        }
        if (i != 2) {
            return i != 3 ? tokenSource : AccessTokenSource.INSTAGRAM_WEB_VIEW;
        }
        return AccessTokenSource.INSTAGRAM_CUSTOM_CHROME_TAB;
    }

    private final String c() {
        return FacebookSdk.isLoggingBehaviorEnabled(LoggingBehavior.INCLUDE_ACCESS_TOKENS) ? this.token : "ACCESS_TOKEN_REMOVED";
    }

    @JvmStatic
    public static final void createFromNativeLinkingIntent(@NotNull Intent intent, @NotNull String str, @NotNull AccessTokenCreationCallback accessTokenCreationCallback) {
        INSTANCE.createFromNativeLinkingIntent(intent, str, accessTokenCreationCallback);
    }

    @JvmStatic
    public static final void expireCurrentAccessToken() {
        INSTANCE.expireCurrentAccessToken();
    }

    @JvmStatic
    @Nullable
    public static final AccessToken getCurrentAccessToken() {
        return INSTANCE.getCurrentAccessToken();
    }

    @JvmStatic
    public static final boolean isCurrentAccessTokenActive() {
        return INSTANCE.isCurrentAccessTokenActive();
    }

    @JvmStatic
    public static final boolean isDataAccessActive() {
        return INSTANCE.isDataAccessActive();
    }

    @JvmStatic
    public static final boolean isLoggedInWithInstagram() {
        return INSTANCE.isLoggedInWithInstagram();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync() {
        INSTANCE.refreshCurrentAccessTokenAsync();
    }

    @JvmStatic
    public static final void refreshCurrentAccessTokenAsync(@Nullable AccessTokenRefreshCallback accessTokenRefreshCallback) {
        INSTANCE.refreshCurrentAccessTokenAsync(accessTokenRefreshCallback);
    }

    @JvmStatic
    public static final void setCurrentAccessToken(@Nullable AccessToken accessToken) {
        INSTANCE.setCurrentAccessToken(accessToken);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        boolean zAreEqual;
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) other;
        if (Intrinsics.areEqual(this.expires, accessToken.expires) && Intrinsics.areEqual(this.permissions, accessToken.permissions) && Intrinsics.areEqual(this.declinedPermissions, accessToken.declinedPermissions) && Intrinsics.areEqual(this.expiredPermissions, accessToken.expiredPermissions) && Intrinsics.areEqual(this.token, accessToken.token) && this.source == accessToken.source && Intrinsics.areEqual(this.lastRefresh, accessToken.lastRefresh) && Intrinsics.areEqual(this.applicationId, accessToken.applicationId) && Intrinsics.areEqual(this.userId, accessToken.userId) && Intrinsics.areEqual(this.dataAccessExpirationTime, accessToken.dataAccessExpirationTime)) {
            String str = this.graphDomain;
            String str2 = accessToken.graphDomain;
            if (str == null) {
                zAreEqual = str2 == null;
            } else {
                zAreEqual = Intrinsics.areEqual(str, str2);
            }
            if (zAreEqual) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getApplicationId() {
        return this.applicationId;
    }

    @NotNull
    public final Date getDataAccessExpirationTime() {
        return this.dataAccessExpirationTime;
    }

    @NotNull
    public final Set<String> getDeclinedPermissions() {
        return this.declinedPermissions;
    }

    @NotNull
    public final Set<String> getExpiredPermissions() {
        return this.expiredPermissions;
    }

    @NotNull
    public final Date getExpires() {
        return this.expires;
    }

    @Nullable
    public final String getGraphDomain() {
        return this.graphDomain;
    }

    @NotNull
    public final Date getLastRefresh() {
        return this.lastRefresh;
    }

    @NotNull
    public final Set<String> getPermissions() {
        return this.permissions;
    }

    @NotNull
    public final AccessTokenSource getSource() {
        return this.source;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iHashCode = (((((((((((((((((((527 + this.expires.hashCode()) * 31) + this.permissions.hashCode()) * 31) + this.declinedPermissions.hashCode()) * 31) + this.expiredPermissions.hashCode()) * 31) + this.token.hashCode()) * 31) + this.source.hashCode()) * 31) + this.lastRefresh.hashCode()) * 31) + this.applicationId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.dataAccessExpirationTime.hashCode()) * 31;
        String str = this.graphDomain;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean isDataAccessExpired() {
        return new Date().after(this.dataAccessExpirationTime);
    }

    public final boolean isExpired() {
        return new Date().after(this.expires);
    }

    public final boolean isInstagramToken() {
        String str = this.graphDomain;
        return str != null && str.equals("instagram");
    }

    @NotNull
    public final JSONObject toJSONObject$facebook_core_release() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.token);
        jSONObject.put("expires_at", this.expires.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.permissions));
        jSONObject.put(t, new JSONArray((Collection) this.declinedPermissions));
        jSONObject.put(u, new JSONArray((Collection) this.expiredPermissions));
        jSONObject.put(x, this.lastRefresh.getTime());
        jSONObject.put("source", this.source.name());
        jSONObject.put(y, this.applicationId);
        jSONObject.put("user_id", this.userId);
        jSONObject.put(DATA_ACCESS_EXPIRATION_TIME, this.dataAccessExpirationTime.getTime());
        String str = this.graphDomain;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(c());
        a(sb);
        sb.append(i.d);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.writeLong(this.expires.getTime());
        dest.writeStringList(new ArrayList(this.permissions));
        dest.writeStringList(new ArrayList(this.declinedPermissions));
        dest.writeStringList(new ArrayList(this.expiredPermissions));
        dest.writeString(this.token);
        dest.writeString(this.source.name());
        dest.writeLong(this.lastRefresh.getTime());
        dest.writeString(this.applicationId);
        dest.writeString(this.userId);
        dest.writeLong(this.dataAccessExpirationTime.getTime());
        dest.writeString(this.graphDomain);
    }

    @JvmOverloads
    public AccessToken(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable Collection<String> collection, @Nullable Collection<String> collection2, @Nullable Collection<String> collection3, @Nullable AccessTokenSource accessTokenSource, @Nullable Date date, @Nullable Date date2, @Nullable Date date3, @Nullable String str4) {
        Validate.notEmpty(str, "accessToken");
        Validate.notEmpty(str2, "applicationId");
        Validate.notEmpty(str3, "userId");
        this.expires = date == null ? m : date;
        this.permissions = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.declinedPermissions = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.expiredPermissions = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.token = str;
        this.source = b(accessTokenSource == null ? o : accessTokenSource, str4);
        this.lastRefresh = date2 == null ? n : date2;
        this.applicationId = str2;
        this.userId = str3;
        this.dataAccessExpirationTime = (date3 == null || date3.getTime() == 0) ? m : date3;
        this.graphDomain = str4 == null ? "facebook" : str4;
    }

    public AccessToken(@NotNull Parcel parcel) {
        AccessTokenSource accessTokenSourceValueOf;
        this.expires = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.permissions = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.declinedPermissions = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.expiredPermissions = Collections.unmodifiableSet(new HashSet(arrayList));
        this.token = Validate.notNullOrEmpty(parcel.readString(), "token");
        String string = parcel.readString();
        if (string != null) {
            accessTokenSourceValueOf = AccessTokenSource.valueOf(string);
        } else {
            accessTokenSourceValueOf = o;
        }
        this.source = accessTokenSourceValueOf;
        this.lastRefresh = new Date(parcel.readLong());
        this.applicationId = Validate.notNullOrEmpty(parcel.readString(), "applicationId");
        this.userId = Validate.notNullOrEmpty(parcel.readString(), "userId");
        this.dataAccessExpirationTime = new Date(parcel.readLong());
        this.graphDomain = parcel.readString();
    }
}
