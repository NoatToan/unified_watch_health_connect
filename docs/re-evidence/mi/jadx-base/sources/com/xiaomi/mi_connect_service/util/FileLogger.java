package com.xiaomi.mi_connect_service.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Base64;
import com.miuipub.internal.hybrid.SignUtils;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes11.dex */
public class FileLogger {
    private static final String AES_KEY_FILE = "dump_file";
    private static final int AES_KEY_LEN = 16;
    private static final String APP_LOG_DIR = "app_log";
    private static final String CRASH_LOG_DIR = "crash_log";
    private static final String ENCRYPTED_LOG_FILE_PREFIX = "encrypted_log_";
    private static final String EXPORTED_FILE_PREFIX = "encrypted_";
    private static final String EXPORT_FLAG_FILE = "export_log";
    private static final String FORMAT_DATE = "MM-dd HH:mm:ss.SSS";
    private static final String FORMAT_EXPORT_LOG_NAME = "yyyyMMddHHmmss";
    private static final String FORMAT_FILE_NAME = "yyyyMMdd";
    private static final String FORMAT_LOG = "%s %d %d %s %s : %s\n";
    private static final int MAX_FILES_CNT = 2;
    private static final int MAX_FILE_SIZE_IN_BYTES = 26214400;
    private static final String MIS_LOG_DIR = "mis_log";
    private static final String MIUI_LOG_DIR = "MIUI/debug_log";
    private static final int MSG_EXPORT_RELEASELOG = 2;
    private static final int MSG_WRITE_APPLOG = 0;
    private static final int MSG_WRITE_CRASHLOG = 1;
    private static final String RELEASE_LOG_DIR = "release_log";
    private static final String TAG = "FileLogger";
    private static final String TEMP_EXPORT_DIR = "temp_exported";
    private static final String WARNING_LOG_SUFFIX = "_0";
    private static final String WARNING_TRACK_SUFFIX = "_log_size_track";
    private static FileLogger sIntance;
    private String mAppLogDir;
    private String mCrashLogDir;
    private String mCurrentAppLogFile;
    private String mFlagFilePath;
    private Handler mHandler;
    private boolean mIsRelease;
    private String mMisLogDir;
    private String mPackageName;
    private int mPid;
    private long mVersionCode;
    private String mVersionName;
    private FileOutputStream mWriter;
    private long mLogSize = -1;
    private boolean mIsInited = false;

    public class CrashInfo {
        Thread thread;
        Throwable tr;

        public CrashInfo(Thread thread, Throwable th) {
            this.thread = thread;
            this.tr = th;
        }
    }

    public class LogHanler extends Handler {
        public LogHanler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws Throwable {
            int i = message.what;
            if (i == 0) {
                FileLogger.this.writeAppLogToFile((LogInfo) message.obj);
            } else if (i == 1) {
                FileLogger.this.doLogCrash((CrashInfo) message.obj);
            } else {
                if (i != 2) {
                    return;
                }
                FileLogger.this.doExportLog((Context) message.obj);
            }
        }
    }

    public class LogInfo {
        long date;
        String msg;
        int pid;
        String priority;
        String tag;
        int tid;
        Throwable tr;

        public LogInfo(int i, int i2, String str, String str2, String str3, long j, Throwable th) {
            this.pid = i;
            this.tid = i2;
            this.priority = str;
            this.tag = str2;
            this.msg = str3;
            this.date = j;
            this.tr = th;
        }

        public String toLogString() {
            String str = new SimpleDateFormat(FileLogger.FORMAT_DATE).format(new Date(this.date));
            StringBuilder sb = new StringBuilder();
            sb.append(String.format(FileLogger.FORMAT_LOG, str, Integer.valueOf(this.pid), Integer.valueOf(this.tid), this.priority, this.tag, this.msg));
            Throwable th = this.tr;
            if (th != null) {
                sb.append(FileLogger.getStackFromThrowable(th));
            }
            return sb.toString();
        }
    }

    private FileLogger() {
    }

