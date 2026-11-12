package com.xiaomi.smarthome.server;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.miui.circulate.device.api.DeviceInfo;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.Callback;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ZipFileUtils;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.common.network.WifiUtil;
import com.xiaomi.smarthome.library.common.threadpool.ThreadPoolManager;
import com.xiaomi.smarthome.library.http.Error;
import com.xiaomi.smarthome.library.http.HttpApi;
import com.xiaomi.smarthome.library.http.Request;
import com.xiaomi.smarthome.library.http.async.FileAsyncHandler;
import com.xiaomi.smarthome.library.http.async.HttpAsyncHandle;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginError;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.server.PluginDownExec;
import com.xiaomi.smarthome.server.callback.PluginCancelDownloadCallback;
import com.xiaomi.smarthome.server.util.PluginPackageUtils;
import defpackage.bg4;
import defpackage.j5h;
import defpackage.jz6;
import defpackage.o4h;
import defpackage.oi2;
import defpackage.v4h;
import java.io.File;
import java.net.CookieManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginDownExec {
    private final Context mAppContext;
    private final String mDir;
    private final Map<PluginDownloadTask, List<PluginDownloadTask>> mDownloadingPackageMap = new ConcurrentHashMap();
    private OkHttpClient mOkHttpClient;

    public static class FileDownloadCallbackInternal {
        public void onCancel() {
        }

        public void onFailure() {
        }

        public void onHandle(HttpAsyncHandle httpAsyncHandle) {
        }

        public void onProgress(float f) {
        }

        public void onStart() {
        }

        public void onSuccess() {
        }
    }

    public PluginDownExec(Context context, String str) {
        this.mAppContext = context;
        this.mDir = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchCallback(List<PluginDownloadTask> list, int i) {
        for (PluginDownloadTask pluginDownloadTask : list) {
            if (pluginDownloadTask.getCallback() != null) {
                pluginDownloadTask.getCallback().onFailure(pluginDownloadTask, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OkHttpClient getClient() {
        if (this.mOkHttpClient == null) {
            OkHttpClient.Builder builderDispatcher = new OkHttpClient.Builder().dispatcher(new Dispatcher(ThreadPoolManager.getHttpThreadPool()));
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.mOkHttpClient = builderDispatcher.connectTimeout(20L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).cookieJar(new JavaNetCookieJar(new CookieManager())).build();
        }
        return this.mOkHttpClient;
    }

    private String getPackageDownloadingPath(long j) {
        return this.mDir + File.separator + j + ".raw";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$startDownloadFileInternal$0(v4h v4hVar, Integer num) throws RuntimeException {
        writeLog("downloadRnExtModules result:" + num);
        if (num.intValue() == 0) {
            v4hVar.a(new Exception("downloadRnExtModules fail"));
        } else {
            v4hVar.onNext(num);
            v4hVar.onComplete();
        }
        return num;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFileInternal$1(final v4h v4hVar) throws Exception {
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().downloadRnExtModules(new Callback() { // from class: y1i
            @Override // com.xiaomi.smarthome.core.server.internal.plugin.util.Callback
            public final Object call(Object obj) {
                return this.f39684a.lambda$startDownloadFileInternal$0(v4hVar, (Integer) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFileInternal$2(Request request, File file, final FileDownloadCallbackInternal fileDownloadCallbackInternal, final long j, final String str, final String str2, final String str3, final v4h v4hVar) throws Exception {
        HttpApi.sendRequest(getClient(), request, new FileAsyncHandler(file) { // from class: com.xiaomi.smarthome.server.PluginDownExec.2
            private float mLastNotifyProgress = 0.0f;

            @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
            public void onFailure(Error error, Exception exc, Response response) {
                PluginDownExec pluginDownExec = PluginDownExec.this;
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(error != null ? error.getCode() : -1);
                objArr[1] = error != null ? error.getDetail() : "-";
                objArr[2] = Log.getStackTraceString(exc);
                objArr[3] = response != null ? response.toString() : "-";
                pluginDownExec.writeLog(String.format("startDownloadFileInternal onFailure(%s:%s, %s, %s)", objArr));
                FileUtils.deleteFile(str);
                if (TextUtils.isEmpty(str2)) {
                    PluginDownExec.this.writeLog("startDownloadFileInternal onFailure safeUrl is empty...");
                    v4hVar.a(exc);
                    return;
                }
                File fileCreateFileIfNotExists = FileUtils.createFileIfNotExists(str);
                if (fileCreateFileIfNotExists != null) {
                    PluginDownExec.this.writeLog("startDownloadFileInternal onFailure will downloadPlugin by http...");
                    fileDownloadCallbackInternal.onHandle(HttpApi.sendRequest(PluginDownExec.this.getClient(), new Request.Builder().method("GET").url(str3).build(), new FileAsyncHandler(fileCreateFileIfNotExists) { // from class: com.xiaomi.smarthome.server.PluginDownExec.2.1
                        @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
                        public void onFailure(Error error2, Exception exc2, Response response2) {
                            PluginDownExec.this.writeLog("startDownloadFileInternal onFailure 2 error:" + error2 + " e:" + Log.getStackTraceString(exc2));
                            FileUtils.deleteFile(str);
                            v4hVar.a(exc2);
                        }

                        /* JADX WARN: Code duplicated, block: B:15:0x0020  */
                        /* JADX WARN: Code duplicated, block: B:18:0x0027  */
                        @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
                        public void onProgress(long j2, long j3) {
                            float f;
                            float f2;
                            float f3;
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            FileDownloadCallbackInternal fileDownloadCallbackInternal2 = fileDownloadCallbackInternal;
                            if (fileDownloadCallbackInternal2 != null) {
                                long j4 = j;
                                float f4 = 0.0f;
                                if (j4 <= 0) {
                                    if (j3 > 0) {
                                        f2 = j2;
                                        f3 = j3;
                                    } else {
                                        f = 0.0f;
                                    }
                                    if (f >= 0.0f) {
                                        f4 = 1.0f;
                                        if (1.0f >= f) {
                                            f4 = f;
                                        }
                                    }
                                    fileDownloadCallbackInternal2.onProgress(f4);
                                }
                                f2 = j2;
                                f3 = j4;
                                f = f2 / f3;
                                if (f >= 0.0f) {
                                    f4 = 1.0f;
                                    if (1.0f >= f) {
                                        f4 = f;
                                    }
                                }
                                fileDownloadCallbackInternal2.onProgress(f4);
                            }
                        }

                        @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
                        public void onSuccess(File file2, Response response2) {
                            PluginDownExec.this.writeLog("startDownloadFileInternal onSuccess startDownloadFileInternal-file retry download onSuccess");
                            v4hVar.onNext(1);
                            v4hVar.onComplete();
                        }
                    }));
                } else {
                    PluginDownExec.this.writeLog("startDownloadFileInternal onFailure downloadingFileHttp is null...");
                    FileUtils.deleteFile(str);
                    v4hVar.a(new Exception("downloadingFileHttp == null"));
                }
            }

            /* JADX WARN: Code duplicated, block: B:15:0x001e  */
            /* JADX WARN: Code duplicated, block: B:18:0x0025  */
            /* JADX WARN: Code duplicated, block: B:21:0x0034  */
            /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
            @Override // com.xiaomi.smarthome.library.http.async.AsyncHandler
            public void onProgress(long j2, long j3) {
                float f;
                float f2;
                float f3;
                FileDownloadCallbackInternal fileDownloadCallbackInternal2 = fileDownloadCallbackInternal;
                if (fileDownloadCallbackInternal2 != null) {
                    long j4 = j;
                    float f4 = 0.0f;
                    if (j4 <= 0) {
                        if (j3 > 0) {
                            f2 = j2;
                            f3 = j3;
                        } else {
                            f = 0.0f;
                        }
                        if (f >= 0.0f) {
                            f4 = 1.0f;
                            if (1.0f >= f) {
                                f4 = f;
                            }
                        }
                        if (f4 - this.mLastNotifyProgress >= 0.01d) {
                            fileDownloadCallbackInternal2.onProgress(f4);
                            this.mLastNotifyProgress = f4;
                        }
                    }
                    f2 = j2;
                    f3 = j4;
                    f = f2 / f3;
                    if (f >= 0.0f) {
                        f4 = 1.0f;
                        if (1.0f >= f) {
                            f4 = f;
                        }
                    }
                    if (f4 - this.mLastNotifyProgress >= 0.01d) {
                        fileDownloadCallbackInternal2.onProgress(f4);
                        this.mLastNotifyProgress = f4;
                    }
                }
            }

            @Override // com.xiaomi.smarthome.library.http.async.FileAsyncHandler, com.xiaomi.smarthome.library.http.async.OkhttpCallback
            public void onSuccess(File file2, Response response) {
                PluginDownExec.this.writeLog("startDownloadFileInternal onSuccess startDownloadFileInternal-file download onSuccess...");
                v4hVar.onNext(1);
                v4hVar.onComplete();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer lambda$startDownloadFileInternal$3(Integer num, Integer num2) throws Exception {
        return Integer.valueOf(num.intValue() + num2.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFileInternal$4(FileDownloadCallbackInternal fileDownloadCallbackInternal, Integer num) throws Exception {
        writeLog("startDownloadFileInternal onSuccess:" + num);
        if (fileDownloadCallbackInternal != null) {
            fileDownloadCallbackInternal.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startDownloadFileInternal$5(FileDownloadCallbackInternal fileDownloadCallbackInternal, Throwable th) throws Exception {
        writeLog("startDownloadFileInternal onFailure:" + Log.getStackTraceString(th));
        if (fileDownloadCallbackInternal != null) {
            fileDownloadCallbackInternal.onFailure();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeLog(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", "DownTask", str);
    }

    public void cancelPluginDownloadInternal(String str, com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask pluginDownloadTask, PluginCancelDownloadCallback pluginCancelDownloadCallback) {
        PluginDownloadTask next;
        if (pluginDownloadTask == null) {
            if (pluginCancelDownloadCallback != null) {
                pluginCancelDownloadCallback.onFailure(str);
                return;
            }
            return;
        }
        List<PluginDownloadTask> list = this.mDownloadingPackageMap.get(Long.valueOf(pluginDownloadTask.getPackageId()));
        if (list == null) {
            if (pluginCancelDownloadCallback != null) {
                pluginCancelDownloadCallback.onFailure(str);
                return;
            }
            return;
        }
        Iterator<PluginDownloadTask> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getTaskId() != pluginDownloadTask.mTaskId);
        if (next == null) {
            if (pluginCancelDownloadCallback != null) {
                pluginCancelDownloadCallback.onFailure(str);
            }
        } else {
            if (list.size() > 1) {
                if (next.getCallback() != null) {
                    next.getCallback().onCancel(next);
                }
                list.remove(next);
                if (pluginCancelDownloadCallback != null) {
                    pluginCancelDownloadCallback.onSuccess(str);
                    return;
                }
                return;
            }
            HttpAsyncHandle handle = next.getHandle();
            if (handle != null) {
                handle.cancel();
            }
            if (pluginCancelDownloadCallback != null) {
                pluginCancelDownloadCallback.onSuccess(str);
            }
        }
    }

    public boolean isPluginForceUpdating(String str) {
        Iterator<Map.Entry<PluginDownloadTask, List<PluginDownloadTask>>> it = this.mDownloadingPackageMap.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            for (PluginDownloadTask pluginDownloadTask : it.next().getValue()) {
                if (pluginDownloadTask != null && pluginDownloadTask.isForce() && pluginDownloadTask.getModel().equalsIgnoreCase(str)) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    public void startDownloadFileInternal(final String str, final String str2, final long j, final String str3, final FileDownloadCallbackInternal fileDownloadCallbackInternal) {
        final File fileCreateFileIfNotExists = FileUtils.createFileIfNotExists(str3);
        if (fileCreateFileIfNotExists == null) {
            FileUtils.deleteFile(str3);
            if (fileDownloadCallbackInternal != null) {
                fileDownloadCallbackInternal.onFailure();
            }
            writeLog("start down createFileIfNotExists onFailure url:" + str);
            return;
        }
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
            FileUtils.deleteFile(str3);
            if (fileDownloadCallbackInternal != null) {
                fileDownloadCallbackInternal.onFailure();
            }
            writeLog("start down isEmpty safeUrl url:" + str);
            return;
        }
        final Request requestBuild = new Request.Builder().method("GET").url(TextUtils.isEmpty(str2) ? str : str2).build();
        if (!FileAsyncHandler.checkFileAsyncHandlerValidDirectory(fileCreateFileIfNotExists, false)) {
            if (fileDownloadCallbackInternal != null) {
                fileDownloadCallbackInternal.onFailure();
                return;
            }
            return;
        }
        writeLog("start down plugin and external url:" + str);
        writeLog("start downExternal(amap2d) & downloadRnExtModules");
        final jz6 jz6VarO = o4h.g0(o4h.f(new j5h() { // from class: t1i
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f34202a.lambda$startDownloadFileInternal$1(v4hVar);
            }
        }), o4h.f(new j5h() { // from class: u1i
            @Override // defpackage.j5h
            public final void subscribe(v4h v4hVar) throws Exception {
                this.f35275a.lambda$startDownloadFileInternal$2(requestBuild, fileCreateFileIfNotExists, fileDownloadCallbackInternal, j, str3, str2, str, v4hVar);
            }
        }), new oi2() { // from class: v1i
            @Override // defpackage.oi2
            public final Object apply(Object obj, Object obj2) {
                return PluginDownExec.lambda$startDownloadFileInternal$3((Integer) obj, (Integer) obj2);
            }
        }).O(new bg4() { // from class: w1i
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f37446a.lambda$startDownloadFileInternal$4(fileDownloadCallbackInternal, (Integer) obj);
            }
        }, new bg4() { // from class: x1i
            @Override // defpackage.bg4
            public final void accept(Object obj) throws Exception {
                this.f38578a.lambda$startDownloadFileInternal$5(fileDownloadCallbackInternal, (Throwable) obj);
            }
        });
        if (fileDownloadCallbackInternal != null) {
            fileDownloadCallbackInternal.onHandle(new HttpAsyncHandle(null) { // from class: com.xiaomi.smarthome.server.PluginDownExec.3
                @Override // com.xiaomi.smarthome.library.http.async.HttpAsyncHandle
                public void cancel() {
                    jz6VarO.dispose();
                }
            });
            fileDownloadCallbackInternal.onStart();
        }
    }

    public void startPluginDownloadTaskInternalExec(final String str, final PluginDownloadTask pluginDownloadTask) {
        final long packageId = pluginDownloadTask.getPackageId();
        List<PluginDownloadTask> copyOnWriteArrayList = this.mDownloadingPackageMap.get(pluginDownloadTask);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            pluginDownloadTask.setHandle(copyOnWriteArrayList.get(0).getHandle());
            copyOnWriteArrayList.add(pluginDownloadTask);
            writeLog("startPluginDownloadTaskInternalExec-startDownloadFileInternal same packageId " + packageId);
            return;
        }
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList<>();
            this.mDownloadingPackageMap.put(pluginDownloadTask, copyOnWriteArrayList);
        }
        copyOnWriteArrayList.add(pluginDownloadTask);
        final String packageDownloadingPath = getPackageDownloadingPath(packageId);
        final String packageType = pluginDownloadTask.getPackageType();
        writeLog("startPluginDownloadTaskInternalExec-startDownloadFileInternal...url: " + pluginDownloadTask.getPackageUrl());
        startDownloadFileInternal(pluginDownloadTask.getPackageUrl(), pluginDownloadTask.getPackageSafeUrl(), pluginDownloadTask.getPackageLength(), packageDownloadingPath, new FileDownloadCallbackInternal() { // from class: com.xiaomi.smarthome.server.PluginDownExec.1
            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onCancel() {
                List<PluginDownloadTask> list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                for (PluginDownloadTask pluginDownloadTask2 : list) {
                    if (pluginDownloadTask2.getCallback() != null) {
                        pluginDownloadTask2.getCallback().onCancel(pluginDownloadTask2);
                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_plugin", String.valueOf(pluginDownloadTask.getPackageId()), String.valueOf(pluginDownloadTask.getPluginId()), pluginDownloadTask.getPackageUrl(), pluginDownloadTask.getModel(), -1002);
                    }
                }
                PluginDownExec.this.mDownloadingPackageMap.remove(pluginDownloadTask);
            }

            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onFailure() {
                List list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                PluginDownExec.this.dispatchCallback(list, PluginError.DOWNERROR_DOWNERROR);
                PluginPackageUtils.reportPluginDownloadError("plugin download error(-663), plugin download failed : " + pluginDownloadTask.getModel());
                PluginDownExec.this.mDownloadingPackageMap.remove(pluginDownloadTask);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("plugin_id", pluginDownloadTask.getPluginId());
                    jSONObject.put("package_id", packageId);
                    jSONObject.put(DeviceInfo.Builder.PrivateDataKey.IP, WifiUtil.getIpAddress(PluginDownExec.this.mAppContext));
                    jSONObject.put("url", pluginDownloadTask.getPackageUrl());
                    jSONObject.put("safe_url", pluginDownloadTask.getPackageSafeUrl());
                    PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().addStatRecord("plugin_download_failed", jSONObject.toString());
                } catch (Exception unused) {
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((PluginDownloadTask) it.next()).getCallback() != null) {
                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_plugin", String.valueOf(pluginDownloadTask.getPackageId()), String.valueOf(pluginDownloadTask.getPluginId()), pluginDownloadTask.getModel(), pluginDownloadTask.getPackageUrl(), -1001);
                    }
                }
            }

            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onHandle(HttpAsyncHandle httpAsyncHandle) {
                List<PluginDownloadTask> list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                for (PluginDownloadTask pluginDownloadTask2 : list) {
                    if (pluginDownloadTask2.getCallback() != null) {
                        pluginDownloadTask2.setHandle(httpAsyncHandle);
                    }
                }
            }

            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onProgress(float f) {
                List<PluginDownloadTask> list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                for (PluginDownloadTask pluginDownloadTask2 : list) {
                    if (pluginDownloadTask2.getCallback() != null) {
                        pluginDownloadTask2.getCallback().onProgress(pluginDownloadTask2, ((Boolean) pluginDownloadTask2.getRelativeData("download_sdk", Boolean.FALSE)).booleanValue() ? (0.8f * f) + 0.2f : f);
                    }
                }
            }

            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onStart() {
                List<PluginDownloadTask> list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                for (PluginDownloadTask pluginDownloadTask2 : list) {
                    if (pluginDownloadTask2.getCallback() != null && !((Boolean) pluginDownloadTask2.getRelativeData("started", Boolean.FALSE)).booleanValue()) {
                        pluginDownloadTask2.getCallback().onStart(pluginDownloadTask2);
                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_plugin", String.valueOf(pluginDownloadTask2.getPackageId()), String.valueOf(pluginDownloadTask2.getPluginId()), pluginDownloadTask2.getModel(), pluginDownloadTask2.getPackageUrl(), 1);
                    }
                }
            }

            @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
            public void onSuccess() {
                boolean zCopyFileToFile;
                List<PluginDownloadTask> list = (List) PluginDownExec.this.mDownloadingPackageMap.get(pluginDownloadTask);
                if (list == null) {
                    return;
                }
                if ("rn".equalsIgnoreCase(packageType)) {
                    FileUtils.deleteFile(str);
                    zCopyFileToFile = false;
                    try {
                        if (ZipFileUtils.syncUnzip(packageDownloadingPath, str) && FileUtils.createFileIfNotExists(new File(str, PluginPackageConstant.RN_CONF_A).getAbsolutePath()).exists()) {
                            zCopyFileToFile = true;
                        }
                    } catch (Exception e) {
                        PluginDownExec.this.writeLog(Log.getStackTraceString(e));
                    }
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((PluginDownloadTask) it.next()).getModel());
                    }
                    new PluginJsonExtra(new File(str)).setModelList(hashSet).setVersion(pluginDownloadTask.getVersion()).save();
                } else {
                    zCopyFileToFile = FileUtils.copyFileToFile(packageDownloadingPath, str);
                }
                FileUtils.deleteFile(packageDownloadingPath);
                if (zCopyFileToFile) {
                    PluginDownExec.this.writeLog("plugin manager download plugin success");
                    PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(PluginDownExec.this.mAppContext, pluginDownloadTask.getPluginId(), pluginDownloadTask.getPackageId(), pluginDownloadTask.getPackageType(), str);
                    if (pluginPackageInfoCreatePluginPackageInfo == null) {
                        FileUtils.deleteFile(str);
                        PluginDownExec.this.writeLog("startPluginDownloadTaskInternalExec packageInfo null");
                        PluginDownExec.this.dispatchCallback(list, PluginError.DOWNERROR_CREATE_PACKAGE_INFO_ERROR);
                    } else {
                        Context context = PluginDownExec.this.mAppContext;
                        String developerInfo = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getDeveloperInfo(pluginPackageInfoCreatePluginPackageInfo.getDeveloperId());
                        if (!PluginPackageUtils.validatePackageSignature(context, pluginPackageInfoCreatePluginPackageInfo, developerInfo)) {
                            FileUtils.deleteFile(str);
                            PluginDownExec.this.writeLog("startPluginDownloadTaskInternalExec validateSignature fail:" + pluginPackageInfoCreatePluginPackageInfo.toLog() + developerInfo);
                            PluginDownExec.this.dispatchCallback(list, PluginError.DOWNERROR_VERIFY);
                        } else if (PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo)) {
                            for (PluginDownloadTask pluginDownloadTask2 : list) {
                                if (pluginDownloadTask2.getCallback() != null) {
                                    pluginDownloadTask2.getCallback().onSuccess(pluginDownloadTask2, pluginPackageInfoCreatePluginPackageInfo);
                                    PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_plugin", String.valueOf(pluginDownloadTask2.getPackageId()), String.valueOf(pluginDownloadTask2.getPluginId()), pluginDownloadTask2.getModel(), pluginDownloadTask2.getPackageUrl(), 0);
                                }
                            }
                        } else {
                            FileUtils.deleteFile(str);
                            PluginDownExec.this.writeLog("startPluginDownloadTaskInternalExec validatePackage fail:" + pluginPackageInfoCreatePluginPackageInfo.toLog() + developerInfo);
                            PluginDownExec.this.dispatchCallback(list, PluginError.DOWNERROR_PLATFORM);
                        }
                    }
                } else {
                    PluginDownExec.this.writeLog("plugin manager download plugin fail");
                    FileUtils.deleteFile(str);
                    PluginDownExec.this.dispatchCallback(list, PluginError.DOWNERROR_DOWNERRORCOPY);
                }
                PluginDownExec.this.mDownloadingPackageMap.remove(pluginDownloadTask);
            }
        });
    }
}
