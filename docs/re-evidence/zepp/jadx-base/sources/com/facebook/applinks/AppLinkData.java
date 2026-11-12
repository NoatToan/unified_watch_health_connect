package com.facebook.applinks;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.huami.tools.analytics.DbUtils;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class AppLinkData {
    public static final String ARGUMENTS_EXTRAS_KEY = "extras";
    public static final String ARGUMENTS_NATIVE_CLASS_KEY = "com.facebook.platform.APPLINK_NATIVE_CLASS";
    public static final String ARGUMENTS_NATIVE_URL = "com.facebook.platform.APPLINK_NATIVE_URL";
    public static final String ARGUMENTS_REFERER_DATA_KEY = "referer_data";
    public static final String ARGUMENTS_TAPTIME_KEY = "com.facebook.platform.APPLINK_TAP_TIME_UTC";
    private static final String g = "com.facebook.platform.APPLINK_ARGS";
    private static final String h = "al_applink_data";
    private static final String i = "bridge_args";
    private static final String j = "method_args";
    private static final String k = "version";
    private static final String l = "method";
    private static final String m = "DEFERRED_APP_LINK";
    private static final String n = "%s/activities";
    private static final String o = "applink_args";
    private static final String p = "applink_class";
    private static final String q = "click_time";
    private static final String r = "applink_url";
    private static final String s = "is_auto_applink";
    private static final String t = "target_url";
    private static final String u = "ref";
    private static final String v = "fb_ref";
    private static final String w = "deeplink_context";
    private static final String x = "promo_code";
    private static final String y = "com.facebook.applinks.AppLinkData";

    @Nullable
    private String a;

    @Nullable
    private Uri b;

    @Nullable
    private JSONObject c;

    @Nullable
    private Bundle d;

    @Nullable
    private String e;

    @Nullable
    private JSONObject f;

    public interface CompletionHandler {
        void onDeferredAppLinkDataFetched(@Nullable AppLinkData appLinkData);
    }

    public static class a implements Runnable {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ CompletionHandler c;

        public a(Context context, String str, CompletionHandler completionHandler) {
            this.a = context;
            this.b = str;
            this.c = completionHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AppLinkData.d(this.a, this.b, this.c);
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private AppLinkData() {
    }

    @Nullable
    private static AppLinkData b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                AppLinkData appLinkData = new AppLinkData();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                appLinkData.c = jSONObject2;
                if (jSONObject2.has(u)) {
                    appLinkData.a = appLinkData.c.getString(u);
                } else if (appLinkData.c.has(ARGUMENTS_REFERER_DATA_KEY)) {
                    JSONObject jSONObject3 = appLinkData.c.getJSONObject(ARGUMENTS_REFERER_DATA_KEY);
                    if (jSONObject3.has(v)) {
                        appLinkData.a = jSONObject3.getString(v);
                    }
                }
                if (appLinkData.c.has("target_url")) {
                    Uri uri = Uri.parse(appLinkData.c.getString("target_url"));
                    appLinkData.b = uri;
                    appLinkData.f = e(uri);
                }
                if (appLinkData.c.has("extras")) {
                    JSONObject jSONObject4 = appLinkData.c.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            appLinkData.e = jSONObject5.getString("promo_code");
                        }
                    }
                }
                appLinkData.d = f(appLinkData.c);
                return appLinkData;
            }
        } catch (FacebookException e) {
            Utility.logd(y, "Unable to parse AppLink JSON", e);
        } catch (JSONException e2) {
            Utility.logd(y, "Unable to parse AppLink JSON", e2);
        }
        return null;
    }

    @Nullable
    private static AppLinkData c(Uri uri) {
        if (uri == null) {
            return null;
        }
        AppLinkData appLinkData = new AppLinkData();
        appLinkData.b = uri;
        appLinkData.f = e(uri);
        return appLinkData;
    }

    @Nullable
    public static AppLinkData createFromActivity(Activity activity) {
        if (CrashShieldHandler.isObjectCrashing(AppLinkData.class)) {
            return null;
        }
        try {
            Validate.notNull(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return null;
            }
            AppLinkData appLinkDataCreateFromAlApplinkData = createFromAlApplinkData(intent);
            if (appLinkDataCreateFromAlApplinkData == null) {
                appLinkDataCreateFromAlApplinkData = b(intent.getStringExtra(g));
            }
            return appLinkDataCreateFromAlApplinkData == null ? c(intent.getData()) : appLinkDataCreateFromAlApplinkData;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkData.class);
            return null;
        }
    }

    @Nullable
    public static AppLinkData createFromAlApplinkData(Intent intent) {
        String string;
        String string2;
        if (CrashShieldHandler.isObjectCrashing(AppLinkData.class) || intent == null) {
            return null;
        }
        try {
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            AppLinkData appLinkData = new AppLinkData();
            Uri data = intent.getData();
            appLinkData.b = data;
            appLinkData.f = e(data);
            if (appLinkData.b == null && (string2 = bundleExtra.getString("target_url")) != null) {
                appLinkData.b = Uri.parse(string2);
            }
            appLinkData.d = bundleExtra;
            appLinkData.c = null;
            Bundle bundle = bundleExtra.getBundle(ARGUMENTS_REFERER_DATA_KEY);
            if (bundle != null) {
                appLinkData.a = bundle.getString(v);
            }
            Bundle bundle2 = bundleExtra.getBundle("extras");
            if (bundle2 != null && (string = bundle2.getString("deeplink_context")) != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    if (jSONObject.has("promo_code")) {
                        appLinkData.e = jSONObject.getString("promo_code");
                    }
                } catch (JSONException e) {
                    Utility.logd(y, "Unable to parse deeplink_context JSON", e);
                }
            }
            return appLinkData;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkData.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x008c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0094 A[Catch: JSONException -> 0x009f, Exception -> 0x00c1, TRY_ENTER, TryCatch #3 {JSONException -> 0x009f, blocks: (B:23:0x008e, B:26:0x0094, B:27:0x0097, B:29:0x009b), top: B:55:0x008e, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b A[Catch: JSONException -> 0x009f, Exception -> 0x00c1, TRY_LEAVE, TryCatch #3 {JSONException -> 0x009f, blocks: (B:23:0x008e, B:26:0x0094, B:27:0x0097, B:29:0x009b), top: B:55:0x008e, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae A[Catch: JSONException -> 0x00b9, Exception -> 0x00c1, TRY_ENTER, TryCatch #1 {JSONException -> 0x00b9, blocks: (B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b5), top: B:51:0x00a8, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[Catch: JSONException -> 0x00b9, Exception -> 0x00c1, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00b9, blocks: (B:33:0x00a8, B:36:0x00ae, B:37:0x00b1, B:39:0x00b5), top: B:51:0x00a8, outer: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void d(Context context, String str, CompletionHandler completionHandler) {
        JSONObject jSONObject;
        Bundle bundle;
        JSONObject jSONObject2;
        Bundle bundle2;
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("event", m);
            Utility.setAppEventAttributionParameters(jSONObject3, AttributionIdentifiers.getAttributionIdentifiers(context), AppEventsLogger.getAnonymousAppDeviceGUID(context), FacebookSdk.getLimitEventAndDataUsage(context), context);
            Utility.setAppEventExtendedDeviceInfoParameters(jSONObject3, FacebookSdk.getApplicationContext());
            jSONObject3.put("application_package_name", context.getPackageName());
            Object[] objArr = {str};
            AppLinkData appLinkDataB = null;
            try {
                JSONObject graphObject = GraphRequest.newPostRequest(null, String.format(n, objArr), jSONObject3, null).executeAndWait().getGraphObject();
                if (graphObject != null) {
                    String strOptString = graphObject.optString(o);
                    long jOptLong = graphObject.optLong(q, -1L);
                    String strOptString2 = graphObject.optString(p);
                    String strOptString3 = graphObject.optString(r);
                    if (!TextUtils.isEmpty(strOptString) && (appLinkDataB = b(strOptString)) != null) {
                        if (jOptLong != -1) {
                            try {
                                JSONObject jSONObject4 = appLinkDataB.c;
                                if (jSONObject4 != null) {
                                    jSONObject4.put(ARGUMENTS_TAPTIME_KEY, jOptLong);
                                }
                                Bundle bundle3 = appLinkDataB.d;
                                if (bundle3 != null) {
                                    bundle3.putString(ARGUMENTS_TAPTIME_KEY, Long.toString(jOptLong));
                                    if (strOptString2 != null) {
                                        try {
                                            jSONObject = appLinkDataB.c;
                                            if (jSONObject != null) {
                                                jSONObject.put(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                                            }
                                            bundle = appLinkDataB.d;
                                            if (bundle != null) {
                                                bundle.putString(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                                                if (strOptString3 != null) {
                                                    try {
                                                        jSONObject2 = appLinkDataB.c;
                                                        if (jSONObject2 != null) {
                                                            jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                                        }
                                                        bundle2 = appLinkDataB.d;
                                                        if (bundle2 != null) {
                                                            bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                                        }
                                                    } catch (JSONException unused) {
                                                        Utility.logd(y, "Unable to put app link URL in AppLinkData.arguments");
                                                    }
                                                }
                                            } else if (strOptString3 != null) {
                                                jSONObject2 = appLinkDataB.c;
                                                if (jSONObject2 != null) {
                                                    jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                                }
                                                bundle2 = appLinkDataB.d;
                                                if (bundle2 != null) {
                                                    bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                                }
                                            }
                                        } catch (JSONException unused2) {
                                            Utility.logd(y, "Unable to put app link class name in AppLinkData.arguments");
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = appLinkDataB.c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                        }
                                        bundle2 = appLinkDataB.d;
                                        if (bundle2 != null) {
                                            bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                        }
                                    }
                                } else if (strOptString2 != null) {
                                    jSONObject = appLinkDataB.c;
                                    if (jSONObject != null) {
                                        jSONObject.put(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                                    }
                                    bundle = appLinkDataB.d;
                                    if (bundle != null) {
                                        bundle.putString(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                                        if (strOptString3 != null) {
                                            jSONObject2 = appLinkDataB.c;
                                            if (jSONObject2 != null) {
                                                jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                            }
                                            bundle2 = appLinkDataB.d;
                                            if (bundle2 != null) {
                                                bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                            }
                                        }
                                    } else if (strOptString3 != null) {
                                        jSONObject2 = appLinkDataB.c;
                                        if (jSONObject2 != null) {
                                            jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                        }
                                        bundle2 = appLinkDataB.d;
                                        if (bundle2 != null) {
                                            bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                        }
                                    }
                                } else if (strOptString3 != null) {
                                    jSONObject2 = appLinkDataB.c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                    }
                                    bundle2 = appLinkDataB.d;
                                    if (bundle2 != null) {
                                        bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                    }
                                }
                            } catch (JSONException unused3) {
                                Utility.logd(y, "Unable to put tap time in AppLinkData.arguments");
                            }
                        } else if (strOptString2 != null) {
                            jSONObject = appLinkDataB.c;
                            if (jSONObject != null) {
                                jSONObject.put(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                            }
                            bundle = appLinkDataB.d;
                            if (bundle != null) {
                                bundle.putString(ARGUMENTS_NATIVE_CLASS_KEY, strOptString2);
                                if (strOptString3 != null) {
                                    jSONObject2 = appLinkDataB.c;
                                    if (jSONObject2 != null) {
                                        jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                    }
                                    bundle2 = appLinkDataB.d;
                                    if (bundle2 != null) {
                                        bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                    }
                                }
                            } else if (strOptString3 != null) {
                                jSONObject2 = appLinkDataB.c;
                                if (jSONObject2 != null) {
                                    jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                                }
                                bundle2 = appLinkDataB.d;
                                if (bundle2 != null) {
                                    bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                                }
                            }
                        } else if (strOptString3 != null) {
                            jSONObject2 = appLinkDataB.c;
                            if (jSONObject2 != null) {
                                jSONObject2.put(ARGUMENTS_NATIVE_URL, strOptString3);
                            }
                            bundle2 = appLinkDataB.d;
                            if (bundle2 != null) {
                                bundle2.putString(ARGUMENTS_NATIVE_URL, strOptString3);
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                Utility.logd(y, "Unable to fetch deferred applink from server");
            }
            completionHandler.onDeferredAppLinkDataFetched(appLinkDataB);
        } catch (JSONException e) {
            throw new FacebookException("An error occurred while preparing deferred app link", e);
        }
    }

    @Nullable
    private static JSONObject e(@Nullable Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(AppLinkData.class) || uri == null) {
            return null;
        }
        try {
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter);
            } catch (JSONException unused) {
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, AppLinkData.class);
            return null;
        }
    }

    private static Bundle f(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, f((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i2 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            bundleArr[i2] = f(jSONArray.getJSONObject(i2));
                            i2++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else {
                        if (obj2 instanceof JSONArray) {
                            throw new FacebookException("Nested arrays are not supported.");
                        }
                        String[] strArr = new String[jSONArray.length()];
                        while (i2 < jSONArray.length()) {
                            strArr[i2] = jSONArray.get(i2).toString();
                            i2++;
                        }
                        bundle.putStringArray(next, strArr);
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }

    public static void fetchDeferredAppLinkData(Context context, CompletionHandler completionHandler) {
        fetchDeferredAppLinkData(context, null, completionHandler);
    }

    public JSONObject getAppLinkData() {
        JSONObject jSONObject = this.f;
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Nullable
    public Bundle getArgumentBundle() {
        return this.d;
    }

    @Nullable
    public String getPromotionCode() {
        return this.e;
    }

    @Nullable
    public String getRef() {
        return this.a;
    }

    @Nullable
    public Bundle getRefererData() {
        Bundle bundle = this.d;
        if (bundle != null) {
            return bundle.getBundle(ARGUMENTS_REFERER_DATA_KEY);
        }
        return null;
    }

    @Nullable
    public Uri getTargetUri() {
        return this.b;
    }

    public boolean isAutoAppLink() {
        Uri uri = this.b;
        if (uri == null) {
            return false;
        }
        String host = uri.getHost();
        String scheme = this.b.getScheme();
        String str = String.format("fb%s", FacebookSdk.getApplicationId());
        JSONObject jSONObject = this.f;
        return (jSONObject != null && jSONObject.optBoolean(s)) && "applinks".equals(host) && str.equals(scheme);
    }

    public static void fetchDeferredAppLinkData(Context context, String str, CompletionHandler completionHandler) {
        Validate.notNull(context, DbUtils.Const.Table.CONTEXT);
        Validate.notNull(completionHandler, "completionHandler");
        if (str == null) {
            str = Utility.getMetadataApplicationId(context);
        }
        Validate.notNull(str, "applicationId");
        FacebookSdk.getExecutor().execute(new a(context.getApplicationContext(), str, completionHandler));
    }
}
