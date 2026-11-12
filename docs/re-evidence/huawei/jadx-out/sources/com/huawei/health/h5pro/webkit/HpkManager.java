package com.huawei.health.h5pro.webkit;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.health.h5pro.utils.EnvironmentHelper;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import defpackage.exw;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class HpkManager {
    public static final HpkManager e = new HpkManager();

    private HpkManager() {
    }

    public String getRootDir(Context context) {
        File externalFilesDir;
        if (WebKitUtil.b()) {
            externalFilesDir = context.getFilesDir();
        } else {
            externalFilesDir = context.getExternalFilesDir("");
        }
        File file = new File(externalFilesDir, "h5pro");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public String getH5WorkPath(Context context, String str) {
        return String.format(Locale.ENGLISH, "%s/%s", getRootDir(context), str);
    }

    public String getInstallPath(Context context, String str) throws FileNotFoundException {
        return String.format(Locale.ENGLISH, "%s/%s", getH5WorkPath(context, str), getInstallDirNamePrefix(a(context, str)) + EnvironmentHelper.getInstance().getUserFlag());
    }

    public String getInstallDirNamePrefix(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int length = str.length();
        return str.substring(length < 10 ? 0 : length - 10, length < 10 ? Math.min(length, 7) : length - 3);
    }

    public String getVersionFileName(String str) {
        return String.format(Locale.ENGLISH, "%s-version.json", str);
    }

    public String getHpkFileName(String str) {
        return String.format(Locale.ENGLISH, "%s.hpk", str);
    }

    public String getInstalledFileName(String str) {
        return String.format(Locale.ENGLISH, "%s.installed", str);
    }

    public String getInstalledFilePath(Context context, String str) {
        return String.format(Locale.ENGLISH, "%s/%s", getH5WorkPath(context, str), getInstalledFileName(str));
    }

    public String getManifestFilePath(Context context, String str) throws FileNotFoundException {
        return String.format(Locale.ENGLISH, "%s/manifest.json", getInstallPath(context, str));
    }

    public String getHpkFilePath(Context context, String str) {
        return String.format(Locale.ENGLISH, "%s/%s", getH5WorkPath(context, str), getHpkFileName(str));
    }

    public String getVersionFilePath(Context context, String str) {
        return String.format(Locale.ENGLISH, "%s/%s", getH5WorkPath(context, str), getVersionFileName(str));
    }

    public String getInitFilePath(Context context, String str) {
        return String.format(Locale.ENGLISH, "%s/%s/init.em", getRootDir(context), str);
    }

    private String a(Context context, String str) throws FileNotFoundException {
        File file = new File(getInitFilePath(context, str));
        if (!file.exists()) {
            throw new FileNotFoundException("init.em not created!");
        }
        return String.valueOf(file.lastModified());
    }

    public boolean isInstalled(Context context, String str) {
        if (!new File(getInstalledFilePath(context, str)).exists()) {
            return false;
        }
        try {
            return new File(getInstallPath(context, str)).exists();
        } catch (FileNotFoundException e2) {
            LogUtil.e("H5PRO_HpkManager", "isInstalled: installDir exist -> " + e2.getMessage());
            return false;
        }
    }

    public String getBaseUrl(String str) {
        return String.format(Locale.ENGLISH, "%s%s/", EnvironmentHelper.getInstance().getUrl(str), str);
    }

    public String getHpkDownloadUrl(String str, String str2) {
        return String.format(Locale.ENGLISH, "%s%s-%s.hpk", getBaseUrl(str), str, str2);
    }

    public String getVersionDownloadUrl(String str) {
        return String.format(Locale.ENGLISH, "%s%s-version.json", getBaseUrl(str), str);
    }

    public boolean hasNewVersion(Context context, String str) {
        if (!isInstalled(context, str)) {
            return true;
        }
        try {
            String versionFilePath = getVersionFilePath(context, str);
            String fileContent = FileDownloadManager.readFileContent(context, getInstalledFilePath(context, str));
            if (!GeneralUtil.isNumbers(fileContent) || System.currentTimeMillis() - Long.parseLong(fileContent) > 60000) {
                FileDownloadManager.download(getVersionDownloadUrl(str), new File(versionFilePath), new FileDownloadManager.DownloadCallback() { // from class: com.huawei.health.h5pro.webkit.HpkManager.5
                    @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                    public void onSuccess(File file) {
                        LogUtil.i("H5PRO_HpkManager", "hasNewVersion: onSuccess");
                    }

                    @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                    public void onFailure(int i, String str2) {
                        LogUtil.w("H5PRO_HpkManager", String.format(Locale.ENGLISH, "hasNewVersion(onFailure): %d -> %s", Integer.valueOf(i), str2));
                    }
                });
            }
            return versionCompare(new JSONObject(FileDownloadManager.readFileContent(context, getManifestFilePath(context, str))).optString("version"), new JSONObject(FileDownloadManager.readFileContent(context, versionFilePath)).optString("latest")) != 0;
        } catch (exw | FileNotFoundException | NumberFormatException | JSONException e2) {
            LogUtil.e("H5PRO_HpkManager", "hasNewVersion: exception -> " + e2.getMessage());
            return false;
        }
    }

    public int versionCompare(String str, String str2) throws exw {
        if (!versionMatches(str)) {
            LogUtil.w("H5PRO_HpkManager", String.format(Locale.ENGLISH, "versionCompare: invalid version1: %s", str));
            throw new exw(str);
        }
        if (!versionMatches(str2)) {
            LogUtil.w("H5PRO_HpkManager", String.format(Locale.ENGLISH, "versionCompare: invalid version2: %s", str2));
            throw new exw(str2);
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int iCompare = 0;
        for (int i = 0; i < iMin; i++) {
            String str3 = strArrSplit[i];
            String str4 = strArrSplit2[i];
            if (str3.length() == str4.length()) {
                iCompare = str3.compareTo(str4);
            } else {
                iCompare = Integer.compare(str3.length(), str4.length());
            }
            if (iCompare != 0) {
                break;
            }
        }
        return (iCompare != 0 || strArrSplit.length == strArrSplit2.length) ? iCompare : Integer.compare(strArrSplit.length, strArrSplit2.length);
    }

    public boolean versionMatches(String str) {
        return !TextUtils.isEmpty(str) && str.matches("[0-9]+(\\.[0-9]+)*");
    }

    public boolean isDownloadedHpk(Context context, String str) {
        if (context == null) {
            LogUtil.w("H5PRO_HpkManager", "isDownloadedHpk: context is null");
            return false;
        }
        return FileDownloadManager.exists(getHpkFilePath(context, str));
    }

    public void updateInstalledFile(Context context, String str) throws IOException {
        if (context == null) {
            LogUtil.w("H5PRO_HpkManager", "updateInstalledFile: context is null");
            return;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(getInstalledFilePath(context, str));
        try {
            String json = new InstalledMeta(new Date().getTime(), EnvironmentHelper.getInstance().getBuildType()).toJson();
            if (!TextUtils.isEmpty(json)) {
                fileOutputStream.write(json.getBytes(StandardCharsets.UTF_8));
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public boolean installDownloadedHpk(Context context, String str) {
        if (context == null) {
            LogUtil.w("H5PRO_HpkManager", "installDownloadedHpk: context is null");
            return false;
        }
        FileDownloadManager.deleteFiles(getInstalledFilePath(context, str), false);
        try {
            String canonicalPath = new File(getInstallPath(context, str)).getCanonicalPath();
            FileDownloadManager.deleteFiles(canonicalPath, false);
            return c(context, str, canonicalPath, new File(getHpkFilePath(context, str)).getCanonicalPath());
        } catch (IOException e2) {
            LogUtil.w("H5PRO_HpkManager", "installDownloadedHpk: ioException -> " + e2.getMessage());
            return false;
        }
    }

    private boolean c(Context context, String str, String str2, String str3) {
        try {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str3));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry == null) {
                        LogUtil.w("H5PRO_HpkManager", "unzipHpk: the hpk file is damaged");
                        zipInputStream.close();
                        FileDownloadManager.deleteFiles(str3, false);
                        return false;
                    }
                    do {
                        File file = new File(str2, nextEntry.getName());
                        String canonicalPath = file.getCanonicalPath();
                        if (!canonicalPath.startsWith(str2 + File.separator)) {
                            LogUtil.w("H5PRO_HpkManager", "unzipHpk: invalid path -> " + canonicalPath);
                            FileDownloadManager.deleteFiles(str3, false);
                            zipInputStream.close();
                            FileDownloadManager.deleteFiles(str3, false);
                            return false;
                        }
                        File parentFile = nextEntry.isDirectory() ? file : file.getParentFile();
                        if (parentFile == null) {
                            LogUtil.w("H5PRO_HpkManager", "unzipHpk: destFileDir is null");
                            zipInputStream.close();
                            FileDownloadManager.deleteFiles(str3, false);
                            return false;
                        }
                        if (!parentFile.exists() && !parentFile.mkdirs()) {
                            LogUtil.w("H5PRO_HpkManager", "unzipHpk: failed to make dir -> " + parentFile.getAbsolutePath());
                            zipInputStream.close();
                            FileDownloadManager.deleteFiles(str3, false);
                            return false;
                        }
                        if (!nextEntry.isDirectory()) {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i = zipInputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                    try {
                                        zipInputStream.close();
                                    } catch (Throwable th) {
                                        th.addSuppressed(th);
                                    }
                                    throw th;
                                }
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    fileOutputStream.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        }
                        nextEntry = zipInputStream.getNextEntry();
                    } while (nextEntry != null);
                    updateInstalledFile(context, str);
                    zipInputStream.close();
                    FileDownloadManager.deleteFiles(str3, false);
                    return true;
                } catch (Throwable th4) {
                    zipInputStream.close();
                    throw th4;
                }
            } catch (IOException e2) {
                LogUtil.w("H5PRO_HpkManager", "unzipHpk: ioException -> " + e2.getMessage());
                FileDownloadManager.deleteFiles(str3, false);
                return false;
            }
        } catch (Throwable th5) {
            FileDownloadManager.deleteFiles(str3, false);
            throw th5;
        }
    }

    public boolean isAsyncUpgradeHpk(Context context, String str) {
        if (EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.RELEASE) {
            return false;
        }
        LogUtil.i("H5PRO_HpkManager", true, "[RELEASE]isAsyncUpgradeHpk: not release");
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_HpkManager", "isAsyncUpgradeHpk: context or packageName is null");
            return false;
        }
        int i = context.getSharedPreferences("H5ProHpkManager", 0).getInt("upgrade_flag_" + str, 0);
        int hostAppVersionCode = GeneralUtil.getHostAppVersionCode(context);
        return hostAppVersionCode > 0 && hostAppVersionCode == i;
    }

    public void setAsyncUpgradeHpkFlag(Context context, String str) {
        if (EnvironmentHelper.getInstance().getBuildType() == EnvironmentHelper.BuildType.RELEASE) {
            return;
        }
        LogUtil.i("H5PRO_HpkManager", true, "[RELEASE]setAsyncUpgradeHpkFlag: not release");
        if (context == null || TextUtils.isEmpty(str)) {
            LogUtil.w("H5PRO_HpkManager", "setAsyncUpgradeHpkFlag: context or packageName is null");
            return;
        }
        int hostAppVersionCode = GeneralUtil.getHostAppVersionCode(context);
        if (hostAppVersionCode <= 0) {
            LogUtil.w("H5PRO_HpkManager", "setAsyncUpgradeHpkFlag: currentHostAppVersionCode -> " + hostAppVersionCode);
        } else {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("H5ProHpkManager", 0).edit();
            editorEdit.putInt("upgrade_flag_" + str, hostAppVersionCode);
            editorEdit.apply();
        }
    }
}
