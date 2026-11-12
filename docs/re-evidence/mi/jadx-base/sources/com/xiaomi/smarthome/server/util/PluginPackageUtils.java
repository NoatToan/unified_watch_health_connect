package com.xiaomi.smarthome.server.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.miui.tsmclientsdk.MiTsmConstants;
import com.xiaomi.smarthome.core.entity.plugin.PluginPackageInfo;
import com.xiaomi.smarthome.core.server.internal.plugin.util.ByteUtils;
import com.xiaomi.smarthome.framework.plugin.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import com.xiaomi.smarthome.library.MiJiaEnvironment;
import com.xiaomi.smarthome.library.common.util.IOUtils;
import com.xiaomi.smarthome.library.common.util.MMKVManager;
import com.xiaomi.smarthome.library.commonapi.SystemApi;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import com.xiaomi.smarthome.server.PluginJsonExtra;
import com.xiaomi.smarthome.server.PluginPackageManager;
import com.xiaomi.smarthome.server.PluginUpdateProviderManager;
import com.xiaomi.smarthome.setting.PluginSetting;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.security.cert.X509Certificate;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PluginPackageUtils {
    public static final String MPK_KEY_DEVELOPER_ID = "MiHomeDeveloperId";
    private static final String MPK_KEY_MIN_API_LEVEL = "minPluginSdkApiVersion";
    private static final String MPK_KEY_MODEL = "model";
    private static final String MPK_KEY_PLATFORM = "MiHomePlatform";
    private static final String MPK_KEY_SUPPORT_APP_AV = "MiHomeSupportAppAV";
    private static final String MPK_KEY_SUPPORT_WIDGET = "MiHomeSupportWidget";
    private static final String TAG = "PluginPackageUtils";
    public static final int TRANSLATE_ALL = 3;
    public static final int TRANSLATE_BASE = 1;
    public static final int TRANSLATE_LANGUAGE = 2;
    public static final String NORMAL_STD_PLUGIN_PARENT_MODEL = "miot.switch.spec";
    public static final Set<String> STD_PLUGIN_PARENT_MODEL_LIST = new HashSet(Arrays.asList(NORMAL_STD_PLUGIN_PARENT_MODEL, "miot.camera.spec", "miot.doorbell.spec"));
    private static String sAppFilesDir = null;

    /* JADX WARN: Code duplicated, block: B:59:0x025f  */
    public static JSONObject checkRnBundleSignature(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        X509Certificate x509Certificate;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String rnPackageRealPath = getRnPackageRealPath(str);
        File file = new File(rnPackageRealPath, PluginPackageConstant.RN_PROJECT_JSON);
        if (!file.exists()) {
            MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature projectFile not exits" + file);
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature projectFile not exits" + file);
            return null;
        }
        File file2 = new File(rnPackageRealPath, "bundle.sign");
        if (!file2.exists()) {
            MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature signFile not exits" + file2);
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature signFile not exits" + file2);
            return null;
        }
        File file3 = new File(rnPackageRealPath, "bundle.cert");
        if (!file3.exists()) {
            MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature certFile not exits" + file3);
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature certFile not exits" + file3);
            return null;
        }
        File file4 = new File(rnPackageRealPath, PluginSetting.FILE_BUNDLE_MAIN);
        if (!file4.exists()) {
            file4 = new File(rnPackageRealPath, "sdk.bundle");
            if (!file4.exists()) {
                MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature bundleFile not exits" + file4);
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature bundleFile not exits" + file4);
                return null;
            }
        }
        try {
            String txtFromFile = FileUtils.readTxtFromFile(file3.getAbsolutePath());
            if (TextUtils.isEmpty(txtFromFile)) {
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                return null;
            }
            if (txtFromFile.charAt(0) != '-') {
                txtFromFile = txtFromFile.trim();
            }
            int iLastIndexOf = txtFromFile.lastIndexOf(PluginPackageConstant.RN_CERT_FLAG);
            if (iLastIndexOf < 0) {
                MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature certs of rn plugin is invalid " + file3);
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature certs of rn plugin is invalid " + file3);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                return null;
            }
            X509Certificate mijiaRootCertificateFromAssetsX = getMijiaRootCertificateFromAssetsX();
            if (iLastIndexOf > 0) {
                String strTrim = txtFromFile.substring(0, iLastIndexOf).trim();
                String strTrim2 = txtFromFile.substring(iLastIndexOf).trim();
                X509Certificate x509Certificate2 = X509Certificate.getInstance(strTrim.getBytes());
                if (!verifyX509CertificateX(mijiaRootCertificateFromAssetsX, x509Certificate2)) {
                    MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature  cert1 of rn plugin is invalid " + file3);
                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature  cert1 of rn plugin is invalid " + file3);
                    IOUtils.closeQuietly((InputStream) null);
                    IOUtils.closeQuietly((InputStream) null);
                    IOUtils.closeQuietly((InputStream) null);
                    return null;
                }
                x509Certificate = X509Certificate.getInstance(strTrim2.getBytes());
                mijiaRootCertificateFromAssetsX = x509Certificate2;
            } else {
                x509Certificate = X509Certificate.getInstance(txtFromFile.getBytes());
            }
            if (!verifyX509CertificateX(mijiaRootCertificateFromAssetsX, x509Certificate)) {
                MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "checkRnBundleSignature  mijiaRootCert of rn plugin is invalid " + file3);
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnBundleSignature  mijiaRootCert of rn plugin is invalid " + file3);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((InputStream) null);
                return null;
            }
            byte[] bArr = new byte[(int) file.length()];
            FileInputStream fileInputStream5 = new FileInputStream(file);
            try {
                fileInputStream5.read(bArr);
                fileInputStream5.close();
                JSONObject jSONObject = new JSONObject(new String(bArr));
                int iOptInt = jSONObject.optInt(MiTsmConstants.KEY_SIGNATURE, -1);
                MessageDigest messageDigest = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
                messageDigest.update(bArr);
                byte[] bArrDigest = messageDigest.digest();
                long length = file4.length();
                if (iOptInt > 1024) {
                    j = iOptInt;
                    if (length <= j) {
                        j = length;
                    }
                } else {
                    j = length;
                }
                byte[] bArr2 = new byte[(int) j];
                fileInputStream4 = new FileInputStream(file4);
                try {
                    fileInputStream4.read(bArr2);
                    MessageDigest messageDigest2 = MessageDigest.getInstance(PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
                    messageDigest2.update(bArr2);
                    byte[] bArrDigest2 = messageDigest2.digest();
                    byte[] bArr3 = new byte[(int) file2.length()];
                    fileInputStream = new FileInputStream(file2);
                    try {
                        fileInputStream.read(bArr3);
                        fileInputStream.close();
                        Signature signature = Signature.getInstance(PluginPackageConstant.RN_BUNDLE_SIGNATURE_ALGORITHM);
                        signature.initVerify(x509Certificate.getPublicKey());
                        byte[] bArr4 = new byte[bArrDigest.length + bArrDigest2.length];
                        System.arraycopy(bArrDigest, 0, bArr4, 0, bArrDigest.length);
                        System.arraycopy(bArrDigest2, 0, bArr4, bArrDigest.length, bArrDigest2.length);
                        signature.update(bArr4);
                        boolean zVerify = signature.verify(bArr3);
                        if (!zVerify) {
                            MMKVManager.getMMKV("rn_check_signature").u(rnPackageRealPath, "signature of rn bundle  is invalid , targetPath : " + rnPackageRealPath + " , bundle length : " + j);
                        }
                        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "signature of rn bundle is " + zVerify + ">" + (System.currentTimeMillis() - jCurrentTimeMillis) + " " + rnPackageRealPath);
                        JSONObject jSONObject2 = zVerify ? jSONObject : null;
                        IOUtils.closeQuietly(fileInputStream5);
                        IOUtils.closeQuietly(fileInputStream4);
                        IOUtils.closeQuietly(fileInputStream);
                        return jSONObject2;
                    } catch (Exception e) {
                        e = e;
                        fileInputStream3 = fileInputStream5;
                        try {
                            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, Log.getStackTraceString(e));
                            IOUtils.closeQuietly(fileInputStream3);
                            IOUtils.closeQuietly(fileInputStream4);
                            IOUtils.closeQuietly(fileInputStream);
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream2 = fileInputStream3;
                            IOUtils.closeQuietly(fileInputStream2);
                            IOUtils.closeQuietly(fileInputStream4);
                            IOUtils.closeQuietly(fileInputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream5;
                        IOUtils.closeQuietly(fileInputStream2);
                        IOUtils.closeQuietly(fileInputStream4);
                        IOUtils.closeQuietly(fileInputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileInputStream3 = fileInputStream5;
                    fileInputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileInputStream2 = fileInputStream5;
                    fileInputStream = null;
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream3 = fileInputStream5;
                fileInputStream = null;
                fileInputStream4 = null;
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, Log.getStackTraceString(e));
                IOUtils.closeQuietly(fileInputStream3);
                IOUtils.closeQuietly(fileInputStream4);
                IOUtils.closeQuietly(fileInputStream);
                return null;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream2 = fileInputStream5;
                fileInputStream = null;
                fileInputStream4 = null;
                IOUtils.closeQuietly(fileInputStream2);
                IOUtils.closeQuietly(fileInputStream4);
                IOUtils.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream3 = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            fileInputStream2 = null;
        }
    }

    public static boolean checkRnInstallPackageModelListFile(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "checkRnInstallPackageModelListFile downloadPackagePath=" + str2 + "; installPackagePath=" + str3);
            return false;
        }
        String str4 = str3 + File.separator + PluginJsonExtra.FILE_MODEL_LIST;
        try {
            if (new File(str4).exists()) {
                JSONObject jSONObject = new JSONObject(FileUtils.readTxtFromFile(str4));
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "model_list_content : " + jSONObject.toString());
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("model_list");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        if (TextUtils.equals(str, jSONArrayOptJSONArray.getString(i))) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, TAG, "checkRnInstallPackageModelListFile err : " + Log.getStackTraceString(e));
        }
        return false;
    }

    public static boolean checkRnPluginPackageExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = getRnPackageRealPath(str) + File.separator + PluginSetting.FILE_BUNDLE_MAIN;
        File file = new File(str2);
        if (file.exists() && file.length() >= 20) {
            return true;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str2 + " is not exits or file size is small 20");
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x015d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x0166  */
    public static PluginPackageInfo createPluginPackageInfo(Context context, long j, long j2, String str, String str2) {
        Bundle bundle;
        String stackTraceString;
        String txtFromFile;
        PluginPackageInfo pluginPackageInfo = new PluginPackageInfo();
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            reportPluginDownloadError("packagePath:" + str2 + ",packageType:" + str);
            return null;
        }
        if (str.equalsIgnoreCase(PluginPackageConstant.PLUGIN_TYPE_MPK)) {
            try {
                PackageInfo packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(str2, 128);
                if (packageArchiveInfo != null) {
                    pluginPackageInfo.setVersion(packageArchiveInfo.versionCode);
                    pluginPackageInfo.setPackageName(packageArchiveInfo.packageName);
                    ApplicationInfo applicationInfo = packageArchiveInfo.applicationInfo;
                    if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                        pluginPackageInfo.setModelList(Arrays.asList(bundle.getString("model", "").split("\\|")));
                        pluginPackageInfo.setMinApiLevel(bundle.getInt(MPK_KEY_MIN_API_LEVEL, 0));
                        pluginPackageInfo.setDeveloperId(getDeveloperIdFromBundleHelper(bundle));
                        pluginPackageInfo.setPlatform(bundle.getString(MPK_KEY_PLATFORM, ""));
                        pluginPackageInfo.setIsSupportWidget(bundle.getBoolean(MPK_KEY_SUPPORT_WIDGET, false));
                        pluginPackageInfo.setIsSupportAppAV(bundle.getBoolean(MPK_KEY_SUPPORT_APP_AV, true));
                    }
                }
            } catch (Exception e) {
                MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str2 + " readMetaDataFail " + Log.getStackTraceString(e));
                return null;
            }
        } else if (str.equals("rn")) {
            try {
                stackTraceString = getRnPackageRealPath(str2) + File.separator + PluginPackageConstant.RN_PROJECT_JSON;
                try {
                    txtFromFile = FileUtils.readTxtFromFile(stackTraceString);
                    try {
                        JSONObject jSONObject = new JSONObject(txtFromFile);
                        pluginPackageInfo.setDeveloperId(NumberUtils.valueOf((Object) jSONObject.optString("developer_id"), 0L));
                        pluginPackageInfo.setPackageName(jSONObject.optString("package_path"));
                        PluginJsonExtra pluginJsonExtra = new PluginJsonExtra(new File(str2));
                        int version = pluginJsonExtra.readVersion();
                        pluginPackageInfo.setModelList(pluginJsonExtra.readModelList());
                        pluginPackageInfo.setPlatform("phone");
                        if (pluginPackageInfo.getModelList() != null && pluginPackageInfo.getModelList().contains(NORMAL_STD_PLUGIN_PARENT_MODEL)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("scan version : ");
                            sb.append(jSONObject.optString("version_code"));
                        }
                        pluginPackageInfo.setMinApiLevel((int) NumberUtils.valueOf((Object) jSONObject.optString(PluginPackageConstant.KEY_RNSDK_API_LEVEL), 0L));
                        if (version <= 0) {
                            version = (int) NumberUtils.valueOf((Object) jSONObject.optString("version_code"), 0L);
                        }
                        pluginPackageInfo.setVersion(version);
                        pluginPackageInfo.setIsSupportWidget(false);
                        pluginPackageInfo.setIsSupportAppAV(true);
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof JSONException) {
                            stackTraceString = Log.getStackTraceString(e);
                        } else if (!TextUtils.isEmpty(txtFromFile)) {
                            stackTraceString = txtFromFile;
                        }
                        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "createPluginPackageInfo error :  " + stackTraceString);
                        reportPluginDownloadError(stackTraceString);
                        return null;
                    }
                } catch (Exception e3) {
                    e = e3;
                    txtFromFile = null;
                    if (e instanceof JSONException) {
                        stackTraceString = Log.getStackTraceString(e);
                    } else if (!TextUtils.isEmpty(txtFromFile)) {
                        stackTraceString = txtFromFile;
                    }
                    MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "createPluginPackageInfo error :  " + stackTraceString);
                    reportPluginDownloadError(stackTraceString);
                    return null;
                }
            } catch (Exception e4) {
                e = e4;
                stackTraceString = null;
            }
        }
        pluginPackageInfo.setPluginId(j);
        pluginPackageInfo.setPackageId(j2);
        pluginPackageInfo.setPackagePath(str2);
        pluginPackageInfo.setPackageType(str);
        pluginPackageInfo.setLastModifiedTime(FileUtils.getLastModifiedTime(str2));
        return pluginPackageInfo;
    }

    public static void deletePluginPackageAndroidDir(String str) {
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, str + " , plugin package file validate failed");
        FileUtils.deleteFile(getRnPackageRealPath(str));
    }

    private static String generateApkSignatureMD5(android.content.pm.Signature[] signatureArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            if (signatureArr != null) {
                for (android.content.pm.Signature signature : signatureArr) {
                    messageDigest.update(signature.toByteArray());
                }
            }
            return ByteUtils.toHexString(messageDigest.digest());
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getAppFilesDir(Context context) {
        if (context == null) {
            context = MiJiaEnvironment.getAppContext();
        }
        if (TextUtils.isEmpty(sAppFilesDir)) {
            sAppFilesDir = FileUtils.getAppFilesDir(context);
        }
        return sAppFilesDir;
    }

    private static long getDeveloperIdFromBundleHelper(Bundle bundle) {
        if (bundle == null) {
            return 0L;
        }
        try {
            String string = bundle.getString(MPK_KEY_DEVELOPER_ID, "");
            return Long.parseLong(string.substring(3, string.length()));
        } catch (Exception unused) {
            return 0L;
        }
    }

    private static boolean getIsSupportedStdPlugin() {
        return MMKVManager.getMMKV("developer_setting").c("is_support_std_plugin");
    }

    public static X509Certificate getMijiaRootCertificateFromAssetsX() throws Throwable {
        InputStream inputStreamOpen;
        Throwable th;
        try {
            inputStreamOpen = MiJiaEnvironment.getAppContext().getAssets().open("MijiaRootCert.der");
            try {
                try {
                    X509Certificate x509Certificate = X509Certificate.getInstance(inputStreamOpen);
                    IOUtils.closeQuietly(inputStreamOpen);
                    return x509Certificate;
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    IOUtils.closeQuietly(inputStreamOpen);
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly(inputStreamOpen);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            inputStreamOpen = null;
            th = th3;
            IOUtils.closeQuietly(inputStreamOpen);
            throw th;
        }
    }

    public static SharedPreferences getPluginSDKPref(String str, Context context) {
        if (context == null) {
            context = MiJiaEnvironment.getAppContext();
        }
        return context.getSharedPreferences(str, 0);
    }

    public static final String getRnPackageRealPath(String str) {
        return (new File(str, PluginPackageConstant.RN_CONF_A).exists() || isJustNeedCreateAndroidADir(str)) ? new File(str, PluginPackageConstant.RN_DIR_A).getAbsolutePath() : new File(str, PluginPackageConstant.RN_DIR_B).getAbsolutePath();
    }

    public static String getStdPluginVersion() {
        return MMKVManager.getMMKV("developer_setting").j("std_plugin_version");
    }

    private static boolean isBetaMiHome() {
        return MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isInGreyPublish() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isPublishTypeDev();
    }

    public static boolean isGetStdPluginByVersion() {
        boolean z = isBetaMiHome() && !TextUtils.isEmpty(getStdPluginVersion()) && getIsSupportedStdPlugin();
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "std_plugin", "isGetStdPluginByVersion : " + z);
        return z;
    }

    private static boolean isJustNeedCreateAndroidADir(String str) {
        return (TextUtils.isEmpty(str) || str.contains("rnsdk") || (!str.contains("download") && !str.contains(PluginPackageConstant.RN_INSTALL_DIR_KEY))) ? false : true;
    }

    public static boolean isNativeToRNPlugin(PluginPackageInfo pluginPackageInfo) {
        List<String> modelList;
        PluginPackageInfo downloadPackageInfo;
        if (pluginPackageInfo == null || !pluginPackageInfo.isMpkPlugin() || (modelList = pluginPackageInfo.getModelList()) == null || modelList.size() == 0 || (downloadPackageInfo = PluginPackageManager.getInstance().getDownloadPackageInfo(modelList.get(0))) == null || !downloadPackageInfo.isRNPlugin()) {
            return false;
        }
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, downloadPackageInfo.toString());
        return true;
    }

    public static boolean isStdPluginParentModel(String str) {
        Set<String> set;
        if (TextUtils.isEmpty(str) || (set = STD_PLUGIN_PARENT_MODEL_LIST) == null || set.size() <= 0) {
            return false;
        }
        return set.contains(str);
    }

    public static void reportPluginDownloadError(String str) {
        HashMap map = new HashMap();
        map.put("call_stack", str);
        PluginUpdateProviderManager.getInstance().getPluginUpdateProviderApi().reportRNDownloadErr(RnReportConst.PLUGIN_FRAMEWORK_SUB_ID, "rn_plugin_download_error", map);
    }

    public static void reportRnPluginActivityReuse(int i) {
        new HashMap().put("activity_enter_type", Integer.valueOf(i));
    }

    public static boolean validatePackage(PluginPackageInfo pluginPackageInfo) {
        String packageType = pluginPackageInfo.getPackageType();
        String packagePath = pluginPackageInfo.getPackagePath();
        if (!validatePackageMinApiLevel(packageType, pluginPackageInfo.getMinApiLevel())) {
            FileUtils.deleteFile(packagePath);
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "#hPDSI# validateMinApiLevel fail:" + pluginPackageInfo.toLog() + "CurrentApiLevel[" + PluginSetting.API_LEVEL + "]");
            return false;
        }
        if (validatePackagePlatform(pluginPackageInfo.getPlatform(), packageType)) {
            if (validatePackageModel(packageType, pluginPackageInfo.getModelList())) {
                return true;
            }
            FileUtils.deleteFile(packagePath);
            MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "#hPDSI# validateModel fail:" + pluginPackageInfo.toLog());
            return false;
        }
        FileUtils.deleteFile(packagePath);
        MiJiaLog.writeLogOnAll(LogType.PLUGIN, "PluginManager", TAG, "#hPDSI# validatePlatform fail:" + pluginPackageInfo.toLog() + "CurrentPlatform[" + SystemApi.getInstance().getPlatform() + "]");
        return false;
    }

    private static boolean validatePackageMinApiLevel(String str, int i) {
        if ("rn".equalsIgnoreCase(str)) {
            return true;
        }
        return i > 0 && i <= PluginSetting.API_LEVEL;
    }

    private static boolean validatePackageModel(String str, List<String> list) {
        if ("rn".equalsIgnoreCase(str)) {
            return true;
        }
        boolean z = false;
        if (list == null || list.size() <= 0) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next())) {
                z = true;
                break;
            }
        }
        return !z;
    }

    private static boolean validatePackagePlatform(String str, String str2) {
        if ("rn".equalsIgnoreCase(str2)) {
            return true;
        }
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase(SystemApi.getInstance().getPlatform());
    }

    public static boolean validatePackageSignature(Context context, PluginPackageInfo pluginPackageInfo, String str) {
        return true;
    }

    public static boolean verifyX509CertificateX(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        try {
            x509Certificate2.verify(x509Certificate.getPublicKey());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static PluginPackageInfo createPluginPackageInfo(long j, long j2, long j3, String str, String str2, List<String> list) {
        PluginPackageInfo pluginPackageInfo = new PluginPackageInfo();
        pluginPackageInfo.setPluginId(j2);
        pluginPackageInfo.setPackageId(j3);
        pluginPackageInfo.setDeveloperId(j);
        pluginPackageInfo.setMinApiLevel(1);
        pluginPackageInfo.setPlatform(PluginPackageConstant.RN_DIR_A);
        pluginPackageInfo.setVersion(1);
        pluginPackageInfo.setPackageType(PluginPackageConstant.PLUGIN_TYPE_MPK);
        pluginPackageInfo.setPackagePath(str);
        pluginPackageInfo.setPackageName(str2);
        pluginPackageInfo.setModelList(list);
        pluginPackageInfo.setIsSupportWidget(false);
        pluginPackageInfo.setIsSupportAppAV(true);
        pluginPackageInfo.setLastModifiedTime(System.currentTimeMillis());
        return pluginPackageInfo;
    }
}
