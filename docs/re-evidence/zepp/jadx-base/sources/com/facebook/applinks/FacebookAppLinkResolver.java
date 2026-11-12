package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.bolts.AppLink;
import com.facebook.bolts.AppLinkResolver;
import com.facebook.bolts.Continuation;
import com.facebook.bolts.Task;
import com.facebook.bolts.TaskCompletionSource;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookAppLinkResolver implements AppLinkResolver {
    private static final String b = "app_links";
    private static final String c = "android";
    private static final String d = "web";
    private static final String e = "package";
    private static final String f = "class";
    private static final String g = "app_name";
    private static final String h = "url";
    private static final String i = "should_fallback";
    private final HashMap<Uri, AppLink> a = new HashMap<>();

    public class a implements Continuation<Map<Uri, AppLink>, AppLink> {
        public final /* synthetic */ Uri a;

        public a(Uri uri) {
            this.a = uri;
        }

        @Override // com.facebook.bolts.Continuation
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AppLink then(Task<Map<Uri, AppLink>> task) throws Exception {
            return task.getResult().get(this.a);
        }
    }

    public class b implements GraphRequest.Callback {
        public final /* synthetic */ TaskCompletionSource a;
        public final /* synthetic */ Map b;
        public final /* synthetic */ HashSet c;

        public b(TaskCompletionSource taskCompletionSource, Map map, HashSet hashSet) {
            this.a = taskCompletionSource;
            this.b = map;
            this.c = hashSet;
        }

        @Override // com.facebook.GraphRequest.Callback
        public void onCompleted(GraphResponse graphResponse) {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                FacebookRequestError error = graphResponse.getError();
                if (error != null) {
                    this.a.setError(error.getIo.flutter.plugins.firebase.crashlytics.Constants.EXCEPTION java.lang.String());
                    return;
                }
                JSONObject graphObject = graphResponse.getGraphObject();
                if (graphObject == null) {
                    this.a.setResult(this.b);
                    return;
                }
                for (Uri uri : this.c) {
                    if (graphObject.has(uri.toString())) {
                        try {
                            JSONObject jSONObject = graphObject.getJSONObject(uri.toString()).getJSONObject(FacebookAppLinkResolver.b);
                            JSONArray jSONArray = jSONObject.getJSONArray("android");
                            int length = jSONArray.length();
                            ArrayList arrayList = new ArrayList(length);
                            for (int i = 0; i < length; i++) {
                                AppLink.Target targetA = FacebookAppLinkResolver.a(jSONArray.getJSONObject(i));
                                if (targetA != null) {
                                    arrayList.add(targetA);
                                }
                            }
                            AppLink appLink = new AppLink(uri, arrayList, FacebookAppLinkResolver.b(uri, jSONObject));
                            this.b.put(uri, appLink);
                            synchronized (FacebookAppLinkResolver.c(FacebookAppLinkResolver.this)) {
                                try {
                                    FacebookAppLinkResolver.c(FacebookAppLinkResolver.this).put(uri, appLink);
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } catch (JSONException unused) {
                            continue;
                        }
                    }
                }
                this.a.setResult(this.b);
            } catch (Throwable th2) {
                CrashShieldHandler.handleThrowable(th2, this);
            }
        }
    }

    public static /* synthetic */ AppLink.Target a(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return d(jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    public static /* synthetic */ Uri b(Uri uri, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return e(uri, jSONObject);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    public static /* synthetic */ HashMap c(FacebookAppLinkResolver facebookAppLinkResolver) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return facebookAppLinkResolver.a;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static AppLink.Target d(JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            String strG = g(jSONObject, "package", null);
            if (strG == null) {
                return null;
            }
            String strG2 = g(jSONObject, "class", null);
            String strG3 = g(jSONObject, "app_name", null);
            String strG4 = g(jSONObject, "url", null);
            return new AppLink.Target(strG, strG2, strG4 != null ? Uri.parse(strG4) : null, strG3);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static Uri e(Uri uri, JSONObject jSONObject) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("web");
            if (!f(jSONObject2, i, true)) {
                return null;
            }
            String strG = g(jSONObject2, "url", null);
            Uri uri2 = strG != null ? Uri.parse(strG) : null;
            return uri2 != null ? uri2 : uri;
        } catch (JSONException unused) {
            return uri;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    private static boolean f(JSONObject jSONObject, String str, boolean z) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return false;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return z;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return false;
        }
    }

    private static String g(JSONObject jSONObject, String str, String str2) {
        if (CrashShieldHandler.isObjectCrashing(FacebookAppLinkResolver.class)) {
            return null;
        }
        try {
            return jSONObject.getString(str);
        } catch (JSONException unused) {
            return str2;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, FacebookAppLinkResolver.class);
            return null;
        }
    }

    @Override // com.facebook.bolts.AppLinkResolver
    public Task<AppLink> getAppLinkFromUrlInBackground(Uri uri) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(uri);
            return getAppLinkFromUrlsInBackground(arrayList).onSuccess(new a(uri));
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    public Task<Map<Uri, AppLink>> getAppLinkFromUrlsInBackground(List<Uri> list) {
        AppLink appLink;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (Uri uri : list) {
                synchronized (this.a) {
                    appLink = this.a.get(uri);
                }
                if (appLink != null) {
                    map.put(uri, appLink);
                } else {
                    if (!hashSet.isEmpty()) {
                        sb.append(',');
                    }
                    sb.append(uri.toString());
                    hashSet.add(uri);
                }
            }
            if (hashSet.isEmpty()) {
                return Task.forResult(map);
            }
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            Bundle bundle = new Bundle();
            bundle.putString("ids", sb.toString());
            bundle.putString(GraphRequest.FIELDS_PARAM, String.format("%s.fields(%s,%s)", b, "android", "web"));
            new GraphRequest(AccessToken.getCurrentAccessToken(), "", bundle, null, new b(taskCompletionSource, map, hashSet)).executeAsync();
            return taskCompletionSource.getTask();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
