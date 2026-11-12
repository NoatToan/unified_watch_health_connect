package com.xiaomi.smarthome.server;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback;
import com.xiaomi.smarthome.core.server.internal.CoreError;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ZipFileUtils;
import com.xiaomi.smarthome.device.api.Callback;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.network.WifiUtil;
import com.xiaomi.smarthome.library.common.util.MMKVManager;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.plugin.update.DownloadRnSdkResult;
import com.xiaomi.smarthome.plugin.update.PluginError;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.rn.core.bean.RnSdkInfo;
import com.xiaomi.smarthome.server.api.PluginUpdateApi;
import com.xiaomi.smarthome.server.callback.PluginCancelDownloadCallback;
import com.xiaomi.smarthome.server.callback.PluginDownloadCallback;
import com.xiaomi.smarthome.server.callback.PluginInstallCallback;
import com.xiaomi.smarthome.server.entity.PluginUpdateInfoResult;
import com.xiaomi.smarthome.server.util.PluginPackageUtils;
import com.xiaomi.smarthome.setting.PluginSetting;
import com.xiaomi.smarthome.update.IPluginUpdateProvider;
import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginUpdateManager {
    public static final String TAG = "PluginUpdateManager";
    private static volatile PluginUpdateManager sInstance;
    private static final Object sLock = new Object();
    private Context mAppContext;
    private final PluginDownExec mPluginDownTask;
    private SharedPreferences mPluginSDKPref;
    private Map<Long, RnSdkTask> mRnSdkTaskMap = new ConcurrentHashMap();
    Handler mUiHandler;
    WorkerHandler mWorkerHandler;
    MessageHandlerThread mWorkerThread;

    /* JADX INFO: renamed from: com.xiaomi.smarthome.server.PluginUpdateManager$7, reason: invalid class name */
    public class AnonymousClass7 extends PluginDownloadCallback {
        final /* synthetic */ PluginDownloadCallback val$outCallback;

        public AnonymousClass7(PluginDownloadCallback pluginDownloadCallback) {
            this.val$outCallback = pluginDownloadCallback;
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onCancel(final String str) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onCancel(str);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onDownInfoSuccess(final ArrayList<com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask> arrayList) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onDownInfoSuccess(arrayList);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onFailure(final String str, final int i) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onFailure(str, i);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onProgress(final String str, final float f) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onProgress(str, f);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onStart(final ArrayList<com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask> arrayList) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onStart(arrayList);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginDownloadCallback
        public void onSuccess(final String str) {
            final PluginDownloadCallback pluginDownloadCallback = this.val$outCallback;
            if (pluginDownloadCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginDownloadCallback.onSuccess(str);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.smarthome.server.PluginUpdateManager$8, reason: invalid class name */
    public class AnonymousClass8 implements PluginInstallCallback {
        final /* synthetic */ PluginInstallCallback val$outCallback;
        final /* synthetic */ String val$record;

        public AnonymousClass8(PluginInstallCallback pluginInstallCallback, String str) {
            this.val$outCallback = pluginInstallCallback;
            this.val$record = str;
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onCancel(final String str) {
            PluginUpdateManager.this.reportRnPluginInstallRes(this.val$record, -2);
            final PluginInstallCallback pluginInstallCallback = this.val$outCallback;
            if (pluginInstallCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginInstallCallback.onCancel(str);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onFailure(final String str, final int i) {
            PluginUpdateManager.this.reportRnPluginInstallRes(this.val$record, -1);
            final PluginInstallCallback pluginInstallCallback = this.val$outCallback;
            if (pluginInstallCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginInstallCallback.onFailure(str, i);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onStart(final String str) {
            final PluginInstallCallback pluginInstallCallback = this.val$outCallback;
            if (pluginInstallCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginInstallCallback.onStart(str);
                    }
                });
            }
        }

        @Override // com.xiaomi.smarthome.server.callback.PluginInstallCallback
        public void onSuccess(final String str) {
            PluginUpdateManager.this.reportRnPluginInstallRes(this.val$record, 0);
            final PluginInstallCallback pluginInstallCallback = this.val$outCallback;
            if (pluginInstallCallback != null) {
                PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        pluginInstallCallback.onSuccess(str);
                    }
                });
            }
        }
    }

    public static class BaseCallbackInternal {
        private BaseCallbackInternal() {
        }
    }

    public static abstract class DebugPackageCallback {
        public abstract void onDownloadFailure(String str);

        public abstract void onDownloadSuccess();

        public abstract void onInstallFailure(String str);

        public abstract void onInstallSuccess();
    }

    public abstract class DebugPackageCallbackInternal extends BaseCallbackInternal {
        private DebugPackageCallbackInternal() {
            super();
        }

        public abstract void onDownloadFailure(String str);

        public abstract void onDownloadSuccess();

        public abstract void onInstallFailure(String str);

        public abstract void onInstallSuccess();
    }

    public static class Operation {
        BaseCallbackInternal callbackInternal;
        Object extra;
        String model;

        private Operation() {
        }
    }

    public interface RnSdkDownloadCallback {
        void onFailure(DownloadRnSdkResult downloadRnSdkResult);

        void onProgress(DownloadRnSdkResult downloadRnSdkResult);

        void onSuccess(DownloadRnSdkResult downloadRnSdkResult);
    }

    public static class RnSdkTask {
        String download_url;
        long length;
        volatile RnSdkDownloadCallback mCallback;
        long package_version;
        long sdk_api_level;
        long timestamp = 0;
        long build_time = 0;
        int status = 0;
        List<Object> nextTasks = new CopyOnWriteArrayList();
        long downloadStartTime = 0;
    }

    public class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 18) {
                Object obj = message.obj;
                if (obj instanceof Operation) {
                    PluginUpdateManager.this.downloadDebugPluginInternal((DebugPackageCallbackInternal) ((Operation) obj).callbackInternal);
                    return;
                }
                return;
            }
            if (i != 24) {
                return;
            }
            Object obj2 = message.obj;
            if (obj2 instanceof RnSdkTask) {
                PluginUpdateManager.this.processRnSdkTaskExec((RnSdkTask) obj2);
            }
        }
    }

    private PluginUpdateManager() {
        Context appContext = MiJiaEnvironment.getAppContext();
        this.mAppContext = appContext;
        this.mPluginSDKPref = PluginPackageUtils.getPluginSDKPref(PluginPackageConstant.PLUGIN_RECORD_LIST_PREF, appContext);
        Context context = this.mAppContext;
        StringBuilder sb = new StringBuilder();
        sb.append(PluginPackageUtils.getAppFilesDir(this.mAppContext));
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append("downloading");
        this.mPluginDownTask = new PluginDownExec(context, sb.toString());
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("PluginUpdateWorker");
        this.mWorkerThread = messageHandlerThread;
        messageHandlerThread.start();
        this.mWorkerHandler = new WorkerHandler(this.mWorkerThread.getLooper());
        this.mUiHandler = new Handler(Looper.getMainLooper());
        if (PluginPackageManager.getInstance().isInited()) {
            return;
        }
        PluginPackageManager.getInstance().init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downloadDebugPluginInternal(DebugPackageCallbackInternal debugPackageCallbackInternal) {
        PluginPackageManager.DebugPkgResult sDCardDebugPkgResultInternal = PluginPackageManager.getInstance().getSDCardDebugPkgResultInternal();
        if (sDCardDebugPkgResultInternal.hasError) {
            PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure(sDCardDebugPkgResultInternal.errorMsg);
                return;
            }
            return;
        }
        long j = sDCardDebugPkgResultInternal.debugPluginId;
        long j2 = sDCardDebugPkgResultInternal.debugPkgId;
        String str = sDCardDebugPkgResultInternal.debugPkgType;
        boolean zEqualsIgnoreCase = "rn".equalsIgnoreCase(str);
        String packageDownloadedPath = PluginPackageManager.getInstance().getPackageDownloadedPath(j, j2, str);
        FileUtils.copyFileToFile(sDCardDebugPkgResultInternal.debugPkgPath, packageDownloadedPath);
        PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, j, j2, str, packageDownloadedPath);
        if (pluginPackageInfoCreatePluginPackageInfo == null) {
            PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure("未获取到插件包配置信息");
                return;
            }
            return;
        }
        String developerInfo = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getDeveloperInfo(pluginPackageInfoCreatePluginPackageInfo.getDeveloperId());
        if (!zEqualsIgnoreCase && developerInfo == null) {
            PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure("开发者不存在(id:" + pluginPackageInfoCreatePluginPackageInfo.getDeveloperId() + ")");
                return;
            }
            return;
        }
        if (!PluginPackageUtils.validatePackageSignature(this.mAppContext, pluginPackageInfoCreatePluginPackageInfo, developerInfo)) {
            PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure("插件包签名错误");
                return;
            }
            return;
        }
        if (!PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo)) {
            PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure("插件包MinApiLevel错误");
                return;
            }
            return;
        }
        boolean zCopyFileToFile = FileUtils.copyFileToFile(sDCardDebugPkgResultInternal.debugPkgPath, packageDownloadedPath);
        PluginPackageManager.getInstance().clearSDCardDebugPackageInternal();
        if (!zCopyFileToFile) {
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadFailure("插件包拷贝失败");
            }
        } else {
            PluginPackageManager.getInstance().addDownloadedPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onDownloadSuccess();
            }
            installDebugPluginInternal(pluginPackageInfoCreatePluginPackageInfo, debugPackageCallbackInternal);
        }
    }

    private void downloadInnerPluginInternal(String str, PluginDownloadCallback pluginDownloadCallback) {
        writeLog("downloadInnerPluginInternal 内置插件进行模拟下载过程..." + str);
        PluginPackageInfo innerPluginPackageInfo = InnerPluginPackageManager.getInstance().getInnerPluginPackageInfo(str);
        if (innerPluginPackageInfo == null) {
            writeLog("downloadInnerPluginInternal inner packageInfo is null, model is " + str);
            if (pluginDownloadCallback != null) {
                pluginDownloadCallback.onFailure(str, PluginError.DOWNERROR_DOWNERROR);
                PluginPackageUtils.reportPluginDownloadError("innerplugin download error(-663),getInnerPluginPackageInfo=null:" + str);
                return;
            }
            return;
        }
        HashMap<String, PluginDownloadTask> map = new HashMap<>();
        PluginDownloadTask pluginDownloadTask = new PluginDownloadTask(str);
        map.put(str, pluginDownloadTask);
        if (pluginDownloadCallback != null) {
            pluginDownloadCallback.onStart(toOutTask(map));
        }
        pluginDownloadTask.setRnSdkLevel(innerPluginPackageInfo.getMinApiLevel());
        pluginDownloadTask.setPluginId(innerPluginPackageInfo.getPluginId());
        pluginDownloadTask.setPackageId(innerPluginPackageInfo.getPackageId());
        pluginDownloadTask.setPackageType(innerPluginPackageInfo.getPackageType());
        pluginDownloadTask.setPackageUrl("");
        pluginDownloadTask.setPackageSafeUrl("");
        pluginDownloadTask.setPackageLength(1132240L);
        pluginDownloadTask.setVersion(innerPluginPackageInfo.getVersion());
        pluginDownloadTask.setChangeLog("");
        boolean z = false;
        pluginDownloadTask.setIsForce(false);
        if (pluginDownloadCallback != null) {
            pluginDownloadCallback.onDownInfoSuccess(toOutTask(map));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(PluginPackageUtils.getAppFilesDir(this.mAppContext));
        String str2 = File.separator;
        sb.append(str2);
        sb.append("plugin");
        sb.append(str2);
        sb.append("downloading");
        sb.append(str2);
        sb.append(innerPluginPackageInfo.getPackageId());
        sb.append(".raw");
        String string = sb.toString();
        if (!FileUtils.copyAsserts(this.mAppContext, innerPluginPackageInfo.getPackagePath(), string)) {
            writeLog("downloadInnerPluginInternal 内置插件压缩文件 从 assert 目录拷贝到下载目录出现错误..." + string);
            if (pluginDownloadCallback != null) {
                pluginDownloadCallback.onFailure(str, PluginError.DOWNERROR_DOWNERROR);
                PluginPackageUtils.reportPluginDownloadError("innerplugin download error(-663),copyAsserts failed:" + str);
                return;
            }
            return;
        }
        String packageDownloadedPath = PluginPackageManager.getInstance().getPackageDownloadedPath(innerPluginPackageInfo.getPluginId(), innerPluginPackageInfo.getPackageId(), innerPluginPackageInfo.getPackageType());
        FileUtils.deleteFile(packageDownloadedPath);
        if (ZipFileUtils.syncUnzip(string, packageDownloadedPath) && FileUtils.createFileIfNotExists(new File(packageDownloadedPath, PluginPackageConstant.RN_CONF_A).getAbsolutePath()).exists()) {
            z = true;
        }
        FileUtils.deleteFile(string);
        if (z) {
            new PluginJsonExtra(new File(packageDownloadedPath)).setModelList(Collections.singletonList(str)).setVersion(innerPluginPackageInfo.getVersion()).save();
            PluginPackageManager.getInstance().addDownloadedPackageInfoInternal(PluginPackageUtils.createPluginPackageInfo(this.mAppContext, innerPluginPackageInfo.getPluginId(), innerPluginPackageInfo.getPackageId(), innerPluginPackageInfo.getPackageType(), packageDownloadedPath));
            if (pluginDownloadCallback != null) {
                pluginDownloadCallback.onSuccess(str);
                return;
            }
            return;
        }
        writeLog("downloadInnerPluginInternal 内置插件进行解压出现错误..." + packageDownloadedPath);
        if (pluginDownloadCallback != null) {
            pluginDownloadCallback.onFailure(str, PluginError.DOWNERROR_DOWNERROR);
            PluginPackageUtils.reportPluginDownloadError("innerplugin download error(-663),syncUnzip failed:" + str);
        }
    }

    private void downloadPluginInternal(List<String> list, final boolean z, final PluginDownloadCallback pluginDownloadCallback) {
        if (list.size() == 1 && PluginPackageManager.getInstance().getDownloadPackageInfo(list.get(0)) == null && InnerPluginPackageManager.getInstance().isInnerPluginModel(list.get(0)) && !isStdPluginAndNotUnzipInnerPlugin(list.get(0))) {
            downloadInnerPluginInternal(list.get(0), pluginDownloadCallback);
            return;
        }
        JSONArray jSONArray = new JSONArray();
        final HashMap<String, PluginDownloadTask> map = new HashMap<>();
        for (String str : list) {
            jSONArray.put(PluginPackageManager.getInstance().createPluginInfoParams(str));
            map.put(str, new PluginDownloadTask(str));
        }
        pluginDownloadCallback.onStart(toOutTask(map));
        PluginUpdateApi.getInstance().updatePlugin(jSONArray, PluginSetting.API_LEVEL, SystemApi.getInstance().getPlatform(), new CoreAsyncCallback<List<PluginUpdateInfoResult>, CoreError>() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.2
            @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
            public void onFailure(CoreError coreError) {
                PluginUpdateManager pluginUpdateManager = PluginUpdateManager.this;
                StringBuilder sb = new StringBuilder();
                sb.append("downloadPluginInternal fetch plugin error, ");
                sb.append(coreError == null ? "" : coreError.toString());
                pluginUpdateManager.writeLog(sb.toString());
                pluginDownloadCallback.onFailure(null, PluginError.DOWNERROR_INFOERROR);
                int code = coreError.getCode();
                Iterator it = map.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (code > 0) {
                        PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", (PluginDownloadTask) entry.getValue(), (-10000) - code);
                    } else {
                        PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", (PluginDownloadTask) entry.getValue(), code - 200000);
                    }
                }
            }

            @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
            public void onSuccess(List<PluginUpdateInfoResult> list2) throws Throwable {
                HashMap map2 = new HashMap();
                for (PluginUpdateInfoResult pluginUpdateInfoResult : list2) {
                    pluginUpdateInfoResult.setTask((PluginDownloadTask) map.get(pluginUpdateInfoResult.mModel));
                    map2.put(pluginUpdateInfoResult.mModel, pluginUpdateInfoResult);
                }
                pluginDownloadCallback.onDownInfoSuccess(PluginUpdateManager.this.toOutTask(map));
                for (Map.Entry entry : map.entrySet()) {
                    final String str2 = (String) entry.getKey();
                    final PluginUpdateInfoResult pluginUpdateInfoResult2 = (PluginUpdateInfoResult) map2.get(str2);
                    if (pluginUpdateInfoResult2 == null) {
                        pluginDownloadCallback.onFailure(null, PluginError.DOWNERROR_APPVERSION);
                        PluginUpdateManager.this.writeLog("downloadPluginInternal updatePlugin result is null model:" + str2);
                        PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", (PluginDownloadTask) entry.getValue(), -1007, 0L);
                    } else {
                        final long j = pluginUpdateInfoResult2.mPluginId;
                        final long j2 = pluginUpdateInfoResult2.mPackageId;
                        final String str3 = pluginUpdateInfoResult2.mPackgeType;
                        final PluginDownloadTask pluginDownloadTask = (PluginDownloadTask) entry.getValue();
                        if (pluginUpdateInfoResult2.hasNewVersion()) {
                            PluginUpdateManager.this.writeLog(str2 + " downloadPluginInternal has Newest Package id  - " + j2);
                            boolean z2 = z;
                            if ("rn".equalsIgnoreCase(str3)) {
                                z2 = true;
                            }
                            if (pluginUpdateInfoResult2.isForce() || WifiUtil.isWifi(PluginUpdateManager.this.mAppContext) || z2) {
                                pluginDownloadTask.setCallback(new PluginDownloadTask.DownloadTaskCallbackInternal() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.2.1
                                    @Override // com.xiaomi.smarthome.server.PluginDownloadTask.DownloadTaskCallbackInternal
                                    public void onCancel(PluginDownloadTask pluginDownloadTask2) {
                                        pluginDownloadCallback.onCancel(pluginDownloadTask2.getModel());
                                        PluginUpdateManager.this.writeLog("downloadPluginInternal onCancel task:" + pluginDownloadTask2);
                                        if ("rn".equalsIgnoreCase(str3)) {
                                            PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", pluginDownloadTask, -1008);
                                        }
                                    }

                                    @Override // com.xiaomi.smarthome.server.PluginDownloadTask.DownloadTaskCallbackInternal
                                    public void onFailure(PluginDownloadTask pluginDownloadTask2, int i) {
                                        pluginDownloadCallback.onFailure(pluginDownloadTask2.getModel(), i);
                                        PluginUpdateManager.this.writeLog("downloadPluginInternal onFailure task:" + pluginDownloadTask2 + ", error:" + i);
                                        if ("rn".equalsIgnoreCase(str3)) {
                                            if (i > 0) {
                                                PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", pluginDownloadTask, (-30000) - i);
                                            } else {
                                                PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", pluginDownloadTask, i - 40000);
                                            }
                                        }
                                    }

                                    @Override // com.xiaomi.smarthome.server.PluginDownloadTask.DownloadTaskCallbackInternal
                                    public void onProgress(PluginDownloadTask pluginDownloadTask2, float f) {
                                        pluginDownloadCallback.onProgress(pluginDownloadTask2.getModel(), f);
                                    }

                                    @Override // com.xiaomi.smarthome.server.PluginDownloadTask.DownloadTaskCallbackInternal
                                    public void onStart(PluginDownloadTask pluginDownloadTask2) {
                                        pluginDownloadTask2.setDownloadStartTime(System.currentTimeMillis());
                                        PluginUpdateManager.this.writeLog("downloadPluginInternal onStart task:" + pluginDownloadTask2);
                                    }

                                    @Override // com.xiaomi.smarthome.server.PluginDownloadTask.DownloadTaskCallbackInternal
                                    public void onSuccess(PluginDownloadTask pluginDownloadTask2, PluginPackageInfo pluginPackageInfo) {
                                        if ("rn".equalsIgnoreCase(pluginDownloadTask2.getPackageType())) {
                                            PluginPackageManager.getInstance().deleteOldPlugin(0, str2, j, pluginDownloadTask2.getPackageType(), pluginPackageInfo);
                                        }
                                        PluginPackageManager.getInstance().addDownloadedPackageInfoInternal(pluginPackageInfo);
                                        pluginDownloadCallback.onSuccess(pluginDownloadTask2.getModel());
                                        try {
                                            if ("rn".equalsIgnoreCase(pluginDownloadTask2.getPackageType())) {
                                                long pluginId = pluginDownloadTask2.getPluginId();
                                                PluginUpdateInfoResult pluginUpdateInfoResult3 = pluginUpdateInfoResult2;
                                                if (pluginId == pluginUpdateInfoResult3.mPluginId && pluginPackageInfo != null) {
                                                    pluginPackageInfo.setVersion(pluginUpdateInfoResult3.mVersion);
                                                }
                                            }
                                            JSONObject jSONObject = new JSONObject();
                                            jSONObject.put("plugin_id", j);
                                            jSONObject.put("package_id", j2);
                                            jSONObject.put("download_type", "remote");
                                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().addStatRecord("plugin_download_success", jSONObject.toString());
                                        } catch (Exception e) {
                                            PluginUpdateManager.this.writeLog("plugin download err : " + Log.getStackTraceString(e));
                                        }
                                        PluginUpdateManager.this.writeLog("downloadPluginInternal success task:" + pluginDownloadTask2 + " pluginPackageInfo:" + pluginPackageInfo);
                                        if ("rn".equalsIgnoreCase(str3)) {
                                            PluginUpdateManager.this.reportRnPluginDownloadRes("download_plugin", pluginDownloadTask, 0);
                                        }
                                    }
                                });
                                PluginUpdateManager.this.startPluginDownloadTaskInternal(pluginDownloadTask);
                                PluginUpdateManager.this.writeLog("downloadPluginInternal start download package  - " + j2);
                            } else {
                                PluginUpdateManager.this.writeLog("downloadPluginInternal tempDownloadImmediately false");
                            }
                        } else {
                            pluginDownloadCallback.onFailure(str2, PluginError.DOWNERROR_NOPLUGIN);
                        }
                        map2 = map2;
                    }
                }
            }
        });
    }

    public static PluginUpdateManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new PluginUpdateManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private void installDebugPluginInternal(PluginPackageInfo pluginPackageInfo, DebugPackageCallbackInternal debugPackageCallbackInternal) {
        if (!MiJiaEnvironment.isDevChannel()) {
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onInstallFailure("");
                return;
            }
            return;
        }
        String packagePath = pluginPackageInfo.getPackagePath();
        long pluginId = pluginPackageInfo.getPluginId();
        long packageId = pluginPackageInfo.getPackageId();
        String packageType = pluginPackageInfo.getPackageType();
        String packageInstalledPath = PluginPackageManager.getInstance().getPackageInstalledPath(pluginPackageInfo.getPluginId(), pluginPackageInfo.getPackageId(), packageType);
        if (packageType.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_MPK)) {
            if (!FileUtils.copyFileToFile(packagePath, packageInstalledPath)) {
                FileUtils.deleteFile(packageInstalledPath);
                if (debugPackageCallbackInternal != null) {
                    debugPackageCallbackInternal.onInstallFailure("");
                    return;
                }
                return;
            }
        } else if ("rn".equalsIgnoreCase(packageType)) {
            installRNPackage(pluginPackageInfo.getModelList().get(0), pluginId, packageId, packagePath, PluginPackageManager.getInstance().getPackageInstalledPath(pluginId, packageId, "rn"));
        }
        PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, pluginId, packageId, packageType, packageInstalledPath);
        if (pluginPackageInfoCreatePluginPackageInfo == null || PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getDeveloperInfo(pluginPackageInfoCreatePluginPackageInfo.getDeveloperId()) == null) {
            FileUtils.deleteFile(packageInstalledPath);
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onInstallFailure("");
                return;
            }
            return;
        }
        if (!PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo)) {
            FileUtils.deleteFile(packageInstalledPath);
            if (debugPackageCallbackInternal != null) {
                debugPackageCallbackInternal.onInstallFailure("");
                return;
            }
            return;
        }
        if (packageType.equals(PluginPackageConstant.PLUGIN_TYPE_MPK)) {
            PluginSoManager.getInstance().install(this.mAppContext, pluginId, packageId, packageInstalledPath);
        }
        PluginPackageManager.getInstance().addInstalledPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
        if (debugPackageCallbackInternal != null) {
            debugPackageCallbackInternal.onInstallSuccess();
        }
    }

    private void installPluginInternal(final String str, final PluginInstallCallback pluginInstallCallback) {
        PluginPackageInfo downloadPackageInfo = PluginPackageManager.getInstance().getDownloadPackageInfo(str);
        if (pluginInstallCallback != null) {
            pluginInstallCallback.onStart(str);
        }
        DynamicFeatureManager dynamicFeatureManager = DynamicFeatureManager.instance;
        if (dynamicFeatureManager.isDynamicFeature(str)) {
            dynamicFeatureManager.installPlugin(str, new DynamicFeatureManager.DynamicFeatureCallback(str) { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.1
                @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                public void onFailure(String str2, int i) {
                    PluginInstallCallback pluginInstallCallback2 = pluginInstallCallback;
                    if (pluginInstallCallback2 != null) {
                        pluginInstallCallback2.onFailure(str, PluginError.INSTALLERROR_DYNAMICFEATURE);
                    }
                }

                @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                public void onSuccess(String str2, PluginPackageInfo pluginPackageInfo) {
                    PluginPackageManager.getInstance().addInstalledPackageInfoInternal(pluginPackageInfo);
                    PluginInstallCallback pluginInstallCallback2 = pluginInstallCallback;
                    if (pluginInstallCallback2 != null) {
                        pluginInstallCallback2.onSuccess(str);
                    }
                }
            });
            return;
        }
        if (downloadPackageInfo == null) {
            writeLog("installPlugin onFailure downInfo == null record:" + str);
            reportRnInstallDetailRes(str, -1001);
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_INFOERROR);
                return;
            }
            return;
        }
        if (downloadPackageInfo.getPackageId() <= 0) {
            writeLog("installPluginInternal installingPackageInfo is null pluginRecord:" + str + "  installingPackageInfo:" + downloadPackageInfo);
            reportRnInstallDetailRes(str, -1002);
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_INFOERROR);
                return;
            }
            return;
        }
        if (downloadPackageInfo.isApkPlugin()) {
            return;
        }
        if (downloadPackageInfo.isRNPlugin()) {
            long pluginId = downloadPackageInfo.getPluginId();
            long packageId = downloadPackageInfo.getPackageId();
            String rnPackageTempPath = PluginPackageManager.getInstance().getRnPackageTempPath(pluginId, packageId);
            if (!new File(rnPackageTempPath, PluginPackageConstant.RN_DIR_A).exists()) {
                rnPackageTempPath = PluginPackageManager.getInstance().getPackageDownloadedPath(pluginId, packageId, "rn");
            }
            String packageInstalledPath = PluginPackageManager.getInstance().getPackageInstalledPath(pluginId, packageId, "rn");
            if (!installRNPackage(str, pluginId, packageId, rnPackageTempPath, packageInstalledPath)) {
                writeLog("installPluginInternal installRNPackage false pluginRecord:" + str + "  installedPackagePath:" + packageInstalledPath);
                reportRnInstallDetailRes(str, PluginError.INSTALL_ERROR_FOR_COPY_OR_FILE_CHECK);
                if (pluginInstallCallback != null) {
                    pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_INSTALL);
                    return;
                }
                return;
            }
            PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, pluginId, packageId, "rn", packageInstalledPath);
            if (pluginPackageInfoCreatePluginPackageInfo == null) {
                writeLog("installPluginInternal rawInfo is null pluginRecord:" + str + "  installedPackagePath:" + packageInstalledPath);
                reportRnInstallDetailRes(str, PluginError.INSTALL_ERROR_FOR_CREATE_PACKAGE_INFO);
                FileUtils.deleteFile(packageInstalledPath);
                if (pluginInstallCallback != null) {
                    pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_NOINFO);
                    return;
                }
                return;
            }
            PluginPackageManager.getInstance().deleteOldPlugin(1, str, pluginId, "rn", pluginPackageInfoCreatePluginPackageInfo);
            PluginPackageManager.getInstance().addInstalledPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("plugin_id", pluginId);
                jSONObject.put("package_id", packageId);
                jSONObject.put("package_type", "rn");
                PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().addStatRecord("plugin_install_success", jSONObject.toString());
            } catch (Exception unused) {
            }
            writeLog("install package success - " + downloadPackageInfo.getPackageId());
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onSuccess(str);
                return;
            }
            return;
        }
        if (downloadPackageInfo.isH5Plugin()) {
            return;
        }
        if (!downloadPackageInfo.isMpkPlugin()) {
            writeLog("installPluginInternal not rn nor mpk pluginRecord:" + str);
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_TYPEINVAILD);
                return;
            }
            return;
        }
        writeLog("start install package, model - " + str + ", package id - " + downloadPackageInfo.getPackageId());
        long pluginId2 = downloadPackageInfo.getPluginId();
        long packageId2 = downloadPackageInfo.getPackageId();
        String packageType = downloadPackageInfo.getPackageType();
        String packagePath = downloadPackageInfo.getPackagePath();
        String packageInstalledPath2 = PluginPackageManager.getInstance().getPackageInstalledPath(pluginId2, packageId2, packageType);
        FileUtils.copyFileToFile(packagePath, packageInstalledPath2);
        PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo2 = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, pluginId2, packageId2, packageType, packageInstalledPath2);
        if (pluginPackageInfoCreatePluginPackageInfo2 == null) {
            FileUtils.deleteFile(packageInstalledPath2);
            writeLog("installPluginInternal isMinApiLevelValid RN rawInfo is null pluginRecord:" + str + "  installingPackageInfo:" + downloadPackageInfo);
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_INSTALLED);
                return;
            }
            return;
        }
        if (!PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo2)) {
            FileUtils.deleteFile(packageInstalledPath2);
            writeLog("installPluginInternal validatePackage  model:" + str + "  rawInfo:" + pluginPackageInfoCreatePluginPackageInfo2);
            if (pluginInstallCallback != null) {
                pluginInstallCallback.onFailure(str, PluginError.INSTALLERROR_MINLEVEL);
                return;
            }
            return;
        }
        PluginSoManager.getInstance().install(this.mAppContext, pluginId2, packageId2, packageInstalledPath2);
        PluginPackageManager.getInstance().addInstalledPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo2);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("plugin_id", pluginId2);
            jSONObject2.put("package_id", packageId2);
            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().addStatRecord("plugin_install_success", jSONObject2.toString());
        } catch (Exception unused2) {
        }
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getXmPluginPackage(pluginPackageInfoCreatePluginPackageInfo2);
        writeLog("install package success - " + downloadPackageInfo.getPackageId());
        if (pluginInstallCallback != null) {
            pluginInstallCallback.onSuccess(str);
        }
    }

    private boolean isStdPluginAndNotUnzipInnerPlugin(String str) {
        return PluginPackageUtils.isStdPluginParentModel(str) && (MiJiaEnvironment.isMiuiChannel() || PluginPackageUtils.isGetStdPluginByVersion());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processRnSdkTask(RnSdkTask rnSdkTask) {
        this.mWorkerHandler.obtainMessage(24, rnSdkTask).sendToTarget();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:109:0x0286 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0273 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0254 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:5:0x0004, B:86:0x02ca, B:18:0x001e, B:20:0x0070, B:28:0x0092, B:29:0x0098, B:31:0x009e, B:33:0x00a6, B:34:0x00ac, B:36:0x00b0, B:37:0x00b6, B:39:0x00bd, B:40:0x00fc, B:42:0x0100, B:25:0x007c, B:27:0x0083, B:43:0x010e, B:45:0x0135, B:47:0x0156, B:49:0x0195, B:54:0x01c2, B:48:0x017d, B:50:0x0198, B:52:0x01a1, B:53:0x01ad, B:55:0x01c7, B:57:0x01e6, B:59:0x01eb, B:58:0x01e9, B:60:0x01f3, B:61:0x01f9, B:63:0x01ff, B:65:0x0207, B:67:0x020f, B:69:0x021f, B:70:0x022f, B:71:0x0254, B:72:0x0265, B:74:0x026b, B:76:0x0273, B:78:0x0279, B:79:0x0280, B:81:0x0286, B:82:0x028c, B:84:0x0290, B:85:0x02ab), top: B:90:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x026b A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:5:0x0004, B:86:0x02ca, B:18:0x001e, B:20:0x0070, B:28:0x0092, B:29:0x0098, B:31:0x009e, B:33:0x00a6, B:34:0x00ac, B:36:0x00b0, B:37:0x00b6, B:39:0x00bd, B:40:0x00fc, B:42:0x0100, B:25:0x007c, B:27:0x0083, B:43:0x010e, B:45:0x0135, B:47:0x0156, B:49:0x0195, B:54:0x01c2, B:48:0x017d, B:50:0x0198, B:52:0x01a1, B:53:0x01ad, B:55:0x01c7, B:57:0x01e6, B:59:0x01eb, B:58:0x01e9, B:60:0x01f3, B:61:0x01f9, B:63:0x01ff, B:65:0x0207, B:67:0x020f, B:69:0x021f, B:70:0x022f, B:71:0x0254, B:72:0x0265, B:74:0x026b, B:76:0x0273, B:78:0x0279, B:79:0x0280, B:81:0x0286, B:82:0x028c, B:84:0x0290, B:85:0x02ab), top: B:90:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0279 A[Catch: all -> 0x0079, TryCatch #0 {all -> 0x0079, blocks: (B:5:0x0004, B:86:0x02ca, B:18:0x001e, B:20:0x0070, B:28:0x0092, B:29:0x0098, B:31:0x009e, B:33:0x00a6, B:34:0x00ac, B:36:0x00b0, B:37:0x00b6, B:39:0x00bd, B:40:0x00fc, B:42:0x0100, B:25:0x007c, B:27:0x0083, B:43:0x010e, B:45:0x0135, B:47:0x0156, B:49:0x0195, B:54:0x01c2, B:48:0x017d, B:50:0x0198, B:52:0x01a1, B:53:0x01ad, B:55:0x01c7, B:57:0x01e6, B:59:0x01eb, B:58:0x01e9, B:60:0x01f3, B:61:0x01f9, B:63:0x01ff, B:65:0x0207, B:67:0x020f, B:69:0x021f, B:70:0x022f, B:71:0x0254, B:72:0x0265, B:74:0x026b, B:76:0x0273, B:78:0x0279, B:79:0x0280, B:81:0x0286, B:82:0x028c, B:84:0x0290, B:85:0x02ab), top: B:90:0x0004 }] */
    public void processRnSdkTaskExec(final RnSdkTask rnSdkTask) {
        PluginDownloadTask pluginDownloadTask;
        PluginDownloadTask.DownloadTaskCallbackInternal callback;
        PluginDownloadTask pluginDownloadTask2;
        PluginDownloadTask.DownloadTaskCallbackInternal callback2;
        if (rnSdkTask == null) {
            return;
        }
        synchronized (rnSdkTask) {
            try {
                int i = rnSdkTask.status;
                if (i == 0) {
                    rnSdkTask.status = 2;
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(rnSdkTask.sdk_api_level);
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    PluginUpdateApi.getInstance().updateRnSdk(this.mAppContext, jSONArray, new CoreAsyncCallback<JSONArray, CoreError>() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.3
                        private void onFailure(int i2, String str) {
                            RnSdkTask rnSdkTask2 = rnSdkTask;
                            rnSdkTask2.status = 1;
                            if (rnSdkTask2.mCallback != null) {
                                rnSdkTask.mCallback.onFailure(new DownloadRnSdkResult(5, "get rn sdk info failure, code=" + i2 + "  msg=" + str));
                            }
                            PluginUpdateManager.this.processRnSdkTask(rnSdkTask);
                        }

                        @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
                        public void onSuccess(JSONArray jSONArray2) {
                            if (jSONArray2 == null || jSONArray2.length() != 1) {
                                onFailure(2, jSONArray2.length() < 1 ? "not found the sdk" : "too more sdk info");
                                return;
                            }
                            try {
                                JSONObject jSONObject = jSONArray2.getJSONObject(0);
                                long jOptLong = jSONObject.optLong("sdk_version", 0L);
                                if (jOptLong != rnSdkTask.sdk_api_level) {
                                    onFailure(3, "invalid sdk_api_level");
                                    return;
                                }
                                long jOptLong2 = jSONObject.optLong(MiuiCursorConstants.CREATE_TIME, 0L);
                                Long lValueOf = Long.valueOf(jOptLong2);
                                long jOptLong3 = jSONObject.optLong("change_time", 0L);
                                Long lValueOf2 = Long.valueOf(jOptLong3);
                                if (jOptLong3 > jOptLong2) {
                                    lValueOf = lValueOf2;
                                }
                                String strOptString = jSONObject.optString("download_url", "");
                                long jOptLong4 = jSONObject.optLong("min_api_version", 0L);
                                long jOptLong5 = jSONObject.optLong("length", 0L);
                                long jOptLong6 = jSONObject.optLong("version", 0L);
                                if (jOptLong4 <= PluginSetting.RN_NATIVE_API_LEVEL) {
                                    if (!TextUtils.isEmpty(strOptString) && lValueOf.longValue() >= 1) {
                                        if (lValueOf.longValue() <= rnSdkTask.timestamp && PluginPackageManager.getInstance().checkIsInstalled(jOptLong)) {
                                            RnSdkTask rnSdkTask2 = rnSdkTask;
                                            rnSdkTask2.status = 7;
                                            PluginUpdateManager.this.processRnSdkTask(rnSdkTask2);
                                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("fetch_sdk", "", rnSdkTask.download_url, 1, System.currentTimeMillis() - jCurrentTimeMillis);
                                            return;
                                        }
                                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("fetch_sdk", "", rnSdkTask.download_url, 0, System.currentTimeMillis() - jCurrentTimeMillis);
                                        RnSdkTask rnSdkTask3 = rnSdkTask;
                                        rnSdkTask3.download_url = strOptString;
                                        rnSdkTask3.timestamp = lValueOf.longValue();
                                        RnSdkTask rnSdkTask4 = rnSdkTask;
                                        rnSdkTask4.length = jOptLong5;
                                        rnSdkTask4.package_version = jOptLong6;
                                        rnSdkTask4.status = 3;
                                    }
                                    onFailure(3, "download url of rn sdk is empty");
                                    return;
                                }
                                SharedPreferences.Editor editorEdit = PluginUpdateManager.this.mPluginSDKPref.edit();
                                PluginPackageManager.getInstance();
                                editorEdit.putString(PluginPackageManager.KEY_RN_SDK_TIMESTAMP(jOptLong, true), "!" + PluginSetting.RN_NATIVE_API_LEVEL);
                                editorEdit.commit();
                                PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("fetch_sdk", "", rnSdkTask.download_url, -1001, System.currentTimeMillis() - jCurrentTimeMillis);
                                RnSdkTask rnSdkTask5 = rnSdkTask;
                                rnSdkTask5.status = 10;
                                rnSdkTask5.download_url = null;
                                if (rnSdkTask.mCallback != null) {
                                    rnSdkTask.mCallback.onSuccess(new DownloadRnSdkResult(1, "get rn sdk info success"));
                                }
                                PluginUpdateManager.this.processRnSdkTask(rnSdkTask);
                            } catch (JSONException e) {
                                PluginUpdateManager.this.writeLog(Log.getStackTraceString(e));
                                onFailure(4, "failed to update info of rn sdk");
                            }
                        }

                        @Override // com.xiaomi.smarthome.core.server.internal.CoreAsyncCallback
                        public void onFailure(CoreError coreError) {
                            onFailure(coreError.getCode(), coreError.getDetail());
                            PluginUpdateManager.this.writeLog("download rn sdk,fetch_sdk error, code:" + coreError.getCode() + " msg:" + coreError.getDetail());
                            int code = coreError.getCode();
                            String strEncode = AbstractJsonLexerKt.NULL;
                            if (code > 0) {
                                IPluginUpdateProvider pluginUpdateProviderApi = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi();
                                Object[] objArr = new Object[2];
                                objArr[0] = rnSdkTask.download_url;
                                if (!TextUtils.isEmpty(coreError.getDetail())) {
                                    strEncode = URLEncoder.encode(coreError.getDetail());
                                }
                                objArr[1] = strEncode;
                                pluginUpdateProviderApi.reportDownloadRes("fetch_sdk", "", String.format("%s://%s", objArr), (-10000) - code, 0L);
                                return;
                            }
                            IPluginUpdateProvider pluginUpdateProviderApi2 = PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi();
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = rnSdkTask.download_url;
                            if (!TextUtils.isEmpty(coreError.getDetail())) {
                                strEncode = URLEncoder.encode(coreError.getDetail());
                            }
                            objArr2[1] = strEncode;
                            pluginUpdateProviderApi2.reportDownloadRes("fetch_sdk", "", String.format("%s://%s", objArr2), code - 200000, 0L);
                        }
                    });
                } else if (i == 1) {
                    this.mRnSdkTaskMap.remove(Long.valueOf(rnSdkTask.sdk_api_level));
                    for (Object obj : rnSdkTask.nextTasks) {
                        if (obj instanceof PluginDownloadTask) {
                            pluginDownloadTask = (PluginDownloadTask) obj;
                            if (rnSdkTask.status == 10) {
                                pluginDownloadTask.setRelativeData(PluginPackageConstant.KEY_RN_SDK_IS_FORBIDDEN, Boolean.TRUE);
                            }
                            callback = pluginDownloadTask.getCallback();
                            if (callback != null) {
                                callback.onFailure(pluginDownloadTask, PluginError.DOWNERROR_SDK);
                            }
                        } else if (obj instanceof Callback) {
                            ((Callback) obj).onFailure(100, "" + rnSdkTask.sdk_api_level);
                        }
                    }
                } else if (i == 3) {
                    for (Object obj2 : rnSdkTask.nextTasks) {
                        if ((obj2 instanceof PluginDownloadTask) && (callback2 = (pluginDownloadTask2 = (PluginDownloadTask) obj2).getCallback()) != null && !((Boolean) pluginDownloadTask2.getRelativeData("started", Boolean.FALSE)).booleanValue()) {
                            Boolean bool = Boolean.TRUE;
                            pluginDownloadTask2.setRelativeData("started", bool);
                            pluginDownloadTask2.setRelativeData("download_sdk", bool);
                            callback2.onStart(pluginDownloadTask2);
                        }
                    }
                    rnSdkTask.downloadStartTime = System.currentTimeMillis();
                    rnSdkTask.status = 4;
                    this.mPluginDownTask.startDownloadFileInternal(rnSdkTask.download_url, null, rnSdkTask.length, PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, rnSdkTask.status), new PluginDownExec.FileDownloadCallbackInternal() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.4
                        @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
                        public void onCancel() {
                            super.onCancel();
                            RnSdkTask rnSdkTask2 = rnSdkTask;
                            rnSdkTask2.status = 1;
                            PluginUpdateManager.this.processRnSdkTask(rnSdkTask2);
                        }

                        @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
                        public void onFailure() {
                            super.onFailure();
                            RnSdkTask rnSdkTask2 = rnSdkTask;
                            rnSdkTask2.status = 1;
                            if (rnSdkTask2.mCallback != null) {
                                rnSdkTask.mCallback.onFailure(new DownloadRnSdkResult(6, "rn sdk download failure"));
                            }
                            PluginUpdateManager.this.processRnSdkTask(rnSdkTask);
                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("download_sdk", "", rnSdkTask.download_url, -1003, System.currentTimeMillis() - rnSdkTask.downloadStartTime);
                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_sdk", "", "", "", rnSdkTask.download_url, -1003);
                        }

                        @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
                        public void onStart() {
                            super.onStart();
                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_sdk", "", "", "", rnSdkTask.download_url, 1);
                        }

                        @Override // com.xiaomi.smarthome.server.PluginDownExec.FileDownloadCallbackInternal
                        public void onSuccess() {
                            PluginDownloadTask pluginDownloadTask3;
                            PluginDownloadTask.DownloadTaskCallbackInternal callback3;
                            super.onSuccess();
                            RnSdkTask rnSdkTask2 = rnSdkTask;
                            if (rnSdkTask2.status == 4) {
                                rnSdkTask2.status = 5;
                                for (Object obj3 : rnSdkTask2.nextTasks) {
                                    if ((obj3 instanceof PluginDownloadTask) && (callback3 = (pluginDownloadTask3 = (PluginDownloadTask) obj3).getCallback()) != null) {
                                        callback3.onProgress(pluginDownloadTask3, 0.1f);
                                    }
                                }
                                if (rnSdkTask.mCallback != null) {
                                    rnSdkTask.mCallback.onSuccess(new DownloadRnSdkResult(3, "rn sdk download success"));
                                }
                            }
                            PluginUpdateManager.this.processRnSdkTask(rnSdkTask);
                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("download_sdk", "", rnSdkTask.download_url, 0, System.currentTimeMillis() - rnSdkTask.downloadStartTime);
                            PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("download_sdk", "", "", "", rnSdkTask.download_url, 0);
                        }
                    });
                } else if (i == 10) {
                    this.mRnSdkTaskMap.remove(Long.valueOf(rnSdkTask.sdk_api_level));
                    while (r0.hasNext()) {
                        if (obj instanceof PluginDownloadTask) {
                            pluginDownloadTask = (PluginDownloadTask) obj;
                            if (rnSdkTask.status == 10) {
                                pluginDownloadTask.setRelativeData(PluginPackageConstant.KEY_RN_SDK_IS_FORBIDDEN, Boolean.TRUE);
                            }
                            callback = pluginDownloadTask.getCallback();
                            if (callback != null) {
                                callback.onFailure(pluginDownloadTask, PluginError.DOWNERROR_SDK);
                            }
                        } else if (obj instanceof Callback) {
                            ((Callback) obj).onFailure(100, "" + rnSdkTask.sdk_api_level);
                        }
                    }
                } else if (i == 5) {
                    String rnSdkPath = PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, rnSdkTask.status);
                    String rnSdkPath2 = PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, 6);
                    FileUtils.deleteDirectory(rnSdkPath2);
                    if (ZipFileUtils.syncUnzip(rnSdkPath, rnSdkPath2)) {
                        rnSdkTask.status = 6;
                    } else {
                        rnSdkTask.status = 1;
                    }
                    processRnSdkTask(rnSdkTask);
                    FileUtils.deleteFile(rnSdkPath);
                } else if (i == 6) {
                    String rnSdkPath3 = PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, rnSdkTask.status);
                    File file = new File(rnSdkPath3, PluginPackageConstant.RN_DIR_A);
                    FileUtils.createFileIfNotExists(new File(rnSdkPath3, PluginPackageConstant.RN_CONF_A).getAbsolutePath());
                    JSONObject jSONObjectCheckRnBundleSignature = PluginPackageUtils.checkRnBundleSignature(rnSdkPath3);
                    if (jSONObjectCheckRnBundleSignature != null) {
                        rnSdkTask.build_time = jSONObjectCheckRnBundleSignature.optLong("build_time", 0L);
                        String rnSdkPath4 = PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, 7);
                        File file2 = new File(rnSdkPath4, PluginPackageConstant.RN_CONF_A);
                        if (file2.exists()) {
                            File file3 = new File(rnSdkPath4, PluginPackageConstant.RN_DIR_B);
                            FileUtils.deleteDirectory(file3.getAbsolutePath());
                            FileUtils.createFileIfNotExists(new File(rnSdkPath4, PluginPackageConstant.RN_CONF_B).getAbsolutePath());
                            file.renameTo(file3);
                            FileUtils.deleteFile(file2.getAbsolutePath());
                        } else {
                            File file4 = new File(rnSdkPath4, PluginPackageConstant.RN_DIR_A);
                            FileUtils.deleteDirectory(file4.getAbsolutePath());
                            FileUtils.createFileIfNotExists(file2.getAbsolutePath());
                            file.renameTo(file4);
                        }
                        rnSdkTask.status = 7;
                    } else {
                        FileUtils.deleteDirectory(rnSdkPath3);
                        rnSdkTask.status = 1;
                        if (rnSdkTask.mCallback != null) {
                            rnSdkTask.mCallback.onFailure(new DownloadRnSdkResult(7, "rn sdk install failure, Signature failure"));
                        }
                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes("download_sdk", "", rnSdkTask.download_url, -1002, 0L);
                    }
                    processRnSdkTask(rnSdkTask);
                } else if (i == 7) {
                    this.mRnSdkTaskMap.remove(Long.valueOf(rnSdkTask.sdk_api_level));
                    String rnPackageRealPath = PluginPackageUtils.getRnPackageRealPath(PluginPackageManager.getInstance().getRnSdkPath(rnSdkTask.sdk_api_level, rnSdkTask.status));
                    SharedPreferences.Editor editorEdit = this.mPluginSDKPref.edit();
                    PluginPackageManager.getInstance();
                    editorEdit.putString(PluginPackageManager.KEY_RN_SDK_TIMESTAMP(rnSdkTask.sdk_api_level, true), PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX + rnSdkTask.timestamp);
                    editorEdit.apply();
                    RnSdkInfo newestRnSdkInfo = PluginPackageManager.getInstance().getNewestRnSdkInfo(this.mAppContext);
                    if (newestRnSdkInfo == null || newestRnSdkInfo.api_level <= rnSdkTask.sdk_api_level) {
                        if (rnSdkTask.build_time > 100000) {
                            PluginPackageManager.getInstance();
                            PluginPackageManager.setNewestRnSdkInfo(PluginPackageManager.RN_SDK_CONFIG_FILE_PATH, rnSdkTask.sdk_api_level, rnSdkTask.build_time, rnPackageRealPath, rnSdkTask.package_version);
                        }
                    }
                    for (Object obj3 : rnSdkTask.nextTasks) {
                        if (obj3 instanceof PluginDownloadTask) {
                            startPluginDownloadTask((PluginDownloadTask) obj3);
                        } else if (obj3 instanceof Callback) {
                            ((Callback) obj3).onSuccess(rnSdkTask);
                        }
                    }
                    if (rnSdkTask.build_time > 100000) {
                        Intent intent = new Intent(PluginPackageConstant.ACTION_DOWNRNSDK);
                        intent.putExtra(PluginPackageConstant.KEY_RNSDK_API_LEVEL, rnSdkTask.sdk_api_level);
                        intent.putExtra("timestamp", rnSdkTask.timestamp);
                        intent.putExtra("path", rnPackageRealPath);
                        this.mAppContext.sendBroadcast(intent);
                        writeLog("PluginManager update rn sdk success, send broadcast " + rnSdkTask.build_time + "  " + rnSdkTask.sdk_api_level);
                    }
                    if (rnSdkTask.mCallback != null) {
                        rnSdkTask.mCallback.onSuccess(new DownloadRnSdkResult(4, "rn sdk install success"));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void reportRnInstallDetailRes(String str, int i) {
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRnInstallDetailRes("install_plugin_detail", str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportRnPluginDownloadRes(String str, PluginDownloadTask pluginDownloadTask, int i) {
        reportRnPluginDownloadRes(str, pluginDownloadTask, i, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportRnPluginInstallRes(String str, int i) {
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRnPluginInstallRes("install_plugin", str, i);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0165  */
    /* JADX WARN: Code duplicated, block: B:45:0x0180  */
    /* JADX WARN: Code duplicated, block: B:46:0x0188  */
    /* JADX WARN: Code duplicated, block: B:47:0x018e  */
    /* JADX WARN: Code duplicated, block: B:49:0x019b  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b7  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0165, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.xiaomi.smarthome.server.PluginDownloadTask$DownloadTaskCallbackInternal] */
    private void startPluginDownloadTask(final PluginDownloadTask pluginDownloadTask) {
        PluginDownloadTask.DownloadTaskCallbackInternal downloadTaskCallbackInternal;
        String str;
        ?? CreatePluginPackageInfo;
        final PluginDownloadTask.DownloadTaskCallbackInternal downloadTaskCallbackInternal2;
        DynamicFeatureManager dynamicFeatureManager;
        String str2;
        ?? r17;
        ?? r18;
        String model = pluginDownloadTask.getModel();
        long packageId = pluginDownloadTask.getPackageId();
        long pluginId = pluginDownloadTask.getPluginId();
        String packageType = pluginDownloadTask.getPackageType();
        PluginDownloadTask.DownloadTaskCallbackInternal callback = pluginDownloadTask.getCallback();
        String packageDownloadedPath = PluginPackageManager.getInstance().getPackageDownloadedPath(pluginId, packageId, packageType);
        boolean z = true;
        ?? r19 = 0;
        PluginPackageInfo pluginPackageInfo = null;
        r19 = 0;
        boolean z2 = false;
        if ("rn".equals(packageType)) {
            String packageInstalledPath = PluginPackageManager.getInstance().getPackageInstalledPath(pluginId, packageId, packageType);
            File file = new File(packageInstalledPath);
            if (file.exists()) {
                try {
                    str2 = packageDownloadedPath;
                    ?? r2 = file;
                    downloadTaskCallbackInternal = callback;
                    try {
                        PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, pluginId, packageId, packageType, packageInstalledPath);
                        try {
                            if (pluginPackageInfoCreatePluginPackageInfo != null) {
                                try {
                                    if (PluginPackageUtils.validatePackageSignature(this.mAppContext, pluginPackageInfoCreatePluginPackageInfo, PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getDeveloperInfo(pluginPackageInfoCreatePluginPackageInfo.getDeveloperId()))) {
                                        try {
                                            FileUtils.createFileIfNotExists(new File(packageInstalledPath, PluginPackageConstant.RN_CONF_A));
                                            if (new PluginJsonExtra(r2).setModelList(Collections.singletonList(model)).save()) {
                                                pluginPackageInfoCreatePluginPackageInfo.setModelList(new PluginJsonExtra(r2).readModelList());
                                                PluginPackageManager.getInstance().addDownloadedPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            r17 = pluginPackageInfoCreatePluginPackageInfo;
                                            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "check rn install files err : " + Log.getStackTraceString(e));
                                            r18 = r17;
                                        }
                                    } else {
                                        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("check_rn_signature", String.valueOf(packageId), String.valueOf(pluginId), model, MMKVManager.getMMKV("rn_check_signature").k(pluginPackageInfoCreatePluginPackageInfo.getPackagePath(), "checkRnBundleSignature failed"), -100001);
                                        z = false;
                                    }
                                    z2 = z;
                                } catch (Exception e2) {
                                    e = e2;
                                    r2 = pluginPackageInfoCreatePluginPackageInfo;
                                    r19 = r2;
                                    z = false;
                                    r17 = r19;
                                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "check rn install files err : " + Log.getStackTraceString(e));
                                    r18 = r17;
                                    CreatePluginPackageInfo = r18;
                                    str = str2;
                                    if (z) {
                                        writeLog(model + " downloadPluginInternal has downloaded package  newTask:" + pluginDownloadTask);
                                        if (CreatePluginPackageInfo == 0) {
                                            downloadTaskCallbackInternal.onFailure(pluginDownloadTask, PluginError.DOWNERROR_NOPLUGIN);
                                            return;
                                        } else {
                                            downloadTaskCallbackInternal.onSuccess(pluginDownloadTask, CreatePluginPackageInfo);
                                            return;
                                        }
                                    }
                                    String str3 = str;
                                    downloadTaskCallbackInternal2 = downloadTaskCallbackInternal;
                                    if (PluginPackageConstant.PLUGIN_TYPE_MPK.equalsIgnoreCase(packageType)) {
                                        dynamicFeatureManager = DynamicFeatureManager.instance;
                                        if (dynamicFeatureManager.getFeatureSize() != 0) {
                                            if (dynamicFeatureManager.isDynamicFeature(model)) {
                                                dynamicFeatureManager.downloadPlugin(model, new DynamicFeatureManager.DynamicFeatureCallback(model) { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.5
                                                    @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                                                    public void onCancel(String str4) {
                                                        downloadTaskCallbackInternal2.onCancel(pluginDownloadTask);
                                                        PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onCancel " + str4);
                                                    }

                                                    @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                                                    public void onFailure(String str4, int i) {
                                                        downloadTaskCallbackInternal2.onFailure(pluginDownloadTask, i);
                                                        PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onFailure " + str4);
                                                    }

                                                    @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                                                    public void onProgress(String str4, float f) {
                                                        downloadTaskCallbackInternal2.onProgress(pluginDownloadTask, f);
                                                    }

                                                    @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                                                    public void onSuccess(String str4, PluginPackageInfo pluginPackageInfo2) {
                                                        downloadTaskCallbackInternal2.onSuccess(pluginDownloadTask, DynamicFeatureManager.instance.getPluginPackageInfo(str4));
                                                        PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onSuccess " + str4);
                                                    }
                                                });
                                                writeLog("downloadPluginInternal DynamicFeatureManager downloadPlugin start");
                                                return;
                                            } else {
                                                downloadTaskCallbackInternal2.onFailure(pluginDownloadTask, PluginError.INSTALLERROR_DYNAMICFEATURE);
                                                writeLog("downloadPluginInternal internal cannot use apk plugin and no DynamicFeature");
                                                return;
                                            }
                                        }
                                    }
                                    writeLog(model + " downloadPluginInternal start Down task not exist path:" + str3);
                                    this.mPluginDownTask.startPluginDownloadTaskInternalExec(str3, pluginDownloadTask);
                                }
                            } else {
                                pluginPackageInfoCreatePluginPackageInfo = pluginPackageInfoCreatePluginPackageInfo;
                                PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRealDownloadRes("check_rn_signature", String.valueOf(packageId), String.valueOf(pluginId), model, "check rn install file pluginPackageInfo is null , path : " + packageInstalledPath, -100002);
                            }
                            pluginPackageInfo = pluginPackageInfoCreatePluginPackageInfo;
                        } catch (Exception e3) {
                            e = e3;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str2 = packageDownloadedPath;
                    downloadTaskCallbackInternal = callback;
                }
            } else {
                str2 = packageDownloadedPath;
                downloadTaskCallbackInternal = callback;
            }
            z = z2;
            r18 = pluginPackageInfo;
            CreatePluginPackageInfo = r18;
            str = str2;
        } else {
            downloadTaskCallbackInternal = callback;
            str = packageDownloadedPath;
            if (new File(str).exists()) {
                CreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, pluginId, packageId, packageType, str);
            } else {
                CreatePluginPackageInfo = 0;
                z = false;
            }
        }
        if (z) {
            writeLog(model + " downloadPluginInternal has downloaded package  newTask:" + pluginDownloadTask);
            if (CreatePluginPackageInfo == 0) {
                downloadTaskCallbackInternal.onFailure(pluginDownloadTask, PluginError.DOWNERROR_NOPLUGIN);
                return;
            } else {
                downloadTaskCallbackInternal.onSuccess(pluginDownloadTask, CreatePluginPackageInfo);
                return;
            }
        }
        String str4 = str;
        downloadTaskCallbackInternal2 = downloadTaskCallbackInternal;
        if (PluginPackageConstant.PLUGIN_TYPE_MPK.equalsIgnoreCase(packageType)) {
            dynamicFeatureManager = DynamicFeatureManager.instance;
            if (dynamicFeatureManager.getFeatureSize() != 0) {
                if (dynamicFeatureManager.isDynamicFeature(model)) {
                    dynamicFeatureManager.downloadPlugin(model, new DynamicFeatureManager.DynamicFeatureCallback(model) { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.5
                        @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                        public void onCancel(String str5) {
                            downloadTaskCallbackInternal2.onCancel(pluginDownloadTask);
                            PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onCancel " + str5);
                        }

                        @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                        public void onFailure(String str5, int i) {
                            downloadTaskCallbackInternal2.onFailure(pluginDownloadTask, i);
                            PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onFailure " + str5);
                        }

                        @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                        public void onProgress(String str5, float f) {
                            downloadTaskCallbackInternal2.onProgress(pluginDownloadTask, f);
                        }

                        @Override // com.xiaomi.smarthome.server.DynamicFeatureManager.DynamicFeatureCallback
                        public void onSuccess(String str5, PluginPackageInfo pluginPackageInfo2) {
                            downloadTaskCallbackInternal2.onSuccess(pluginDownloadTask, DynamicFeatureManager.instance.getPluginPackageInfo(str5));
                            PluginUpdateManager.this.writeLog("downloadPluginInternal DynamicFeatureManager onSuccess " + str5);
                        }
                    });
                    writeLog("downloadPluginInternal DynamicFeatureManager downloadPlugin start");
                    return;
                } else {
                    downloadTaskCallbackInternal2.onFailure(pluginDownloadTask, PluginError.INSTALLERROR_DYNAMICFEATURE);
                    writeLog("downloadPluginInternal internal cannot use apk plugin and no DynamicFeature");
                    return;
                }
            }
        }
        writeLog(model + " downloadPluginInternal start Down task not exist path:" + str4);
        this.mPluginDownTask.startPluginDownloadTaskInternalExec(str4, pluginDownloadTask);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startPluginDownloadTaskInternal(PluginDownloadTask pluginDownloadTask) throws Throwable {
        if (pluginDownloadTask == null) {
            return;
        }
        if ((!PluginPackageManager.getInstance().validatePluginId(pluginDownloadTask.getPluginId()) || !PluginPackageManager.getInstance().validatePackageId(pluginDownloadTask.getPackageId()) || TextUtils.isEmpty(pluginDownloadTask.getPackageType()) || (TextUtils.isEmpty(pluginDownloadTask.getPackageUrl()) && TextUtils.isEmpty(pluginDownloadTask.getPackageSafeUrl()))) && pluginDownloadTask.getCallback() != null) {
            writeLog("startPluginDownloadTaskInternal validate " + pluginDownloadTask);
            pluginDownloadTask.getCallback().onFailure(pluginDownloadTask, PluginError.DOWNERROR_INFOERROR);
            return;
        }
        if (!"rn".equalsIgnoreCase(pluginDownloadTask.getPackageType())) {
            startPluginDownloadTask(pluginDownloadTask);
            return;
        }
        RnSdkInfo newestRnSdkInfo = PluginPackageManager.getInstance().getNewestRnSdkInfo(this.mAppContext);
        Long l = (Long) pluginDownloadTask.getRelativeData("rnSdkApiLevel", 0L);
        long jLongValue = l.longValue();
        if (newestRnSdkInfo != null) {
            long j = newestRnSdkInfo.api_level;
            if (jLongValue <= j) {
                pluginDownloadTask.setRelativeData("rnSdkApiLevel", Long.valueOf(j));
                PluginSetting.LogTimestamp("plugin manager start to download plugin");
                startPluginDownloadTask(pluginDownloadTask);
                startToLoadRnSdk(newestRnSdkInfo.api_level, null);
                PluginSetting.RnSdkLog("found sdk", l, " matched ", Long.valueOf(newestRnSdkInfo.api_level), newestRnSdkInfo.install_path);
                return;
            }
        }
        startToLoadRnSdk(jLongValue, pluginDownloadTask);
        PluginSetting.RnSdkLog("start to install new sdk ", l);
    }

    private void startToLoadRnSdk(long j, PluginDownloadTask pluginDownloadTask) {
        RnSdkTask rnSdkTask = this.mRnSdkTaskMap.get(Long.valueOf(j));
        if (rnSdkTask != null) {
            if (rnSdkTask.status == 1) {
                rnSdkTask.status = 0;
            }
            rnSdkTask.nextTasks.add(pluginDownloadTask);
            processRnSdkTask(rnSdkTask);
            return;
        }
        SharedPreferences sharedPreferences = this.mPluginSDKPref;
        PluginPackageManager.getInstance();
        String string = sharedPreferences.getString(PluginPackageManager.KEY_RN_SDK_TIMESTAMP(j, true), "");
        if (!TextUtils.isEmpty(string)) {
            if (string.startsWith("!")) {
                if (PluginSetting.RN_NATIVE_API_LEVEL <= NumberUtils.valueOf((Object) string.substring(1), 0L)) {
                    if (pluginDownloadTask == null || pluginDownloadTask.getCallback() == null) {
                        return;
                    }
                    pluginDownloadTask.setRelativeData(PluginPackageConstant.KEY_RN_SDK_IS_FORBIDDEN, Boolean.TRUE);
                    pluginDownloadTask.getCallback().onFailure(pluginDownloadTask, PluginError.DOWNERROR_SDKVERSION);
                    return;
                }
            } else if (string.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
                long jValueOf = NumberUtils.valueOf((Object) string.substring(1), 0L);
                if (jValueOf > 0 && PluginPackageManager.getInstance().checkIsInstalled(j)) {
                    if (pluginDownloadTask != null) {
                        startPluginDownloadTask(pluginDownloadTask);
                    }
                    RnSdkTask rnSdkTask2 = new RnSdkTask();
                    rnSdkTask2.sdk_api_level = j;
                    rnSdkTask2.status = 0;
                    rnSdkTask2.timestamp = jValueOf;
                    this.mRnSdkTaskMap.put(Long.valueOf(j), rnSdkTask2);
                    processRnSdkTask(rnSdkTask2);
                    return;
                }
            }
        }
        RnSdkTask rnSdkTask3 = new RnSdkTask();
        rnSdkTask3.sdk_api_level = j;
        rnSdkTask3.status = 0;
        rnSdkTask3.timestamp = 0L;
        if (pluginDownloadTask != null) {
            rnSdkTask3.nextTasks.add(pluginDownloadTask);
        }
        this.mRnSdkTaskMap.put(Long.valueOf(rnSdkTask3.sdk_api_level), rnSdkTask3);
        processRnSdkTask(rnSdkTask3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask> toOutTask(HashMap<String, PluginDownloadTask> map) {
        ArrayList<com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask> arrayList = new ArrayList<>();
        Iterator<Map.Entry<String, PluginDownloadTask>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue().toOutTask());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeLog(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str);
    }

    public void cancelPluginDownload(String str, com.xiaomi.smarthome.core.entity.plugin.PluginDownloadTask pluginDownloadTask, PluginCancelDownloadCallback pluginCancelDownloadCallback) {
        if (PluginPackageManager.getInstance().isInited()) {
            this.mPluginDownTask.cancelPluginDownloadInternal(str, pluginDownloadTask, pluginCancelDownloadCallback);
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "cancelPluginDownload failed, not init");
        if (pluginCancelDownloadCallback != null) {
            pluginCancelDownloadCallback.onFailure("");
        }
    }

    public void checkToUpdateAllDownloadInnerPlugin() {
        PluginPackageInfo innerPluginPackageInfo;
        List<String> innerPluginModes = InnerPluginPackageManager.getInstance().getInnerPluginModes();
        if (innerPluginModes == null || innerPluginModes.size() <= 0) {
            return;
        }
        for (String str : innerPluginModes) {
            PluginPackageInfo downloadPackageInfo = PluginPackageManager.getInstance().getDownloadPackageInfo(str);
            if (downloadPackageInfo != null && (innerPluginPackageInfo = InnerPluginPackageManager.getInstance().getInnerPluginPackageInfo(str)) != null && innerPluginPackageInfo.getVersion() > downloadPackageInfo.getVersion()) {
                writeLog("checkToUpdateAllDownloadInnerPlugin innerPackageInfo.getVersion=" + innerPluginPackageInfo.getVersion() + "   installPackageInfo.getVersion=" + downloadPackageInfo.getVersion());
                downloadInnerPluginInternal(str, null);
            }
        }
    }

    public void checkToUpdateRnSdk(long j, RnSdkDownloadCallback rnSdkDownloadCallback) {
        if (!PluginPackageManager.getInstance().isInited()) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "checkToUpdateRnSdk failed, not init");
            if (rnSdkDownloadCallback != null) {
                rnSdkDownloadCallback.onFailure(new DownloadRnSdkResult(-1, "not init"));
                return;
            }
            return;
        }
        RnSdkTask rnSdkTask = this.mRnSdkTaskMap.get(Long.valueOf(j));
        if (rnSdkTask != null) {
            rnSdkTask.mCallback = rnSdkDownloadCallback;
            if (rnSdkTask.status == 1) {
                rnSdkTask.status = 0;
            }
            processRnSdkTask(rnSdkTask);
            return;
        }
        RnSdkTask rnSdkTask2 = new RnSdkTask();
        rnSdkTask2.mCallback = rnSdkDownloadCallback;
        rnSdkTask2.timestamp = 0L;
        SharedPreferences sharedPreferences = this.mPluginSDKPref;
        PluginPackageManager.getInstance();
        String string = sharedPreferences.getString(PluginPackageManager.KEY_RN_SDK_TIMESTAMP(j, true), "");
        if (!TextUtils.isEmpty(string) && string.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX)) {
            long jValueOf = NumberUtils.valueOf((Object) string.substring(1), 0L);
            if (jValueOf > 0 && PluginPackageManager.getInstance().checkIsInstalled(j)) {
                rnSdkTask2.timestamp = jValueOf;
            }
        }
        rnSdkTask2.sdk_api_level = j;
        rnSdkTask2.status = 0;
        this.mRnSdkTaskMap.put(Long.valueOf(j), rnSdkTask2);
        processRnSdkTask(rnSdkTask2);
    }

    public void downloadDebugPackage(final DebugPackageCallback debugPackageCallback) {
        if (PluginPackageManager.getInstance().isInited()) {
            Operation operation = new Operation();
            operation.callbackInternal = new DebugPackageCallbackInternal() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super();
                }

                @Override // com.xiaomi.smarthome.server.PluginUpdateManager.DebugPackageCallbackInternal
                public void onDownloadFailure(final String str) {
                    if (debugPackageCallback != null) {
                        PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.6.2
                            @Override // java.lang.Runnable
                            public void run() {
                                debugPackageCallback.onDownloadFailure(str);
                            }
                        });
                    }
                }

                @Override // com.xiaomi.smarthome.server.PluginUpdateManager.DebugPackageCallbackInternal
                public void onDownloadSuccess() {
                    if (debugPackageCallback != null) {
                        PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                debugPackageCallback.onDownloadSuccess();
                            }
                        });
                    }
                }

                @Override // com.xiaomi.smarthome.server.PluginUpdateManager.DebugPackageCallbackInternal
                public void onInstallFailure(final String str) {
                    if (debugPackageCallback != null) {
                        PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.6.4
                            @Override // java.lang.Runnable
                            public void run() {
                                debugPackageCallback.onInstallFailure(str);
                            }
                        });
                    }
                }

                @Override // com.xiaomi.smarthome.server.PluginUpdateManager.DebugPackageCallbackInternal
                public void onInstallSuccess() {
                    if (debugPackageCallback != null) {
                        PluginUpdateManager.this.mUiHandler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.PluginUpdateManager.6.3
                            @Override // java.lang.Runnable
                            public void run() {
                                debugPackageCallback.onInstallSuccess();
                            }
                        });
                    }
                }
            };
            this.mWorkerHandler.obtainMessage(18, operation).sendToTarget();
        } else {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "downloadDebugPackage failed, not init");
            if (debugPackageCallback != null) {
                debugPackageCallback.onDownloadFailure("not init");
            }
        }
    }

    public void downloadPlugin(List<String> list, boolean z, PluginDownloadCallback pluginDownloadCallback) {
        if (PluginPackageManager.getInstance().isInited()) {
            downloadPluginInternal(list, z, new AnonymousClass7(pluginDownloadCallback));
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "downloadPlugin failed, not init");
        if (pluginDownloadCallback != null) {
            pluginDownloadCallback.onFailure("", -1);
        }
    }

    public void getLatestPluginInfo(String str, CoreAsyncCallback<List<PluginUpdateInfoResult>, CoreError> coreAsyncCallback) {
        PluginUpdateApi.getInstance().updatePlugin(new JSONArray().put(PluginPackageManager.getInstance().createPluginInfoParams(str)), PluginSetting.API_LEVEL, SystemApi.getInstance().getPlatform(), coreAsyncCallback);
    }

    public void installPlugin(String str, boolean z, PluginInstallCallback pluginInstallCallback) {
        writeLog("1-installPlugin..." + str);
        if (PluginPackageManager.getInstance().isInited()) {
            installPluginInternal(str, new AnonymousClass8(pluginInstallCallback, str));
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "installPlugin failed, not init");
        if (pluginInstallCallback != null) {
            pluginInstallCallback.onFailure("", -1);
        }
    }

    public boolean installRNPackage(String str, long j, long j2, String str2, String str3) {
        boolean zCopyFileToFile;
        if (!PluginPackageManager.getInstance().isInited()) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "installRNPackage failed, not init");
            return false;
        }
        File file = new File(str3);
        boolean zCheckRnInstallPackageModelListFile = PluginPackageUtils.checkRnInstallPackageModelListFile(str, str2, str3);
        boolean z = PluginPackageUtils.checkRnBundleSignature(str3) != null;
        if (file.exists() && z && zCheckRnInstallPackageModelListFile) {
            writeLog("installRNPackage 安装包完整性校验 success,  出现了重复安装，但签名成功， 且 model_list 文件完整， 无需重复安装: " + str3);
            return true;
        }
        if (file.exists() && z && !zCheckRnInstallPackageModelListFile) {
            boolean zSave = new PluginJsonExtra(file).setModelList(Collections.singletonList(str)).save();
            writeLog("插件包存在，签名也能通过，model_list文件不一样，仅仅更新下model_list文件, isCopySuccess=" + zSave);
            if (zSave) {
                return true;
            }
        } else if (!file.exists()) {
            writeLog("installRNPackage 首次进行安装: " + str3);
        } else if (!zCheckRnInstallPackageModelListFile) {
            writeLog("installRNPackage 安装包完整性校验 error, 出现了重复安装，但model_list 文件不完整，需要再次进行安装: " + str3);
        } else if (z) {
            writeLog("installRNPackage 安装包完整性校验 error, 未知错误: " + str3);
        } else {
            writeLog("installRNPackage 安装包完整性校验 error, 出现了重复安装，model_list 文件完整, 但签名失败，需要再次进行安装: " + str3);
        }
        FileUtils.deleteDirectory(str3);
        if (new File(str2).isFile()) {
            String rnPackageTempPath = PluginPackageManager.getInstance().getRnPackageTempPath(j, j2);
            FileUtils.deleteDirectory(rnPackageTempPath);
            if (!ZipFileUtils.syncUnzip(str2, rnPackageTempPath)) {
                FileUtils.deleteDirectory(rnPackageTempPath);
                writeLog("installRNPackage syncUnzip false path:" + rnPackageTempPath);
                return false;
            }
            FileUtils.createFileIfNotExists(new File(rnPackageTempPath, PluginPackageConstant.RN_CONF_A).getAbsolutePath());
            FileUtils.deleteFile(str2);
            if (PluginPackageUtils.checkRnBundleSignature(rnPackageTempPath) == null) {
                FileUtils.deleteDirectory(rnPackageTempPath);
                writeLog("installRNPackage checkRnBundleSignature false path:" + rnPackageTempPath);
                return false;
            }
            FileUtils.moveDirectory(rnPackageTempPath, str3);
            FileUtils.deleteDirectory(rnPackageTempPath);
            zCopyFileToFile = true;
        } else {
            zCopyFileToFile = FileUtils.copyFileToFile(str2, str3);
        }
        if (zCopyFileToFile && PluginPackageUtils.checkRnPluginPackageExist(str3)) {
            return true;
        }
        writeLog("installRNPackage false pluginId: " + j + " , packageId: " + j2 + ", isCopyFileSuccess: " + zCopyFileToFile);
        return false;
    }

    public boolean isPluginForceUpdating(String str) {
        PluginDownExec pluginDownExec;
        return (str == null || (pluginDownExec = this.mPluginDownTask) == null || !pluginDownExec.isPluginForceUpdating(str)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportRnPluginDownloadRes(String str, PluginDownloadTask pluginDownloadTask, int i, long j) {
        if (pluginDownloadTask == null || !"rn".equalsIgnoreCase(pluginDownloadTask.getPackageType())) {
            return;
        }
        if (j != 0 && pluginDownloadTask.getDownloadStartTime() > 0) {
            j = System.currentTimeMillis() - pluginDownloadTask.getDownloadStartTime();
        }
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportDownloadRes(str, pluginDownloadTask.getModel(), pluginDownloadTask.getPackageUrl(), i, j);
    }
}
