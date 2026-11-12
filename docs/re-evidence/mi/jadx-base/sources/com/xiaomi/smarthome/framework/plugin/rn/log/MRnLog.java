package com.xiaomi.smarthome.framework.plugin.rn.log;

import android.util.Log;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public class MRnLog {
    private static int sLogLevel;
    private static IRnLog sLogger = new MijiaAndroidLog();

    public static class AndroidLog implements IRnLog {
        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int d(String str, String str2) {
            return Log.d(str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int e(String str, String str2) {
            return Log.e(str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int i(String str, String str2) {
            return Log.i(str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int v(String str, String str2) {
            return Log.v(str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, String str2) {
            return Log.w(str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int writeLog(int i, String str, String str2) {
            return Log.println(i, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int d(String str, String str2, Throwable th) {
            return Log.d(str, str2, th);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int e(String str, String str2, Throwable th) {
            return Log.e(str, str2, th);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int i(String str, String str2, Throwable th) {
            return Log.i(str, str2, th);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int v(String str, String str2, Throwable th) {
            return Log.v(str, str2, th);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, String str2, Throwable th) {
            return Log.w(str, str2, th);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, Throwable th) {
            return Log.w(str, th);
        }
    }

    public static class MijiaAndroidLog extends AndroidLog {
        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int d(String str, String str2) {
            return writeLog(3, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int e(String str, String str2) {
            return writeLog(6, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int i(String str, String str2) {
            return writeLog(4, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int v(String str, String str2) {
            return writeLog(2, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, String str2) {
            return writeLog(5, str, str2);
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int writeLog(int i, String str, String str2) {
            RnPluginLog.addFrameworkLog(str, i, str2);
            return 0;
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int d(String str, String str2, Throwable th) {
            return writeLog(3, str, str2 + "\n" + Log.getStackTraceString(th));
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int e(String str, String str2, Throwable th) {
            return writeLog(6, str, str2 + "\n" + Log.getStackTraceString(th));
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int v(String str, String str2, Throwable th) {
            return writeLog(2, str, str2 + "\n" + Log.getStackTraceString(th));
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, String str2, Throwable th) {
            return writeLog(5, str, str2 + "\n" + Log.getStackTraceString(th));
        }

        @Override // com.xiaomi.smarthome.framework.plugin.rn.log.MRnLog.AndroidLog, com.xiaomi.smarthome.framework.plugin.rn.log.IRnLog
        public int w(String str, Throwable th) {
            return writeLog(5, str, Log.getStackTraceString(th));
        }
    }

    static {
        sLogLevel = isDebugVersion() ? 2 : 4;
    }

    public static int d(String str, String str2) {
        if (3 < sLogLevel) {
            return -1;
        }
        return sLogger.d(str, str2);
    }

    public static int e(String str, String str2) {
        if (6 < sLogLevel) {
            return -1;
        }
        return sLogger.e(str, str2);
    }

    public static int i(String str, String str2) {
        if (4 < sLogLevel) {
            return -1;
        }
        return sLogger.i(str, str2);
    }

    public static boolean isDebugVersion() {
        return MiJiaEnvironment.isDebugBuildType() || MiJiaEnvironment.isSdkBuildType() || MiJiaEnvironment.isDevChannel();
    }

    public static void setDefaultLogger(IRnLog iRnLog) {
        if (iRnLog == null) {
            return;
        }
        sLogger = iRnLog;
    }

    public static int v(String str, String str2) {
        if (2 < sLogLevel) {
            return -1;
        }
        return sLogger.v(str, str2);
    }

    public static int w(String str, String str2) {
        if (5 < sLogLevel) {
            return -1;
        }
        return sLogger.w(str, str2);
    }

    public static int writeLog(int i, String str, String str2) {
        return sLogger.writeLog(i, str, str2);
    }

    public static int writeLog(int i, String str, String str2, Throwable th) {
        return sLogger.writeLog(i, str, str2 + "\n" + Log.getStackTraceString(th));
    }

    public static int d(String str, String str2, Throwable th) {
        if (3 < sLogLevel) {
            return -1;
        }
        return sLogger.d(str, str2, th);
    }

    public static int e(String str, String str2, Throwable th) {
        if (6 < sLogLevel) {
            return -1;
        }
        return sLogger.e(str, str2, th);
    }

    public static int v(String str, String str2, Throwable th) {
        if (2 < sLogLevel) {
            return -1;
        }
        return sLogger.v(str, str2, th);
    }

    public static int w(String str, String str2, Throwable th) {
        if (5 < sLogLevel) {
            return -1;
        }
        return sLogger.w(str, str2, th);
    }

    public int i(String str, String str2, Throwable th) {
        if (4 < sLogLevel) {
            return -1;
        }
        return sLogger.i(str, str2, th);
    }

    public static int w(String str, Throwable th) {
        if (5 < sLogLevel) {
            return -1;
        }
        return sLogger.w(str, th);
    }
}
