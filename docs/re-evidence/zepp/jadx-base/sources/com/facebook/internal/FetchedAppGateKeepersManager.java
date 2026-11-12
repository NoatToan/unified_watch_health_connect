package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.amap.api.mapcore.util.hl;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.internal.gatekeeper.GateKeeper;
import com.facebook.internal.gatekeeper.GateKeeperRuntimeCache;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001HB\t\b\u0002¢\u0006\u0004\bF\u0010GJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007J\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0007J\u001a\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0007J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J!\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0005\u001a\u00020\u0004J\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u001d2\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u0018\u0010 \u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001fR\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010*\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001fR\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\u001fR\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\u001fR\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\u001fR\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010?\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager;", "", "Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "callback", "", "loadAppGateKeepersAsync", "c", "", "applicationId", "", "forceRequery", "Lorg/json/JSONObject;", "queryAppGateKeepers", "name", "defaultValue", "getGateKeeperForKey", "Lcom/facebook/internal/gatekeeper/GateKeeper;", "gateKeeper", "setRuntimeGateKeeper", "resetRuntimeGateKeeperCache", "a", "gateKeepersJSON", "parseAppGateKeepersFromJSON$facebook_core_release", "(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject;", "parseAppGateKeepersFromJSON", "", "timestamp", "b", "(Ljava/lang/Long;)Z", "", "getGateKeepersForApplication", "Ljava/lang/String;", "TAG", "APP_GATEKEEPERS_PREFS_STORE", "APP_GATEKEEPERS_PREFS_KEY_FORMAT", GoogleApiAvailabilityLight.a, "APP_PLATFORM", "e", "APPLICATION_GATEKEEPER_EDGE", "f", "APPLICATION_GATEKEEPER_FIELD", "g", "APPLICATION_GRAPH_DATA", "h", "APPLICATION_FIELDS", "i", "APPLICATION_PLATFORM", z.j, "APPLICATION_SDK_VERSION", "Ljava/util/concurrent/atomic/AtomicBoolean;", hl.k, "Ljava/util/concurrent/atomic/AtomicBoolean;", "isLoading", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "l", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "callbacks", "", "m", "Ljava/util/Map;", "fetchedAppGateKeepers", GoogleApiAvailabilityLight.b, "J", "APPLICATION_GATEKEEPER_CACHE_TIMEOUT", "o", "Ljava/lang/Long;", "Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", com.google.android.exoplayer2.text.ttml.b.r, "Lcom/facebook/internal/gatekeeper/GateKeeperRuntimeCache;", "gateKeeperRuntimeCache", "<init>", "()V", "Callback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class FetchedAppGateKeepersManager {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String APP_GATEKEEPERS_PREFS_STORE = "com.facebook.internal.preferences.APP_GATEKEEPERS";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final String APP_GATEKEEPERS_PREFS_KEY_FORMAT = "com.facebook.internal.APP_GATEKEEPERS.%s";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final String APP_PLATFORM = "android";

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final String APPLICATION_GATEKEEPER_EDGE = "mobile_sdk_gk";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final String APPLICATION_GATEKEEPER_FIELD = "gatekeepers";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final String APPLICATION_GRAPH_DATA = "data";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final String APPLICATION_FIELDS = "fields";

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final String APPLICATION_PLATFORM = "platform";

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final String APPLICATION_SDK_VERSION = "sdk_version";

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final long APPLICATION_GATEKEEPER_CACHE_TIMEOUT = 3600000;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static Long timestamp;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static GateKeeperRuntimeCache gateKeeperRuntimeCache;

    @NotNull
    public static final FetchedAppGateKeepersManager INSTANCE = new FetchedAppGateKeepersManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = Reflection.getOrCreateKotlinClass(FetchedAppGateKeepersManager.class).getSimpleName();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final AtomicBoolean isLoading = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final ConcurrentLinkedQueue<Callback> callbacks = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final Map<String, JSONObject> fetchedAppGateKeepers = new ConcurrentHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/facebook/internal/FetchedAppGateKeepersManager$Callback;", "", "", "onCompleted", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface Callback {
        void onCompleted();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        public a(String str, Context context, String str2) {
            this.a = str;
            this.b = context;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                FetchedAppGateKeepersManager fetchedAppGateKeepersManager = FetchedAppGateKeepersManager.INSTANCE;
                JSONObject jSONObjectA = fetchedAppGateKeepersManager.a(this.a);
                if (jSONObjectA.length() != 0) {
                    FetchedAppGateKeepersManager.parseAppGateKeepersFromJSON$facebook_core_release(this.a, jSONObjectA);
                    this.b.getSharedPreferences(FetchedAppGateKeepersManager.APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(this.c, jSONObjectA.toString()).apply();
                    FetchedAppGateKeepersManager.timestamp = Long.valueOf(System.currentTimeMillis());
                }
                fetchedAppGateKeepersManager.c();
                FetchedAppGateKeepersManager.access$isLoading$p(fetchedAppGateKeepersManager).set(false);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ Callback a;

        public b(Callback callback) {
            this.a = callback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                this.a.onCompleted();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private FetchedAppGateKeepersManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JSONObject a(String applicationId) {
        GraphRequest graphRequestNewGraphPathRequest;
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", FacebookSdk.getSdkVersion());
        bundle.putString("fields", APPLICATION_GATEKEEPER_FIELD);
        if (Utility.isNullOrEmpty(FacebookSdk.getClientToken())) {
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            graphRequestNewGraphPathRequest = companion.newGraphPathRequest(null, String.format("%s/%s", Arrays.copyOf(new Object[]{applicationId, APPLICATION_GATEKEEPER_EDGE}, 2)), null);
            graphRequestNewGraphPathRequest.setSkipClientToken(true);
            graphRequestNewGraphPathRequest.setParameters(bundle);
        } else {
            GraphRequest.Companion companion2 = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            graphRequestNewGraphPathRequest = companion2.newGraphPathRequest(null, String.format("app/%s", Arrays.copyOf(new Object[]{APPLICATION_GATEKEEPER_EDGE}, 1)), null);
            graphRequestNewGraphPathRequest.setParameters(bundle);
        }
        JSONObject jsonObject = graphRequestNewGraphPathRequest.executeAndWait().getJsonObject();
        return jsonObject != null ? jsonObject : new JSONObject();
    }

    public static final /* synthetic */ AtomicBoolean access$isLoading$p(FetchedAppGateKeepersManager fetchedAppGateKeepersManager) {
        return isLoading;
    }

    private final boolean b(Long timestamp2) {
        return timestamp2 != null && System.currentTimeMillis() - timestamp2.longValue() < 3600000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<Callback> concurrentLinkedQueue = callbacks;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            Callback callbackPoll = concurrentLinkedQueue.poll();
            if (callbackPoll != null) {
                handler.post(new b(callbackPoll));
            }
        }
    }

    @JvmStatic
    public static final boolean getGateKeeperForKey(@NotNull String name, @Nullable String applicationId, boolean defaultValue) {
        Boolean bool;
        Map<String, Boolean> gateKeepersForApplication = INSTANCE.getGateKeepersForApplication(applicationId);
        return (gateKeepersForApplication.containsKey(name) && (bool = gateKeepersForApplication.get(name)) != null) ? bool.booleanValue() : defaultValue;
    }

    @JvmStatic
    @VisibleForTesting(otherwise = 2)
    @NotNull
    public static final synchronized JSONObject parseAppGateKeepersFromJSON$facebook_core_release(@NotNull String applicationId, @Nullable JSONObject gateKeepersJSON) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONArray jSONArrayOptJSONArray;
        jSONObject = fetchedAppGateKeepers.get(applicationId);
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (gateKeepersJSON == null || (jSONArrayOptJSONArray = gateKeepersJSON.optJSONArray("data")) == null || (jSONObject2 = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            jSONObject2 = new JSONObject();
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray(APPLICATION_GATEKEEPER_FIELD);
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = new JSONArray();
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                jSONObject.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
            }
        }
        fetchedAppGateKeepers.put(applicationId, jSONObject);
        return jSONObject;
    }

    @JvmStatic
    @NotNull
    public static final JSONObject queryAppGateKeepers(@NotNull String applicationId, boolean forceRequery) {
        if (!forceRequery) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                JSONObject jSONObject = map.get(applicationId);
                return jSONObject != null ? jSONObject : new JSONObject();
            }
        }
        JSONObject jSONObjectA = INSTANCE.a(applicationId);
        Context applicationContext = FacebookSdk.getApplicationContext();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).edit().putString(String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1)), jSONObjectA.toString()).apply();
        return parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObjectA);
    }

    @JvmStatic
    public static final void resetRuntimeGateKeeperCache() {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache2 != null) {
            GateKeeperRuntimeCache.resetCache$default(gateKeeperRuntimeCache2, null, 1, null);
        }
    }

    @JvmStatic
    public static final void setRuntimeGateKeeper(@NotNull String applicationId, @NotNull GateKeeper gateKeeper) {
        GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
        if ((gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.getGateKeeper(applicationId, gateKeeper.getName()) : null) == null) {
            Log.w(TAG, "Missing gatekeeper runtime cache");
            return;
        }
        GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
        if (gateKeeperRuntimeCache3 != null) {
            gateKeeperRuntimeCache3.setGateKeeper(applicationId, gateKeeper);
        }
    }

    public static /* synthetic */ void setRuntimeGateKeeper$default(String str, GateKeeper gateKeeper, int i, Object obj) {
        if ((i & 1) != 0) {
            str = FacebookSdk.getApplicationId();
        }
        setRuntimeGateKeeper(str, gateKeeper);
    }

    @NotNull
    public final Map<String, Boolean> getGateKeepersForApplication(@Nullable String applicationId) {
        loadAppGateKeepersAsync();
        if (applicationId != null) {
            Map<String, JSONObject> map = fetchedAppGateKeepers;
            if (map.containsKey(applicationId)) {
                GateKeeperRuntimeCache gateKeeperRuntimeCache2 = gateKeeperRuntimeCache;
                List<GateKeeper> listDumpGateKeepers = gateKeeperRuntimeCache2 != null ? gateKeeperRuntimeCache2.dumpGateKeepers(applicationId) : null;
                if (listDumpGateKeepers != null) {
                    HashMap map2 = new HashMap();
                    for (GateKeeper gateKeeper : listDumpGateKeepers) {
                        map2.put(gateKeeper.getName(), Boolean.valueOf(gateKeeper.getValue()));
                    }
                    return map2;
                }
                HashMap map3 = new HashMap();
                JSONObject jSONObject = map.get(applicationId);
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map3.put(next, Boolean.valueOf(jSONObject.optBoolean(next)));
                }
                GateKeeperRuntimeCache gateKeeperRuntimeCache3 = gateKeeperRuntimeCache;
                if (gateKeeperRuntimeCache3 == null) {
                    gateKeeperRuntimeCache3 = new GateKeeperRuntimeCache();
                }
                ArrayList arrayList = new ArrayList(map3.size());
                for (Map.Entry entry : map3.entrySet()) {
                    arrayList.add(new GateKeeper((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue()));
                }
                gateKeeperRuntimeCache3.setGateKeepers(applicationId, arrayList);
                gateKeeperRuntimeCache = gateKeeperRuntimeCache3;
                return map3;
            }
        }
        return new HashMap();
    }

    public final void loadAppGateKeepersAsync() {
        loadAppGateKeepersAsync(null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003d A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x003f, B:19:0x0050, B:24:0x005f, B:25:0x0062, B:27:0x0068, B:31:0x0072, B:22:0x0058), top: B:41:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x005f A[Catch: all -> 0x007e, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x003f, B:19:0x0050, B:24:0x005f, B:25:0x0062, B:27:0x0068, B:31:0x0072, B:22:0x0058), top: B:41:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x003f, B:19:0x0050, B:24:0x005f, B:25:0x0062, B:27:0x0068, B:31:0x0072, B:22:0x0058), top: B:41:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:31:0x0072 A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:6:0x000a, B:8:0x0018, B:10:0x0020, B:13:0x0025, B:17:0x003f, B:19:0x0050, B:24:0x005f, B:25:0x0062, B:27:0x0068, B:31:0x0072, B:22:0x0058), top: B:41:0x0005, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:39:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:15:0x003d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0070, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x007c, please report this as an issue */
    @JvmStatic
    public static final synchronized void loadAppGateKeepersAsync(@Nullable Callback callback) {
        String applicationId;
        FetchedAppGateKeepersManager fetchedAppGateKeepersManager;
        Context applicationContext;
        String str;
        JSONObject jSONObject;
        String string;
        Executor executor;
        if (callback == null) {
            applicationId = FacebookSdk.getApplicationId();
            fetchedAppGateKeepersManager = INSTANCE;
            if (!fetchedAppGateKeepersManager.b(timestamp)) {
            }
            applicationContext = FacebookSdk.getApplicationContext();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
            if (applicationContext == null) {
                return;
            }
            jSONObject = null;
            string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(str, null);
            if (!Utility.isNullOrEmpty(string)) {
                jSONObject = new JSONObject(string);
                if (jSONObject != null) {
                    parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
                }
            }
            executor = FacebookSdk.getExecutor();
            if (executor != null) {
                if (isLoading.compareAndSet(false, true)) {
                    executor.execute(new a(applicationId, applicationContext, str));
                    return;
                }
                return;
            }
            return;
        }
        callbacks.add(callback);
        applicationId = FacebookSdk.getApplicationId();
        fetchedAppGateKeepersManager = INSTANCE;
        if (!fetchedAppGateKeepersManager.b(timestamp) && fetchedAppGateKeepers.containsKey(applicationId)) {
            fetchedAppGateKeepersManager.c();
            return;
        }
        applicationContext = FacebookSdk.getApplicationContext();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        str = String.format(APP_GATEKEEPERS_PREFS_KEY_FORMAT, Arrays.copyOf(new Object[]{applicationId}, 1));
        if (applicationContext == null) {
            return;
        }
        jSONObject = null;
        string = applicationContext.getSharedPreferences(APP_GATEKEEPERS_PREFS_STORE, 0).getString(str, null);
        if (!Utility.isNullOrEmpty(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                Utility.logd(Utility.LOG_TAG, e);
            }
            if (jSONObject != null) {
                parseAppGateKeepersFromJSON$facebook_core_release(applicationId, jSONObject);
            }
        }
        executor = FacebookSdk.getExecutor();
        if (executor != null) {
            if (isLoading.compareAndSet(false, true)) {
                return;
            }
            executor.execute(new a(applicationId, applicationContext, str));
            return;
        }
        return;
        throw th;
    }
}
