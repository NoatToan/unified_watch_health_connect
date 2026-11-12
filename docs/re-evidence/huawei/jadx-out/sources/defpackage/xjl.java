package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.huawei.android.hicloud.sync.util.FileUtil;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.tencent.mmkv.MMKV;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes20.dex */
public final class xjl {
    public static String b(File file) {
        if (file == null) {
            ReleaseLogUtil.d(FileUtil.TAG, "getCanonicalPath file is null");
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e) {
            ReleaseLogUtil.b(FileUtil.TAG, "getCanonicalPath exception ", ExceptionUtils.c(e));
            return "";
        }
    }

    public static String a() {
        return b(BaseApplication.b().getFilesDir());
    }

    public static String c() {
        return b(BaseApplication.b().getCacheDir());
    }

    private static boolean b(File file, String str, String str2, String str3, boolean z) {
        if (file == null) {
            LogUtil.e(FileUtil.TAG, "isValidPath file is null pathPrefix ", str, " pathSuffix ", str2, " namePrefix ", str3, " isDirectory ", Boolean.valueOf(z));
            return false;
        }
        if (z) {
            if (!file.isDirectory()) {
                LogUtil.e(FileUtil.TAG, "isValidPath isDirectory is false pathPrefix ", str, " pathSuffix ", str2, " namePrefix ", str3, " file ", file);
                return false;
            }
        } else {
            String name = file.getName();
            if (TextUtils.isEmpty(name) || !name.startsWith(str3)) {
                LogUtil.e(FileUtil.TAG, "isValidPath name ", name, " namePrefix ", str3, " pathPrefix ", str, " pathSuffix ", str2, " file ", file);
                return false;
            }
        }
        try {
            String canonicalPath = file.getCanonicalPath();
            if (!TextUtils.isEmpty(canonicalPath) && canonicalPath.startsWith(str) && canonicalPath.endsWith(str2)) {
                return true;
            }
            LogUtil.e(FileUtil.TAG, "isValidPath canonicalPath ", canonicalPath, " pathPrefix ", str, " pathSuffix ", str2, " namePrefix ", str3, " isDirectory ", Boolean.valueOf(z), " file ", file);
            return false;
        } catch (IOException e) {
            ReleaseLogUtil.b(FileUtil.TAG, "isValidPath exception ", ExceptionUtils.c(e));
            return false;
        }
    }

