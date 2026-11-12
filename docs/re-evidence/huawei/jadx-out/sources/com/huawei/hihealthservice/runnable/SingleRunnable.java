package com.huawei.hihealthservice.runnable;

import android.os.Process;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.dfx.block.AbstractMonitorHandler;
import com.huawei.haf.common.dfx.block.ThreadMonitorTask;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hmf.services.internal.ApplicationContext;
import com.huawei.operation.OperationKey;
import defpackage.ljq;
import defpackage.ljv;
import defpackage.lkb;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes10.dex */
public abstract class SingleRunnable implements Runnable {
    private static final String DEADLOCK_TIME_INTERVAL_COUNT = "deadlock_time_interval_count_";
    public static final String FORMAT_FILE_NAME = "_deadlockLog_%d";
    private static String LAST_DEADLOCK_EVENT_TIME_RELEASE = "last_deadlock_event_time_release";
    private static final String LOG_TAG = "HiH_SingleRunnable";
    public static final String TASK_TAG = "SingleRunnable";
    private static boolean sIsSetOpEvent = true;

    protected abstract void doRun();

    @Override // java.lang.Runnable
    public void run() {
        ThreadMonitorTask threadMonitorTask = new ThreadMonitorTask(Thread.currentThread(), new a(TASK_TAG, FORMAT_FILE_NAME));
        try {
            threadMonitorTask.b("");
            doRun();
            threadMonitorTask.a(null, System.currentTimeMillis());
        } catch (Throwable th) {
            try {
                ReleaseLogUtil.e(LOG_TAG, "Failed to ThreadMonitorTask, cause:", ExceptionUtils.c(th));
                threadMonitorTask.a(th, System.currentTimeMillis());
            } catch (Throwable th2) {
                threadMonitorTask.a(null, System.currentTimeMillis());
                throw th2;
            }
        }
    }

    public static class a extends AbstractMonitorHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f12532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f12533b;

        public a(String str, String str2) {
            super(str, str2);
            this.f12533b = 0L;
            this.f12532a = 0;
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public boolean check(Thread thread, long j, long j2) {
            if (j2 <= 0) {
                return false;
            }
            long j3 = this.f12533b + j2;
            this.f12533b = j3;
            this.f12532a++;
            if (c(j3)) {
                String strB = SharedPreferenceManager.b("HuaweiHealth", "handleException", "");
                LinkedHashMap<String, String> linkedHashMapE = e(thread);
                ReleaseLogUtil.e(SingleRunnable.LOG_TAG, "deadlock threadExecTime=", Long.valueOf(this.f12533b), ", errorMsg:", HiJsonUtil.d(linkedHashMapE.get(thread.getName())));
                String strD = HiJsonUtil.d(linkedHashMapE);
                int i = 0;
                for (int i2 = 5000; i2 < strD.length(); i2 += 5000) {
                    String strSubstring = strD.substring(i, i2);
                    LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
                    linkedHashMap.put("handleException", strB);
                    linkedHashMap.put("ownerThread", ljq.c());
                    linkedHashMap.put("data", strSubstring);
                    linkedHashMap.put(SingleRunnable.DEADLOCK_TIME_INTERVAL_COUNT, String.valueOf(this.f12532a));
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap, true);
                    i = i2;
                }
                if (i < strD.length() - 1) {
                    String strSubstring2 = strD.substring(i);
                    LinkedHashMap<String, String> linkedHashMap2 = new LinkedHashMap<>();
                    linkedHashMap2.put("handleException", strB);
                    linkedHashMap2.put("ownerThread", ljq.c());
                    linkedHashMap2.put("data", strSubstring2);
                    linkedHashMap2.put(SingleRunnable.DEADLOCK_TIME_INTERVAL_COUNT, String.valueOf(this.f12532a));
                    ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap2, true);
                }
                boolean unused = SingleRunnable.sIsSetOpEvent = false;
                saveDumpStackTraceInfo(thread, false);
            }
            long j4 = this.f12533b;
            if (j4 == 180000 || j4 == 240000 || j4 == 360000 || j4 == 540000) {
                saveDumpStackTraceInfo(thread, false);
            }
            if (this.f12533b > 660000 && !ProcessUtil.a("com.huawei.health")) {
                LinkedHashMap<String, String> linkedHashMap3 = new LinkedHashMap<>();
                linkedHashMap3.put("killDaemon", "1");
                ljv.d(BaseApplication.b()).c(OperationKey.HEALTH_APP_SQL_CIPHER_TIME_OUT_2129019.value(), linkedHashMap3, true);
                ReleaseLogUtil.e(SingleRunnable.LOG_TAG, "killDaemon");
                Process.killProcess(Process.myPid());
            }
            return true;
        }

        private boolean c(long j) {
            if (!SingleRunnable.sIsSetOpEvent || j < 600000) {
                return false;
            }
            if (!LogUtil.c()) {
                return true;
            }
            long jA = lkb.a(ApplicationContext.getContext(), SingleRunnable.LAST_DEADLOCK_EVENT_TIME_RELEASE, 0, 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - jA < 86400000) {
                return false;
            }
            lkb.c(ApplicationContext.getContext(), SingleRunnable.LAST_DEADLOCK_EVENT_TIME_RELEASE, jCurrentTimeMillis, 0);
            return true;
        }

        @Override // com.huawei.haf.common.dfx.block.MonitorCallback
        public void end(Thread thread, Throwable th, long j, long j2) {
            if (j2 <= 0) {
                return;
            }
            long beginTime = j - getBeginTime();
            if (beginTime >= 30000) {
                com.huawei.hwlogsmodel.LogUtil.e(SingleRunnable.LOG_TAG, "ThreadMonitorTask currentThread run end thread=", Long.valueOf(thread.getId()), ", totalTime=", Long.valueOf(beginTime));
            }
        }

        private LinkedHashMap<String, String> e(Thread thread) {
            ThreadGroup threadGroupA = a();
            Thread[] threadArr = new Thread[threadGroupA.activeCount() * 2];
            int iEnumerate = threadGroupA.enumerate(threadArr);
            Thread[] threadArr2 = new Thread[iEnumerate];
            System.arraycopy(threadArr, 0, threadArr2, 0, iEnumerate);
            List list = (List) Arrays.stream(threadArr2).collect(Collectors.toList());
            if (list.isEmpty()) {
                return new LinkedHashMap<>(0);
            }
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            linkedHashMap.put("errorCode", Integer.toString(-1));
            linkedHashMap.put(thread.getName(), d(thread));
            for (int i = 0; i < list.size(); i++) {
                Thread thread2 = (Thread) list.get(i);
                if (!thread.getName().equals(thread2.getName())) {
                    linkedHashMap.put(thread2.getName() + "_" + i, d(thread2));
                }
            }
            return linkedHashMap;
        }

        private String d(Thread thread) {
            return "deadlock thread name: " + thread.getName() + ", state: " + thread.getState() + ", id: " + thread.getId() + ": " + System.lineSeparator() + DfxUtils.d(thread, null);
        }

        private ThreadGroup a() {
            ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
            ThreadGroup parent = threadGroup == null ? null : threadGroup.getParent();
            while (true) {
                ThreadGroup threadGroup2 = parent;
                ThreadGroup threadGroup3 = threadGroup;
                threadGroup = threadGroup2;
                if (threadGroup == null) {
                    return threadGroup3;
                }
                parent = threadGroup.getParent();
            }
        }
    }
}
