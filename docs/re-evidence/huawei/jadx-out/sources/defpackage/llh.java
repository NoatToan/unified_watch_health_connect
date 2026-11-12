package defpackage;

import android.os.Process;
import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.hwappdfxmgr.threads.ThreadsCallBack;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentUtils;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class llh extends DfxBaseHandler implements ThreadsCallBack {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f40411c;
    private static int e;

    public llh() {
        super("HAF_HealthThreadsHandler", "_threads");
    }

    @Override // com.huawei.hwappdfxmgr.threads.ThreadsCallBack
    public void dumpThreadsMessage(String str, long j) {
        File saveFile;
        if (CommonUtil.bu() || !d(j) || (saveFile = getSaveFile()) == null) {
            return;
        }
        ThreadGroup threadGroupD = d();
        Thread[] threadArr = new Thread[threadGroupD.activeCount() * 2];
        int iEnumerate = threadGroupD.enumerate(threadArr);
        Thread[] threadArr2 = new Thread[iEnumerate];
        System.arraycopy(threadArr, 0, threadArr2, 0, iEnumerate);
        StringBuilder sb = new StringBuilder(" start dumpThreadsMessage; current process:");
        sb.append(ProcessUtil.c());
        sb.append("; the situation: ");
        sb.append(str);
        sb.append("; threadCount: ");
        sb.append(threadGroupD.activeCount());
        LogUtil.b("HAF_HealthThreadsHandler", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) sb);
        sb2.append(System.lineSeparator());
        for (int i = 0; i < iEnumerate; i++) {
            e(threadArr2[i], sb2);
        }
        if (e(sb2.toString(), saveFile)) {
            return;
        }
        LogUtil.e("HAF_HealthThreadsHandler", "save Threads Message fail.");
    }

    @Override // com.huawei.hwappdfxmgr.threads.ThreadsCallBack
    public int getAllThreadCount() {
        ThreadGroup threadGroupD = d();
        if (threadGroupD != null) {
            return threadGroupD.activeCount();
        }
        return 0;
    }

    private ThreadGroup d() {
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

    private int e() {
        return (EnvironmentUtils.b() || EnvironmentUtils.e()) ? 100 : 200;
    }

    private void e(Thread thread, StringBuilder sb) {
        sb.append("SystemInfo:");
        SystemInfo.d(sb);
        sb.append(System.lineSeparator());
        sb.append("ProcessName:");
        sb.append(ProcessUtil.c());
        sb.append(", pid=");
        sb.append(Process.myPid());
        sb.append(System.lineSeparator());
        sb.append("ThreadName:");
        sb.append(thread.getName());
        sb.append(", tid=");
        sb.append(thread.getId());
        sb.append(System.lineSeparator());
        sb.append("--------------------------------");
        sb.append(System.lineSeparator());
    }

    private boolean d(long j) {
        if (j - f40411c < 30000) {
            return false;
        }
        int allThreadCount = getAllThreadCount();
        if (allThreadCount - e <= 5 || allThreadCount <= e()) {
            return false;
        }
        f40411c = j;
        e = allThreadCount;
        return true;
    }

    private boolean e(String str, File file) {
        if (file != null && file.getParentFile().exists()) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    PrintStream printStream = new PrintStream((OutputStream) fileOutputStream, false, "UTF-8");
                    try {
                        printStream.println(str);
                        printStream.close();
                        fileOutputStream.close();
                        return true;
                    } catch (Throwable th) {
                        try {
                            printStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IOException e2) {
                LogUtil.d("HAF_HealthThreadsHandler", "saveInfo ex=", LogUtil.c(e2));
            }
        }
        return false;
    }
}
