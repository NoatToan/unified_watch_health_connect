package com.xiaomi.smarthome.server;

import android.R;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.CpuConstant;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ZipFileUtils;
import com.xiaomi.smarthome.frame.server_compact.ServerBean;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;
import com.xiaomi.smarthome.library.file.FileUtil;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.DownloadRnSdkResult;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.rn.core.bean.RnSdkInfo;
import com.xiaomi.smarthome.server.callback.IsPackageReadyCallback;
import com.xiaomi.smarthome.server.util.PluginPackageUtils;
import com.xiaomi.smarthome.setting.PluginSetting;
import defpackage.bg4;
import defpackage.o4h;
import defpackage.ofl;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginPackageManager {
    private static final String APK_PACKAGE_DOWNLOAD_SUFFIX = ".apk";
    public static String DOWNLOAD_PATH = null;
    private static final String H5_PACKAGE_DOWNLOAD_SUFFIX = ".h5";
    public static String MPK_INSTALL_PATH = null;
    private static final String MPK_PACKAGE_DOWNLOAD_SUFFIX = ".mpk";
    private static final String MPK_PACKAGE_INSTALL_SUFFIX = ".apk";
    public static String RN_INSTALL_PATH = null;
    public static String RN_INSTALL_TEMP_PATH = null;
    private static final String RN_PACKAGE_DOWNLOAD_SUFFIX = ".rn";
    public static String RN_SDK_CONFIG_FILE_PATH = null;
    public static String RN_SDK_INSTALL_PATH = null;
    public static String SO_INSTALL_DIR = null;
    public static final String TAG = "PluginPackageManager";
    public static String TMP_PATH;
    private static volatile PluginPackageManager sInstance;
    private static final Object sLock = new Object();
    Handler mUiHandler;
    WorkerHandler mWorkerHandler;
    MessageHandlerThread mWorkerThread;
    private byte mIsInitialized = 0;
    private ArrayList<IsPackageReadyCallback> mReadyCallback = new ArrayList<>();
    private Map<String, PluginPackageInfo> mInstalledPackageInfoMap = new ConcurrentHashMap();
    private Map<String, PluginPackageInfo> mDownloadedPackageInfoMap = new ConcurrentHashMap();
    private Context mAppContext = MiJiaEnvironment.getAppContext();

    /* JADX INFO: renamed from: com.xiaomi.smarthome.server.PluginPackageManager$1, reason: invalid class name */
    public class AnonymousClass1 implements PluginDeleteCallback {
        final /* synthetic */ PluginDeleteCallback val$callback;

        public AnonymousClass1(PluginDeleteCallback pluginDeleteCallback) {
            this.val$callback = pluginDeleteCallback;
        }

        @Override // com.xiaomi.smarthome.server.PluginPackageManager.PluginDeleteCallback
        public void onFailure(final String str) {
            Handler handler = PluginPackageManager.this.mUiHandler;
            final PluginDeleteCallback pluginDeleteCallback = this.val$callback;
            handler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.b
                @Override // java.lang.Runnable
                public final void run() {
                    pluginDeleteCallback.onFailure(str);
                }
            });
        }

        @Override // com.xiaomi.smarthome.server.PluginPackageManager.PluginDeleteCallback
        public void onSuccess(final String str) {
            Handler handler = PluginPackageManager.this.mUiHandler;
            final PluginDeleteCallback pluginDeleteCallback = this.val$callback;
            handler.post(new Runnable() { // from class: com.xiaomi.smarthome.server.a
                @Override // java.lang.Runnable
                public final void run() {
                    pluginDeleteCallback.onSuccess(str);
                }
            });
        }
    }

    public class DebugPkgResult {
        long debugPkgId;
        String debugPkgPath;
        String debugPkgType;
        long debugPluginId;
        String errorMsg;
        boolean hasError;

        public DebugPkgResult() {
        }
    }

    public interface PluginDeleteCallback {
        void onFailure(String str);

        void onSuccess(String str);
    }

    public interface RnSdkDownloadCallback {
        void onFailure(DownloadRnSdkResult downloadRnSdkResult);

        void onProgress(DownloadRnSdkResult downloadRnSdkResult);

        void onSuccess(DownloadRnSdkResult downloadRnSdkResult);
    }

    public class WorkerHandler extends Handler {
        public WorkerHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 4) {
                Object obj = message.obj;
                if (obj instanceof Pair) {
                    Pair pair = (Pair) obj;
                    PluginPackageManager.this.onServerChangedInternal((ServerBean) pair.first, (ServerBean) pair.second);
                    return;
                }
                return;
            }
            if (i != 26) {
                if (i != 27) {
                    return;
                }
                Object obj2 = message.obj;
                if (obj2 instanceof String) {
                    FileUtils.deleteFile((String) obj2);
                    return;
                }
                return;
            }
            Object obj3 = message.obj;
            if (obj3 instanceof Object[]) {
                Object[] objArr = (Object[]) obj3;
                Object obj4 = objArr[0];
                if (obj4 instanceof String) {
                    Object obj5 = objArr[1];
                    if (obj5 instanceof PluginDeleteCallback) {
                        PluginPackageManager.this.deletePluginInternal((String) obj4, (PluginDeleteCallback) obj5);
                    }
                }
            }
        }
    }

    private PluginPackageManager() {
    }

    public static final String KEY_RN_SDK_TIMESTAMP(long j, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "rn_sdk_timestamp_" : "rn_sdk_timestamp_new");
        sb.append(j);
        return sb.toString();
    }

    private void clearAllPackageInternal() {
        FileUtils.deleteDirectory(getDexOptimizedBaseDir());
        FileUtils.deleteDirectory(getSoLibsDir());
        FileUtils.deleteDirectory(MPK_INSTALL_PATH);
        FileUtils.deleteDirectory(RN_INSTALL_PATH);
        clearInstalledPackageInfoInternal();
        FileUtils.deleteDirectory(DOWNLOAD_PATH);
        clearDownloadedPackageInfoInternal();
        writeLog("clear all package");
    }

    private void clearDownloadedPackageInfoInternal() {
        this.mDownloadedPackageInfoMap.clear();
    }

    private void clearInstalledPackageInfoInternal() {
        this.mInstalledPackageInfoMap.clear();
    }

    private void clearTmpDir() {
        FileUtils.deleteDirectory(TMP_PATH);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deletePluginInternal(String str, PluginDeleteCallback pluginDeleteCallback) {
        try {
            PluginPackageInfo pluginPackageInfo = this.mDownloadedPackageInfoMap.get(str);
            if (pluginPackageInfo != null && FileUtil.deleteFileOrDir(pluginPackageInfo.getPackagePath())) {
                removeDownloadPackageInfoByModel(str);
            }
            PluginPackageInfo pluginPackageInfo2 = this.mInstalledPackageInfoMap.get(str);
            if (pluginPackageInfo2 != null && FileUtil.deleteFileOrDir(pluginPackageInfo2.getPackagePath())) {
                removeInstallPackageInfoByModel(str);
            }
            pluginDeleteCallback.onSuccess(str);
        } catch (Exception unused) {
            pluginDeleteCallback.onFailure(str);
        }
    }

    public static PluginPackageManager getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new PluginPackageManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    private boolean isMpkHasSo(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(TMP_PATH);
        String str2 = File.separator;
        sb.append(str2);
        sb.append("debug");
        String string = sb.toString();
        String str3 = string + str2 + CpuConstant.CPU_ARMEABI + "_zip";
        String str4 = string + str2 + CpuConstant.CPU_ARMEABIV7 + "_zip";
        String str5 = "lib" + str2 + CpuConstant.CPU_ARMEABI;
        String str6 = "lib" + str2 + CpuConstant.CPU_ARMEABIV7;
        ZipFileUtils.syncUnzipSingleFile(str, str3, str5);
        String[] list = new File(str3 + str2 + str5).list();
        if (list != null && list.length > 0) {
            FileUtils.deleteDirectory(string);
            return true;
        }
        ZipFileUtils.syncUnzipSingleFile(str, str4, str6);
        String[] list2 = new File(str4 + str2 + str6).list();
        if (list2 == null || list2.length <= 0) {
            return false;
        }
        FileUtils.deleteDirectory(string);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$scanSdkInstalledPackageInternal$0(int i, Integer num) throws Exception {
        long j = i;
        FileUtils.deleteFile(getRnSdkPath(j, 6));
        FileUtils.deleteFile(getRnSdkPath(j, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onServerChangedInternal(ServerBean serverBean, ServerBean serverBean2) {
    }

    private void rebootApplicationInternal() {
        Intent launchIntentForPackage;
        if (MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType()) {
            try {
                PackageManager packageManager = this.mAppContext.getPackageManager();
                if (packageManager == null || (launchIntentForPackage = packageManager.getLaunchIntentForPackage(this.mAppContext.getPackageName())) == null) {
                    return;
                }
                launchIntentForPackage.addFlags(67108864);
                ((AlarmManager) this.mAppContext.getSystemService(DialWidgetType.ALARM)).set(1, System.currentTimeMillis() + VibrateModeProgressBar.sLongToLong, PendingIntent.getActivity(this.mAppContext, 223344, launchIntentForPackage, 335544320));
                Process.killProcess(Process.myPid());
                System.exit(0);
            } catch (Exception unused) {
            }
        }
    }

    private void scanAllPackageInternal() {
        clearInstalledPackageInfoInternal();
        clearDownloadedPackageInfoInternal();
        scanInstalledPackageInternal(MPK_INSTALL_PATH, PluginPackageConstant.PLUGIN_TYPE_MPK, ".apk");
        scanInstalledPackageInternal(RN_INSTALL_PATH, "rn", "");
        scanSdkInstalledPackageInternal(RN_SDK_INSTALL_PATH);
        scanDownloadedPackageInternal();
        clearTmpDir();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0113  */
    /* JADX WARN: Code duplicated, block: B:71:0x020e A[PHI: r10
      0x020e: PHI (r10v30 java.lang.String) = (r10v28 java.lang.String), (r10v31 java.lang.String) binds: [B:69:0x01f4, B:65:0x01df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x020e, please report this as an issue */
    private void scanDownloadedPackageInternal() {
        String[] list;
        long j;
        int length;
        String strSubstring;
        String str;
        String str2;
        long j2;
        int i;
        String str3;
        File file = new File(DOWNLOAD_PATH);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        Arrays.sort(list, PluginPackageConstant.COM_S2B);
        int length2 = list.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            String str4 = list[i3];
            long j3 = 0;
            try {
                j = Long.parseLong(str4);
            } catch (Exception unused) {
                writeLog(" scanDownloadedPackageInternal pluginId Exception parse:" + str4);
                j = 0L;
            }
            String str5 = DOWNLOAD_PATH + File.separator + str4;
            if (j <= 0 || j == 103) {
                FileUtils.deleteFile(str5);
                writeLog(" scanDownloadedPackageInternal pluginIdStr:" + str4);
            } else {
                String[] list2 = new File(str5).list();
                if (list2 == null || (length = list2.length) < 1) {
                    FileUtils.deleteFile(str5);
                    writeLog(" scanDownloadedPackageInternal plugins.size=0 pluginPath:" + str5);
                } else {
                    Arrays.sort(list2, PluginPackageConstant.COM_S2B);
                    int i4 = length - 1;
                    while (i4 >= 0) {
                        String str6 = list2[i4];
                        String str7 = str5 + File.separator + str6;
                        try {
                            if (str6.endsWith(MPK_PACKAGE_DOWNLOAD_SUFFIX)) {
                                strSubstring = str6.substring(i2, str6.length() - 4);
                                str2 = PluginPackageConstant.PLUGIN_TYPE_MPK;
                            } else if (str6.endsWith(H5_PACKAGE_DOWNLOAD_SUFFIX)) {
                                strSubstring = str6.substring(i2, str6.length() - 3);
                                str2 = PluginPackageConstant.PLUGIN_TYPE_H5;
                            } else {
                                if (str6.endsWith(".apk")) {
                                    strSubstring = str6.substring(i2, str6.length() - 4);
                                    str2 = PluginPackageConstant.PLUGIN_TYPE_APK;
                                } else if (str6.endsWith(RN_PACKAGE_DOWNLOAD_SUFFIX)) {
                                    strSubstring = str6.substring(i2, str6.length() - 3);
                                    str = "rn";
                                } else {
                                    strSubstring = "";
                                    str = "";
                                }
                                j2 = Long.parseLong(strSubstring);
                                if (j2 <= j3 && !TextUtils.isEmpty(str)) {
                                    String str8 = str;
                                    i = i4;
                                    PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, j, j2, str8, str7);
                                    if (pluginPackageInfoCreatePluginPackageInfo != null) {
                                        List<String> modelList = pluginPackageInfoCreatePluginPackageInfo.getModelList();
                                        if (modelList != null && modelList.size() != 0) {
                                            if (!PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo)) {
                                                FileUtils.deleteFile(str7);
                                                writeLog(" scanDownloadedPackageInternal validatePackage deleteFile:" + str7);
                                            } else {
                                                if (!PluginPackageUtils.isNativeToRNPlugin(pluginPackageInfoCreatePluginPackageInfo)) {
                                                    addDownloadedPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
                                                    writeLog("scanDownloadedPackageInternal first modellist - " + modelList + ", pluginPath - " + str7);
                                                    int i5 = 0;
                                                    while (i5 < i) {
                                                        String str9 = str5 + File.separator + list2[i5];
                                                        if (new File(PluginPackageUtils.getRnPackageRealPath(str9), PluginPackageConstant.RN_PROJECT_JSON).exists()) {
                                                            str3 = str8;
                                                        } else {
                                                            str3 = str8;
                                                            if ("rn".equalsIgnoreCase(str3)) {
                                                                writeLog("scanDownloadedPackageInternal other file - " + str9);
                                                            }
                                                            i5++;
                                                            str8 = str3;
                                                        }
                                                        if (PluginPackageUtils.createPluginPackageInfo(this.mAppContext, -1L, -1L, str3, str9) != null) {
                                                            FileUtils.deleteFile(str9);
                                                            writeLog("scanDownloadedPackageInternal little delete pluginPath - " + str9);
                                                        } else {
                                                            writeLog("scanDownloadedPackageInternal other file - " + str9);
                                                        }
                                                        i5++;
                                                        str8 = str3;
                                                    }
                                                    break;
                                                }
                                                writeLog(" scanDownloadedPackageInternal native plugin has become rn : " + str7);
                                            }
                                        } else {
                                            FileUtils.deleteFile(str7);
                                            writeLog(" scanDownloadedPackageInternal validatePackage deleteFile:" + str7);
                                        }
                                    } else {
                                        writeLog(" scanDownloadedPackageInternal pluginPackageInfo:" + str7);
                                    }
                                } else {
                                    i = i4;
                                    writeLog(" scanDownloadedPackageInternal packageId:" + str7);
                                }
                                i4 = i - 1;
                                i2 = 0;
                                j3 = 0;
                            }
                            j2 = Long.parseLong(strSubstring);
                        } catch (Exception unused2) {
                            writeLog(" scanDownloadedPackageInternal packageId Exception pase:" + strSubstring);
                            j2 = j3;
                        }
                        str = str2;
                        if (j2 <= j3) {
                            i = i4;
                            writeLog(" scanDownloadedPackageInternal packageId:" + str7);
                        } else {
                            i = i4;
                            writeLog(" scanDownloadedPackageInternal packageId:" + str7);
                        }
                        i4 = i - 1;
                        i2 = 0;
                        j3 = 0;
                    }
                }
            }
            i3++;
            i2 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0228  */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0228, please report this as an issue */
    private void scanInstalledPackageInternal(String str, String str2, String str3) {
        String[] list;
        long j;
        int length;
        long j2;
        long j3;
        int i;
        String[] list2;
        File file = new File(str);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        int length2 = list.length;
        int i2 = 0;
        int i3 = 0;
        while (i3 < length2) {
            String str4 = list[i3];
            try {
                j = Long.parseLong(str4);
            } catch (Exception unused) {
                writeLog("scanInstalledPackageInternal pluginId Exception parse:" + str4);
                j = 0L;
            }
            String str5 = file + File.separator + str4;
            if (j > 0) {
                String[] list3 = new File(str5).list();
                if (list3 == null || (length = list3.length) < 1) {
                    FileUtils.deleteFile(str5);
                    writeLog(" scanInstalledPackageInternal plugin.size=0 packagePaths:" + str5);
                } else {
                    Arrays.sort(list3, PluginPackageConstant.COM_S2B);
                    int i4 = length - 1;
                    while (i4 >= 0) {
                        String str6 = list3[i4];
                        String str7 = str5 + File.separator + str6;
                        if (str6.endsWith(str3)) {
                            String strSubstring = null;
                            try {
                                strSubstring = str6.substring(i2, str6.length() - str3.length());
                                j2 = Long.parseLong(strSubstring);
                            } catch (Exception unused2) {
                                writeLog("scanInstalledPackageInternal packageId Exception parse:" + strSubstring);
                                j2 = 0;
                            }
                        } else {
                            j2 = 0;
                        }
                        String soDir = PluginSetting.getSoDir(this.mAppContext, j, j2);
                        if (j2 <= 0) {
                            writeLog(" scanInstalledPackageInternal packageId:" + str7);
                        } else {
                            File file2 = new File(soDir);
                            if (file2.exists() && file2.isDirectory() && (list2 = file2.list()) != null && list2.length > 0 && PluginSoManager.getAbiPath(this.mAppContext, j, j2) == null) {
                                writeLog("scanInstalledPackageInternal do not find abi path pluginId:" + j + " packageId:" + j2);
                                FileUtils.deleteFile(str7);
                            } else {
                                long j4 = j;
                                j3 = j;
                                long j5 = j2;
                                i = i4;
                                PluginPackageInfo pluginPackageInfoCreatePluginPackageInfo = PluginPackageUtils.createPluginPackageInfo(this.mAppContext, j4, j5, str2, str7);
                                if (pluginPackageInfoCreatePluginPackageInfo != null) {
                                    List<String> modelList = pluginPackageInfoCreatePluginPackageInfo.getModelList();
                                    if (modelList == null || modelList.size() == 0) {
                                        FileUtils.deleteFile(str7);
                                        writeLog(" scanDownloadedPackageInternal validatePackage deleteFile:" + str7);
                                    } else {
                                        if (PluginPackageUtils.validatePackage(pluginPackageInfoCreatePluginPackageInfo)) {
                                            if (pluginPackageInfoCreatePluginPackageInfo.isRNPlugin()) {
                                                addDownloadedPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
                                            }
                                            addInstalledPackageInfoInternal(pluginPackageInfoCreatePluginPackageInfo);
                                            writeLog("scanInstalledPackageInternal first modellist - " + pluginPackageInfoCreatePluginPackageInfo.getModelList() + ", pluginPath - " + str7);
                                            for (int i5 = 0; i5 < i; i5++) {
                                                String str8 = str5 + File.separator + list3[i5];
                                                if (!new File(PluginPackageUtils.getRnPackageRealPath(str8), PluginPackageConstant.RN_PROJECT_JSON).exists() && "rn".equalsIgnoreCase(str2)) {
                                                    writeLog("scanInstalledPackageInternal other file - " + str8);
                                                } else if (PluginPackageUtils.createPluginPackageInfo(this.mAppContext, -1L, -1L, str2, str8) != null) {
                                                    FileUtils.deleteFile(str8);
                                                    writeLog("scanInstalledPackageInternal little delete pluginPath - " + str8);
                                                } else {
                                                    writeLog("scanInstalledPackageInternal other file - " + str8);
                                                }
                                            }
                                            break;
                                        }
                                        FileUtils.deleteFile(str7);
                                        writeLog(" scanInstalledPackageInternal validatePackage  deleteFile:" + str7);
                                    }
                                } else {
                                    writeLog(" scanInstalledPackageInternal createPluginPackageInfo  deleteFile:" + str7);
                                }
                            }
                            i4 = i - 1;
                            j = j3;
                            i2 = 0;
                        }
                        j3 = j;
                        i = i4;
                        i4 = i - 1;
                        j = j3;
                        i2 = 0;
                    }
                }
            } else if (TextUtils.isEmpty(str4) || !str4.contains(FileUtils.STD_PLUGIN_STORAGE_PATH_KEY)) {
                FileUtils.deleteFile(str5);
                writeLog(" scanInstalledPackageInternal pluginIdStr:" + str5);
            }
            i3++;
            i2 = 0;
        }
    }

    private void scanSdkInstalledPackageInternal(String str) {
        String[] list;
        int i = PluginSetting.RN_NATIVE_API_LEVEL;
        File file = new File(str);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        for (String str2 : list) {
            try {
                final int i2 = Integer.parseInt(str2);
                if (i2 > 0 && i2 < i) {
                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, "plugin_size_report", "delete low version sdk : " + str2);
                    o4h.E(0).S(ofl.c()).m(new bg4() { // from class: b2i
                        @Override // defpackage.bg4
                        public final void accept(Object obj) throws Exception {
                            this.f3714a.lambda$scanSdkInstalledPackageInternal$0(i2, (Integer) obj);
                        }
                    }).M();
                }
            } catch (Exception unused) {
                writeLog("sdk dir parse int err : " + str2);
            }
        }
    }

    public static void setNewestRnSdkInfo(String str, long j, long j2, String str2, long j3) {
        String str3 = "{\"max_api_level\":" + j + ",\"build_time\":" + j2 + ",\"real_installed_path\":\"" + str2 + "\",\"package_version\":" + j3 + "}";
        FileUtils.writeFile(new File(str), str3.getBytes());
        PluginSetting.RnSdkLog("write rn sdk info", str3, str);
    }

    private void writeLog(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str);
    }

    public void addDownloadedPackageInfoInternal(PluginPackageInfo pluginPackageInfo) {
        List<String> modelList;
        if (pluginPackageInfo == null || (modelList = pluginPackageInfo.getModelList()) == null) {
            return;
        }
        Iterator<String> it = modelList.iterator();
        while (it.hasNext()) {
            this.mDownloadedPackageInfoMap.put(it.next(), pluginPackageInfo);
        }
    }

    public void addInstalledPackageInfoInternal(PluginPackageInfo pluginPackageInfo) {
        List<String> modelList;
        if (pluginPackageInfo == null || (modelList = pluginPackageInfo.getModelList()) == null) {
            return;
        }
        Iterator<String> it = modelList.iterator();
        while (it.hasNext()) {
            this.mInstalledPackageInfoMap.put(it.next(), pluginPackageInfo);
        }
    }

    public boolean checkIsInstalled(long j) {
        String rnSdkPath = getRnSdkPath(j, 7);
        if (new File(rnSdkPath, PluginPackageConstant.RN_CONF_A).exists()) {
            return true;
        }
        return new File(rnSdkPath, PluginPackageConstant.RN_CONF_B).exists();
    }

    public void clearSDCardDebugPackageInternal() {
        FileUtils.deleteDirectory(MiJiaEnvironment.getAppContext().getExternalCacheDir() + File.separator + "debug");
    }

    public JSONObject createPluginInfoParams(String str) {
        long packageId;
        String packageType;
        PluginPackageInfo pluginPackageInfo = this.mInstalledPackageInfoMap.get(str);
        PluginPackageInfo pluginPackageInfo2 = this.mDownloadedPackageInfoMap.get(str);
        if (pluginPackageInfo != null) {
            packageId = pluginPackageInfo.getPackageId();
            packageType = pluginPackageInfo.getPackageType();
        } else if (pluginPackageInfo2 != null) {
            long packageId2 = pluginPackageInfo2.getPackageId();
            packageType = pluginPackageInfo2.getPackageType();
            packageId = packageId2;
        } else {
            packageId = 0;
            packageType = "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("model", str);
            jSONObject.put("package_id", packageId);
            jSONObject.put("type", packageType);
        } catch (JSONException e) {
            writeLog(Log.getStackTraceString(e));
        }
        return jSONObject;
    }

    public synchronized void deleteOldPlugin(int i, String str, long j, String str2, PluginPackageInfo pluginPackageInfo) {
        try {
            if (!TextUtils.isEmpty(str) && this.mWorkerHandler != null) {
                PluginPackageInfo downloadPackageInfo = i == 0 ? getDownloadPackageInfo(str) : getInstallPackageInfo(str);
                if (downloadPackageInfo != null && pluginPackageInfo != null && downloadPackageInfo.getPackageId() > pluginPackageInfo.getPackageId()) {
                    long packageId = downloadPackageInfo.getPackageId();
                    String packageDownloadedPath = i == 0 ? getPackageDownloadedPath(j, packageId, str2) : getPackageInstalledPath(j, packageId, str2);
                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "delete old plugin path : " + packageDownloadedPath + ", new packageId : " + pluginPackageInfo.getPackageId() + " , old packageId : " + downloadPackageInfo.getPackageId());
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 27;
                    messageObtain.obj = packageDownloadedPath;
                    this.mWorkerHandler.sendMessageDelayed(messageObtain, 1000L);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void deletePlugin(String str, PluginDeleteCallback pluginDeleteCallback) {
        if (isInited()) {
            this.mWorkerHandler.obtainMessage(26, new Object[]{str, new AnonymousClass1(pluginDeleteCallback)}).sendToTarget();
            return;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "deletePlugin failed, not init");
        if (pluginDeleteCallback != null) {
            pluginDeleteCallback.onFailure("not init");
        }
    }

    public void dumpPlugin() {
        Iterator<Map.Entry<String, PluginPackageInfo>> it = this.mDownloadedPackageInfoMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().toLog();
        }
        Iterator<Map.Entry<String, PluginPackageInfo>> it2 = this.mInstalledPackageInfoMap.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().toLog();
        }
    }

    public int getApiLevel() {
        return PluginSetting.API_LEVEL;
    }

    public String getDexOptimizedBaseDir() {
        return this.mAppContext.getDir("dex", 0).getAbsolutePath() + File.separator + "plugin";
    }

    public PluginPackageInfo getDownloadPackageInfo(String str) {
        if (str == null) {
            return null;
        }
        return this.mDownloadedPackageInfoMap.get(str);
    }

    public Map<String, PluginPackageInfo> getDownloadedPackageInfos() {
        return this.mDownloadedPackageInfoMap;
    }

    public PluginPackageInfo getInstallPackageInfo(String str) {
        return this.mInstalledPackageInfoMap.get(str);
    }

    public Map<String, PluginPackageInfo> getInstalledPackageInfos() {
        return this.mInstalledPackageInfoMap;
    }

    public PluginPackageInfo getInstalledPluginPackageInfo(long j) {
        for (Map.Entry<String, PluginPackageInfo> entry : this.mInstalledPackageInfoMap.entrySet()) {
            if (entry.getValue().getPackageId() == j) {
                return entry.getValue();
            }
        }
        return null;
    }

    public RnSdkInfo getNewestRnSdkInfo(Context context) {
        String appFilesDir = FileUtils.getAppFilesDir(context);
        RnSdkInfo innerRnSdkInfo = PluginSetting.getInnerRnSdkInfo(context, appFilesDir);
        String str = appFilesDir + PluginPackageConstant.RN_SDK_CONFIG_FILE_PATH_SUFFIX;
        String txtFromFile = FileUtils.readTxtFromFile(str);
        if (TextUtils.isEmpty(txtFromFile)) {
            return innerRnSdkInfo;
        }
        try {
            JSONObject jSONObject = new JSONObject(txtFromFile);
            RnSdkInfo rnSdkInfo = new RnSdkInfo(jSONObject.getLong("max_api_level"), jSONObject.getLong("build_time"), jSONObject.getString("real_installed_path"), false, String.valueOf(jSONObject.optLong("package_version")));
            if (innerRnSdkInfo != null && innerRnSdkInfo.api_level > rnSdkInfo.api_level) {
                FileUtils.deleteFile(str);
                return innerRnSdkInfo;
            }
            if (innerRnSdkInfo == null || innerRnSdkInfo.api_level != rnSdkInfo.api_level || innerRnSdkInfo.build_time <= rnSdkInfo.build_time) {
                PluginSetting.RnSdkLog("load rn sdk info from file", Long.valueOf(rnSdkInfo.api_level), rnSdkInfo.install_path);
                return rnSdkInfo;
            }
            FileUtils.deleteFile(str);
            return innerRnSdkInfo;
        } catch (Exception e) {
            writeLog(Log.getStackTraceString(e));
            return innerRnSdkInfo;
        }
    }

    public String getPackageDownloadedPath(long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(DOWNLOAD_PATH);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(j);
        sb.append(str2);
        sb.append(j2);
        sb.append(".");
        sb.append(str.toLowerCase());
        return sb.toString();
    }

    public String getPackageInstalledPath(long j, long j2, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_MPK)) {
            StringBuilder sb = new StringBuilder();
            sb.append(MPK_INSTALL_PATH);
            String str2 = File.separator;
            sb.append(str2);
            sb.append(j);
            sb.append(str2);
            sb.append(j2);
            sb.append(".apk");
            return sb.toString();
        }
        if (!str.equalsIgnoreCase("rn")) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(RN_INSTALL_PATH);
        String str3 = File.separator;
        sb2.append(str3);
        sb2.append(j);
        sb2.append(str3);
        sb2.append(j2);
        return sb2.toString();
    }

    public final String getRnPackageTempPath(long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(RN_INSTALL_TEMP_PATH);
        String str = File.separator;
        sb.append(str);
        sb.append(j);
        sb.append(str);
        sb.append(j2);
        return sb.toString();
    }

    public String getRnSdkPath(long j, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(RN_SDK_INSTALL_PATH);
        String str = File.separator;
        sb.append(str);
        sb.append(j);
        String string = sb.toString();
        if (i <= 5) {
            return string + ".zip";
        }
        if (i < 7) {
            return string + "_install";
        }
        return string + str;
    }

    public DebugPkgResult getSDCardDebugPkgResultInternal() {
        String strSubstring;
        long jLongValue;
        DebugPkgResult debugPkgResult = new DebugPkgResult();
        File externalCacheDir = MiJiaEnvironment.getAppContext().getExternalCacheDir();
        File file = new File(externalCacheDir + File.separator + "debug");
        String[] list = file.list();
        if (list == null || list.length <= 0) {
            debugPkgResult.hasError = true;
            debugPkgResult.errorMsg = "SD卡无插件包\n" + file;
            return debugPkgResult;
        }
        String str = list[0];
        String lowerCase = str.toLowerCase();
        String str2 = PluginPackageConstant.PLUGIN_TYPE_MPK;
        if (lowerCase.endsWith(PluginPackageConstant.PLUGIN_TYPE_MPK.toLowerCase())) {
            strSubstring = str.substring(0, str.length() - 4);
        } else {
            String lowerCase2 = str.toLowerCase();
            str2 = PluginPackageConstant.PLUGIN_TYPE_H5;
            if (lowerCase2.endsWith(PluginPackageConstant.PLUGIN_TYPE_H5.toLowerCase())) {
                strSubstring = str.substring(0, str.length() - 3);
            } else {
                String lowerCase3 = str.toLowerCase();
                str2 = PluginPackageConstant.PLUGIN_TYPE_APK;
                if (lowerCase3.endsWith(PluginPackageConstant.PLUGIN_TYPE_APK.toLowerCase())) {
                    strSubstring = str.substring(0, str.length() - 4);
                } else {
                    str2 = "rn";
                    if (str.toLowerCase().endsWith("rn".toLowerCase())) {
                        strSubstring = str.substring(0, str.length() - 3);
                    } else {
                        str2 = "";
                        strSubstring = "";
                    }
                }
            }
        }
        try {
            jLongValue = Long.parseLong(strSubstring);
        } catch (Exception unused) {
            jLongValue = 0;
        }
        if (jLongValue <= 0) {
            debugPkgResult.hasError = true;
            debugPkgResult.errorMsg = "文件名格式非法(" + str + ")";
            return debugPkgResult;
        }
        if (TextUtils.isEmpty(str2)) {
            debugPkgResult.hasError = true;
            debugPkgResult.errorMsg = "文件名格式非法(" + str + ")";
            return debugPkgResult;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(externalCacheDir);
        String str3 = File.separator;
        sb.append(str3);
        sb.append("debug");
        sb.append(str3);
        sb.append(str);
        String string = sb.toString();
        if (isMpkHasSo(string)) {
            ArrayList arrayList = new ArrayList();
            for (long j = 1; j <= 100; j++) {
                arrayList.add(Long.valueOf(j));
            }
            Collections.shuffle(arrayList);
            if (arrayList.size() > 0) {
                jLongValue = ((Long) arrayList.get(0)).longValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(externalCacheDir);
                String str4 = File.separator;
                sb2.append(str4);
                sb2.append("debug");
                sb2.append(str4);
                sb2.append(jLongValue);
                sb2.append(".");
                sb2.append(str2);
                String string2 = sb2.toString();
                new File(string).renameTo(new File(string2));
                string = string2;
            } else {
                FileUtils.deleteDirectory(MPK_INSTALL_PATH);
                FileUtils.deleteDirectory(getSoLibsDir());
                Notification.Builder smallIcon = new Notification.Builder(this.mAppContext).setContentTitle("米家正在重启以卸载已加载的so").setContentText("请稍候调试").setSmallIcon(R.drawable.alert_dark_frame);
                NotificationManager notificationManager = (NotificationManager) this.mAppContext.getSystemService("notification");
                if (Build.VERSION.SDK_INT >= 33 && this.mAppContext.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                    MiJiaLog.writeLogOnGrey(LogType.GENERAL, TAG, "No post notification permit");
                } else if (notificationManager != null) {
                    smallIcon.setChannelId(PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().getPluginChannelId(notificationManager, this.mAppContext));
                    notificationManager.notify(1122, smallIcon.build());
                }
                rebootApplicationInternal();
            }
        }
        debugPkgResult.debugPkgPath = string;
        debugPkgResult.debugPluginId = 1L;
        debugPkgResult.debugPkgId = jLongValue;
        debugPkgResult.debugPkgType = str2;
        debugPkgResult.hasError = false;
        return debugPkgResult;
    }

    public String getSoLibsDir() {
        return SO_INSTALL_DIR;
    }

    public void init() {
        byte b2;
        ArrayList<IsPackageReadyCallback> arrayList;
        Object obj = sLock;
        synchronized (obj) {
            try {
                b2 = this.mIsInitialized;
                if (b2 == 0) {
                    this.mIsInitialized = (byte) (b2 + 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b2 != 0) {
            return;
        }
        String appFilesDir = PluginPackageUtils.getAppFilesDir(this.mAppContext);
        writeLog("start init");
        StringBuilder sb = new StringBuilder();
        sb.append(appFilesDir);
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append("download");
        DOWNLOAD_PATH = sb.toString();
        TMP_PATH = appFilesDir + str + "plugin" + str + "tmp";
        MPK_INSTALL_PATH = appFilesDir + str + "plugin" + str + PluginPackageConstant.RN_INSTALL_DIR_KEY + str + PluginPackageConstant.PLUGIN_TYPE_MPK;
        RN_INSTALL_PATH = appFilesDir + str + "plugin" + str + PluginPackageConstant.RN_INSTALL_DIR_KEY + str + "rn";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(RN_INSTALL_PATH);
        sb2.append("_temp");
        RN_INSTALL_TEMP_PATH = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(appFilesDir);
        sb3.append(PluginPackageConstant.RN_SDK_INSTALL_PATH_SUFFIX);
        RN_SDK_INSTALL_PATH = sb3.toString();
        RN_SDK_CONFIG_FILE_PATH = appFilesDir + PluginPackageConstant.RN_SDK_CONFIG_FILE_PATH_SUFFIX;
        PluginSetting.getInnerRnSdkInfo(this.mAppContext, appFilesDir);
        SO_INSTALL_DIR = appFilesDir + str + "plugin" + str + PluginPackageConstant.RN_INSTALL_DIR_KEY + str + "lib";
        this.mUiHandler = new Handler(Looper.getMainLooper());
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("PluginPackageWorker");
        this.mWorkerThread = messageHandlerThread;
        messageHandlerThread.start();
        this.mWorkerHandler = new WorkerHandler(this.mWorkerThread.getLooper());
        scanAllPackageInternal();
        PluginUpdateManager.getInstance().checkToUpdateAllDownloadInnerPlugin();
        synchronized (obj) {
            this.mIsInitialized = (byte) (this.mIsInitialized + 1);
            arrayList = this.mReadyCallback;
            this.mReadyCallback = null;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).onPackageReady();
        }
    }

    public void isInitReady(IsPackageReadyCallback isPackageReadyCallback) {
        if (isPackageReadyCallback == null) {
            return;
        }
        ArrayList<IsPackageReadyCallback> arrayList = this.mReadyCallback;
        if (arrayList == null) {
            isPackageReadyCallback.onPackageReady();
        } else {
            arrayList.add(isPackageReadyCallback);
        }
    }

    public boolean isInited() {
        return this.mIsInitialized > 0;
    }

    public void onServerChanged(ServerBean serverBean, ServerBean serverBean2) {
        if (!isInited()) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "onServerChanged failed, not init");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = new Pair(serverBean, serverBean2);
        this.mWorkerHandler.sendMessage(messageObtain);
    }

    public void processAfterRnInstalled(Map<String, Object> map) {
        File file = new File((String) map.get("installed_path"));
        File[] fileArrListFiles = file.getParentFile().listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!file2.equals(file)) {
                if (file2.isFile()) {
                    FileUtils.deleteFile(file2.getAbsolutePath());
                } else if (file2.getName().matches("^\\d+$")) {
                    FileUtils.deleteDirectory(file2.getAbsolutePath());
                }
            }
        }
    }

    public void removeDownloadPackageInfoByModel(String str) {
        Map<String, PluginPackageInfo> map = this.mDownloadedPackageInfoMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeInstallPackageInfoByModel(String str) {
        Map<String, PluginPackageInfo> map = this.mInstalledPackageInfoMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public boolean validatePackageId(long j) {
        return j > 0;
    }

    public boolean validatePluginId(long j) {
        return j > 0;
    }
}
