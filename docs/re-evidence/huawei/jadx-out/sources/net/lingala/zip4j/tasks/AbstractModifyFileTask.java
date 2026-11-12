package net.lingala.zip4j.tasks;

import defpackage.zoy;
import defpackage.zpy;
import defpackage.zqh;
import defpackage.zqk;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.progress.ProgressMonitor;

/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractModifyFileTask<T> extends AsyncZipTask<T> {
    public AbstractModifyFileTask(AsyncZipTask.e eVar) {
        super(eVar);
    }

    protected File getTemporaryFile(String str) {
        SecureRandom secureRandom = new SecureRandom();
        File file = new File(str + secureRandom.nextInt(10000));
        while (file.exists()) {
            file = new File(str + secureRandom.nextInt(10000));
        }
        return file;
    }

    protected void updateOffsetsForAllSubsequentFileHeaders(List<zpy> list, zqh zqhVar, zpy zpyVar, long j) throws ZipException {
        int indexOfFileHeader = getIndexOfFileHeader(list, zpyVar);
        if (indexOfFileHeader == -1) {
            throw new ZipException("Could not locate modified file header in zipModel");
        }
        while (true) {
            indexOfFileHeader++;
            if (indexOfFileHeader >= list.size()) {
                return;
            }
            zpy zpyVar2 = list.get(indexOfFileHeader);
            zpyVar2.e(zpyVar2.a() + j);
            if (zqhVar.h() && zpyVar2.getZip64ExtendedInfo() != null && zpyVar2.getZip64ExtendedInfo().e() != -1) {
                zpyVar2.getZip64ExtendedInfo().b(zpyVar2.getZip64ExtendedInfo().e() + j);
            }
        }
    }

    protected void cleanupFile(boolean z, File file, File file2) throws ZipException {
        if (z) {
            restoreFileName(file, file2);
        } else if (!file2.delete()) {
            throw new ZipException("Could not delete temporary file");
        }
    }

    public long copyFile(RandomAccessFile randomAccessFile, OutputStream outputStream, long j, long j2, ProgressMonitor progressMonitor, int i) throws IOException {
        zqk.b(randomAccessFile, outputStream, j, j + j2, progressMonitor, i);
        return j2;
    }

    protected List<zpy> cloneAndSortFileHeadersByOffset(List<zpy> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new Comparator<zpy>() { // from class: net.lingala.zip4j.tasks.AbstractModifyFileTask.2
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(zpy zpyVar, zpy zpyVar2) {
                if (zpyVar.getFileName().equals(zpyVar2.getFileName())) {
                    return 0;
                }
                return zpyVar.a() < zpyVar2.a() ? -1 : 1;
            }
        });
        return arrayList;
    }

    protected long getOffsetOfNextEntry(List<zpy> list, zpy zpyVar, zqh zqhVar) throws ZipException {
        int indexOfFileHeader = getIndexOfFileHeader(list, zpyVar);
        if (indexOfFileHeader == list.size() - 1) {
            return zoy.b(zqhVar);
        }
        return list.get(indexOfFileHeader + 1).a();
    }

    private void restoreFileName(File file, File file2) throws ZipException {
        if (file.delete()) {
            if (!file2.renameTo(file)) {
                throw new ZipException("cannot rename modified zip file");
            }
            return;
        }
        throw new ZipException("cannot delete old zip file");
    }

    private int getIndexOfFileHeader(List<zpy> list, zpy zpyVar) throws ZipException {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(zpyVar)) {
                return i;
            }
        }
        throw new ZipException("Could not find file header in list of central directory file headers");
    }
}
