package com.xiaomi.smarthome.setting;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.rn.core.bean.RnSdkInfo;
import com.xiaomi.smarthome.server.util.PluginPackageUtils;
import defpackage.pgp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginSetting {
    public static int API_LEVEL = 111;
    public static final String FILE_BUNDLE_MAIN = "main.bundle";
    public static final String FILE_BUNDLE_SDK = "sdk.bundle";
    public static final String NAME_DEVICE_ITEM_CLICKED = "device item clicked";
    public static final String NAME_LOAD_PLUGIN_SCRIPT = "runtime load plugin";
    public static final String NAME_PLUGIN_DID_MOUNT = "plugin componentDidMount";
    public static final String NAME_PLUGIN_WILL_MOUNT = "plugin componentWillMount";
    public static final long PACKAGE_ID_DEBUG_END = 100;
    public static final long PACKAGE_ID_DEBUG_START = 1;
    public static final long PLUGIN_ID_DEBUG_END = 100;
    public static final long PLUGIN_ID_DEBUG_START = 1;
    public static final String RN_SDK_DIR_IN_ASSETS = "plugin_rn_sdk";
    private static final String timestampFilePath = "/mnt/sdcard/SmartHome/logs/plugin_timestamp.log";
    public static int RN_NATIVE_API_LEVEL = 10089;
    private static final String RnSdkLogTag = "MIOTRNSDK" + RN_NATIVE_API_LEVEL;
    private static RnSdkInfo INNER_RN_SDK_INFO = null;

    public static final void LogTimestamp(String str) throws Throwable {
        if (isDebug()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" : ");
            sb.append(jCurrentTimeMillis);
            if (isLogTimestampFileExists()) {
                String str2 = jCurrentTimeMillis + ":" + str + ";\n";
                FileWriter fileWriter = null;
                try {
                    if (NAME_DEVICE_ITEM_CLICKED.equals(str)) {
                        FileUtils.writeInputStreamToFile(null, timestampFilePath, str2, "");
                        return;
                    }
                    try {
                        FileWriter fileWriter2 = new FileWriter(new File(timestampFilePath), true);
                        try {
                            fileWriter2.append((CharSequence) str2);
                            fileWriter2.close();
                            fileWriter2.close();
                        } catch (Exception unused) {
                            fileWriter = fileWriter2;
                            if (fileWriter == null) {
                            } else {
                                fileWriter.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            fileWriter = fileWriter2;
                            if (fileWriter != null) {
                                try {
                                    fileWriter.close();
                                } catch (Exception unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception unused4) {
                }
            }
        }
    }

    public static final void RnSdkLog(Object... objArr) {
        if (objArr == null || objArr.length < 1) {
            return;
        }
        if (objArr.length == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(objArr[0]);
            return;
        }
        if (objArr.length == 2 && (objArr[1] instanceof Throwable)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(objArr[0]);
            sb2.append("");
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        for (Object obj : objArr) {
            if (obj instanceof Throwable) {
            } else {
                sb3.append(obj + " | ");
            }
        }
    }

    public static String getDexOptimizedBaseDir(Context context) {
        return context.getDir("dex", 0).getAbsolutePath() + File.separator + "plugin";
    }

    public static String getDexOptimizedDir(Context context, long j, long j2) {
        File dir = context.getDir("dex", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(dir.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static final RnSdkInfo getInnerRnSdkInfo(Context context, String str) {
        RnSdkInfo rnSdkInfo = INNER_RN_SDK_INFO;
        if (rnSdkInfo != null) {
            return rnSdkInfo;
        }
        try {
            JSONObject jSONObject = new JSONObject(FileUtils.readTxtFromStream(context.getAssets().open("plugin_rn_sdk/project.json")));
            RnSdkInfo rnSdkInfo2 = new RnSdkInfo(jSONObject.getLong(PluginPackageConstant.KEY_RNSDK_API_LEVEL), jSONObject.getLong("build_time"), "assets://plugin_rn_sdk" + File.separator + "sdk.bundle", true, "0");
            INNER_RN_SDK_INFO = rnSdkInfo2;
            RnSdkLog("create inner rn sdk info", Long.valueOf(rnSdkInfo2.api_level), INNER_RN_SDK_INFO.install_path);
            return INNER_RN_SDK_INFO;
        } catch (Exception unused) {
            RnSdkLog("not has inner rn sdk,  sdk api level is " + RN_NATIVE_API_LEVEL);
            return null;
        }
    }

    public static final List<String> getPluginProjectJsonActions(String str) {
        return getPluginProjectJsonEntranceScene(str, "action_ids");
    }

    public static final List<String> getPluginProjectJsonConditions(String str) {
        return getPluginProjectJsonEntranceScene(str, "trigger_ids");
    }

    private static final List<String> getPluginProjectJsonEntranceScene(String str, String str2) throws Throwable {
        ArrayList arrayList = new ArrayList();
        String str3 = PluginPackageUtils.getRnPackageRealPath(str) + File.separator + PluginPackageConstant.RN_PROJECT_JSON;
        MiJiaLog.onlyLogcat("project_json_path", str3);
        File file = new File(str3);
        if (file.exists()) {
            FileInputStream fileInputStream = null;
            try {
                try {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            byte[] bArr = new byte[fileInputStream2.available()];
                            fileInputStream2.read(bArr);
                            JSONArray jSONArrayOptJSONArray = new JSONObject(new String(bArr)).getJSONObject("entrance_scene").optJSONArray(str2);
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                                int length = jSONArrayOptJSONArray.length();
                                for (int i = 0; i < length; i++) {
                                    arrayList.add(jSONArrayOptJSONArray.get(i).toString());
                                }
                            }
                            fileInputStream2.close();
                            fileInputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            fileInputStream = fileInputStream2;
                            MiJiaLog.onlyLogcat(6, "PluginSetting", e.toString());
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return arrayList;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e2) {
                                    MiJiaLog.onlyLogcat(6, "PluginSetting", e2.toString());
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e4) {
                MiJiaLog.onlyLogcat(6, "PluginSetting", e4.toString());
            }
        }
        return arrayList;
    }

    public static String getSoBaseDir(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append(PluginPackageConstant.RN_INSTALL_DIR_KEY);
        sb.append(str);
        sb.append("lib");
        return sb.toString();
    }

    public static String getSoBaseDirOld(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir().getPath());
        String str = File.separator;
        sb.append(str);
        sb.append("plugin");
        sb.append(str);
        sb.append(PluginPackageConstant.RN_INSTALL_DIR_KEY);
        sb.append(str);
        sb.append("libs");
        return sb.toString();
    }

    public static String getSoDir(Context context, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSoBaseDir(context));
        String str = File.separator;
        sb.append(str);
        sb.append(j);
        sb.append(str);
        sb.append(j2);
        return sb.toString();
    }

    public static final boolean isDebug() {
        return MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType();
    }

    public static final boolean isLogTimestampFileExists() {
        if (isDebug()) {
            return FileUtils.fileExists(timestampFilePath);
        }
        return false;
    }

    public static boolean isValidateDeveloperId(long j) {
        return j > 0;
    }

    public static boolean isValidatePackageId(long j) {
        return j > 0;
    }

    public static boolean isValidatePluginId(long j) {
        return j > 0;
    }

    public static final void setLogTimestamp(boolean z) {
        if (isDebug()) {
            if (z) {
                FileUtils.createFileIfNotExists(timestampFilePath);
            } else {
                FileUtils.deleteFile(timestampFilePath);
            }
        }
    }

    public static final void showTimestampsToast() {
        if (isDebug()) {
            String txtFromFile = FileUtils.readTxtFromFile(timestampFilePath);
            if (TextUtils.isEmpty(txtFromFile)) {
                return;
            }
            Long lValueOf = null;
            Long lValueOf2 = null;
            Long lValueOf3 = null;
            Long lValueOf4 = null;
            for (String str : txtFromFile.split(";")) {
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split(":");
                    if (strArrSplit.length >= 2) {
                        if (lValueOf2 != null) {
                            if (lValueOf3 != null) {
                                if (lValueOf4 != null) {
                                    if (NAME_PLUGIN_DID_MOUNT.equals(strArrSplit[1].trim())) {
                                        lValueOf = Long.valueOf(Long.parseLong(strArrSplit[0].trim()));
                                        break;
                                    }
                                } else if (NAME_PLUGIN_WILL_MOUNT.equals(strArrSplit[1].trim())) {
                                    lValueOf4 = Long.valueOf(Long.parseLong(strArrSplit[0].trim()));
                                }
                            } else if (NAME_LOAD_PLUGIN_SCRIPT.equals(strArrSplit[1].trim())) {
                                lValueOf3 = Long.valueOf(Long.parseLong(strArrSplit[0].trim()));
                            }
                        } else if (NAME_DEVICE_ITEM_CLICKED.equals(strArrSplit[1].trim())) {
                            lValueOf2 = Long.valueOf(Long.parseLong(strArrSplit[0].trim()));
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (lValueOf == null) {
                return;
            }
            pgp.a(MiJiaEnvironment.getAppContext(), "time used:\nready:   " + (lValueOf3.longValue() - lValueOf2.longValue()) + " ms\nloading: " + (lValueOf4.longValue() - lValueOf3.longValue()) + " ms\nloadAll: " + (lValueOf4.longValue() - lValueOf2.longValue()) + " ms\nrender:  " + (lValueOf.longValue() - lValueOf4.longValue()) + " ms\nall:     " + (lValueOf.longValue() - lValueOf2.longValue()) + " ms\n", 1).show();
        }
    }

    public static String getSoDir(Context context, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(getSoBaseDir(context));
        String str2 = File.separator;
        sb.append(str2);
        sb.append(j);
        sb.append(str2);
        sb.append(j2);
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }
}
