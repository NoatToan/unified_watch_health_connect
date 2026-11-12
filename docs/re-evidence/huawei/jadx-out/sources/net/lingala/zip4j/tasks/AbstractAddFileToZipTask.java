package net.lingala.zip4j.tasks;

import defpackage.zoy;
import defpackage.zoz;
import defpackage.zpl;
import defpackage.zpr;
import defpackage.zpy;
import defpackage.zqc;
import defpackage.zqf;
import defpackage.zqg;
import defpackage.zqh;
import defpackage.zqk;
import defpackage.zqm;
import defpackage.zqp;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractAddFileToZipTask<T> extends AsyncZipTask<T> {
    private final zoz headerWriter;
    private final char[] password;
    private final zqh zipModel;

    public AbstractAddFileToZipTask(zqh zqhVar, char[] cArr, zoz zozVar, AsyncZipTask.e eVar) {
        super(eVar);
        this.zipModel = zqhVar;
        this.password = cArr;
        this.headerWriter = zozVar;
    }

    protected void addFilesToZip(List<File> list, ProgressMonitor progressMonitor, ZipParameters zipParameters, zqc zqcVar) throws IOException {
        zqk.c(list, zipParameters.n());
        byte[] bArr = new byte[zqcVar.e()];
        List<File> listRemoveFilesIfExists = removeFilesIfExists(list, zipParameters, progressMonitor, zqcVar);
        zpl zplVar = new zpl(this.zipModel.f(), this.zipModel.d());
        try {
            zpr zprVarInitializeOutputStream = initializeOutputStream(zplVar, zqcVar);
            try {
                for (File file : listRemoveFilesIfExists) {
                    verifyIfTaskIsCancelled();
                    ZipParameters zipParametersCloneAndAdjustZipParameters = cloneAndAdjustZipParameters(zipParameters, file, progressMonitor);
                    progressMonitor.b(file.getAbsolutePath());
                    if (zqk.e(file) && addSymlink(zipParametersCloneAndAdjustZipParameters)) {
                        addSymlinkToZip(file, zprVarInitializeOutputStream, zipParametersCloneAndAdjustZipParameters, zplVar);
                        if (ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY.equals(zipParametersCloneAndAdjustZipParameters.n())) {
                        }
                    }
                    addFileToZip(file, zprVarInitializeOutputStream, zipParametersCloneAndAdjustZipParameters, zplVar, progressMonitor, bArr);
                }
                if (zprVarInitializeOutputStream != null) {
                    zprVarInitializeOutputStream.close();
                }
                zplVar.close();
            } catch (Throwable th) {
                if (zprVarInitializeOutputStream != null) {
                    try {
                        zprVarInitializeOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                zplVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    private void addSymlinkToZip(File file, zpr zprVar, ZipParameters zipParameters, zpl zplVar) throws IOException {
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        zipParameters2.e(replaceFileNameInZip(zipParameters.m(), file.getName()));
        zipParameters2.b(false);
        zipParameters2.d(CompressionMethod.STORE);
        zprVar.e(zipParameters2);
        zprVar.write(zqk.g(file).getBytes());
        closeEntry(zprVar, zplVar, file, true);
    }

    private void addFileToZip(File file, zpr zprVar, ZipParameters zipParameters, zpl zplVar, ProgressMonitor progressMonitor, byte[] bArr) throws IOException {
        zprVar.e(zipParameters);
        if (file.exists() && !file.isDirectory()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    zprVar.write(bArr, 0, i);
                    progressMonitor.a(i);
                    verifyIfTaskIsCancelled();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            fileInputStream.close();
        }
        closeEntry(zprVar, zplVar, file, false);
    }

    private void closeEntry(zpr zprVar, zpl zplVar, File file, boolean z) throws IOException {
        zpy zpyVarA = zprVar.a();
        byte[] bArrC = zqk.c(file);
        if (!z) {
            bArrC[3] = zqg.c(bArrC[3], 5);
        }
        zpyVarA.c(bArrC);
        updateLocalFileHeader(zpyVarA, zplVar);
    }

    protected long calculateWorkForFiles(List<File> list, ZipParameters zipParameters) throws ZipException {
        long length;
        long length2 = 0;
        for (File file : list) {
            if (file.exists()) {
                if (zipParameters.k() && zipParameters.g() == EncryptionMethod.ZIP_STANDARD) {
                    length = file.length() * 2;
                } else {
                    length = file.length();
                }
                length2 += length;
                zpy zpyVarB = zoy.b(getZipModel(), zqk.a(file, zipParameters));
                if (zpyVarB != null) {
                    length2 += getZipModel().f().length() - zpyVarB.getCompressedSize();
                }
            }
        }
        return length2;
    }

    zpr initializeOutputStream(zpl zplVar, zqc zqcVar) throws IOException {
        if (this.zipModel.f().exists()) {
            zplVar.a(zoy.b(this.zipModel));
        }
        return new zpr(zplVar, this.password, zqcVar, this.zipModel);
    }

    void verifyZipParameters(ZipParameters zipParameters) throws ZipException {
        if (zipParameters == null) {
            throw new ZipException("cannot validate zip parameters");
        }
        if (zipParameters.a() != CompressionMethod.STORE && zipParameters.a() != CompressionMethod.DEFLATE) {
            throw new ZipException("unsupported compression type");
        }
        if (zipParameters.k()) {
            if (zipParameters.g() == EncryptionMethod.NONE) {
                throw new ZipException("Encryption method has to be set, when encrypt files flag is set");
            }
            char[] cArr = this.password;
            if (cArr == null || cArr.length <= 0) {
                throw new ZipException("input password is empty or null");
            }
            return;
        }
        zipParameters.a(EncryptionMethod.NONE);
    }

    void updateLocalFileHeader(zpy zpyVar, zpl zplVar) throws IOException {
        this.headerWriter.a(zpyVar, getZipModel(), zplVar);
    }

    private ZipParameters cloneAndAdjustZipParameters(ZipParameters zipParameters, File file, ProgressMonitor progressMonitor) throws IOException {
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        if (file.isDirectory()) {
            zipParameters2.e(0L);
        } else {
            zipParameters2.e(file.length());
        }
        if (zipParameters.l() <= 0) {
            zipParameters2.d(file.lastModified());
        }
        zipParameters2.d(false);
        if (!zqp.c(zipParameters.m())) {
            zipParameters2.e(zqk.a(file, zipParameters));
        }
        if (file.isDirectory()) {
            zipParameters2.d(CompressionMethod.STORE);
            zipParameters2.a(EncryptionMethod.NONE);
            zipParameters2.b(false);
            return zipParameters2;
        }
        if (zipParameters2.k() && zipParameters2.g() == EncryptionMethod.ZIP_STANDARD) {
            progressMonitor.d(ProgressMonitor.Task.CALCULATE_CRC);
            zipParameters2.b(zqm.e(file, progressMonitor));
            progressMonitor.d(ProgressMonitor.Task.ADD_ENTRY);
        }
        if (file.length() == 0) {
            zipParameters2.d(CompressionMethod.STORE);
        }
        return zipParameters2;
    }

    private List<File> removeFilesIfExists(List<File> list, ZipParameters zipParameters, ProgressMonitor progressMonitor, zqc zqcVar) throws ZipException {
        ArrayList arrayList = new ArrayList(list);
        if (this.zipModel.f().exists()) {
            for (File file : list) {
                if (!zqp.c(file.getName())) {
                    arrayList.remove(file);
                }
                zpy zpyVarB = zoy.b(this.zipModel, zqk.a(file, zipParameters));
                if (zpyVarB != null) {
                    if (zipParameters.r()) {
                        progressMonitor.d(ProgressMonitor.Task.REMOVE_ENTRY);
                        removeFile(zpyVarB, progressMonitor, zqcVar);
                        verifyIfTaskIsCancelled();
                        progressMonitor.d(ProgressMonitor.Task.ADD_ENTRY);
                    } else {
                        arrayList.remove(file);
                    }
                }
            }
        }
        return arrayList;
    }

    void removeFile(zpy zpyVar, ProgressMonitor progressMonitor, zqc zqcVar) throws ZipException {
        new zqf(this.zipModel, this.headerWriter, new AsyncZipTask.e(null, false, progressMonitor)).execute(new zqf.e(Collections.singletonList(zpyVar.getFileName()), zqcVar));
    }

    private String replaceFileNameInZip(String str, String str2) {
        if (!str.contains("/")) {
            return str2;
        }
        return str.substring(0, str.lastIndexOf("/") + 1) + str2;
    }

    private boolean addSymlink(ZipParameters zipParameters) {
        return ZipParameters.SymbolicLinkAction.INCLUDE_LINK_ONLY.equals(zipParameters.n()) || ZipParameters.SymbolicLinkAction.INCLUDE_LINK_AND_LINKED_FILE.equals(zipParameters.n());
    }

    @Override // net.lingala.zip4j.tasks.AsyncZipTask
    protected ProgressMonitor.Task getTask() {
        return ProgressMonitor.Task.ADD_ENTRY;
    }

    protected zqh getZipModel() {
        return this.zipModel;
    }
}
