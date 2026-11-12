package defpackage;

import android.os.Build;
import android.os.SystemClock;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.operation.OpAnalyticsConstants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.EnvironmentUtils;
import health.compact.a.LogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class llo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f40421b;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private long e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f40422c = 0;

    public llo(long j) {
        this.f40421b = j;
    }

    public void d() {
        LogUtil.b("FreezeDetectorHandler", "start to detector freeze");
        if (this.d.get()) {
            return;
        }
        this.d.set(true);
        b();
        e();
        c();
    }

    private void c() {
        SharedPreferenceManager.c("HWAppDFXMgr", "last_expected", SystemClock.elapsedRealtime() + this.f40421b);
        DfxMonitorCenter.b(new Runnable() { // from class: lll
            @Override // java.lang.Runnable
            public final void run() {
                this.f40420b.a();
            }
        }, this.f40421b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.d.get()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jD = SharedPreferenceManager.d("HWAppDFXMgr", "last_expected", 0L);
            long jMax = Math.max(0L, (jElapsedRealtime - jD) - this.f40421b);
            LogUtil.c("FreezeDetectorHandler", "receive handleMessage, freeze: " + jMax + " actual:" + jElapsedRealtime + " expected:" + jD + " interval:" + this.f40421b);
            if (jMax > 1000) {
                this.e += jMax;
                LogUtil.b("FreezeDetectorHandler", "Detected freeze: " + jMax + "ms interval:" + this.f40421b + "ms");
            }
            this.f40422c += this.f40421b;
            SharedPreferenceManager.c("HWAppDFXMgr", "total_freeze", this.e);
            SharedPreferenceManager.c("HWAppDFXMgr", "total_normal", this.f40422c);
            c();
        }
    }

    private void e() {
        SharedPreferenceManager.c("HWAppDFXMgr", "total_freeze", 0L);
        SharedPreferenceManager.c("HWAppDFXMgr", "total_normal", 0L);
    }

    private void b() {
        LogUtil.c("FreezeDetectorHandler", "sendProcessFreezeInfo.");
        long jD = SharedPreferenceManager.d("HWAppDFXMgr", "total_normal", 0L);
        if (jD == 0) {
            LogUtil.c("FreezeDetectorHandler", "last TotalNormalTime ==0, no need send Info");
            return;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_KEY, "processFreeze");
        StringBuilder sb = new StringBuilder();
        sb.append("SystemInfo:");
        SystemInfo.d(sb);
        linkedHashMap.put(OpAnalyticsConstants.MONITOR_INFO, sb.toString());
        linkedHashMap.put("totalNormalTime", String.valueOf(jD));
        linkedHashMap.put("totalFreezeTime", String.valueOf(SharedPreferenceManager.d("HWAppDFXMgr", "total_freeze", 0L)));
        linkedHashMap.put("process", EnvironmentUtils.c());
        linkedHashMap.put("manufacturer", Build.MANUFACTURER);
        linkedHashMap.put("board", Build.BOARD);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_PROCESS_90030007.value(), linkedHashMap);
    }
}
