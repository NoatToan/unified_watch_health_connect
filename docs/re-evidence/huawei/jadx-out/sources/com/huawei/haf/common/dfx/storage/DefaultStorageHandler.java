package com.huawei.haf.common.dfx.storage;

import com.huawei.haf.common.dfx.DfxBaseHandler;
import com.huawei.haf.common.dfx.DfxUtils;
import com.huawei.haf.common.os.FileUtils;
import com.huawei.haf.common.os.FileVisitUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import health.compact.a.LogUtil;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class DefaultStorageHandler extends DfxBaseHandler implements StorageCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f5897c;

    protected boolean d() {
        return false;
    }

    public DefaultStorageHandler(String str) {
        super(str, "_storage");
    }

    @Override // com.huawei.haf.common.dfx.storage.StorageCallback
    public void checkStorageInfo(boolean z) {
        if (z || d()) {
            ThreadPoolManager.c().execute(new AsyncRunnable(true));
        }
    }

    @Override // com.huawei.haf.common.dfx.storage.StorageCallback
    public void dumpStorageInfo(boolean z) {
        if (z || !f5897c) {
            f5897c = true;
            ThreadPoolManager.c().execute(new AsyncRunnable(false));
        }
    }

    public static long c(File file, Map<String, Long> map, PrintStream printStream) throws IOException {
        if (printStream == null && map.isEmpty()) {
            return e(file, null);
        }
        return e(file, new CompoundDumpOperation(file, printStream, map));
    }

    public static long e(File file, FileVisitUtils.VisitOperation visitOperation) throws IOException {
        if (visitOperation == null) {
            return FileUtils.i(file);
        }
        visitOperation.visitRootBegin();
        long jE = FileVisitUtils.e(visitOperation);
        visitOperation.visitRootEnd(jE);
        return jE;
    }

    protected Map<String, Long> b() {
        return Collections.EMPTY_MAP;
    }

    protected Map<String, Long> a() {
        return Collections.EMPTY_MAP;
    }

    public void e(String str, long j, long j2, Map<String, Long> map, Map<String, Long> map2) {
        LogUtil.b(this.mTag, "internal_total_size=", Long.valueOf(j), ", external_total_size=", Long.valueOf(j2));
    }

    protected void c() {
        LogUtil.b(this.mTag, "preAutoCleanStorage");
    }

    protected void b(Map<String, Long> map, Map<String, Long> map2) {
        LogUtil.b(this.mTag, "postAutoCleanStorage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, boolean z2, boolean z3) {
        PrintStream printStream = null;
        if (z) {
            try {
                File saveFile = getSaveFile();
                if (saveFile != null) {
                    printStream = new PrintStream(saveFile);
                }
            } catch (IOException e) {
                LogUtil.e(this.mTag, "dumpAllStorageInfo fail, ex=", LogUtil.c(e));
                return;
            } finally {
                FileUtils.a(printStream);
            }
        }
        d(printStream, z2, z3);
    }

    private void d(PrintStream printStream, boolean z, boolean z2) throws IOException {
        long jC;
        Map<String, Long> mapB = z ? Collections.EMPTY_MAP : b();
        Map<String, Long> mapA = z ? Collections.EMPTY_MAP : a();
        if (z2) {
            c();
        }
        String strA = a(System.currentTimeMillis());
        if (printStream != null) {
            printStream.print(strA);
        }
        long jC2 = c(AppInfoUtils.b(null), mapB, printStream);
        File fileC = AppInfoUtils.c(null);
        if (fileC != null) {
            if (printStream != null) {
                printStream.println("--------------------------------");
            }
            jC = c(fileC, mapA, printStream);
        } else {
            jC = 0;
        }
        e(strA, jC2, jC, mapB, mapA);
        if (z2) {
            b(mapB, mapA);
        }
    }

    private String a(long j) {
        StringBuilder sb = new StringBuilder(512);
        sb.append("AppFirstInstallTime:");
        sb.append(DfxUtils.e(AppInfoUtils.c()));
        sb.append(", AppLastUpdateTime:");
        sb.append(DfxUtils.e(AppInfoUtils.b()));
        String string = sb.toString();
        sb.delete(0, sb.length());
        fillSaveBaseInfo(sb, null, null, j, string);
        return sb.toString();
    }

    /* JADX INFO: loaded from: classes2.dex */
    class AsyncRunnable implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f5898b;

        AsyncRunnable(boolean z) {
            this.f5898b = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultStorageHandler defaultStorageHandler = DefaultStorageHandler.this;
            boolean z = this.f5898b;
            defaultStorageHandler.c(true, !z, z);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class CompoundDumpOperation implements FileVisitUtils.VisitOperation {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final FileVisitUtils.VisitOperation f5899c;
        private final FileVisitUtils.VisitOperation d;

        CompoundDumpOperation(File file, PrintStream printStream, Map<String, Long> map) {
            this.f5899c = new FileVisitUtils.PrintVisitOperation(file, printStream);
            this.d = new FileVisitUtils.MapVisitOperation(file, map);
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public Path getRootPath() {
            return this.f5899c.getRootPath();
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootBegin() {
            this.f5899c.visitRootBegin();
            this.d.visitRootBegin();
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visit(Path path, BasicFileAttributes basicFileAttributes, boolean z, int i, long j) {
            this.f5899c.visit(path, basicFileAttributes, z, i, j);
            this.d.visit(path, basicFileAttributes, z, i, j);
        }

        @Override // com.huawei.haf.common.os.FileVisitUtils.VisitOperation
        public void visitRootEnd(long j) {
            this.f5899c.visitRootEnd(j);
            this.d.visitRootEnd(j);
        }
    }
}
