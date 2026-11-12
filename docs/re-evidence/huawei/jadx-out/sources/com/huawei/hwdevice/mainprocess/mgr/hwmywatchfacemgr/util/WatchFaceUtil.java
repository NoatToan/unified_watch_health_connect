package com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.healthcloud.PackageInfoResponse;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import com.huawei.watchface.mvp.model.latona.provider.WatchFaceProvider;
import com.huawei.watchface.utils.ArrayUtils;
import defpackage.ecu;
import defpackage.eey;
import defpackage.fek;
import defpackage.mca;
import defpackage.mga;
import defpackage.ohc;
import defpackage.xjt;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.GRSManager;
import health.compact.a.HEXUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class WatchFaceUtil {
    private static final String ALGORITHM_SHA256 = "SHA-256";
    private static final String CLASS_NAME_OF_HANDOFF_SDK = "ohc";
    private static final int CONVERT_RADIX_HEX = 16;
    private static final int INT_BIT_FIRST = 2;
    private static final String MOVE_BACKGROUND_DIR_KEY = "remove_background_dir";
    private static final String MY_WATCH_FACE_MODULE_ID = "my_watch_face";
    private static final String TAG = "WatchFaceUtil";
    private static final String TAG_RELEASE = "DEVMGR_WatchFaceUtil";

    private WatchFaceUtil() {
    }

    public static String joinUrl(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        if (str.endsWith("/")) {
            str = str.substring(0, str.length() - 1);
        }
        if (str2.startsWith("/")) {
            str2 = str2.substring(1, str.length());
        }
        return str + "/" + str2;
    }

    public static List<String> asciiNumToStringList(List<Integer> list) {
        if (CollectionUtils.a(list)) {
            return new ArrayList(16);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb.append((char) it.next().intValue());
        }
        return new ArrayList(Arrays.asList(sb.toString().split(",")));
    }

    public static String asciiNumToString(List<Integer> list) {
        if (CollectionUtils.a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb.append((char) it.next().intValue());
        }
        return sb.toString();
    }

    public static String hexListToName(List<Integer> list) {
        if (CollectionUtils.a(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            sb.append(Integer.toHexString(it.next().intValue()));
        }
        return HEXUtils.b(sb.toString().toUpperCase(Locale.ENGLISH));
    }

    public static List<Integer> hexToIntList(String str) {
        ArrayList arrayList = new ArrayList(16);
        if (!TextUtils.isEmpty(str)) {
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 2;
                arrayList.add(Integer.valueOf(CommonUtil.b(str.substring(i, i2), 16)));
                i = i2;
            }
        }
        return arrayList;
    }

    public static String makeWatchFacePackage(File file) {
        String str = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_PATH;
        String str2 = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_PACK_PATH;
        boolean zCreateFileDir = createFileDir(str);
        File file2 = new File(file.getPath().replace(WatchFaceConstant.HWT_SUFFIX, ".zip"));
        boolean zRenameTo = file.renameTo(file2);
        if (!zCreateFileDir || !zRenameTo) {
            LogUtil.j(TAG, "makeWatchFacePackage err");
        }
        if (fek.a(file2.getPath(), str) == -1) {
            xjt.aq("makeWatchFacePackage unzip watch face package fail");
        }
        return str2;
    }

    public static String makeWatchFaceBinFile(String str) {
        String str2 = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_PACK_DE_PATH;
        String str3 = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_BIN_PATH;
        if (!createFileDir(str2)) {
            LogUtil.j(TAG, "makeWatchFaceBinFile err");
        }
        int iA = fek.a(str, str2);
        if (iA != -1) {
            return iA == 0 ? str : str3;
        }
        xjt.aq("makeWatchFaceBinFile unzip watch face bin file fail");
        return str3;
    }

    public static boolean createFileDir(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        if (file.exists()) {
            return true;
        }
        return file.mkdirs();
    }

    public static int getFileSize(String str) {
        return (int) new File(str).length();
    }

    public static boolean checkForUpdate(String str, String str2) {
        if (Objects.equals(str, str2)) {
            return false;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int i = 0;
        while (i < Math.max(strArrSplit.length, strArrSplit2.length)) {
            int i2 = i < strArrSplit.length ? Integer.parseInt(strArrSplit[i]) : 0;
            int i3 = i < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i]) : 0;
            if (i2 < i3) {
                return true;
            }
            if (i2 > i3) {
                return false;
            }
            i++;
        }
        return false;
    }

    public static String bitmapToBase64Encode(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public static boolean checkObjectIsNull(String str, Object... objArr) {
        if (objArr == null) {
            LogUtil.j(TAG, "checkObjectIsNull objects is null");
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static File getFile(String str) {
        String strC = CommonUtil.c(str);
        if (strC == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "filePath is null");
            return null;
        }
        return new File(strC);
    }

    public static String getFileDirPath(String str) {
        File file = getFile(str);
        if (file == null) {
            ReleaseLogUtil.e(TAG_RELEASE, "getFileDirPath file is null");
            return "";
        }
        if (!file.exists()) {
            boolean zMkdirs = file.mkdirs();
            ReleaseLogUtil.d(TAG_RELEASE, "getFileDirPath isMkdirs :", Boolean.valueOf(zMkdirs));
            if (!zMkdirs) {
                return "";
            }
        }
        return str;
    }

    public static void copyResources(String str, File file) throws IOException {
        File file2 = getFile(str);
        if (file2 == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "copyResources sourceFiles null");
            return;
        }
        if (!file2.exists()) {
            ReleaseLogUtil.d(TAG_RELEASE, "copyResources sourceFiles not exists");
            return;
        }
        if (!file2.isDirectory()) {
            ReleaseLogUtil.d(TAG_RELEASE, "copyResources sourceFiles not Directory");
            return;
        }
        String[] list = file2.list();
        if (CollectionUtils.d(list)) {
            ReleaseLogUtil.d(TAG_RELEASE, "copyResources list isEmpty");
            return;
        }
        for (String str2 : list) {
            FileUtils.e(new File(str, str2), new File(file, str2));
        }
        ReleaseLogUtil.d(TAG_RELEASE, "copyResources sourceFiles null");
    }

    public static void deleteOrRetainBgFile(File file, List<String> list, boolean z) {
        boolean z2;
        if (CollectionUtils.a(list)) {
            if (z) {
                ReleaseLogUtil.d(TAG_RELEASE, "deleteOrRetainBgFile delete all");
                FileUtils.d(file);
                return;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (CollectionUtils.d(fileArrListFiles)) {
            ReleaseLogUtil.d(TAG_RELEASE, "deleteOrRetainBgFile files is empty");
            return;
        }
        for (File file2 : fileArrListFiles) {
            String name = file2.getName();
            if (!name.startsWith(WatchFaceConstant.PRESET_RES)) {
                Iterator<String> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z2 = z;
                        break;
                    }
                    String next = it.next();
                    String strSubstring = next.contains(".") ? next.substring(0, next.indexOf(".")) : next;
                    if (strSubstring.contains("_")) {
                        strSubstring = next.substring(0, next.indexOf("_"));
                    }
                    LogUtil.d(TAG, "deleteOrRetainBgFile filePrefix:", strSubstring, ", name:", name);
                    if (name.startsWith(strSubstring)) {
                        z2 = !z;
                        break;
                    }
                }
                if (z2) {
                    FileUtils.e(file2);
                }
            }
        }
    }

    public static void copyDirectory(File file, File file2) throws IOException {
        if (file.exists() && file.isDirectory()) {
            if (!file2.exists() && !file2.mkdirs()) {
                LogUtil.a(TAG, "copyAndDeleteDir make destDir fail:", file2.getName());
                return;
            }
            LogUtil.a(TAG, "copyDirectory:", file.getAbsolutePath(), " to ", file2.getAbsolutePath());
            if (Objects.equals(file.getAbsolutePath(), file2.getAbsolutePath())) {
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (ArrayUtils.isEmpty(fileArrListFiles)) {
                return;
            }
            for (File file3 : fileArrListFiles) {
                File file4 = new File(file2, file3.getName());
                if (file3.isDirectory()) {
                    copyDirectory(file3, file4);
                } else {
                    FileUtils.e(file3, file4);
                }
            }
        }
    }

    public static void copyAndDeleteDir(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LogUtil.a(TAG, "copyAndDeleteDir srcDir not exist:", str);
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (ArrayUtils.isEmpty(fileArrListFiles)) {
            LogUtil.a(TAG, "copyAndDeleteDir files is empty", str);
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                copyDirectory(file2, new File(str2, file2.getName()));
                FileUtils.d(file2);
            }
        }
    }

    public static void deleteWatchFaceAlbumBackgroundDir() {
        LogUtil.a(TAG, "deleteWatchFaceAlbumBackgroundDir enter");
        if (SharedPreferenceManager.b(MY_WATCH_FACE_MODULE_ID, MOVE_BACKGROUND_DIR_KEY, false)) {
            LogUtil.a(TAG, "deleteWatchFaceAlbumBackgroundDir dirs already moved");
        } else {
            ThreadPoolManager.d(1, 1).a(TAG, new Runnable() { // from class: com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        String canonicalPath = BaseApplication.b().getFilesDir().getCanonicalPath();
                        String str = File.separator + "watchfacePhoto" + File.separator;
                        WatchFaceUtil.copyAndDeleteDir((canonicalPath + str) + WatchFaceProvider.BACKGROUND_LABEL + File.separator, (canonicalPath + File.separator + "myWatchFace" + File.separator + str) + WatchFaceProvider.BACKGROUND_LABEL + File.separator);
                        SharedPreferenceManager.a(WatchFaceUtil.MY_WATCH_FACE_MODULE_ID, WatchFaceUtil.MOVE_BACKGROUND_DIR_KEY, true);
                    } catch (Exception e) {
                        LogUtil.e(WatchFaceUtil.TAG, "deleteWatchFaceAlbumBackgroundDir Exception:", ExceptionUtils.c(e));
                    }
                }
            });
        }
    }

    public static boolean isSupportMyWatch(DeviceInfo deviceInfo) {
        boolean z = false;
        if (deviceInfo == null) {
            return false;
        }
        if (eey.d(deviceInfo, 224) && !Utils.k()) {
            z = true;
        }
        ReleaseLogUtil.d(TAG, "isSupportMyWatch is, ", Boolean.valueOf(z));
        return z;
    }

    public static boolean isSupportMyWatch() {
        return isSupportMyWatch(ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, TAG));
    }

    public static boolean isSupportWatchFaceMarket() {
        Map<String, String> mapE = mca.e(GRSManager.c(com.huawei.hwcommonmodel.application.BaseApplication.getContext()).d());
        boolean z = (TextUtils.isEmpty(mapE.get("watchFaceH5")) || TextUtils.isEmpty(mapE.get("watchFace"))) ? false : true;
        ReleaseLogUtil.d(TAG_RELEASE, "isSupportWatchFaceMarket is, ", Boolean.valueOf(z));
        return z;
    }

    public static String generateSyncPackage(File file, PackageInfoResponse.PackageInfo packageInfo) {
        LogUtil.a(TAG, "generateSyncPackage enter");
        String strMakeWatchFacePackage = makeWatchFacePackage(file);
        String strMakeWatchFaceBinFile = makeWatchFaceBinFile(strMakeWatchFacePackage);
        try {
            String str = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_SYNC_PACKAGE_PATH;
            if (mergeToSyncFileDisk(packageInfo.getWatchFaceId(), packageInfo.getVersion(), str, strMakeWatchFacePackage, strMakeWatchFaceBinFile)) {
                return str;
            }
            ReleaseLogUtil.e(TAG_RELEASE, "generateSyncPackage file data error");
            return "";
        } catch (IOException e) {
            ReleaseLogUtil.e(TAG_RELEASE, "generateSyncPackage error:", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String generateFileToSend(DeviceInfo deviceInfo, File file) {
        LogUtil.a(TAG, "generateFileToSend enter");
        String strMakeWatchFacePackage = makeWatchFacePackage(file);
        return (mga.b(deviceInfo) && deviceInfo.getPowerSaveModel() == 0) ? strMakeWatchFacePackage : makeWatchFaceBinFile(strMakeWatchFacePackage);
    }

    public static boolean isNeedSyncWatchFace(WatchFaceParamsResult watchFaceParamsResult, PackageInfoResponse.PackageInfo packageInfo) {
        LogUtil.a(TAG, "isNeedSyncWatchFace enter");
        String version = packageInfo.getVersion();
        if (TextUtils.isEmpty(version)) {
            LogUtil.a(TAG, "isSupportSync version is empty");
            return false;
        }
        String[] strArrSplit = version.split("\\.");
        if (strArrSplit.length < 1 || Integer.parseInt(strArrSplit[0]) < 2) {
            LogUtil.a(TAG, "isSupportSync isVersionTwo: false");
            return false;
        }
        int supportSync = watchFaceParamsResult.getSupportSync();
        int currentMode = watchFaceParamsResult.getCurrentMode();
        if (supportSync == 1 && currentMode == 0) {
            LogUtil.a(TAG, "isSupportSync true");
            return true;
        }
        LogUtil.a(TAG, "isSupportSync false");
        return false;
    }

    private static boolean mergeToSyncFileDisk(String str, String str2, String str3, String... strArr) throws Throwable {
        LogUtil.a(TAG, "mergeToSyncFileDisk enter");
        int length = strArr.length * 30;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 4);
        String str4 = BaseApplication.b().getFilesDir() + WatchFaceConstant.WATCH_FACE_SYNC_PACKAGE_HEADER_PATH;
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.put((byte) strArr.length);
        byteBufferAllocate.putShort((short) 0);
        int i = 0;
        for (String str5 : strArr) {
            int fileSize = getFileSize(str5);
            byteBufferAllocate.putInt(length + 5 + i);
            byteBufferAllocate.putInt(fileSize);
            byteBufferAllocate.put(!str5.endsWith(WatchFaceConstant.BIN_SUFFIX) ? (byte) 1 : (byte) 0);
            byte[] bArrStringToBytes = stringToBytes(str, 11);
            byte[] bArrStringToBytes2 = stringToBytes(str2, 10);
            byteBufferAllocate.put(bArrStringToBytes);
            byteBufferAllocate.put(bArrStringToBytes2);
            i += fileSize;
        }
        byte[] bArrArray = byteBufferAllocate.array();
        byte[] bArrShaEncryptByte = SHA.shaEncryptByte(bArrArray, "SHA-256");
        if (bArrShaEncryptByte == null || bArrShaEncryptByte.length == 0) {
            ReleaseLogUtil.e(TAG_RELEASE, "mergeToSyncFileDisk calc checksum fail");
            return false;
        }
        byte b2 = bArrShaEncryptByte[bArrShaEncryptByte.length - 1];
        LogUtil.a(TAG, "mergeToSyncFileDisk check sum:", Byte.valueOf(b2));
        FileOutputStream fileOutputStream = new FileOutputStream(str4);
        try {
            fileOutputStream.write(bArrArray);
            fileOutputStream.write(b2);
            fileOutputStream.close();
            File file = new File(str3);
            File file2 = new File(str4);
            int length2 = strArr.length + 1;
            File[] fileArr = new File[length2];
            fileArr[0] = file2;
            int i2 = 0;
            while (i2 < strArr.length) {
                int i3 = i2 + 1;
                fileArr[i3] = new File(strArr[i2]);
                i2 = i3;
            }
            FileUtils.b(fileArr, file);
            for (int i4 = 0; i4 < length2; i4++) {
                FileUtils.j(fileArr[i4]);
            }
            return true;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static boolean isPhoneSupportOneHop() {
        PackageManager packageManager = BaseApplication.b().getPackageManager();
        if (packageManager == null) {
            return false;
        }
        boolean zHasSystemFeature = packageManager.hasSystemFeature("android.hardware.nfc");
        LogUtil.a(TAG, "PackageManager isSupportNfc:" + zHasSystemFeature);
        return zHasSystemFeature && isHandoffServiceSupported();
    }

    public static boolean isHandoffServiceSupported() {
        boolean z = false;
        try {
            Class.forName(CLASS_NAME_OF_HANDOFF_SDK);
            String strA = ohc.d().a();
            LogUtil.a(TAG, "HwOneHopSdk versionCodeString :" + strA);
            if (TextUtils.isEmpty(strA)) {
                return false;
            }
            String[] strArrSplit = strA.split("\\.");
            if (strArrSplit.length > 3) {
                z = (CommonUtils.e(strArrSplit[1], 0) != 2 || CommonUtils.e(strArrSplit[2], 0) < 1) ? CommonUtils.e(strArrSplit[1], 0) > 2 : true;
            }
            LogUtil.a(TAG, "isHandoffServiceSupported:" + z);
            return z;
        } catch (ClassNotFoundException unused) {
            LogUtil.e(TAG, "isHandoffServiceSupported can not find HwHandoffSdk");
            return false;
        }
    }

    private static byte[] stringToBytes(String str, int i) {
        byte[] bArr = new byte[i];
        byte[] bytes = str.getBytes();
        System.arraycopy(bytes, 0, bArr, 0, Math.min(i, bytes.length));
        return bArr;
    }
}
