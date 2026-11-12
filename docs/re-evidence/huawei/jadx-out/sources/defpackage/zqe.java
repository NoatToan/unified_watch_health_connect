package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.progress.ProgressMonitor;
import net.lingala.zip4j.tasks.AbstractAddFileToZipTask;
import net.lingala.zip4j.tasks.AbstractZipTaskParameters;
import net.lingala.zip4j.tasks.AsyncZipTask;

/* JADX INFO: loaded from: classes20.dex */
public class zqe extends AbstractAddFileToZipTask<c> {
    public zqe(zqh zqhVar, char[] cArr, zoz zozVar, AsyncZipTask.e eVar) {
        super(zqhVar, cArr, zozVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void executeTask(c cVar, ProgressMonitor progressMonitor) throws IOException {
        List<File> listA = a(cVar);
        d(cVar);
        addFilesToZip(listA, progressMonitor, cVar.d, cVar.zip4jConfig);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public long calculateTotalWork(c cVar) throws ZipException {
        List<File> listA = a(cVar);
        if (cVar.d.s()) {
            listA.add(cVar.f54471c);
        }
        return calculateWorkForFiles(listA, cVar.d);
    }

    private void d(c cVar) throws IOException {
        String canonicalPath;
        File file = cVar.f54471c;
        if (!cVar.d.s() || file.getCanonicalFile().getParentFile() == null) {
            canonicalPath = file.getCanonicalPath();
        } else {
            canonicalPath = file.getCanonicalFile().getParentFile().getCanonicalPath();
        }
        cVar.d.b(canonicalPath);
    }

    private List<File> a(c cVar) throws ZipException {
        List<File> listC = zqk.c(cVar.f54471c, cVar.d);
        if (cVar.d.s()) {
            listC.add(cVar.f54471c);
        }
        return listC;
    }

    public static class c extends AbstractZipTaskParameters {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f54471c;
        private final ZipParameters d;

        public c(File file, ZipParameters zipParameters, zqc zqcVar) {
            super(zqcVar);
            this.f54471c = file;
            this.d = zipParameters;
        }
    }
}
