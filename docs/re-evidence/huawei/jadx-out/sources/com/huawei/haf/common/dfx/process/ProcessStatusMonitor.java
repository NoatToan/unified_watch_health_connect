package com.huawei.haf.common.dfx.process;

import android.content.Intent;
import android.os.FileObserver;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.os.FileLockHelper;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.security.SecurityConstant;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.watchface.api.HwWatchFaceApi;
import health.compact.a.DfxMonitorCenter;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ProcessStatusMonitor implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final MyFileObserver f5887c;

    ProcessStatusMonitor(List<String> list, ProcessCallback processCallback) {
        File dir = BaseApplication.b().getDir("proc_status", 0);
        this.f5887c = new MyFileObserver(FileUtils.c(new File(dir, "proc_status")), FileUtils.c(new File(dir, "proc_flag")), processCallback, list);
    }

    void a() {
        this.f5887c.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5887c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, InnerProcessStatus innerProcessStatus, InnerProcessStatus innerProcessStatus2) {
        if (innerProcessStatus.d == innerProcessStatus2.d || !innerProcessStatus2.f5888a) {
            return;
        }
        innerProcessStatus.e(innerProcessStatus2);
        c(str, true, innerProcessStatus.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<String> list, String str, InnerProcessStatus innerProcessStatus, InnerProcessStatus innerProcessStatus2, ProcessCallback processCallback) {
        if (innerProcessStatus.d != innerProcessStatus2.d || innerProcessStatus2.f5888a) {
            return;
        }
        if (list.size() <= 1 || ProcessUtil.c().equals(list.get(0))) {
            c(str, innerProcessStatus2.f5889b);
            processCallback.processStop(list, str, innerProcessStatus.d, innerProcessStatus.e, innerProcessStatus2.f5889b);
        }
        innerProcessStatus.e(innerProcessStatus2);
        c(str, false, innerProcessStatus.f5889b);
    }

    private static void c(String str, long j) {
        if (BaseApplication.d().equals(str) && BaseApplication.h()) {
            Intent intent = new Intent(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
            intent.setPackage(BaseApplication.d());
            intent.putExtra("isForeground", false);
            intent.putExtra("time", j);
            BaseApplication.b().sendBroadcast(intent, SecurityConstant.f5920a);
        }
    }

    private static void c(String str, boolean z, long j) {
        Intent intent = new Intent("com.huawei.haf.intent.action.PROCESS_STATUS_CHANGE");
        intent.putExtra("processName", str);
        intent.putExtra("isRunning", z);
        intent.putExtra("time", j);
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(FileLockHelper fileLockHelper, long j) {
        if (fileLockHelper == null || !fileLockHelper.b()) {
            return;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
        byteBufferAllocate.putInt(Process.myPid());
        byteBufferAllocate.putLong(j);
        try {
            fileLockHelper.c(byteBufferAllocate.array());
        } catch (IOException e) {
            LogUtil.d("HAF_ProcessStatus", "writeProcessStatus, ex=", LogUtil.c(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(File file, String str, InnerProcessStatus innerProcessStatus) throws IOException {
        if (innerProcessStatus != null && innerProcessStatus.f5889b == Long.MAX_VALUE) {
            innerProcessStatus.f5889b = file.lastModified();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            if (innerProcessStatus == null) {
                boolean zB = b(str, randomAccessFile);
                randomAccessFile.close();
                return zB;
            }
            if (file.length() == 12) {
                innerProcessStatus.d = randomAccessFile.readInt();
                innerProcessStatus.e = randomAccessFile.readLong();
            }
            innerProcessStatus.f5888a = b(str, randomAccessFile);
            boolean z = innerProcessStatus.f5888a;
            randomAccessFile.close();
            return z;
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static boolean b(String str, RandomAccessFile randomAccessFile) throws IOException {
        if (ProcessUtil.c().equals(str)) {
            return false;
        }
        return a(randomAccessFile);
    }

    private static boolean a(RandomAccessFile randomAccessFile) throws IOException {
        boolean z;
        synchronized (ProcessStatusMonitor.class) {
            try {
                FileLock fileLockTryLock = randomAccessFile.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                z = fileLockTryLock == null;
                if (fileLockTryLock != null) {
                    try {
                        fileLockTryLock.close();
                    } catch (OverlappingFileLockException e) {
                        e = e;
                        LogUtil.e("HAF_ProcessStatus", "isOtherProcessAlive, ex=", LogUtil.c(e));
                    }
                }
            } catch (OverlappingFileLockException e2) {
                e = e2;
                z = true;
            }
        }
        return z;
    }

    static class MyFileObserver extends FileObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private FileLockHelper f5894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f5895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<String, InnerProcessStatus> f5896c;
        private final ProcessCallback d;
        private final File e;

        MyFileObserver(File file, File file2, ProcessCallback processCallback, List<String> list) {
            super(file.getPath(), 10);
            this.f5896c = new HashMap();
            this.f5895b = file;
            this.e = file2;
            this.d = processCallback;
            DfxMonitorCenter.c(new MonitorRunnable(this, list));
        }

        void b() {
            if (this.f5894a != null) {
                b(System.currentTimeMillis());
            }
        }

        void a() {
            b();
            DfxMonitorCenter.c(new MonitorRunnable(this, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(List<String> list) {
            long jCurrentTimeMillis = System.currentTimeMillis() - (SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime());
            FileLockHelper fileLockHelperC = null;
            try {
                d(list, jCurrentTimeMillis);
                fileLockHelperC = FileLockHelper.c(c(ProcessUtil.c()));
                ProcessStatusMonitor.e(fileLockHelperC, jCurrentTimeMillis);
                startWatching();
                this.f5894a = fileLockHelperC;
            } catch (IOException e) {
                LogUtil.d("HAF_ProcessStatus", "init process status monitor, ex=", LogUtil.c(e));
                FileUtils.a(fileLockHelperC);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            FileLockHelper fileLockHelper = this.f5894a;
            this.f5894a = null;
            if (fileLockHelper != null) {
                stopWatching();
                fileLockHelper.close();
            }
        }

        private List<String> b(String str, long j, InnerProcessStatus innerProcessStatus) {
            File file;
            ArrayList arrayList = new ArrayList(this.f5896c.size() + 1);
            arrayList.add(b(j));
            for (Map.Entry<String, InnerProcessStatus> entry : this.f5896c.entrySet()) {
                String key = entry.getKey();
                InnerProcessStatus value = entry.getValue();
                File fileC = c(key);
                if (innerProcessStatus == null || !key.equals(str)) {
                    file = fileC;
                    value.f5888a = c(file, key, value.d, j, null);
                } else {
                    file = fileC;
                    value.f5888a = c(fileC, key, value.d, j, innerProcessStatus);
                }
                if (value.f5888a) {
                    arrayList.add(key);
                }
                if (key.equals(str)) {
                    long jB = b(key, file, value.f5888a, null);
                    if (jB != Long.MAX_VALUE && innerProcessStatus != null && innerProcessStatus.f5889b == Long.MAX_VALUE) {
                        innerProcessStatus.f5889b = jB;
                    }
                }
            }
            return a(arrayList);
        }

        private List<String> a(List<String> list) {
            if (list.size() > 1) {
                Collections.sort(list);
            }
            return list;
        }

        private String b(long j) {
            String strC = ProcessUtil.c();
            File fileC = c(strC);
            if (!fileC.exists() || fileC.length() != 12) {
                fileC.getParentFile().mkdirs();
                ProcessStatusMonitor.e(this.f5894a, j);
            } else {
                fileC.setLastModified(j);
            }
            b(strC, fileC, true, null);
            return strC;
        }

        private boolean c(File file, String str, int i, long j, InnerProcessStatus innerProcessStatus) {
            try {
                if (file.exists()) {
                    return ProcessStatusMonitor.c(file, str, innerProcessStatus);
                }
            } catch (IOException e) {
                LogUtil.b("HAF_ProcessStatus", "updateOtherStatus fail, ex=", LogUtil.c(e));
            }
            boolean zEquals = i > 0 ? str.equals(ProcessUtil.c(i)) : false;
            if (innerProcessStatus != null) {
                innerProcessStatus.f5888a = zEquals;
                if (innerProcessStatus.f5889b == Long.MAX_VALUE) {
                    innerProcessStatus.f5889b = j;
                }
            }
            return zEquals;
        }

        private File c(String str) {
            return new File(this.f5895b, str);
        }

        private long b(String str, File file, boolean z, File file2) {
            if (file2 == null) {
                file2 = d(str);
            }
            boolean zExists = file2.exists();
            long jLastModified = zExists ? file2.lastModified() : Long.MAX_VALUE;
            if (z) {
                if (zExists) {
                    FileUtils.b(file2);
                    return jLastModified;
                }
            } else if (!zExists) {
                try {
                    file2.getParentFile().mkdirs();
                    file2.createNewFile();
                    long jLastModified2 = file2.lastModified();
                    try {
                        if (file.exists()) {
                            file.setLastModified(jLastModified2);
                        }
                        return jLastModified2;
                    } catch (IOException e) {
                        e = e;
                        jLastModified = jLastModified2;
                        LogUtil.e("HAF_ProcessStatus", "updateDieFile fail, ex=", LogUtil.c(e));
                        return jLastModified;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            return jLastModified;
        }

        private File d(String str) {
            return new File(this.e, str);
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            InnerProcessStatus innerProcessStatus = this.f5896c.get(str);
            if (innerProcessStatus == null) {
                b(str, jCurrentTimeMillis, null);
                return;
            }
            int i2 = i & 4095;
            if (i2 == 2) {
                InnerProcessStatus innerProcessStatusE = new InnerProcessStatus().e(innerProcessStatus);
                innerProcessStatusE.f5889b = Long.MAX_VALUE;
                b(str, jCurrentTimeMillis, innerProcessStatusE);
                ProcessStatusMonitor.d(str, innerProcessStatus, innerProcessStatusE);
                return;
            }
            if (i2 == 8) {
                InnerProcessStatus innerProcessStatusE2 = new InnerProcessStatus().e(innerProcessStatus);
                innerProcessStatusE2.f5889b = jCurrentTimeMillis;
                ProcessStatusMonitor.c(b(str, jCurrentTimeMillis, innerProcessStatusE2), str, innerProcessStatus, innerProcessStatusE2, this.d);
                return;
            }
            b(str, jCurrentTimeMillis, null);
        }

        private void d(List<String> list, long j) {
            String strC = ProcessUtil.c();
            InnerProcessStatus innerProcessStatus = new InnerProcessStatus();
            ArrayList arrayList = new ArrayList(list.size());
            ArrayList arrayList2 = new ArrayList(list.size());
            for (String str : list) {
                File fileC = c(str);
                File fileD = d(str);
                InnerProcessStatus innerProcessStatus2 = new InnerProcessStatus();
                boolean zC = c(fileC, str, -1, j, innerProcessStatus2);
                if (strC.equals(str)) {
                    arrayList2.add(str);
                    innerProcessStatus.e(innerProcessStatus2);
                    if (!fileD.exists()) {
                        if (fileC.exists()) {
                            arrayList.add(str);
                        }
                    } else {
                        innerProcessStatus.f5889b = b(str, fileC, true, fileD);
                    }
                } else {
                    if (zC) {
                        arrayList2.add(str);
                    } else if (!fileD.exists()) {
                        arrayList.add(str);
                    }
                    this.f5896c.put(str, innerProcessStatus2);
                }
            }
            List<String> listA = a(arrayList2);
            if (innerProcessStatus.d > 0 && arrayList.contains(strC)) {
                this.d.processStop(listA, strC, innerProcessStatus.d, innerProcessStatus.e, innerProcessStatus.f5889b);
            }
            if (listA.size() > 1) {
                arrayList.clear();
            }
            this.d.processStart(listA, strC, new InnerStartInfo(innerProcessStatus.d, innerProcessStatus.f5889b, Process.myPid(), j), arrayList);
        }
    }

    static class MonitorRunnable implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<String> f5893a;
        private final MyFileObserver e;

        MonitorRunnable(MyFileObserver myFileObserver, List<String> list) {
            this.e = myFileObserver;
            this.f5893a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            List<String> list = this.f5893a;
            if (list != null) {
                this.e.e(list);
            } else {
                this.e.d();
            }
        }
    }

    static class InnerStartInfo implements ProcessCallback.StartInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f5890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f5892c;
        private int d;

        InnerStartInfo(int i, long j, int i2, long j2) {
            this.d = i;
            this.f5890a = j;
            this.f5891b = i2;
            this.f5892c = j2;
        }

        @Override // com.huawei.haf.common.dfx.process.ProcessCallback.StartInfo
        public long getLastPid() {
            return this.d;
        }

        @Override // com.huawei.haf.common.dfx.process.ProcessCallback.StartInfo
        public long getLastDieTime() {
            return this.f5890a;
        }

        @Override // com.huawei.haf.common.dfx.process.ProcessCallback.StartInfo
        public long getPid() {
            return this.f5891b;
        }

        @Override // com.huawei.haf.common.dfx.process.ProcessCallback.StartInfo
        public long getStartTime() {
            return this.f5892c;
        }
    }

    static class InnerProcessStatus {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f5888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f5889b;
        int d;
        long e;

        private InnerProcessStatus() {
            this.f5889b = Long.MAX_VALUE;
            this.f5888a = true;
        }

        InnerProcessStatus e(InnerProcessStatus innerProcessStatus) {
            this.d = innerProcessStatus.d;
            this.e = innerProcessStatus.e;
            this.f5889b = innerProcessStatus.f5889b;
            this.f5888a = innerProcessStatus.f5888a;
            return this;
        }
    }
}