    private void checkLogFiles(String str) {
        File file = new File(str);
        File[] fileArrListFiles = file.listFiles(new FileFilter() { // from class: com.xiaomi.mi_connect_service.util.FileLogger.1
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                if (file2.isDirectory()) {
                    return false;
                }
                String name = file2.getName();
                if (name.length() != 8) {
                    return false;
                }
                try {
                    return Integer.parseInt(name) > 0;
                } catch (Exception unused) {
                }
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= 2) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (File file2 : fileArrListFiles) {
            arrayList.add(file2);
        }
        while (arrayList.size() > 2) {
            int i = 0;
            for (int i2 = 1; i2 < arrayList.size(); i2++) {
                if (Integer.parseInt(((File) arrayList.get(i2)).getName()) < Integer.parseInt(((File) arrayList.get(i)).getName())) {
                    i = i2;
                }
            }
            File file3 = (File) arrayList.get(i);
            if (file3.exists() && !file3.delete()) {
                LogUtil.e(TAG, "Deleting " + file3.getName() + " failed.", new Object[0]);
            }
            File file4 = new File(file, file3.getName() + WARNING_LOG_SUFFIX);
            if (file4.exists() && !file4.delete()) {
                LogUtil.e(TAG, "Deleting " + file4.getName() + " failed.", new Object[0]);
            }
            File file5 = new File(file, file3.getName() + WARNING_TRACK_SUFFIX);
            if (file5.exists() && !file5.delete()) {
                LogUtil.e(TAG, "Deleting " + file5.getName() + " failed.", new Object[0]);
            }
            arrayList.remove(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private void checkLogSize(File file, long j) throws Throwable {
        Throwable th;
        FileOutputStream fileOutputStream;
        Exception e;
        long j2 = this.mLogSize;
        if (j2 == -1) {
            this.mLogSize = file.length();
        } else {
            this.mLogSize = j2 + j;
        }
        if (this.mLogSize < 26214400) {
            return;
        }
        File file2 = new File(new File(this.mAppLogDir), file.getName() + WARNING_LOG_SUFFIX);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
            } catch (IOException e2) {
                e2.getMessage();
            }
        }
        file.renameTo(file2);
        this.mCurrentAppLogFile = null;
        this.mLogSize = -1L;
        File file3 = new File(new File(this.mAppLogDir), file.getName() + WARNING_TRACK_SUFFIX);
        if (!file3.exists()) {
            try {
                file3.createNewFile();
            } catch (IOException e3) {
                e3.getMessage();
            }
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3, true);
                try {
                    try {
                        fileOutputStream.write(new LogInfo(this.mPid, Process.myTid(), "W", TAG, "Warning : Log file length is " + this.mLogSize + " bytes, exceeding " + MAX_FILE_SIZE_IN_BYTES + " bytes!", System.currentTimeMillis(), null).toLogString().getBytes());
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e4) {
                        e = e4;
                        e.getMessage();
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.getMessage();
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e6.getMessage();
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doExportLog(Context context) throws Throwable {
        String str;
        String str2 = context.getApplicationInfo().dataDir + "/";
        String str3 = str2 + TEMP_EXPORT_DIR + "/";
        FileUtil.deleteDirectory(str3);
        String str4 = str2 + RELEASE_LOG_DIR;
        if (FileUtil.fileExists(str4)) {
            String str5 = new SimpleDateFormat(FORMAT_EXPORT_LOG_NAME).format(new Date());
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str6 = str3 + AES_KEY_FILE;
            String str7 = str3 + str5 + ".zip";
            String str8 = str3 + this.mPackageName + "." + ENCRYPTED_LOG_FILE_PREFIX + str5 + ".zip";
            if (DeviceUtil.isMiPhone()) {
                str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + MIUI_LOG_DIR + "/common/" + context.getPackageName();
            } else {
                str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/";
            }
            String str9 = str + this.mPackageName + "." + EXPORTED_FILE_PREFIX + str5 + ".zip";
            byte[] bArrGenerateAESKey = generateAESKey();
            exportAESKey(str6, encryptAESKey(loadPubKey(context), bArrGenerateAESKey));
            FileUtil.compress(str4, str7);
            try {
                encryptFile(bArrGenerateAESKey, new FileInputStream(str7), new FileOutputStream(str8));
            } catch (FileNotFoundException e) {
                LogUtil.e(TAG, e.getMessage(), e);
            }
            FileUtil.deleteFile(str7);
            FileUtil.compress(str3, str9);
            FileUtil.deleteDirectory(str3);
            FileUtil.deleteFile(this.mFlagFilePath);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doLogCrash(CrashInfo crashInfo) throws Throwable {
        File andCheckLogFile;
        if (this.mIsInited && (andCheckLogFile = getAndCheckLogFile(this.mCrashLogDir)) != null) {
            Thread thread = crashInfo.thread;
            Throwable th = crashInfo.tr;
            String str = new SimpleDateFormat(FORMAT_DATE).format(new Date());
            FileOutputStream fileOutputStream = null;
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("------------------------ CRASHED: " + this.mPackageName + " ------------------------\n");
                    sb.append("PID: " + this.mPid + "\n");
                    sb.append("TID: " + thread.getId() + " " + thread.getName() + "\n");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("APP VERSIONNAME: ");
                    sb2.append(this.mVersionName);
                    sb2.append("\n");
                    sb.append(sb2.toString());
                    sb.append("APP VERSIONCODE: " + this.mVersionCode + "\n");
                    sb.append("CRASHTIME: " + str + "\n");
                    sb.append("REASON: \n");
                    sb.append(getStackFromThrowable(th));
                    sb.append("\n\n\n");
                    log("E", "CRASH", sb.toString(), null, (int) thread.getId());
                    FileOutputStream fileOutputStream2 = new FileOutputStream(andCheckLogFile, true);
                    try {
                        fileOutputStream2.write(sb.toString().getBytes());
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (FileNotFoundException unused) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            return;
                        }
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream == null) {
                            return;
                        }
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused4) {
                }
            } catch (FileNotFoundException unused5) {
            } catch (IOException unused6) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static byte[] encryptAESKey(String str, byte[] bArr) {
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(SignUtils.KEY_RSA).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
            cipher.init(1, publicKeyGeneratePublic);
            return Base64.encode(cipher.doFinal(bArr), 0);
        } catch (Exception e) {
            LogUtil.e(TAG, e.getMessage(), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x008d A[Catch: IOException -> 0x0051, TRY_ENTER, TRY_LEAVE, TryCatch #5 {IOException -> 0x0051, blocks: (B:27:0x004d, B:53:0x008d), top: B:80:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    private static void encryptFile(byte[] bArr, InputStream inputStream, OutputStream outputStream) throws Throwable {
        CipherOutputStream cipherOutputStream;
        Throwable e;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        CipherOutputStream cipherOutputStream2 = null;
        try {
            try {
                try {
                    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                    cipher.init(1, secretKeySpec);
                    byte[] bArr2 = new byte[1024];
                    cipherOutputStream = new CipherOutputStream(outputStream, cipher);
                    while (true) {
                        try {
                            int i = inputStream.read(bArr2);
                            if (i >= 0) {
                                cipherOutputStream.write(bArr2, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    LogUtil.e(TAG, e2.getMessage(), e2);
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            LogUtil.e(TAG, e.getMessage(), e);
                            if (cipherOutputStream != null) {
                                try {
                                    cipherOutputStream.close();
                                } catch (IOException e4) {
                                    LogUtil.e(TAG, e4.getMessage(), e4);
                                }
                            }
                            if (outputStream != null) {
                                try {
                                    outputStream.close();
                                } catch (IOException e5) {
                                    LogUtil.e(TAG, e5.getMessage(), e5);
                                }
                            }
                            if (inputStream != null) {
                            } else {
                                inputStream.close();
                            }
                        } catch (InvalidKeyException e6) {
                            e = e6;
                            LogUtil.e(TAG, e.getMessage(), e);
                            if (cipherOutputStream != null) {
                                cipherOutputStream.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                            } else {
                                inputStream.close();
                            }
                        } catch (NoSuchAlgorithmException e7) {
                            e = e7;
                            LogUtil.e(TAG, e.getMessage(), e);
                            if (cipherOutputStream != null) {
                                cipherOutputStream.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                            } else {
                                inputStream.close();
                            }
                        } catch (NoSuchPaddingException e8) {
                            e = e8;
                            LogUtil.e(TAG, e.getMessage(), e);
                            if (cipherOutputStream != null) {
                                cipherOutputStream.close();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream != null) {
                            } else {
                                inputStream.close();
                            }
                        }
                    }
                    cipherOutputStream.close();
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (IOException e9) {
                            LogUtil.e(TAG, e9.getMessage(), e9);
                        }
                    }
                    inputStream.close();
                } catch (IOException e10) {
                    LogUtil.e(TAG, e10.getMessage(), e10);
                }
            } catch (IOException e11) {
                e = e11;
                cipherOutputStream = null;
                e = e;
                LogUtil.e(TAG, e.getMessage(), e);
                if (cipherOutputStream != null) {
                    cipherOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (InvalidKeyException e12) {
                e = e12;
                cipherOutputStream = null;
                e = e;
                LogUtil.e(TAG, e.getMessage(), e);
                if (cipherOutputStream != null) {
                    cipherOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (NoSuchAlgorithmException e13) {
                e = e13;
                cipherOutputStream = null;
                e = e;
                LogUtil.e(TAG, e.getMessage(), e);
                if (cipherOutputStream != null) {
                    cipherOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (NoSuchPaddingException e14) {
                e = e14;
                cipherOutputStream = null;
                e = e;
                LogUtil.e(TAG, e.getMessage(), e);
                if (cipherOutputStream != null) {
                    cipherOutputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    try {
                        cipherOutputStream2.close();
                    } catch (IOException e15) {
                        LogUtil.e(TAG, e15.getMessage(), e15);
                    }
                }
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException e16) {
                        LogUtil.e(TAG, e16.getMessage(), e16);
                    }
                }
                if (inputStream == null) {
                    throw th;
                }
                try {
                    inputStream.close();
                    throw th;
                } catch (IOException e17) {
                    LogUtil.e(TAG, e17.getMessage(), e17);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void exportAESKey(String str, byte[] bArr) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException e) {
            LogUtil.e(TAG, e.getMessage(), e);
        }
    }

    private static byte[] generateAESKey() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    private File getAndCheckLogFile(String str) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, new SimpleDateFormat("yyyyMMdd").format(new Date()));
        if (!file2.exists()) {
            checkLogFiles(str);
            try {
                if (file2.createNewFile()) {
                    return file2;
                }
            } catch (IOException unused) {
            }
        } else if (!file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    private String getDebugRootDir(Context context) {
        if (DeviceUtil.isMiPhone()) {
            return Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + MIUI_LOG_DIR + "/common/" + context.getPackageName();
        }
        if (!DeviceUtil.isMiTv()) {
            return new File(context.getCacheDir(), "debug_log").getAbsolutePath();
        }
        if (new File("/data/log/").exists()) {
            return "/data/log/" + context.getPackageName();
        }
        return context.getFilesDir().getAbsolutePath() + "/log/";
    }

    public static final FileLogger getInstance() {
        synchronized (FileLogger.class) {
            try {
                if (sIntance == null) {
                    sIntance = new FileLogger();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sIntance;
    }

    private String getReleaseRootDir(Context context) {
        return context.getApplicationInfo().dataDir + "/" + RELEASE_LOG_DIR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getStackFromThrowable(Throwable th) {
        if (th == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringWriter stringWriter = new StringWriter();
        try {
            th.printStackTrace(new PrintWriter(stringWriter));
            sb.append(stringWriter.toString());
            return sb.toString();
        } finally {
            try {
                stringWriter.close();
            } catch (IOException unused) {
            }
        }
    }

    private static String loadPubKey(Context context) {
        return FileUtil.loadFileFromAsset(context, "log_pub_key").replaceAll("\\n", "").replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void writeAppLogToFile(LogInfo logInfo) throws Throwable {
        File andCheckLogFile = getAndCheckLogFile(this.mAppLogDir);
        if (andCheckLogFile == null) {
            return;
        }
        try {
            String str = this.mCurrentAppLogFile;
            if (str == null || !str.equals(andCheckLogFile.getName())) {
                this.mCurrentAppLogFile = andCheckLogFile.getName();
                FileOutputStream fileOutputStream = this.mWriter;
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                this.mWriter = new FileOutputStream(andCheckLogFile, true);
            }
            byte[] bytes = logInfo.toLogString().getBytes();
            this.mWriter.write(bytes);
            this.mWriter.flush();
            if (this.mIsRelease) {
                checkLogSize(andCheckLogFile, bytes.length);
            }
        } catch (Exception unused) {
        }
    }

    public boolean checkIfExport() {
        return FileUtil.fileExists(this.mFlagFilePath);
    }

    public void exportLog(Context context) {
        this.mHandler.obtainMessage(2, context).sendToTarget();
    }

    public String getMisLogFilePath() {
        File andCheckLogFile = getAndCheckLogFile(this.mMisLogDir);
        if (andCheckLogFile == null) {
            return null;
        }
        return andCheckLogFile.getAbsolutePath();
    }

    public void init(Context context) {
        this.mIsRelease = true;
        String releaseRootDir = getReleaseRootDir(context);
        this.mAppLogDir = releaseRootDir + "/" + APP_LOG_DIR;
        this.mMisLogDir = releaseRootDir + "/" + MIS_LOG_DIR;
        this.mCrashLogDir = releaseRootDir + "/" + CRASH_LOG_DIR;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            this.mVersionName = packageInfo.versionName;
            if (Build.VERSION.SDK_INT >= 28) {
                this.mVersionCode = packageInfo.getLongVersionCode();
            } else {
                this.mVersionCode = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
        }
        this.mPid = Process.myPid();
        this.mPackageName = context.getPackageName();
        this.mFlagFilePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + this.mPackageName + "." + EXPORT_FLAG_FILE;
        HandlerThread handlerThread = new HandlerThread(TAG);
        handlerThread.start();
        this.mHandler = new LogHanler(handlerThread.getLooper());
        this.mIsInited = true;
    }

    public void log(String str, String str2, String str3, Throwable th) {
        log(str, str2, str3, th, Process.myTid());
    }

    public void logCrash(Thread thread, Throwable th) {
        this.mHandler.obtainMessage(1, new CrashInfo(thread, th)).sendToTarget();
    }

    private void log(String str, String str2, String str3, Throwable th, int i) {
        if (this.mIsInited) {
            this.mHandler.obtainMessage(0, new LogInfo(this.mPid, i, str, str2, str3, System.currentTimeMillis(), th)).sendToTarget();
        }
    }
}
