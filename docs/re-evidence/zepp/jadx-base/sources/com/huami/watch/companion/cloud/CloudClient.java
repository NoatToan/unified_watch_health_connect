package com.huami.watch.companion.cloud;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.huami.account.api.model.HMWebAccess;
import com.huami.passport.ErrorCode;
import com.huami.passport.entity.NextActions;
import com.huami.watch.util.Analytics;
import com.huami.watch.util.Box;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class CloudClient {
    public static final String CONTENT_TYPE_FORM = "application/x-www-form-urlencoded";
    public static final String CONTENT_TYPE_JSON = "application/json";
    public static final String KEY_CONTENT_TYPE = "Content-Type";
    private static final String a = "Cloud-Client";
    public static ConfigCallback sConfigCallback;
    public static final MediaType MEDIA_TYPE_STREAM = MediaType.parse("application/octet-stream");
    public static final MediaType MEDIA_TYPE_JSON = MediaType.parse("application/json");

    public interface ConfigCallback {
        boolean isLogHeadersEnabled();

        boolean onLoginError(Activity activity, ErrorCode errorCode);

        void onMutexLogin(FragmentActivity fragmentActivity, long j);

        void onNextActions(Context context, List<NextActions> list);

        void onUnauthed(FragmentActivity fragmentActivity);
    }

    public static class Huami {
        private static final String a = "0102";
        private static final String b = "0108";
        private static final List<String> c;
        private static final List<String> d;

        static {
            ArrayList arrayList = new ArrayList();
            c = arrayList;
            ArrayList arrayList2 = new ArrayList();
            d = arrayList2;
            arrayList.add(ErrorCode.Server.S0100);
            arrayList.add("0101");
            arrayList.add(ErrorCode.Server.S0105);
            arrayList.add(HMWebAccess.AUTH_SERVER_ERROR_FROZEN);
            arrayList.add(HMWebAccess.AUTH_SERVER_ERROR_RIGHTS_RESTRICTIVE);
            arrayList.add("0123");
            arrayList2.addAll(arrayList);
            arrayList2.add("0108");
        }

        private static void e(Context context, ErrorCode errorCode) {
            Log.d(CloudClient.a, "ErrorCode : " + errorCode, new Object[0]);
            if (CloudClient.sConfigCallback == null || !(context instanceof Activity)) {
                return;
            }
            Activity activity = (Activity) context;
            if (activity.isDestroyed()) {
                return;
            }
            CloudClient.sConfigCallback.onLoginError(activity, errorCode);
        }

        private static void f(@NonNull Context context, String str, long j) {
            Log.d(CloudClient.a, "ErrorCode : " + str + ", MutexTime : " + j + " " + TimeUtil.formatDateTime(j), new Object[0]);
            if (CloudClient.sConfigCallback == null || !(context instanceof FragmentActivity) || ((Activity) context).isDestroyed()) {
                return;
            }
            if ("0108".equals(str)) {
                CloudClient.sConfigCallback.onMutexLogin((FragmentActivity) context, j);
            } else if (c.contains(str)) {
                CloudClient.sConfigCallback.onUnauthed((FragmentActivity) context);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:22:0x006e A[PHI: r0
          0x006e: PHI (r0v1 okhttp3.Response) = (r0v0 okhttp3.Response), (r0v0 okhttp3.Response), (r0v0 okhttp3.Response), (r0v3 okhttp3.Response) binds: [B:3:0x000a, B:5:0x0010, B:7:0x001a, B:13:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
        @NonNull
        public static Response g(@NonNull Context context, @NonNull Request request) throws IOException {
            JSONObject jSONObjectResponseBodyData;
            Response responseDoRequest = OkHttp.doRequest(request);
            boolean z = false;
            if (Box.getLogined() && CloudClient.b(responseDoRequest) && (jSONObjectResponseBodyData = responseBodyData(CloudClient.responseBodyString(responseDoRequest))) != null) {
                String strOptString = jSONObjectResponseBodyData.optString("code");
                if ("0102".equals(strOptString)) {
                    CloudUtil.e eVarB = CloudUtil.b(context);
                    if (eVarB.a) {
                        Response responseDoRequest2 = OkHttp.doRequest(request);
                        responseDoRequest = responseDoRequest2;
                        if (!CloudClient.b(responseDoRequest2)) {
                            z = true;
                        }
                    } else {
                        String errorCode = eVarB.b.getErrorCode();
                        if (d.contains(errorCode)) {
                            f(context, errorCode, eVarB.b.getMutimeLong());
                        } else {
                            e(context, eVarB.b);
                        }
                    }
                } else if (d.contains(strOptString)) {
                    f(context, strOptString, jSONObjectResponseBodyData.optLong("mutimelong"));
                }
            } else {
                z = true;
            }
            if (z) {
                return responseDoRequest;
            }
            throw new IOException("UNAUTHORIZED");
        }

        private static Map<String, String> h(Map<String, String> map) {
            Map<String, String> mapNewHeaders = Cloud.newHeaders(Cloud.getToken());
            if (map != null && map.size() > 0) {
                mapNewHeaders.putAll(map);
            }
            return mapNewHeaders;
        }

        private static Map<String, String> i(Map<String, String> map) {
            Map<String, String> mapNewQueryParams = Cloud.newQueryParams(Cloud.getUID());
            if (map != null && map.size() > 0) {
                mapNewQueryParams.putAll(map);
            }
            return mapNewQueryParams;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Request j(String str, Map<String, String> map, Map<String, String> map2) {
            return OkHttp.newDelete(str, h(map), i(map2), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Request k(String str, Map<String, String> map, Map<String, String> map2) {
            return OkHttp.newGet(str, h(map), i(map2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Request l(String str, Map<String, String> map, RequestBody requestBody) {
            return OkHttp.newPost(str, h(map), i(null), requestBody);
        }

        @Nullable
        public static JSONObject responseBodyData(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return new JSONObject(str).optJSONObject("data");
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class OkHttp {
        private static Response c(@NonNull OkHttpClient okHttpClient, @NonNull Request request) throws IOException {
            try {
                Log.d(CloudClient.a, request.method() + " : " + request, new Object[0]);
                Response responseExecute = FirebasePerfOkHttpClient.execute(okHttpClient.newCall(request));
                Log.d(CloudClient.a, "Response : " + responseExecute, new Object[0]);
                return responseExecute;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                IOException iOException = new IOException("DoRequestErr", e2);
                Analytics.exception(iOException);
                throw iOException;
            }
        }

        private static RequestBody d(File file) {
            return RequestBody.create(CloudClient.MEDIA_TYPE_STREAM, file);
        }

        public static Response doRequest(@NonNull Request request) throws IOException {
            return c(Cloud.get().getClient(), request);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static RequestBody e(@NonNull String str, @NonNull String str2) {
            return RequestBody.create(MediaType.parse(str2), str);
        }

        private static Request.Builder f(String str, Map<String, String> map, Map<String, String> map2) {
            Request.Builder builder = new Request.Builder();
            if (map != null && !map.isEmpty()) {
                builder.headers(g(map));
            }
            builder.url(i(str, map2));
            return builder;
        }

        private static Headers g(@NonNull Map<String, String> map) {
            ConfigCallback configCallback = CloudClient.sConfigCallback;
            boolean z = configCallback != null && configCallback.isLogHeadersEnabled();
            HashMap map2 = new HashMap(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    map2.put(entry.getKey(), entry.getValue());
                } else if (z) {
                    Log.f().d(CloudClient.a, entry.getKey() + ": " + entry.getValue(), new Object[0]);
                }
            }
            map2.put("X-Request-Id", UUID.randomUUID().toString());
            Log.f().d(CloudClient.a, "New Headers : " + j(map2, z), new Object[0]);
            return Headers.of(map2);
        }

        private static HttpUrl h(String str) {
            return i(str, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static HttpUrl i(String str, Map<String, String> map) {
            HttpUrl httpUrl = HttpUrl.parse(str);
            if (map == null || map.isEmpty() || httpUrl == null) {
                return httpUrl;
            }
            HttpUrl.Builder builderNewBuilder = httpUrl.newBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                builderNewBuilder.addQueryParameter(entry.getKey(), entry.getValue());
            }
            return builderNewBuilder.build();
        }

        @NonNull
        private static String j(Map<String, String> map, boolean z) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (z || !"apptoken".equals(entry.getKey())) {
                    sb.append("\n");
                    sb.append(entry.getKey());
                    sb.append(": ");
                    sb.append(entry.getValue());
                }
            }
            return sb.toString();
        }

        public static RequestBody newBody(@NonNull Map<String, ?> map) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            builder.setType(MultipartBody.FORM);
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (value instanceof String) {
                        builder.addFormDataPart(key, (String) value);
                    } else if (value instanceof byte[]) {
                        builder.addFormDataPart(key, "null", RequestBody.create(CloudClient.MEDIA_TYPE_STREAM, (byte[]) value));
                    } else if (value instanceof File) {
                        File file = (File) value;
                        builder.addFormDataPart(key, file.getName(), RequestBody.create(CloudClient.MEDIA_TYPE_STREAM, file));
                    }
                }
            }
            return builder.build();
        }

        public static Request newDelete(String str, Map<String, String> map, Map<String, String> map2, RequestBody requestBody) {
            Request.Builder builderF = f(str, map, map2);
            if (requestBody == null) {
                builderF.delete();
            } else {
                builderF.delete(requestBody);
            }
            return builderF.build();
        }

        public static Request newGet(String str) {
            return newGet(str, null, null);
        }

        public static Request newPost(String str, Map<String, String> map, Map<String, String> map2, @NonNull RequestBody requestBody) {
            return f(str, map, map2).post(requestBody).build();
        }

        public static Request newPut(String str, File file) {
            return newPut(str, null, null, d(file));
        }

        public static Request newGet(String str, Map<String, String> map) {
            return newGet(str, null, map);
        }

        public static Request newPut(String str, RequestBody requestBody) {
            return newPut(str, null, null, requestBody);
        }

        public static Request newGet(String str, Map<String, String> map, Map<String, String> map2) {
            return f(str, map, map2).get().build();
        }

        public static Request newPut(String str, Map<String, String> map, Map<String, String> map2, @NonNull RequestBody requestBody) {
            return f(str, map, map2).put(requestBody).build();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(@NonNull Response response) {
        return response.code() == 401;
    }

    public static void config(ConfigCallback configCallback) {
        sConfigCallback = configCallback;
    }

    public static Response doRequest(@NonNull Context context, @NonNull Request request) throws IOException {
        return Huami.g(context, request);
    }

    public static Request newDelete(String str) {
        return Huami.j(str, null, null);
    }

    public static Request newGet(String str) {
        return Huami.k(str, null, null);
    }

    public static Request newPost(String str, Map<String, ?> map) {
        return Huami.l(str, null, OkHttp.newBody(map));
    }

    @NonNull
    public static String responseBodyString(@NonNull Response response, boolean z) throws IOException {
        String strString;
        try {
            strString = response.body().string();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            Analytics.exception(new IOException("ResponseErr", e2));
            strString = null;
        }
        if (z) {
            Log.d(a, "Body : " + strString, new Object[0]);
        }
        return strString == null ? "" : strString;
    }

    public static Request newDelete(String str, Map<String, String> map) {
        return Huami.j(str, map, null);
    }

    public static Request newGet(String str, Map<String, String> map) {
        return Huami.k(str, null, map);
    }

    public static Request newPost(String str, Map<String, String> map, Map<String, ?> map2) {
        return Huami.l(str, map, OkHttp.newBody(map2));
    }

    public static Request newDelete(String str, Map<String, String> map, Map<String, String> map2) {
        return Huami.j(str, map, map2);
    }

    public static Request newGet(String str, Map<String, String> map, Map<String, String> map2) {
        return Huami.k(str, map, map2);
    }

    public static Request newPost(String str, @NonNull String str2, @NonNull String str3) {
        return Huami.l(str, null, OkHttp.e(str2, str3));
    }

    public static Request newPost(String str, Map<String, String> map, String str2, String str3) {
        return Huami.l(str, map, OkHttp.e(str2, str3));
    }

    public static Request newPost(String str, Map<String, String> map, String str2) {
        return newPost(str, map, str2, "application/json");
    }

    public static Request newPost(String str, Map<String, String> map, Map<String, String> map2, @NonNull String str2) {
        return newPost(OkHttp.i(str, map2).toString(), map, str2);
    }

    public static String responseBodyString(Response response) throws IOException {
        return responseBodyString(response, true);
    }
}
