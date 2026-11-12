package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.huami.tools.analytics.DbUtils;
import com.huami.widget.share.ShareAnalytics;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u001d\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\bR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/facebook/LegacyTokenHelper;", "", "", "key", "Landroid/os/Bundle;", "bundle", "Landroid/content/SharedPreferences$Editor;", "editor", "", "b", "a", PointCategory.LOAD, ShareAnalytics.ParamValue.SAVE, "clear", "Ljava/lang/String;", "cacheKey", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "cache", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class LegacyTokenHelper {
    private static final String A = "enum";

    @NotNull
    public static final String APPLICATION_ID_KEY = "com.facebook.TokenCachingStrategy.ApplicationId";

    @NotNull
    public static final String DECLINED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.DeclinedPermissions";

    @NotNull
    public static final String DEFAULT_CACHE_KEY = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";

    @NotNull
    public static final String EXPIRATION_DATE_KEY = "com.facebook.TokenCachingStrategy.ExpirationDate";

    @NotNull
    public static final String EXPIRED_PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.ExpiredPermissions";

    @NotNull
    public static final String LAST_REFRESH_DATE_KEY = "com.facebook.TokenCachingStrategy.LastRefreshDate";

    @NotNull
    public static final String PERMISSIONS_KEY = "com.facebook.TokenCachingStrategy.Permissions";

    @NotNull
    public static final String TOKEN_KEY = "com.facebook.TokenCachingStrategy.Token";

    @NotNull
    public static final String TOKEN_SOURCE_KEY = "com.facebook.TokenCachingStrategy.AccessTokenSource";
    private static final long c = Long.MIN_VALUE;
    private static final String d = "com.facebook.TokenCachingStrategy.IsSSO";
    private static final String f = "valueType";
    private static final String g = "value";
    private static final String h = "enumType";
    private static final String i = "bool";
    private static final String j = "bool[]";
    private static final String k = "byte";
    private static final String l = "byte[]";
    private static final String m = "short";
    private static final String n = "short[]";
    private static final String o = "int";
    private static final String p = "int[]";
    private static final String q = "long";
    private static final String r = "long[]";
    private static final String s = "float";
    private static final String t = "float[]";
    private static final String u = "double";
    private static final String v = "double[]";
    private static final String w = "char";
    private static final String x = "char[]";
    private static final String y = "string";
    private static final String z = "stringList";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String cacheKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final SharedPreferences cache;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String e = LegacyTokenHelper.class.getSimpleName();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010IJ\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\"\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0012H\u0007J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0007J\u001e\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0007J\u001e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0017H\u0007J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u001bH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0006H\u0007J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010!\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0012H\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010#\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010%R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010%R\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010%R\u0016\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010%R\u0016\u0010*\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010%R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010%R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010%R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010%R\u0016\u00100\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b0\u0010%R\u0016\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b1\u0010%R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010%R\u0016\u00103\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b3\u0010%R\u0016\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010%R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u0010%R\u0016\u00106\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u0010%R\u0016\u00107\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u0010%R\u0016\u00108\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u0010%R\u0016\u00109\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b9\u0010%R\u0016\u0010:\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010%R\u0016\u0010;\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b;\u0010%R\u0016\u0010<\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u0010%R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010%R\u0016\u0010>\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u0010%R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u0010%R\u0016\u0010@\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u0010%R\u0016\u0010A\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010%R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u0010%R\u0016\u0010C\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010%R\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010%R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u0010%R\u0016\u0010F\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010%R\u0016\u0010G\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010%¨\u0006J"}, d2 = {"Lcom/facebook/LegacyTokenHelper$Companion;", "", "Landroid/os/Bundle;", "bundle", "", "key", "Ljava/util/Date;", "a", "date", "", "b", "", "hasTokenInformation", "getToken", "value", "putToken", "getExpirationDate", "putExpirationDate", "", "getExpirationMilliseconds", "putExpirationMilliseconds", "", "getPermissions", "", "putPermissions", "putDeclinedPermissions", "putExpiredPermissions", "Lcom/facebook/AccessTokenSource;", "getSource", "putSource", "getLastRefreshDate", "putLastRefreshDate", "getLastRefreshMilliseconds", "putLastRefreshMilliseconds", "getApplicationId", "putApplicationId", "APPLICATION_ID_KEY", "Ljava/lang/String;", "DECLINED_PERMISSIONS_KEY", "DEFAULT_CACHE_KEY", "EXPIRATION_DATE_KEY", "EXPIRED_PERMISSIONS_KEY", "INVALID_BUNDLE_MILLISECONDS", "J", "IS_SSO_KEY", "JSON_VALUE", "JSON_VALUE_ENUM_TYPE", "JSON_VALUE_TYPE", "LAST_REFRESH_DATE_KEY", "PERMISSIONS_KEY", "TAG", "TOKEN_KEY", "TOKEN_SOURCE_KEY", "TYPE_BOOLEAN", "TYPE_BOOLEAN_ARRAY", "TYPE_BYTE", "TYPE_BYTE_ARRAY", "TYPE_CHAR", "TYPE_CHAR_ARRAY", "TYPE_DOUBLE", "TYPE_DOUBLE_ARRAY", "TYPE_ENUM", "TYPE_FLOAT", "TYPE_FLOAT_ARRAY", "TYPE_INTEGER", "TYPE_INTEGER_ARRAY", "TYPE_LONG", "TYPE_LONG_ARRAY", "TYPE_SHORT", "TYPE_SHORT_ARRAY", "TYPE_STRING", "TYPE_STRING_LIST", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        private final Date a(Bundle bundle, String key) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(key, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        private final void b(Bundle bundle, String key, Date date) {
            bundle.putLong(key, date.getTime());
        }

        @JvmStatic
        @Nullable
        public final String getApplicationId(@NotNull Bundle bundle) {
            return bundle.getString(LegacyTokenHelper.APPLICATION_ID_KEY);
        }

        @JvmStatic
        @Nullable
        public final Date getExpirationDate(@NotNull Bundle bundle) {
            return a(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        public final long getExpirationMilliseconds(@NotNull Bundle bundle) {
            return bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY);
        }

        @JvmStatic
        @Nullable
        public final Date getLastRefreshDate(@NotNull Bundle bundle) {
            return a(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        public final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
            return bundle.getLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY);
        }

        @JvmStatic
        @Nullable
        public final Set<String> getPermissions(@NotNull Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY);
            if (stringArrayList != null) {
                return new HashSet(stringArrayList);
            }
            return null;
        }

        @JvmStatic
        @Nullable
        public final AccessTokenSource getSource(@NotNull Bundle bundle) {
            if (bundle.containsKey(LegacyTokenHelper.TOKEN_SOURCE_KEY)) {
                return (AccessTokenSource) bundle.getSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY);
            }
            return bundle.getBoolean(LegacyTokenHelper.d) ? AccessTokenSource.FACEBOOK_APPLICATION_WEB : AccessTokenSource.WEB_VIEW;
        }

        @JvmStatic
        @Nullable
        public final String getToken(@NotNull Bundle bundle) {
            return bundle.getString(LegacyTokenHelper.TOKEN_KEY);
        }

        @JvmStatic
        public final boolean hasTokenInformation(@Nullable Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString(LegacyTokenHelper.TOKEN_KEY)) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, 0L) == 0) ? false : true;
        }

        @JvmStatic
        public final void putApplicationId(@NotNull Bundle bundle, @Nullable String value) {
            bundle.putString(LegacyTokenHelper.APPLICATION_ID_KEY, value);
        }

        @JvmStatic
        public final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            bundle.putStringArrayList(LegacyTokenHelper.DECLINED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date value) {
            b(bundle, LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @JvmStatic
        public final void putExpirationMilliseconds(@NotNull Bundle bundle, long value) {
            bundle.putLong(LegacyTokenHelper.EXPIRATION_DATE_KEY, value);
        }

        @JvmStatic
        public final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            bundle.putStringArrayList(LegacyTokenHelper.EXPIRED_PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date value) {
            b(bundle, LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @JvmStatic
        public final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long value) {
            bundle.putLong(LegacyTokenHelper.LAST_REFRESH_DATE_KEY, value);
        }

        @JvmStatic
        public final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> value) {
            bundle.putStringArrayList(LegacyTokenHelper.PERMISSIONS_KEY, new ArrayList<>(value));
        }

        @JvmStatic
        public final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource value) {
            bundle.putSerializable(LegacyTokenHelper.TOKEN_SOURCE_KEY, value);
        }

        @JvmStatic
        public final void putToken(@NotNull Bundle bundle, @NotNull String value) {
            bundle.putString(LegacyTokenHelper.TOKEN_KEY, value);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LegacyTokenHelper(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    @JvmOverloads
    public LegacyTokenHelper(@NotNull Context context, @Nullable String str) {
        if (str != null) {
            str = str.length() == 0 ? DEFAULT_CACHE_KEY : str;
        }
        this.cacheKey = str;
        Context applicationContext = context.getApplicationContext();
        this.cache = (applicationContext != null ? applicationContext : context).getSharedPreferences(str, 0);
    }

    private final void a(String key, Bundle bundle) throws JSONException {
        String str;
        String string = this.cache.getString(key, MessageFormatter.c);
        if (string == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        JSONObject jSONObject = new JSONObject(string);
        String string2 = jSONObject.getString(f);
        if (Intrinsics.areEqual(string2, i)) {
            bundle.putBoolean(key, jSONObject.getBoolean("value"));
            return;
        }
        int i2 = 0;
        if (Intrinsics.areEqual(string2, j)) {
            JSONArray jSONArray = jSONObject.getJSONArray("value");
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i2 < length) {
                zArr[i2] = jSONArray.getBoolean(i2);
                i2++;
            }
            bundle.putBooleanArray(key, zArr);
            return;
        }
        if (Intrinsics.areEqual(string2, k)) {
            bundle.putByte(key, (byte) jSONObject.getInt("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, l)) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i2 < length2) {
                bArr[i2] = (byte) jSONArray2.getInt(i2);
                i2++;
            }
            bundle.putByteArray(key, bArr);
            return;
        }
        if (Intrinsics.areEqual(string2, "short")) {
            bundle.putShort(key, (short) jSONObject.getInt("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, n)) {
            JSONArray jSONArray3 = jSONObject.getJSONArray("value");
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i2 < length3) {
                sArr[i2] = (short) jSONArray3.getInt(i2);
                i2++;
            }
            bundle.putShortArray(key, sArr);
            return;
        }
        if (Intrinsics.areEqual(string2, o)) {
            bundle.putInt(key, jSONObject.getInt("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, p)) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("value");
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i2 < length4) {
                iArr[i2] = jSONArray4.getInt(i2);
                i2++;
            }
            bundle.putIntArray(key, iArr);
            return;
        }
        if (Intrinsics.areEqual(string2, "long")) {
            bundle.putLong(key, jSONObject.getLong("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, r)) {
            JSONArray jSONArray5 = jSONObject.getJSONArray("value");
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i2 < length5) {
                jArr[i2] = jSONArray5.getLong(i2);
                i2++;
            }
            bundle.putLongArray(key, jArr);
            return;
        }
        if (Intrinsics.areEqual(string2, "float")) {
            bundle.putFloat(key, (float) jSONObject.getDouble("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, t)) {
            JSONArray jSONArray6 = jSONObject.getJSONArray("value");
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i2 < length6) {
                fArr[i2] = (float) jSONArray6.getDouble(i2);
                i2++;
            }
            bundle.putFloatArray(key, fArr);
            return;
        }
        if (Intrinsics.areEqual(string2, u)) {
            bundle.putDouble(key, jSONObject.getDouble("value"));
            return;
        }
        if (Intrinsics.areEqual(string2, v)) {
            JSONArray jSONArray7 = jSONObject.getJSONArray("value");
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i2 < length7) {
                dArr[i2] = jSONArray7.getDouble(i2);
                i2++;
            }
            bundle.putDoubleArray(key, dArr);
            return;
        }
        if (Intrinsics.areEqual(string2, w)) {
            String string3 = jSONObject.getString("value");
            if (string3 == null || string3.length() != 1) {
                return;
            }
            bundle.putChar(key, string3.charAt(0));
            return;
        }
        if (Intrinsics.areEqual(string2, x)) {
            JSONArray jSONArray8 = jSONObject.getJSONArray("value");
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i3 = 0; i3 < length8; i3++) {
                String string4 = jSONArray8.getString(i3);
                if (string4 != null && string4.length() == 1) {
                    cArr[i3] = string4.charAt(0);
                }
            }
            bundle.putCharArray(key, cArr);
            return;
        }
        if (Intrinsics.areEqual(string2, "string")) {
            bundle.putString(key, jSONObject.getString("value"));
            return;
        }
        if (!Intrinsics.areEqual(string2, z)) {
            if (Intrinsics.areEqual(string2, A)) {
                try {
                    bundle.putSerializable(key, Enum.valueOf(Class.forName(jSONObject.getString(h)), jSONObject.getString("value")));
                    return;
                } catch (ClassNotFoundException | IllegalArgumentException unused) {
                    return;
                }
            }
            return;
        }
        JSONArray jSONArray9 = jSONObject.getJSONArray("value");
        int length9 = jSONArray9.length();
        ArrayList<String> arrayList = new ArrayList<>(length9);
        while (i2 < length9) {
            Object obj = jSONArray9.get(i2);
            if (obj == JSONObject.NULL) {
                str = null;
            } else {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                str = (String) obj;
            }
            arrayList.add(i2, str);
            i2++;
        }
        bundle.putStringArrayList(key, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x018e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0196  */
    private final void b(String key, Bundle bundle, SharedPreferences.Editor editor) throws JSONException {
        JSONArray jSONArray;
        String str;
        Object obj = bundle.get(key);
        if (obj != null) {
            JSONObject jSONObject = new JSONObject();
            String str2 = null;
            if (obj instanceof Byte) {
                jSONObject.put("value", (int) ((Number) obj).byteValue());
                str = k;
            } else if (obj instanceof Short) {
                jSONObject.put("value", (int) ((Number) obj).shortValue());
                str = "short";
            } else if (obj instanceof Integer) {
                jSONObject.put("value", ((Number) obj).intValue());
                str = o;
            } else if (obj instanceof Long) {
                jSONObject.put("value", ((Number) obj).longValue());
                str = "long";
            } else if (obj instanceof Float) {
                jSONObject.put("value", ((Number) obj).floatValue());
                str = "float";
            } else if (obj instanceof Double) {
                jSONObject.put("value", ((Number) obj).doubleValue());
                str = u;
            } else if (obj instanceof Boolean) {
                jSONObject.put("value", ((Boolean) obj).booleanValue());
                str = i;
            } else if (obj instanceof Character) {
                jSONObject.put("value", obj.toString());
                str = w;
            } else {
                if (!(obj instanceof String)) {
                    if (obj instanceof Enum) {
                        jSONObject.put("value", obj.toString());
                        jSONObject.put(h, ((Enum) obj).getClass().getName());
                        str = A;
                    } else {
                        jSONArray = new JSONArray();
                        int i2 = 0;
                        if (obj instanceof byte[]) {
                            byte[] bArr = (byte[]) obj;
                            int length = bArr.length;
                            while (i2 < length) {
                                jSONArray.put((int) bArr[i2]);
                                i2++;
                            }
                            str2 = l;
                        } else if (obj instanceof short[]) {
                            short[] sArr = (short[]) obj;
                            int length2 = sArr.length;
                            while (i2 < length2) {
                                jSONArray.put((int) sArr[i2]);
                                i2++;
                            }
                            str2 = n;
                        } else if (obj instanceof int[]) {
                            int[] iArr = (int[]) obj;
                            int length3 = iArr.length;
                            while (i2 < length3) {
                                jSONArray.put(iArr[i2]);
                                i2++;
                            }
                            str2 = p;
                        } else if (obj instanceof long[]) {
                            long[] jArr = (long[]) obj;
                            int length4 = jArr.length;
                            while (i2 < length4) {
                                jSONArray.put(jArr[i2]);
                                i2++;
                            }
                            str2 = r;
                        } else if (obj instanceof float[]) {
                            float[] fArr = (float[]) obj;
                            int length5 = fArr.length;
                            while (i2 < length5) {
                                jSONArray.put(fArr[i2]);
                                i2++;
                            }
                            str2 = t;
                        } else if (obj instanceof double[]) {
                            double[] dArr = (double[]) obj;
                            int length6 = dArr.length;
                            while (i2 < length6) {
                                jSONArray.put(dArr[i2]);
                                i2++;
                            }
                            str2 = v;
                        } else if (obj instanceof boolean[]) {
                            boolean[] zArr = (boolean[]) obj;
                            int length7 = zArr.length;
                            while (i2 < length7) {
                                jSONArray.put(zArr[i2]);
                                i2++;
                            }
                            str2 = j;
                        } else if (obj instanceof char[]) {
                            char[] cArr = (char[]) obj;
                            int length8 = cArr.length;
                            while (i2 < length8) {
                                jSONArray.put(String.valueOf(cArr[i2]));
                                i2++;
                            }
                            str2 = x;
                        } else if (obj instanceof List) {
                            for (Object obj2 : (List) obj) {
                                if (obj2 == null) {
                                    obj2 = JSONObject.NULL;
                                }
                                jSONArray.put(obj2);
                            }
                            str2 = z;
                        } else {
                            jSONArray = null;
                        }
                    }
                    if (str2 != null) {
                        jSONObject.put(f, str2);
                        if (jSONArray != null) {
                            jSONObject.putOpt("value", jSONArray);
                        }
                        editor.putString(key, jSONObject.toString());
                    }
                }
                jSONObject.put("value", obj);
                str = "string";
            }
            jSONArray = null;
            str2 = str;
            if (str2 != null) {
                jSONObject.put(f, str2);
                if (jSONArray != null) {
                    jSONObject.putOpt("value", jSONArray);
                }
                editor.putString(key, jSONObject.toString());
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final String getApplicationId(@NotNull Bundle bundle) {
        return INSTANCE.getApplicationId(bundle);
    }

    @JvmStatic
    @Nullable
    public static final Date getExpirationDate(@NotNull Bundle bundle) {
        return INSTANCE.getExpirationDate(bundle);
    }

    @JvmStatic
    public static final long getExpirationMilliseconds(@NotNull Bundle bundle) {
        return INSTANCE.getExpirationMilliseconds(bundle);
    }

    @JvmStatic
    @Nullable
    public static final Date getLastRefreshDate(@NotNull Bundle bundle) {
        return INSTANCE.getLastRefreshDate(bundle);
    }

    @JvmStatic
    public static final long getLastRefreshMilliseconds(@NotNull Bundle bundle) {
        return INSTANCE.getLastRefreshMilliseconds(bundle);
    }

    @JvmStatic
    @Nullable
    public static final Set<String> getPermissions(@NotNull Bundle bundle) {
        return INSTANCE.getPermissions(bundle);
    }

    @JvmStatic
    @Nullable
    public static final AccessTokenSource getSource(@NotNull Bundle bundle) {
        return INSTANCE.getSource(bundle);
    }

    @JvmStatic
    @Nullable
    public static final String getToken(@NotNull Bundle bundle) {
        return INSTANCE.getToken(bundle);
    }

    @JvmStatic
    public static final boolean hasTokenInformation(@Nullable Bundle bundle) {
        return INSTANCE.hasTokenInformation(bundle);
    }

    @JvmStatic
    public static final void putApplicationId(@NotNull Bundle bundle, @Nullable String str) {
        INSTANCE.putApplicationId(bundle, str);
    }

    @JvmStatic
    public static final void putDeclinedPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        INSTANCE.putDeclinedPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putExpirationDate(@NotNull Bundle bundle, @NotNull Date date) {
        INSTANCE.putExpirationDate(bundle, date);
    }

    @JvmStatic
    public static final void putExpirationMilliseconds(@NotNull Bundle bundle, long j2) {
        INSTANCE.putExpirationMilliseconds(bundle, j2);
    }

    @JvmStatic
    public static final void putExpiredPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        INSTANCE.putExpiredPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putLastRefreshDate(@NotNull Bundle bundle, @NotNull Date date) {
        INSTANCE.putLastRefreshDate(bundle, date);
    }

    @JvmStatic
    public static final void putLastRefreshMilliseconds(@NotNull Bundle bundle, long j2) {
        INSTANCE.putLastRefreshMilliseconds(bundle, j2);
    }

    @JvmStatic
    public static final void putPermissions(@NotNull Bundle bundle, @NotNull Collection<String> collection) {
        INSTANCE.putPermissions(bundle, collection);
    }

    @JvmStatic
    public static final void putSource(@NotNull Bundle bundle, @NotNull AccessTokenSource accessTokenSource) {
        INSTANCE.putSource(bundle, accessTokenSource);
    }

    @JvmStatic
    public static final void putToken(@NotNull Bundle bundle, @NotNull String str) {
        INSTANCE.putToken(bundle, str);
    }

    public final void clear() {
        this.cache.edit().clear().apply();
    }

    @Nullable
    public final Bundle load() {
        Bundle bundle = new Bundle();
        for (String str : this.cache.getAll().keySet()) {
            try {
                a(str, bundle);
            } catch (JSONException e2) {
                Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, e, "Error reading cached value for key: '" + str + "' -- " + e2);
                return null;
            }
        }
        return bundle;
    }

    public final void save(@NotNull Bundle bundle) {
        SharedPreferences.Editor editorEdit = this.cache.edit();
        for (String str : bundle.keySet()) {
            try {
                b(str, bundle, editorEdit);
            } catch (JSONException e2) {
                Logger.INSTANCE.log(LoggingBehavior.CACHE, 5, e, "Error processing value for key: '" + str + "' -- " + e2);
                return;
            }
        }
        editorEdit.apply();
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : str);
    }
}
