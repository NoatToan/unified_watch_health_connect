package com.xmlywind.sdk.common.utils;

import com.xmlywind.logger.SigmobLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes22.dex */
public final class e {
    public static List<File> a(File file, File file2) throws com.xmlywind.a.b, IOException {
        GZIPInputStream gZIPInputStream;
        com.xmlywind.a.d dVar;
        com.xmlywind.a.c cVarA;
        com.xmlywind.a.a.b bVar;
        SigmobLog.i(String.format("Untaring %s to dir %s.", file.getAbsolutePath(), file2.getAbsolutePath()));
        LinkedList linkedList = new LinkedList();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            gZIPInputStream = new GZIPInputStream(fileInputStream);
            while (true) {
                com.xmlywind.a.a.a aVar = (com.xmlywind.a.a.a) bVar.c();
                if (aVar == null) {
                    bVar.close();
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    fileInputStream.close();
                    return linkedList;
                }
                File file3 = new File(file2, aVar.a());
                if (aVar.g()) {
                    SigmobLog.i(String.format("Attempting to write output directory %s.", file3.getAbsolutePath()));
                    if (file3.exists()) {
                        continue;
                    } else {
                        SigmobLog.i(String.format("Attempting to create output directory %s.", file3.getAbsolutePath()));
                        if (!file3.mkdirs()) {
                            throw new IllegalStateException(String.format("Couldn't create directory %s.", file3.getAbsolutePath()));
                        }
                    }
                } else {
                    SigmobLog.i(String.format("Creating output file %s.", file3.getAbsolutePath()));
                    if (!file3.getParentFile().exists()) {
                        file3.getParentFile().mkdirs();
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    com.xmlywind.a.b.a.a(bVar, fileOutputStream);
                    fileOutputStream.close();
                }
                linkedList.add(file3);
            }
        } catch (Throwable th) {
            fileInputStream.close();
            fileInputStream = new FileInputStream(file);
            SigmobLog.e(th.getMessage());
            gZIPInputStream = null;
        }
        if (gZIPInputStream != null) {
            dVar = new com.xmlywind.a.d();
            cVarA = dVar.a("tar", gZIPInputStream);
        } else {
            dVar = new com.xmlywind.a.d();
            cVarA = dVar.a("tar", fileInputStream);
        }
        bVar = (com.xmlywind.a.a.b) cVarA;
        if (!file2.exists()) {
            file2.mkdirs();
        }
    }
}
