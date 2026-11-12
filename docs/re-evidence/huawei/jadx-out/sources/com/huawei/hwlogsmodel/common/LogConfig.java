package com.huawei.hwlogsmodel.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.watchface.mvp.ui.activity.ScanImageActivity;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.BuildConfigProperties;
import health.compact.a.BuildTypeConfig;
import health.compact.a.DataAccessLayer;
import health.compact.a.HwLogger;
import health.compact.a.LogAllowListConfig;
import health.compact.a.LogDateUtil;
import health.compact.a.LogPathConfig;
import health.compact.a.LogZipUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.ThreadManager;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class LogConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LogPathConfig f17644a;
    private static LogAllowListConfig d;
    private int f;
    private boolean g;
    private String h;
    private String i;
    private String k;
    private double l;
    private double m;
    public static final String e = LogPathConfig.f36606b + "/log/phonelogcat";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f17646c = new Object();
    private static List<Model> j = new ArrayList(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BroadcastReceiver f17645b = new BroadcastReceiver() { // from class: com.huawei.hwlogsmodel.common.LogConfig.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive null,deal failed,return");
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                Log.w("LogUtil_LogConfig", "sLogConfigReceiver receive action null,deal failed,return");
                return;
            }
            Log.i("LogUtil_LogConfig", "sLogConfigReceiver receive,deal:" + action);
            if (action.equals("com.huawei.health.update_log_config_area")) {
                LogConfig.a(context, "ACTION_UPDATE_LOG_CONFIG_AREA message deal for process:" + ProcessUtil.c() + " pid:" + Process.myPid());
                LogUtil.f();
                return;
            }
            if (action.equals("com.huawei.health.update_log_config_user")) {
                LogConfig.s();
            } else {
                Log.w("LogUtil_LogConfig", "action match failed");
            }
        }
    };

    /* JADX INFO: loaded from: classes2.dex */
    public interface Model {
        void clearLogCache();
    }

    private LogConfig() {
        this(new b(null));
    }

    private LogConfig(b bVar) {
        this.k = bVar.f;
        this.h = bVar.d;
        this.i = bVar.e;
        this.f = bVar.f17650c;
        this.m = bVar.i;
        this.g = bVar.f17648a;
        this.l = bVar.g;
        f17644a = bVar.h;
        d = bVar.f17649b;
    }

    public void e(Context context) {
        if (context == null) {
            Log.w("LogUtil_LogConfig", "init context null, init failed, return");
        } else {
            h(context);
            a(context, "init log config");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(final Context context, final String str) {
        synchronized (f17646c) {
            ThreadPoolManager.c().b("LogUtil_LogConfig", new Runnable() { // from class: npu
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    LogConfig.c(context, str);
                }
            });
        }
    }

    public static /* synthetic */ void c(Context context, String str) throws Throwable {
        boolean zC = DataAccessLayer.c(context);
        LogAllowListConfig.d(zC);
        Log.i("LogUtil_LogConfig", "updateOverseaSwitchByDb:" + zC + " for cause:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s() {
        ThreadManager.d().post(new Runnable() { // from class: com.huawei.hwlogsmodel.common.LogConfig.2
            @Override // java.lang.Runnable
            public void run() {
                Log.i("LogUtil_LogConfig", "clearNativeMemoryAndFilesLogAsync memory");
                LogConfig.p();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p() {
        Iterator<Model> it = j.iterator();
        while (it.hasNext()) {
            it.next().clearLogCache();
        }
    }

    public static void d(boolean z) {
        boolean zA = BuildConfigProperties.a("IS_OUTPUT_LOG", false);
        if (z) {
            health.compact.a.LogUtil.a(new HwLogger(), zA, 1, true, false);
        } else {
            health.compact.a.LogUtil.a(new HwLogger(), zA, ((f() || b()) && !BuildConfigProperties.a("FORCE_ALL_LOG", false)) ? 2 : 0, true ^ f(), false);
        }
    }

    public static void c(Model model) {
        j.add(model);
    }

    private static void h(Context context) {
        Log.i("LogUtil_LogConfig", "registerLogConfigReceiver process:" + ProcessUtil.c() + " pid:" + Process.myPid());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.health.update_log_config_area");
        intentFilter.addAction("com.huawei.health.update_log_config_user");
        BroadcastManagerUtil.d(context, f17645b, intentFilter, SecurityConstant.f5920a, null);
    }

    public static boolean f() {
        return BuildTypeConfig.e();
    }

    public static boolean b() {
        return BuildTypeConfig.b();
    }

    public static boolean a() {
        return BuildTypeConfig.c();
    }

    public static boolean i() {
        return BuildTypeConfig.a();
    }

    public static boolean g() {
        return BuildTypeConfig.d();
    }

    public static String o() {
        return f17644a.d();
    }

    public static String k() {
        return f17644a.a();
    }

    public static String h() {
        return f17644a.c();
    }

    public static File j() {
        return f17644a.e();
    }

    public String m() {
        if (TextUtils.isEmpty(this.k)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(this.k);
        if (!TextUtils.isEmpty(this.h)) {
            sb.append("_");
            sb.append(this.h);
        }
        return sb.toString();
    }

    private int q() {
        return this.f;
    }

    private double t() {
        if (!this.g) {
            return this.l;
        }
        int i = (int) (((double) ((a() || (b() && this.m == 0.0d)) ? 10485760 : ScanImageActivity.SCAN_IMAGE_LENGTH_LIMIT)) + this.m);
        Log.d("LogUtil_LogConfig", "acquireMaxLogFileLengthContainsOffset describe: " + m() + " result:" + i);
        return i;
    }

    public String n() {
        String strC = this.k;
        if (TextUtils.isEmpty(strC)) {
            strC = ProcessUtil.c();
        }
        if (TextUtils.isEmpty(strC)) {
            strC = "health";
        }
        String strReplaceAll = strC.replaceAll(":", "_");
        StringBuilder sb = new StringBuilder(16);
        sb.append(k());
        sb.append(strReplaceAll);
        if (!TextUtils.isEmpty(this.h)) {
            sb.append("_" + this.h);
        }
        sb.append("/");
        Log.d("LogUtil_LogConfig", "getLogFileRootPath mDetail:" + this.h + " result:" + sb.toString());
        return sb.toString();
    }

    public File l() {
        if (this.i == null) {
            this.i = n();
        }
        Log.d("LogUtil_LogConfig", "getLogFile(): logFilePath = " + this.i);
        File file = new File(this.i);
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Log.w("LogUtil_LogConfig", "create log directory failed");
            }
        } else {
            x();
        }
        File file2 = new File(this.i, "log.0");
        if (file2.exists() && file2.length() > t()) {
            v();
        }
        return file2;
    }

    private void v() {
        try {
            File[] fileArrListFiles = new File(this.i).listFiles();
            if (fileArrListFiles == null) {
                Log.w("LogUtil_LogConfig", "zipLogFile fileList == null");
                return;
            }
            String str = ProcessUtil.b() ? this.i + "local_" : this.i;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(HwDrmConstant.TIME_FORMAT, Locale.ENGLISH);
            for (File file : fileArrListFiles) {
                if (file.exists()) {
                    b(str, simpleDateFormat, file);
                }
            }
            if (ProcessUtil.c().endsWith(":PhoneService")) {
                u();
            } else if (ProcessUtil.b()) {
                LogZipUtil.d(this.i);
            } else {
                r();
            }
        } catch (IOException unused) {
            LogUtil.e("LogUtil_LogConfig", "zipLogFile IOException");
        }
    }

    private void b(String str, SimpleDateFormat simpleDateFormat, File file) throws IOException {
        if ("log.0".equals(file.getName())) {
            String str2 = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
            File file2 = new File(str + str2);
            LogZipUtil.e(file.getCanonicalPath(), str + str2, true);
            LogZipUtil.e(file2, new File(str + str2 + ".zip"));
            if (file.delete() && file2.delete()) {
                return;
            }
            Log.w("LogUtil_LogConfig", "compareFileName delete childFile or toZipFile file failed");
            return;
        }
        if ("log.1".equals(file.getName()) || "log.2".equals(file.getName()) || "log.3".equals(file.getName())) {
            String str3 = simpleDateFormat.format(Long.valueOf(file.lastModified()));
            File file3 = new File(str + str3);
            LogZipUtil.e(file.getCanonicalPath(), str + str3, true);
            LogZipUtil.e(file3, new File(str + str3 + ".zip"));
            if (file.delete() && file3.delete()) {
                return;
            }
            Log.w("LogUtil_LogConfig", "compareFileName delete childFile or toModifiedZipFile file failed");
            return;
        }
        if (file.getName().contains("log_file_zip")) {
            if (file.delete()) {
                return;
            }
            Log.w("LogUtil_LogConfig", "compareFileName delete log_file_zip failed");
            return;
        }
        Log.w("LogUtil_LogConfig", "compareFileName other zip file");
    }

    private void u() {
        ArrayList arrayList = new ArrayList(10);
        File[] fileArrListFiles = new File(this.i).listFiles();
        if (fileArrListFiles == null) {
            Log.w("LogUtil_LogConfig", "deletePhoneServiceZip zipFileList == null");
            return;
        }
        long length = 0;
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (!"log.0".equals(name)) {
                length += file.length();
                arrayList.add(Long.valueOf(LogDateUtil.c(name, HwDrmConstant.TIME_FORMAT)));
            }
        }
        if (arrayList.isEmpty()) {
            Log.w("LogUtil_LogConfig", "deletePhoneServiceZip fileNameList.isEmpty");
            return;
        }
        while (length > 36700160) {
            if (arrayList.isEmpty()) {
                Log.w("LogUtil_LogConfig", "deletePhoneServiceZip while fileNameList.isEmpty");
                return;
            }
            Long l = (Long) Collections.min(arrayList);
            long jLongValue = l.longValue();
            arrayList.remove(l);
            String strB = LogDateUtil.b(jLongValue, HwDrmConstant.TIME_FORMAT);
            File file2 = new File(this.i + strB + ".zip");
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(strB);
            File file3 = new File(sb.toString());
            if (file2.exists()) {
                length -= file2.length();
                Log.i("LogUtil_LogConfig", "deletePhoneServiceZip minFileZip is " + file2.delete());
            }
            if (file3.exists()) {
                length -= file3.length();
                Log.i("LogUtil_LogConfig", "deletePhoneServiceZip minFile is " + file3.delete());
            }
        }
    }

    private void r() {
        ArrayList arrayList = new ArrayList(10);
        File[] fileArrListFiles = new File(this.i).listFiles();
        if (fileArrListFiles == null) {
            Log.w("LogUtil_LogConfig", "deleteLastFile zipFileList == null");
            return;
        }
        for (File file : fileArrListFiles) {
            String name = file.getName();
            if (!"log.0".equals(name)) {
                arrayList.add(Long.valueOf(LogDateUtil.c(name, HwDrmConstant.TIME_FORMAT)));
            }
        }
        if (arrayList.isEmpty()) {
            Log.w("LogUtil_LogConfig", "deleteLastFile fileNameList.isEmpty");
            return;
        }
        while (arrayList.size() >= q()) {
            if (arrayList.isEmpty()) {
                Log.w("LogUtil_LogConfig", "deleteLastFile while fileNameList.isEmpty");
                return;
            }
            Long l = (Long) Collections.min(arrayList);
            long jLongValue = l.longValue();
            arrayList.remove(l);
            String strB = LogDateUtil.b(jLongValue, HwDrmConstant.TIME_FORMAT);
            File file2 = new File(this.i + strB + ".zip");
            StringBuilder sb = new StringBuilder();
            sb.append(this.i);
            sb.append(strB);
            File file3 = new File(sb.toString());
            if (file2.exists()) {
                Log.i("LogUtil_LogConfig", "deleteLastFile minFileZip is " + file2.delete());
            }
            if (file3.exists()) {
                Log.i("LogUtil_LogConfig", "deleteLastFile minFile is " + file3.delete());
            }
        }
    }

    private void x() {
        if (TextUtils.isEmpty(this.h)) {
            if (f() || b()) {
                File file = new File(this.i + "log.4");
                if (file.exists()) {
                    Log.d("LogUtil_LogConfig", "deleteSuccess = " + file.delete());
                }
            }
        }
    }

    public static void a(Context context) {
        Log.i("LogUtil_LogConfig", "confirmOverseaGlobalRefresh");
        d(context, "com.huawei.health.update_log_config_area");
    }

    public static void c(final Context context) {
        if (!f()) {
            Log.i("LogUtil_LogConfig", "confirmAccountChangedAsync-not release,no effect,return");
        } else {
            Log.i("LogUtil_LogConfig", "confirmAccountChangedAsync");
            ThreadManager.d().post(new Runnable() { // from class: com.huawei.hwlogsmodel.common.LogConfig.1
                @Override // java.lang.Runnable
                public void run() {
                    LogConfig.b(context);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context) {
        Log.i("LogUtil_LogConfig", "confirmAccountChanged");
        e(j());
        d(context, "com.huawei.health.update_log_config_user");
        Log.i("LogUtil_LogConfig", "confirmAccountChanged end in main process, memory clear in broadcast receiver");
    }

    public static void e(File file) {
        if (file == null) {
            Log.w("LogUtil_LogConfig", "file is null, delete failed");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                Log.i("LogUtil_LogConfig", "current file is " + file2.getName());
                e(file2);
            }
        }
        Log.i("LogUtil_LogConfig", file.getName() + " delete result: " + file.delete());
    }

    public static boolean d() {
        boolean zJ;
        synchronized (f17646c) {
            zJ = LogAllowListConfig.j();
        }
        return zJ;
    }

    private static void d(Context context, String str) {
        Intent intent = new Intent(str);
        intent.setPackage(BaseApplication.d());
        context.sendBroadcast(intent, SecurityConstant.f5920a);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class b {
        private String f;
        private String d = null;
        private String e = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f17650c = 4;
        private double i = 0.0d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17648a = true;
        private double g = 5242880.0d;
        private LogPathConfig h = new LogPathConfig();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LogAllowListConfig f17649b = new LogAllowListConfig();

        public b(String str) {
            this.f = str;
        }

        public b b(String str) {
            this.d = str;
            return this;
        }

        public b e(int i) {
            this.f17650c = i;
            return this;
        }

        public b e(double d) {
            this.i = d;
            return this;
        }

        public b d(boolean z) {
            this.f17648a = z;
            return this;
        }

        public b a(double d) {
            this.g = d;
            return this;
        }

        public b a(LogAllowListConfig logAllowListConfig) {
            this.f17649b = logAllowListConfig;
            return this;
        }

        public LogConfig b() {
            return new LogConfig(this);
        }
    }
}
