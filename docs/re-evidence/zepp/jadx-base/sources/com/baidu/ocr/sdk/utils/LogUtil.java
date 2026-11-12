package com.baidu.ocr.sdk.utils;

import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.channels.FileChannel;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class LogUtil {
    public static final String D = "D";
    public static final String E = "E";
    public static int FILE_LOG_LEVEL = 16;
    public static final String I = "I";
    public static int LOGCAT_LEVEL = 2;
    public static final String LOG_ENTRY_FORMAT = "[%tF %tT][%s][%s]%s";
    public static final String LOG_FILE_NAME = "ocr_sdk.log";
    public static final int LOG_LEVEL_DEBUG = 2;
    public static final int LOG_LEVEL_ERROR = 16;
    public static final int LOG_LEVEL_INFO = 4;
    public static final int LOG_LEVEL_WARN = 8;
    private static final String LOG_TAG_STRING = "OCR_SDK";
    public static final String TAG = "LogUtil";
    private static final String TAG_COLOMN = ":";
    private static final String TAG_LEFT_BRICK = " [";
    private static final String TAG_RIGHT_BRICK = "]: ";
    public static final String V = "V";
    public static final String W = "W";
    private static FileChannel logFileChannel;
    public static PrintStream logStream;
    public static boolean DEBUG = true;
    public static boolean INFO = true;
    public static boolean WARN = true;
    public static boolean ERROR = true;
    public static boolean initialized = false;

    static {
        init();
    }

    public static void d(String str, String str2) {
        if (DEBUG) {
            String str3 = getFullTag() + ":" + str;
            Log.d(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 2) {
                write(D, str3, str2, null);
            }
        }
    }

    public static void e(String str, String str2) {
        if (ERROR) {
            String str3 = getFullTag() + ":" + str;
            Log.e(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 16) {
                write("E", str3, str2, null);
            }
        }
    }

    private void enableFileLog() {
        FILE_LOG_LEVEL = 2;
    }

    private static FileChannel getFileLock() {
        File sDRootFile;
        if (logFileChannel == null && (sDRootFile = getSDRootFile()) != null) {
            try {
                logFileChannel = new FileOutputStream(new File(sDRootFile, LOG_FILE_NAME)).getChannel();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return logFileChannel;
    }

    private static String getFullTag() {
        return Thread.currentThread().getName();
    }

    public static File getSDRootFile() {
        if (isSdCardAvailable()) {
            return Environment.getExternalStorageDirectory();
        }
        return null;
    }

    public static void i(String str, String str2) {
        if (INFO) {
            String str3 = getFullTag() + ":" + str;
            Log.i(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 4) {
                write(I, str3, str2, null);
            }
        }
    }

    public static synchronized void init() {
        if (initialized) {
            return;
        }
        int i = LOGCAT_LEVEL;
        DEBUG = i <= 2;
        INFO = i <= 4;
        WARN = i <= 8;
        ERROR = i <= 16;
        try {
            File sDRootFile = getSDRootFile();
            if (sDRootFile != null) {
                File file = new File(sDRootFile, LOG_FILE_NAME);
                file.createNewFile();
                Log.d(LOG_TAG_STRING, TAG + " : Log to file : " + file);
                PrintStream printStream = logStream;
                if (printStream != null) {
                    printStream.close();
                }
                logStream = new PrintStream((OutputStream) new FileOutputStream(file, true), true);
                initialized = true;
            }
            logFileChannel = getFileLock();
        } catch (Exception e) {
            Log.e(LOG_TAG_STRING, "init log stream failed", e);
        }
    }

    public static boolean isSdCardAvailable() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static void v(String str, String str2) {
        if (DEBUG) {
            String str3 = getFullTag() + ":" + str;
            Log.v(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 2) {
                write("V", str3, str2, null);
            }
        }
    }

    public static void w(String str, String str2) {
        if (WARN) {
            String str3 = getFullTag() + ":" + str;
            Log.w(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 8) {
                write("W", str3, str2, null);
            }
        }
    }

    private static void write(String str, String str2, String str3, Throwable th) {
        if (!initialized) {
            init();
        }
        PrintStream printStream = logStream;
        if (printStream == null || printStream.checkError()) {
            initialized = false;
            return;
        }
        Date date = new Date();
        logStream.printf(LOG_ENTRY_FORMAT, date, date, str, str2, " []: " + str3);
        logStream.println();
        if (th != null) {
            th.printStackTrace(logStream);
            logStream.println();
        }
    }

    public static void wtf(String str, String str2) {
        if (ERROR) {
            String str3 = getFullTag() + ":" + str;
            Log.wtf(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2);
            if (FILE_LOG_LEVEL <= 16) {
                write("E", str3, str2, null);
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (DEBUG) {
            String str3 = getFullTag() + ":" + str;
            Log.d(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 2) {
                write(D, str3, str2, th);
            }
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (ERROR) {
            String str3 = getFullTag() + ":" + str;
            Log.e(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 16) {
                write("E", str3, str2, th);
            }
        }
    }

    public static void i(String str, String str2, String str3) {
        if (INFO) {
            String str4 = getFullTag() + ":" + str2;
            Log.i(str, str4 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str3);
            if (FILE_LOG_LEVEL <= 4) {
                write(I, str4, str3, null);
            }
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (DEBUG) {
            String str3 = getFullTag() + ":" + str;
            Log.v(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 2) {
                write("V", str3, str2, th);
            }
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (WARN) {
            String str3 = getFullTag() + ":" + str;
            Log.w(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 8) {
                write("W", str3, str2, th);
            }
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (ERROR) {
            String str3 = getFullTag() + ":" + str;
            Log.wtf(LOG_TAG_STRING, str3 + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 16) {
                write("E", str3, str2, th);
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (INFO) {
            String str3 = getFullTag() + ":" + str;
            Log.i(LOG_TAG_STRING, str + TAG_LEFT_BRICK + TAG_RIGHT_BRICK + str2, th);
            if (FILE_LOG_LEVEL <= 4) {
                write(I, str3, str2, th);
            }
        }
    }
}
