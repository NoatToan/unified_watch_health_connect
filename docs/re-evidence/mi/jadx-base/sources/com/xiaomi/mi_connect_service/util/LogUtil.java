package com.xiaomi.mi_connect_service.util;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class LogUtil {
    private static final String KEY_ALL = "com.xiaomi.mi_connect_service.log.all";
    private static final String KEY_D = "com.xiaomi.mi_connect_service.log.d";
    private static final String KEY_E = "com.xiaomi.mi_connect_service.log.e";
    private static final String KEY_I = "com.xiaomi.mi_connect_service.log.i";
    private static final String KEY_PREFIX = "com.xiaomi.mi_connect_service.log.";
    private static final String KEY_V = "com.xiaomi.mi_connect_service.log.v";
    private static final String KEY_W = "com.xiaomi.mi_connect_service.log.w";
    private static final String TAG = "LogUtil";
    private static LogSettingsObserver logSettingsObserver;
    private static FileLogger sFileLogger;
    private static final String[] MODULE_TAG_ARRAY = {"MiConnectService", "DiscoveryManager", "AdvertisingManager", "AttributeManager", "RemoteAppClient", "RemoteAppServer", "BonjourGovernor", "BtGovernor", "BleGovernor", "BtClassicGovernor", "NfcGovernor", "WifiGovernor", "DpsGovernor", "AppMgrNative", "BuiltinServiceManager", "IDMNative", "IDMRuntime", "IDMServiceManager", "RegisteredServiceManager", "RemoteServiceManager", "IDMConnectionManager", "ConnectionManager", "Utils", "DispatcherApp"};
    private static SparseArray<LogConfig> sGlobalConfig = new SparseArray<>();
    private static Map<String, LogConfig> sModuleConfig = new HashMap();

    public static class LogSettingsObserver extends ContentObserver {
        private Context context;

        public LogSettingsObserver(Context context) {
            super(new Handler(Looper.getMainLooper()));
            this.context = context;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, Uri uri) {
            super.onChange(z, uri);
            LogUtil.updateConfig(this.context, uri.getLastPathSegment());
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        printLog(3, str, str2, null, objArr);
    }

    public static void e(String str, String str2, Object... objArr) {
        printLog(6, str, str2, null, objArr);
    }

    private static String formatString(String str, Object... objArr) {
        return objArr.length == 0 ? str : String.format(str, objArr);
    }

    private static String getPriorityTag(int i) {
        if (i == 2) {
            return "V";
        }
        if (i == 3) {
            return "D";
        }
        if (i == 4) {
            return "I";
        }
        if (i != 5) {
            return i != 6 ? "U" : "E";
        }
        return "W";
    }

    public static void i(String str, String str2, Object... objArr) {
        printLog(4, str, str2, null, objArr);
    }

    public static void init(Context context) {
        if (!DeviceUtil.isMiTv() || !PropertyUtils.hasProperty("ro.com.google.gmsversion")) {
            FileLogger fileLogger = FileLogger.getInstance();
            sFileLogger = fileLogger;
            fileLogger.init(context);
            if (sFileLogger.checkIfExport()) {
                sFileLogger.exportLog(context);
            }
        }
        initGlobalConfig(context);
        initModuleConfig(context);
        registerSettingsObserver(context);
        i(TAG, "LogUtils init, A new application started", new Object[0]);
    }

    private static void initGlobalConfig(Context context) {
        sGlobalConfig.put(0, new LogConfig("", KEY_ALL, PropertyUtils.settingsGetInt(context, KEY_ALL, 1)));
        sGlobalConfig.put(2, new LogConfig("", KEY_V, PropertyUtils.settingsGetInt(context, KEY_V, 1)));
        sGlobalConfig.put(3, new LogConfig("", KEY_D, PropertyUtils.settingsGetInt(context, KEY_D, 1)));
        sGlobalConfig.put(4, new LogConfig("", KEY_I, PropertyUtils.settingsGetInt(context, KEY_I, 1)));
        sGlobalConfig.put(5, new LogConfig("", KEY_W, PropertyUtils.settingsGetInt(context, KEY_W, 1)));
        sGlobalConfig.put(6, new LogConfig("", KEY_E, PropertyUtils.settingsGetInt(context, KEY_E, 1)));
    }

    private static void initModuleConfig(Context context) {
        for (String str : MODULE_TAG_ARRAY) {
            if (!TextUtils.isEmpty(str)) {
                sModuleConfig.put(str, new LogConfig(str, 1));
            }
        }
        for (LogConfig logConfig : sModuleConfig.values()) {
            logConfig.val = PropertyUtils.settingsGetInt(context, logConfig.key, logConfig.val);
        }
    }

    private static boolean isLoggable(int i, String str) {
        LogConfig logConfig = sGlobalConfig.get(0);
        if (logConfig != null && logConfig.val == 0) {
            return false;
        }
        LogConfig logConfig2 = sGlobalConfig.get(i);
        if (logConfig2 != null && logConfig2.val == 0) {
            return false;
        }
        LogConfig logConfig3 = sModuleConfig.get(str);
        return logConfig3 == null || logConfig3.val != 0;
    }

    private static void printLog(int i, String str, String str2, Throwable th, Object... objArr) {
        boolean z = i <= 4;
        if (TextUtils.isEmpty(str2)) {
            str2 = str2 == null ? AbstractJsonLexerKt.NULL : "empty-notnull";
        }
        if (TextUtils.isEmpty(str)) {
            str = str == null ? "nullTag" : "emptyTag";
        }
        String str3 = String.format("%s%s", "IDM-", str);
        if (isLoggable(i, str3)) {
            String string = formatString(str2, objArr);
            if (!z) {
            }
            FileLogger fileLogger = sFileLogger;
            if (fileLogger != null) {
                fileLogger.log(getPriorityTag(i), str3, string, th);
            }
        }
    }

    private static void registerSettingsObserver(Context context) {
        logSettingsObserver = new LogSettingsObserver(context);
        ContentResolver contentResolver = context.getContentResolver();
        for (int i = 0; i < sGlobalConfig.size(); i++) {
            LogConfig logConfig = sGlobalConfig.get(sGlobalConfig.keyAt(i));
            if (logConfig != null && !TextUtils.isEmpty(logConfig.key)) {
                contentResolver.registerContentObserver(Settings.System.getUriFor(logConfig.key), false, logSettingsObserver);
            }
        }
        Iterator<LogConfig> it = sModuleConfig.values().iterator();
        while (it.hasNext()) {
            contentResolver.registerContentObserver(Settings.System.getUriFor(it.next().key), false, logSettingsObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void updateConfig(Context context, String str) {
        LogConfig logConfig;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int i = 0;
        while (true) {
            if (i >= sGlobalConfig.size()) {
                logConfig = null;
                break;
            }
            logConfig = sGlobalConfig.get(sGlobalConfig.keyAt(i));
            if (logConfig != null && TextUtils.equals(str, logConfig.key)) {
                break;
            } else {
                i++;
            }
        }
        if (logConfig == null) {
            for (LogConfig logConfig2 : sModuleConfig.values()) {
                if (TextUtils.equals(str, logConfig2.key)) {
                    logConfig = logConfig2;
                    break;
                }
            }
        }
        if (logConfig != null) {
            logConfig.val = PropertyUtils.settingsGetInt(context, str, logConfig.val);
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        printLog(2, str, str2, null, objArr);
    }

    public static void w(String str, String str2, Object... objArr) {
        printLog(5, str, str2, null, objArr);
    }

    public static void d(String str, String str2, Throwable th) {
        d(th, str, str2, new Object[0]);
    }

    public static void e(String str, String str2, Throwable th) {
        e(th, str, str2, new Object[0]);
    }

    public static void i(String str, String str2, Throwable th) {
        i(th, str, str2, new Object[0]);
    }

    public static void v(String str, String str2, Throwable th) {
        v(th, str, str2, new Object[0]);
    }

    public static void w(String str, String str2, Throwable th) {
        w(th, str, str2, new Object[0]);
    }

    public static void d(Throwable th, String str, String str2, Object... objArr) {
        printLog(3, str, str2, th, objArr);
    }

    public static void e(Throwable th, String str, String str2, Object... objArr) {
        printLog(6, str, str2, th, objArr);
    }

    public static void i(Throwable th, String str, String str2, Object... objArr) {
        printLog(4, str, str2, th, objArr);
    }

    public static void v(Throwable th, String str, String str2, Object... objArr) {
        printLog(2, str, str2, th, objArr);
    }

    public static void w(Throwable th, String str, String str2, Object... objArr) {
        printLog(5, str, str2, th, objArr);
    }

    public static class LogConfig {
        public String key;
        public String tag;
        public int val;

        public LogConfig(String str, String str2, int i) {
            this.tag = str;
            this.key = str2;
            this.val = i;
        }

        public LogConfig(String str, int i) {
            this.tag = str;
            this.key = LogUtil.KEY_PREFIX + str;
            this.val = i;
        }
    }
}
