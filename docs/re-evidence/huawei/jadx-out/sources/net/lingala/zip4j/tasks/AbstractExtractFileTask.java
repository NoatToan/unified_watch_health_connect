package net.lingala.zip4j.tasks;

import defpackage.zph;
import defpackage.zpy;
import defpackage.zpz;
import defpackage.zqa;
import defpackage.zqg;
import defpackage.zqh;
import defpackage.zqj;
import defpackage.zql;
import defpackage.zqp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.regex.Matcher;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes46.dex */
public abstract class AbstractExtractFileTask<T> extends AsyncZipTask<T> {
    private final zqa unzipParameters;
    private final zqh zipModel;

    public AbstractExtractFileTask(zqh zqhVar, zqa zqaVar, AsyncZipTask.e eVar) {
        super(eVar);
        this.zipModel = zqhVar;
        this.unzipParameters = zqaVar;
    }

    protected void extractFile(zph zphVar, zpy zpyVar, String str, String str2, ProgressMonitor progressMonitor, byte[] bArr) throws Exception {
        boolean zIsSymbolicLink = isSymbolicLink(zpyVar);
        if (!zIsSymbolicLink || this.unzipParameters.a()) {
            if (!str.endsWith(zql.f54482a)) {
                str = str + zql.f54482a;
            }
            File fileDetermineOutputFile = determineOutputFile(zpyVar, str, str2);
            progressMonitor.b(fileDetermineOutputFile.getAbsolutePath());
            assertCanonicalPathsAreSame(fileDetermineOutputFile, str, zpyVar);
            verifyNextEntry(zphVar, zpyVar);
            if (zpyVar.isDirectory()) {
                if (!fileDetermineOutputFile.exists() && !fileDetermineOutputFile.mkdirs()) {
                    throw new ZipException("Could not create directory: " + fileDetermineOutputFile);
                }
            } else if (zIsSymbolicLink) {
                createSymLink(zphVar, zpyVar, fileDetermineOutputFile, progressMonitor);
            } else {
                checkOutputDirectoryStructure(fileDetermineOutputFile);
                unzipFile(zphVar, fileDetermineOutputFile, progressMonitor, bArr);
            }
            if (zIsSymbolicLink) {
                return;
            }
            zqj.d(zpyVar, fileDetermineOutputFile);
        }
    }

    private void assertCanonicalPathsAreSame(File file, String str, zpy zpyVar) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (file.isDirectory() && !canonicalPath.endsWith(zql.f54482a)) {
            canonicalPath = canonicalPath + zql.f54482a;
        }
        String canonicalPath2 = new File(str).getCanonicalPath();
        if (!canonicalPath2.endsWith(zql.f54482a)) {
            canonicalPath2 = canonicalPath2 + zql.f54482a;
        }
        if (canonicalPath.startsWith(canonicalPath2)) {
            return;
        }
        throw new ZipException("illegal file name that breaks out of the target directory: " + zpyVar.getFileName());
    }

    private boolean isSymbolicLink(zpy zpyVar) {
        byte[] bArrD = zpyVar.d();
        if (bArrD == null || bArrD.length < 4) {
            return false;
        }
        return zqg.a(bArrD[3], 5);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002d  */
    private void unzipFile(zph zphVar, File file, ProgressMonitor progressMonitor, byte[] bArr) throws Exception {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int i = zphVar.read(bArr);
                    if (i != -1) {
                        fileOutputStream.write(bArr, 0, i);
                        progressMonitor.a(i);
                        verifyIfTaskIsCancelled();
                    } else {
                        fileOutputStream.close();
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
        } catch (Exception e) {
            if (file.exists()) {
                file.delete();
            }
            throw e;
        }
    }

    private void createSymLink(zph zphVar, zpy zpyVar, File file, ProgressMonitor progressMonitor) throws IOException {
        String str = new String(readCompleteEntry(zphVar, zpyVar, progressMonitor));
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            throw new ZipException("Could not create parent directories");
        }
        try {
            Path path = Paths.get(str, new String[0]);
            if (file.exists() && !file.delete()) {
                throw new ZipException("Could not delete existing symlink " + file);
            }
            Files.createSymbolicLink(file.toPath(), path, new FileAttribute[0]);
        } catch (NoSuchMethodError unused) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(str.getBytes());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private byte[] readCompleteEntry(zph zphVar, zpy zpyVar, ProgressMonitor progressMonitor) throws IOException {
        int uncompressedSize = (int) zpyVar.getUncompressedSize();
        byte[] bArr = new byte[uncompressedSize];
        if (zphVar.read(bArr) != uncompressedSize) {
            throw new ZipException("Could not read complete entry");
        }
        progressMonitor.a(uncompressedSize);
        return bArr;
    }

    private void verifyNextEntry(zph zphVar, zpy zpyVar) throws IOException {
        if (zqg.a(zpyVar.getGeneralPurposeFlag()[0], 6)) {
            throw new ZipException("Entry with name " + zpyVar.getFileName() + " is encrypted with Strong Encryption. Zip4j does not support Strong Encryption, as this is patented.");
        }
        zpz zpzVarC = zphVar.c(zpyVar, false);
        if (zpzVarC == null) {
            throw new ZipException("Could not read corresponding local file header for file header: " + zpyVar.getFileName());
        }
        if (!zpyVar.getFileName().equals(zpzVarC.getFileName())) {
            throw new ZipException("File header and local file header mismatch");
        }
    }

    private void checkOutputDirectoryStructure(File file) throws ZipException {
        if (file.getParentFile().exists() || file.getParentFile().mkdirs()) {
            return;
        }
        throw new ZipException("Unable to create parent directories: " + file.getParentFile());
    }

    private File determineOutputFile(zpy zpyVar, String str, String str2) {
        String fileName = zpyVar.getFileName();
        if (!zqp.c(str2)) {
            str2 = fileName;
        }
        return new File(str, getFileNameWithSystemFileSeparators(str2));
    }

    private String getFileNameWithSystemFileSeparators(String str) {
        return str.replaceAll(":\\\\", "_").replaceAll("[/\\\\]", Matcher.quoteReplacement(zql.f54482a));
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.EXTRACT_ENTRY;
    }

    public zqh getZipModel() {
        return this.zipModel;
    }
}
