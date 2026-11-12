package com.huawei.agconnect.apms;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes22.dex */
public final class zyx {
    public static final AgentLog ghi = AgentLogManager.getAgentLog();
    public static final long hij = TimeUnit.SECONDS.toMicros(1);
    public static zyx ijk;
    public ScheduledExecutorService abc;
    public ScheduledFuture bcd;
    public long cde;
    public String def;
    public long efg;
    public ConcurrentLinkedQueue<yxw> fgh;

    public zyx() {
        ghi.debug("CPUCollector");
        this.bcd = null;
        this.cde = -1L;
        this.def = String.format(Locale.ENGLISH, "/proc/%s/stat", Integer.valueOf(Process.myPid()));
        this.efg = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.abc = Executors.newSingleThreadScheduledExecutor(new m("CPUCollector"));
        this.fgh = new ConcurrentLinkedQueue<>();
    }

    public static zyx abc() {
        if (ijk == null) {
            ijk = new zyx();
        }
        return ijk;
    }
}
