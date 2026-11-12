package com.huawei.agconnect.apms;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.agconnect.apms.anr.model.AnrFileBody;
import com.huawei.agconnect.apms.anr.model.AnrInfo;
import com.huawei.agconnect.apms.anr.model.AnrMemInfo;
import com.huawei.agconnect.apms.anr.model.ThreadStackInfo;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.hianalytics.core.storage.Event;
import com.huawei.secure.android.common.detect.RootDetect;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class klm {
    public static final AgentLog def = AgentLogManager.getAgentLog();
    public final Object abc = new Object();
    public HashSet bcd;
    public long cde;

    public final boolean abc() {
        ActivityManager activityManager;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        String string;
        String canonicalPath;
        Context context = Agent.getContext();
        if (context == null || (activityManager = (ActivityManager) context.getSystemService("activity")) == null) {
            return false;
        }
        int i = 0;
        loop0: while (true) {
            if (i >= 60) {
                processErrorStateInfo = null;
                break;
            }
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState == null) {
                def.debug("waiting for anr state info, check times: " + i);
                try {
                    Thread.sleep(500L);
                } catch (Throwable unused) {
                    def.debug("waiting to search process error info.");
                }
            } else {
                for (int i2 = 0; i2 < processesInErrorState.size(); i2++) {
                    try {
                        processErrorStateInfo = processesInErrorState.get(i2);
                        if (Process.myPid() == processErrorStateInfo.pid) {
                            def.info("processErrorStateInfo condition: " + processErrorStateInfo.condition);
                            if (processErrorStateInfo.condition == 2) {
                                break loop0;
                            }
                        } else {
                            def.debug("not this application process.");
                        }
                    } catch (Throwable unused2) {
                        def.debug("the ANR process detection is interrupted.");
                    }
                }
            }
            i++;
        }
        if (processErrorStateInfo == null) {
            def.error("maybe it is not an anr, continue.");
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.cde < 10000) {
            return false;
        }
        this.cde = jCurrentTimeMillis;
        synchronized (this.abc) {
            HashSet<lmn> hashSet = this.bcd;
            if (hashSet != null) {
                for (lmn lmnVar : hashSet) {
                    if (lmnVar != null) {
                        lmnVar.abc();
                    }
                }
            }
        }
        AnrInfo anrInfo = new AnrInfo();
        anrInfo.setLongMsg(processErrorStateInfo.longMsg);
        anrInfo.setParentActivity(processErrorStateInfo.tag);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        anrInfo.setMemInfo(new AnrMemInfo(Runtime.getRuntime(), memoryInfo));
        ArrayList arrayList = new ArrayList();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (entry.getValue().length > 0) {
                arrayList.add(new ThreadStackInfo.Builder(entry.getKey()).build());
            }
        }
        anrInfo.setAllThreadStack(arrayList);
        anrInfo.setRoot(RootDetect.isRoot());
        int iMax = Math.max(153600 - new AnrFileBody(anrInfo).toJsonString().length(), 0);
        StringBuilder sb = new StringBuilder();
        AgentLog agentLog = t0.abc;
        StringBuilder sb2 = new StringBuilder("open files:\n");
        try {
            File[] fileArrListFiles = new File("/proc/self/fd").listFiles(new s0());
            if (fileArrListFiles != null) {
                int i3 = 0;
                for (File file : fileArrListFiles) {
                    try {
                        canonicalPath = file.getCanonicalPath();
                    } catch (Exception unused3) {
                        t0.abc.debug("failed to obtain the path when collecting fd information.");
                        canonicalPath = null;
                    }
                    if (canonicalPath != null) {
                        sb2.append("  fd ");
                        sb2.append(file.getName());
                        sb2.append(": ");
                        sb2.append(TextUtils.isEmpty(canonicalPath) ? "???" : canonicalPath.trim());
                        sb2.append('\n');
                    }
                    i3++;
                    if (i3 > 1024) {
                        break;
                    }
                }
                if (fileArrListFiles.length > 1024) {
                    sb2.append("    ......\n");
                }
            }
        } catch (Exception unused4) {
            t0.abc.warn("get fd description failed.");
        }
        sb2.append("\n");
        sb.append(sb2.toString());
        sb.append(t0.bcd());
        sb.append(t0.abc());
        int iMyPid = Process.myPid();
        StringBuilder sb3 = new StringBuilder();
        if (iMax <= 0) {
            string = "";
        } else {
            sb3.append("logcat:\n");
            t0.abc(iMyPid, sb3, "main", 20000, 'W', t0.abc(iMyPid, sb3, Event.EventConstants.EVENTS, 50, 'I', t0.abc(iMyPid, sb3, "system", 50, 'W', iMax)));
            sb3.append("\n");
            string = sb3.toString();
        }
        sb.append(string);
        anrInfo.setTracesInfo(sb.toString());
        com.huawei.agconnect.apms.anr.abc.cde().abc(context, new AnrFileBody(anrInfo));
        com.huawei.agconnect.apms.anr.abc.def().abc(context);
        return true;
    }
}
