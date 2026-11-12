package com.huawei.watchface.utils;

import android.app.Application;
import android.text.TextUtils;
import com.huawei.fileprotect.HwSfpPolicyManager;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.f5;
import com.huawei.watchface.flavor.FlavorConfig;
import com.huawei.watchface.mvp.model.crypt.PversionSdUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class HwSfpPolicyManagerHelper {
    private static final int FLAG_FILE_PROTECTION_COMPLETE = 0;
    private static final String LABEL_VALUE_S2 = "S2";
    private static final String TAG = "HwSfpPolicyManagerHelper";
    private static final String[] DEFAULT_PATH_ARR = {"watchface", "watchfacePhoto", "watchfaceVideo", "14", "16"};
    private static final List<String> WHITE_LIST = new ArrayList();

    static {
        addToWhiteList(getDataUserPath());
        addToWhiteList(getDataPathPrefix());
    }

    private static void addToWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List<String> list = WHITE_LIST;
        if (list.contains(str)) {
            return;
        }
        list.add(str);
    }

    private static String convertPath(String str) {
        String dataPathPrefix = getDataPathPrefix();
        return (TextUtils.isEmpty(str) || !str.startsWith(dataPathPrefix)) ? str : str.replace(dataPathPrefix, getDataUserPath());
    }

    public static String getDataPathPrefix() {
        File cacheDir;
        Application applicationContext = Environment.getApplicationContext();
        return (applicationContext == null || (cacheDir = applicationContext.getCacheDir()) == null) ? "" : FileHelper.c(cacheDir).replace("/cache", "");
    }

    public static String getDataUserPath() {
        File filesDir;
        Application applicationContext = Environment.getApplicationContext();
        return (applicationContext == null || (filesDir = applicationContext.getFilesDir()) == null) ? "" : filesDir.getParent();
    }

    public static String getFileDataUserPath() {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null || applicationContext.getFilesDir() == null) {
            return "";
        }
        return applicationContext.getFilesDir() + "";
    }

    public static void initDefaultCeLabelInDir() {
        int iA = f5.a("sp_key_is_first_install", 0);
        HwLog.d(TAG, "initDefaultCeLabelInDir isFirstInstall:" + iA);
        if (iA == 1) {
            return;
        }
        if (!wantLabel()) {
            f5.b("sp_key_is_first_install", 1);
            return;
        }
        HwLog.d(TAG, "initDefaultCeLabelInDir first");
        String fileDataUserPath = getFileDataUserPath();
        for (String str : DEFAULT_PATH_ARR) {
            setDefaultCeLabelInDir(fileDataUserPath + File.separator + str);
        }
        HwLog.d(TAG, "initDefaultCeLabelInDir end");
        f5.b("sp_key_is_first_install", 1);
    }

    private static boolean isInWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator<String> it = WHITE_LIST.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static void setCustLabel(String str, String str2, int i) {
        if (wantLabelPath(str)) {
            setLabel(convertPath(str), str2, i);
        }
    }

    public static void setDefaultCeLabel(String str) {
        if (wantLabelPath(str)) {
            setLabel(convertPath(str), LABEL_VALUE_S2, 0);
        }
    }

    public static void setDefaultCeLabelInDir(String str) {
        File file = PversionSdUtils.getFile(str);
        if (!FileHelper.e(file)) {
            setDefaultCeLabel(str);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            HwLog.e(TAG, "checkSkinFiles fail --> files is empty");
            return;
        }
        for (File file2 : fileArrListFiles) {
            setDefaultCeLabelInDir(file2.getPath());
        }
    }

    public static void setFilePathLabel(String str) {
        if (TextUtils.isEmpty(str)) {
            HwLog.d(TAG, "setFilePathLabel filePath is null");
            return;
        }
        File file = PversionSdUtils.getFile(str);
        if (file == null || !FileHelper.e(file)) {
            HwLog.d(TAG, "setFilePathLabel newGeneratedFile is null");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            HwLog.e(TAG, "checkSkinFiles fail --> files is empty");
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!FileHelper.e(file2)) {
                setDefaultCeLabel(file2);
            }
        }
    }

    private static void setLabel(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            HwLog.e(TAG, "setLabel, labelValue is empty");
            return;
        }
        if (FileHelper.h(str)) {
            return;
        }
        try {
            Application applicationContext = Environment.getApplicationContext();
            if (applicationContext == null) {
                HwLog.e(TAG, "setLabel, context is null");
                return;
            }
            HwSfpPolicyManager hwSfpPolicyManager = HwSfpPolicyManager.getDefault();
            if (hwSfpPolicyManager == null) {
                HwLog.d(TAG, "setLable, policyManager is null");
                return;
            }
            int label = hwSfpPolicyManager.setLabel(applicationContext, str, "SecurityLevel", str2, i);
            HwLog.d(TAG, "setLabel result:" + label + ",fileName:" + CommonUtils.c(str));
            FlavorConfig.safeHwLog(TAG, "setLabel result:" + label + ",filePath:" + str);
        } catch (Exception e) {
            HwLog.e(TAG, "setLabel, Exception:" + HwLog.printException(e));
        } catch (NoSuchMethodError e2) {
            HwLog.e(TAG, "setLabel, NoSuchMethodError:" + HwLog.printException((Error) e2));
        }
    }

    private static boolean wantLabel() {
        if (!MobileInfoHelper.isEmui11()) {
            HwLog.d(TAG, "is not Emui 11");
            return false;
        }
        if (!MobileInfoHelper.isHonorDevice()) {
            return true;
        }
        HwLog.d(TAG, "is honor devices");
        return false;
    }

    private static boolean wantLabelPath(String str) {
        if (!wantLabel()) {
            return false;
        }
        if (isInWhiteList(str)) {
            return true;
        }
        HwLog.d(TAG, "is not in whiteList");
        return false;
    }

    public static void setDefaultCeLabel(File file) {
        if (file == null) {
            return;
        }
        String path = file.getPath();
        if (wantLabelPath(path)) {
            setLabel(convertPath(path), LABEL_VALUE_S2, 0);
        }
    }
}