    public static boolean d(File file) {
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d(FileUtil.TAG, "isValidFile appCanonicalPath ", strA);
            return false;
        }
        return a(file, strA);
    }

    public static boolean a(File file, String str) {
        return a(file, str, "");
    }

    public static boolean a(File file, String str, String str2) {
        return b(file, str, str2, "");
    }

    public static boolean b(File file, String str, String str2, String str3) {
        return b(file, str, str2, str3, false);
    }

    public static boolean c(File file, String str) {
        String strA = a();
        if (TextUtils.isEmpty(strA)) {
            ReleaseLogUtil.d(FileUtil.TAG, "isValidFileAndName appCanonicalPath ", strA);
            return false;
        }
        return d(file, strA, str);
    }

    public static boolean d(File file, String str, String str2) {
        return b(file, str, "", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0062: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:30:0x0062 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    public static byte[] a(File file) throws Throwable {
        ?? r0;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3 = null;
        if (file == null) {
            LogUtil.e(FileUtil.TAG, "readFileToByte, file is null");
            return null;
        }
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[256];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i != -1) {
                                byteArrayOutputStream.write(bArr, 0, i);
                            } else {
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                b(fileInputStream);
                                b(byteArrayOutputStream);
                                return byteArray;
                            }
                        }
                    } catch (FileNotFoundException unused) {
                        LogUtil.e(FileUtil.TAG, "readFileToByte, FileNotFoundException:");
                        b(fileInputStream);
                        b(byteArrayOutputStream);
                        return null;
                    } catch (IOException unused2) {
                        LogUtil.e(FileUtil.TAG, "readFileToByte, IOException:");
                        b(fileInputStream);
                        b(byteArrayOutputStream);
                        return null;
                    }
                } catch (FileNotFoundException unused3) {
                    byteArrayOutputStream = null;
                } catch (IOException unused4) {
                    byteArrayOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r0 = 0;
                    fileInputStream3 = fileInputStream;
                    b(fileInputStream3);
                    b((Closeable) r0);
                    throw th;
                }
            } catch (Throwable th2) {
                fileInputStream3 = fileInputStream2;
                r0 = file;
                th = th2;
            }
        } catch (FileNotFoundException unused5) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (IOException unused6) {
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
    }

    private static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                LogUtil.d(FileUtil.TAG, "An exception occurred while closing the 'Closeable' object.");
            }
        }
    }

    public static class c {
        public static void b(final ResponseCallback<int[]> responseCallback) {
            ThreadPoolManager.c().b("FileUtil_AppDataCleaner", new Runnable() { // from class: xjq
                @Override // java.lang.Runnable
                public final void run() {
                    xjl.c.c(responseCallback);
                }
            });
        }

        static /* synthetic */ void c(ResponseCallback responseCallback) {
            int[] iArr = {f(BaseApplication.b()) ? 10 : 11, j(BaseApplication.b()) ? 20 : 21, i(BaseApplication.b()) ? 30 : 31, c(BaseApplication.b()) ? 40 : 41, d(BaseApplication.b()) ? 50 : 51, e(BaseApplication.b()) ? 60 : 61};
            LogUtil.b("FileUtil_AppDataCleaner", "clearAppDataAsync statuses=", iArr);
            if (responseCallback != null) {
                responseCallback.onResponse(d(iArr), iArr);
            }
        }

        public static void b(Context context) {
            boolean zClearApplicationUserData;
            ReleaseLogUtil.b("FileUtil_AppDataCleaner", "enter clearApplicationUserData");
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                zClearApplicationUserData = activityManager.clearApplicationUserData();
                ReleaseLogUtil.b("FileUtil_AppDataCleaner", "clearApplicationUserData:", Boolean.valueOf(zClearApplicationUserData));
            } else {
                zClearApplicationUserData = false;
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put(OpAnalyticsConstants.SYSTEM_CLEAR_USER_DATA_ACTION, String.valueOf(zClearApplicationUserData));
            OpAnalyticsUtil.getInstance().setEventWithReportImmediately(OperationKey.HEALTH_APP_USER_DERIGISTER_SERVICE_2129033.value(), linkedHashMap);
        }

        private static int d(int[] iArr) {
            boolean z = true;
            boolean z2 = false;
            for (int i : iArr) {
                if (i % 2 == 1) {
                    z = false;
                } else {
                    z2 = true;
                }
            }
            if (z) {
                return 200;
            }
            return z2 ? 300 : 400;
        }

        private static boolean f(Context context) {
            return d(context.getCacheDir());
        }

        private static boolean j(Context context) {
            a(context);
            return d(context.getFilesDir());
        }

        private static boolean c(Context context) {
            return d(new File(context.getFilesDir().getParent(), "databases"));
        }

        private static boolean d(Context context) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return d(context.getExternalCacheDir());
            }
            return false;
        }

        private static boolean e(Context context) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return d(context.getExternalFilesDir(null));
            }
            return false;
        }

        private static boolean d(File file) {
            File[] fileArrListFiles;
            if (file == null || !file.exists()) {
                return false;
            }
            if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        d(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return FileUtils.j(file);
        }

        private static boolean i(Context context) {
            try {
                File file = new File(context.getApplicationInfo().dataDir + File.separator + "shared_prefs");
                boolean z = true;
                if (file.exists() && file.isDirectory()) {
                    File[] fileArrListFiles = file.listFiles();
                    if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                        for (File file2 : fileArrListFiles) {
                            if (!d(context, file2)) {
                                z = false;
                            }
                        }
                        return z;
                    }
                    ReleaseLogUtil.c("FileUtil_AppDataCleaner", "No files found in shared_prefs directory");
                    return true;
                }
                ReleaseLogUtil.d("FileUtil_AppDataCleaner", "SharedPrefs directory does not exist or is not a directory: " + file.getPath());
                return true;
            } catch (Exception e) {
                ReleaseLogUtil.b("FileUtil_AppDataCleaner", "Error deleting shared_prefs: " + e.getMessage());
                return false;
            }
        }

        private static boolean d(Context context, File file) {
            if (!file.isFile()) {
                return true;
            }
            a(context, file.getName());
            if (c(file, 3, 100L)) {
                return true;
            }
            ReleaseLogUtil.b("FileUtil_AppDataCleaner", "Failed to delete file after retries: " + file.getPath());
            return false;
        }

        private static void a(Context context, String str) {
            try {
                String strSubstring = str.endsWith(WatchFaceConstant.XML_SUFFIX) ? str.substring(0, str.length() - 4) : str;
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(strSubstring, 0).edit();
                editorEdit.clear();
                editorEdit.commit();
                ReleaseLogUtil.c("FileUtil_AppDataCleaner", "Cleared content of SharedPreferences: " + strSubstring);
            } catch (Exception e) {
                ReleaseLogUtil.b("FileUtil_AppDataCleaner", "Error clearing SharedPreferences content: " + str + ", " + e.getMessage());
            }
        }

        private static boolean a(Context context) {
            MMKV mmkvMmkvWithID;
            ReleaseLogUtil.c("FileUtil_AppDataCleaner", "enter cleanMMKVFiles");
            File file = new File(context.getFilesDir() + File.separator + "mmkv");
            if (!file.exists() || !file.isDirectory()) {
                ReleaseLogUtil.c("FileUtil_AppDataCleaner", "mmkv dir no exists");
                return true;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return file.delete();
            }
            try {
                for (File file2 : fileArrListFiles) {
                    if (!file2.getName().endsWith(".crc") && (mmkvMmkvWithID = MMKV.mmkvWithID(file2.getName())) != null) {
                        ReleaseLogUtil.c("FileUtil_AppDataCleaner", "cleanMMKVFiles mmkvId:", file2.getName());
                        mmkvMmkvWithID.clearAll();
                        mmkvMmkvWithID.clearMemoryCache();
                        mmkvMmkvWithID.close();
                    }
                }
            } catch (Exception e) {
                ReleaseLogUtil.b("FileUtil_AppDataCleaner", "cleanMMKVFiles error:", e);
            }
            for (File file3 : fileArrListFiles) {
                if (!c(file3, 3, 100L)) {
                    ReleaseLogUtil.b("FileUtil_AppDataCleaner", "Failed to delete file: " + file3.getPath());
                    return false;
                }
            }
            return file.delete();
        }

        private static boolean c(File file, int i, long j) {
            for (int i2 = 0; i2 < i; i2++) {
                try {
                    if (file.delete()) {
                        return true;
                    }
                    Thread.sleep(j);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            return false;
        }
    }

    public static String b(Context context, String str) {
        if (context == null) {
            com.huawei.hwlogsmodel.LogUtil.a(FileUtil.TAG, "readTemporaryMotionPath ", "context is null");
            return null;
        }
        try {
            String strC = CommonUtil.c(context.getFilesDir().getCanonicalPath() + File.separator + str);
            if (TextUtils.isEmpty(strC)) {
                LogUtil.e(FileUtil.TAG, "readTemporaryMotionPath savePath is empty");
                return null;
            }
            File file = new File(strC);
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                    try {
                        StringBuffer stringBuffer = new StringBuffer(1024);
                        if (strC.equals(CommonUtil.e(strC)) && file.exists() && xji.b(file, strC)) {
                            stringBuffer.append(e(inputStreamReader));
                            String string = stringBuffer.toString();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return string;
                        }
                        inputStreamReader.close();
                        fileInputStream.close();
                        return null;
                    } catch (Throwable th) {
                        try {
                            inputStreamReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                LogUtil.d(FileUtil.TAG, "fileNotFound");
                return null;
            } catch (IOException e) {
                LogUtil.d(FileUtil.TAG, "readTemporaryMotionPath ", LogAnonymous.b(e));
                return null;
            } catch (IndexOutOfBoundsException e2) {
                LogUtil.d(FileUtil.TAG, "readTemporaryMotionPath ", e2.getMessage());
                return null;
            }
        } catch (IOException e3) {
            LogUtil.d(FileUtil.TAG, LogAnonymous.b(e3));
            return null;
        }
    }

    private static String e(InputStreamReader inputStreamReader) {
        char[] cArr = new char[1024];
        StringBuilder sb = new StringBuilder(1024);
        while (true) {
            try {
                int i = inputStreamReader.read(cArr, 0, 1024);
                if (i == -1) {
                    break;
                }
                sb.append(cArr, 0, i);
            } catch (FileNotFoundException unused) {
                LogUtil.d(FileUtil.TAG, "fileNotFound");
            } catch (IOException e) {
                LogUtil.d(FileUtil.TAG, "read Line Result exception: ", LogAnonymous.b(e));
            }
        }
        return sb.toString();
    }
}
