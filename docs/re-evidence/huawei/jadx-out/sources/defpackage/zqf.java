package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.enums.RandomAccessFileMode;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AbstractModifyFileTask;
import net.lingala.zip4j.tasks.AbstractZipTaskParameters;
import net.lingala.zip4j.tasks.AsyncZipTask;

/* JADX INFO: loaded from: classes20.dex */
public class zqf extends AbstractModifyFileTask<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zqh f54472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zoz f54473b;

    public zqf(zqh zqhVar, zoz zozVar, AsyncZipTask.e eVar) {
        super(eVar);
        this.f54472a = zqhVar;
        this.f54473b = zozVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void executeTask(e eVar, ProgressMonitor progressMonitor) throws IOException {
        if (this.f54472a.i()) {
            throw new ZipException("This is a split archive. Zip file format does not allow updating split/spanned files");
        }
        List<String> listB = b(eVar.d);
        if (listB.isEmpty()) {
            return;
        }
        File temporaryFile = getTemporaryFile(this.f54472a.f().getPath());
        try {
            zpl zplVar = new zpl(temporaryFile);
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f54472a.f(), RandomAccessFileMode.READ.getValue());
                try {
                    List<zpy> listCloneAndSortFileHeadersByOffset = cloneAndSortFileHeadersByOffset(this.f54472a.c().b());
                    long jCopyFile = 0;
                    for (zpy zpyVar : listCloneAndSortFileHeadersByOffset) {
                        long offsetOfNextEntry = getOffsetOfNextEntry(listCloneAndSortFileHeadersByOffset, zpyVar, this.f54472a) - zplVar.getFilePointer();
                        if (d(zpyVar, listB)) {
                            b(listCloneAndSortFileHeadersByOffset, zpyVar, offsetOfNextEntry);
                            if (!this.f54472a.c().b().remove(zpyVar)) {
                                throw new ZipException("Could not remove entry from list of central directory headers");
                            }
                            jCopyFile += offsetOfNextEntry;
                        } else {
                            jCopyFile += super.copyFile(randomAccessFile, zplVar, jCopyFile, offsetOfNextEntry, progressMonitor, eVar.zip4jConfig.e());
                        }
                        verifyIfTaskIsCancelled();
                        listCloneAndSortFileHeadersByOffset = listCloneAndSortFileHeadersByOffset;
                    }
                    this.f54473b.b(this.f54472a, zplVar, eVar.zip4jConfig.c());
                    randomAccessFile.close();
                    zplVar.close();
                    cleanupFile(true, this.f54472a.f(), temporaryFile);
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                try {
                    zplVar.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (Throwable th5) {
            cleanupFile(false, this.f54472a.f(), temporaryFile);
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public long calculateTotalWork(e eVar) {
        return this.f54472a.f().length();
    }

    private List<String> b(List<String> list) throws ZipException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (zoy.b(this.f54472a, str) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private boolean d(zpy zpyVar, List<String> list) {
        for (String str : list) {
            if ((str.endsWith("/") && zpyVar.getFileName().startsWith(str)) || zpyVar.getFileName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private void b(List<zpy> list, zpy zpyVar, long j) throws ZipException {
        updateOffsetsForAllSubsequentFileHeaders(list, this.f54472a, zpyVar, b(j));
        zpv zpvVarE = this.f54472a.e();
        zpvVarE.b(zpvVarE.e() - j);
        zpvVarE.d(zpvVarE.j() - 1);
        if (zpvVarE.i() > 0) {
            zpvVarE.b(zpvVarE.i() - 1);
        }
        if (this.f54472a.h()) {
            this.f54472a.g().e(this.f54472a.g().d() - j);
            this.f54472a.g().c(this.f54472a.g().i() - 1);
            this.f54472a.a().e(this.f54472a.a().c() - j);
        }
    }

    private long b(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("long overflow");
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    public ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.REMOVE_ENTRY;
    }

    public static class e extends AbstractZipTaskParameters {
        private final List<String> d;

        public e(List<String> list, zqc zqcVar) {
            super(zqcVar);
            this.d = list;
        }
    }
}
