package com.huawei.hwappdfxmgr.crashmgr;

import android.os.Handler;
import android.os.Looper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.huawei.haf.common.dfx.block.MainThreadMonitor;
import com.huawei.haf.common.dfx.crash.DefaultCrashHandler;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.EnvironmentUtils;
import health.compact.a.ProcessUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class HealthCrashHandler extends DefaultCrashHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static List<String> f16992b = new ArrayList(Arrays.asList("libsqlcipher.so", "libwhiteBoxJniLib.so", "file is not a database", "database disk image is malformed", "disk I/O error", "Too many receivers, total of 1000"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f16993a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicBoolean f16994c;

    @Override // com.huawei.haf.common.dfx.crash.DefaultCrashHandler, com.huawei.haf.common.dfx.crash.CrashCallback
    public boolean isAllowSelfKill() {
        return false;
    }

    public HealthCrashHandler() {
        super("HealthCrashHandler");
        this.f16994c = new AtomicBoolean(true);
    }

    @Override // com.huawei.haf.common.dfx.crash.DefaultCrashHandler, com.huawei.haf.common.dfx.crash.CrashCallback
    public boolean isAllowRethrow() {
        return this.f16994c.get();
    }

    public boolean a(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.huawei.haf.common.dfx.crash.DefaultCrashHandler
    public boolean c(Throwable th, String str, String str2, StringBuilder sb) {
        this.f16994c.set(!a(str2));
        if (!a(str2, f16992b) && !(th instanceof UnsatisfiedLinkError)) {
            return true;
        }
        for (String str3 : f16992b) {
            if (str2.contains(str3)) {
                ReleaseLogUtil.d("HealthCrashHandler", "crash filter " + str2);
                return b(str3, str, str2, sb);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        RemoteConfigUtils.b("crashConfig", new RemoteConfigUtils.ConfigCallback() { // from class: com.huawei.hwappdfxmgr.crashmgr.HealthCrashHandler.2
            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onSuccess(String str) {
                try {
                    HealthCrashHandler.this.f16993a = (b) new Gson().fromJson(str, b.class);
                } catch (JsonSyntaxException e) {
                    ReleaseLogUtil.a("HealthCrashHandler", "exception happens ", e.getMessage());
                }
            }

            @Override // com.huawei.health.healthcloudconfig.utils.RemoteConfigUtils.ConfigCallback
            public void onFailure(Exception exc, String str) {
                LogUtil.j("HealthCrashHandler", "exception happens ", exc.getMessage());
            }
        }, 1);
        LogUtil.a("HealthCrashHandler", "downloadRemoteConfigInfo, time cost: ", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public void c() {
        if (EnvironmentUtils.b()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.hwappdfxmgr.crashmgr.HealthCrashHandler.1
            @Override // java.lang.Runnable
            public void run() {
                HealthCrashHandler.this.d();
            }
        });
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.huawei.hwappdfxmgr.crashmgr.HealthCrashHandler.3
            /* JADX WARN: Bottom block not found for handler: all -> 0x0012 */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void run() {
                if (!EnvironmentUtils.d()) {
                    return;
                }
                MainThreadMonitor.e(new HealthAnrHandler());
                while (true) {
                    Looper.loop();
                }
            }
        });
        LogUtil.a("HealthCrashHandler", "enable finished");
    }

    /* JADX INFO: loaded from: classes2.dex */
    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @SerializedName("matchRule")
        private int f16996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @SerializedName("keyWords")
        private String[] f16997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @SerializedName("currentPage")
        private String f16998c;

        @SerializedName("versionName")
        private String e;

        public String toString() {
            return "CrashConfig{versionName='" + this.e + "', keyWords='" + Arrays.toString(this.f16997b) + "', currentPage='" + this.f16998c + "'}";
        }

        public boolean e(String str) {
            if (!CommonUtil.bu()) {
                ReleaseLogUtil.d("HealthCrashHandler", "crash happens because app not release version");
                return false;
            }
            for (String str2 : this.f16997b) {
                if (str.contains(str2)) {
                    ReleaseLogUtil.d("HealthCrashHandler", "crash intercepted, app not crash");
                    return true;
                }
            }
            return false;
        }
    }

    public boolean a(String str) {
        b bVar = this.f16993a;
        return bVar != null && bVar.e(str);
    }

    @Override // com.huawei.haf.common.dfx.crash.DefaultCrashHandler
    public void d(String str, String str2, String str3) {
        boolean zD = EnvironmentInfo.d(getContext());
        LogUtil.d("HealthCrashHandler", "onSendCrash isAppSigned=", Boolean.valueOf(!zD));
        if (zD) {
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("crash_type", str3);
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, str2);
        linkedHashMap.put(OpAnalyticsConstants.PROC_NAME, ProcessUtil.c());
        linkedHashMap.put(OpAnalyticsConstants.ANDROID_ID, FoundationCommonUtil.getAndroidId(getContext()));
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_CRASH_90030001.value(), linkedHashMap);
        LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
        linkedHashMap2.put("excetion", str);
        OpAnalyticsUtil.getInstance().setEvent(OperationKey.HEALTH_APP_CRASH_2050003.value(), linkedHashMap2);
    }
}
