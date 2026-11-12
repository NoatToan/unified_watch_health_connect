package com.xiaomi.smarthome;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.common.util.CloseUtils;
import com.xiaomi.smarthome.library.common.util.CommonUtil;
import com.xiaomi.smarthome.library.common.util.SharePrefsManager;
import com.xiaomi.smarthome.library.file.FileUtil;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.async.AsyncHandler;
import com.xiaomi.smarthome.library.http.async.OkhttpCallback;
import com.xiaomi.smarthome.library.http.sync.SyncHandler;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.setting.ServerRouteUtil;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executor;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.Protocol;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AppConfigHelper {
    public static final String APPCONFIG_CACHE = "appconfig_cache";
    private static final String LAST_REQUEST = "last_request";
    public static final String SH_APPCONFIG = "debug_use_preview_appconfig";
    public static final String SH_SPECCONFIG = "debug_spec_preview_appconfig";
    private static final String TAG = "AppConfigHelper";
    private final Executor executor = ThreadPoolManager.getHttpThreadPool();
    private final Context mContext;
    private File mSaveFilePath;

    /* JADX INFO: renamed from: com.xiaomi.smarthome.AppConfigHelper$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        JSONObject cache;
        String lastUrl = null;
        final /* synthetic */ String val$assetDir;
        final /* synthetic */ OnCacheHandler val$cacheHandler;
        final /* synthetic */ JsonAsyncHandler val$callback;
        final /* synthetic */ long val$interval;
        final /* synthetic */ String val$lang;
        final /* synthetic */ String val$name;
        final /* synthetic */ String val$preferKey;
        final /* synthetic */ String val$version;

        public AnonymousClass3(String str, OnCacheHandler onCacheHandler, String str2, String str3, long j, String str4, String str5, JsonAsyncHandler jsonAsyncHandler) {
            this.val$preferKey = str;
            this.val$cacheHandler = onCacheHandler;
            this.val$name = str2;
            this.val$assetDir = str3;
            this.val$interval = j;
            this.val$version = str4;
            this.val$lang = str5;
            this.val$callback = jsonAsyncHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputStream inputStreamOpen;
            JSONObject jSONObject;
            byte[] file;
            if (AppConfigHelper.this.mContext == null) {
                MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache mContext == null " + Log.getStackTraceString(new Exception()));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(AppConfigHelper.this.mContext.getFilesDir());
            String str = File.separator;
            sb.append(str);
            sb.append(AppConfigHelper.APPCONFIG_CACHE);
            sb.append(ServerRouteUtil.buildSmartHomeHost(AppConfigHelper.this.mContext).hashCode());
            sb.append(str);
            sb.append(this.val$preferKey);
            final File file2 = new File(sb.toString());
            AppConfigHelper.this.mSaveFilePath = file2;
            if (file2.exists() && (file = FileUtils.readFile(file2)) != null && file.length > 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject(new String(file));
                    this.cache = jSONObject2;
                    if (this.val$cacheHandler.processCache(AppConfigHelper.this.parseContent(this.val$name, jSONObject2))) {
                        this.lastUrl = AppConfigHelper.this.parseConfigUrl(this.cache);
                    }
                } catch (Throwable th) {
                    MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, Log.getStackTraceString(th));
                }
            } else if (!TextUtils.isEmpty(this.val$assetDir)) {
                try {
                    inputStreamOpen = AppConfigHelper.this.mContext.getAssets().open(this.val$assetDir);
                    try {
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        JSONObject jSONObject3 = new JSONObject(new String(bArr, StandardCharsets.UTF_8));
                        this.cache = jSONObject3;
                        if (this.val$cacheHandler.processAssets(AppConfigHelper.this.parseContent(this.val$name, jSONObject3))) {
                            this.lastUrl = AppConfigHelper.this.parseConfigUrl(this.cache);
                        }
                        CloseUtils.closeIO(inputStreamOpen);
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, Log.getStackTraceString(th));
                            CloseUtils.closeIO(inputStreamOpen);
                        } catch (Throwable th3) {
                            CloseUtils.closeIO(inputStreamOpen);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    inputStreamOpen = null;
                }
            }
            if (this.lastUrl != null && (jSONObject = this.cache) != null) {
                long jOptLong = jSONObject.optLong(AppConfigHelper.LAST_REQUEST);
                if (this.val$interval + jOptLong > System.currentTimeMillis()) {
                    MiJiaLog.onlyLogcat(AppConfigHelper.TAG, "requestConfigWitchCache use cache:" + this.val$preferKey + " " + jOptLong);
                    return;
                }
            }
            final boolean zIsEmpty = TextUtils.isEmpty(this.lastUrl);
            if (!CommonUtil.isMainThread() && zIsEmpty) {
                try {
                    HttpApi.sendRequest(AppConfigHelper.this.getRequest(this.val$name, this.val$version, this.val$lang, null), new SyncHandler<Response>() { // from class: com.xiaomi.smarthome.AppConfigHelper.3.2
                        @Override // com.xiaomi.smarthome.library.http.sync.SyncHandler
                        public Response processResponse(Response response) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            AppConfigHelper.this.processSuccess(response, anonymousClass3.lastUrl, anonymousClass3.val$interval, anonymousClass3.cache, anonymousClass3.val$name, anonymousClass3.val$preferKey, file2, zIsEmpty, new RetryCallback() { // from class: com.xiaomi.smarthome.AppConfigHelper.3.2.1
                                @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                                public void onFailure(Error error, Exception exc, Response response2) {
                                    AnonymousClass3.this.val$callback.onFailure(error, exc, response2);
                                }

                                @Override // com.xiaomi.smarthome.AppConfigHelper.RetryCallback
                                public void retry() throws Exception {
                                }

                                @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                                public void onSuccess(String str2, Response response2) {
                                    AnonymousClass3.this.val$callback.onSuccess(str2, response2);
                                }
                            });
                            return response;
                        }
                    });
                    return;
                } catch (Exception e) {
                    this.val$callback.onFailure(new Error(-1, "catch exception"), e, null);
                    return;
                }
            }
            try {
                HttpApi.sendRequestDefault(AppConfigHelper.this.getRequest(this.val$name, this.val$version, this.val$lang, zIsEmpty ? null : "1"), new AsyncHandler<String, Error>(zIsEmpty, file2) { // from class: com.xiaomi.smarthome.AppConfigHelper.3.1
                    private boolean lastRequest;
                    final /* synthetic */ File val$filePath;
                    final /* synthetic */ boolean val$noCache;

                    {
                        this.val$noCache = zIsEmpty;
                        this.val$filePath = file2;
                        this.lastRequest = zIsEmpty;
                    }

                    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                    public void onFailure(Error error, Exception exc, Response response) {
                        AnonymousClass3.this.val$callback.onFailure(error, exc, response);
                        MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache onFailure:" + AnonymousClass3.this.val$preferKey + Log.getStackTraceString(exc));
                    }

                    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
                    public void processFailure(Call call, IOException iOException) {
                        AnonymousClass3.this.val$callback.sendFailureMessage(new Error(-1, "processFailure"), iOException, null);
                        MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache processFailure IOException:" + AnonymousClass3.this.val$preferKey + Log.getStackTraceString(iOException));
                    }

                    @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
                    public void processResponse(Response response) {
                        AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                        AppConfigHelper.this.processSuccess(response, anonymousClass3.lastUrl, anonymousClass3.val$interval, anonymousClass3.cache, anonymousClass3.val$name, anonymousClass3.val$preferKey, this.val$filePath, this.lastRequest, new RetryCallback() { // from class: com.xiaomi.smarthome.AppConfigHelper.3.1.1
                            @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                            public void onFailure(Error error, Exception exc, Response response2) {
                                AnonymousClass3.this.val$callback.sendFailureMessage(error, exc, response2);
                            }

                            @Override // com.xiaomi.smarthome.AppConfigHelper.RetryCallback
                            public void retry() throws Exception {
                                AnonymousClass1.this.lastRequest = true;
                                AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                                HttpApi.sendRequestDefault(AppConfigHelper.this.getRequest(anonymousClass4.val$name, anonymousClass4.val$version, anonymousClass4.val$lang, null), this);
                            }

                            @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                            public void onSuccess(String str2, Response response2) {
                                AnonymousClass3.this.val$callback.sendSuccessMessage(str2, response2);
                            }
                        });
                    }

                    @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
                    public void onSuccess(String str2, Response response) {
                        try {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            anonymousClass3.val$callback.onSuccess(AppConfigHelper.this.parseContent(anonymousClass3.val$name, new JSONObject(str2)), response);
                            MiJiaLog.onlyLogcat(AppConfigHelper.TAG, "requestConfigWitchCache onSuccess:" + AnonymousClass3.this.val$preferKey);
                        } catch (Exception e2) {
                            MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache onSuccess catch:" + AnonymousClass3.this.val$preferKey + Log.getStackTraceString(e2));
                            AnonymousClass3.this.val$callback.onFailure(new Error(-1, "jsonParse JSONException"), e2, response);
                        }
                    }
                });
            } catch (Exception e2) {
                MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache Exception:" + this.val$preferKey + Log.getStackTraceString(e2));
                this.val$callback.sendFailureMessage(new Error(-1, "getRequest Exception"), e2, null);
            }
        }
    }

    public static abstract class JsonAsyncHandler extends AsyncHandler<String, Error> {
        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public final void processFailure(Call call, IOException iOException) {
        }

        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public final void processResponse(Response response) {
        }

        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
        public final void sendSuccessMessage(String str, Response response) {
            super.sendSuccessMessage(str, response);
        }
    }

    public interface OnCacheHandler {
        boolean processAssets(String str) throws Exception;

        boolean processCache(String str) throws Exception;
    }

    public interface RetryCallback extends OkhttpCallback<String> {
        default void retry() throws Exception {
        }
    }

    static {
        if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
            AppConfigSetting.sUsePreviewConfig = SharePrefsManager.getSettingBoolean(MiJiaEnvironment.getAppContext(), APPCONFIG_CACHE, SH_APPCONFIG, false);
        }
    }

    public AppConfigHelper(Context context) {
        if (context == null) {
            context = MiJiaEnvironment.getAppContext();
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "context is null " + Log.getStackTraceString(new Exception()));
        }
        this.mContext = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Request getRequest(String str, String str2, String str3, String str4) throws JSONException, UnsupportedEncodingException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TSMAuthContants.PARAM_LANGUAGE, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(AppConfigSetting.sUsePreviewConfig ? "_preview" : "");
        jSONObject.put("name", sb.toString());
        jSONObject.put("version", str2);
        if (str4 != null) {
            jSONObject.put("result_level", str4);
        }
        return new Request.Builder().method("GET").url(ServerRouteUtil.buildSmartHomeHost(this.mContext) + "/app/service/getappconfig?data=" + URLEncoder.encode(jSONObject.toString(), "UTF-8")).build();
    }

    public static void init() {
    }

    public static boolean isJsonNotNull(String str) {
        return (str == null || str.equals("") || str.equals(AbstractJsonLexerKt.NULL) || str.equals("{}") || str.equals(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseConfigUrl(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        return jSONObjectOptJSONObject == null ? "" : jSONObjectOptJSONObject.optString("file_url");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String parseContent(String str, JSONObject jSONObject) throws IOException {
        if (!MiJiaEnvironment.isReleaseBuildType()) {
            File file = new File(this.mContext.getExternalFilesDir("appconfig_local") + File.separator + str + ".json");
            if (file.exists()) {
                StringBuilder sb = new StringBuilder();
                sb.append("parseContent load local:");
                sb.append(file);
                return new String(FileUtil.readFileToByteArray(file));
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("parseContent load nodata:");
            sb2.append(file);
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("result");
        if (jSONObjectOptJSONObject == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optString(MiuiCursorConstants.CONTENT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processSuccess(Response response, String str, long j, JSONObject jSONObject, String str2, String str3, File file, boolean z, RetryCallback retryCallback) {
        try {
            JSONObject jSONObject2 = new JSONObject(response.body().string());
            jSONObject2.put(LAST_REQUEST, System.currentTimeMillis());
            String configUrl = parseConfigUrl(jSONObject2);
            String content = parseContent(str2, jSONObject2);
            if (jSONObject2.optInt("code") != 0) {
                retryCallback.onFailure(new Error(-1, "parse Exception"), new Exception(), null);
                MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "requestConfigWitchCache code fail:" + str3 + " " + jSONObject2);
                return;
            }
            if (!z && !isJsonNotNull(content)) {
                if (!TextUtils.equals(str, configUrl)) {
                    retryCallback.retry();
                    MiJiaLog.onlyLogcat(TAG, "requestConfigWitchCache cache invalid:" + str3 + " newurl:" + configUrl);
                    return;
                }
                retryCallback.onSuccess(content, response);
                if (j != 0 && jSONObject != null) {
                    jSONObject.put(LAST_REQUEST, System.currentTimeMillis());
                    FileUtils.writeFile(file, jSONObject.toString().getBytes());
                }
                MiJiaLog.onlyLogcat(TAG, "requestConfigWitchCache file_url equal usercache:" + str3 + " url:" + configUrl);
                return;
            }
            retryCallback.onSuccess(content, response);
            MiJiaLog.onlyLogcat(TAG, "requestConfigWitchCache new data:" + str3);
            FileUtils.writeFile(file, jSONObject2.toString().getBytes());
        } catch (Exception e) {
            retryCallback.onFailure(new Error(-1, "parse Exception"), e, response);
            MiJiaLog.writeLogOnAll(LogType.GENERAL, TAG, "requestConfigWitchCache processFailure parsefail:" + str3 + Log.getStackTraceString(e));
        }
    }

    public File getFilePath() {
        return this.mSaveFilePath;
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, JsonAsyncHandler jsonAsyncHandler) {
        requestConfigWitchCache(str, str2, str3, str4, jsonAsyncHandler, this.executor);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, JsonAsyncHandler jsonAsyncHandler, long j) {
        requestConfigWitchCache(str, str2, str3, str4, jsonAsyncHandler, this.executor, j);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, JsonAsyncHandler jsonAsyncHandler, Executor executor) {
        requestConfigWitchCache(str, str2, str3, str4, jsonAsyncHandler, executor, 0L);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, OnCacheHandler onCacheHandler, JsonAsyncHandler jsonAsyncHandler, long j) {
        requestConfigWitchCache(str, str2, str3, str4, onCacheHandler, jsonAsyncHandler, this.executor, j);
    }

    public void requestConfigWitchCache(final String str, final String str2, final String str3, String str4, final JsonAsyncHandler jsonAsyncHandler, Executor executor, long j) {
        requestConfigWitchCache(str, str2, str3, str4, new OnCacheHandler() { // from class: com.xiaomi.smarthome.AppConfigHelper.1
            @Override // com.xiaomi.smarthome.AppConfigHelper.OnCacheHandler
            public boolean processAssets(String str5) throws Exception {
                return processCache(str5);
            }

            @Override // com.xiaomi.smarthome.AppConfigHelper.OnCacheHandler
            public boolean processCache(String str5) throws Exception {
                if (!AppConfigHelper.isJsonNotNull(str5)) {
                    return false;
                }
                MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache JsonAsyncHandler processCache " + str + str2 + str3);
                JsonAsyncHandler jsonAsyncHandler2 = jsonAsyncHandler;
                if (jsonAsyncHandler2 == null) {
                    return true;
                }
                jsonAsyncHandler2.sendSuccessMessage(str5, new Response.Builder().code(200).request(new okhttp3.Request.Builder().url(ServerRouteUtil.buildSmartHomeHost(AppConfigHelper.this.mContext)).build()).protocol(Protocol.HTTP_2).message("").build());
                return true;
            }
        }, new JsonAsyncHandler() { // from class: com.xiaomi.smarthome.AppConfigHelper.2
            @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
            public void onFailure(Error error, Exception exc, Response response) {
                JsonAsyncHandler jsonAsyncHandler2 = jsonAsyncHandler;
                if (jsonAsyncHandler2 != null) {
                    jsonAsyncHandler2.onFailure(error, exc, response);
                }
                MiJiaLog.writeLogOnAll(LogType.GENERAL, AppConfigHelper.TAG, "requestConfigWitchCache JsonAsyncHandler onFailure" + Log.getStackTraceString(exc));
            }

            @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
            public void sendProgressMessage(long j2, long j3) {
                JsonAsyncHandler jsonAsyncHandler2 = jsonAsyncHandler;
                if (jsonAsyncHandler2 != null) {
                    jsonAsyncHandler2.sendProgressMessage(j2, j3);
                }
            }

            @Override // com.xiaomi.smarthome.library.http.async.OkhttpCallback
            public void onSuccess(String str5, Response response) {
                JsonAsyncHandler jsonAsyncHandler2;
                if (!AppConfigHelper.isJsonNotNull(str5) || (jsonAsyncHandler2 = jsonAsyncHandler) == null) {
                    return;
                }
                jsonAsyncHandler2.onSuccess(str5, response);
            }
        }, executor, j);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, OnCacheHandler onCacheHandler, JsonAsyncHandler jsonAsyncHandler) {
        requestConfigWitchCache(str, str2, str3, str4, onCacheHandler, jsonAsyncHandler, this.executor);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, OnCacheHandler onCacheHandler, JsonAsyncHandler jsonAsyncHandler, Executor executor) {
        requestConfigWitchCache(str, str2, str3, str4, onCacheHandler, jsonAsyncHandler, executor, 0L);
    }

    public void requestConfigWitchCache(String str, String str2, String str3, String str4, OnCacheHandler onCacheHandler, JsonAsyncHandler jsonAsyncHandler, Executor executor, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(AppConfigSetting.sUsePreviewConfig ? "_preview" : "");
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(str2);
        sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        sb.append(str3);
        String string = sb.toString();
        MiJiaLog.onlyLogcat(TAG, "requestConfigWitchCache:" + string);
        executor.execute(new AnonymousClass3(string, onCacheHandler, str, str4, j, str2, str3, jsonAsyncHandler));
    }
}
